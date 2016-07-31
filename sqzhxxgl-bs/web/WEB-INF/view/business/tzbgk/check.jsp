<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="../../page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>

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
						<th width="20%">备注</th>
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
							<%-- <td><fmt:formatDate pattern='yyyy-MM-dd' value='${zcdygkItem.rdny }'/></td>
							<td>${zcdygkItem.bz }</td> --%>
						</tr>
					</c:forEach>
				</tbody>
				</table>
				<ul class="pagination" style="float: right;" id="b_pagination"></ul>
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/tzbgk/check" method="post">
				意见：<input name="remark" type="text" style="width: 200px"/>
				<input type="hidden" name="businessFormId" value="${businessForm.id}">
				<input type="hidden" name="type" value="0" id="b_check_type">
				<input type="submit" value="通过" id="b_check_pass"/><span class="empty"></span><input type="submit" value="驳回" id="b_check_no_pass"/>
				</form>
				</td>
			</tr>
		</table>
	</div>

	<script src="/scripts/jquery.min.js"></script>
	<script src="/scripts/bootstrap.min.js"></script>
	<script src="/scripts/jquery.validator.min.js"></script>
	<script src="/scripts/zh_CN.js"></script>
	<script src="/scripts/pagination.js"></script>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/tzbgk/check/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			$('#b_check_pass').on('click', function(){
				$('#b_check_type').val(1);
			});
			$('#b_check_no_pass').on('click', function(){
				$('#b_check_type').val(2);
			});
		});
	</script>
</body>
</html>