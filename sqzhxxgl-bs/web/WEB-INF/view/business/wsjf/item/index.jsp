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
    <li><a href="/wsjf/list/1">卫生经费使用情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="wsjf:add">
		  		  <a style="float: right" href="/wsjf/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  		  </shiro:hasPermission>
	              <a style="float: right;margin-right: 31px;padding-left: 10px" href="/wsjf/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	              <shiro:hasPermission name="wsjf:add">
	              <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/wsjf/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			 <tr>
                    <th width="5%">序号</th>
					<th width="10%">使用日期</th>
					<th width="15%">用途</th>
					<th width="10%">金额</th>
					
					<th width="20%">操作</th>
  </tr>
			</thead>
			<tbody>
		<%--	<c:set value="0" var="sum" scope="session"></c:set> --%>
				<c:forEach items="${datas }" var="wsjf" varStatus="num">
					<tr>
			<%--		<c:set value="${sum+wsjf.price}" var="sum"></c:set>--%>
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${wsjf.syrq}</td>
						<td>${wsjf.yt}</td>
						<td>${wsjf.price}</td>
							<td>
							<div class="btn-group">
							<shiro:hasPermission name="wsjf:update">
							<a  class="btn " href="/wsjf/item/update/${wsjf.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="wsjf:delete">
							<a  class="btn  b_delete_wsjf_item" href="/wsjf/item/delete/${wsjf.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
						</div>
						
						</td>
					</tr>
				</c:forEach>
				
			</tbody>
		</table>
		<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		<p>合计：${sum}</p>
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
					'${pages}', '${count}', '/wsjf/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_wsjf_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>