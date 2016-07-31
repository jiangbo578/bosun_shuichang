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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/sqjmjkzwglxz/list/1">社区居民健康自我管理小组统计表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="sqjmjkzwglxz:add">
		  <a style="float: right" href="/sqjmjkzwglxz/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/sqjmjkzwglxz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	     <shiro:hasPermission name="sqjmjkzwglxz:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/sqjmjkzwglxz/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			 <tr>
    <th height="33" colspan="4"><p align="center" >当年新增小组</p></th>
    <th colspan="4"><p align="center" >当年仍在活动的小组</p></th>
    <th colspan="2"><p align="center" >当年文体团队结队</p></th>
  </tr>
  <tr>
    <th width="8%" height="38"><p >个数（个）</p></th>
    <th width="8%"><p >组员（人）</p></th>
    <th width="11%"><p >活动次数（次）</p></th>
    <th width="12%"><p >参加人次（人次）</p></th>
    <th width="8%"><p >个数（个）</p></th>
    <th width="9%"><p >组员（人）</p></th>
    <th width="10%"><p >活动次数（次）</p></th>
    <th width="12%"><p >参加人次（人次）</p></th>
    <th width="13%"><p >结队文体小组数(个）</p></th>
    <th width="16%"><p >结队文体小组人数（人）</p></th>
    <th>操作</th>
  </tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="sqjmjkzwglxz" varStatus="num">
					<tr>
						<td>${sqjmjkzwglxz.xzgs}</td>
					    <td>${sqjmjkzwglxz.xzzy}</td>
					    <td>${sqjmjkzwglxz.xzhdcs}</td>
					    <td>${sqjmjkzwglxz.xzcjrc}</td>
					    
					    <td>${sqjmjkzwglxz.hdgs}</td>
					    <td>${sqjmjkzwglxz.hdzy}</td>
					    <td>${sqjmjkzwglxz.hdhdcs}</td>
					    <td>${sqjmjkzwglxz.hdcjrc}</td>
					    
					    <td>${sqjmjkzwglxz.jdgs}</td>
					    <td>${sqjmjkzwglxz.jdrs}</td>
							<td>
							<div class="btn-group">
							<shiro:hasPermission name="sqjmjkzwglxz:update">
							<a  class="btn " href="/sqjmjkzwglxz/item/update/${sqjmjkzwglxz.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="sqjmjkzwglxz:delete">
							<a  class="btn  b_delete_sqjmjkzwglxz_item" href="/sqjmjkzwglxz/item/delete/${sqjmjkzwglxz.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/sqjmjkzwglxz/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_sqjmjkzwglxz_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>