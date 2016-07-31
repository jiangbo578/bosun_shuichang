<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<style type="text/css">

.form code.redIcon{background-position:-418px 0}
</style>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
  

  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> 待审核表单
  
   
  </div>
  <div id="panbody">
	<div class="container">
	
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="15%">名称</th>				
					<th width="15%">日期</th>
				
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${businessForms}" var="businessForm" varStatus="num">
					<tr>
						<td>${num.count }</td>
						<td><%--<code class="redIcon"></code>   --%><a href="/${businessForm.business.lowerCode }/check/${businessForm.id }">${businessForm.name}</a></td>
						<td><cite>${businessForm.submitdate}</cite></td>
						
					</tr>
				</c:forEach>
			</tbody>
			<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
		</table>
		<div class="pagination" >
		<%--<ul style="float: right;" id="b_pagination"></ul></div> 
	--%></div>
</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/taizhang/gengduo/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_hdjl_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>