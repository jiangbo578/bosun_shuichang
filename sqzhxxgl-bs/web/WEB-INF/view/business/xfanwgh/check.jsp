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
    <li ><a href="/xfanwgh/list/1">消防安全网格化管理</a> <span class="divider">/</span></li>
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
				    <tH>序号</tH>
					<th>业主</th>
					<th>户籍</th>
					<th>联系电话</th>
					<th>经营地址</th>
					<th>经营内容</th>
					<th>所属行业</th>
					<th>房屋性质（是否违章）</th>
					<th>产权所有</th>
					<th>备注</th>
					</tr>
					<c:forEach var="xfanwgh"  items="${datas}" varStatus="num">
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${xfanwgh.yz}</td>
					    <td>${xfanwgh.hj}</td>
					    <td>${xfanwgh.phone}</td>
					    <td>${xfanwgh.jydz}</td>
					    <td>${xfanwgh.jynr}</td>
					    <td>${xfanwgh.sshyp}</td>
					    <td>${xfanwgh.fwxz}</td>
					    <td>${xfanwgh.cqsy}</td>
						<td>${xfanwgh.remark}</td>
					
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
				<form action="/xfanwgh/check" method="post">
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
				'${pages}', '${count}', '/xfanwgh/check/', '/${businessFormId }');
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