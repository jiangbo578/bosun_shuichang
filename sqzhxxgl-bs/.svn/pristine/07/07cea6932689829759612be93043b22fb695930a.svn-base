<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<style type="text/css">

td{
 height: 26px
}
</style>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>


		 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>

    <li class="active">公告列表</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
	<div class="container" style="margin-left: 10px">

		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="40%">标题</th>
			<th width="10%">发布时间</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="news" varStatus="num">
					<tr>
						<td>${num.count}</td>
						<td><a href="/news/detail/${news.id}">${news.titles}</a></td>
						<td>${news.adddate}</td>
						
					
					</tr>
				</c:forEach>
			</tbody>
		</table>
			<div class="pagination">
		<ul  style="float: right;" id="b_pagination"></ul></div>
	</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
	<br>		<br>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/news/listpage/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_news_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>