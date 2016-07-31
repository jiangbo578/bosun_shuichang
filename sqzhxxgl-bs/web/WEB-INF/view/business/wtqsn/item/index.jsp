<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/wtqsn/list/1">问题青少年信息统计表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="wtqsn:add">
		  <c:if test="${fn:length(datas)==0}">
		  <a style="float: right" href="/wtqsn/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </c:if>
		  </shiro:hasPermission>
        <a style="float: right;margin-right: 31px;padding-left: 10px" href="/wtqsn/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		<shiro:hasPermission name="wtqsn:add">
		<a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/wtqsn/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<tbody>
				<c:forEach items="${datas }" var="wtqsn" varStatus="num">
					<tr>
						<td>名称</td>
						<td>本市户籍(人数)</td>
						<td>非本市户籍人数(人数)</td>
						<td>备注</td>
						</tr>
						<tr>
						<td>有不良行为或严重不良行为青少年</td>
						<td>${wtqsn.ahj}</td>
						<td>${wtqsn.afhj}</td>
						<td>${wtqsn.abz}</td>
						</tr>
						<tr>
						<td>4-25周岁闲散青少年</td>
						<td>${wtqsn.bhj}</td>
						<td>${wtqsn.bfhj}</td>
						<td>${wtqsn.bbz}</td>
						</tr>
						<tr>
						<td>流浪乞讨未成年人</td>
						<td>${wtqsn.chj}</td>
						<td>${wtqsn.cfhj}</td>
						<td>${wtqsn.cbz}</td>
						</tr>
						<tr>
						<td>服刑人员未成年子女</td>
						<td>${wtqsn.dhj}</td>
						<td>${wtqsn.dfhj}</td>
						<td>${wtqsn.dbz}</td>
						</tr>
						<tr>
						<td>农村留守儿童</td>
						<td>${wtqsn.ehj}</td>
						<td>${wtqsn.efhj}</td>
						<td>${wtqsn.ebz}</td>
						</tr>
						<tr>
						<td></td><td></td><td></td>
						<td>
					<div class="btn-group">
					<shiro:hasPermission name="wtqsn:update">
							<a  class="btn " href="/wtqsn/item/update/${wtqsn.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="wtqsn:delete">
							<a class="btn  b_delete_item" href="/wtqsn/item/delete/${wtqsn.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/wtqsn/item/', '/${businessFormId }');
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