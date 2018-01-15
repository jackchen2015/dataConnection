package com.hxct.po;

/**
 * 场所资料
 * @author 0310002487
 *
 */
public class Cszl {
	private int id;
	private String serviceCode;//场所编码
	private String serviceName;//场所名称
	private String address;//地址
	private String zip;//邮编
	private short businessNature;//场所经营性质1,表示经营；2，表示非经营；3围栏采集 9.其他
	private String principal;//负责人姓名（法人）
	private String principalTel;//负责人电话（法人）
	private String inforMan;//信息安全员
	private String inforManTel;//安全员联系电话
	private String inforManEmail;//安全员Email
	private String producerCode;//接入服务运营商代码,附录M
	private int status;//场所服务状态代码（营业状态）
	private int endingNumber;//终端数
	private int serverNumber;//服务器数
	private String exitIp;//出口IP地址，多个用逗号分隔
	private String authAccount;//网络认证账号或固定
	private String netType;//接入方式代码，参见附录N
	private int practitionerNumber;//从业人数
	private String netMonitorDepartment;//所属网监部门
	private String netMonitorMan;//网监负责人
	private String netMonitorManTel;//网监负责人联系电话
	private String remark;//备注
	private int serviceType;//场所类型
	private String provinceCode;//所属省
	private String cityCode;//所属市
	private String areaCode;//所属分区
	private String cityType;//中心类型
	private String policeCode;//派出所编码
	private String mailAccount;//接收邮箱地址
	private String mobileAccount;//接收短信手机号码
	private String xPoint;//场所地图经度
	private String yPoint;//场所地图纬度
	private String gisXpoint;//场所在GIS系统中的X坐标
	private String gisYpoint;//场所在GIS系统中的Y坐标
	private String terminalFacOrgCode;//终端安全厂商组织机构编码
	private String orgCode;//场所营业执照工商编码
	private String ipType;//IP分配方式
	private long bandWidth;//带宽
	private long netLan;//下级网络
	private long netLanTerminal;//下级网络上网电脑
	private String isSafe;//是否安全措施
	private long wifiTerminal;//无线接入用户数
	private String principalCertType;//法人证件类型，参见附录G
	private String principalCertCode;//法人证件号码
	private String personName;//场所负责人
	private String personTel;//负责人电话
	private String personQq;//负责人qq
	private String inforManQq;//信息安全员QQ
	private String startTime;//营业开始时间HH:MM
	private String endTime;//营业结束时间HH:MM
	private long createTime=0;//安装时间 Yyyy-MM-dd HH:mm:ss
	private String capType="";//采集类型:1围栏 2WIFI 3车载 9其他
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
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public short getBusinessNature() {
		return businessNature;
	}
	public void setBusinessNature(short businessNature) {
		this.businessNature = businessNature;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getPrincipalTel() {
		return principalTel;
	}
	public void setPrincipalTel(String principalTel) {
		this.principalTel = principalTel;
	}
	public String getInforMan() {
		return inforMan;
	}
	public void setInforMan(String inforMan) {
		this.inforMan = inforMan;
	}
	public String getInforManTel() {
		return inforManTel;
	}
	public void setInforManTel(String inforManTel) {
		this.inforManTel = inforManTel;
	}
	public String getInforManEmail() {
		return inforManEmail;
	}
	public void setInforManEmail(String inforManEmail) {
		this.inforManEmail = inforManEmail;
	}
	public String getProducerCode() {
		return producerCode;
	}
	public void setProducerCode(String producerCode) {
		this.producerCode = producerCode;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getEndingNumber() {
		return endingNumber;
	}
	public void setEndingNumber(int endingNumber) {
		this.endingNumber = endingNumber;
	}
	public int getServerNumber() {
		return serverNumber;
	}
	public void setServerNumber(int serverNumber) {
		this.serverNumber = serverNumber;
	}
	public String getExitIp() {
		return exitIp;
	}
	public void setExitIp(String exitIp) {
		this.exitIp = exitIp;
	}
	public String getAuthAccount() {
		return authAccount;
	}
	public void setAuthAccount(String authAccount) {
		this.authAccount = authAccount;
	}
	public String getNetType() {
		return netType;
	}
	public void setNetType(String netType) {
		this.netType = netType;
	}
	public int getPractitionerNumber() {
		return practitionerNumber;
	}
	public void setPractitionerNumber(int practitionerNumber) {
		this.practitionerNumber = practitionerNumber;
	}
	public String getNetMonitorDepartment() {
		return netMonitorDepartment;
	}
	public void setNetMonitorDepartment(String netMonitorDepartment) {
		this.netMonitorDepartment = netMonitorDepartment;
	}
	public String getNetMonitorMan() {
		return netMonitorMan;
	}
	public void setNetMonitorMan(String netMonitorMan) {
		this.netMonitorMan = netMonitorMan;
	}
	public String getNetMonitorManTel() {
		return netMonitorManTel;
	}
	public void setNetMonitorManTel(String netMonitorManTel) {
		this.netMonitorManTel = netMonitorManTel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getServiceType() {
		return serviceType;
	}
	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getCityType() {
		return cityType;
	}
	public void setCityType(String cityType) {
		this.cityType = cityType;
	}
	public String getPoliceCode() {
		return policeCode;
	}
	public void setPoliceCode(String policeCode) {
		this.policeCode = policeCode;
	}
	public String getMailAccount() {
		return mailAccount;
	}
	public void setMailAccount(String mailAccount) {
		this.mailAccount = mailAccount;
	}
	public String getMobileAccount() {
		return mobileAccount;
	}
	public void setMobileAccount(String mobileAccount) {
		this.mobileAccount = mobileAccount;
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
	public String getGisXpoint() {
		return gisXpoint;
	}
	public void setGisXpoint(String gisXpoint) {
		this.gisXpoint = gisXpoint;
	}
	public String getGisYpoint() {
		return gisYpoint;
	}
	public void setGisYpoint(String gisYpoint) {
		this.gisYpoint = gisYpoint;
	}
	public String getTerminalFacOrgCode() {
		return terminalFacOrgCode;
	}
	public void setTerminalFacOrgCode(String terminalFacOrgCode) {
		this.terminalFacOrgCode = terminalFacOrgCode;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getIpType() {
		return ipType;
	}
	public void setIpType(String ipType) {
		this.ipType = ipType;
	}
	public long getBandWidth() {
		return bandWidth;
	}
	public void setBandWidth(long bandWidth) {
		this.bandWidth = bandWidth;
	}
	public long getNetLan() {
		return netLan;
	}
	public void setNetLan(long netLan) {
		this.netLan = netLan;
	}
	public long getNetLanTerminal() {
		return netLanTerminal;
	}
	public void setNetLanTerminal(long netLanTerminal) {
		this.netLanTerminal = netLanTerminal;
	}
	public String getIsSafe() {
		return isSafe;
	}
	public void setIsSafe(String isSafe) {
		this.isSafe = isSafe;
	}
	public long getWifiTerminal() {
		return wifiTerminal;
	}
	public void setWifiTerminal(long wifiTerminal) {
		this.wifiTerminal = wifiTerminal;
	}
	public String getPrincipalCertType() {
		return principalCertType;
	}
	public void setPrincipalCertType(String principalCertType) {
		this.principalCertType = principalCertType;
	}
	public String getPrincipalCertCode() {
		return principalCertCode;
	}
	public void setPrincipalCertCode(String principalCertCode) {
		this.principalCertCode = principalCertCode;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonTel() {
		return personTel;
	}
	public void setPersonTel(String personTel) {
		this.personTel = personTel;
	}
	public String getPersonQq() {
		return personQq;
	}
	public void setPersonQq(String personQq) {
		this.personQq = personQq;
	}
	public String getInforManQq() {
		return inforManQq;
	}
	public void setInforManQq(String inforManQq) {
		this.inforManQq = inforManQq;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	public String getCapType() {
		return capType;
	}
	public void setCapType(String capType) {
		this.capType = capType;
	}

}
