<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>
<title>查看回执单</title>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">回执信息</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>回执信息</strong></div>
  <a id="click" style="float:left;" class="btn" href="${url }" ><i class="icon-arrow-left"></i>&nbsp; 返&nbsp; 回&nbsp; </a>
	<br>
	<h3 style="text-align: center;">村居社会管理工作联系单回执</h3>
		<h4 style="text-align: center;" >（
		<span>${link.myName}&nbsp;</span>
		<span>${split.year}</span>年&nbsp;
		<span>${split.num}&nbsp;</span>号）
    </h4>

	<b>${split.street }</b>&nbsp;
	<b>${split.committee }:</b> <br><br>
 贵单位&nbsp;
 <b>${split.year }</b>&nbsp;年，第
 <b>${split.num }</b>&nbsp;号工作联系单收悉，<br>	<br>
<div class="alert alert-info" style="margin-bottom: 2px;text-align: left">
       <i class=' icon-bell'></i> 现将我单位处置情况告知如下：
</div>	<br>	
		<b>${link.receiptId }</b><br><br>

   <jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>