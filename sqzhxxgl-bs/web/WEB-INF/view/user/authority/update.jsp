<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>
<ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/authority/1/null">权限列表</a> <span class="divider">/</span></li>

    <li class="active">编辑</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>权限列表编辑</strong> 
  
   
  </div>
	<div class="container">
		<form action="/authority/update" method="post">

			<table>
				<tr>
					<th>名称：</th>
					<td><input name="name" type="text" data-rule="required;" style="width: 200px" value="${authority.name }"/>
					</td>
				</tr>
				<tr>
					<th>标识：</th>
					<td><input name="code" type="text" data-rule="required;" style="width: 200px" value="${authority.code }"/>
					</td>
				</tr>
				<tr>
					<th>功能链接：</th>
					<td><input name="path" type="text" data-rule="required;" style="width: 200px" value="${authority.path }"/>
					</td>
				</tr>
				<tr>
					<th>描述：</th>
					<td><input name="description" type="text" style="width: 200px" value="${authority.description }"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="id" value="${authority.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
	<br>		<br>
</body>
</html>