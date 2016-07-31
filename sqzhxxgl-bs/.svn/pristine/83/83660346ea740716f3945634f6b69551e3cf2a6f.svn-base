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
    <li><a href="/fudaiwy/list/1">妇代会委员名单</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="fudaiwy:add">
		  <a style="float: right" href="/fudaiwy/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/fudaiwy/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		<shiro:hasPermission name="fudaiwy:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/fudaiwy/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="7%">姓名</th>
					<th width="5%">性别</th>
					<th width="5%">职务</th>
					<th width="8%">出生年月</th>
					<th width="8%">任职时间</th>
					<th width="7%">民族</th>
					<th width="10%">文化程度</th>
					<th width="15%">家庭住址</th>
					
					<th width="10%">电话</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="fudaiwy" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${fudaiwy.xm}</td>
						<td>${fudaiwy.xb}</td>
						<td>${fudaiwy.duty}</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${fudaiwy.csny }'/></td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${fudaiwy.rzsj }'/></td>
						<td>${fudaiwy.mz}</td>
						<td>${fudaiwy.whcd}</td>
						<td>${fudaiwy.jtzz}</td>
						<td>${fudaiwy.phone}</td>
						
						<td>
								<div class="btn-group">
								<shiro:hasPermission name="fudaiwy:update">
							<a  class="btn " href="/fudaiwy/item/update/${fudaiwy.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="fudaiwy:delete">
							<a class="btn  b_delete_item" href="/fudaiwy/item/delete/${fudaiwy.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/fudaiwy/item/', '/${businessFormId }');
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