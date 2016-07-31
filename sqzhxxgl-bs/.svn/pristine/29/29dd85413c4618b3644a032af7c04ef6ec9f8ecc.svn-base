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
		<form action="/tzbgk/update" method="post">

			<table>
				<tr>
					<th>标题：</th>
					<td><input name="name" type="text" data-rule="required;" value="${businessForm.name }"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><input type="submit" value="保存" />
					<input type="hidden" name="id" value="${businessForm.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	<script src="/scripts/jquery.min.js"></script>
	<script src="/scripts/bootstrap.min.js"></script>
	<script src="/scripts/jquery.validator.min.js"></script>
	<script src="/scripts/zh_CN.js"></script>
</body>
</html>