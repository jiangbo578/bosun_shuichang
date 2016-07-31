<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<style type="text/css">

</style>
</head>
<body>

 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>

    <li class="active">业务管理</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  	<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>业务添加</strong>
  
   
  </div>
	<div class="container">   
	查询条件:<input placeholder="请输出查询条件.."  type="text" name="code" id="code" />
	&nbsp;&nbsp;
	<a class="btn btn-primary" type="button"  onclick="cx()" ><i class="icon-search"></i>查询</a>
		&nbsp;&nbsp;<a class="btn btn-success" href="/business/add"><i class="icon-plus"></i>添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th >序号</th>
					<th>业务名称</th>
					<th>业务代号</th>
					<th>名称格式</th>
					<th>审核</th>
					<th>提醒</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="business" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}  配置：${business.parid}</td>
						<td><a rel="tooltip" data-placement="top" data-original-title="${business.name }" title="${business.name }" href='javascript:' >${fn:substring(business.name, 0, 15)}..</a></td>
						<td>${business.code }</td>
						<td>
						<a rel="tooltip" data-placement="bottom" data-original-title="${business.format }" title="${business.format }" href='javascript:' >${fn:substring(business.format, 0, 12)}..</a>
</td>
						<td>${business.audit ? '是' : '否' }</td>
						<td>${business.remind ? '是' : '否'}</td>
						<td >
						<div class="btn-group">
						
							<a  class="btn " href="/business/update/${business.id }"><i class="icon-pencil"></i>修改</a>
							<a  class="btn b_delete_business" href="/business/delete/${business.id }" ><i class="icon-trash"></i>删除</a></span>
							<a  class="btn " href="/business/remind/${business.id }" class="b_business_remind"><i class=" icon-bell"></i>提醒</a></span>
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



<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	function cx(){
	      var code=document.getElementById("code").value;
	      location.href="/business/1/"+code;
			}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/business/','/${code}');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该业务吗?');
			$('.b_delete_business').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
		  (function($) {
    $(document).ready(function () {
      $('a[rel=tooltip]').tooltip({});

      $(".popover").show();
    });
  })(jQuery);
	</script>
</body>
</html>