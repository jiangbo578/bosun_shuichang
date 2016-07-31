package com.gouhai.baoshan.entity.business.jcqk.gk;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gouhai.baoshan.entity.BaseEntity;
import com.gouhai.baoshan.entity.business.BusinessForm;
import com.gouhai.baoshan.entity.user.Organization;

/**
 * 人口情况表(此表多数数据自动生成)
 * 
 * @author sun 2014-8-27
 * 
 */
@Entity
@Table(name = "bs_business_people_summary")
public class Peoplesummary extends BaseEntity {
	@Column(name = "xqzhs")
	private String xqzhs;     //辖区总户数
	
	@Column(name = "hjrkhs")
	private String hjrkhs;     //户籍人口户数
	
	@Column(name = "zjfwhs")
	private String zjfwhs;     //租借房屋户数
	
	@Column(name = "syrkzs")
	private String syrkzs;     //实有人口总数
	
	@Column(name = "man_count")
	private String manCount;     //男性
	
	@Column(name = "woman_count")
	private String womanCount;     //女性
	
	@Column(name = "hjrks")
	private String hjrks;     //:户籍人口数
	
	@Column(name = "outcome")
	private String outcome;     //其中外来人口
	
	@Column(name = "lhzlfwrs")
	private String lhzlfwrs;     //来沪租赁房屋人数
	
	@Column(name = "residence_permit")
	private String residencePermit;     //办居住证
	
	@Column(name = "nyrk")
	private String nyrk;     //农业人口（村）
	
	@Column(name = "fnyrk")
	private String fnyrk;     //非农业人口（村）
	
	
	/**
	 * ~~~~~~~~~~~~~~~妇女工作及老龄工作人口情况信息~~~~~~~~~~~~~~~~~
	 */
	@Column(name = "zero_three_count")
	private String zeroThreeCount;     //0-3岁儿童数
	
	@Column(name = "minor_count")
	private String minorCount;     //4-18岁儿童数
	
	@Column(name = "minor_female_count")
	private String minorFemaleCount;     //4-18儿童女性数
	
	@Column(name = "fvs")
	private String fvs;     //19-59岁妇女数
	
	@Column(name = "old_count")
	private String oldCount;     //老年人总数
	
	@Column(name = "old_man_count")
	private String oldManCount;     //60周岁以上男性
	
	@Column(name = "old_woman_count")
	private String oldWomanCount;     //60周岁以上女性
	
	@Column(name = "old_percent")
	private String oldPercent;     //老年人占比%
	
	@Column(name = "sixty_count")
	private String sixtyCount;     //60周岁以上人数
	
	@Column(name = "eighty_count")
	private String eightyCount;     //80周岁以上人数
	
	@Column(name = "alone_count")
	private String aloneCount;     //独居老人
	
	@Column(name = "tk_count")
	private String tkCount;     //特困老人
	
	@Column(name = "five_count")
	private String fiveCount;     //五保老人
	
	@Column(name = "three_count")
	private String threeCount;     //三无老人
	
	/**
	 * ~~~~~~~~~~~~~~~~~~~党员人口情况信息~~~~~~~~~~~~~~~~~~~
	 */
	@Column(name="party_count")
	private String partyCount;//党员人数
	
	@Column(name="zc_party_count")
	private String zcPartyCount;//在册党员
	
	@Column(name="localezc_party_count")
	private String localeZcPartyCount;//本居民区的在职党员
	
	@Column(name="party_volunteer_count")
	private String partyVolunteerCount;//党员志愿者总数
	
	@Column(name="zzparty_volunteer_count")
	private String zzpartyVolunteerCount;//其中在职
	
	@Column(name="txparty_volunteer_count")
	private String txpartyVolunteerCount;//其中退休
	
	/**
	 * ~~~~~~~~~~~~~~~统战人口情况信息~~~~~~~~~~~~~~~~~~
	 */
	
	@Column(name="tz_count")
	private String tzCount;//统战对象总人数
	
	@Column(name="mzdprs")
	private String mzdprs;//民主党派人数
	
