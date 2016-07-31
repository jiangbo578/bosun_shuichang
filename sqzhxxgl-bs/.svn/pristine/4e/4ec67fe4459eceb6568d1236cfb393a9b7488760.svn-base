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
		  <a style="float: right" href="/lxfwqzzf/item/zl/add/${businessForm.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="10%">职务</th>
					<th width="10%">联系方式</th>
					
					<th width="10%">备注</th>
				   <th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="lxfwqzzfr" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${lxfwqzzfr.xm}</td>
						<td>${lxfwqzzfr.zw}</td>
						<td>${lxfwqzzfr.lxfs}</td>
						<td>${lxfwqzzfr.bz}</td>
						<td>
							<div class="btn-group">
							<a  class="btn " href="/lxfwqzzf/item/zl/update/${lxfwqzzfr.id}/${flid}"><i class="icon-pencil"></i>修改</a>
							<a class="btn  b_delete_item1" href="/lxfwqzzf/item/zl/delete/${lxfwqzzfr.id }/${flid}" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/lxfwqzzf/item/', '/${businessFormId }');
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