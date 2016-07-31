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
   <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/abroadstudent/list/1">小区留学生名单</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="abroadstudent:add">
		  <a style="float: right" href="/abroadstudent/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/abroadstudent/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
          <shiro:hasPermission name="abroadstudent:add">
          <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/abroadstudent/list/1"><i class="icon-share-alt"></i> 返回</a>
		  </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">出生年月</th>
					<th width="5%">民族</th>
					
					<th width="15%">住址</th>
					
					<th width="10%">电话</th>
					<th width="10%">亲属姓名</th>
					<th width="10%">侨眷关系</th>
					<th width="10%">华侨居住国</th>
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="abroadstudent" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${abroadstudent.xm}</td>
						<td>${abroadstudent.xb}</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${abroadstudent.csny }'/></td>
						<td>${abroadstudent.mz}</td>
						<td>${abroadstudent.jtzz}</td>
						<td>${abroadstudent.phone}</td>
						<td>${abroadstudent.relationName}</td>
						<td>${abroadstudent.relation}</td>
						<td>${abroadstudent.liveCountry}</td>
						<td>
		<div class="btn-group">
							<a  class="btn " href="/abroadstudent/item/update/${abroadstudent.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							<a class="btn  b_delete_item" href="/abroadstudent/item/delete/${abroadstudent.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/abroadstudent/item/', '/${businessFormId }');
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