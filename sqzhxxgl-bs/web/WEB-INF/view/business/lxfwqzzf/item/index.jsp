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
    <li><a href="/lxfwqzzf/list/1">联系服务群众走访名册</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="lxfwqzzf:add">
		  <a style="float: right" href="/lxfwqzzf/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
         <a style="float: right;margin-right: 31px;padding-left: 10px" href="/lxfwqzzf/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
         <shiro:hasPermission name="lxfwqzzf:add">
         <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/lxfwqzzf/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				
				<tr>
					<th width="7%">序号</th>
					<th width="10%">责任区</th>
					<th width="8%">总户数</th>
					<th width="10%">门牌号码</th>
					<th width="10%">姓名</th>
					<th width="10%">职务</th>
					<th width="10%">联系方式</th>
					<th width="10%">备注</th>
				   <th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="lxfwqzzf" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${lxfwqzzf.zrq }</td>
						<td>${lxfwqzzf.zhs }</td>
						<td>${lxfwqzzf.mphh }</td>
						<td>${lxfwqzzf.xm }</td>
						<td>${lxfwqzzf.zw }</td>
						<td>${lxfwqzzf.lxfs }</td>
						<td>${lxfwqzzf.bz }</td>
						<td>
							<div class="btn-group">
							<!--  href="/lxfwqzzf/item/detail/${lxfwqzzf.id}/${businessFormId}"  -->
							<a class="btn " onclick="show('${lxfwqzzf.id}')"><i class="icon-eye-open"></i>查看走访人</a>
							<shiro:hasPermission name="lxfwqzzf:update">
							<a  class="btn " href="/lxfwqzzf/item/update/${lxfwqzzf.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="lxfwqzzf:delete">
							<a class="btn  b_delete_item" href="/lxfwqzzf/item/delete/${lxfwqzzf.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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

	function show(id){
		parent.$.jBox("iframe:/lxfwqzzf/item/zl/1/"+id, {
	    title: "用户管理",
	    width: 1000,
	    height: 450,
	    buttons: { '关闭': true }
	});
	}
	
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/lxfwqzzf/item/', '/${businessFormId }');
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