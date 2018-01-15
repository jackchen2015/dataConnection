package com.hxct.po;

/**
 * 终端上下线日志
 * @author 0310002487
 *
 */
public class Sjrz {
	private int id;
	private String serviceCode;//场所编码  允许为空:N
	private String userName;//上网人员姓名
	private String cerType;//证件类型 
	private String cerCode;//证件号码
	private long onlineTime;//上线时间  允许为空:N
	private long offlineTime;//下线时间
	private String netEndingName;//上网终端名称  允许为空:N
	private long netEndingIp;//上网终端内网IP地址  允许为空:N
	private String netEndingMac;//上网终端MAC  允许为空:N
	private String orgName;//单位名
	private String country;//国籍
	private String note;//其他信息，如宾馆版本保存房间号
	private String sessionId;//事件编码，参见附录P 允许为空:N
	private String mobilePhone;//手机号码
	private long srcv4ip;//源外网IPv4地址
	private String srcv6ip;//源外网IPv6地址
	private int srcv4startPort;//源外网IPv4起始端口
	private int srcv4endPort;//源外网IPv4结束端口
	private int srcv6startPort;//源外网IPv6起始端口
	private int srcv6endPort;//源外网IPv6结束端口
	private String apNum;//审计设备编号  允许为空:N
	private String apMac;//审计设备MAC  允许为空:N
	private String apXpoint;//审计设备经度
	private String apYpoint;//审计设备纬度
	private String power;//场强
	private String xPoint;//X坐标
	private String yPoint;//Y坐标
	private String authType;//认证类型
	private String companyId="0";//厂商编码  允许为空:N
	private String appCompanyName;//APP厂商名称
	private String appSoftwareName;//APP应用软件名称
	private String appVersion;//APP版本号
	private String appid;//APP终端认证码
	private String imsi;//终端IMSI码(APP认证适用。分类与编码方法：IMSI=MCC+MNC+IMSIN)
	private String imeiEsnMeid;//终端IMEI码(APP认证适用。国际移动设备身份码，由15位数字组成，主要用于表示GSM制式的手机)
	private String osName;//终端系统(APP认证适用。填写终端系统，如IOS8.1，ANDROID 5.0等)
	private String brand;//终端品牌(APP认证适用。填写终端品牌，如LENOVO，小米，华为等)
	private String model;//终端型号(APP认证适用。填写终端型号，如IPHONE 6, SAMSUNG S4, HUAWEI MATE7等)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCerType() {
		return cerType;
	}
	public void setCerType(String cerType) {
		this.cerType = cerType;
	}
	public String getCerCode() {
		return cerCode;
	}
	public void setCerCode(String cerCode) {
		this.cerCode = cerCode;
	}
	public long getOnlineTime() {
		return onlineTime;
	}
	public void setOnlineTime(long onlineTime) {
		this.onlineTime = onlineTime;
	}
	public long getOfflineTime() {
		return offlineTime;
	}
	public void setOfflineTime(long offlineTime) {
		this.offlineTime = offlineTime;
	}
	public String getNetEndingName() {
		return netEndingName;
	}
	public void setNetEndingName(String netEndingName) {
		this.netEndingName = netEndingName;
	}
	public long getNetEndingIp() {
		return netEndingIp;
	}
	public void setNetEndingIp(long netEndingIp) {
		this.netEndingIp = netEndingIp;
	}
	public String getNetEndingMac() {
		return netEndingMac;
	}
	public void setNetEndingMac(String netEndingMac) {
		this.netEndingMac = netEndingMac;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public long getSrcv4ip() {
		return srcv4ip;
	}
	public void setSrcv4ip(long srcv4ip) {
		this.srcv4ip = srcv4ip;
	}
	public String getSrcv6ip() {
		return srcv6ip;
	}
	public void setSrcv6ip(String srcv6ip) {
		this.srcv6ip = srcv6ip;
	}
	public int getSrcv4startPort() {
		return srcv4startPort;
	}
	public void setSrcv4startPort(int srcv4startPort) {
		this.srcv4startPort = srcv4startPort;
	}
	public int getSrcv4endPort() {
		return srcv4endPort;
	}
	public void setSrcv4endPort(int srcv4endPort) {
		this.srcv4endPort = srcv4endPort;
	}
	public int getSrcv6startPort() {
		return srcv6startPort;
	}
	public void setSrcv6startPort(int srcv6startPort) {
		this.srcv6startPort = srcv6startPort;
	}
	public int getSrcv6endPort() {
		return srcv6endPort;
	}
	public void setSrcv6endPort(int srcv6endPort) {
		this.srcv6endPort = srcv6endPort;
	}
	public String getApNum() {
		return apNum;
	}
	public void setApNum(String apNum) {
		this.apNum = apNum;
	}
	public String getApMac() {
		return apMac;
	}
	public void setApMac(String apMac) {
		this.apMac = apMac;
	}
	public String getApXpoint() {
		return apXpoint;
	}
	public void setApXpoint(String apXpoint) {
		this.apXpoint = apXpoint;
	}
	public String getApYpoint() {
		return apYpoint;
	}
	public void setApYpoint(String apYpoint) {
		this.apYpoint = apYpoint;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getxPoint() {
		return xPoint;
	}
	public void setxPoint(String xPoint) {
		this.xPoint = xPoint;
	}
	public String getyPoint() {
		return yPoint;
	}
	public void setyPoint(String yPoint) {
		this.yPoint = yPoint;
	}
	public String getAuthType() {
		return authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getAppCompanyName() {
		return appCompanyName;
	}
	public void setAppCompanyName(String appCompanyName) {
		this.appCompanyName = appCompanyName;
	}
	public String getAppSoftwareName() {
		return appSoftwareName;
	}
	public void setAppSoftwareName(String appSoftwareName) {
		this.appSoftwareName = appSoftwareName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getImeiEsnMeid() {
		return imeiEsnMeid;
	}
	public void setImeiEsnMeid(String imeiEsnMeid) {
		this.imeiEsnMeid = imeiEsnMeid;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	

}
