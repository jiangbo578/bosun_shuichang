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
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
<li><a href="/xcjl/list/1">宣传记录</a> <span class="divider">/</span></li>
    <li class="active">详细</li>
  </ul>
      <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong>宣传记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
			<table>
				<tr >
					<th width="70px">时间：</th>
					<td>${xcjl.sj}</td>
				</tr>
				<tr>
					<th>地点：</th>
					<td>${xcjl.address}</td>
				</tr>
				<tr>
					<th>宣传人员：</th>
					<td>${xcjl.xcry}</td>
				</tr>
				<tr>
					<th>宣传形式：</th>
					<td>${xcjl.xcxs}</td>
				</tr>
				<tr>
					<th>宣传主题：</th>
					<td>${xcjl.xczt}</td>
				</tr>
				<tr>
					<th>活动内容：</th>
					<td>${xcjl.nr}</td>
				</tr>
				
				
				<tr>
					<th>记录人：</th>
					<td>${xcjl.jlr }</td>
				</tr>
				
		</table>
	</div>

	<br>
</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>