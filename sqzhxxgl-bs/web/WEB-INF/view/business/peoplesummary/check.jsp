<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/taizhang/list/1">基础信息</a> <span class="divider">/</span></li>
    <li ><a href="/peoplesummary/list/1">人口情况表</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>审核报表</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<th width="10%">标题：</th>
				<td width=90%">${businessForm.name }</td>
			</tr>
			<tr>
			<th>内容</th>
			<td>
				<table class="table table-striped table-bordered table-hover">
					
					<!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~tr start~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
					 <tr >
					    <th width="143" valign="center" colspan="2" ><p >辖区总户数 </p></th>
					    <td width="79" valign="center" colspan="3" ><p>${peoplesummary.xqzhs } </p></td>
					    <td width="157" valign="center" colspan="9" ><p >其中:户籍人口户数 </p></td>
					    <td width="82" valign="center" colspan="7" ><p >${peoplesummary.hjrkhs } </p></td>
					    <td width="99" valign="center" colspan="7" ><p >租借房屋户数 </p></td>
					    <td width="111" valign="center" colspan="7" ><p >${peoplesummary.zjfwhs } </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >实有人口总数: </p></td>
					    <td width="79" valign="center" colspan="3" ><p >${peoplesummary.syrkzs } </p></td>
					    <td width="157" valign="center" colspan="9" ><p >其中：男性 </p></td>
					    <td width="82" valign="center" colspan="7" ><p >${peoplesummary.manCount } </p></td>
					    <td width="99" valign="center" colspan="7" ><p >女性 </p></td>
					    <td width="111" valign="center" colspan="7" ><p >${peoplesummary.womanCount } </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >其中:户籍人口数 </p></td>
					    <td width="79" valign="center" colspan="3" ><p >${peoplesummary.hjrks } </p></td>
					    <td width="109" valign="center" colspan="5" ><p >其中外来人口 </p></td>
					    <td width="48" valign="center" colspan="4" ><p >${peoplesummary.outcome } </p></td>
					    <td width="127" valign="center" colspan="12" ><p >来沪租赁房屋人数 </p></td>
					    <td width="66" valign="center" colspan="3" ><p >${peoplesummary.lhzlfwrs }</p></td>
					    <td width="62" valign="center" colspan="5" ><p >办居住证 </p></td>
					    <td width="36" valign="center" ><p >${peoplesummary.residencePermit } </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" ><p >农业人口（村） </p></td>
					    <td width="237" valign="center" colspan="13" ><p >&nbsp;${peoplesummary.nyrk }</p></td>
					    <td width="127" valign="center" colspan="12" ><p >非农人口（村） </p></td>
					    <td width="166" valign="center" colspan="9" ><p >&nbsp;${peoplesummary.fnyrk }</p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >妇女工作及老龄工作人口情况信息 </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >0-3岁儿童数 </p></td>
					    <td width="109" valign="center" colspan="4" ><p >${peoplesummary.zeroThreeCount } </p></td>
					    <td width="123" valign="center" colspan="7" ><p >4-18岁儿童数 </p></td>
					    <td width="80" valign="center" colspan="7" ><p >${peoplesummary.minorCount } </p></td>
					    <td width="161" valign="center" colspan="13" ><p >其中4-18儿童女性数 </p></td>
					    <td width="55" valign="center" colspan="2" ><p >${peoplesummary.minorFemaleCount } </p></td>
					  </tr>
					  <tr >
					    <td width="376" valign="center" colspan="13" ><p >19-59岁妇女数 </p></td>
					    <td width="297" valign="center" colspan="22" ><p >&nbsp;${peoplesummary.fvs }</p></td>
					  </tr>
					  <tr >
					    <td width="223" valign="center" colspan="5" ><p >老年人总数 &nbsp;&nbsp;&nbsp;&nbsp;${peoplesummary.oldCount }</p></td>
					    <td width="153" valign="center" colspan="8" ><p >其中60周岁以上男性 </p></td>
					    <td width="80" valign="center" colspan="7" ><p >${peoplesummary.oldManCount } </p></td>
					    <td width="152" valign="center" colspan="12" ><p >其中60周岁以上女性 </p></td>
					    <td width="64" valign="center" colspan="3" ><p >${peoplesummary.oldWomanCount } </p></td>
					  </tr>
					  <tr >
					    <td width="223" valign="center" colspan="5" ><p >老年人占比% &nbsp;&nbsp;&nbsp;&nbsp;${peoplesummary.oldPercent } </p></td>
					    <td width="153" valign="center" colspan="8" ><p >60周岁以上人数 </p></td>
					    <td width="80" valign="center" colspan="7" ><p >${peoplesummary.sixtyCount } </p></td>
					    <td width="152" valign="center" colspan="12" ><p >80周岁以上人数 </p></td>
					    <td width="64" valign="center" colspan="3" ><p >${peoplesummary.eightyCount } </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >独居老人 </p></td>
					    <td width="79" valign="center" colspan="3" ><p >${peoplesummary.aloneCount } </p></td>
					    <td width="93" valign="center" colspan="3" ><p >特困老人 </p></td>
					    <td width="60" valign="center" colspan="5" ><p >${peoplesummary.tkCount }</p></td>
					    <td width="80" valign="center" colspan="7" ><p >五保老人 </p></td>
					    <td width="51" valign="center" colspan="6" ><p >${peoplesummary.fiveCount } </p></td>
					    <td width="101" valign="center" colspan="6" ><p >三无老人 </p></td>
					    <td width="64" valign="center" colspan="3" ><p >${peoplesummary.threeCount} </p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >党员人口情况信息 </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >党员人数: </p></td>
					    <td width="79" valign="center" colspan="3" ><p >${peoplesummary.partyCount}  </p></td>
					    <td width="116" valign="center" colspan="7" ><p >其中：在册党员 </p></td>
					    <td width="83" valign="center" colspan="7" ><p >${peoplesummary.zcPartyCount}  </p></td>
					    <td width="181" valign="center" colspan="12" ><p >本居民区的在职党员 </p></td>
					    <td width="70" valign="center" colspan="4" ><p >${peoplesummary.localeZcPartyCount}  </p></td>
					  </tr>
					  <tr >
					    <td width="223" valign="center" colspan="5" ><p >党员志愿者总数 </p></td>
					    <td width="93" valign="center" colspan="3" ><p >${peoplesummary.partyVolunteerCount}  </p></td>
					    <td width="92" valign="center" colspan="9" ><p >其中在职 </p></td>
					    <td width="85" valign="center" colspan="8" ><p >${peoplesummary.zzpartyVolunteerCount}  </p></td>
					    <td width="110" valign="center" colspan="6" ><p >其中退休 </p></td>
					    <td width="70" valign="center" colspan="4" ><p >${peoplesummary.txpartyVolunteerCount} </p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >统战人口情况信息 </p></td>
					  </tr>
					  <tr >
					    <td width="223" valign="center" colspan="5" ><p >统战对象总人数 </p></td>
					    <td width="65" valign="center" colspan="2" ><p >${peoplesummary.tzCount} </p></td>
					    <td width="120" valign="center" colspan="11" ><p >民主党派人数 </p></td>
					    <td width="46" valign="center" colspan="2" ><p >${peoplesummary.peoplesummary} </p></td>
					    <td width="147" valign="center" colspan="11" ><p >台侨界人数 </p></td>
					    <td width="70" valign="center" colspan="4" ><p >${peoplesummary.tqjrs}  </p></td>
					  </tr>
					  <tr >
					    <td width="223" valign="center" colspan="5" ><p >新社会阶层人数 </p></td>
					    <td width="65" valign="center" colspan="2" ><p >${peoplesummary.newWorldCount}  </p></td>
					    <td width="120" valign="center" colspan="11" ><p >少数民族人数 </p></td>
					    <td width="194" valign="center" colspan="13" ><p >${peoplesummary.minimzCount}  </p></td>
					    <td width="70" valign="center" colspan="4" ><p >&nbsp;</p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >双拥人口情况信息 </p></td>
					  </tr>
					  <tr>
					    <td width="222" valign="center" colspan="4" ><p >优抚对象人数 </p></td>
					    <td width="93" valign="center" colspan="4" ><p >${peoplesummary.yfdxrs}  </p></td>
					    <td width="151" valign="center" colspan="14" ><p >其中：革命烈士遗属 </p></td>
					    <td width="40" valign="center" colspan="4" ><p >${peoplesummary.gmlsyzrs} </p></td>
					    <td width="96" valign="center" colspan="5" ><p >因公牺牲军人遗属 </p></td>
					    <td width="70" valign="center" colspan="4" ><p >${peoplesummary.jryzrs}  </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >重点优抚对对象人数 </p></td>
					    <td width="79" valign="center" colspan="2" ><p >${peoplesummary.zdyfdxrs} </p></td>
					    <td width="109" valign="center" colspan="5" ><p >现役军人家属 </p></td>
					    <td width="63" valign="center" colspan="7" ><p >${peoplesummary.xyjrjsrs}  </p></td>
					    <td width="72" valign="center" colspan="6" ><p >复员军人 </p></td>
					    <td width="40" valign="center" colspan="4" ><p >${peoplesummary.fyjrrs}  </p></td>
					    <td width="96" valign="center" colspan="5" ><p >病故军人遗属 </p></td>
					    <td width="70" valign="center" colspan="4" ><p >${peoplesummary.bgjryz} </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >结对包户对数 </p></td>
					    <td width="79" valign="center" colspan="2" ><p >&nbsp;${peoplesummary.jdbhds} </p></td>
					    <td width="154" valign="center" colspan="9" ><p >退伍军人 </p></td>
					    <td width="91" valign="center" colspan="9" ><p >${peoplesummary.twjr}  </p></td>
					    <td width="88" valign="center" colspan="5" ><p >残疾军人 </p></td>
					    <td width="117" valign="center" colspan="8" ><p >${peoplesummary.cjjr} </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >拥军优属服务小组数 </p></td>
					    <td width="79" valign="center" colspan="2" ><p >&nbsp;${peoplesummary.yjyzfwxz}</p></td>
					    <td width="154" valign="center" colspan="9" ><p >其它 </p></td>
					    <td width="91" valign="center" colspan="9" ><p >${peoplesummary.other} </p></td>
					    <td width="206" valign="center" colspan="13" ><p >&nbsp;</p></td>
					  </tr>
					  <tr >
					    <td width="189" valign="center" colspan="3" ><p >与何部队建立共建关系 </p></td>
					    <td width="100" valign="center" colspan="4" ><p >&nbsp;${peoplesummary.relation} </p></td>
					    <td width="94" valign="center" colspan="8" ><p >军属户数 </p></td>
					    <td width="97" valign="center" colspan="8" ><p >${peoplesummary.jshs} </p></td>
					    <td width="99" valign="center" colspan="7" ><p >烈属户数 </p></td>
					    <td width="93" valign="center" colspan="5" ><p >${peoplesummary.lshs}  </p></td>
					  </tr>
					  <tr >
					    <td width="189" valign="center" colspan="3" rowspan="2" ><p >复退伍人数 </p></td>
					    <td width="100" valign="center" colspan="4" ><p >2010年 </p></td>
					    <td width="94" valign="center" colspan="8" ><p >2011年 </p></td>
					    <td width="97" valign="center" colspan="8" ><p >2012年 </p></td>
					    <td width="99" valign="center" colspan="7" ><p >2013年 </p></td>
					    <td width="93" valign="center" colspan="5" ><p >2014年 </p></td>
					  </tr>
					  <tr >
					    <td width="100" valign="center" colspan="4" ><p >&nbsp;${peoplesummary.firstYear}</p></td>
					    <td width="94" valign="center" colspan="8" ><p >&nbsp;${peoplesummary.secondYear}</p></td>
					    <td width="97" valign="center" colspan="8" ><p >&nbsp;${peoplesummary.thirdYear}</p></td>
					    <td width="99" valign="center" colspan="7" ><p >&nbsp;${peoplesummary.forthYear}</p></td>
					    <td width="93" valign="center" colspan="5" ><p >&nbsp;${peoplesummary.currentYear}</p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >残疾人情况信息 </p></td>
					  </tr>
					  <tr >
					    <td width="189" valign="center" colspan="3" ><p >残疾人数: </p></td>
					    <td width="150" valign="center" colspan="9" ><p >${peoplesummary.cjrs} </p></td>
					    <td width="141" valign="center" colspan="12" ><p >其中：精神残疾人数 </p></td>
					    <td width="193" valign="center" colspan="11" ><p >${peoplesummary.jscjrs}</p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >计划生育情况信息 </p></td>
					  </tr>
					  <tr >
					    <td width="189" valign="center" colspan="3" ><p >育龄妇女数 </p></td>
					    <td width="150" valign="center" colspan="9" ><p >${peoplesummary.ylfnrs} </p></td>
					    <td width="141" valign="center" colspan="12" ><p >已婚育龄妇女数 </p></td>
					    <td width="193" valign="center" colspan="11" ><p >${peoplesummary.yhylfnrs} </p></td>
					  </tr>
					  <tr >
					    <td width="189" valign="center" colspan="3" ><p >出生数 </p></td>
					    <td width="150" valign="center" colspan="9" ><p >${peoplesummary.birthCount}</p></td>
					    <td width="141" valign="center" colspan="12" ><p >死亡数 </p></td>
					    <td width="193" valign="center" colspan="11" ><p >${peoplesummary.dieCount} </p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >低保人口情况 </p></td>
					  </tr>
					  <tr >
					    <td width="338" valign="center" colspan="11" ><p >低保对象 </p></td>
					    <td width="335" valign="center" colspan="24" ><p >${peoplesummary.dbcount} </p></td>
					  </tr>
					  <tr >
					    <td width="674" valign="center" colspan="35" ><p >群众文化团情况信息 </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >文体团队个 </p></td>
					    <td width="79" valign="center" colspan="3" ><p >${peoplesummary.wttd}  </p></td>
					    <td width="153" valign="center" colspan="8" ><p >文体团队人数 </p></td>
					    <td width="86" valign="center" colspan="8" ><p >${peoplesummary.wttdrs}  </p></td>
					    <td width="93" valign="center" colspan="6" ><p >群众团队 </p></td>
					    <td width="117" valign="center" colspan="8" ><p >${peoplesummary.qztd}  </p></td>
					  </tr>
					  <tr >
					    <td width="143" valign="center" colspan="2" ><p >社区志愿者队伍 </p></td>
					    <td width="79" valign="center" colspan="3" ><p >${peoplesummary.sqzyzdw} </p></td>
					    <td width="153" valign="center" colspan="8" ><p >社区志愿者人数 </p></td>
					    <td width="86" valign="center" colspan="8" ><p >${peoplesummary.sqzyzrs} </p></td>
					    <td width="211" valign="center" colspan="14" ><p > </p></td>
					  </tr>
					<!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~tr end~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
					<tr>
				</table>
					<div class="pagination" >
				<ul style="float: right;" id="b_pagination"></ul></div>
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/peoplesummary/check" method="post">
						  <div class="control-group">
    <label class="control-label" for="inputEmail">意见：</label>
    <div class="controls">
      <input type="text" name="remark"  class="input-xxlarge"  id="inputEmail" placeholder="请输入意见">

    </div>
  </div>
				<input type="hidden" name="businessFormId" value="${businessForm.id}">
				<input type="hidden" name="type" value="0" id="b_check_type">
								<button class="btn btn-primary"  type="submit"  id="b_check_pass"><i class="icon-ok-sign"></i>通过</button>
				<button class="btn btn-info" type="submit"  id="b_check_no_pass"><i class="icon-share-alt"></i>驳回</button>
				
				
				</form>
				</td>
			</tr></tbody>
		</table>
	</div>
	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/peoplesummary/check/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			$('#b_check_pass').on('click', function(){
			if(confirm("确定要通过审核？")){
			$('#b_check_type').val(1);
			  return true;
			}
				return false;
			});
			$('#b_check_no_pass').on('click', function(){
			if(confirm("确定要驳回审核？")){
			$('#b_check_type').val(2);
			 return true;	
				 }
		     return false;	
			});
			
		});
		parent.iFrameHeight();
		
	</script>
</body>
</html>