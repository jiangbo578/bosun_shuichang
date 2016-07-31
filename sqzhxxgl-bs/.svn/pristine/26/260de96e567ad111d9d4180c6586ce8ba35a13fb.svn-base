<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<a class="btn  btn-primary " href="/aidingwork/${aidingworkId}/aidingrecord/add">添加</a><span class="empty"></span>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">日期</th>
					<th width="15%">困难情况</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="aidingrecord" varStatus="num">
					<tr>
						<td>${num.count}</td>
						<td>${aidingrecord.date}</td>
						<td>${aidingrecord.tag}</td>
						<td>
	<a href="/aidingwork/${aidingworkId}/aidingrecord/update/${aidingrecord.id}/">修改</a><span class="empty"></span>
	<a href="/aidingwork/${aidingworkId}/delete/${aidingrecord.id }/" class="b_delete_tyqndj_item">删除</a><span class="empty"></span>		
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
		<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/aidingwork'+'/'+'${aidingworkId}'+'/aidingrecord/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_tyqndj_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>