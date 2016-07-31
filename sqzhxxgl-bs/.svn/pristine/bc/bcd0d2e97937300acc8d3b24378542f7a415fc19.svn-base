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
    <li><a href="/dyzyzcjhd/list/1">党员志愿者参与活动情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="dyzyzcjhd:add">
		  <a style="float: right" href="/dyzyzcjhd/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/dyzyzcjhd/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="dyzyzcjhd:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/dyzyzcjhd/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="10%">在职/在册</th>
					<th width="15%">特长情况</th>
				   <th width="10%">参加活动次数</th>
					<th width="10%">星级档次</th>
					<th width="20%">备注</th>
					
					<th width="30%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="dyzyzcjhd" varStatus="num">
					<tr>
					     <td>${num.count+(size *(current-1))}</td>
						<td>${dyzyzcjhd.name}</td>
						<td>${dyzyzcjhd.zc}</td>
						<td>${dyzyzcjhd.tcqk}</td>
						<td>${dyzyzcjhd.cjhdcs}</td>
						<td>${dyzyzcjhd.xjdc}</td>
						<td>${dyzyzcjhd.remark}</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="dyzyzcjhd:update">
							<a  class="btn " href="/dyzyzcjhd/item/update/${dyzyzcjhd.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
						</shiro:hasPermission>
						<shiro:hasPermission name="dyzyzcjhd:delete">
							<a class="btn  b_delete_dyzyzcjhd_item" href="/dyzyzcjhd/item/delete/${dyzyzcjhd.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/dyzyzcjhd/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_dyzyzcjhd_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>