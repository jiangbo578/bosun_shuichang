<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>

</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>

    <li class="active">公告列表</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>公告列表</strong> 
  
   
  </div>
	<div class="container">
		<a  class="btn btn-success" style="margin-bottom: 10px" href="/news/add"><i class="icon-plus"></i>添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="40%">标题</th>
					<th width="10%">发布时间</th>
                    <th width="10%">类型</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="news" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${news.titles}</td>
						<td>${news.adddate}</td>
						<td>${news.type}</td>
						<td>
						
							<div class="btn-group">
							<a class="btn" href="/news/update/${news.id}"><i class="icon-edit"></i>修改新闻</a>
							<a   href="/news/delete/${news.id}" class="btn b_delete_tsjbzx_item"><i class="icon-trash"></i>删除</a>
						</div>
						</td>
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
					'${pages}', '${count}', '/news/list/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_tsjbzx_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});
			parent.iFrameHeight();
		});
	</script>
</body>
</html>