<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<title>添加</title>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
 <li><a href="/taizhang/list/1">基础信息</a> <span class="divider">/</span></li>
    <li><a href="/peoplesummary/list/1">人口情况表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 人口情况表</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/peoplesummary/item/add" method="post">
			<table class="table table-striped table-bordered table-hover">
				<!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~tr start~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
				
				 <tr >
				    <th ><p >辖区总户数 </p></th>
				    <td ><p><input type="text" style="width: 80px;" data-rule="required:digits;" name="xqzhs"></p></td>
				    <th ><p >其中:户籍人口户数 </p></th>
				    <td ><p ><input type="text" style="width: 80px;" data-rule="required:digits;"  name="hjrkhs"></p></td>
				  </tr>
				  <tr >
				 	<th ><p >租借房屋户数 </p></th>
				    <td ><p > <input type="text" style="width: 80px;" data-rule="required:digits;" name="zjfwhs"></p></td>
				    <th><p >实有人口总数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="syrkzs"></p></td>
				  </tr>
				   <tr >
				    <th ><p >其中：男性 </p></th>
				    <td  ><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="manCount"> </p></td>
				    <th ><p >女性 </p></th>
				    <td><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="womanCount"> </p></td>
				  </tr>
				  <tr >
				    <th><p >其中:户籍人口数 </p></th>
				    <td><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="hjrks"> </p></td>
				    <th><p >其中外来人口 </p></th>
				    <td ><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="outcome"></p></td>
				  </tr>
				  <tr>
				 	 <th ><p >来沪租赁房屋人数 </p></th>
				    <td><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="lhzlfwrs"> </p></td>
				 	 <th><p >办居住证 </p></th>
				    <td  ><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="residencePermit"> </p></td>
				  </tr>
				   <tr>
				    <th  ><p >农业人口（村） </p></th>
				    <td  ><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="nyrk"></p></td>
				    <th ><p >非农人口（村） </p></th>
				    <td   ><p ><input type="text" style="width: 80px;" data-rule="required:digits;" name="fnyrk"></p></td>
				  </tr>
				  <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~2~~~~~~~~~~~~~~~~~~~~~~~~~ -->
			</table>
				<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">妇女工作及老龄工作人口情况信息<i style="cursor: pointer;float: right;" onclick="swap('tb1');" class="icon-list">&nbsp;&nbsp;</i> </p></div>
				<table class="table table-striped table-bordered table-hover" id="tb1" style="display: none;">
				<!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~tr start~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
				<tr>
					<th><p >0-3岁儿童数 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="zeroThreeCount" data-rule="required:digits;"> </p></td>
				    <th><p >4-18岁儿童数 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="minorCount" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >其中4-18儿童女性数 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="minorFemaleCount" data-rule="required:digits;"></p></td>
					<th><p>19-59岁妇女数 </p></th>
				    <td><p><input type="text" style="width: 80px;" name="fvs" data-rule="required:digits;"> </p></td>
				</tr>
				<tr>
					<th><p >老年人总数</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="oldCount" data-rule="required:digits;"> </p></td>
				    <th><p >其中60周岁以上男性 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="oldManCount" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >其中60周岁以上女性 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="oldWomanCount" data-rule="required:digits;"></p></td>
					<th><p >老年人占比%</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="oldPercent" > </p></td>
				</tr>
				<tr>
				    <th><p >60周岁以上人数 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="sixtyCount" data-rule="required:digits;"></p></td>
				    <th><p >80周岁以上人数</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="eightyCount" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >独居老人</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="aloneCount" data-rule="required:digits;"> </p></td>
				    <th><p >特困老人 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="tkCount" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >五保老人</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="fiveCount" data-rule="required:digits;"> </p></td>
				    <th><p >三无老人 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="threeCount" data-rule="required:digits;"></p></td>
				</tr>
				  <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~2~~~~~~~~~~~~~~~~~~~~~~~~~ -->
			</table>
			
			
			<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">党员人口情况信息<i style="cursor: pointer;float: right;" onclick="swap('tb2');" class="icon-list">&nbsp;&nbsp;</i> </p></div>
			<table class="table table-striped table-bordered table-hover" id="tb2" style="display: none;">
				<tr>
					<th><p >党员人数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="partyCount" data-rule="required:digits;"> </p></td>
				    <th><p >其中：在册党员 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="zcPartyCount" data-rule="required:digits;"></p></td>
				    
				</tr>
				<tr>
					<th><p >本居民区的在职党员 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="localeZcPartyCount" data-rule="required:digits;"></p></td>
					<th><p >党员志愿者总数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="partyVolunteerCount" data-rule="required:digits;"> </p></td>
				</tr>
				<tr>
				    <th><p >其中在职 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="zzpartyVolunteerCount" data-rule="required:digits;"></p></td>
				    <th><p >其中退休 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="txpartyVolunteerCount" data-rule="required:digits;"></p></td>
				</tr>
			</table>
			<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">统战人口情况信息<i style="cursor: pointer;float: right;" onclick="swap('tb3');" class="icon-list">&nbsp;&nbsp;</i> </p></div>
			<table class="table table-striped table-bordered table-hover" id="tb3" style="display: none;">
				<tr>
					<th><p >统战对象总人数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="tzCount" data-rule="required:digits;"> </p></td>
				    <th><p >民主党派人数</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="mzdprs" data-rule="required:digits;"></p></td>
				    
				</tr>
				<tr>
					<th><p >台侨界人数 </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="tqjrs" data-rule="required:digits;"></p></td>
					<th><p >新社会阶层人数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="newWorldCount" data-rule="required:digits;"> </p></td>
				</tr>
				<tr>
				    <th><p >少数民族人数 </p></th>
				    <td colspan="3"><p ><input type="text" style="width: 80px;" name="minimzCount" data-rule="required:digits;"></p></td>
				</tr>
			</table>
				<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">双拥人口情况信息<i style="cursor: pointer;float: right;" onclick="swap('tb4');" class="icon-list">&nbsp;&nbsp;</i> </p></div>
			<table class="table table-striped table-bordered table-hover" id="tb4" style="display: none;">
				<tr>
					<th><p >优抚对象人数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="yfdxrs" data-rule="required:digits;"> </p></td>
				    <th><p >其中：革命烈士遗属</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="gmlsyzrs" data-rule="required:digits;"></p></td>
				   
				</tr>
				<tr>
					<th><p >因公牺牲军人遗属</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="jryzrs" data-rule="required:digits;"></p></td>
					<th><p >重点优抚对对象人数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="zdyfdxrs" data-rule="required:digits;"> </p></td>
				    
				</tr>
				<tr>
					<th><p >现役军人家属</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="xyjrjsrs" data-rule="required:digits;"></p></td>
				    <th><p >复员军人</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="fyjrrs" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >病故军人遗属</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="bgjryz" data-rule="required:digits;"></p></td>
					<th><p >结对包户对数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="jdbhds" data-rule="required:digits;"> </p></td>
				    
				</tr>
				<tr>
  					<th ><p >退伍军人</p></th>
				    <td ><p ><input type="text" style="width: 80px;" name="twjr" data-rule="required:digits;"></p></td>
				    <th><p >残疾军人</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="cjjr" data-rule="required:digits;"></p></td>
  				</tr>
				<tr>
					<th><p >拥军优属服务小组数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="yjyzfwxz" data-rule="required:digits;"> </p></td>
				    <th><p >其它</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="other" data-rule="required:digits;"></p></td>
				</tr>
				
				<tr>
					<th ><p >与何部队建立共建关系: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="relation" data-rule="required:digits;"> </p></td>
				    <th ><p >军属户数</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="jshs" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >烈属户数</p></th>
				    <td ><p ><input type="text" style="width: 80px;" name="lshs" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th colspan="4"><p >复退伍人数: </p></th>
				</tr>
				
				<tr>
					 <th><p >2010年 </p></th>
					<th ><input type="text" style="width: 80px;" name="firstYear" data-rule="required:digits;"></th>
					 <th><p >2011年</p></th>
					<td><p ><input type="text" style="width: 80px;" name="secondYear" data-rule="required:digits;"> </p></td>
				</tr>
				<tr>
					<th><p >2012年</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="thirdYear" data-rule="required:digits;"> </p></td>
				    <th><p >2013年</p></th>
				    <th><p ><input type="text" style="width: 80px;" name="forthYear" data-rule="required:digits;"> </p></th>
				</tr>
				<tr>
				    <th><p >2014年</p></th>
				    <th colspan="3"><p ><input type="text" style="width: 80px;" name="currentYear" data-rule="required:digits;"> </p></th>
				</tr>
			</table>
			
			<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">残疾人情况信息
				<i style="cursor: pointer;float: right;" onclick="swap('tb5');" class="icon-list">&nbsp;&nbsp;</i> 
				</p>
			</div>
			<table class="table table-striped table-bordered table-hover" id="tb5" style="display: none;">
				<tr>
					<th><p >残疾人数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="cjrs" data-rule="required:digits;"> </p></td>
				    <th><p >其中：精神残疾人数</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="jscjrs" data-rule="required:digits;"></p></td>
				</tr>
			</table>
			<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">计划生育情况信息
				<i style="cursor: pointer;float: right;" onclick="swap('tb6');" class="icon-list">&nbsp;&nbsp;</i> 
				</p>
			</div>
			<table class="table table-striped table-bordered table-hover" id="tb6" style="display: none;">
				<tr>
					<th><p >育龄妇女数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="ylfnrs" data-rule="required:digits;"> </p></td>
				    <th><p >已婚育龄妇女数:</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="yhylfnrs" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >出生数: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="birthCount" data-rule="required:digits;"> </p></td>
				    <th><p >死亡数:</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="dieCount" data-rule="required:digits;"></p></td>
				</tr>
			</table>
			<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">低保人口情况 
				<i style="cursor: pointer;float: right;" onclick="swap('tb7');" class="icon-list">&nbsp;&nbsp;</i> 
				</p>
			</div>
			<table class="table table-striped table-bordered table-hover" id="tb7" style="display: none;">
				<tr>
					<th><p >低保对象: </p></th>
				    <td><p ><input type="text" style="width: 350px;" name="dbcount" data-rule="required:digits;"> </p></td>
				</tr>
			</table>
			
			
			<div><p style="margin-bottom: 0px;" class="alert alert-success alert-dismissable">群众文化团情况信息
				<i style="cursor: pointer;float: right;" onclick="swap('tb8');" class="icon-list">&nbsp;&nbsp;</i> 
				</p>
			</div>
			
				<table class="table table-striped table-bordered table-hover" id="tb8" style="display: none;">
				<tr>
					<th><p >文体团队个: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="wttd" data-rule="required:digits;"> </p></td>
				    <th><p >文体团队人数:</p></th>
				    <td><p ><input type="text" style="width: 80px;" name="wttdrs" data-rule="required:digits;"></p></td>
				</tr>
				<tr>
					<th><p >群众团队: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="qztd" data-rule="required:digits;"> </p></td>
					<th><p >社区志愿者队伍: </p></th>
				    <td><p ><input type="text" style="width: 80px;" name="sqzyzdw" data-rule="required:digits;"> </p></td>
				</tr>
				<tr>
				    <th><p >社区志愿者人数:</p></th>
				    <td colspan="3"><p ><input type="text" style="width: 120px;" name="sqzyzrs" data-rule="required:digits;"></p></td>
				</tr>
			</table>
				<div style="margin-left: 40%;">
					<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
					<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
				</div>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>
