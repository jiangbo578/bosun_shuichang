<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
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

    <li class="active">登录日志列表</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
<div class="mianpan">
	
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>登录日志列表</strong> 
  </div>
	<div class="container">
	<p>  <input placeholder="请输入用户名"  type="text" name="code" id="code" />&nbsp;&nbsp;
	  <a class="btn btn-primary" type="button"  onclick="cx()" ><i class="icon-search"></i>查询</a></p>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">用户名</th>
					<th width="25%">所在村居</th>
					<th width="10%">真实姓名</th>
					<th width="15%">角色</th>
					<th width="20%">登陆时间</th>
					<th width="20%">登录IP</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="log" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${log.username }</td>
						<td>${log.organization }</td>
						<td>${log.user }</td>
						<td>${log.userRole }</td>
						<td>
							<fmt:formatDate value="${log.loginDate}" pattern="yyyy-MM-dd HH:mm:ss"/>
						</td>
						<td>${log.loginIp }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	<div class="pagination">
		<ul  style="float: right;" id="b_pagination"></ul></div>
	</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
	<br>		<br>
	<script>
	function cx(){
	      var code=document.getElementById("code").value;
	      location.href="/log/list/1?name="+code;
			}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}','${pages}', '${count}', '/log/list/','?name=${name}');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该权限吗?');
			$('.b_delete_authority').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>