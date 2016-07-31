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

    <li class="active"><i class="icon-align-left"></i>组织机构</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>组织机构</strong> 
  
   
  </div>
	<div class="container">
		<a style="margin-bottom: 10px"  class='btn btn-success' href="/organization/add"><i class="icon-plus"></i>添加</a>
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
				<tr style="background-color: #d9534f">
						<td  style="background-color: #d9534f">999</td>
						<td  style="background-color: #d9534f">上海市嘉定区</td>
						<td  style="background-color: #d9534f">区政府</td>
						<td >
						<a class='btn' href="/organization/bsc/d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"><i class="icon-align-left"></i>职能部门</a>
						</td>
					</tr>
					
				<c:forEach items="${datas }" var="organization" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${organization.name }</td>
						<td>${organization.description }</td>
						<td>
						<div class="btn-group">
							<a class="btn" href="/organization/update/${organization.id }"><i class="icon-edit"></i>修 改</a>
							<a class="btn b_delete_organization" href="/organization/delete/${organization.id }" ><i class="icon-trash"></i>删除</a>
							<a class="btn" href="/organization/child/${organization.id }"><i class="icon-random"></i>子机构</a>
							<a class="btn" href="/organization/bsc/${organization.id }"><i class="icon-align-left"></i>职能部门</a>
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
					'${pages}', '${count}', '/organization/list/');
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