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
<title>回复</title>
<script type="text/javascript">
var editor;
$(function() 
{
	editor = new UE.ui.Editor();
	editor.render('myEditor');
})
function save()
{
	var copyObject = {};
	copyObject.replyContent = editor.getContent();
	var json = JSON.stringify(copyObject);
	$.ajax({
		url:'/copy/insertReply/'+$("#pid").val()+"/"+$("#copyId").val(),
		type:'POST',
		data:json,
		dataType:'json',
		contentType:'application/json;charset=UTF-8',
		success:function(obj)
		{
			if(obj!=null)
			{
				alert("回复成功!");
				location.href = $("#url").val();
			}
		}
		})
}
</script>

</head>
<body>
  <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">回复</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>回复</strong></div>
  <br>
<input type="hidden" id="pid" value="${pid }" >
<input type="hidden" id="copyId" value="${copyId }">
<input type="hidden" id="url" value="${url }" >
<a class="btn" style="float:left;" href="${back }" > <i class="icon-arrow-left"></i>&nbsp;返&nbsp;回&nbsp;</a>
<div style="height: 30px"></div>
<h3 style="text-align: center;" >填写回复信息</h3>
<br>
<script  id="myEditor" type="text/plain" name="enews.contrnt" ></script>
<br>
<a class="btn btn-danger" style="float: right;" href="javascript:save()" ><i class=" icon-ok-sign"></i>&nbsp;提&nbsp;交&nbsp;</a>
	<jsp:include page="/page/footer.jsp"></jsp:include>	
</body>
</html>