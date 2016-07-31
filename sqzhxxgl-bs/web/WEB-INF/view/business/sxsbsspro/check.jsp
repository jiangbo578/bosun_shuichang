<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li ><a href="/sxsbsspro/list/1">双学双比活动情况</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>双学双比活动情况</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<th width="10%">标题：</th>
				<td width=90%">${businessForm.name }</td>
			</tr>
			<tr>
			<th>内容</th>
			<td>
			<!-- tab begin -->
		<div class="tabbox" >
	<!-- ~~~~~~事件类型~~~~~~~~~~ -->
		<ul class="tabbtn">
			<li  <c:if test="${type eq 'sxsbsspro' }">class="current" </c:if>>
				<span style="width: 130px;" onclick="submitByBusiness('/sxsbsspro/item/${businessFormId }');">实事项目
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbsfbase' }">class="current" </c:if>>
				<span style="width: 150px;" onclick="submitByBusiness('/sxsbsfbase/item/${businessFormId }');">示范基地
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbsfwomanhzs' }">class="current" </c:if>>
				<span style="width: 150px;" onclick="submitByBusiness('/sxsbsfwomanhzs/item/${businessFormId }');">女性专业合作社
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbmhsfc' }">class="current" </c:if>>
				<span style="width: 190px;" onclick="submitByBusiness('/sxsbmhsfc/item/${businessFormId }');">美好家园示范村
				</span>
			</li>
			<li  <c:if test="${type eq 'sxsbsfnvhand' }">class="current" </c:if>>
				<span style="width: 190px;" onclick="submitByBusiness('/sxsbsfnvhand/item/${businessFormId }');">女能手名册
				</span>
			</li>
		</ul>
		<!--tabbtn end-->
		<!-- tab content begin-->
		<div class="container" >
		  <a style="float: right" href="/${type }/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
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
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/sxsbsspro/check" method="post">
						  <div class="control-group">
    <label class="control-label" for="inputEmail">意见：</label>
    <div class="controls">
      <input type="text" name="remark"  class="input-xxlarge"  id="inputEmail" placeholder="请输入意见">

    </div>
  </div>
				<input type="hidden" name="businessFormId" value="${businessForm.id}">
				<input type="hidden" name="type" value="0" id="b_check_type">
				<button class="btn btn-primary"  type="submit"  id="b_check_pass"><i class="icon-ok-sign"></i>通过</button>
				<button class="btn btn-info" type="submit"  id="b_check_no_pass"><i class="icon-share-alt"></i>驳回</button>
				</form>
				</td>
			</tr></tbody>
		</table>
	</div>
	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/${type}/check/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			$('#b_check_pass').on('click', function(){
			if(confirm("确定要通过审核？")){
			$('#b_check_type').val(1);
			  return true;
			}
				return false;
			});
			$('#b_check_no_pass').on('click', function(){
			if(confirm("确定要驳回审核？")){
			$('#b_check_type').val(2);
			return true;
				 }
		     return false;	
			});
			
		});
		parent.iFrameHeight();
		
	</script>
</body>
</html>