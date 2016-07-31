<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li ><a href="/xqdc/list/1">居委社会单位(场所)、住宅小区底册</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>审核报表</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
				<th width="10%">标题：</th>
				<td width="90%">${businessForm.name}</td>
			</tr></thead>
			<tbody>
			<tr>
			<th>内容</th>
			<td>
				<table class="table table-striped table-bordered table-hover">
				<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="18%">住宅小区名称</th>
					<th width="13%">单位地址</th>
					<th width="13%">联系人</th>
					<th width="13%">联系方式</th>
					<th width="13%">登记年份</th>
																	
				</tr>
					<c:forEach var="xqdc"  items="${datas}" varStatus="num">
					<tr>
					<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${xqdc.xqmc}</td>
						<td>${xqdc.dwdz}</td>
						<td>${xqdc.lxr}</td>
						<td>${xqdc.lxfs}</td>
						<td>${xqdc.djnf}</td>
						<td>
					<div class="btn-group">
							<a class="btn " onclick="show('${xqdc.id}')"><i class="icon-eye-open"></i>单位基本情况</a>
							
						</div>
						</td>
					</tr>
					</c:forEach>
					
				</tbody>
				</table>
				<div class="pagination" >
				<ul style="float: right;" id="b_pagination"></ul></div>
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/xqdc/check" method="post">
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
	function show(id){
		parent.$.jBox("iframe:/xqdc/item/many/1/"+id, {
	    title: "单位基本情况",
	    width: 1000,
	    height: 450,
	    buttons: { '关闭': true }
	});
	}
	$(function() {
		//分页
		var pagination = new buguPagination('${current}',
				'${pages}', '${count}', '/xqdc/check/', '/${businessFormId }');
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

	</script>
</body>
</html>