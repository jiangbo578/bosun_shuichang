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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li ><a href="/ffxymp/list/1">非法行医情况排摸信息表</a> <span class="divider">/</span></li>
    <li class="active">修改表单名称</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>表单名称编辑</strong> 非法行医情况排摸信息表</div>
  <div id="panbody">
	<div class="container">
		<form  action="/ffxymp/update" method="post">
  <div class="control-group">
    <label class="control-label" for="inputEmail">请输入表单名称：</label>
    <div class="controls">
      <input type="text" name="name" value="${businessForm.name }" data-rule="required;" class="input-xxlarge"  id="inputEmail" placeholder="请输入表单名称">

    </div>
  </div>
		
				
			
					
				<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
					<input type="hidden" name="id" value="${businessForm.id}">
				
				
		
			
		</form>
	</div>
</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>