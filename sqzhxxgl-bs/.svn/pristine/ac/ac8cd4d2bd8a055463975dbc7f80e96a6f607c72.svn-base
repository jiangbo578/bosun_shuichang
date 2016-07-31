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
    <li><a href="/wzsc/list/1">无照市场</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="wzsc:add">
	  <a style="float: right" href="/wzsc/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
	  </shiro:hasPermission>
	  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/wzsc/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	<shiro:hasPermission name="wzsc:add">
	  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/wzsc/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			
					<%--<tr>
					    <th colspan="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;村（居委）：${superman.cwh}</th>
					    <th colspan="2">操作</th>
						
					</tr>
					--%><tr>
					<tH>序号</tH>
					<th>市场名称</th>
					<th>主办方</th>
					<th>负责人</th>
					<th>联系电话</th>
					<th>经营地址</th>
					<th>经营内容</th>
					<th>场内经营户数</th>
					<th>房屋性质（是否违章）</th>
					<th>产权所有</th>
					<th>备注</th>
				<th>操作</th>
					</tr>
				
					<c:forEach var="wzsc"  items="${datas}" varStatus="num">
					
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${wzsc.scmc}</td>
					    <td>${wzsc.zbf}</td>
					    <td>${wzsc.fzr}</td>
					    <td>${wzsc.phone}</td>
					    <td>${wzsc.jydz}</td>
					    <td>${wzsc.jynr}</td>
					    <td>${wzsc.jyhs}</td>
					    <td>${wzsc.fwxz}</td>
					    <td>${wzsc.cqsy}</td>
						<td>${wzsc.remark}</td>
					<td>
							
							<div class="btn-group">
							<shiro:hasPermission name="wzsc:update">
							<a  class="btn " href="/wzsc/item/update/${wzsc.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="wzsc:delete">
							<a  class="btn  b_delete_wzsc_item" href="/wzsc/item/delete/${wzsc.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
						</div>
						
						</td>
					</tr>
					</c:forEach>
					<%--<tr>
					<th colspan="3">填报日期：${superman.tbrq}</th>
					
					<th colspan="9" align="right">填报人:${superman.tbr}</th>
					
					</tr>
				
			--%></tbody>
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
					'${pages}', '${count}', '/wzsc/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_wzsc_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>