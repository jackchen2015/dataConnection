package com.hxct.po;

/**
 * 终端上下线日志
 * @author 0310002487
 *
 */
public class Sjrz {
	private int id;
	private String serviceCode;//场所编码
	private String userName;//上网人员姓名
	private String cerType;//证件类型
	private String cerCode;//证件号码
	private long onlineTime;//上线时间
	private long offlineTime;//下线时间
	private String netEndingName;//上网终端名称
	private long netEndingIp;//上网终端内网IP地址
	private String netEndingMac;//上网终端MAC
	private String orgName;//单位名
	private String country;//国籍
	private String note;//其他信息，如宾馆版本保存房间号
	private String sessionId;//事件编码，参见附录P
	private String mobilePhone;//手机号码
	private long srcv4ip;//源外网IPv4地址
	private String srcv6ip;//源外网IPv6地址
	private int srcv4startPort;//源外网IPv4起始端口
	private int srcv4endPort;//源外网IPv4结束端口
	private int srcv6startPort;//源外网IPv6起始端口
	private int srcv6endPort;//源外网IPv6结束端口
	private String apNum;//审计设备编号
	private String apMac;//审计设备MAC
	private String apXpoint;//审计设备经度
	private String apYpoint;//审计设备纬度
	private String power;//场强
	private String xPoint;//X坐标
	private String yPoint;//Y坐标
	private String authType;//认证类型
	private String companyId="0";//厂商编码
	private String appCompanyName;//APP厂商名称
	private String appSoftwareName;//APP应用软件名称
	private String appVersion;//APP版本号
	private String appid;//APP终端认证码
	private String imsi;//终端IMSI码(APP认证适用。分类与编码方法：IMSI=MCC+MNC+IMSIN)
	private String imeiEsnMeid;//终端IMEI码(APP认证适用。国际移动设备身份码，由15位数字组成，主要用于表示GSM制式的手机)
	private String osName;//终端系统(APP认证适用。填写终端系统，如IOS8.1，ANDROID 5.0等)
	private String brand;//终端品牌(APP认证适用。填写终端品牌，如LENOVO，小米，华为等)
	private String model;//终端型号(APP认证适用。填写终端型号，如IPHONE 6, SAMSUNG S4, HUAWEI MATE7等)
	

}
