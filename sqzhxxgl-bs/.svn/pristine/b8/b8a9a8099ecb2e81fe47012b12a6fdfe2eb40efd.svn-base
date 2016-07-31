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
    <li><a href="/ffbxd/list/1">非法办学点情况表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="ffbxd:add">
		  		  <a style="float: right" href="/ffbxd/item/add/${businessFormId}/${superman.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
	</shiro:hasPermission>
	<a style="float: right;margin-right: 31px;padding-left: 10px" href="/ffbxd/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	   <shiro:hasPermission name="ffbxd:add">
	    <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/ffbxd/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			
					<tr>
					    <th colspan="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;填表单位：${superman.cwh}</th>
					    <th colspan="2">操作</th>
						
					</tr>
					<tr>
					<tH  width="5%">序号</tH>
					<th width="15%">所属街镇</th>
					<th width="15%">所属村、居委</th>
					<th width="15%">办学名称</th>
					<th width="8%">姓名</th>
					<th width="15%">籍贯</th>
					<th width="15%">身份证</th>
					<th width="8%">联系电话</th>
					<th width="8%">办学地址</th>
					<th width="8%">班级数</th>
					<th width="8%">幼儿数</th>
					<th width="10%">房屋性质</th>
					<th width="10%">是否违章搭建</th>
					
					<th width="10%">举办时间</th>
				
				
					</tr>
				
					<c:forEach var="ffbxd"  items="${datas}" varStatus="num">
					
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${ffbxd.ssjd}</td>
					    <td>${ffbxd.sscwh}</td>
					    <td>${ffbxd.bxmc}</td>
					    <td>${ffbxd.xm}</td>
					    <td>${ffbxd.jg}</td>
					    <td>${ffbxd.sfz}</td>
					    <td>${ffbxd.phone}</td>
					    <td>${ffbxd.bxdz}</td>
					    <td>${ffbxd.bjs}</td>
					    <td>${ffbxd.yrs}</td>
					    <td>${ffbxd.fwxz}</td>
					    <td>${ffbxd.wz}</td>
					    <td>${ffbxd.jbsj}</td>
					<td>
							
							<div class="btn-group">
							<shiro:hasPermission name="ffbxd:update">
							<a  class="btn " href="/ffbxd/item/update/${ffbxd.id }/${businessFormId }/${superman.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="ffbxd:delete">
							<a  class="btn  b_delete_ffbxd_item" href="/ffbxd/item/delete/${ffbxd.id }/${businessFormId}" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/ffbxd/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_ffbxd_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>