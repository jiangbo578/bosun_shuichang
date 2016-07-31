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
    <li><a href="/gdzctz/list/1">固定资产台账</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="gdzctz:add">
		  <a style="float: right" href="/gdzctz/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/gdzctz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	      <shiro:hasPermission name="gdzctz:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/gdzctz/list/1"><i class="icon-share-alt"></i> 返回</a>
	      </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<tbody>
				<c:forEach items="${datas }" var="gdzctz" varStatus="num">
								<tr>
					<th>资产编号：</th>
					<td>${ gdzctz.zcbh }</td>
					<th>资产名称：</th>
					<td>${ gdzctz.zcmc } </td>
					<th>使用年限（月）</th>
					<td>${ gdzctz.synx }</td>
				</tr>
				<tr>
					<th>资产类别：</th>
					<td>${ gdzctz.zclb }</td>
					<th>开始使用日期：</th>
					<td>${ gdzctz.kssyrq }</td>
					<th>增加方式：</th>
					<td>${ gdzctz.zjfs }</td>
				</tr>
				<tr>
					<th>使用状态：</th>
					<td>${ gdzctz.syzt }</td>
					<th>折旧方法：</th>
					<td>${ gdzctz.zzjfs } </td>
					<th>折旧周期：</th>
					<td>${ gdzctz.zjzq }</td>
				</tr>
				<tr>
					<th>月折旧率：</th>
					<td>${ gdzctz.yzjl }</td>
					<th>原值：</th>
					<td>${ gdzctz.yz } </td>
					<th>净残值率：</th>
					<td>${ gdzctz.jczl } </td>
				</tr>
				<tr>
					<th>净残值：</th>
					<td>${ gdzctz.jcz }</td>
					<th>已提折旧月份：</th>
					<td>${ gdzctz.ytzjyf } </td>
					<th>累计折旧：</th>
					<td>${ gdzctz.ljzj }</td>
				</tr>
				<tr>
					<th>净值：</th>
					<td>${ gdzctz.jz }</td>
					<th>计量单位：</th>
					<td>${ gdzctz.jldw }</td>
					<th>数量：</th>
					<td>${ gdzctz.sl }</td>
				</tr>
				<tr>
					<th>单价：</th>
					<td>${ gdzctz.dj }</td>
					<th>规格型号：</th>
					<td>${ gdzctz.ggxh } </td>
					<th>责任部门：</th>
					<td>${ gdzctz.zrbm }</td>
				</tr>
				<tr>
					<th>责任人：</th>
					<td>${ gdzctz.zrr }</td>
					<th>折旧对应科目：</th>
					<td>${ gdzctz.zjdykm } </td>
					<th>累计折旧科目：</th>
					<td>${ gdzctz.ljzjkm } </td>
				</tr>
				<tr>
					<th>存放地点：</th>
					<td>${ gdzctz.cfdd }</td>
					<th>备注：</th>
					<td>${ gdzctz.bz } </td>
					<th>登记人：</th>
					<td>${ gdzctz.djr }</td>
				</tr>
					<tr>
					
					<th>日期：</th>
					<td>${ gdzctz.rq }</td>
					<th>月折旧额</th>
					<td>${gdzctz.yzje}</td>
					<th></th>
					<shiro:hasPermission name="gdzctz:delete">
					<td><a  class="btn " href="/gdzctz/item/update/${gdzctz.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a><a class="btn  b_delete_item" href="/gdzctz/item/delete/${gdzctz.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a></td>
				</shiro:hasPermission>
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
					'${pages}', '${count}', '/gdzctz/item/', '/${businessFormId }');
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