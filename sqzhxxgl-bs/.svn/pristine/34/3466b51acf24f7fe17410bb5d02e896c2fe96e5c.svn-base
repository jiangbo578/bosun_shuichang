<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<script src="/scripts/draw/event.js"></script>

<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>

<script type="text/javascript">
$(function()
{	
			$.ajax
			({
				url:'/organ/org/'+$("#orgId").val(),
				type:'GET',
				success:function(obj)
				{
					$("#area_wbj").append("<b>主送职能部门:</b><br><br>");
					$("#town_wbj").append("<b>抄送职能部门:</b><br><br>");
					for(var i = 0;i<obj.length;i++)
					{
						if("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"!=obj[i].parent.id)
						{
							$("#area_wbj").append("<div class='panstyle p1'> <input type=checkbox name=wbj value= "+obj[i].id+"  onclick='javascript:chooseThis("+i+")' id="+i+" >"+
							"<label>"+obj[i].name+"<i class='icon-user'></i></label></div> ")
							$("#town_wbj").append("<div id='son"+i+"' class='panstyle p1' ><input type=checkbox name=wbj value= "+obj[i].id+"  >"+
							"<label>"+obj[i].name+"<i class='icon-user'></i></label></div> " );
						}
					}
					$("#area_wbj").append("<br><br>");
					$("#town_wbj").append("<br><br>");
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
			$("#town_wbj div").each(function()
			{
				$(this).css("display","block");
			})
			
			$("#"+id).attr("checked",true);	
			$("#son"+id).css("display","none");
		}
function copy()
{
	
	$("#area_wbj input ").each(function()
	{
		$(this).attr("checked",false);
	})
	$("#town_wbj input ").each(function()
	{
		$(this).attr("checked",false);
	})
	
	$("#info").css("display","none");
	$("#copy").css("display","block");
}
function cancle()
{
	$("#copy").css("display","none");
	$("#info").css("display","block");
}
function go()
{
	var checked = "";
	$('input:checkbox:checked').each(function() 
	{ 
		 checked += "@"+$(this).val();
	});
	var copyObj = {};
	copyObj.fromId = $("#orgId").val();
	copyObj.fromName = $("#orgName").val()+"-"+$("#role").val();
	copyObj.myId = checked;
	copyObj.splitId = $("#objid").val();
	copyObj.replyContent = "wait";
	copyObj.copyType = "linkman";
	copyObj.num = $("#num").val();
	var json = JSON.stringify(copyObj);

	$.ajax({
		url:'/linkman/insertCopy/'+$("#objid").val()+"/"+$("#pid").val(),
		type:'POST',
		data:json,
		dataType:'json',
		contentType:'application/json;charset=UTF-8',
		success:function(obj)
		{
			if(obj!=null)
			{
				alert("转发成功！");
				location.href = "/linkman/index";
			}
		}
	})
		
}
</script>
<title>单条信息</title>
<style type="text/css">

.panstyle
{
//float:left; 
width:130px;
border:  solid 1px #cccccc;
//margin-left: 12px ;
//margin-bottom: 12px; text-align: center; 
}
.panstyle:hover
{
  background-color: #FFE500;
  border:  solid 1px #0066B2;
}
</style>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">详情</li>
  </ul>
<input type="hidden" id="pid" value="${objid}" >
<input type="hidden" id="objid" value="${split.pid }" >
<input type="hidden" id="orgId"  value="${sessionScope.userOrgan.id }" >
<input type="hidden" id="orgName"  value="${sessionScope.userOrgan.name }" >
<input type="hidden" id="role"  value="${sessionScope.userRole }" >
<input type="hidden" id="parentOrgId" value="${sessionScope.userOrgan.parent.id }" >
<div class="mianpan">
<div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>详情</strong></div>
<div id="panbody">
<div id="info" >
<div style="float:left;" class="btn-group" >
<a class="btn"  href="javascript:copy()" ><i class="icon-envelope"></i>&nbsp;转&nbsp;发&nbsp;</a>
<a class="btn"  href="${url }" > <i class="icon-arrow-left"></i>&nbsp;返&nbsp;回&nbsp;</a>
</div>
<div style="height: 30px" ></div>
<input type="hidden" id="parentOrgId" value="${split.streetId }" >
<input type="hidden" id="wb" value="${split.wbj }"style="width:300px" >
<h3 style="text-align: center;">村居社会管理工作联系单</h3>
	<div style="text-align:left:;" align="center">
	<h4>（
		<input type="hidden" id="street" name="street"  style="width: 60px" readOnly value="${sessionScope.userOrgan.parent.name}" />
		<span>${split.street}-</span>
		<span id="spanyear">${ split.year}-</span>
		年&nbsp;第  
		<input type="hidden" id="num"  value="${split.num }" >
        <span id="spannum">${split.num }</span>&nbsp;&nbsp;号&nbsp;）
    </h4>
	<br>
	<div style="text-align: left;">
       部门： <b>${split.wbj }</b>
       <br><br>兹于&nbsp;&nbsp;<b>${split.eventDate }</b>&nbsp;&nbsp;在
             	  <b>${split.address }</b> &nbsp;&nbsp;(地点)发现
             	  <b>${split.event }</b>&nbsp;&nbsp;事件<br><br>
       <div class="alert alert-info" style="margin-bottom: 2px;text-align: left">
      	 <i class=' icon-bell'></i> 特告知贵单位，请及时依法处置，我单位将配合相关工作。具体情况告知如下：
	  </div>
	  <br>
       <b >${split.content}</b>
      </div>
       <div style="text-align: right;" >
	         <b>${split.street}</b> &nbsp;&nbsp;<b>${split.committee}</b>&nbsp;&nbsp;
	         <br>
	        日期: <b>${split.date }</b>&nbsp;&nbsp;
	   </div>
      <br>
	</div>
</div>
</div>


<div id="copy" style="display: none;width: 100%">
		<table class="table table-bordered" style="width: 300px;text-align: center;" >
			<tr>
				<td id="area_wbj" style="text-align: center;" ></td><td id="town_wbj" style="text-align: center;" ></td>
			</tr>
		</table>
		<div id="wbj" style="text-indent:2em" ></div>
		<div id="ton_wbj" style="text-indent:2em" ></div>
		<br>
		<div class="btn-group" >
			<a class="btn btn-info" href="javascript:go()" >确认转发</a>
			<a class="btn" href="javascript:cancle()" >&nbsp;取&nbsp;消&nbsp;</a>
		</div>
</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>