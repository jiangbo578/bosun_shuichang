<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="../../page/head.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<shiro:hasPermission name="xshjcrs:add">    
			<a href="/xshjcrs/add">添加</a>    
		</shiro:hasPermission>   
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="8%">序号</th>
					<th width="15%">标题</th>
					<th width="15%">最近更新</th>
					<th width="15%">生成来源</th>
					<th width="15%">流程状态</th>
					<th width="15%">审核意见</th>
					<th width="47%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="businessForm" varStatus="num">
					<tr>
						<td>${num.count }</td>
						<td>${businessForm.name }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd HH:mm:ss' value='${empty businessForm.updateDate ? businessForm.insertDate : businessForm.updateDate}'/></td>
						<td>${businessForm.sysCreate ? '系统生成' : '手工生成' }</td>
						<td>${businessForm.processStatus}</td>
						<td>${businessForm.remark}</td>
						<td>
							<shiro:hasPermission name="xshjcrs:update">   
							<a href="/xshjcrs/update/${businessForm.id }">修改</a><span class="empty"></span>
							</shiro:hasPermission>   
							<shiro:hasPermission name="xshjcrs:delete">   
							<a href="/xshjcrs/delete/${businessForm.id }" class="b_delete_xshjcrs">删除</a><span class="empty"></span>
							</shiro:hasPermission>   
							<a href="/xshjcrs/item/${businessForm.id }">名单</a><span class="empty"></span>
							<c:if test="${businessForm.processStatus != '书记审核'}">
								<a href="/xshjcrs/submit/${businessForm.id }" class="b_submit_xshjcrs">提交审核</a><span class="empty"></span>
							</c:if>
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
					'${pages}', '${count}', '/xshjcrs/');
			$('#b_pagination').html(pagination.show());

			$('.b_delete_xshjcrs').on('click', function() {
				var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?', true);
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

			$('.b_submit_xshjcrs').on('click', function() {
				var submit_dialog = buguDialog.init('审核确认', '确认要提交审核吗?', true);
				submit_dialog.setHref(this.href);
				submit_dialog.show();
				return false;
			});
		});
	</script>
</body>
</html>