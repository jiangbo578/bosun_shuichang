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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/wzspdwpc/list/1">无证食品单位季度隐患排查表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="wzspdwpc:add">
		<a style="float: right" href="/wzspdwpc/item/add/${businessFormId}/${superman.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		</shiro:hasPermission>
	  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/wzspdwpc/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	<shiro:hasPermission name="wzspdwpc:add">
	 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/wzspdwpc/list/1"><i class="icon-share-alt"></i> 返回</a>
	 </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			
					<tr>
					    <th colspan="11">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;村（居委）：${superman.cwh}</th>
					    <th>操作</th>
						
					</tr>
					<tr>
					<tH>序号</tH>
					<th>单位名称</th>
					<th>经营地址</th>
					<th>负责人</th>
					<th>联系电话</th>
					<th>类别</th>
					<th>经营情况</th>
					<th>上报镇食安办</th>
					<th>排查日期</th>
					<th>排查人</th>
					<th>备注</th>
				    <th></th>
					</tr>
				
					<c:forEach var="wzspdwpc"  items="${datas}" varStatus="num">
					
					<tr>
					  <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${wzspdwpc.dwmc}</td>
						<td>${wzspdwpc.jydz}</td>
						<td>${wzspdwpc.fzr}</td>
						<td>${wzspdwpc.phone}</td>
						<td>${wzspdwpc.lb}</td>
						<td>${wzspdwpc.jyqk}</td>
						<td>${wzspdwpc.sb}</td>
						<td>${wzspdwpc.pcrq}</td>
						<td>${wzspdwpc.pcr}</td>
						<td>${wzspdwpc.remark}</td>
					<td>
							
							<div class="btn-group">
							<shiro:hasPermission name="wzspdwpc:update">
							<a  class="btn " href="/wzspdwpc/item/update/${wzspdwpc.id }/${businessFormId }/${superman.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="wzspdwpc:delete">
							<a  class="btn  b_delete_wzspdwpc_item" href="/wzspdwpc/item/delete/${wzspdwpc.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
						</div>
						
						</td>
					</tr>
					</c:forEach>
					<tr>
					<th colspan="3">填报日期：${superman.tbrq}</th>
					
					<th colspan="9" align="right">填报人:${superman.tbr}</th>
					
					</tr>
				
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
					'${pages}', '${count}', '/wzspdwpc/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_wzspdwpc_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>