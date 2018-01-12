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

}
