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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/dyzzgxzr/list/1">党员组织关系转入</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="dyzzgxzr:add">
		  <a style="float: right" href="/dyzzgxzr/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/dyzzgxzr/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
          <shiro:hasPermission name="dyzzgxzr:add">
          <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/dyzzgxzr/list/1"><i class="icon-share-alt"></i> 返回</a>
		  </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">转入时间</th>
					<th width="5%">姓名</th>
					<th width="5%">性别</th>
					<th width="15%">由何单位调入</th>
					<th width="10%">是否正式党员</th>
					<th width="15%">联系电话</th>
					<th width="15%">备注</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="dyzzgxzr" varStatus="num">
					<tr>
						<td>${num.count }</td>
						<td>${dyzzgxzr.zrrq}</td>
						<td>${dyzzgxzr.name}</td>
						<td>${dyzzgxzr.sex}</td>
						<td>${dyzzgxzr.dwtr}</td>
						<td>${dyzzgxzr.sfzsdy}</td>
						<td>${dyzzgxzr.phone}</td>
						<td>${dyzzgxzr.remark}</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="dyzzgxzr:update">
							<a  class="btn " href="/dyzzgxzr/item/update/${dyzzgxzr.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="dyzzgxzr:delete">
							<a class="btn  b_delete_dyzzgxzr_item" href="/dyzzgxzr/item/delete/${dyzzgxzr.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/dyzzgxzr/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_dyzzgxzr_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>