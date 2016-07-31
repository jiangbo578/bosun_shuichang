<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/cwgkxz/list/1">村务公开小组成员名单</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="cwgkxz:add">
		  <a style="float: right" href="/cwgkxz/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
         <a style="float: right;margin-right: 31px;padding-left: 10px" href="/cwgkxz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="cwgkxz:add">
		 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/cwgkxz/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="10%">序号</th>
					<th width="10%">职务</th>
					<th width="10%">姓名</th>
					<th width="10%">性别</th>
					<th width="10%">年龄</th>
					<th width="10%">文化程度</th>
					<th width="10%">政治面貌</th>
					<th width="10%">现任职务</th>
					<th width="10%">电话</th>
					<th width="10%"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="cwgkxz" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${cwgkxz.zw}</td>
						<td>${cwgkxz.xm}</td>
						<td>${cwgkxz.xb}</td>
						<td>${cwgkxz.nl}</td>
						<td>${cwgkxz.whcd}</td>
						<td>${cwgkxz.zzmm}</td>
						<td>${cwgkxz.xrzw}</td>
						<td>${cwgkxz.lxdh}</td>
						<td>
					<div class="btn-group">
					<shiro:hasPermission name="cwgkxz:update">
							<a  class="btn " href="/cwgkxz/item/update/${cwgkxz.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="cwgkxz:delete">
							<a class="btn  b_delete_item" href="/cwgkxz/item/delete/${cwgkxz.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	</div>

  </div>

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/cwgkxz/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>