<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<script type="text/javascript">
	function openWin(url)
	{
		if(null!=url && url!="")
		{
			　window.open (url, "", "height=500, width=800, toolbar =no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
		}
	}
</script>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/aidingwork/list/1">妇女就业创业工作情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="aidingwork:add">
		  <a style="float: right" href="/aidingwork/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/aidingwork/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		  <shiro:hasPermission name="aidingwork:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/aidingwork/list/1"><i class="icon-share-alt"></i> 返回</a>
	      </shiro:hasPermission>		  
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="5%">年龄</th>
					<th width="10%">家庭地址</th>
					<th width="15%">联系方式</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="aidingwork" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${aidingwork.xm}</td>
						<td>${aidingwork.xb}</td>
						<td>${aidingwork.age}</td>
						<td>${aidingwork.jtzz}</td>
						<td>${aidingwork.phone}</td>
						<td>
						
						<div class="btn-group">
						<shiro:hasPermission name="aidingwork:update">
							<a  class="btn " href="/aidingwork/item/update/${aidingwork.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
						</shiro:hasPermission>
					<shiro:hasPermission name="aidingwork:delete">
							<a class="btn  b_delete_item" href="/aidingwork/item/delete/${aidingwork.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
							<a class="btn " href="javascript:void(0)" onclick="openWin('/aidingwork/${aidingwork.id}/aidingrecord/1');">帮困记录</a>
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
					'${pages}', '${count}', '/aidingwork/item/', '/${businessFormId }');
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