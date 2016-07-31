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
    <li><a href="/taizhang/list/1"> 基础情况 </a> <span class="divider">/</span></li>
<li><a href="/xzpmt/list/1"> 行政村平面图
</a> <span class="divider">/</span></li>
    <li class="active">详细信息</li>
  </ul>
        <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong>行政村平面图
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table>
				<tr>
				<th>记录时间:</th>
				<td style="padding-left: 50px"><fmt:formatDate pattern='yyyy-MM-dd' value='${pmt.insertDate}'/></td>
				</tr>
					<tr>
				<th>内容:</th>
				<td style="padding-left: 50px">${pmt.bz }</td>
				</tr>
					<tr>
				<th>记录人:</th>
				<td style="padding-left: 50px">${pmt.jlr }</td>
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