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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li ><a href="/ffbxd/list/1">非法办学点情况表</a> <span class="divider">/</span></li>
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
					    <th colspan="11">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;村（居委）：${superman.cwh}</th>
					  
						
					</tr>
					<tr>
				<th width="15%">所属街镇</th>
					<th width="15%">所属村、居委</th>
					<th width="15%">办学名称</th>
					<th width="8%">姓名</th>
					<th width="15%">籍贯</th>
					<th width="15%">身份证</th>
					<th width="8%">联系电话</th>
					<th width="8%">办学地址</th>
					<th width="8%">班级数</th>
					<th width="8%">幼儿数</th>
					<th width="10%">房屋性质</th>
					<th width="10%">是否违章搭建</th>
					
					<th width="10%">举办时间</th>
					</tr>
					<c:forEach var="ffbxd"  items="${datas}" varStatus="num">
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${ffbxd.ssjd}</td>
					    <td>${ffbxd.sscwh}</td>
					    <td>${ffbxd.bxmc}</td>
					    <td>${ffbxd.xm}</td>
					    <td>${ffbxd.jg}</td>
					    <td>${ffbxd.sfz}</td>
					    <td>${ffbxd.phone}</td>
					    <td>${ffbxd.bxdz}</td>
					    <td>${ffbxd.bjs}</td>
					    <td>${ffbxd.yrs}</td>
					    <td>${ffbxd.fwxz}</td>
					    <td>${ffbxd.wz}</td>
					    <td>${ffbxd.jbsj}</td>
					</tr>
					</c:forEach>
						<tr>
					<th colspan="3">填报日期：${superman.tbrq }</th>
					
					<th colspan="9" align="right">填报人:${superman.tbr}</th>
					
					</tr>
				</tbody>
				</table>
				<div class="pagination" >
				<ul style="float: right;" id="b_pagination"></ul></div>
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/ffbxd/check" method="post">
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
	$(function() {
		//分页
		var pagination = new buguPagination('${current}',
				'${pages}', '${count}', '/ffbxd/check/', '/${businessFormId }');
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