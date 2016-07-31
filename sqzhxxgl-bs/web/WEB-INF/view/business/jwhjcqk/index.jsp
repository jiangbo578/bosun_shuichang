<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/page/taglib.jsp"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<link rel="stylesheet" type="text/css" href="/styles/css/home.css">
<script type="text/javascript" src="/styles/js/jquery.min.js"></script>
<script type="text/javascript" src="/styles/js/baes.js"></script>
<jsp:include page="/page/head.jsp"></jsp:include>

</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
		<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
	    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
	    <li class="active">居委会基础情况</li>
  </ul>
			
	<div class="mianpan">
		  <div class="panhead">
		  <i class="icon-list">&nbsp;&nbsp;</i><strong>数据列表</strong> 居委会基础情况
		  </div>
				<!--add end of-->
			<div class="container" >
				<!--place end of-->
			
					<shiro:hasPermission name="jwhjcqk:add">
						<a  style="margin-bottom: 5px" href="/jwhjcqk/add" class="btn btn-success"><i class="icon-plus"></i>新增表单</a>
						
					</shiro:hasPermission>
					<a style="margin-bottom: 5px"  class="btn btn-info" href="/taizhang/list/1/${userRoleCode}"><i class="icon-share-alt"></i> 返回</a>
							<c:forEach items="${datas}" var="businessForm" varStatus="num">
								<c:if test="${num.count==1}"><!-- 输出头部 -->
								<table  class="table table-striped table-bordered table-hover">
							<thead>
								<th style="text-align: left; text-indent: 30px">表单名称</th>
								<th>状态</th>
								<th>生成来源</th>
								
								<c:if test="${businessForm.business.audit==true }">
								<th>流程状态	</th>
								<th>审核意见</th></c:if>
								<th>最新更新日期</th>
								<th>操作</th>
							</thead>
							<tbody>
								</c:if>
							
								<tr class="bgColor">
									<td style="text-align: left; text-indent: 30px">${businessForm.name
										}</td>
									<td>
										<!-- <img src="images/rightIcon.png" width="15" height="18"  alt=""/> -->${businessForm.processStatus}
									</td>
									<td>${businessForm.sysCreate ? '系统生成' : '手工生成' }</td>
										<c:if test="${businessForm.business.audit==true }">
									<td>${businessForm.processStatus}</td>
									<td>${businessForm.remark}</td></c:if>
									<td><fmt:formatDate pattern='yyyy-MM-dd HH:mm:ss'
											value='${empty businessForm.updateDate ? businessForm.insertDate : businessForm.updateDate}' /></td>
									<td>
									<div class="btn-group">
									<shiro:hasPermission name="jwhjcqk:update">
											
											
											<a class="btn " href="/jwhjcqk/update/${businessForm.id }"><i class="icon-pencil"></i>修改</a>
											
										</shiro:hasPermission> <shiro:hasPermission name="jwhjcqk:delete">
											<a class="btn  b_delete_" href="/jwhjcqk/delete/${businessForm.id }"
												><i class="icon-trash"></i>删除</a>
										
										</shiro:hasPermission> <a class="btn " href="/jwhjcqk/item/${businessForm.id }"><i class=" icon-folder-open"></i>查看与编辑</a>
										<shiro:hasPermission name="jwhjcqk:submit">
										<c:if test="${businessForm.processStatus != '书记审核'}">
			<a class="btn b_submit_check" href="/jwhjcqk/submit/${businessForm.id}"><i class="icon-upload"></i>提交审核</a>

							</c:if>
										</shiro:hasPermission>	
										</div>
										</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="pagination" >
	  <ul style="float: right;" id="b_pagination"></ul>
	</div> 
			</div>
		</div>


<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/jwhjcqk/list/');
			$('#b_pagination').html(pagination.show());

			$('.b_delete_').on('click', function() {
				var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?', true);
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

			$('.b_submit_check').on('click', function() {
				var submit_dialog = buguDialog.init('审核确认', '确认要提交审核吗?', true);
				submit_dialog.setHref(this.href);
				submit_dialog.show();
				return false;
			});
		});
	</script>
</body>
</html>