	@Column(name="tqjrs")
	private String tqjrs;//台侨界人数
	
	@Column(name="new_world_count")
	private String newWorldCount;//新社会阶层人数
	
	@Column(name="minimz_count")
	private String minimzCount;//少数民族人数
	
	/**
	 * ~~~~~~~~~~~~~~双拥人口情况信息~~~~~~~~~~~~~~~~~~
	 */
	@Column(name="yfdxrs")
	private String yfdxrs;//优抚对象人数
	
	@Column(name="gmlsyzrs")
	private String gmlsyzrs;//革命烈士遗属
	
	@Column(name="jryzrs")
	private String jryzrs;//因公牺牲军人遗属
	
	
	@Column(name="zdyfdxrs")
	private String zdyfdxrs;//重点优抚对对象人数
	
	@Column(name="xyjrjsrs")
	private String xyjrjsrs;//现役军人家属
	
	@Column(name="fyjrrs")
	private String fyjrrs;//复员军人
	
	@Column(name="bgjryz")
	private String bgjryz;//病故军人遗属
	
	@Column(name="jdbhds")
	private String jdbhds;//结对包户对数
	
	@Column(name="twjr")
	private String twjr;//退伍军人
	
	@Column(name="cjjr")
	private String cjjr;//残疾军人
	
	@Column(name="yjyzfwxz")
	private String yjyzfwxz;//拥军优属服务小组数
	
	@Column(name="other")
	private String other;//其它
	
	@Column(name="relation")
	private String relation;//与何部队建立共建关系
	
	@Column(name="jshs")
	private String jshs;//军属户数
	
	@Column(name="lshs")
	private String lshs;//烈属户数
	
	//最近五年   复退伍人数
	
	@Column(name="first_year")
	private String firstYear;
	
	@Column(name="second_year")
	private String secondYear;
	
	@Column(name="third_year")
	private String thirdYear;
	
	@Column(name="forth_year")
	private String forthYear;
	
	@Column(name="current_year")
	private String currentYear;
	
	/**
//	 * ~~~~~~~~~~~~~~~~~~残疾人情况信息~~~~~~~~~~~~~~~~~~~~~~~~~
	 */
	@Column(name="cjrs")
	private String cjrs;//残疾人数:
	
	@Column(name="jscjrs")
	private String jscjrs;//精神残疾人数
	
	
	/**
	 * ~~~~~~~~~~~~~~~~~~~~计划生育情况信息~~~~~~~~~~~~~~~~~~~~~~~
	 */
	
	@Column(name="ylfnrs")
	private String ylfnrs;//育龄妇女数
	
	@Column(name="yhylfnrs")
	private String yhylfnrs;//已婚育龄妇女数
	
	@Column(name="birth_count")
	private String birthCount;//出生数
	
	@Column(name="die_count")
	private String dieCount;//死亡数
	
	/**
	 * ~~~~~~~~~~~~~~~~~~~低保人口情况~~~~~~~~~~~~~~~~~~~~
	 */
	@Column(name="dbcount")
	private String dbcount;//低保对象数
	
	/**
	 * ~~~~~~~~~~~~~~~~~~~~群众文化团情况信息~~~~~~~~~~~~~~
	 */
	
	@Column(name="wttd")
	private String wttd;//文体团队个
	
	@Column(name="wttdrs")
	private String wttdrs;//文体团队人数
	
	@Column(name="qztd")
	private String qztd;//群众团队
	
	@Column(name="sqzyzdw")
	private String sqzyzdw;//社区志愿者队伍
	
	@Column(name="sqzyzrs")
	private String sqzyzrs;//社区志愿者人数
	
	public Peoplesummary()
	{
		
	}
	/**
	 * 统计首页总人口数
	 */
	public Peoplesummary(String syrkzs)
	{
		this.syrkzs = syrkzs;
	}
	
	@OneToOne
	@JoinColumn(name = "BUSINESS_FORM_ID", unique = true)
	private BusinessForm businessForm;

	@OneToOne
	@JoinColumn(name = "organization_id", unique = true)
	private Organization organization;// 组织机构

