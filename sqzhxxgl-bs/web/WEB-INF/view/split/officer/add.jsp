<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<script src="/scripts/draw/event.js"></script>
<script src="/scripts/py.js"></script>

<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>

<script type="text/javascript">
var editor;
$(function() 
{
	editor = new UE.ui.Editor();
	editor.render('myEditor');
	
	var date = new Date();
	$("#year").val(date.getFullYear());
	$("#spanyear").html(date.getFullYear());
	for(var i = 0;i<event_data.list.length;i++)
	{
		$("#event").append("<option value='"+event_data.list[i].name+"'>"+event_data.list[i].name+"</option>");
	}
	
	$.ajax({
		url:'/split/getNum/'+$("#parentOrgId").val(),
		type:'GET',
		success:function(obj)
		{
			var py = get($("#street").val());
			$("#spannum").html(py+obj.value);
			$("#num").val(py);
		}
	})
})  
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
	if(confirm("确定要提交?"))
	{
		var split = {};
		split.street = $("#street").val();
		split.year = $("#year").val();
		split.streetId = $("#parentOrgId").val();
		split.address = $("#address").val();
		split.event = $("#event").val();
		split.eventDate = $("#t_date").val();
		split.content = editor.getContent();
		split.committee = $("#committee").val();
		split.committeeId = $("#orgId").val();
		split.date = getDate();
		split.realDate = getDate();
		split.receipt = "wait";
		split.num = $("#num").val();
		
		split.wbj = $("#wbj").val();
		
		var json = JSON.stringify(split);
		
		$.ajax({
			url:'/split/insetSplit',
			type:'POST',
			data:json,
			dataType:'json',
			contentType:'application/json;charset=UTF-8',
			success:function(obj)
			{
				if(obj!=null)
				{
					location.href = "/split/show";
				}
			}
		})
	}
}

</script>
<title>添加新联系单</title>
<style type="text/css">

</style>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">添加联系单</li>
  </ul>
<div class="mianpan">
<div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>填写数据</strong></div>
<div id="panbody">
	<input type="hidden"  id="t_date1">
	<input type="hidden"  id="orgId"         value="${sessionScope.userOrgan.id }">
	<input type="hidden"  id="parentOrgId"   value="${sessionScope.userOrgan.parent.id }">
	
	<h3 style="text-align: center;">村居社会管理工作联系单</h3>
	<div style="text-align:left:;" align="center">
	<h4>（
		<input type="hidden" id="street" name="street"  style="width: 60px" readOnly value="${sessionScope.userOrgan.parent.name}" />
		<span>${sessionScope.userOrgan.parent.name}-</span>
			<span id="spanyear"></span>
		<input type="hidden" id="year"   name="year"    style="width: 60px" readOnly />年&nbsp;第 
        <input type="hidden" id="num"    name="num"     style="width: 60px" readOnly /> <span id="spannum"></span>&nbsp;&nbsp;号&nbsp;）
    </h4>
    <br>
<div style="text-indent:2em;text-align: left;">
部门：		  <input type="text" id="wbj"  name="wbj"  style="width:60%" placeholder="职能部门名称" >  *.建议提交的部门
 		  <br>    	       
		  &nbsp; &nbsp; &nbsp; &nbsp; 兹于：
		  <input  id="t_date"  name="t_date"  type="text" 	onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})"    data-rule="required;date" class="Wdate"   style="width: 120px;" />在
          <input  id="address" name="address" type="text"   style="width: 220px">   (地点)发现 
          <select id="event"   name="event"></select> （事件）
    		   
     	  <input type="hidden"  id="street1"  	name="street1"     readOnly  value="${sessionScope.userOrgan.parent.name}" style="width: 60px">  
	      <input type="hidden"  id="committee" name="committee"  readOnly value="${sessionScope.userOrgan.name}" >
	
     	  <br>  
</div>
<div class="alert alert-info" style="margin-bottom: 2px;text-align: left">
       <i class=' icon-bell'></i> 特告知贵单位，请及时依法处置，我单位将配合相关工作。具体情况告知如下：
</div>

     <script  id="myEditor" type="text/plain" name="enews.contrnt" ></script>
     
	 <button style="margin-top: 12px;float: right;margin-left: 15px;padding-left: 20px;margin-bottom: 15px;pa"  class="btn btn-primary" type="button" onclick="javascriot:save()" ><i class="icon-ok-sign" ></i> 保存-提交</button>
       <br>
	<div style="height: 30px"></div>
</div>
</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>