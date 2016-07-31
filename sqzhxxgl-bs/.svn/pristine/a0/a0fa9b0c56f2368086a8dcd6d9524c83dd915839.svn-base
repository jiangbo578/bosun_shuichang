<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/scripts/tab/tab.css" type="text/css"></link>
	<script>
	    function submitByBusiness(url)
	    {
			location.href=url;		    
		}
	</script>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/lxgbjbqk/list/1">老干部工作</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  </div>
  <div id="panbody">
  	<span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
	<!-- tab begin -->
		<div class="tabbox" >
	<!-- ~~~~~~事件类型~~~~~~~~~~ -->
		<ul class="tabbtn">
			<li  <c:if test="${type eq 'lxgbjbqk' }">class="current" </c:if>>
				<span style="width: 130px;" onclick="submitByBusiness('/lxgbjbqk/item/${businessFormId }');">离休干部基本情况
				</span>|
			</li>
			<li  <c:if test="${type eq 'lxgbxxqk' }">class="current" </c:if>>
				<span style="width: 150px;" onclick="submitByBusiness('/lxgbxxqk/item/${businessFormId }');">离退休干部学习活动情况
				</span>|
			</li>
			<li  <c:if test="${type eq 'lxgbjbdrggqk' }">class="current" </c:if>>
				<span style="width: 190px;" onclick="submitByBusiness('/lxgbjbdrggqk/item/${businessFormId }');">离退休干部担任村（居）骨干情况
				</span>|
			</li>
		</ul>
		<!--tabbtn end-->
		<!-- tab content begin-->
		<div class="container" >
		<shiro:hasPermission name="lxgbjbqk:add">
		  <a style="float: right" href="/${type }/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/lxgbjbqk/export/extend/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
          <shiro:hasPermission name="lxgbjbqk:add">
          <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/lxgbjbqk/list/1"><i class="icon-share-alt"></i> 返回</a>
			</shiro:hasPermission>
			<!-- 离退休干部担任村（居）骨干情况表 -->
			<c:if test="${type eq 'lxgbjbdrggqk'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">原单位</th>
					<th width="15%">姓名</th>
					<th width="10%">特长情况</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="lxgbjbdrggqk" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${lxgbjbdrggqk.oldWorkName }</td>
						<td>${lxgbjbdrggqk.xm }</td>
						<td>${lxgbjbdrggqk.tc }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="lxgbjbqk:update">
							<a  class="btn " href="/${type }/item/update/${lxgbjbdrggqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="lxgbjbqk:delete">
							<a class="btn  b_delete_ggwgz_item" href="/${type }/item/delete/${lxgbjbdrggqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 离退休干部担任村（居）骨干情况表 -->
			
			<!-- 离退休干部学习活动情况表（包括就近发挥作用、受到组织关爱等-->
			<c:if test="${type eq 'lxgbxxqk'}">
				<span><font color="gray">离退休干部学习活动情况表（包括就近发挥作用、受到组织关爱等）</font></span>
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">活动时间</th>
					<th width="15%">活动内容</th>
					<th width="10%">参加人数</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="lxgbxxqk" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${lxgbxxqk.date }</td>
						<td>${lxgbxxqk.content }</td>
						<td>${lxgbxxqk.count }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="lxgbjbqk:update">
							<a  class="btn " href="/${type }/item/update/${lxgbxxqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="lxgbjbqk:delete">
							<a class="btn  b_delete_ggwgz_item" href="/${type }/item/delete/${lxgbxxqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 离退休干部学习活动情况表（包括就近发挥作用、受到组织关爱等-->
			
			
			<!-- 离休干部基本情况表-->
			<c:if test="${type eq 'lxgbjbqk'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">原单位名称</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">出生年月</th>
					<th width="15%">住址</th>
					<th width="10%">联系电话</th>
					<th width="10%">亲属联系电话</th>
					<th width="10%">备注</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="lxgbjbqk" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${lxgbjbqk.oldWorkName }</td>
						<td>${lxgbjbqk.xm }</td>
						<td>${lxgbjbqk.xb }</td>
						<td>${lxgbjbqk.csny }</td>
						<td>${lxgbjbqk.jtzz }</td>
						<td>${lxgbjbqk.phone }</td>
						<td>${lxgbjbqk.kinsfolkPhone }</td>
						<td>${lxgbjbqk.tag }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="lxgbjbqk:update">
							<a  class="btn " href="/${type }/item/update/${lxgbjbqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="lxgbjbqk:delete">
							<a class="btn  b_delete_ggwgz_item" href="/${type }/item/delete/${lxgbjbqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 离休干部基本情况表-->
			<div class="pagination">
				<ul class="" style="float: right;" id="b_pagination"></ul>
			</div>
		</div>
		<!-- tab content end -->
	</div>
	<!-- tab end -->
  </div>

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {

			
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/${type}/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_ggwgz_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>