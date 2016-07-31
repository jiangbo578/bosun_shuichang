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
    <li><a href="/zxtjbgrb/list/1">街镇助学结对统计表（个人版）</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="zxtjbgrb:add">
		  <a style="float: right" href="/zxtjbgrb/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/zxtjbgrb/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
         <shiro:hasPermission name="zxtjbgrb:add">
          <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/zxtjbgrb/list/1"><i class="icon-share-alt"></i> 返回</a>
</shiro:hasPermission>
		<table class="table  table-bordered " style="margin-top: 10px">
			<thead>
				
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="zxtjbgrb" varStatus="num">
				<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="5%">序号</th>
					<th width="8%">姓名</th>
					<th width="10%">联系电话</th>
					<th width="8%">政治面貌</th>
					<th width="10%">工作单位</th>
					<th width="10%">工作职务</th>
					<th width="10%">所属街镇</th>
					<th width="8%">姓名</th>
					
				</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${zxtjbgrb.xm}</td>
						
						<td>${zxtjbgrb.phone}</td>
						<td>${zxtjbgrb.zzmm}</td>
						<td>${zxtjbgrb.gzdw}</td>
						<td>${zxtjbgrb.role}</td>
						<td>${zxtjbgrb.ssjz}</td>
						<td>${zxtjbgrb.name}</td>
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="10%">性别</th>
					<th width="15%">身份证</th>
					<th width="10%">家庭住址</th>
					<th width="10%">所属居委会 </th>
					<th width="10%">户籍性质</th>
					<th width="10%">家庭性质 </th>
					<th width="10%">就读学校 </th>
					<th width="10%">学制年限 </th>
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					
	                    <td>${zxtjbgrb.sex}</td>
                        <td>${zxtjbgrb.sfz}</td>
						<td>${zxtjbgrb.address}</td>
						<td>${zxtjbgrb.cwh}</td>
						<td>${zxtjbgrb.hjxz}</td>
						<td>${zxtjbgrb.jtxz}</td>
						<td>${zxtjbgrb.jdxx}</td>
						<td>${zxtjbgrb.xznx}</td>
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="10%">学习阶段 </th>
					<th width="10%">学习年纪 </th>
					<th width="15%">全年资助金额（元） </th>
					<th width="15%">已享受资助金额（元） </th>
					<th width="10%">资助起始年限 </th>
					<th width="10%">备注 </th>
					<th width="10%" colspan="2">操作</th>
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<td>${zxtjbgrb.xxjd}</td>
						<td>${zxtjbgrb.xxnj}</td>
						<td>${zxtjbgrb.zzje}</td>
						<td>${zxtjbgrb.ljje}</td>
						<td>${zxtjbgrb.zzqsnx}</td>
						<td>${zxtjbgrb.bz}</td>
						<td colspan="2" style="padding-left: 50px">
						<div class="btn-group">
						<shiro:hasPermission name="zxtjbgrb:update">
							<a  class="btn " href="/zxtjbgrb/item/update/${zxtjbgrb.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="zxtjbgrb:delete">
							<a class="btn  b_delete_zxtjbgrb_item" href="/zxtjbgrb/item/delete/${zxtjbgrb.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/zxtjbgrb/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_zxtjbgrb_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>