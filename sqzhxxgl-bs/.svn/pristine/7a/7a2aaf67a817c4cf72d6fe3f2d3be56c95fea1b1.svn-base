<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
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


		function openWin(url)
		{
			if(null!=url && url!="")
			{
				　window.open (url, "", "height=500, width=800, toolbar =no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
			}
		}
	</script>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/sxsbsspro/list/1">双学双比活动情况</a> <span class="divider">/</span></li>
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
			<li  <c:if test="${type eq 'sxsbsspro' }">class="current" </c:if>>
				<span style="width: 130px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/sxsbsspro/item/${businessFormId }');">实事项目
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbsfbase' }">class="current" </c:if>>
				<span style="width: 150px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/sxsbsfbase/item/${businessFormId }');">示范基地
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbsfwomanhzs' }">class="current" </c:if>>
				<span style="width: 150px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/sxsbsfwomanhzs/item/${businessFormId }');">女性专业合作社
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbmhsfc' }">class="current" </c:if>>
				<span style="width: 190px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/sxsbmhsfc/item/${businessFormId }');">美好家园示范村
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbsfnvhand' }">class="current" </c:if>>
				<span style="width: 190px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/sxsbsfnvhand/item/${businessFormId }');">女能手名册
				</span>
			</li>
		</ul>
		<!--tabbtn end-->
		<!-- tab content begin-->
		<div class="container" >
		<shiro:hasPermission name="sxsbsspro:add">
		<c:if test="${fn:length(datas)==0}">
		  <a style="float: right" href="/${type}/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </c:if>
		  </shiro:hasPermission>
       <a style="float: right;margin-right: 31px;padding-left: 10px" href="/sxsbsspro/export/extend/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		<shiro:hasPermission name="sxsbsspro:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/sxsbsspro/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		  <!-- 实事项目 -->
			<c:if test="${type eq 'sxsbsspro'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">名称</th>
					<th width="10%">级别</th>
					<th width="10%">负责人姓名</th>
					<th width="15%">带动妇女就业人数</th>
					<th width="10%">人均年收入</th>
					<th width="10%">获评时间</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="data" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${data.name }</td>
						<td>${data.level }</td>
						<td>${data.host }</td>
						<td>${data.womanjyCount }</td>
						<td>${data.incomeOfPerson }</td>
						<td>${data.crownedTime }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="sxsbsspro:update">
							<a  class="btn " href="/${type }/item/update/${data.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="sxsbsspro:delete">
							<a class="btn  b_delete_sxsbsspro_item" href="/${type }/item/delete/${data.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 实事项目-->
			
			
			<!-- 示范基地-->
			<c:if test="${type eq 'sxsbsfbase'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">名称</th>
					<th width="10%">级别</th>
					<th width="10%">负责人姓名</th>
					<th width="15%">规模(亩)</th>
					<th width="10%">基地人数</th>
					<th width="10%">女性人数</th>
					<th width="10%">获评时间</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="data" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${data.name }</td>
						<td>${data.level }</td>
						<td>${data.host }</td>
						<td>${data.scale }</td>
						<td>${data.baseCount }</td>
						<td>${data.womanjyCount }</td>
						<td>${data.crownedTime }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="sxsbsspro:update">
							<a  class="btn " href="/${type }/item/update/${data.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="sxsbsspro:delete">
							<a class="btn  b_delete_sxsbsspro_item" href="/${type }/item/delete/${data.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 示范基地-->
			
			<!-- 女性专业合作社-->
			<c:if test="${type eq 'sxsbsfwomanhzs'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">名称</th>
					<th width="10%">负责人姓名</th>
					<th width="15%">总人数</th>
					<th width="10%">女性人数</th>
					<th width="10%">品牌</th>
					<th width="10%">人均年收入</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="data" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${data.name }</td>
						<td>${data.host }</td>
						<td>${data.allCount }</td>
						<td>${data.womanCount }</td>
						<td>${data.brand }</td>
						<td>${data.incomeOfPersonOfYear }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="sxsbsspro:update">
							<a  class="btn " href="/${type }/item/update/${data.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="sxsbsspro:delete">
							<a class="btn  b_delete_sxsbsspro_item" href="/${type }/item/delete/${data.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 女性专业合作社-->
			
			
			<!-- 美好家园示范村-->
			<c:if test="${type eq 'sxsbmhsfc'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
				<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">示范村名称</th>
					<th width="10%">级别</th>
					<th width="5%">获评时间</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="data" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${data.name }</td>
						<td>${data.level }</td>
						<td>${data.crownedTime }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="sxsbsspro:update">
							<a  class="btn " href="/${type }/item/update/${data.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a></shiro:hasPermission>
							<shiro:hasPermission name="sxsbsspro:delete">
							<a class="btn  b_delete_sxsbsspro_item" href="/${type }/item/delete/${data.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
							<a class="btn " href="javascript:void(0)" onclick="openWin('/sxsbmhsfc/${data.id}/activity/1');">活动情况</a>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 美好家园示范村-->
			<!-- 女能手名册-->
			<c:if test="${type eq 'sxsbsfnvhand'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
				<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="10%">出生年月</th>
					<th width="10%">文化程度</th>
					<th width="10%">政治面貌</th>
					<th width="10%">种植专长</th>
					<th width="10%">联系方式</th>
					<th width="20%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="data" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${data.name }</td>
						<td>${data.birthday }</td>
						<td>${data.whcd }</td>
						<td>${data.zzmm }</td>
						<td>${data.growFeature }</td>
						<td>${data.phone }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="sxsbsspro:update">
							<a  class="btn " href="/${type }/item/update/${data.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="sxsbsspro:delete">
							<a class="btn  b_delete_sxsbsspro_item" href="/${type }/item/delete/${data.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 女能手名册-->
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
			$('.b_delete_sxsbsspro_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>