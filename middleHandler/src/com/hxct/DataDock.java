/*
 * Copyright 2015 Hongxin Telecommunication Technologies Co, Ltd.,
 * Wuhan, Hubei, China. All rights reserved.
 */

package com.hxct;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.log4j.Logger;

import com.hxct.util.TimeArrangeMent;

/**
 *
 * @author chenwei
 * Created on 2017-5-3, 10:57:11
 */
public class DataDock
{
	private static Logger logger = Logger.getLogger(DataDock.class.getName());

    /**
     * @param args the command line arguments
     */
//    private static final int TIMEOUT = 5000;  //设置接收数据的超时时间  
//    private static final int MAXNUM = 5;      //设置重发数据的最多次数 
//	private static String password = "c#6zw(qi";
//	private static String iv = "salt#&@!";
    public static void main(String args[]){
    	InputStream in = null;
    	try {
			in = Resources.getResourceAsStream("resource.properties");
			System.getProperties().load(in);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	logger.info("system startup......");

    	TimeArrangeMent tam = new TimeArrangeMent();
    	tam.arrange();
    	}	
}
