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
    <li><a href="/wszcqk/list/1">卫生自查情况记录表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="wszcqk:add">
		  <a style="float: right" href="/wszcqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
	      <a style="float: right;margin-right: 31px;padding-left: 10px" href="/wszcqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	      <shiro:hasPermission name="wszcqk:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/wszcqk/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			 <tr>
    <th width="12%" rowspan="2"><div align="center">检查时间</div></th>
    <th width="18%"><p >小区环境</p></th>
    <th width="15%"><p >垃圾箱房</p></th>
    <th width="12%"><p >公厕</p></th>
    <th width="26%"><p >公用部位</p></th>
    <th width="17%"><p >四害防制</p></th>
    <th width="17%"><p >操作</p></th>
  </tr>
  <tr>
    <th><p >存在问题整改情况</p></th>
    <th><p >存在问题整改情况</p></th>
    <th><p >存在问题整改情况</p></th>
    <th><p >存在问题整改情况</p></th>
    <th><p >存在问题整改情况</p></th>
    <th></th>
  </tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="wszcqk" varStatus="num">
					<tr>
						<td>${wszcqk.jcsj}</td>
						<td>${wszcqk.xqhj}</td>
						<td>${wszcqk.ljxf}</td>
						<td>${wszcqk.gc}</td>
						<td>${wszcqk.gybw}</td>
						<td>${wszcqk.shfz}</td>
							<td>
							<div class="btn-group">
							<shiro:hasPermission name="wszcqk:update">
							<a  class="btn " href="/wszcqk/item/update/${wszcqk.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="wszcqk:delete">
							<a  class="btn  b_delete_wszcqk_item" href="/wszcqk/item/delete/${wszcqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/wszcqk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_wszcqk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>