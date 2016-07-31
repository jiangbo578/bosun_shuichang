<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/scripts/tab/tab.css" type="text/css"></link>
<script src="/styles/js/baes.js"></script>
	<script>
	   function submitByBusiness(url) {
			location.href=url;		    
		}
		
	</script>
<title>600分评级</title>
</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/kpxt/index"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">600分评级</a> <span class="divider">/</span></li>
    <li class="active">街镇提交的600分历史记录</li>
  </ul>
   <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>街镇提交的600分历史记录</strong></div>
   	<div class="mianpan">
	  <div id="panbody">
		<div class="container">
  	<div class="tabbox" >
  <ul class="tabbtn">
 
  			<c:forEach var="assess" items="${assess}">
  				<li  <c:if test="${assessId eq assess.id }">class="current"</c:if> >
				<span style="width: 100px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/kpxt/item/findjl?assessId=${assess.id}&orgid=${orgid}');">${assess.name }
				</span>
			</li>
  			</c:forEach>
		</ul>
	<br>
	
	<input type="hidden" value="${assessId}" id="assessId">
	<table class="table table-striped table-bordered table-hover"  style="width: 100%" >
	      <c:set value="0" var="sum"></c:set>
			<c:forEach var="znNames" items="${znNames}" >
  				 <tr >    
	               		<th scope="col" colspan="8">
	               			<div align="center" class="alert alert-success alert-dismissable">评级职能部门：${znNames.name }
</div>
	                	</th> 
         	 	 </tr>    
         	 	<c:forEach var="khxm" items="${khxmlist}">
         	       
 	          <c:if test="${znNames.id eq khxm.znbmId }">
         	 	 <tr >    
	               		<th scope="col"  style="text-align: center;">考核项目</th> 
	               		<th scope="col" >项目总得分</th> 
	               		<th scope="col"  >镇级相关意见</th> 
	               		<th scope="col"  colspan="2" style="text-align: center;">区级相关部门复核</th> 
	               		<input type="hidden" name="khxmID" value="${khxm.id }" />
         	 	 </tr> 
         	 	<tr >    
	               		<th scope="col" style="text-align: center;color: red;font-size: 15px">${khxm.project}(总分：${khxm.allScore })</th> 
	               		 <c:set value="${sum+khxm.projectScore}" var="sum"></c:set> 
	               		<th scope="col" >${khxm.projectScore}</th> 
	               		<th scope="col" >${khxm.zznb_check}</th> 
	               		
	               		<th scope="col"  colspan="3" style="text-align: center;">${khxm.checkScore }</th> 
         	 	 </tr> 
         	 	
				<tr>
					
					<th width="25%">类别</th>
					<th width="10%" style="color: #BEBEBE">2013年末数</th>
					<th width="10%">2014年末数</th>
					<th width="10%" style="color: #BEBEBE">街镇审核数据情况</th>
					<th width="7%" style="color: #BEBEBE">单项扣分</th>					
				</tr>
					<c:forEach items="${list}" var="list" varStatus="num">
					
						<c:if test="${khxm.mbid eq list.assessTemplate.id}">
									<tr>
										
										<td>${list.type}</td>
										<td><b>${list.oldCount}</b></td>								
										<td <c:if test="${list.hold==0}">style="background: #F0F0F0"</c:if>>${list.count}</td>
										<td style="color: #BEBEBE"><b>${list.jzCount}</b></td>
										<td style="color: #BEBEBE"><b>${list.typeKF }</b></td>
										<input type="hidden" name="khlbID" value="${list.id }" />										
									</tr>
						</c:if>
					</c:forEach>
					   </c:if>
					 
					</c:forEach>
  			</c:forEach>

					<span style="padding-left: 30px;">
					<input type="text"  id="date" onClick="WdatePicker({dateFmt:'yyyy'})" value="2014" class="Wdate" style="width: 100px;"> 
							&nbsp;&nbsp;&nbsp; 
					 </span>
					 <span style="position: absolute;">
						<a class="btn " type="button"  onclick="fh()"><i class="icon-chevron-left"></i>返回</a>
					 </span>
					
					<c:if test="${sum>0}">
			      <span style="float: right;"><b>总得分:<fmt:formatNumber value="${sum}" pattern="#.00"/>  <br/></b></span>
			</c:if>
	</table>
		 <input type="hidden" value="${orgid}" id="orgid"/>
	
</div>
</div>
</div>
<script type="text/javascript">
function fh(){
	window.location.href='/kpxt/item/findkp?id=${orgid}';
}
</script>
</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>	
</body>
</html>