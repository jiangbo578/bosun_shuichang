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

    <li class="active">权限列表</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>权限列表</strong> 
  
   
  </div>
	<div class="container">
	
	
	  <input type="text" name="code" id="code">   <a style="margin-bottom: 10px" class="btn" type="submit" onclick="cx()"><i class="icon-search"></i>查询</a>
	
		<a class="btn btn-success" style="margin-bottom: 10px" href="/authority/add"><i class="icon-plus"></i>添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="25%">名称</th>
					<th width="15%">标识</th>
					<th width="15%">功能链接</th>
					<th width="15%">描述</th>
					<th width="35%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="authority" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${authority.name }</td>
						<td>${authority.code }</td>
						<td>${authority.path }</td>
						<td>${authority.description }</td>
						<td>
							<div class="btn-group">
							<a  class="btn" href="/authority/update/${authority.id }"><i class="icon-edit"></i>修改</a>
							<a href="/authority/delete/${authority.id }" class="btn b_delete_authority"><i class="icon-trash"></i>删除</a>
						</div>
						</td>
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
      location.href="/authority/1/"+code;
		}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/authority/','/${code}');
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