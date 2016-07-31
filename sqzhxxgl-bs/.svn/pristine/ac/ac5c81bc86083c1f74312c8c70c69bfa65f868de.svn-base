<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
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
    <li><a href="/srhwqk/list/1">嘉定区镇村市容环卫情况调查表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="srhwqk:add">
		   <c:if test="${fn:length(datas)==0}">
		  		  <a style="float: right" href="/srhwqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  		  </c:if>
		  		  </shiro:hasPermission>
	 <a style="float: right;margin-right: 31px;padding-left: 10px" href="/srhwqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/srhwqk/list/1"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			
					
					<tr>
					<tH width="5%">序号</tH>
					<th>农厕整治数量</th>
					<th>农厕整治形式</th>
					<th>乱设摊数量</th>
					<th>“三乱”小广告数量</th>
					<th>私设卸点数量</th>
					<th>操作</th>
					</tr>
				</thead>
					<tbody>
					<c:forEach var="srhwqk"  items="${datas}" varStatus="num">
					
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${ srhwqk.nczzsl}</td>	
					    <td>${ srhwqk.nczzxs}</td>	
					    <td>${ srhwqk.lstzzsl}</td>	
					    <td>${ srhwqk.sltzzsl}</td>	
					    <td>${ srhwqk.sstzzss}</td>					    										    
					<td>
							
							<div class="btn-group">
							<shiro:hasPermission name="srhwqk:update">
							<a  class="btn " href="/srhwqk/item/update/${srhwqk.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="srhwqk:delete">
							<a  class="btn  b_delete_srhwqk_item" href="/srhwqk/item/delete/${srhwqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/srhwqk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_srhwqk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>