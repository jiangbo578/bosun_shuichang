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
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
    <li><a href="/ywpx/list/1">业务培训（学习）记录</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>
<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  </div>
  <div id="panbody">
	<div class="container" >
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="ywpx:add">
		  <a style="float: right" href="/ywpx/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/ywpx/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	   <shiro:hasPermission name="ywpx:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/ywpx/list/1"><i class="icon-share-alt"></i> 返回</a>
    	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="7%">培训学习内容</th>
					<th width="10%">地点</th>
					<th width="7%">时间</th>
					<th width="7%">主讲人或召集人</th>
					<th width="7%">出席范围</th>
					<th width="7%">人数</th>
					<th width="7%">办班名称</th>
					<th width="7%">教学课时</th>
					<th width="7%">标准人数</th>
					<th width="7%">培训期限</th>
					<th width="7%">类别</th>
					<th width="7%">所属业务条数</th>
					<th width="10">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="ywpx" varStatus="num">
					<tr>
						<td>${num.count + size * (current-1)}</td>
						<td>${ywpx.pxnr }</td>
						<td>${ywpx.dd }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${ywpx.sj }'/></td>
						<td>${ywpx.zjr }</td>
						<td>${ywpx.cxfw }</td>
						<td>${ywpx.rs }</td>
						<td>${ywpx.bbmc }</td>
						<td>${ywpx.jxks }</td>
						<td>${ywpx.bzrs }</td>
						<td>${ywpx.pxqx }</td>
						<td>${ywpx.type }</td>
						<td>${ywpx.ssywx }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="ywpx:update">
							<a  class="btn " href="/ywpx/item/update/${ywpx.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="ywpx:delete">
							<a class="btn  b_delete_ywpx_item" href="/ywpx/item/delete/${ywpx.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/ywpx/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_ywpx_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>