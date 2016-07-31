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
    <li><a href="/dwdc/list/1">村委社会单位（场所）底册</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="dwdc:add">
		 <a style="float: right" href="/dwdc/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		 </shiro:hasPermission>
	     <a style="float: right;margin-right: 31px;padding-left: 10px" href="/dwdc/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	    <shiro:hasPermission name="dwdc:add">
	     <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/dwdc/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
					<tr>
					<th width="5%">序号</th>
					<th width="18%">住宅小区名称</th>
					<th width="13%">单位地址</th>
					<th width="13%">联系人</th>
					<th width="13%">联系方式</th>
					<th width="13%">登记年份</th>
					<th width="13%">操作</th>
			
					
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="dwdc" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${dwdc.xqmc}</td>
						<td>${dwdc.dwdz}</td>
						<td>${dwdc.lxr}</td>
						<td>${dwdc.lxfs}</td>
						<td>${dwdc.djnf}</td>
							<td>
							
							<div class="btn-group">
							<a class="btn " onclick="show('${dwdc.id}')"><i class="icon-eye-open"></i>单位基本情况</a>
							<shiro:hasPermission name="dwdc:update">
							<a  class="btn" href="/dwdc/item/update/${dwdc.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="dwdc:delete">
							<a  class="btn  b_delete_dwdc_item" href="/dwdc/item/delete/${dwdc.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
	function show(id){
		parent.$.jBox("iframe:/dwdc/item/many/1/"+id, {
	    title: "单位基本情况",
	    width: 1000,
	    height: 450,
	    buttons: { '关闭': true }
	});
	}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/dwdc/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_dwdc_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>