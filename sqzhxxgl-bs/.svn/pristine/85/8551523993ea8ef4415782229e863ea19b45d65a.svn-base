package com.gouhai.baoshan.service.assess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.stereotype.Service;

import com.gouhai.baoshan.dao.assess.ScoreDao;
import com.gouhai.baoshan.entity.assess.AssessBaseEntity;
import com.gouhai.baoshan.entity.assess.Huizong;
import com.gouhai.baoshan.entity.assess.Score;
import com.gouhai.baoshan.entity.user.Organization;
import com.gouhai.baoshan.spring.PageableController;

@Service
public class ScoreService {
	@Autowired
	private ScoreDao scoreDao;
	final static String hql = "from Score  where organization=? and date=? order by updateDate";

	// 根据考核村居和时间获取600分分数
	public List<Score> getObjList(int pageNumber, Organization organization,
			String date) {
		return scoreDao.findList(hql, pageNumber, PageableController.PAGE_SIZE,
				organization, date);
	}

	// 考核村居和类别和时间获取分数
	public Score getScorelistById(AssessBaseEntity assessBaseEntity,
			Organization organization, String date) {
		String sql = "from Score  where organization=? and date=? and assessBaseEntity=?  order by updateDate";
		return scoreDao.findOne(sql, organization, date, assessBaseEntity);
	}

	// 时间获取分数
	public List<Score> getList(String date) {
		return scoreDao.findAll("from Score where date=?", date);
	}

	// //根据考核类别的ID和标示获取考核规则
	// public Score getScorelistByCode(AssessTemplate template,String code){
	// return
	// scoreDao.findOne("from Score  where assessTemplate=? and  identity=?",
	// template,code);
	// }
	// public long getObjCount(AssessTemplate template) {
	// return scoreDao.findCount(hql,template);
	// }

	// 增加
	public void insert(Score t) {
		scoreDao.insert(t);
	}

	// 根据主键删除
	public void delete(String id) {
		scoreDao.delete(id);
	}

	// 修改
	public void update(Score t) {
		scoreDao.update(t);
	}

	public Score findOne(String id) {
		return scoreDao.findOne(id);
	}

