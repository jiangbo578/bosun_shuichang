<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<title>干事已处理e</title>
<script type="text/javascript">
$(function()
		{
			$.ajax({
				url:'/split/getSplit/'+$("#orgId").val(),
				type:'GET',
				success:function(obj)
				{
					var htmlStr = "";
					if(obj!=null)
					{
						for(var i = 0;i<obj.length;i++)
						{
							if("wait"!=obj[i].receipt)
							{
								htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].receiptDate+"</td><td>"+obj[i].event+"</td><td>已经回执</td>"+
								"<td><div class='btn-group'><a class='btn' href='/split/officer/info/"+obj[i].pid+"/split_ready'  >查看详情</a>"+
								"<a class='btn' href='/split/look/"+obj[i].pid+"'  >查看回执</a>"+
								"<a class='btn' href='/split/plan/"+obj[i].pid+"/split_ready' >查看流程</a></div></td></tr>"
							}
						}
					}
					$("#info").append(htmlStr);
				}
			})
		})
</script>
<style type="text/css">
body
{
	font-family: '微软雅黑';
}
</style>
</head>
<body>
<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">已处理</li>
</ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>已处理列表</strong></div>
	<br>
	<input type="hidden" id="orgId"  value="${sessionScope.userOrgan.id }" >
	<input type="hidden" id="parentOrgId" value="${sessionScope.userOrgan.parent.id }" >
	<table class="table table-striped table-bordered table-hover"" id="info">
		<thead>
			<tr><th>联系单编号</th><th>回执日期</th><th>事件类型</th><th>状态</th><th>操作</th></tr>
		</thead>
	</table>
	<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>