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
    <li><a href="/ggwgz/list/1">关工委工作</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <a style="float: right" href="/ggwgz/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  
<a style="float: right;margin-right: 31px;padding-left: 10px" href="/ggwgz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
<a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/ggwgz/list/1"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">活动内容</th>
					<th width="15%">活动时间</th>
					<th width="10%">参加老干部人数</th>
					<th width="10%">参加青少年人数</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="ggwgz" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${ggwgz.content }</td>
						<td>${ggwgz.date }</td>
						<td>${ggwgz.oldCount }</td>
						<td>${ggwgz.newCount }</td>
						<td>
						<div class="btn-group">
							<a  class="btn " href="/ggwgz/item/update/${ggwgz.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							<a class="btn  b_delete_ggwgz_item" href="/ggwgz/item/delete/${ggwgz.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/ggwgz/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_ggwgz_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>