	// //根据ID获取考核规则
	// public Score getRulrByid(String id){
	// return scoreDao.findOne("from Score  where assessTemplate=? ", new
	// AssessTemplate(id));
	// }
	public List<Huizong> getScore() {
		String sql = "select bb.name zhen,bc.* from bs_organization bb LEFT JOIN (select br.name cj,br.PARENT_ID, score.* from bs_organization br LEFT JOIN (select a.* ,b.shza ,c.zzgl,d.rkgl,e.mzzz,f.sqhj from (select ORGANIZATION_ID,SUM(PROJECT_SCORE)ggan from bs_business_assess_template_instance WHERE "
				+ " `LEVEL` ='0' AND assessBaseEntity_ID ='402881b34844a10b014844adac4d0013' GROUP BY ORGANIZATION_ID) a,(select ORGANIZATION_ID id,SUM(PROJECT_SCORE) shza from bs_business_assess_template_instance WHERE "
				+ " `LEVEL` ='0' AND assessBaseEntity_ID ='402881b34844a10b014844a22fdb0000' GROUP BY ORGANIZATION_ID) b,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) zzgl from bs_business_assess_template_instance WHERE "
				+ " `LEVEL` ='0' AND assessBaseEntity_ID ='40288186485f00ec01485f15830e0000' GROUP BY ORGANIZATION_ID) c,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) rkgl from bs_business_assess_template_instance WHERE "
				+ "`LEVEL` ='0' AND  assessBaseEntity_ID ='40288084487ca68001487d6525d200a2' GROUP BY ORGANIZATION_ID) d,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) mzzz from bs_business_assess_template_instance WHERE "
				+ " `LEVEL` ='0' AND assessBaseEntity_ID ='40288084487ca68001487d56cae2008c' GROUP BY ORGANIZATION_ID) e,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) sqhj from bs_business_assess_template_instance WHERE "
				+ "`LEVEL` ='0' AND assessBaseEntity_ID ='40288084487ca68001487d4e21c50075' GROUP BY ORGANIZATION_ID) f WHERE a.ORGANIZATION_ID=b.id and a.ORGANIZATION_ID=c.ORGANIZATION_ID and a.ORGANIZATION_ID=d.ORGANIZATION_ID"
				+ " and a.ORGANIZATION_ID=e.ORGANIZATION_ID and a.ORGANIZATION_ID=f.ORGANIZATION_ID) score on br.pid=score.ORGANIZATION_ID where  br.flag=1 ) bc on bb.pid=bc.PARENT_ID WHERE bc.PARENT_ID is not null ORDER BY NAME";
		System.out.println(sql);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Huizong huizong = null;
		List<Huizong> list = new ArrayList<Huizong>();
		try {
			conn = SessionFactoryUtils.getDataSource(
					scoreDao.getSessionFactory()).getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			DecimalFormat df = new DecimalFormat("#.00");
			int count = 0;
			while (rs.next()) {
				count = 0;
				huizong = new Huizong();
				huizong.setZhen(rs.getString("zhen"));
				huizong.setName(rs.getString("cj"));
				huizong.setS1(Double.parseDouble(df.format(rs.getDouble("ggan"))));
				huizong.setS2(Double.parseDouble(df.format(rs.getDouble("shza"))));
				huizong.setS3(Double.parseDouble(df.format(rs.getDouble("zzgl"))));
				huizong.setS4(Double.parseDouble(df.format(rs.getDouble("rkgl"))));
				huizong.setS5(Double.parseDouble(df.format(rs.getDouble("mzzz"))));
				huizong.setS6(Double.parseDouble(df.format(rs.getDouble("sqhj"))));
				huizong.setId(rs.getString("ORGANIZATION_ID"));
				if (huizong.getS1() < 80) {
					count = count + 1;
				}
				if (huizong.getS2() < 80) {
					count = count + 1;
				}
				if (huizong.getS3() < 80) {
					count = count + 1;
				}
				if (huizong.getS4() < 80) {
					count = count + 1;
				}
				if (huizong.getS5() < 80) {
					count = count + 1;
				}
				if (huizong.getS6() < 80) {
					count = count + 1;
				}
				if (count == 1) {
					huizong.setPj("B");
				} else if (count >= 2) {
					huizong.setPj("C");
				} else {
					huizong.setPj("A");
				}
				System.out.println(huizong.getName() + ":" + count);
				list.add(huizong);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		return list;
	}

	public List<Huizong> getScoreByCun() {
		String sql = "select bb.name zhen,bc.* from bs_organization bb LEFT JOIN (select br.name cj,br.PARENT_ID,br.deleted, score.* from bs_organization br LEFT JOIN (select a.* ,b.shza ,c.szgl,d.rkgl,e.shj,f.wfyd from (select ORGANIZATION_ID,SUM(PROJECT_SCORE)ggan from bs_business_assess_template_instance WHERE "
				+ " `LEVEL` ='0' AND assessBaseEntity_ID ='402881b34844a10b014844ae4b300014' GROUP BY ORGANIZATION_ID) a,(select ORGANIZATION_ID id,SUM(PROJECT_SCORE) shza from bs_business_assess_template_instance WHERE "
				+ "`LEVEL` ='0' AND  assessBaseEntity_ID ='402881b34844a10b014844a766b9000d' GROUP BY ORGANIZATION_ID) b,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) szgl from bs_business_assess_template_instance WHERE "
				+ "`LEVEL` ='0' AND  assessBaseEntity_ID ='5ec9d59d48abd7280148afc5e212014c' GROUP BY ORGANIZATION_ID) c,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) rkgl from bs_business_assess_template_instance WHERE "
				+ "`LEVEL` ='0' AND  assessBaseEntity_ID ='40288084487d6cac01487dc081a6008b' GROUP BY ORGANIZATION_ID) d,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) shj from bs_business_assess_template_instance WHERE  "
				+ "`LEVEL` ='0' AND  assessBaseEntity_ID ='40288084487d6cac01487d9b8aa8005f' GROUP BY ORGANIZATION_ID) e,(select ORGANIZATION_ID,SUM(PROJECT_SCORE) wfyd from bs_business_assess_template_instance WHERE  "
				+ "`LEVEL` ='0' AND assessBaseEntity_ID ='40288084487d6cac01487d8ae9510046' GROUP BY ORGANIZATION_ID) f WHERE a.ORGANIZATION_ID=b.id and a.ORGANIZATION_ID=c.ORGANIZATION_ID and a.ORGANIZATION_ID=d.ORGANIZATION_ID "
				+ " and a.ORGANIZATION_ID=e.ORGANIZATION_ID and a.ORGANIZATION_ID=f.ORGANIZATION_ID) score on br.pid=score.ORGANIZATION_ID where  br.flag=0)"
				+ " bc on bb.pid=bc.PARENT_ID WHERE bc.PARENT_ID is not null AND bc.deleted!=1 ORDER BY NAME";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Huizong huizong = null;
		List<Huizong> list = new ArrayList<Huizong>();
		try {
			conn = SessionFactoryUtils.getDataSource(
					scoreDao.getSessionFactory()).getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			DecimalFormat df = new DecimalFormat("#.00");
			int count = 0;
			while (rs.next()) {
				count = 0;
				huizong = new Huizong();
				huizong.setZhen(rs.getString("zhen"));
				huizong.setName(rs.getString("cj"));
				huizong.setS1(Double.parseDouble(df.format(rs.getDouble("ggan"))));
				huizong.setS2(Double.parseDouble(df.format(rs.getDouble("shza"))));
				huizong.setS3(Double.parseDouble(df.format(rs.getDouble("wfyd"))));
				huizong.setS4(Double.parseDouble(df.format(rs.getDouble("rkgl"))));
				huizong.setS5(Double.parseDouble(df.format(rs.getDouble("szgl"))));
				huizong.setS6(Double.parseDouble(df.format(rs.getDouble("shj"))));
				huizong.setId(rs.getString("ORGANIZATION_ID"));
				if (huizong.getS1() < 80) {
					count = count + 1;
				}
				if (huizong.getS2() < 80) {
					count = count + 1;
				}
				if (huizong.getS3() < 80) {
					count = count + 1;
				}
				if (huizong.getS4() < 80) {
					count = count + 1;
				}
				if (huizong.getS5() < 80) {
					count = count + 1;
				}
				if (huizong.getS6() < 80) {
					count = count + 1;
				}
				if (count == 1) {
					huizong.setPj("B");
				} else if (count >= 2) {
					huizong.setPj("C");
				} else {
					huizong.setPj("A");
				}
				list.add(huizong);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} finally {
							if (conn != null) {
								try {
									conn.close();
								} catch (SQLException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
						}
					}
				}
			}
		}
		return list;
	}
}
