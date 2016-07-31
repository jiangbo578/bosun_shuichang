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
		<form action="/xshjcrs/add" method="post">

			<table>
				<tr>
					<th>标题：</th>
					<td><input name="name" type="text" data-rule="required;" style="width: 200px" id="name"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><input type="submit" value="保存" />
					</td>
				</tr>
			</table>
		</form>
	</div>

	<script src="/scripts/jquery.min.js"></script>
	<script src="/scripts/bootstrap.min.js"></script>
	<script src="/scripts/jquery.validator.min.js"></script>
	<script src="/scripts/zh_CN.js"></script>
	<script>
	$(function(){
		var myDate = new Date();
		$('#name').val('小区新社会阶层人士名单('+myDate.getFullYear()+')');
		
		var message = '${message}';
		if(message != ''){
			alert(message);
		}
	});
	</script>
</body>
</html>