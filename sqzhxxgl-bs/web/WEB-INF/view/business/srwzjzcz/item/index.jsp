<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
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
		<li><a href="/centent"><i class="icon-home"></i>首页</a> <span
			class="divider">/</span>
		</li>
		<li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span>
		</li>
		<li><a href="/srwzjzcz/list/1">私人违章建筑处置</a> <span class="divider">/</span>
		</li>
		<li class="active">${businessForm.name}</li>
	</ul>

	<div class="mianpan">
		<div class="panhead">
			<i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong>	${businessForm.name}

		</div>
		<div id="panbody">
			<div class="container">


				<span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
				<shiro:hasPermission name="srwzjzcz:add">
				<a style="float: right" href="/srwzjzcz/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
				</shiro:hasPermission> 
				<a style="float: right;margin-right: 31px;padding-left: 10px" href="/srwzjzcz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a> 
				<shiro:hasPermission name="srwzjzcz:add">
				<a style="float: right;margin-right: 31px;padding-left: 10px" class="btn btn-info" href="/srwzjzcz/list/1"><i class="icon-share-alt"></i> 返回</a>
</shiro:hasPermission>
				<table class="table table-striped table-bordered table-hover"
					style="margin-top: 10px">
					<thead>
						<tr>
							<th width="5%">序号</th>
							<th width="9%">受理时间</th>
							<th width="9%">来源</th>
							<th width="9%">违建地址</th>
							<th width="9%">违建面积</th>
							<th width="9%">违建情况</th>
							<th width="9%">违建部位</th>
							<th width="9%">处置情况</th>
							<th width="12%">处置责任单位</th>
							<th width="9%">备注</th>
							<th width="9%">整治前</th>
							<th width="9%">整治后</th>
							<th width="9%">操作</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${datas }" var="srwzjzcz" varStatus="num">
							<tr>
								<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
								<td>${srwzjzcz.slsj}</td>
								<td>${srwzjzcz.ly}</td>
								<td>${srwzjzcz.wzdz}</td>
								<td>${srwzjzcz.wzmj}</td>
								<td>${srwzjzcz.wzqk}</td>
								<td>${srwzjzcz.wzbw}</td>
								<td>${srwzjzcz.czqk}</td>
								<td>${srwzjzcz.czdw}</td>
								<td>${srwzjzcz.bz}</td>
								<td><a href="#" onclick="dowload('${srwzjzcz.zzqimg}')">${srwzjzcz.zzqimg}</a>
								<td><a href="#" onclick="dowload('${srwzjzcz.zzhimg}')">${srwzjzcz.zzhimg }</a>
								</td>
								<td>
									<div class="btn-group">
									<shiro:hasPermission name="srwzjzcz:update">
										<a class="btn "
											href="/srwzjzcz/item/update/${srwzjzcz.id}/${businessFormId }"><i
											class="icon-pencil"></i>修改</a> 
											
											</shiro:hasPermission>
											<shiro:hasPermission name="srwzjzcz:delete">
											<a class="btn  b_delete_item"
											href="/srwzjzcz/item/delete/${srwzjzcz.id }/${businessFormId }"><i
											class="icon-trash"></i>删除</a>
											</shiro:hasPermission>
									</div></td>
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
		function dowload(filename) {

			var filename = filename.replace(".", "|");
			//alert(filename);
			window.location.href = "/download/" + filename;
		}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}', '${pages}',
					'${count}', '/srwzjzcz/item/', '/${businessFormId }');
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