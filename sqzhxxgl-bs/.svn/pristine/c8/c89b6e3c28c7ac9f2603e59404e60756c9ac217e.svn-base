<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<script type="text/javascript" charset="utf-8" src="/scripts/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>
<title>回执输入</title>
<script type="text/javascript">
var editor;
$(document).ready(function(){
	editor = new UE.ui.Editor();
	editor.render('myEditor');
});	
function getDate(id,date_id)
{
	WdatePicker({dateFmt:'yyyy-MM-dd'});
	var date = $("#"+id).val();
	var value ;
	if(""==date)
	{
		value = "";
	}
	else
	{
		$("#"+date_id+"1").val(date);
		value = date.split("-")[0]+"年"+date.split("-")[1]+"月"+date.split("-")[2]+"日";
	}
	$("#"+id).val("");
	$("#"+date_id).val(value);
}

function qx()
{
	location.href = "/linkman/wait"	;
}
function getDate()
{
var day = new Date();
var Year = 0;
var Month = 0;
var Day = 0;
var CurrentDate = "";
//Year= day.getYear();//有火狐下2008年显示108的bug
Year= day.getFullYear();//ie火狐下都可以
Month= day.getMonth()+1;
Day = day.getDate();
CurrentDate += Year + "-";
if (Month >= 10 )
{
CurrentDate += Month + "-";
}
else
{
CurrentDate += "0" + Month + "-";
}
if (Day >= 10 )
{
CurrentDate += Day ;
}
else
{
CurrentDate += "0" + Day ;
}
return CurrentDate;
} 
function save()
{
	var info = editor.getContent();
	if(null==info||""==info)
	{
		alert("未填写任何内容!");
	}
	else
	{
		var split = {};
		split.receipt = editor.getContent();
		split.receiptDate = getDate();
		var json = JSON.stringify(split);
		$.ajax({
			url:'/split/insertReceipt/'+$("#pid").val()+"/"+$("#lpid").val(),
			type:'POST',
			data:json,
			dataType:'json',
			contentType:'application/json;charset=UTF-8',
			success:function(obj)
			{
				if(obj!=null)
				{
					alert("回执成功!");
					location.href = "/linkman/ready";
				}
			}
		})
	}
}
</script>

</head>
<body>
  <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">回执</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>回执</strong></div>
	<input type="hidden"  id="b_date1">
	<input type="hidden" id="pid" value="${split.pid }" >
	<input type="hidden" id="lpid" value="${link.pid }" >
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
		<script type="text/plain" id="myEditor" name="enews.contrnt" ></script><br><br>
       <a id="click" style="float: right;" class="btn btn-primary" onclick="javascriot:save()"><i class="icon-ok-sign"></i>&nbsp; 提&nbsp; 交&nbsp; </a>
<jsp:include page="/page/footer.jsp"></jsp:include>	
</body>
	
</html>