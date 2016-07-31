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
<li><a href="/hyjl/list/1">会议记录</a> <span class="divider">/</span></li>
    <li class="active">详细信息</li>
  </ul>
        <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong> 会议记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table>
				<tr>
					<th>标题：</th>
					<td>${hyjl.name }</td>
				</tr>
				<tr>
					<th>会议类别：</th>
					<td>${hyjl.hylb }</td>
				</tr>
				<tr>
					<th>会议日期：</th>
					<td>${hyjl.sj }</td>
				</tr>
				<tr>
					<th>地点：</th>
					<td>${hyjl.dd }</td>
				</tr>
				<tr>
					<th>主持人：</th>
					<td>${hyjl.zcr }</td>
				</tr>
				<tr>
					<th>参加对象：</th>
					<td>${hyjl.cjdx }</td>
				</tr>
				<tr>
					<th>参加人数：</th>
					<td>${hyjl.rs }</td>
				</tr>
				<tr>
					<th>会议议题：</th>
					<td>${hyjl.hyyt }</td>
				</tr>
			
				<tr>
					<th>记录人：</th>
					<td>${hyjl.jlr }</td>
				</tr>
				<tr>
					<th>拟稿时间：</th>
					<td><fmt:formatDate pattern='yyyy-MM-dd HH:mm:ss' value='${hyjl.insertDate }'/></td>
				</tr>
				
					<tr>
					<th>会议内容：</th>
					<td>${hyjl.nr}</td>
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