<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/hszyjjhd/list/1">红十字应急救护队名册</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="hszyjjhd:add">
		  		  <a style="float: right" href="/hszyjjhd/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  		  </shiro:hasPermission>
                  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/hszyjjhd/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	              <shiro:hasPermission name="hszyjjhd:add">
	              <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/hszyjjhd/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
					<th width="5%">序号</th>
					
					<th width="8%">姓名</th>
					<th width="5%">性别</th>
					<th width="8%">出生年月</th>
					<th width="15%">住址</th>
					<th width="15%">工作单位</th>
					<th width="8%">联系电话</th>
					
					<th width="10%">备注</th>
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="hszyjjhd" varStatus="num">
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${hszyjjhd.name}</td>
						<td>${hszyjjhd.sex}</td>
						<td>${hszyjjhd.birthday}</td>
						<td>${hszyjjhd.address}</td>
						<td>${hszyjjhd.gzdw}</td>
						<td>${hszyjjhd.phone}</td>
						<td>${hszyjjhd.bz}</td>
							<td>
							
							<div class="btn-group">
							<shiro:hasPermission name="hszyjjhd:update">
							<a  class="btn " href="/hszyjjhd/item/update/${hszyjjhd.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="hszyjjhd:delete">
							<a  class="btn  b_delete_hszyjjhd_item" href="/hszyjjhd/item/delete/${hszyjjhd.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/hszyjjhd/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_hszyjjhd_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>