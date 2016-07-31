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

    <li class="active">考核系统</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>考核规则</strong> 
  
   
  </div>
	<div class="container">
		<a style="margin-bottom: 10px"  class='btn btn-success' href="/assess/rule/add/${tempId }"><i class="icon-plus"></i>添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="30%">规则内容</th>
					<th width="5%">扣分</th>
					<th width="15%">属于</th>
					<th width="15%">类别</th>
					<th width="10%">备注</th>
					
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
					
				<c:forEach items="${datas }" var="rule" varStatus="num">
					<tr >
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					   <td>${rule.content}</td>
						<td>${rule.score }</td>
						
						<td>
							${rule.identity}
						</td>
						<td>${ rule.assessTemplate.type}</td>
						<td>${ rule.remark}</td>
						<td>
						<div class="btn-group">
							<a class="btn" href="/assess/rule/update/${rule.id}/${tempId }"><i class="icon-edit"></i>修改 </a>
							<a class="btn b_delete_rule" href="/assess/rule/delete/${rule.id }/${tempId }" ><i class="icon-trash"></i>删除</a>
							
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
			var pagination = new buguPagination('${current}','${pages}', '${count}', '/assess/rule/list/','/${tempId}');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该规则吗?');
			$('.b_delete_rule').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
			parent.iFrameHeight();
	</script>
</body>
</html>