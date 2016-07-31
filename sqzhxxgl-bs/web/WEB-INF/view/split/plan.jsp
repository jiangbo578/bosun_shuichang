<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<title>查看流程</title>
<script type="text/javascript">
$(function()
{
	var text = $("#t").val();
	var text_array = text.split("<br>");
	$("#info").append("<br>");
	for(var i= 0;i<text_array.length-2;i++)
	{
		$("#info").append(text_array[i]+"<br>");
		$("#info").append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<i class='icon-arrow-down'></i><br>");
	}
	$("#info").append(text_array[text_array.length-2]+"<br>");
	$("#info").append("<br>");
})
</script>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">联系单流程</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>联系单流程</strong></div>
<a id="click" style="float:left;" class="btn" onclick="window.history.go(-1)"><i class="icon-arrow-left"></i>&nbsp; 返&nbsp; 回&nbsp; </a>
<input type="hidden" id="t"  value="${plantext.plan }" >
<div style="height: 50px" ></div>
<div class="alert alert-info" style="margin-bottom: 2px;text-align: left" id="info" ></div>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>