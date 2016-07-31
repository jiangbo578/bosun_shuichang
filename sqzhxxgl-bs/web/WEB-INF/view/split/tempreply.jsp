<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="/styles/bootstrap3/css/bootstrap.css"  rel="stylesheet" type="text/css" />
<link href="/styles/bootstrap3/css/bootstrap-theme.css"  rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="/zui/kindeditor/themes/default/default.css" />
<script type="text/javascript" charset="utf-8" src="/scripts/jquery.min.js"></script>
<script src="/zui/datepicker/WdatePicker.js"></script>
<script type="text/javascript" src="/styles/bootstrap3/js/bootstrap.min.js"></script>
<script src="/scripts/draw/event.js"></script>
<script charset="utf-8" src="/zui/kindeditor/kindeditor-min.js"></script>
<script charset="utf-8" src="/zui/kindeditor/lang/zh_CN.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>

<title>回复给我的</title>
<script type="text/javascript">
<!--
var editor;
$(function() 
{
	editor = new UE.ui.Editor();
	editor.render('myEditor');
})
-->
</script>
</head>
<body>
<div>${htmlInfo}</div>
<a class="btn btn-danger" href="${url }" >返回</a>
</body>
</html>