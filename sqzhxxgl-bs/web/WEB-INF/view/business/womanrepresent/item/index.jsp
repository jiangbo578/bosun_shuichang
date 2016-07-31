<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
   <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/womanrepresent/list/1">妇女代表名单</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="womanrepresent:add">
		  <a style="float: right" href="/womanrepresent/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/womanrepresent/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		  <shiro:hasPermission name="womanrepresent:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/womanrepresent/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">职务</th>
					<th width="10%">出生年月</th>
					<th width="10%">任职时间</th>
					<th width="5%">民族</th>
					<th width="5%">文化程度</th>
					<th width="15%">家庭住址</th>
					
					<th width="10%">电话</th>
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="womanrepresent" varStatus="num">
					<tr>
						<td>${num.count}</td>
						<td>${womanrepresent.xm}<c:if test="${womanrepresent.duty !=null}"><IMG title="担任村民小组、楼组长" src="<%=path %>/styles/images/rightIcon.png"></c:if></td>
						<td>${womanrepresent.xb}</td>
						<td>
						<c:choose>
							<c:when test="${womanrepresent.duty == ''}">无</c:when>
							<c:otherwise>${womanrepresent.duty}</c:otherwise>
						</c:choose>   </td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${womanrepresent.csny }'/></td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${womanrepresent.rzsj }'/></td>
						<td>${womanrepresent.mz}</td>
						<td>${womanrepresent.whcd}</td>
						<td>${womanrepresent.jtzz}</td>
						<td>${womanrepresent.phone}</td>
						
					<td>
							<div class="btn-group">
							<shiro:hasPermission name="womanrepresent:update">
							<a  class="btn " href="/womanrepresent/item/update/${womanrepresent.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="womanrepresent:delete">
							<a class="btn  b_delete_item" href="/womanrepresent/item/delete/${womanrepresent.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	</div>

  </div>

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/womanrepresent/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>