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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/dbdxcjnd/list/1">低保对象参加公益性社区服务劳动情况季度登记表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="dbdxcjnd:add">
		  <a style="float: right" href="/dbdxcjnd/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
	      <a style="float: right;margin-right: 31px;padding-left: 10px" href="/dbdxcjnd/export/extend/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	     <shiro:hasPermission name="dbdxcjnd:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/dbdxcjnd/list/1"><i class="icon-share-alt"></i> 返回</a>
	     </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			
					<tr>
					    <th colspan="8">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;村（居委）：${superman.cwh}</th>
					   <th colspan="4" >操作</th>
						
					</tr>
					<tr>
					<tH width="8%">序号</tH>
					<th width="10%">救助编号</th>
					<th width="12%">参加对象姓名</th>
					<th width="10%">劳动项目</th>
					<th width="10%">日期</th>
					<th width="17%">参加劳动时间(小时)</th>
					<th width="15%">本人签名</th>
					<th width="10%">负责人签名</th>
					<th  width="10%">月份</th>
				
					</tr>
				
					<c:forEach var="dbdxcjnd"  items="${datas}" varStatus="num">
					
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${dbdxcjnd.jzdh}</td>
					    <td>${dbdxcjnd.cjdxxm}</td>
					    <td>${dbdxcjnd.ldxm}</td>
					    <td>${dbdxcjnd.rq}</td>
					    <td>${dbdxcjnd.ldsj}</td>
					    <td>${dbdxcjnd.brqm}</td>
					    <td>${dbdxcjnd.fzrqm}</td>
					    <td>${dbdxcjnd.yue}</td>
					<td>
							
							<div class="btn-group">
							<shiro:hasPermission name="dbdxcjnd:update">
							<a  class="btn " href="/dbdxcjnd/item/update/${dbdxcjnd.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="dbdxcjnd:delete">
							<a  class="btn  b_delete_dbdxcjnd_item" href="/dbdxcjnd/item/delete/${dbdxcjnd.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/dbdxcjnd/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_dbdxcjnd_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>