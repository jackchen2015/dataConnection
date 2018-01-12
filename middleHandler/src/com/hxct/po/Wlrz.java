package com.hxct.po;

/**
 * 特征采集日志，电子围栏设备需要字段结构
 * @author 0310002487
 *
 */
public class Wlrz {
	private int id;
	private String mac;
	private int type;
	private long startTime;
	private long endTime;
	private String power;//信号强度
	private String bssid;//连接方mac
	private String essid;//当前AP ssid
	private String hisEssid;//历史连接ssid
	private String model;//手机型号
	private String osversion;//系统版本
	private String imei;//imei
	private String imsi;//imsi
	private String station;//基站
	private String xpoint;//数据捕获经度
	private String ypoint;//数据捕获纬度
	private String phone;//手机号
	private String devmac;//采集设备MAC地址
	private String devicenum;//采集设备编码
	private String servicecode;//场所编码
	private String protocolType;//协议类型
	private String account;//账号
	private String flag;//(目前不需要)
	private String url;
	private String companyId;//厂商组织机构代码
	private String apChannel;//接入热点频道
	private String apEncrytype;//接入热点加密类型
	private String consultXpoint;//WIFI终端相对采集设备的X坐标(正东方向)，单位：米（m）
	private String consultYpoint;//WIFI终端相对采集设备的y坐标(正东方向)，单位：米（m）
	
	

}
