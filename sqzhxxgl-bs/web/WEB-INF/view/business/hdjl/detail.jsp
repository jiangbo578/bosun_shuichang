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
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
<li><a href="/hdjl/list/1">活动记录</a> <span class="divider">/</span></li>
    <li class="active">详细信息</li>
  </ul>
        <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong> 活动记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table>
				<tr>
					<th>时间：</th>
					<td>${hdjl.sj}</td>
				</tr>
				<tr>
					<th>地点：</th>
					<td>${hdjl.address}</td>
				</tr>
				<tr>
					<th>参加人数：</th>
					<td>${hdjl.cjrs }</td>
				</tr>
				<tr>
					<th>活动记录类型：</th>
					<td>${hdjl.type }</td>
				</tr>
				<tr>
					<th>负责人：</th>
					<td>${hdjl.fzr}</td>
				</tr>
				<tr>
					<th>参加对象：</th>
					<td>${hdjl.cjdx}</td>
				</tr>
				<tr>
					<th>活动内容：</th>
					<td>${hdjl.nr}</td>
				</tr>
				
				
				<tr>
					<th>记录人：</th>
					<td>${hdjl.jlr }</td>
				</tr>
				<tr>
					<th></th>
					<td>	<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
		</table>
	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>