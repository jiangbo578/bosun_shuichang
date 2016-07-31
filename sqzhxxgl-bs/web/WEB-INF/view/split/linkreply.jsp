<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>联系专员查看回复信息</title>
<jsp:include page="/page/head.jsp"></jsp:include>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>

</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">回复信息</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>回复信息</strong></div>
  <a class="btn"  href="/linkman/wait" style="float:left;" > <i class="icon-arrow-left"  ></i>&nbsp;返&nbsp;回&nbsp;</a>
<br>
<div style="height: 30px"></div>
<div class="alert alert-info" style="margin-bottom: 2px;text-align: left">
       <i class='  icon-envelope'></i><br><br>${reply}<br>
</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>