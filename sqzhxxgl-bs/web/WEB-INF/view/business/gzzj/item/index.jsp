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
    <li><a href="/gzzj/list/1">工作总结</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <a style="float: right" href="/gzzj/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		   <a style="float: right;margin-right: 31px;padding-left: 10px" href="/gzzj/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/gzzj/list/1"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">增加时间</th>
					<th width="15%">记录人</th>
					<th width="15%">类型</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="gzzj" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${gzzj.insertDate}'/></td>
						<td>${gzzj.jlr}</td>
						<td>${gzzj.type}</td>
						<td>
							<div class="btn-group">
						    <a class="btn"  href="/gzzj/detail/${gzzj.id }"><i class="icon-eye-open"></i>详情</a>
							<a  class="btn " href="/gzzj/item/update/${gzzj.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							<a class="btn  b_delete_item" href="/gzzj/item/delete/${gzzj.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/gzzj/item/', '/${businessFormId }');
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