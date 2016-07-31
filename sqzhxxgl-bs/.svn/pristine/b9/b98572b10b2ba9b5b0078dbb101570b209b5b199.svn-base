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
  <ul class="breadcrumb" style="margin-bottom: 5px;">
    <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/wsjf/list/1">卫生经费使用情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 卫生经费使用情况</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/wsjf/item/add" method="post">
   
			<table>
		
				
				<tr>
					<th>用途：</th>
					<td><input name="yt" type="text" data-rule="required;chinese"/>
					</td>
				</tr>
				<tr>
					<th>金额：</th>
					<td><input name="price" type="text" data-rule="required;number" />
					</td>
				</tr>
				<tr>
					<th>使用日期：</th>
					<td><input name="syrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate"/>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
				</tr>
			</table>
		</form>
	</div>


	</div>
</div>
<script src="/scripts/business/wsjf.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>