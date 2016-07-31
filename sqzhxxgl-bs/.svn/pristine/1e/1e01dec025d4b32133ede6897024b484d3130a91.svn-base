<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<title>镇职能部门首页</title>
<script type="text/javascript">
$(function()
{
	var info;
	$.ajax({
		url:'/copy/myCopy/'+$("#orgId").val(),
		type:'GET',
		success:function(obj)
		{
			var htmlStr = "";
			if(obj!=null)
			{
				info = obj;
				for(var i = 0;i<obj.length;i++)
				{
					if("wait"==obj[i].replyContent)
					{
						
						if(obj[i].tempData ==null||""==obj[i].tempData)
						{
							htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].copyDate+"</td>"+
							"<td>"+obj[i].fromName+"</td>"+
							"<td>等待回复</td>"+
							"<td><div class='btn-group'><a class='btn' href='/split/town/info/"+obj[i].splitId+"/split_show' >查看详情</a>"+
							"<a class='btn' href='/split/plan/"+obj[i].splitId+"/split_show' >查看流程</a>"
							+"<a class='btn'  href='/split/reply/"+obj[i].pid+"/"+obj[i].copyType+"/split_show/split_townready' >&nbsp;回&nbsp;复&nbsp;</a></div></td></tr>";
						}
						else if("copy"==obj[i].tempData.toString())
						{
							htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].copyDate+"</td>"+
							"<td>"+obj[i].fromName+"</td>"+
							"<td>等待回复</td>"+
							"<td><div class='btn-group'><a class='btn' href='/split/officer/info/"+obj[i].splitId+"/split_show' >查看详情</a>"+
							"<a class='btn' href='/split/plan/"+obj[i].splitId+"/split_show' >查看流程</a></div></td></tr>";
						}
						else
						{
						}
					}
				}
				$("#info").append(htmlStr);
			}
		}
	})	
	
	$.ajax
	({
		url:'/organ/org/'+$("#org").val(),
		type:'GET',
		success:function(obj)
		{
			$("#area_wbj").append("<b>主送职能部门:</b><br>");
			$("#town_wbj").append("<b>抄送职能部门:</b><br>");
			for(var i = 0;i<obj.length;i++)
			{
				if("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"==obj[i].parent.id)
				{
					$("#area_wbj").append(obj[i].name+"<input type=checkbox name=wbj value= "+obj[i].id+" class=no_border   style=width:60px id="+i+" onclick=javascript:chooseThis('"+i+"') >");
					$("#town_wbj").append("<font id=son"+i+" >"+obj[i].name+"<input type=checkbox name=wbj value= "+obj[i].id+" class=no_border   style=width:60px></font>");
				}
			}
		}
	})
})
function chooseThis(id)
{
	$("#area_wbj input ").each(function()
	{
		$(this).attr("checked",false);
	})
	$("#town_wbj input").each(function()
	{
		$(this).attr("checked",false);
	})		
	$("#town_wbj font").each(function()
	{
		$(this).css("display","block");
	})
			
	$("#"+id).attr("checked",true);	
	$("#son"+id).css("display","none");
}
var checkNum = 0;
var pid;
var objid;
function copy(opid,ospid)
{
	pid = opid;
	objid = ospid;
	$("#info").css("display","none");
	$("#copy").css("display","block");
	$("#area_wbj input ").each(function()
	{
		$(this).attr("checked",false);
	})
}
function go()
{
	var copyObj = {};
	copyObj.fromId = $("#orgId").val();
	copyObj.copyType = pid;
	copyObj.fromName = $("#userOrgan").val();
	var checked = "";
	$('input:checkbox:checked').each(function() 
	{ 
		 checkNum ++;
		 checked += "@"+$(this).val();
	});
	copyObj.myId = checked;
	copyObj.splitId = objid;
	copyObj.replyContent = "wait";
	
	if(0===checkNum)
	{
		alert("请选择转发部门");
	}
	else
	{
		var json = JSON.stringify(copyObj);
		$.ajax({
			url:'/copy/updateCopy',
			type:'POST',
			data:json,
			dataType:'json',
			contentType:'application/json;charset=UTF-8',
			success:function(obj)
			{
				if(obj!=null)
				{
					alert("转发成功!");
					location.href = "/split/show";
				}
			}
		})
	}
}
function cancle()
{
	$("#copy").css("display","none");
	$("#info").css("display","block");	
}
</script>

</head>
<body>
<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">未处理</li>
</ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>未处理</strong></div>
	<input type="hidden" id="orgId" value="${sessionScope.znbm }" >
	<input type="hidden" id="userOrgan" value="${sessionScope.userOrgan.name }">
	<input type="hidden" id="org" value="${sessionScope.userOrgan.id }">
	<table class="table table-bordered" id="info" style="width: 100%" >
		<thead>
			<tr><th>流程单编号</th><th>发送日期</th><th>发送方</th><th>状态</th><th>操作</th></tr>
		</thead>
	</table>
	<div id="copy" style="width: 100%;display: none">
	<b>转发部门</b>:
		<div style="height: 30px"></div>
		<div id="area_wbj" style="text-indent:2em" ></div>
		<div id="town_wbj" style="text-indent:2em" ></div>
		<div style="height: 50px"></div>
		<a class="btn btn-info" href="javascript:go()" >确认转发</a>
		<a class="btn btn-danger" href="javascript:cancle()" >取消</a>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>