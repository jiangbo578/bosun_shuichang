<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页----嘉定区村居社会管理信息系统</title>
<meta name="keywords" content="嘉定区村居社会管理信息系统"></meta>

 <jsp:include page="/page/head.jsp"></jsp:include>
 <link rel="stylesheet" href="/scripts/tab/tab.css" type="text/css"></link>
</head>
<body>  

<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/kpxt/index"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">600分评级</a> <span class="divider">/</span></li>
   
  </ul>
  <shiro:hasAnyRoles name="ganshi">
  <div style=" position:relative;float:left;border: 1px solid #000099; margin-top:0px; margin-left:10px; width:60%;border-color:#0099cc;">
			<table>
				<tr>
					<td colspan="3" background="../../../styles/images/bg.gif" bgcolor="#FFFFFF"  style="padding-left: 20px"><strong>被驳回的600分评级</strong></td>
				</tr>
				<tr class="InternalHeader">
					<td width="165" bgcolor="#FFFFFF" style="padding-left: 20px">项目</td>
					<td width="135" bgcolor="#FFFFFF">总计</td>
				</tr>				
				<c:forEach items="${list}" var="khxm">
				<tr>
				<c:set value="0" var="sum"></c:set>
					<td  style="padding-left: 20px">${khxm.project}</td>
					<c:forEach items="${khlb}" var="khlb" varStatus="num">					
					<c:if test="${khlb.assessTemplate.id eq khxm.mbid}">
					  <c:set value="${sum+1}" var="sum"></c:set>
					</c:if>					
					</c:forEach>
				 <td><b><font color="red">${sum}</font></b> 条</td>
				</tr>
				</c:forEach>				
				</tr>
			</table>
		</div>
		 </shiro:hasAnyRoles>

		 <shiro:hasAnyRoles name="shejianban,nongwei">
		 		  <div class="tabbox" >
		<ul class="tabbtn">
			<li  <c:if test="${mark eq '1' }">class="current"</c:if> >
				<span style="width: 100px;border-right:solid 1px #d5d5d5;" onclick="tz('1');">居委会汇总
				</span>
			</li>
				<li  <c:if test="${mark eq '2' }">class="current"</c:if> >
				<span style="width: 100px;border-right:solid 1px #d5d5d5;" onclick="tz('2');">村委会汇总
				</span>
			</li>
		</ul>
		<div class="container" >
	
       <a style="float: right;margin-right: 31px;padding-left: 10px" href="/kpxt/item/export?mark=${mark}" class="btn btn-info"><i class="icon-print"></i>导出</a>
					
						<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				
				<tr>
				<c:if test="${mark eq '1' }">
				    <th width="5%">序号</th>
					<th width="15%">名称</th>
					<th width="7%">社会治安</th>
					<th width="7%">公共安全</th>
					<th width="7%">住宅管理</th>
					<th width="7%">社区环境</th>
					<th width="7%">民主自治</th>
					<th width="7%">人口管理</th>
					<th width="10%">建议评级</th>
					<th width="7%">操作</th>
			</c:if>
			 <c:if test="${mark eq '2' }">
                    <th width="5%">序号</th>
					<th width="15%">名称</th>
					<th width="7%">社会治安</th>
					<th width="7%">公共安全</th>
					<th width="10%">违法用地和建筑</th>
					<th width="10%">农村生产环境</th>
					<th width="7%">三资管理</th>
					<th width="10%">人口管理</th>
					<th width="10%">建议评级</th>
					<th width="7%">操作</th>
             </c:if> 
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${score}" var="score" varStatus="num">
					<tr>
						<td>${num.count}</td>
						<td>${score.zhen}->${score.name}</td>
						<td>${score.s2}</td>
						<td>${score.s1}</td>
						<td>${score.s3}</td>
						<td>${score.s6}</td>
						<td>${score.s5}</td>
						<td>${score.s4}</td>
						<td>${score.pj}</td>
						<td>
								<div class="btn-group">
						   
							<a  class="btn " href="#"><i class="icon-pencil"></i>修改</a>
						
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			
		</div>
		<!-- tab content end -->
	</div>
  			</shiro:hasAnyRoles>
	
<script >
function sub(id){
	location.href="/kpxt/item/sjb?id="+id;
}
$(document).ready( function() {
    $("a.trace_show").toggle( function() {
    	//$("i.icon-plus").addClass("icon-minus");
    	
    	 $(this).parent().next("table").show('fast');
    }, function() {
    	//alert($("i.icon-plus").val())
    	//$("i.icon-plus").addClass("icon-plus");
    	 $(this).parent().next("table").hide('slow');
    });
});
function tz(mark){
	//alert(mark)
	window.location.href="/kpxt/index?mark="+mark;
}
parent.changeheight(document.body.offsetHeight);
</script>

</body>
</html>


