<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> 
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%"></span>
		  <a style="float: right" href="/xqdc/item/many/add/${xqdc.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				
				<tr>
					<th width="5%">序号</th>
					<th width="10%">层数</th>
					<th width="10%">面积</th>
					<th width="10%">性质</th>
					
					
				   <th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="xqdcmany" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${xqdcmany.cs}</td>
						<td>${xqdcmany.mj}</td>
						<td>${xqdcmany.xz}</td>
						<td>
							<div class="btn-group">
							<a  class="btn " href="/xqdc/item/many/update/${xqdcmany.id}/${flid}"><i class="icon-pencil"></i>修改</a>
							<a class="btn  b_delete_item1" href="/xqdc/item/many/delete/${xqdcmany.id }/${flid}" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/xqdc/item/many/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_item1').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>