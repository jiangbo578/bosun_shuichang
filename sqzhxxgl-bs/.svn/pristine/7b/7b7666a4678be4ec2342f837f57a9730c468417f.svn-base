package com.gouhai.baoshan.entity.assess;

/**
 * @author sun 2014-09-04
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.user.Organization;

/**
 * @author sun 2014-09-04 各类考核模版实例
 */
@Entity
@Table(name = "bs_business_assess_template_instance")
public class AssessTemplateInstance extends BaseEntity {

	// 二级字段（考核项目）
	@Column(name = "PROJECT")
	private String project; // 考核项目

	@Column(name = "ALL_SCORE")
	private String allScore; // 项目总分

	@Column(name = "PROJECT_SCORE")
	private String projectScore; // 项目实际总得分

	@Column(name = "Zznbm_check")
	private String zznb_check;// 针剂职能部门审核情况

	@Column(name = "CHECK_SCORE")
	private String checkScore; // 区级相关部门审核打分情况
	// （考核类别）
	@Column(name = "TYPE")
	private String type; // 考核类别

	@Column(name = "COUNT")
	private String count; // 村居填写今年个数

	@Column(name = "OLD_COUNT")
	private String oldCount; // 街镇填写去年个数

	@Column(name = "IDEA")
	private String idea; // 填写意见

	@Column(name = "JZ_COUNT")
	private String jzCount; // 街镇审核数据情况

	@Column(name = "TYPE_KF")
	private String typeKF = "0"; // 类别扣分

	@Column(name = "enableFlag")
	// 可用状态
	private boolean enableFlag;

	@Column(name = "description")
	// 备注
	private String description;

	@Column(name = "PROCESS_STATUS")
	// 流程状态 村居 ：0,街镇：1,区：2
	private Integer processStatus;

	@Column(name = "STATUS")
	//
	private Integer status;

	@Column(name = "LEVEL")
	// 区分二级与三级考核条目 0：二级，1：三级
	private Integer level;

	@ManyToOne
	@JoinColumn(name = "ORGANIZATION_ID", unique = true)
	private Organization organization;// 用户所在组织机构（给具体村居添加时设置的）

	@ManyToOne
	@JoinColumn(name = "ZN_ID", unique = true)
	private Organization zn;// 职能部门

	@Column(name = "znbm_id")
	private String znbmId; // .职能部门id

	@ManyToOne
	@JoinColumn(name = "assessBaseEntity_ID", unique = true)
	private AssessBaseEntity assessBaseEntity;// 考核条目所属大类
	/*
	 * @OneToMany(mappedBy = "assessTemplateInstance", cascade =
	 * CascadeType.REMOVE, fetch = FetchType.LAZY) private List<RuleInstance>
	 * rules = new ArrayList<RuleInstance>();// 评分规则
	 */
	@ManyToOne
	@JoinColumn(name = "PARENT_ID", unique = true)
	private AssessTemplate assessTemplate;// 父类ID

	@Column(name = "hold")
	private Integer hold = 0;// 0代表草稿 1代表保存并提交

	@Column(name = "MBID")
	private String mbid;// 用来保存模板表的ID；

	@Column(name = "khgz")
	private String khgz;// 标示是计算个数还是比率的

	@Column(name = "code")
	private String code;// 使用编码来匹配是否是同一条记录

	@Column(name = "breakCount")
	private Integer breakCount = 0;// 被驳回的次数

	@Column(name = "submitCount")
	private Integer submitCount;// 提交的次数

	@Column(name = "vag")
	private double vag;// 平均值

	@Column(name = "tb")
	private String tb;// 同比

	@Column(name = "des")
	private Integer des;// 排序顺序

	// 类别扣分限制
	private double kfxz;// 扣分限制

	
	@Column(name = "sfxy")
	private String sfxy;// 往年的数据是否需要手动填报

	public String getSfxy() {
		return sfxy;
	}

	public void setSfxy(String sfxy) {
		this.sfxy = sfxy;
	}

	public double getKfxz() {
		return kfxz;
	}

	public void setKfxz(double kfxz) {
		this.kfxz = kfxz;
	}

	public Integer getDes() {
		return des;
	}

	public void setDes(Integer des) {
		this.des = des;
	}

	public String getTb() {
		return tb;
	}

	public void setTb(String tb) {
		this.tb = tb;
	}

	public double getVag() {
		return vag;
	}

	public void setVag(double vag) {
		this.vag = vag;
	}

	public AssessTemplateInstance() {

	}

	public AssessTemplateInstance(String id) {
		this.id = id;
	}

	public Integer getSubmitCount() {
		return submitCount;
	}

	public void setSubmitCount(Integer submitCount) {
		this.submitCount = submitCount;
	}

	public Integer getBreakCount() {
		return breakCount;
	}

	public void setBreakCount(Integer breakCount) {
		this.breakCount = breakCount;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getKhgz() {
		return khgz;
	}

	public void setKhgz(String khgz) {
		this.khgz = khgz;
	}

	public String getMbid() {
		return mbid;
	}

	public void setMbid(String mbid) {
		this.mbid = mbid;
	}

	public String getZznb_check() {
		return zznb_check;
	}

	public void setZznb_check(String zznb_check) {
		this.zznb_check = zznb_check;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getAllScore() {
		return allScore;
	}

	public void setAllScore(String allScore) {
		this.allScore = allScore;
	}

	public String getProjectScore() {
		return projectScore;
	}

	public void setProjectScore(String projectScore) {
		this.projectScore = projectScore;
	}

	public String getCheckScore() {
		return checkScore;
	}

	public void setCheckScore(String checkScore) {
		this.checkScore = checkScore;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getOldCount() {
		return oldCount;
	}

	public void setOldCount(String oldCount) {
		this.oldCount = oldCount;
	}

	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getJzCount() {
		return jzCount;
	}

	public void setJzCount(String jzCount) {
		this.jzCount = jzCount;
	}

	public String getTypeKF() {
		return typeKF;
	}

	public void setTypeKF(String typeKF) {
		this.typeKF = typeKF;
	}

	public boolean isEnableFlag() {
		return enableFlag;
	}

	public void setEnableFlag(boolean enableFlag) {
		this.enableFlag = enableFlag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(Integer processStatus) {
		this.processStatus = processStatus;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Organization getZn() {
		return zn;
	}

	public void setZn(Organization zn) {
		this.zn = zn;
	}

	public String getZnbmId() {
		return znbmId;
	}

	public void setZnbmId(String znbmId) {
		this.znbmId = znbmId;
	}

	public AssessBaseEntity getAssessBaseEntity() {
		return assessBaseEntity;
	}

	public void setAssessBaseEntity(AssessBaseEntity assessBaseEntity) {
		this.assessBaseEntity = assessBaseEntity;
	}

	public AssessTemplate getAssessTemplate() {
		return assessTemplate;
	}

	public void setAssessTemplate(AssessTemplate assessTemplate) {
		this.assessTemplate = assessTemplate;
	}

	public Integer getHold() {
		return hold;
	}

	public void setHold(Integer hold) {
		this.hold = hold;
	}

}
