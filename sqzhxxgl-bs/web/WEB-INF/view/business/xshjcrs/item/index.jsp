<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="../../../page/head.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<a href="/xshjcrs/item/add/${businessFormId }">添加</a><span class="empty"></span>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">出生年月</th>
					<th width="10%">身份证</th>
					<th width="10%">文化程度</th>
					<th width="15%">家庭住址</th>
					<th width="5%">民族</th>
					<th width="5%">职务职称</th>
					<th width="5%">头衔荣誉、社会地位</th>
					<th width="5%">工作单位</th>
					<th width="5%">联系电话</th>
					<th width="15%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="xshjcrsItem" varStatus="num">
					<tr>
						<td>${num.count }</td>
						<td>${xshjcrsItem.xm }</td>
						<td>${xshjcrsItem.xb }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${xshjcrsItem.csny }'/></td>
						<td>${xshjcrsItem.idcard }</td>
						<td>${xshjcrsItem.whcd }</td>
						<td>${xshjcrsItem.jtzz }</td>
						<%-- <td><fmt:formatDate pattern='yyyy-MM-dd' value='${xshjcrsItem.rdny }'/></td>--%>
						<td>${xshjcrsItem.mz }</td>
						<td>${xshjcrsItem.zwzc }</td>
						<td>${xshjcrsItem.rydw }</td>
						<td>${xshjcrsItem.gzdw }</td>
						<td>${xshjcrsItem.phone }</td> 
						<td>
							<a href="/xshjcrs/item/update/${xshjcrsItem.id }/${businessFormId }">修改</a><span class="empty"></span>
							<a href="/xshjcrs/item/delete/${xshjcrsItem.id }/${businessFormId }" class="b_delete_xshjcrs_item">删除</a><span class="empty"></span>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<ul class="pagination" style="float: right;" id="b_pagination"></ul>
	</div>
	<script src="/scripts/jquery.min.js"></script>
	<script src="/scripts/bootstrap.min.js"></script>
	<script src="/scripts/dialog.js"></script>
	<script src="/scripts/pagination.js"></script>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/xshjcrs/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_xshjcrs_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>