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
	 <li><i class="icon-home"></i>首页 <span class="divider">/</span></li>
    <li>党群工作<span class="divider">/</span></li>
    <li>嘉定区社会组织预警网络信息员登记表<span class="divider">/</span></li>
    <li class="active">信息报送记录</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> 信息报送记录
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		<a class="btn  btn-primary " href="/warningnetworker/messageRecord/add1/${networkerId}">添加</a><span class="empty"></span>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">日期</th>
					<th width="15%">报送条数</th>
					<th width="15%">信息内容</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="messageRecord" varStatus="num">
					<tr>
						<td>${num.count + size * (current-1)}</td>
						<td>${messageRecord.date}</td>
						<td>${messageRecord.count}</td>
						<td>${messageRecord.content}</td>
						<td>
						<a  class="btn " href="/warningnetworker/${networkerId}/messageRecord/update/${messageRecord.id}/"><i class="icon-pencil"></i>修改</a>
							<a class="btn  b_delete_tyqndj_item" href="/warningnetworker/${networkerId}/delete/${messageRecord.id }/" ><i class="icon-trash"></i>删除</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/warningnetworker/'+'${networkerId}'+'/messageRecord/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_tyqndj_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>