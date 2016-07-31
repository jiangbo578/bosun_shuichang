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
  <li><a href="/organization/list/1">组织机构</a> <span class="divider">/</span></li>

    <li class="active"><i class="icon-align-left"></i>职能部门</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
   			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>职能部门</strong> 
  
   
  </div>
	<div class="container">
		<a style="margin-bottom: 10px"  class='btn btn-success'  href="/organization/bsc/add/${parentId}"><i class="icon-plus"></i>添加</a>
		<p>父组织结构：<a href="/organization/list/1">${parentName }</a></p>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="8%">序号</th>
					<th width="15%">名称</th>
					<th width="15%">描述</th>
					<th width="47%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="organization" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${organization.name }</td>
						<td>${organization.description }</td>
						<td>
						<div class="btn-group">
							<a class="btn" href="/organization/bsc/update/${organization.id }/${parentId }"><i class="icon-edit"></i>修改</a>
							<a href="/organization/bsc/delete/${organization.id }/${parentId }" class="btn b_delete_organization"><i class="icon-trash"></i>删除</a>
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
	<jsp:include page="/page/footer.jsp"></jsp:include><br>		<br><br>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/organization/bsc/${parentId }/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该组织结构吗?');
			$('.b_delete_organization').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
			parent.iFrameHeight();
	</script>
</body>
</html>