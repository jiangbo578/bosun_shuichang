<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
				 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>

    <li class="active">用户管理</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>用户列表</strong> 
  
   
  </div>
	<div class="container">
		<a class="btn btn-success" style="margin-bottom: 10px" href="/user/add"><i class="icon-plus"></i>添加用户</a>
		<input type="text" name="code" id="code"  placeholder="请输入用户名">   <a style="margin-bottom: 10px" class="btn" type="submit" onclick="cx()"><i class="icon-search"></i>查询</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th >序号</th>
					<th>用户名</th>
					<th>真实姓名</th>
					<th>组织结构</th>
					<th>角色</th>
					<th>状态</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="user" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${user.username }</td>
						<td>${user.realName }</td>
						<td>
						<c:if test="${empty user.organization.parent}">
						${user.organization.name }
						</c:if>
						<c:if test="${not empty user.organization.parent}">
						${user.organization.parent.name} -- ${user.organization.name }</td>
						</c:if>
						<td>
						<c:forEach items="${user.roles }" var="role">
							<div style="float:left; width:150px"> 
						    ${role.name }
						    </div>
						</c:forEach>
						</td>
						<td>${user.deleted==false?'正常':'注销'}
						<c:if test=""></c:if>
						</td>
						<td>
						<div class="btn-group">
						
							<c:if test="${user.deleted==false}">
							<a class="btn " href="/user/update/${user.id }"><i class="icon-pencil"></i>修改</a>
							<a href="/user/delete/${user.id }" class="btn b_delete_user"><i class="icon-trash"></i>注销</a>
							</c:if>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pagination" >
		<ul style="float: right;" id="b_pagination"></ul>
		</div>
		
	</div>

	<br>		<br><br>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	function cx(){
	      var code=document.getElementById("code").value;
	    //  alert(code);
	      location.href="/user/1?name="+code;
			}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/user/','?name=${name}');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要注销吗?注销后用户将不能登陆');
			$('.b_delete_user').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});
			parent.iFrameHeight();
		});
	</script>
</body>
</html>