	public BusinessForm getBusinessForm()
	{
		return businessForm;
	}

	public void setBusinessForm(BusinessForm businessForm)
	{
		this.businessForm = businessForm;
	}

	public Organization getOrganization()
	{
		return organization;
	}
	public void setOrganization(Organization organization)
	{
		this.organization = organization;
	}
	public String getXqzhs()
	{
		return xqzhs;
	}

	public void setXqzhs(String xqzhs)
	{
		this.xqzhs = xqzhs;
	}

	public String getHjrkhs()
	{
		return hjrkhs;
	}

	public void setHjrkhs(String hjrkhs)
	{
		this.hjrkhs = hjrkhs;
	}

	public String getZjfwhs()
	{
		return zjfwhs;
	}

	public void setZjfwhs(String zjfwhs)
	{
		this.zjfwhs = zjfwhs;
	}

	public String getSyrkzs()
	{
		return syrkzs;
	}

	public void setSyrkzs(String syrkzs)
	{
		this.syrkzs = syrkzs;
	}

	public String getManCount()
	{
		return manCount;
	}

	public void setManCount(String manCount)
	{
		this.manCount = manCount;
	}

	public String getWomanCount()
	{
		return womanCount;
	}

	public void setWomanCount(String womanCount)
	{
		this.womanCount = womanCount;
	}

	public String getHjrks()
	{
		return hjrks;
	}

	public void setHjrks(String hjrks)
	{
		this.hjrks = hjrks;
	}

	public String getOutcome()
	{
		return outcome;
	}

	public void setOutcome(String outcome)
	{
		this.outcome = outcome;
	}

	public String getLhzlfwrs()
	{
		return lhzlfwrs;
	}

	public void setLhzlfwrs(String lhzlfwrs)
	{
		this.lhzlfwrs = lhzlfwrs;
	}

	public String getResidencePermit()
	{
		return residencePermit;
	}

	public void setResidencePermit(String residencePermit)
	{
		this.residencePermit = residencePermit;
	}

	public String getNyrk()
	{
		return nyrk;
	}

	public void setNyrk(String nyrk)
	{
		this.nyrk = nyrk;
	}

	public String getFnyrk()
	{
		return fnyrk;
	}

	public void setFnyrk(String fnyrk)
	{
		this.fnyrk = fnyrk;
	}

	public String getZeroThreeCount()
	{
		return zeroThreeCount;
	}

	public void setZeroThreeCount(String zeroThreeCount)
	{
		this.zeroThreeCount = zeroThreeCount;
	}

	public String getMinorCount()
	{
		return minorCount;
	}

	public void setMinorCount(String minorCount)
	{
		this.minorCount = minorCount;
	}

	public String getMinorFemaleCount()
	{
		return minorFemaleCount;
	}

	public void setMinorFemaleCount(String minorFemaleCount)
	{
		this.minorFemaleCount = minorFemaleCount;
	}

	public String getFvs()
	{
		return fvs;
	}

	public void setFvs(String fvs)
	{
		this.fvs = fvs;
	}

	public String getOldCount()
	{
		return oldCount;
	}

	public void setOldCount(String oldCount)
	{
		this.oldCount = oldCount;
	}

	public String getOldManCount()
	{
		return oldManCount;
	}

	public void setOldManCount(String oldManCount)
	{
		this.oldManCount = oldManCount;
	}

	public String getOldWomanCount()
	{
		return oldWomanCount;
	}

	public void setOldWomanCount(String oldWomanCount)
	{
		this.oldWomanCount = oldWomanCount;
	}

	public String getOldPercent()
	{
		return oldPercent;
	}

	public void setOldPercent(String oldPercent)
	{
		this.oldPercent = oldPercent;
	}

	public String getSixtyCount()
	{
		return sixtyCount;
	}

	public void setSixtyCount(String sixtyCount)
	{
		this.sixtyCount = sixtyCount;
	}

	public String getEightyCount()
	{
		return eightyCount;
	}

	public void setEightyCount(String eightyCount)
	{
		this.eightyCount = eightyCount;
	}

