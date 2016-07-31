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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/jtfwone/list/1">房屋、土地经营（出租）登记表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="jtfwone:add">
		  <a style="float: right" href="/jtfwone/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/jtfwone/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	<shiro:hasPermission name="jtfwone:add">
     <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/jtfwone/list/1"><i class="icon-share-alt"></i> 返回</a>	
     </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<tbody>
				<c:forEach items="${datas }" var="jtfwone" varStatus="num">
						<tr>
					<th><span style="color: red">集体房屋土地出租</span></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>房屋位置(地址):</th>
					<td>${jtfwone.fwwz }</td>
					<th>门牌号:</th>
					<td>${jtfwone.mph }</td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>房屋总面积:</th>
					<td>${jtfwone.fwzmj }</td>
					<th>其中:有证面积:</th>
					<td>${jtfwone.fwyzmj }</td>
					<th>其中:无证面积</th>
					<td>${jtfwone.fwwzmj }</td>
				</tr>
				<tr>
					<th>已出租总面积:</th>
					<td>${jtfwone.yczzmj }</td>
					<th>其中:有证面积:</th>
					<td>${jtfwone.yczyzmj }</td>
					<th>其中:无证面积</th>
					<td>${jtfwone.yczwzmj }</td>
				</tr>
				<tr>
					<th>土地位置:</th>
					<td>${jtfwone.tdwz }</td>
					<th></th>
					<td></td>
					<th>宗地号:</th>
					<td>${jtfwone.zdh }</td>
				</tr>
				<tr>
					<th><span style="color: blue">地块总面积:</span></th>
					<td> ${jtfwone.dkzmj }</td>
					<th></th>
					<td></td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>有证面积:</th>
					<td> ${jtfwone.dyzmj }</td>
					<th>其中:农用地</th>
					<td>${jtfwone.dyzny }</td>
					<th>其中:非农用</th>
					<td>${jtfwone.dyzfn } </td>
				</tr>
				<tr>
					<th>无证面积:</th>
					<td>${jtfwone.dwzmj } </td>
					<th>其中:农用地</th>
					<td> ${jtfwone.dwzny }</td>
					<th>其中:非农用</th>
					<td>${jtfwone.dwzfn } </td>
				</tr>
				<tr>
					<th><span style="color: blue">已出租地块总面积:</span></th>
					<td> ${jtfwone.ydkzmj }</td>
					<th></th>
					<td></td>
					<th></th>
					<td> </td>
				</tr>
					<tr>
					<th>有证面积:</th>
					<td>${jtfwone.yyzmj }</td>
					<th>其中:农用地</th>
					<td> ${jtfwone.yyzny }</td>
					<th>其中:非农用</th>
					<td>${jtfwone.yyzfn } </td>
				</tr>
				<tr>
					<th>无证面积:</th>
					<td>${jtfwone.ywzmj } </td>
					<th>其中:农用地</th>
					<td>${jtfwone.ywzny } </td>
					<th>其中:非农用</th>
					<td> ${jtfwone.ywzfn }</td>
				</tr>
				<tr>
					<th><span style="color: red">集体土地出租:</span></th>
					<td> </td>
					<th></th>
					<td></td>
					<th></th>
					<td> </td>
				</tr>
				<tr>
					<th>出租总面积:</th>
					<td>${jtfwone.tdczmj } </td>
					<th>其中:农用地</th>
					<td> ${jtfwone.tdczny } </td>
					<th>其中:非农用</th>
					<td>${jtfwone.tdczfn }</td>
				</tr>
				<tr>
					<th></th>
					<td> </td>
					<th>登记人:</th>
					<td>${jtfwone.djr } </td>
					<th>日期:</th>
					<td> ${jtfwone.rq }</td>
				</tr>
				<tr>
					<th></th>
					<td></td>
					<th></th>
					<td>		</td>
					<th></th>
					<td><shiro:hasPermission name="jtfwone:update"><a  class="btn " href="/jtfwone/item/update/${jtfwone.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a><a class="btn  b_delete_item" href="/jtfwone/item/delete/${jtfwone.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a></shiro:hasPermission></td>
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
					'${pages}', '${count}', '/jtfwone/item/', '/${businessFormId }');
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