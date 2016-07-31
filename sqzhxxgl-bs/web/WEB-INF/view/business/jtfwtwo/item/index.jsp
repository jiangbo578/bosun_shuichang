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
    <li><a href="/jtfwtwo/list/1">房屋、土地经营（出租）合同登记表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="jtfwtwo:add">
     <a style="float: right" href="/jtfwtwo/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
     </shiro:hasPermission>
	 <a style="float: right;margin-right: 31px;padding-left: 10px" href="/jtfwtwo/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	<shiro:hasPermission name="jtfwtwo:add">
	 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/jtfwtwo/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<tbody>
				<c:forEach items="${datas }" var="jtfwtwo" varStatus="num">
					<tr>
					<th><b>合同内容</b></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>合同单位(个人)：</th>
					<td>${ jtfwtwo.htdw }</td>
					<th>合同编号：</th>
					<td>${ jtfwtwo.htbh }</td>
					<th>内容摘要：</th>
					<td>${ jtfwtwo.nrzy }</td>
				</tr>
				<tr>
					<th>是否招投标：</th>
					<td>${ jtfwtwo.sfztb }</td>
					<th>收款总额(元)：</th>
					<td>${ jtfwtwo.skze } </td>
					<th>合同期限(起)：</th>
					<td>${ jtfwtwo.htqxq }</td>
				</tr>
				<tr>
					<th>合同期限(止)：</th>
					<td>${ jtfwtwo.htqxz }</td>
					<th>合同履行情况：</th>
					<td>${ jtfwtwo.htlxqk } </td>
					<th>终止日期：</th>
					<td>${ jtfwtwo.zzrq }</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>${ jtfwtwo.bz }</td>
					<th></th>
					<td> </td>
					<th></th>
					<td> </td>
				</tr>
				<tr>
					<th><b>合同兑现情况</b></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>应收款日期：</th>
					<td>${ jtfwtwo.yskrq }</td>
					<th>应收款金额（元）</th>
					<td>${ jtfwtwo.yskje }</td>
					<th>收款日期：</th>
					<td>${ jtfwtwo.skrq } </td>
				</tr>
				<tr>
					<th>收据号码：</th>
					<td>${ jtfwtwo.sjhm }</td>
					<th>收款金额(元)：</th>
					<td>${ jtfwtwo.skje } </td>
					<th>本期未收金额(元)：</th>
					<td>${ jtfwtwo.bqwsje } </td>
				</tr>
				<tr>
					<th>累计未收金额(元)：</th>
					<td>${ jtfwtwo.ljwsje }</td>
					<th>凭证号：</th>
					<td>${ jtfwtwo.pzh }</td>
					<th>登记人：</th>
					<td>${ jtfwtwo.djr } </td>
				</tr>
				<tr>
					<th>日期：</th>
					<td>${ jtfwtwo.rq }</td>
					<th></th>
					<td>		</td>
					<th></th>
					<td><shiro:hasPermission name="jtfwtwo:update"><a  class="btn " href="/jtfwtwo/item/update/${jtfwtwo.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a><a class="btn  b_delete_item" href="/jtfwtwo/item/delete/${jtfwtwo.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a></shiro:hasPermission></td>
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
					'${pages}', '${count}', '/jtfwtwo/item/', '/${businessFormId }');
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