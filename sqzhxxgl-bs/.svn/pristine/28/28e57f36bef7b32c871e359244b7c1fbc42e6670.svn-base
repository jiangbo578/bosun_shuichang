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
		<a href="/tzbgk/item/add/${businessFormId }">添加</a><span class="empty"></span>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">出生年月</th>
					<th width="15%">家庭住址</th>
					<th width="5%">民族</th>
					<th width="5%">政治面貌</th>
					<th width="10%">团内职务</th>
					<th width="15%">工作单位</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="tzbgkItem" varStatus="num">
					<tr>
						<td>${num.count }</td>
						<td>${tzbgkItem.xm }</td>
						<td>${tzbgkItem.xb }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${tzbgkItem.csny }'/></td>
						<td>${tzbgkItem.jtzz }</td>
						<td>${tzbgkItem.mz }</td>
						<td>${tzbgkItem.zzmm }</td>
						<td>${tzbgkItem.tnzw }</td>
						<td>${tzbgkItem.gzdw }</td>
						<td>
							<a href="/tzbgk/item/update/${tzbgkItem.id }/${businessFormId }">修改</a><span class="empty"></span>
							<a href="/tzbgk/item/delete/${tzbgkItem.id }/${businessFormId }" class="b_delete_tzbgk_item">删除</a><span class="empty"></span>
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
					'${pages}', '${count}', '/tzbgk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_tzbgk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>