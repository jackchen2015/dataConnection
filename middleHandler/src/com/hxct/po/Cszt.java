package com.hxct.po;

/**
 * 场所状态
 * @author 0310002487
 *
 */
public class Cszt {
	private int id;
	private String serviceCode;//场所编码
	private short serviceOnlineStatus;//服务在线状态	1.在线 2.离线
	private short dataOnlineStatus;//数据在线状态	1.在线 2. 离线
	private short equipmentRunningStatus;//设备运行状态	1.	工作状态	2.	维护状态  	3.	异常状态
	private long activePc;//活动机器数
	private long reportPc;//报装机器数
	private long onlinePerson;//在线人数
	private long virtualNum;//在线虚拟身份数
	private String exitIp;//出口IP 多个用逗号隔开
	private long updateTime;//最后联系时间 YYYY-MM-DD HH:MM:SS





}
