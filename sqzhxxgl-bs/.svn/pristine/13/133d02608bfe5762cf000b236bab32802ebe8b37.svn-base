<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
 <style type="text/css">

    .even{
    background-color:#F0F0F0;}
    .odd{
    background-color:#ffff00;
    color:#ff0000;}
   
    </style>
 
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>


</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/zxtjbdwb/list/1">街镇助学结对统计表（单位版）</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="zxtjbdwb:add">
		  <a style="float: right" href="/zxtjbdwb/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		<a style="float: right;margin-right: 31px;padding-left: 10px" href="/zxtjbdwb/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		<shiro:hasPermission name="zxtjbdwb:add">
		<a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/zxtjbdwb/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		
		<table class="table  table-bordered " style="margin-top: 10px;TABLE-LAYOUT:fixed;WORD-BREAK:break-all">
			<thead>
				</thead>
			<tbody >
				<c:forEach items="${datas}" var="zxtjbdwb" varStatus="num">
			
				<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="8%">序号</th>
					<th width="10%">资助单位</th>
					<th width="20%">地址</th>
					<th width="8%">联系人</th>
					<th width="8%">联系电话</th>
					<th width="8%">单位性质</th>
					<th width="10%">所属街镇</th>
					<th width="8%">姓名</th>
					
				</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${zxtjbdwb.zzdw}</td>
						<td>${zxtjbdwb.dz}</td>
						<td>${zxtjbdwb.lxr}</td>
						<td>${zxtjbdwb.phone}</td>
						<td>${zxtjbdwb.dwxz}</td>
						<td>${zxtjbdwb.ssjz}</td>
						<td>${zxtjbdwb.name}</td>
						
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="5%">性别</th>
				    <th width="10%">身份证</th>
					<th width="10%">家庭住址</th>
					<th width="10%">所属居委会 </th>
					<th width="10%">户籍性质</th>
					<th width="10%">家庭性质 </th>
					<th width="10%">就读学校 </th>
					<th width="10%">学制年限 </th>
					
					
				</tr>
				<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
				       <td>${zxtjbdwb.sex}</td>
						<td>${zxtjbdwb.sfz}</td>
						<td>${zxtjbdwb.address}</td>
						<td>${zxtjbdwb.cwh}</td>
						<td>${zxtjbdwb.hjxz}</td>
						<td>${zxtjbdwb.jtxz}</td>
						<td>${zxtjbdwb.jdxx}</td>
						<td>${zxtjbdwb.xznx}</td>
						</tr>
						<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
						<th width="10%">学习阶段 </th>
					<th width="10%">学习年纪 </th>
					<th width="10%">全年资助金额（元） </th>
					<th width="10%">累计享受资助金额（元） </th>
					<th width="10%">资助起始年限 </th>
					<th width="10%">备注 </th>
					<th width="10%" colspan="2">操作</th>
						</tr>
						<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
						<td>${zxtjbdwb.xxjd}</td>

						<td>${zxtjbdwb.xxnj}</td>
						<td>${zxtjbdwb.zzje}</td>
						<td>${zxtjbdwb.ljje}</td>
						<td>${zxtjbdwb.zzqsnx}</td>
						<td>${zxtjbdwb.bz}</td>
						<td colspan="2" style="padding-left: 60px">
						<div class="btn-group">
						<shiro:hasPermission name="zxtjbdwb:update">
							<a  class="btn " href="/zxtjbdwb/item/update/${zxtjbdwb.id}/${businessFormId}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="zxtjbdwb:delete">
							<a class="btn  b_delete_zxtjbdwb_item" href="/zxtjbdwb/item/delete/${zxtjbdwb.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</shiro:hasPermission>
						</div>
						</td>
						</tr>
					<!-- <tr>
						<td colspan="8" style="background-color: #8E8E8E"> <br/> </td>
						</tr>
						 -->	
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
<script src="/scripts/dialog.js"></script>
<script src="/scripts/pagination.js"></script>
<script src="/scripts/jquery.validator.min.js"></script>
<script src="/scripts/zh_CN.js"></script>
<script src="/scripts/base.js"></script>
<script type="text/javascript">
parent.changeheight(document.body.offsetHeight);
    //修改补丁
	var finalllist =$(".btn");
		for(var i=0;i<finalllist.length;i++){
			if($(finalllist[i]).text()=="名单"){
			$(finalllist[i]).html("<i class='icon-folder-open'></i>查看");
			}
		}
</script>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/zxtjbdwb/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_zxtjbdwb_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>