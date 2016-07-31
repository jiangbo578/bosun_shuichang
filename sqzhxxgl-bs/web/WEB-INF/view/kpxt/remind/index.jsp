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
 <li><a href="/business/1/null"><i class="icon-home"></i>业务管理</a> <span class="divider">/</span></li>

    <li class="active">业务提醒</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
   	<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>业务提醒</strong>
  
   
  </div>
  
	<div class="container">
		
	   <a class="btn btn-success" href="/assess/remind/add"><i class="icon-plus"></i>添加</a>
	   &nbsp;
	   <button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="20%">业务名称</th>
					<th width="15%">提醒日期</th>
					<th width="15%">绿灯开始日期</th>
					<th width="15%">黄灯开始日期</th>
					<th width="15%">红灯开始日期</th>
					<th width="15%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${not empty remind}">
					<tr>
						<td>${num.count }</td>
						<td>${remind.assessTemplateInstance}</td>
						<td><fmt:formatDate pattern='MM月dd日' value='${remind.remindDate }'/></td>
						<td><fmt:formatDate pattern='MM月dd日' value='${remind.greenStart }'/></td>
						<td><fmt:formatDate pattern='MM月dd日' value='${remind.yellowStart }'/></td>
						<td><fmt:formatDate pattern='MM月dd日' value='${remind.redStart }'/></td>
						<td>
							<a href="/assess/remind/delete/${remind.id}" class="btn b_delete_business_remind"><i class="icon-trash"></i>删除</a>
						</td>
					</tr>
				</c:if>
			</tbody>
		</table>
	<%--<div class="pagination">
		<ul  style="float: right;" id="b_pagination"></ul></div>
	</div>
	
	
	--%></div>


<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/business/remind/', '/${businessId}');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该提醒吗?');
			$('.b_delete_business_remind').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>