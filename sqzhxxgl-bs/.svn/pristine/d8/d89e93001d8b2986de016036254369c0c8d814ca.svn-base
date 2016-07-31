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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/szbj/list/1">四址边界</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="szbj:add">
		  <a style="float: right" href="/szbj/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/szbj/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	     <shiro:hasPermission name="szbj:add">
	     <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/szbj/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
			<tbody>
				<c:forEach items="${datas}" var="szbj" varStatus="num">
				 <tr>
				    <td width="7%" height="26">东至:</td>
				    <td width="30%">${szbj.dong}</td>
				    <td width="16%">(路)与</td>
				    <td width="31%">${szbj.dongyu}</td>
				    <td width="33%">(居委会)相邻</td>
				  </tr>
				  <tr>
				    <td height="25">南至:</td>
				    <td>${szbj.nan}</td>
				    <td>(路)与</td>
				    <td>${szbj.nanyu}</td>
				    <td>(居委会)相邻</td>
				  </tr>
				  <tr>
				    <td height="21">西至:</td>
				    <td>${szbj.xi}</td>
				    <td>(路)与</td>
				    <td>${szbj.xiyu}</td>
				    <td>(居委会)相邻</td>
				  </tr>
				  <tr>
				    <td height="27">北至:</td>
				    <td>${szbj.bei}</td>
				    <td>(路)与</td>
				    <td>${szbj.beiyu}</td>
				    <td>(居委会)相邻</td>
				  </tr>
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					
						<td colspan="7">
					<div class="btn-group">
					 <shiro:hasPermission name="szbj:update">
							<a  class="btn " href="/szbj/item/update/${szbj.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							 <shiro:hasPermission name="szbj:delete">
							<a class="btn  b_delete_item" href="/szbj/item/delete/${szbj.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/szbj/item/', '/${businessFormId }');
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