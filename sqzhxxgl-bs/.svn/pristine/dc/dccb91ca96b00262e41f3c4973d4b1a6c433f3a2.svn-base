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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/dzbwy/list/1">党支部委员及党小组长名册</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="dzbwy:add">
		  <a style="float: right" href="/dzbwy/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/dzbwy/export/extend/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
          <shiro:hasPermission name="dzbwy:add">
          <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/dzbwy/list/1"><i class="icon-share-alt"></i> 返回</a>
		   </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;TABLE-LAYOUT:fixed;WORD-BREAK:break-all">
			<thead>
				  <tr>
    <td valign="center" colspan="2" ><p >本届当选日期 </p></td>
    <td width="10%" valign="center" ><p >${d.bjdxrq}</p></td>
    <td width="15%" valign="center" ><p >换届选举形式 </p></td>
    <td width="10%" valign="center" ><p >${d.hjxjxs}</p></td>
    <td width="10%" valign="center" ><p >届满日期 </p></td>
    <td width="10%" valign="center" ><p >${d.jmrq}</p></td>
    <td  width="20%"><div class="btn-group">
    <shiro:hasPermission name="dzbwy:update">
							<a  class="btn " href="/dzbwy/item/head/update/${d.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							<shiro:hasPermission name="dzbwy:add">
						</div></td>
  </tr>
  <tr>
    <td width="5%" ><p >序号 </p></td>
    <td width="10%" valign="center" ><p >职务 </p></td>
    <td width="10%" valign="center" ><p >姓名 </p></td>
    <td width="10%" valign="center" ><p >任职时间 </p></td>
    <td width="10%" valign="center" ><p >分工内容 </p></td>
    <td width="10%" valign="center" ><p >&nbsp;</p></td>
    <td width="10%" valign="center" ><p >备注 </p></td>
     <td valign="center" ><p >操作</p></td>
  </tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="dzbwy" varStatus="num">
					<tr>
					<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					<td>${dzbwy.role}</td>
					<td>${dzbwy.name}</td>
					<td>${dzbwy.zrsj}</td>
					<td>${dzbwy.fgnr}</td>
					 <td width="10%" valign="center" ><p >&nbsp;</p></td>
					<td>${dzbwy.remark}</td>
					
						<td >
						<div class="btn-group">
						<shiro:hasPermission name="dzbwy:update">
							<a  class="btn " href="/dzbwy/item/update/${dzbwy.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="dzbwy:delete">
							<a class="btn  b_delete_dzbwy_item" href="/dzbwy/item/delete/${dzbwy.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/dzbwy/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_dzbwy_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>