<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
  <ul class="breadcrumb" style="margin-bottom: 5px;">
    <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/srhwqk/list/1">嘉定区镇村市容环卫情况调查表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 嘉定区镇村市容环卫情况调查表</div>
  <div id="panbody">
	<div class="container">
		<form action="/srhwqk/item/update" method="post">

			<table>
				
				<tr>
					
					<th >农厕整治数量：</th>
					<td><input name="nczzsl" type="text" data-rule="required;" value="${srhwqk.nczzsl}"/></td>
				</tr>
				
			    <tr>
					<th>农厕整治形式：</th>
					<td><input name="nczzxs" type="text" data-rule="required;" value="${srhwqk.nczzxs}"/>
					</td>
				
				</tr>
				
			 
			
				<tr>
					
					<th >乱设摊数量：</th>
					<td><input name="lstzzsl" type="text" data-rule="required;" value="${srhwqk.lstzzsl}"/></td>
				</tr>
				
			   
				<tr>
					
					<th >“三乱”小广告数量：</th>
					<td><input name="sltzzsl" type="text" data-rule="required;" value="${srhwqk.sltzzsl}"/></td>
				</tr>
				
			  
				<tr>
				
					<th >私设卸点数量：</th>
					<td><input name="sstzzss" type="text" data-rule="required;" value="${srhwqk.sstzzss}"/></td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${srhwqk.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	
</body>
</html>