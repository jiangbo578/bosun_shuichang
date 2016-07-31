<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="../../../page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>

	<div class="container">
		<form action="/xshjcrs/item/add" method="post">

			<table>
				<tr>
					<th>搜索，请输入姓名或身份证号码：</th>
					<td><input type="text" id="b_search"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;chinese" id="xm"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny"/>
					</td>
				</tr>
				<tr>
					<th>身份证：</th>
					<td><input name="idcard" type="text" data-rule="required;ID_card" id="idcard"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text" id="whcd"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text" id="jtzz"/>
					</td>
				</tr>
				<tr>
					<th>民族：</th>
					<td><input name="mz" type="text" id="mz"/>
					</td>
				</tr>
				<tr>
					<th>荣耀，社会地位：</th>
					<td><input name="rydw" type="text" id="rydw"></input>
					</td>
				</tr>
				<tr>
					<th>职务职称：</th>
					<td><input name="zwzc" type="text" id="zwzc"></input>
					</td>
				</tr>
				<tr>
					<th>工作单位：</th>
					<td><input name="gzdw" type="text" id="gzdw"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone"></input>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><input type="submit" value="保存" />
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	<script src="/scripts/jquery.min.js"></script>
	<script src="/scripts/bootstrap.min.js"></script>
	<script src="/scripts/jquery.validator.min.js"></script>
	<script src="/scripts/zh_CN.js"></script>
	<script src="/zui/datepicker/WdatePicker.js"></script>
	<script src="/scripts/business/xshjcrs.js"></script>
</body>
</html>