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
    <li><a href="/xzpmt/list/1">行政村平面图</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		 <shiro:hasPermission name="xzpmt:add">
		  <a style="float: right" href="/xzpmt/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
         <a style="float: right;margin-right: 31px;padding-left: 10px" href="/xzpmt/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	<shiro:hasPermission name="xzpmt:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/xzpmt/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
	
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="10%">序号</th>
					<th width="10%">记录时间</th>
					<th width="10%">记录人</th>
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="xzpmt" varStatus="num">
					<tr>
						<td>${num.count + size * (current-1)}</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${xzpmt.insertDate}'/></td>
						<td>${xzpmt.jlr}</td>
						<td>
							<div class="btn-group">
							<a class="btn"  href="/xzpmt/item/detail/${xzpmt.id }"><i class="icon-eye-open"></i>详情</a>
							<shiro:hasPermission name="xzpmt:update">
							<a  class="btn " href="/xzpmt/item/update/${xzpmt.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="xzpmt:delete">
							<a class="btn  b_delete_item" href="/xzpmt/item/delete/${xzpmt.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
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

  </div>

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/xzpmt/item/', '/${businessFormId }');
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