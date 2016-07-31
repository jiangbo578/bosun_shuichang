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
    <li><a href="/gzldxz/list/1">各类工作领导小组名单</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="gzldxz:add">
		  <a style="float: right" href="/gzldxz/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		     <a style="float: right;margin-right: 31px;padding-left: 10px" href="/gzldxz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		     <shiro:hasPermission name="gzldxz:add">
	 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/gzldxz/list/1"><i class="icon-share-alt"></i> 返回</a>
	 </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="8%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">出生年月</th>
					<th width="10%">政治面貌</th>
					<th width="15%">地址</th>
					<th width="10%">担任职务</th>
					<th width="10%">分工职责</th>
					<th width="10%">备注</th>
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="gzldxzItem" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${gzldxzItem.xm }</td>
						<td>${gzldxzItem.xb }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${gzldxzItem.csny }'/></td>
						<td>${gzldxzItem.zzmm }</td>
						<td>${gzldxzItem.dz }</td>
						<td>${gzldxzItem.drzw }</td>
						<td>${gzldxzItem.fgzz }</td>
						<td>${gzldxzItem.bz }</td>
						<td>
							<div class="btn-group">
							<shiro:hasPermission name="gzldxz:update">
							<a  class="btn " href="/gzldxz/item/update/${gzldxzItem.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="gzldxz:delete">
							<a class="btn  b_delete_item" href="/gzldxz/item/delete/${gzldxzItem.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/gzldxz/item/', '/${businessFormId }');
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