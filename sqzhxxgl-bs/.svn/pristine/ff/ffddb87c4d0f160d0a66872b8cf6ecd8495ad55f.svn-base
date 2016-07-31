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
    <li><a href="/jkqk/list/1">捐款（捐物）情况记录</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <a style="float: right" href="/jkqk/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
	      <a style="float: right;margin-right: 31px;padding-left: 10px" href="/jkqk/item/export" class="btn btn-info"><i class="icon-print"></i>导出</a>
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/taizhang/list/5"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
					
					<th width="5%">序号</th>
					<th width="10%">日期</th>
					<th width="15%">捐赠单位(或个人)</th>
					<th width="15%">地址</th>
					<th width="15%">电话</th>
					<th width="10%">金额(元)</th>
					<th width="10%">物品名称</th>
					<th width="8%">物品(件)</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="jkqk" varStatus="num">
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${jkqk.rq }</td>
					    <td>${jkqk.dw }</td>
					     <td>${jkqk.dz}</td>
					      <td>${jkqk.phone }</td>
					       <td>${jkqk.price}</td>
					        <td>${jkqk.wpmc }</td>
					         <td>${jkqk.wp}</td>
						<td>
							<div class="btn-group">
						
							<a  class="btn " href="/jkqk/update/${jkqk.id }/${businessFormId }"><i class="icon-pencil"></i>修改内容</a>
							<a  class="btn  b_delete_jkqk_item" href="/jkqk/delete/${jkqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/jkqk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_jkqk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>