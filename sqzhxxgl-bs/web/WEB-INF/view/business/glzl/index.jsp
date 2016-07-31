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
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
    <li><a href="/glzl/list/1">各类资料发放记录</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <a style="float: right" href="/glzl/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
	      <a style="float: right;margin-right: 31px;padding-left: 10px" href="/glzl/item/export" class="btn btn-info"><i class="icon-print"></i>导出</a>
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/taizhang/list/5"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover" style="TABLE-LAYOUT:fixed;WORD-BREAK:break-all">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">单位</th>
					<th width="10%">内容</th>
					<th width="15%">签收</th>
					<th width="15%">数量</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="glzl" varStatus="num">
					<tr>
					
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${glzl.dw }</td>
					    <td>${glzl.nr }</td>
					    <td>${glzl.qs}</td>
					    <td>${glzl.sl}</td>
					 
						<td>
							<div class="btn-group">
							<a  class="btn " href="/glzl/update/${glzl.id }/${businessFormId }"><i class="icon-pencil"></i>修改内容</a>
							<a  class="btn  b_delete_glzl_item" href="/glzl/delete/${glzl.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/glzl/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_glzl_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>