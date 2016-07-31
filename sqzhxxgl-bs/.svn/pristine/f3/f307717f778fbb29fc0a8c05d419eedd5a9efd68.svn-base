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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/fcbkjd/list/1">党员干部扶残帮困结对记录</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="fcbkjd:add">
		  <a style="float: right" href="/fcbkjd/item/add/${businessFormId}/${fcbkjd.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/fcbkjd/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="fcbkjd:add">
		 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/fcbkjd/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;TABLE-LAYOUT:fixed;WORD-BREAK:break-all" >
			<thead>
				 <tr >
    <td width="10%" valign="center" ><p >时&nbsp;&nbsp;间 </p></td>
    <td width="20%" valign="center" ><p >${fcbkjd.sj}</p></td>
    <td width="126" valign="center" ><p >地&nbsp;点 </p></td>
    <td width="25%" valign="center" colspan="2" ><p >${fcbkjd.address}</p></td>
    <td width="10%" valign="center" ><p >召集人 </p></td>
    <td width="74" valign="center" ><p >${fcbkjd.zjr}</p></td>
    <td><div class="btn-group">
    <shiro:hasPermission name="fcbkjd:add">
							<a  class="btn " href="/fcbkjd/item/head/update/${fcbkjd.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
						</div></td>
  </tr>
  <tr >
 
    <td width="107" valign="center" ><p >参加人员 </p></td>
    <td width="470" valign="center" colspan="8" ><p >&nbsp;</p></td>
  </tr>
  <tr >
    <td width="10%">序号</td>
    <td width="10%" ><p >党员干部姓名 </p></td>
    <td width="10%" valign="center" ><p >职&nbsp;务 </p></td>
    <td width="10%" valign="center" ><p >结对时间 </p></td>
    <td width="15%" valign="center" ><p>结对对象姓名 </p></td>
    <td width="15%" valign="center" ><p >残疾类别 </p></td>
    <td width="15%" colspan="3">操作</td>
  </tr>
 
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="fcbkjdry" varStatus="num">
					<tr>
					    <td>${num.count + size * (current - 1)}</td>
						<td>${fcbkjdry.gbxm}</td>
					    <td>${fcbkjdry.role}</td>
					    <td>${fcbkjdry.jdsj}</td>
					    <td>${fcbkjdry.jdxm}</td>
					    <td >${fcbkjdry.cjlb}</td>
						<td colspan="3">
						<div class="btn-group">
						<shiro:hasPermission name="fcbkjd:update">
							<a  class="btn " href="/fcbkjd/item/update/${fcbkjdry.id}/${businessFormId }/${fcbkjd.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="fcbkjd:delete">
							<a class="btn  b_delete_fcbkjd_item" href="/fcbkjd/item/delete/${fcbkjdry.id }/${businessFormId }/${fcbkjd.id}" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/fcbkjd/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_fcbkjd_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>