<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>

<title>待转发</title>
<script type="text/javascript">
$(function()
{
	$.ajax
	({
		url:'/linkman/get/'+$("#orgId").val(),
		type:'GET',
		success:function(obj)
		{
			var htmlStr = "";
			if(obj!=null)
			{
				for(var i = 0;i<obj.length;i++)
				{
					if("wait"==obj[i].copy)
					{
						htmlStr += "<tr><th>"+obj[i].num+"</th><td>"+obj[i].sendDate+"</td><td>"+obj[i].fromName+"</td><td>等待转发</td>"+
						"<td><div class='btn-group' ><a class='btn' href='/split/linkman/info/"+obj[i].splitId+"/linkman_index' >查看详情</a>"+
						"<a class='btn' href='/split/plan/"+obj[i].splitId+"/split_show' >查看流程</a></div></td></tr>";
					}
				}
			}
			$("#info").append(htmlStr);
		}
	})	
	
	$.ajax
	({
		url:'/organ/org/'+$("#orgId").val(),
		type:'GET',
		success:function(obj)
		{
			$("#area_wbj").append("<b>主送职能部门:</b><br>");
			$("#town_wbj").append("<b>抄送职能部门:</b><br>");
			for(var i = 0;i<obj.length;i++)
			{
				if("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"!=obj[i].parent.id)
				{
					$("#area_wbj").append(obj[i].name+"<input type=checkbox name=wbj value= "+obj[i].id+" class=no_border   style=width:60px  onclick='javascript:chooseThis("+i+")' id="+i+" >")
					$("#town_wbj").append("<font id=son"+i+" >"+obj[i].name+"<input type=checkbox name=wbj value= "+obj[i].id+" class=no_border   style=width:60px ></font>" );
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
var objid,pid;
function copy(split_id,link_pid)
{
	objid = split_id;
	pid = link_pid;
	
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
	copyObj.splitId = objid;
	copyObj.replyContent = "wait";
	copyObj.copyType = "linkman";
	
	var json = JSON.stringify(copyObj);

	$.ajax({
		url:'/linkman/insertCopy/'+objid+"/"+pid,
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

</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">待转发</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>待转发</strong></div>
	<br>
	<input type="hidden" id="orgId"  value="${sessionScope.userOrgan.id }" >
	<input type="hidden" id="orgName"  value="${sessionScope.userOrgan.name }" >
	<input type="hidden" id="role"  value="${sessionScope.userRole }" >
	<input type="hidden" id="parentOrgId" value="${sessionScope.userOrgan.parent.id }" >
	<table class="table table-bordered" id="info" style="width: 100%" >
		<thead>
			<tr><th>联系单编号</th><th>发送日期</th><th>发送方</th><th>状态</th><th>操作</th></tr>
		</thead>
		<tbody>
		<c:forEach items="${datas}" var="lxd" >
		 <tr>
		 <td><b>${lxd.num}</b></td>
		 <td>${lxd.sendDate}</td>
		 <td>${lxd.fromName}</td>
		 <td>等待转发</td>
		 <td><div class='btn-group' ><a class='btn' href='/split/linkman/info/${lxd.splitId}/linkman_index' >查看详情</a>
						<a class='btn' href='/split/plan/${lxd.splitId}/split_show' >查看流程</a></div></td>
		 </tr>
		 </c:forEach>
		</tbody>
	</table>
	<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	<div id="copy" style="display: none;width: 100%">
		<div style="height: 30px"></div>
		<div id="area_wbj" style="text-indent:2em" ></div>
		<div id="town_wbj" style="text-indent:2em" ></div>
		<div style="height: 50px"></div>
		<div class="btn-group" >
			<a class="btn btn-info" href="javascript:go()" >确认转发</a>
			<a class="btn" href="javascript:cancle()" >取消</a>
		</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}','${pages}', '${count}', '/linkman/get/${sessionScope.userOrgan.id}/');
			$('#b_pagination').html(pagination.show());	
		});
	</script>
</body>
</html>