	public String getAloneCount()
	{
		return aloneCount;
	}

	public void setAloneCount(String aloneCount)
	{
		this.aloneCount = aloneCount;
	}

	public String getTkCount()
	{
		return tkCount;
	}

	public void setTkCount(String tkCount)
	{
		this.tkCount = tkCount;
	}

	public String getFiveCount()
	{
		return fiveCount;
	}

	public void setFiveCount(String fiveCount)
	{
		this.fiveCount = fiveCount;
	}

	public String getThreeCount()
	{
		return threeCount;
	}

	public void setThreeCount(String threeCount)
	{
		this.threeCount = threeCount;
	}

	public String getPartyCount()
	{
		return partyCount;
	}

	public void setPartyCount(String partyCount)
	{
		this.partyCount = partyCount;
	}

	public String getZcPartyCount()
	{
		return zcPartyCount;
	}

	public void setZcPartyCount(String zcPartyCount)
	{
		this.zcPartyCount = zcPartyCount;
	}

	public String getLocaleZcPartyCount()
	{
		return localeZcPartyCount;
	}

	public void setLocaleZcPartyCount(String localeZcPartyCount)
	{
		this.localeZcPartyCount = localeZcPartyCount;
	}

	public String getPartyVolunteerCount()
	{
		return partyVolunteerCount;
	}

	public void setPartyVolunteerCount(String partyVolunteerCount)
	{
		this.partyVolunteerCount = partyVolunteerCount;
	}

	public String getZzpartyVolunteerCount()
	{
		return zzpartyVolunteerCount;
	}

	public void setZzpartyVolunteerCount(String zzpartyVolunteerCount)
	{
		this.zzpartyVolunteerCount = zzpartyVolunteerCount;
	}

	public String getTxpartyVolunteerCount()
	{
		return txpartyVolunteerCount;
	}

	public void setTxpartyVolunteerCount(String txpartyVolunteerCount)
	{
		this.txpartyVolunteerCount = txpartyVolunteerCount;
	}

	public String getTzCount()
	{
		return tzCount;
	}

	public void setTzCount(String tzCount)
	{
		this.tzCount = tzCount;
	}

	public String getMzdprs()
	{
		return mzdprs;
	}

	public void setMzdprs(String mzdprs)
	{
		this.mzdprs = mzdprs;
	}

	public String getTqjrs()
	{
		return tqjrs;
	}

	public void setTqjrs(String tqjrs)
	{
		this.tqjrs = tqjrs;
	}

	public String getNewWorldCount()
	{
		return newWorldCount;
	}

	public void setNewWorldCount(String newWorldCount)
	{
		this.newWorldCount = newWorldCount;
	}

	public String getMinimzCount()
	{
		return minimzCount;
	}

	public void setMinimzCount(String minimzCount)
	{
		this.minimzCount = minimzCount;
	}

	public String getYfdxrs()
	{
		return yfdxrs;
	}

	public void setYfdxrs(String yfdxrs)
	{
		this.yfdxrs = yfdxrs;
	}

	public String getGmlsyzrs()
	{
		return gmlsyzrs;
	}

	public void setGmlsyzrs(String gmlsyzrs)
	{
		this.gmlsyzrs = gmlsyzrs;
	}

	public String getJryzrs()
	{
		return jryzrs;
	}

	public void setJryzrs(String jryzrs)
	{
		this.jryzrs = jryzrs;
	}

	public String getZdyfdxrs()
	{
		return zdyfdxrs;
	}

	public void setZdyfdxrs(String zdyfdxrs)
	{
		this.zdyfdxrs = zdyfdxrs;
	}

	public String getXyjrjsrs()
	{
		return xyjrjsrs;
	}

	public void setXyjrjsrs(String xyjrjsrs)
	{
		this.xyjrjsrs = xyjrjsrs;
	}

	public String getFyjrrs()
	{
		return fyjrrs;
	}

	public void setFyjrrs(String fyjrrs)
	{
		this.fyjrrs = fyjrrs;
	}

	public String getBgjryz()
	{
		return bgjryz;
	}

