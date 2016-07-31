<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/cjrjbqk/list/1">残疾人协会基本情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="cjrjbqk:add">
		  <a style="float: right" href="/cjrjbqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
	     <a style="float: right;margin-right: 31px;padding-left: 10px" href="/cjrjbqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		<shiro:hasPermission name="cjrjbqk:add">
		 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/cjrjbqk/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="7%">协会全称</th>
					<th width="7%">办公地址</th>
					<th width="7%">电话</th>
					<th width="7%">总人数</th>
					<th width="5%">视力</th>
					<th width="5%">听力</th>
					<th width="5%">言语</th>
					<th width="5%">智力</th>
					<th width="5%">肢体</th>
					<th width="5%">精神</th>
					<th width="5%">无业</th>
					<th width="7%">重残无业</th>
					
					<th width="7%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="cjrjbqk" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${cjrjbqk.xhqc}</td>
                        <td>${cjrjbqk.bgdz}</td>
                        <td>${cjrjbqk.phone}</td>
                        <td>${cjrjbqk.zrs}</td>
                        <td>${cjrjbqk.sl}</td>
                        <td>${cjrjbqk.tl}</td>
                        <td>${cjrjbqk.yy}</td>
                        <td>${cjrjbqk.zl}</td>
                        <td>${cjrjbqk.zt}</td>
                        <td>${cjrjbqk.js}</td>
                        <td>${cjrjbqk.wy}</td>
                        <td>${cjrjbqk.zcwy}</td>
						<td>
								<div class="btn-group">
								<shiro:hasPermission name="cjrjbqk:update">
							<a  class="btn " href="/cjrjbqk/item/update/${cjrjbqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							<shiro:hasPermission name="cjrjbqk:delete">
							<a class="btn  b_delete_item" href="/cjrjbqk/item/delete/${cjrjbqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
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
					'${pages}', '${count}', '/cjrjbqk/item/', '/${businessFormId }');
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