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
   <li><a href="/organization/list/1"><i class="icon-align-left"></i>组织机构</a> <span class="divider">/</span></li>
 <li><a href="javascript:window.history.go(-1)">组织机构</a> <span class="divider">/</span></li>

    <li class="active">子机构</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  		<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>子结构</strong> 
  
   
  </div>
	<div class="container">
		<a  class="btn btn-success" style="margin-bottom: 10px"  href="/organization/child/add/${parentId}"><i class="icon-plus"></i>添加</a>
		<p>父组织结构：<i class="icon-align-left"></i><a href="/organization/1">${parentName }</a></p>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="8%">序号</th>
					<th width="15%">名称</th>
					<th width="15%">描述</th>
					<th width="15%">类别</th>
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
							<c:choose>
								<c:when test="${organization.flag eq null}">未选择</c:when>
								<c:when test="${organization.flag eq '1'}">居委</c:when>
								<c:when test="${organization.flag eq '0'}">村委</c:when>
							</c:choose>						
						</td>
						<td>
							<div class="btn-group">
							<a  class="btn " href="/organization/child/update/${organization.id }/${parentId }"><i class="icon-edit"></i>修改</a>
							<a  class="btn b_delete_organization" href="/organization/child/delete/${organization.id }/${parentId }"><i class="icon-trash"></i>删除</a>
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
	<br>		<br><br/>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/organization/child/${parentId }/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该组织结构吗?');
			$('.b_delete_organization').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>