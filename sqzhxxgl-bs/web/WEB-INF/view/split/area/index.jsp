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
	$.ajax({
		url:'/copy/myCopy/'+$("#orgId").val(),
		type:'GET',
		success:function(obj)
		{
			var htmlStr = "";
			if(obj!=null)
			{
				for(var i = 0;i<obj.length;i++)
				{
					if("wait"==obj[i].replyContent)
					{
						htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].copyDate+"</td>"+
						"<td>"+obj[i].fromName+"</td>"+
						"<td>等待回复</td>"+
						"<td><div class='btn-group' ><a class='btn' href='/split/officer/info/"+obj[i].splitId+"/split_show' >查看详情</a>"+
						"<a class='btn' href='/split/reply/"+obj[i].pid+"/"+obj[i].copyType+"/split_show/split_area_ready' >&nbsp;回&nbsp;&nbsp;复&nbsp;</a>"+
						"<a class='btn' href='/split/plan/"+obj[i].splitId+"/split_show' >查看流程</a></td></tr>";
					}
				}
				$("#info").append(htmlStr);
			}
		}
	})	
	
})

</script>

</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">未处理</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>未处理</strong></div>
	<br>
	<input type="hidden" id="orgId" value="${sessionScope.znbm }" >
	<input type="hidden" id="userOrgan" value="${sessionScope.userOrgan.name }">
	<input type="hidden" id="org" value="${sessionScope.userOrgan.id }">
	<table class="table table-bordered" id="info" style="width: 100%" >
		<thead>
			<tr><th>联系单编号</th><th>发送日期</th><th>发送方</th><th>状态</th><th>操作</th></tr>
		</thead>
	</table>
	<div id="copy" style="width: 100%;display: none">
	转发部门:
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