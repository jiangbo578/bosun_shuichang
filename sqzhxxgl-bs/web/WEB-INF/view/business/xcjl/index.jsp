<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
<ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>

    <li class="active">宣传记录</li>
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> 宣传记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<a class="btn btn-success "  style="float: right;margin-bottom: 5px" href="/xcjl/add"><i class="icon-plus"></i>添加</a>
		<a style="float: right;margin-right: 31px;padding-left: 10px" href="/xcjl/item/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	    <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/taizhang/list/5"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="15%">宣传主题</th>
					<th width="15%">时间</th>
					<th width="15%">地点</th>
					
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas}" var="xcjl" varStatus="num">
					<tr>
					 <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${xcjl.xczt}</td>
						<td>${xcjl.sj}</td>
						<td>${xcjl.address}</td>
						
						<td>
						<div  class='btn-group'>
					<a class='btn' href="/xcjl/detail/${xcjl.id }"><i class="icon-eye-open"></i>详情</a>
							<a class='btn' href="/xcjl/update/${xcjl.id }"><i class="icon-pencil"></i>修改内容</a>
							
							<a href="/xcjl/delete/${xcjl.id }" class="btn b_delete_xcjl_item"><i class="icon-trash"></i>删除</a>
							</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pagination">
		 
	
		<ul style="float: right;" id="b_pagination"></ul>	</div>
	</div>
</div>
</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/xcjl/list/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_xcjl_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>