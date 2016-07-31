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
		<form action="/aidingwork/${aidingworkId}/aidingrecord/update/" method="post">
			<table>
				<tr>
					<th>日期：</th>
					<td><input name="date" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${aidingrecord.date }"/>
					</td>
				</tr>
				<tr>
					<th>详情：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="tag"  data-rule="required;length[1~150];"> ${aidingrecord.tag }</textarea>
					
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				<input type="hidden" name="id" value="${aidingrecord.id }">
				</tr>	
			</table>
		</form>
	</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			$('input[type=radio][value=${aidingwork.xb}]').attr('checked', true);
		});
	</script>
</body>
</html>