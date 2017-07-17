package com.hxct;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import com.hxct.po.OnLineData;
import com.hxct.po.UserData;
import com.hxct.protocol.IHandler;
import com.hxct.protocol.UdpHandler;
import com.hxct.util.Constants;
import com.hxct.util.DataConvert;
import com.hxct.util.MyBatisUtil;
import com.hxct.util.MyBatisUtil.DataSourceEnvironment;

public class CustomTask extends TimerTask{
	
	private List<OnLineData> allData = new ArrayList<OnLineData>();
	private static Logger logger = Logger.getLogger(CustomTask.class.getName());
	@Override
	public void run() {
    	SqlSession mssqlSession = MyBatisUtil.getSqlSessionFactory(DataSourceEnvironment.MSSQL).openSession();
        final SqlSession mysqlSession = MyBatisUtil.getSqlSessionFactory(DataSourceEnvironment.MYSQL).openSession();
//        OnlineDataMapperI mssqlmapper = mssqlSession.getMapper(OnlineDataMapperI.class);
//        OnlineDataMapperI mysqlmapper = mysqlSession.getMapper(OnlineDataMapperI.class);
//        List<OnLineData> alldata = mssqlmapper.getCurrDayData();
        Date date=new Date(new Date().getTime() - 24*60*60*1000);
        String strDate = Constants.df.format(date);// new Date()为获取当前系统时间
        allData.clear();
        if(System.getProperty("getMssqlData").equals("1"))
        {
        	allData = mssqlSession.selectList("com.hxct.mapping.onLineDataMapper.getCurrDayData", strDate);
        }
        else
        {
        	for(int i=0;i<100;i++)
        	{
        		OnLineData old = new OnLineData();
        		old.setApMac("AB-02-CD-33-23-C0");
        		old.setAuthenMethod(1020004);
        		old.setCreateTime("2017-02-11 01:22:22");
        		old.setLoginTime("2017-02-12 01:22:22");
        		old.setLogoutTime("2017-03-11 01:22:22");
        		old.setNasip("asdf");
        		old.setOnlineSec(10+i);
        		old.setSsid("iwuhan-free");
        		old.setUserId("13554502434");
        		old.setUserMac("205D47A1F3C3");
        		old.setOsType("android");
        		old.setUserIp("172.16.1.22");
        		
        		old.setUserName("time");
        		allData.add(old);        		
        	}
        }
        
        logger.info("all data is:"+allData.size());
    	//send datas
//        final List<OnLineData> alldata = new ArrayList<OnLineData>();
//        final long beginTime = System.currentTimeMillis();

    	//save datas
    	final List<UserData> uDatas = new ArrayList<UserData>();
    	for(OnLineData data:allData)
    	{
    		UserData uData = new UserData();
    		uData.setApmac(DataConvert.convertMacWithSplit(data.getApMac()));
    		uData.setSsid(data.getSsid());
    		uData.setAuth_type(data.getAuthenMethod());
    		String loginTime = data.getLoginTime();
    		if(loginTime.length()>19)
    		{
    			loginTime = loginTime.substring(0, 19);
    		}
    		uData.setLogin_at(loginTime);
    		uData.setAuth_account(data.getUserId());
    		uData.setId_code(data.getUserId());
    		uData.setLan_ip(data.getUserIp());
    		uData.setMac(DataConvert.convertMacWithSplit(data.getUserMac()));
    		uData.setId_name(data.getUserName());
    		String osType = data.getOsType();
    		uData.setTerminal_system(DataConvert.getOsType(osType));
    		uDatas.add(uData);
    	}
    	logger.info("total record is:"+uDatas.size());
    	if(!System.getProperty("senddata").equals("1"))
    	{
    		for(int i=0;i<10;i++)
    		{
    			logger.info("data "+i+" is:"+uDatas.get(i));
    		}
    	}
    	else{
        	//发送数据线程
        	new Thread(new Runnable(){

    			@Override
    			public void run() {
    				// TODO Auto-generated method stub
    				long threadBeginTime = System.currentTimeMillis();
    		    	IHandler handler = new UdpHandler();
    		    	handler.sendData(uDatas);
    		    	logger.info("send data thread end it cast time:"+(System.currentTimeMillis()-threadBeginTime));
    		    	uDatas.clear();
    			}}).start();    		
    	}
    	//保存数据线程
    	if(!System.getProperty("savedb").equals("1"))
    	{
    		return;
    	}
    	new Thread(new Runnable(){

			@Override
			public void run() {
		    	long middleTime = System.currentTimeMillis();
		    	//分批插入数据库，每次10000条
		    	int count = (allData.size()-1)/10000;
		    	for(int i=0;i<count+1;i++)
		    	{
		    		int offset = 10000;
		    		if(i==count)
		    		{
		    			offset = allData.size() % 10000;
		    		}
		    		mysqlSession.insert("com.hxct.mapping.onLineDataMapper.insertBatch", allData.subList(i*10000, i*10000+offset-1));
		    	}
		    	logger.info("Insert data, It cast time:"+(System.currentTimeMillis()-middleTime));
		    	allData.clear();
				
			}}).start();
	}
}
