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
    <li><a href="/kndyqk/list/1">困难党员情况名册</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container"  >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="kndyqk:add">
		  <a style="float: right" href="/kndyqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
         <a style="float: right;margin-right: 31px;padding-left: 10px" href="/kndyqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
         <shiro:hasPermission name="kndyqk:add">
         <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/kndyqk/list/1"><i class="icon-share-alt"></i> 返回</a>
         </shiro:hasPermission>
		<table class="table  table-striped table-bordered table-hover footable" style="margin-top: 10px" data-filter="#filter" data-page-size="5" data-page-previous-text="prev" data-page-next-text="next" >
			<thead>
				<tr><!-- 姓名	性别	出生年月								-->
					<th  data-toggle="true" >序号</th>
					<th data-hide="phone">姓名</th>
					<th data-hide="phone">性别</th>
					<th data-hide="phone">出生年月</th>
					<th data-hide="phone">文化程度</th>
					<th data-hide="phone,tablet">健康状况</th>
					<th data-hide="phone,tablet">家庭住址</th>
					<th data-hide="phone">联系电话</th>
					<th data-hide="phone,tablet">困难情况</th>
					<th data-hide="phone">结对党员姓名</th>
					<th data-hide="phone">联系电话</th>
					<th data-hide="phone,tablet">结对时间 </th>
					<th data-hide="phone">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="kndyqkItem" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${kndyqkItem.xm }</td>
						<td>${kndyqkItem.xb }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${kndyqkItem.csny }'/></td>
						<td>${kndyqkItem.whcd }</td>
						<td>${kndyqkItem.jkzk }</td>
						<td>${kndyqkItem.jtzz }</td>
						<td>${kndyqkItem.phone }</td>
						<td>${kndyqkItem.knqk }</td>
						<td>${kndyqkItem.jddyxm }</td>
						<td>${kndyqkItem.jdphone }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${kndyqkItem.jdsj }'/></td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="kndyqk:update">
							<a  class="btn " href="/kndyqk/item/update/${kndyqkItem.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="kndyqk:delete">
							<a class="btn  b_delete_kndyqk_item" href="/kndyqk/item/delete/${kndyqkItem.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
<jsp:include page="/page/ftable.jsp"></jsp:include>

	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/kndyqk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_kndyqk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
		     
	</script>
	
</body>
</html>