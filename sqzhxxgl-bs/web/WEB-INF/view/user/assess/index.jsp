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

    <li class="active">考核管理</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>考核管理</strong> 
  
   
  </div>
	<div class="container">
		<a style="margin-bottom: 10px"  class='btn btn-success' href="/assess/add"><i class="icon-plus"></i>添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="8%">序号</th>
					<th width="15%">考核名称</th>
					<th width="15%">总分</th>
					<th width="15%">可用状态</th>
					<th width="15%">该模版所属于</th>
					<th width="47%">操作</th>
				</tr>
			</thead>
			<tbody>
					
				<c:forEach items="${datas }" var="assess" varStatus="num">
					<tr >
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${assess.name } </td>
						<td>${assess.sumScore }</td>
						<td>
							<c:choose>
								<c:when test="${assess.enableFlag==true}">可用</c:when>
								<c:otherwise>
									不可用
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<c:choose>
								<c:when test="${assess.identity=='1'}"><font><b>居委</b></font></c:when>
								<c:otherwise>
									村委
								</c:otherwise>
							</c:choose>
						</td>
						<td>
						<div class="btn-group">
							<a class="btn" href="/assess/update/${assess.id }"><i class="icon-edit"></i>修改 </a>
							<a class="btn b_delete_assess" href="/assess/delete/${assess.id }" ><i class="icon-trash"></i>删除</a>
							<a class="btn" href="/assess/child/list/${assess.id }/1">考核项目</a>
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
	<jsp:include page="/page/footer.jsp"></jsp:include><br>		<br><br>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/assess/list/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该组织结构吗?');
			$('.b_delete_assess').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
			parent.iFrameHeight();
	</script>
</body>
</html>