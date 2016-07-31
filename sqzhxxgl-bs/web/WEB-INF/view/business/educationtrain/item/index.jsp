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
    <li><a href="/educationtrain/list/1">妇女教育培训情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="educationtrain:add">
		  <a style="float: right" href="/educationtrain/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/educationtrain/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="educationtrain:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/educationtrain/list/1"><i class="icon-share-alt"></i> 返回</a>
		  </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">日期</th>
					<th width="15%">活动内容</th>
					<th width="5%">参加人数</th>
					<th width="10%">活动效果</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="educationtrain" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${educationtrain.date }'/></td>
						<td>${educationtrain.content}</td>
						<td>${educationtrain.count}</td>
						<td>${educationtrain.result}</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="educationtrain:update">
							<a  class="btn " href="/educationtrain/item/update/${educationtrain.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="educationtrain:delete">
							<a class="btn  b_delete_educationtrain_item" href="/educationtrain/item/delete/${educationtrain.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/educationtrain/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_educationtrain_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>