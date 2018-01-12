package com.hxct.po;

/**
 * 采集设备移动轨迹
 * @author 0310002487
 *
 */
public class Sbgj {
	private int id;
	private String deviceNum;//设备编号
	private String deviceMac;//设备MAC
	private String xpoint;//设备经度
	private String ypoint;//设备纬度
	private String rate;//速度（单位：千米/小时）
	private String hight;//高度（单位：米）
	private long activeTime;//时间，北京时间1970年1月1日08:00:00开始到结束时间的绝对秒数
	private String serviceCode;//场所编码

}
