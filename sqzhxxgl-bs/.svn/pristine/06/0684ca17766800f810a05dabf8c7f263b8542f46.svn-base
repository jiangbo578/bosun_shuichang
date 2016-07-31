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
    <li><a href="/ffxymp/list/1">非法行医情况排摸信息表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="ffxymp:add">
		  <a style="float: right" href="/ffxymp/item/add/${businessFormId}/${superman.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
	      <a style="float: right;margin-right: 31px;padding-left: 10px" href="/ffxymp/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	      <shiro:hasPermission name="ffxymp:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/ffxymp/list/1"><i class="icon-share-alt"></i> 返回</a>
	      </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			
					<tr>
					    <th colspan="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;村（居委）：${superman.cwh}</th>
					    <th colspan="2">操作</th>
						
					</tr>
					<tr>
					<tH  width="5%">序号</tH>
					<th width="10%">村（居）委</th>
					<th width="15%">地址</th>
					<th width="8%">房屋性质</th>
					<th width="10%">行医人姓名</th>
					<th width="15%">行医人身份证号</th>
					<th width="8%">行医内容</th>
					<th width="8%">行医标志</th>
					<th width="8%">房东姓名</th>
					<th width="10%">排摸人姓名</th>
					<th width="10%">日期</th>
					<th width="10%">是否新增</th>
				
				
					</tr>
				
					<c:forEach var="ffxymp"  items="${datas}" varStatus="num">
					
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${ffxymp.cwh}</td>
					    <td>${ffxymp.dz}</td>
					    <td>${ffxymp.fwxz}</td>
					    <td>${ffxymp.xyrxm}</td>					
					    <td>${ffxymp.xyrsfz}</td>
					    <td>${ffxymp.xynr}</td>
					    <td>${ffxymp.xybz}</td>
					    <td>${ffxymp.fdxm}</td>
					    <td>${ffxymp.mprxm}</td>
					    <td>${ffxymp.rq}</td>
					    <td>${ffxymp.sfxz}</td>
					<td>
							
							<div class="btn-group">
							<shiro:hasPermission name="ffxymp:update">
							<a  class="btn " href="/ffxymp/item/update/${ffxymp.id }/${businessFormId }/${superman.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="ffxymp:delete">
							<a  class="btn  b_delete_ffxymp_item" href="/ffxymp/item/delete/${ffxymp.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/ffxymp/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_ffxymp_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>