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
		<a class="btn  btn-primary " href="/sxsbmhsfc/${sxsbmhsfId}/activity/add">添加</a><span class="empty"></span>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">日期</th>
					<th width="15%">参与人数</th>
					<th width="15%">活动内容</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="activity" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${activity.time}</td>
						<td>${activity.count}</td>
						<td>${activity.content}</td>
						<td>
	<a href="/sxsbmhsfc/${sxsbmhsfId}/activity/update/${activity.id}/">修改</a><span class="empty"></span>
	<a href="/sxsbmhsfc/${sxsbmhsfId}/delete/${activity.id }/" class="b_delete_tyqndj_item">删除</a><span class="empty"></span>		
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
					'${pages}', '${count}', '/sxsbmhsfc'+'/'+'${sxsbmhsfId}'+'/activity/');
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