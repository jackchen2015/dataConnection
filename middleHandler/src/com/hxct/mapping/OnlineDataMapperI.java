package com.hxct.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hxct.po.OnLineData;

/**
 * @author cw
 * 定义sql映射的接口，使用注解指明方法要执行的SQL
 */
public interface OnlineDataMapperI extends Mapper{

    //使用@Insert注解指明add方法要执行的SQL
    @Insert("insert into onlinedata(userId, userMac) values(#{userId}, #{userMac})")
    public int add(OnLineData data);
    
    //使用@Delete注解指明deleteById方法要执行的SQL
    @Delete("delete from onlinedata where id=#{id}")
    public int deleteById(int id);
    
    //使用@Update注解指明update方法要执行的SQL
    @Update("update onlinedata set userId=#{userId},userMac=#{userMac} where id=#{id}")
    public int update(OnLineData data);
    
    //使用@Select注解指明getById方法要执行的SQL
    @Select("select * from onlinedata where id=#{id}")
    public OnLineData getById(int id);
    
    //使用@Select注解指明getAll方法要执行的SQL
    @Select("select userId,userMac,nasIp,loginTime,logoutTime,onlineSec,createTime,authenMethod,userName,wirelessSSID,wirelessApMac from T_ONLINE_DETAIL where loginTime>#{loginTime}")
    public List<OnLineData> getCurrDayData();
//    
//    @InsertBatch("")
//    public int batchInsert();
}