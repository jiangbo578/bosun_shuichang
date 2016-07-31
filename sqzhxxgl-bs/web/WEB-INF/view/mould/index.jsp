<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/taizhang/list/3">模板导出</a> <span class="divider">/</span></li>
 
  
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>模板导出</strong> 
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <a style="float: right" href="/mould/add/" class="btn btn-success "><i class="icon-plus"></i>添加模板</a><%--
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/cjrmd/list/1"><i class="icon-share-alt"></i> 返回</a>
		  
		--%><table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				
				<tr>
					<th width="5%">序号</th>
					<th width="7%">模版名称</th>
					<th width="7%">使用部门</th>
					<th width="7%">备注</th>
					<th width="7%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="mould" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${mould.mould_name }</td>
						<td>${mould.department }</td>
						<td>${mould.remark }</td>
						<td>
						<div class="btn-group">
							<a  class="btn " href="/mould/update/${mould.id}/"><i class="icon-pencil"></i>修改模板</a>
							<a class="btn  b_delete_item" href="/mould/delete/${mould.id }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/mould/list/');
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