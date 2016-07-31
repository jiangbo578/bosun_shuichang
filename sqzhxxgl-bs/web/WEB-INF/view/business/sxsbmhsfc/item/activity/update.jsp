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
		<form action="/sxsbmhsfc/${sxsbmhsfcId}/activity/update/" method="post">
			<table>
				<tr>
					<th>日期：</th>
					<td><input name="time" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${activity.time }"/>
					</td>
				</tr>
				
				<tr>
					<th>参与人数：</th>
					<td><input name="count" type="text" data-rule="required;" value="${activity.count }"/>
					</td>
				</tr>
				
				
				<tr>
					<th>活动内容：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="content">${activity.content }</textarea>
					</td>
				</tr>
					
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
					<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="id" value="${activity.id }">
				</tr>
			</table>
		</form>
	</div>


	<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
		});
	</script>
</body>
</html>