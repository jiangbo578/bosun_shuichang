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
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 村委社会单位（场所）底册</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/dwdc/item/many/add" method="post">
   
			<table>
			<tr>
					<th>层数：</th>
					<td><input type="text" name="cs" data-rule="required;"/>
					</td>
					
				</tr>
				<tr>
					<th>面积：</th>
					<td><input type="text" name="mj"  data-rule="required;"/>
					</td>
					
				</tr>
				<tr>
					<th>性质：</th>
					<td><input type="text" name="xz"  data-rule="required;"/>
					</td>
					
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