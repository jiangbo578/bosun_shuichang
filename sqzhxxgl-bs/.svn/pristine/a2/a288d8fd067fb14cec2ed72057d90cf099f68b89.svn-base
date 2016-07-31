<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">表单检索</a> <span class="divider">/</span></li>
   
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>表单检索</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
			<p>  <input placeholder="请输入表单名称"  type="text" name="code" id="code" />&nbsp;&nbsp;
	  <a class="btn btn-primary" type="button"  onclick="cx()" ><i class="icon-search"></i>查询</a></p>
      
	<input type="hidden" value="${code}" id="code">
		  
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="20%">表单名称</th>
					<th width="10%">填报周期</th>
					<th width="10%">是否需要审核</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="business" items="${datas}" varStatus="num">
					<tr>
					<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					<td><a href="/${business.code}/list/">${business.name}</a></td>
					<td>${business.period }</td>
					<td>${business.audit==true?'是':'否' }</td>
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
	<script type="text/javascript">
	function cx(){
	      var code=document.getElementById("code").value;		
	       location.href="/bslisti/1?code="+code;
			}
	$(function() {
		//分页
		var pagination = new buguPagination('${current}',
				'${pages}', '${count}', '/bslisti/', '?code=${code}');
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