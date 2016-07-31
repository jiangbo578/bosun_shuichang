<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<title>镇职能部门已回复</title>
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
							if("wait"!=obj[i].replyContent)
							{
								htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].copyDate+"</td><td>"+obj[i].replyDate+"</td>"+
								"<td>"+obj[i].fromName+"</td>"+
								"<td>已回复</td>"+
								"<td><div class='btn-group' ><a class='btn' href='/split/officer/info/"+obj[i].splitId+"/split_area_ready' >查看详情</a>"+
								"<a class='btn' href='/split/myreply/"+obj[i].pid+"/split_townready') >查看回复</a>"+
								"<a class='btn' href='/split/plan/"+obj[i].splitId+"/split_townready') >查看流程</a></td></tr>";
							}
						}
						$("#info").append(htmlStr);
					}
				}
			})	
			
		})

		</script>
		<style type="text/css">
		body
		{
			font-family: "微软雅黑";
		}
		</style>
</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">已处理</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>已处理</strong></div>
	<br>
	<input type="hidden" id="orgId" value="${sessionScope.znbm }" >
	<input type="hidden" id="userOrgan" value="${sessionScope.userOrgan.name }">
	<input type="hidden" id="org" value="${sessionScope.userOrgan.id }">
	<table class="table table-bordered" id="info" style="width: 100%" >
		<thead>
			<tr><th>联系单编号</th><th>发送日期</th><th>回复日期</th><th>发送方</th><th>状态</th><th>操作</th></tr>
		</thead>
	</table>
	<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>