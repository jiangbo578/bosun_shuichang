<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
  <link rel="stylesheet" type="text/css" href="/zui/bs2/css/bootstrap.css">
  <!--[if lte IE 6]>
  <link rel="stylesheet" type="text/css" href="/zui/bs2/css/bootstrap-ie6.css">
  <![endif]-->
  <!--[if lte IE 7]>
  <link rel="stylesheet" type="text/css" href="/zui/bs2/css/ie.css">
  <![endif]-->
<script type="text/javascript">
function showhide(id){
$("#wellpanel>:visible").hide();
$("#show"+id).show();
parent.iFrameHeight();
}

</script>
<style type="text/css">
 .span1
 {
     
      text-align: center;
      background-color: #ddd;
      margin-top: 10px;
     padding-left: 10px
    }
</style>
</head>
<body style="margin-left: 10px; margin-top: 15px">

	
		<div class="well" style="padding: 8px 0; margin-bottom: 0;width:20%;float: left;">
	<div style="margin-top: 2px">	 <a style="float: right" href="/role/add" class="btn btn-success "><i class="icon-plus"></i>添加权限</a>
  </div><br><br>
  <ul class="nav nav-list">
    <li class="active"><a href="#"><i class="icon-book icon-white"></i> 权限列表</a></li>
    <c:forEach items="${datas}" var="role" varStatus="num">
    <li><a href="javascript:showhide('${current==1?num.count+0:num.count+(10*(current-1))}')" ><i class="icon-chevron-right"></i> ${role.name }
       <c:if test="${role.parid eq '1'}"><i class='icon-user'></i>居委</c:if>
           <c:if test="${role.parid eq '2'}"><i class='icon-user'></i>镇</c:if>
             <c:if test="${role.parid eq '3'}"><i class='icon-user'></i>区</c:if>
    </a></li>
</c:forEach><!--
    <li><a href="#"><i class="i"></i> Misc</a></li>-->
  </ul>

  		<div  class="pagination" style="margin-top: 0px">
		<ul style="float: right;" id="b_pagination"></ul></div>
	</div>
	<br>
</div>

<div id="wellpanel"  style="padding: 8px 0; margin-bottom: 0;width:55%; float: left;; margin-left: 10px">

	
	    <c:forEach items="${datas}" var="role" varStatus="num">
	<div id="show${current==1?num.count+0:num.count+(10*(current-1))}" style="display: ${num.count==1?'block':'none'}">
	
	<ul class="nav nav-list">
  <li class="nav-header">  序号 <strong>${current==1?num.count+0:num.count+(10*(current-1))}</strong> 
  名称 <strong>	${ role.name }</strong>
描述 <strong>${role.description}</strong>
标识 <strong>${role.code}</strong>
<div class="btn-group">
 	<a class='btn' href="/role/update/${role.id }">修改</a>
							<a href="/role/delete/${role.id }" class="btn b_delete_role">删除</a>
		</div></li>

  	<c:forEach items="${role.authoritys }" var="authority">
		  <li><a href="#">${authority.name }</a></li>
			</c:forEach>

</ul>
		
 
 
 

    
    
	</div>
	
	</c:forEach>
<div class="container"><!--
				 
		

		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="8%">序号</th>
					<th width="15%">名称</th>
					<th width="15%">标识</th>
					<th width="15%">描述</th>
					<th width="15%">权限</th>
					<th width="47%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="role" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${role.name }</td>
						<td>${role.code }</td>
						<td>${role.description }</td>
						<td>
						<c:forEach items="${role.authoritys }" var="authority">
							<div style="float:left; width:230px"> 
						    ${authority.name }
						    </div>
						</c:forEach>
						</td>	
						<td>
							<a href="/role/update/${role.id }">修改</a><span class="empty"></span>
							<a href="/role/delete/${role.id }" class="b_delete_role">删除</a><span class="empty"></span>
						
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
--></div>

</div>
	
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {

			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/role/');
			$('#b_pagination').html(pagination.show());

			
			$('.b_delete_role').on('click', function() {
				if(confirm("确认要删除该角色吗?")){
			return true;
			}
			
				return false;
			});
			
		});
	parent.iFrameHeight();
	</script>
</body>
</html>