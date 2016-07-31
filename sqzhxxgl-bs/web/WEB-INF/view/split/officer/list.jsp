<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<title>联系单列表</title>
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
					if("wait"==obj[i].receipt)
					{
						htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].realDate+"</td><td>"+obj[i].event+"</td><td>尚未回执</td>"+
						"<td><div class='btn-group' ><a class='btn' href='/split/officer/info/"+obj[i].pid+"/split_officer_index'  >查看详情</a>"+
						"<a class='btn' href='/split/plan/"+obj[i].pid+"/split_list' >查看流程</a></div></td></tr>"
					}
					else 
					{
						htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].receiptDate+"</td><td>"+obj[i].event+"</td><td>已经回执</td>"+
						"<td><div class='btn-group' ><a class='btn' href='/split/officer/info/"+obj[i].pid+"/split_list'  >查看详情</a>"+
						"<a class='btn' href='/split/plan/"+obj[i].pid+"/split_list' >查看流程</a>"+
						"<a class='btn' href='/split/look/"+obj[i].pid+"'  >查看回执</a></div></td></tr>"
					}
				}
			}
			$("#info").append(htmlStr);
		}
	})
})
</script>

</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">联系单列表</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>联系单列表</strong></div>
	<br>
	<input type="hidden" id="orgId"  value="${sessionScope.userOrgan.id }" >
	<input type="hidden" id="parentOrgId" value="${sessionScope.userOrgan.parent.id }" >
	<table class="table table-bordered" id="info">
		<thead>
			<tr><th>联系单编号</th><th>填写日期</th><th>事件类型</th><th>状态</th><th>操作</th></tr>
		</thead>
		<tbody>
		<c:forEach items="${datas}" var="lxd">
		 <tr>
		   <td>${lxd.num}</td>
		   <td>${lxd.realDate}</td>
		   <td>${lxd.event}</td>
		   <td>
		       <c:choose>
		       <c:when test="${lxd.receipt=='wait'}">尚未回执</c:when>
		       <c:otherwise>
		       已经回执
		       </c:otherwise>
		       </c:choose>
		   </td>
		   <td><div class='btn-group' ><a class='btn' href='/split/officer/info/${lxd.pid}/split_officer_index'  >查看详情</a>
			    <a class='btn' href='/split/plan/${lxd.pid}/split_list' >查看流程</a>
			   <c:if test="${lxd.receipt!='wait' }">  <a class='btn' href='/split/look/${lxd.pid}'  >查看回执</a></c:if></div></td>
		 </tr>
		 </c:forEach>
		</tbody>
	</table>
	<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}','${pages}', '${count}', '/split/getSplit/${sessionScope.userOrgan.id}/');
			$('#b_pagination').html(pagination.show());	
		});
	</script>
</body>
</html>