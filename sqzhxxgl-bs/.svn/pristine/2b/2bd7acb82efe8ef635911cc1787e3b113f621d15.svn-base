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
    <li><a href="/taizhang/list/2">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/wptz/list/1">田间窝棚台帐</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="wptz:add">
		 <a style="float: right" href="/wptz/item/add/${businessFormId}/${superman.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		 </shiro:hasPermission>
	<a style="float: right;margin-right: 31px;padding-left: 10px" href="/wptz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	<shiro:hasPermission name="wptz:add">
	 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/wptz/list/1"><i class="icon-share-alt"></i> 返回</a>
	 </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;">
			<thead>
			
			
					<tr>
					    <th colspan="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;村（居委）：${superman.cwh}</th>
					  
					</tr>
					<tr>
					<tH width="5%">序号</tH>
					<th width="10%">村/合作社</th>
					<th width="8%">窝棚位置</th>
					<th width="8%">面积(㎡)</th>
					<th width="8%">居住人数</th>
					<th width="8%">生产领域</th>
					<th width="15%">生产规模(亩)</th>
					<th width="6%">搭建人</th>
					<th  width="12%">土地租赁期限</th>
					<th  width="8%">土地性质</th>
					<th width="8%">联系方式</th>
				     <th width="5%">存量</th>
				    <th width="5%">新建</th>
				    <th width="8%">已整治</th>
				   <th width="10%" >操作</th>
				 	</tr>
				
					<c:forEach var="wptz"  items="${datas}" varStatus="num">
					
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${wptz.hzs}</td>
					    <td>${wptz.wpwz}</td>
					    <td>${wptz.mj}</td>
					    <td>${wptz.jzrs}</td>
					    <td>${wptz.ly}</td>
					    <td>${wptz.gm}</td>
					    <td>${wptz.djr}</td>
					    <td>${wptz.tdqx}</td>
					    <td>${wptz.tdxz}</td>
						<td>${wptz.lxfs}</td>
						<td><c:if test="${wptz.zzqk=='存量'}">√</c:if></td>
						<td><c:if test="${wptz.zzqk=='新建'}">√</c:if></td>
						<td><c:if test="${wptz.zzqk=='已整治'}">√</c:if></td>
					<td>
							<div class="btn-group">
							<shiro:hasPermission name="wptz:update">
							<a  class="btn " href="/wptz/item/update/${wptz.id }/${businessFormId }/${superman.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="wptz:delete">
							<a  class="btn  b_delete_wptz_item" href="/wptz/item/delete/${wptz.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
						</div>
						
						</td>
					</tr>
					</c:forEach>
					<tr>
					  <th colspan="3">合计</th>
					   
					        <th>${tb.mj}</th>
					        <th>${tb.jzrs}</th>
					        <th></th>
					        <th>${tb.gm }</th>					             
					        <th colspan="4"></th>
					       
					        <th>${cl }</th>
					        <th>${xj }</th>
					        
					        <th>${yzz}</th>
					        <th></th>
					         
					              
					</tr>
					<tr>
					<th colspan="3">填报日期：${superman.tbrq}</th>
					
					<th colspan="14" align="right">填报人:${superman.tbr}</th>
					
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
					'${pages}', '${count}', '/wptz/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_wptz_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>