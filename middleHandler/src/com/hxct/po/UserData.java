/*
 * Copyright 2015 Hongxin Telecommunication Technologies Co, Ltd.,
 * Wuhan, Hubei, China. All rights reserved.
 */

package com.hxct.po;

import com.hxct.util.Constants;

/**
 *
 * @author chenwei
 * Created on 2017-5-2, 16:35:59
 */
public class UserData
{

	private String version="4.3.1.1";//版本号
	private int event_type = 40;//数据类型
	private String doc_version="4.3.1";//数据交换标准版本号
	private int auth_type = 1020004;//认证类型 手机
	private String auth_account="";//手机号码
	private int id_type = 19;//手机
	private String id_code="";//手机号码
	private String id_name="";
	private String app_company="";
	private String app_name="";
	private String app_version="";
	private String app_authcode="";
	private String location_code="4201052A000289";//附录7.上网服务场所编码命名规则
	private String location_type="9";
	private String login_at="";
	private String mac="";
	private String lan_ip="";
	private String source_ip4="";
	private String source_ip6="";
	private int source_startport4;
	private int source_endport4;	
	private int source_startport6;
	private int source_endport6;
	private String apid="";
	private String apmac="";
	private String longitude="";
	private String latitude="";
	private String rssi="";
	private String sessionid="";
	private String x="";
	private String y="";
	private String imsi="";
	private String device_id="";
	private String terminal_system="";
	private String terminal_brand="";
	private String terminal_brandtype="";
	private int source = 95;
	private int isp_id = 1;
	private String wan_ip="";
	private int source_port;
	private String ssid="";
	private String associated="";
	private String floor="";
	private int login_type = 30;
	private int plastersign;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getEvent_type() {
		return event_type;
	}
	public void setEvent_type(int event_type) {
		this.event_type = event_type;
	}
	public String getDoc_version() {
		return doc_version;
	}
	public void setDoc_version(String doc_version) {
		this.doc_version = doc_version;
	}
	public int getAuth_type() {
		return auth_type;
	}
	public void setAuth_type(int auth_type) {
		this.auth_type = auth_type;
	}
	public String getAuth_account() {
		return auth_account;
	}
	public void setAuth_account(String auth_account) {
		this.auth_account = auth_account;
	}
	public int getId_type() {
		return id_type;
	}
	public void setId_type(int id_type) {
		this.id_type = id_type;
	}
	public String getId_code() {
		return id_code;
	}
	public void setId_code(String id_code) {
		this.id_code = id_code;
	}
	public String getId_name() {
		return id_name;
	}
	public void setId_name(String id_name) {
		this.id_name = id_name;
	}
	public String getApp_company() {
		return app_company;
	}
	public void setApp_company(String app_company) {
		this.app_company = app_company;
	}
	public String getApp_name() {
		return app_name;
	}
	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}
	public String getApp_version() {
		return app_version;
	}
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	public String getApp_authcode() {
		return app_authcode;
	}
	public void setApp_authcode(String app_authcode) {
		this.app_authcode = app_authcode;
	}
	public String getLocation_code() {
		return location_code;
	}
	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}
	public String getLocation_type() {
		return location_type;
	}
	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}
	public String getLogin_at() {
		return login_at;
	}
	public void setLogin_at(String login_at) {
		this.login_at = login_at;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getLan_ip() {
		return lan_ip;
	}
	public void setLan_ip(String lan_ip) {
		this.lan_ip = lan_ip;
	}
	public String getSource_ip4() {
		return source_ip4;
	}
	public void setSource_ip4(String source_ip4) {
		this.source_ip4 = source_ip4;
	}
	public String getSource_ip6() {
		return source_ip6;
	}
	public void setSource_ip6(String source_ip6) {
		this.source_ip6 = source_ip6;
	}
	public int getSource_startport4() {
		return source_startport4;
	}
	public void setSource_startport4(int source_startport4) {
		this.source_startport4 = source_startport4;
	}
	public int getSource_endport4() {
		return source_endport4;
	}
	public void setSource_endport4(int source_endport4) {
		this.source_endport4 = source_endport4;
	}
	public int getSource_startport6() {
		return source_startport6;
	}
	public void setSource_startport6(int source_startport6) {
		this.source_startport6 = source_startport6;
	}
	public int getSource_endport6() {
		return source_endport6;
	}
	public void setSource_endport6(int source_endport6) {
		this.source_endport6 = source_endport6;
	}
	public String getApid() {
		return apid;
	}
	public void setApid(String apid) {
		this.apid = apid;
	}
	public String getApmac() {
		return apmac;
	}
	public void setApmac(String apmac) {
		this.apmac = apmac;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getRssi() {
		return rssi;
	}
	public void setRssi(String rssi) {
		this.rssi = rssi;
	}
	public String getSessionid() {
		return sessionid;
	}
	public void setSessionid(String sessionid) {
		this.sessionid = sessionid;
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public String getTerminal_system() {
		return terminal_system;
	}
	public void setTerminal_system(String terminal_system) {
		this.terminal_system = terminal_system;
	}
	public String getTerminal_brand() {
		return terminal_brand;
	}
	public void setTerminal_brand(String terminal_brand) {
		this.terminal_brand = terminal_brand;
	}
	public String getTerminal_brandtype() {
		return terminal_brandtype;
	}
	public void setTerminal_brandtype(String terminal_brandtype) {
		this.terminal_brandtype = terminal_brandtype;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getIsp_id() {
		return isp_id;
	}
	public void setIsp_id(int isp_id) {
		this.isp_id = isp_id;
	}
	public String getWan_ip() {
		return wan_ip;
	}
	public void setWan_ip(String wan_ip) {
		this.wan_ip = wan_ip;
	}
	public int getSource_port() {
		return source_port;
	}
	public void setSource_port(int source_port) {
		this.source_port = source_port;
	}
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public String getAssociated() {
		return associated;
	}
	public void setAssociated(String associated) {
		this.associated = associated;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public int getLogin_type() {
		return login_type;
	}
	public void setLogin_type(int login_type) {
		this.login_type = login_type;
	}
	public int getPlastersign() {
		return plastersign;
	}
	public void setPlastersign(int plastersign) {
		this.plastersign = plastersign;
	}
	@Override
	public String toString() {
		return version +Constants.splitChar + event_type + Constants.splitChar + doc_version
				+ Constants.splitChar + auth_type + Constants.splitChar + auth_account + Constants.splitChar + id_type + Constants.splitChar
				+ id_code + Constants.splitChar + id_name + Constants.splitChar + app_company + Constants.splitChar + app_name
				+ Constants.splitChar + app_version + Constants.splitChar + app_authcode + Constants.splitChar + location_code
				+ Constants.splitChar + location_type + Constants.splitChar + login_at + Constants.splitChar + mac + Constants.splitChar + lan_ip
				+ Constants.splitChar + source_ip4 + Constants.splitChar + source_ip6 + Constants.splitChar
				+ source_startport4 + Constants.splitChar + source_endport4 + Constants.splitChar
				+ source_startport6 + Constants.splitChar + source_endport6 + Constants.splitChar + apid + Constants.splitChar + apmac
				+ Constants.splitChar + longitude + Constants.splitChar + latitude + Constants.splitChar + rssi + Constants.splitChar + sessionid
				+ Constants.splitChar + x + Constants.splitChar + y + Constants.splitChar + imsi + Constants.splitChar + device_id + Constants.splitChar
				+ terminal_system + Constants.splitChar + terminal_brand + Constants.splitChar + terminal_brandtype
				+ Constants.splitChar + source + Constants.splitChar + isp_id + Constants.splitChar + wan_ip + Constants.splitChar + source_port
				+ Constants.splitChar + ssid + Constants.splitChar + associated + Constants.splitChar + floor + Constants.splitChar + login_type
				+ Constants.splitChar + plastersign + Constants.splitChar;
	}

	
}
