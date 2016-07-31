<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<title>添加</title>
</head>
<body>
  
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 联系服务群众走访团队名册</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/lxfwqzzf/item/zl/add" method="post">
   
			<table>
			<tr>
					<th>姓名：</th>
					<td><input type="text" name="xm" data-rule="required;chinese;length[1~4]"/>
					</td>
					<th style="padding-left: 80px">职务：</th>
					<td><input type="text" name="zw"  data-rule="required;length[1~20];" /></td>
				</tr>
				<tr>
					<th>联系方式：</th>
					<td><input type="text" name="lxfs"  data-rule="required:mobile;"/>
					</td>
					<th style="padding-left: 80px">备注：</th>
					<td><input type="text" name="bz" data-rule="required;"  /></td>
				</tr>
			
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="flid" value="${flid}" />
				</tr>
			</table>
		</form>
	</div>


	</div>
</div>
<script src="/scripts/business/lxfwqzzf.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>