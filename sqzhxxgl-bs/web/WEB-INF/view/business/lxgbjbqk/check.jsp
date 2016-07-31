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
    <li ><a href="/lxgbjbqk/list/1">老干部工作</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong> 老干部工作和关工委工作情况</strong></div>
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
			<li  <c:if test="${type eq 'lxgbjbqk' }">class="current" </c:if>>
				<span style="width: 130px;" onclick="submitByBusiness('/lxgbjbqk/check/${businessFormId }');">离休干部基本情况
				</span>
			</li>
			<li  <c:if test="${type eq 'lxgbxxqk' }">class="current" </c:if>>
				<span style="width: 150px;" onclick="submitByBusiness('/lxgbxxqk/check/${businessFormId }');">离退休干部学习活动情况
				</span>
			</li>
			<li  <c:if test="${type eq 'lxgbjbdrggqk' }">class="current" </c:if>>
				<span style="width: 190px;" onclick="submitByBusiness('/lxgbjbdrggqk/check/${businessFormId }');">离退休干部担任村（居）骨干情况
				</span>
			</li>
		</ul>
		<!--tabbtn end-->
		<!-- tab content begin-->
		<div class="container" >
			<!-- 离退休干部担任村（居）骨干情况表 -->
			<c:if test="${type eq 'lxgbjbdrggqk'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">原单位</th>
					<th width="15%">姓名</th>
					<th width="10%">特长情况</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="lxgbjbdrggqk" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${lxgbjbdrggqk.oldWorkName }</td>
						<td>${lxgbjbdrggqk.xm }</td>
						<td>${lxgbjbdrggqk.tc }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 离退休干部担任村（居）骨干情况表 -->
			
			<!-- 离退休干部学习活动情况表（包括就近发挥作用、受到组织关爱等-->
			<c:if test="${type eq 'lxgbxxqk'}">
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">活动时间</th>
					<th width="15%">活动内容</th>
					<th width="10%">参加人数</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="lxgbxxqk" varStatus="num">
					<tr>
						<td>${num.count + size * (current - 1)}</td>
						<td>${lxgbxxqk.date }</td>
						<td>${lxgbxxqk.content }</td>
						<td>${lxgbxxqk.count }</td>
					</tr>
				</c:forEach>
			</tbody>
			</table>
			</c:if>
			<!-- 离退休干部学习活动情况表（包括就近发挥作用、受到组织关爱等-->
			
			
			<!-- 离休干部基本情况表-->
			<c:if test="${type eq 'lxgbjbqk'}">
				<span><font color="gray">离退休干部学习活动情况表（包括就近发挥作用、受到组织关爱等）</font></span>
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
					</tr>
				</c:forEach>
			</tbody>
		</table>
			</c:if>
			<!-- 离休干部基本情况表-->
			<div class="pagination">
				<ul class="" style="float: left;" id="b_pagination"></ul>
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
				<form action="/lxgbjbqk/check" method="post">
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