	public void setBgjryz(String bgjryz)
	{
		this.bgjryz = bgjryz;
	}

	public String getJdbhds()
	{
		return jdbhds;
	}

	public void setJdbhds(String jdbhds)
	{
		this.jdbhds = jdbhds;
	}

	public String getTwjr()
	{
		return twjr;
	}

	public void setTwjr(String twjr)
	{
		this.twjr = twjr;
	}

	public String getCjjr()
	{
		return cjjr;
	}

	public void setCjjr(String cjjr)
	{
		this.cjjr = cjjr;
	}

	public String getYjyzfwxz()
	{
		return yjyzfwxz;
	}

	public void setYjyzfwxz(String yjyzfwxz)
	{
		this.yjyzfwxz = yjyzfwxz;
	}

	public String getOther()
	{
		return other;
	}

	public void setOther(String other)
	{
		this.other = other;
	}

	public String getRelation()
	{
		return relation;
	}

	public void setRelation(String relation)
	{
		this.relation = relation;
	}

	public String getJshs()
	{
		return jshs;
	}

	public void setJshs(String jshs)
	{
		this.jshs = jshs;
	}

	public String getLshs()
	{
		return lshs;
	}

	public void setLshs(String lshs)
	{
		this.lshs = lshs;
	}

	public String getFirstYear()
	{
		return firstYear;
	}

	public void setFirstYear(String firstYear)
	{
		this.firstYear = firstYear;
	}

	public String getSecondYear()
	{
		return secondYear;
	}

	public void setSecondYear(String secondYear)
	{
		this.secondYear = secondYear;
	}

	public String getThirdYear()
	{
		return thirdYear;
	}

	public void setThirdYear(String thirdYear)
	{
		this.thirdYear = thirdYear;
	}

	public String getForthYear()
	{
		return forthYear;
	}

	public void setForthYear(String forthYear)
	{
		this.forthYear = forthYear;
	}

	public String getCurrentYear()
	{
		return currentYear;
	}

	public void setCurrentYear(String currentYear)
	{
		this.currentYear = currentYear;
	}

	public String getCjrs()
	{
		return cjrs;
	}

	public void setCjrs(String cjrs)
	{
		this.cjrs = cjrs;
	}

	public String getJscjrs()
	{
		return jscjrs;
	}

	public void setJscjrs(String jscjrs)
	{
		this.jscjrs = jscjrs;
	}

	public String getYlfnrs()
	{
		return ylfnrs;
	}

	public void setYlfnrs(String ylfnrs)
	{
		this.ylfnrs = ylfnrs;
	}

	public String getYhylfnrs()
	{
		return yhylfnrs;
	}

	public void setYhylfnrs(String yhylfnrs)
	{
		this.yhylfnrs = yhylfnrs;
	}

	public String getBirthCount()
	{
		return birthCount;
	}

	public void setBirthCount(String birthCount)
	{
		this.birthCount = birthCount;
	}

	public String getDieCount()
	{
		return dieCount;
	}

	public void setDieCount(String dieCount)
	{
		this.dieCount = dieCount;
	}

	public String getDbcount()
	{
		return dbcount;
	}

	public void setDbcount(String dbcount)
	{
		this.dbcount = dbcount;
	}

	public String getWttd()
	{
		return wttd;
	}

	public void setWttd(String wttd)
	{
		this.wttd = wttd;
	}

	public String getWttdrs()
	{
		return wttdrs;
	}

	public void setWttdrs(String wttdrs)
	{
		this.wttdrs = wttdrs;
	}

	public String getQztd()
	{
		return qztd;
	}

	public void setQztd(String qztd)
	{
		this.qztd = qztd;
	}

	public String getSqzyzdw()
	{
		return sqzyzdw;
	}

	public void setSqzyzdw(String sqzyzdw)
	{
		this.sqzyzdw = sqzyzdw;
	}

	public String getSqzyzrs()
	{
		return sqzyzrs;
	}

	public void setSqzyzrs(String sqzyzrs)
	{
		this.sqzyzrs = sqzyzrs;
	}
}
