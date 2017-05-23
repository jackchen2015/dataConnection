package com.hxct.po;

public class OnLineData {

	private int id;
	private String userId;
	private String userMac;
	private String nasip;
	private String loginTime;
	private String logoutTime;
	private int onlineSec;
	private String createTime;
	private int authenMethod;
	private String userName;
	private String ssid;
	private String apMac;
	private String osType = "99";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserMac() {
		return userMac;
	}
	public void setUserMac(String userMac) {
		this.userMac = userMac;
	}
	public String getNasip() {
		return nasip;
	}
	public void setNasip(String nasip) {
		this.nasip = nasip;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public String getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(String logoutTime) {
		this.logoutTime = logoutTime;
	}
	public int getOnlineSec() {
		return onlineSec;
	}
	public void setOnlineSec(int onlineSec) {
		this.onlineSec = onlineSec;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getAuthenMethod() {
		return authenMethod;
	}
	public void setAuthenMethod(int authenMethod) {
		this.authenMethod = authenMethod;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public String getApMac() {
		return apMac;
	}
	public void setApMac(String apMac) {
		this.apMac = apMac;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	@Override
	public String toString() {
		return "OnLineData [id=" + id + ", userId=" + userId + ", userMac=" + userMac + ", nasip=" + nasip
				+ ", loginTime=" + loginTime + ", logoutTime=" + logoutTime + ", onlineSec=" + onlineSec
				+ ", createTime=" + createTime + ", authenMethod=" + authenMethod + ", userName=" + userName + ", ssid="
				+ ssid + ", apMac=" + apMac + "]";
	}
}
