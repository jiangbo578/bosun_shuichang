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
   <li><a href="#">台账样张</a> <span class="divider">/</span></li>
 
  
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong> 台账样张</strong> 
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		 <shiro:hasAnyRoles name="admin">
		  <a style="float: right" href="/demo/add/" class="btn btn-success "><i class="icon-plus"></i>添加</a>
		  </shiro:hasAnyRoles>
		 <table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				
				<tr>
					<th width="5%">序号</th>
					<th width="7%">名称</th>
					
					<th width="7%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="demo" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${demo.name}</td>
						<td>
						<div class="btn-group"> <shiro:hasAnyRoles name="admin">
							<a class="btn  b_delete_item" href="/demo/delete/${demo.id }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasAnyRoles>
							<a class="btn " href="#" onclick="dowload('${demo.path}')" ><i class="icon-arrow-down"></i>下载</a>
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
	function dowload(filename) {

		var filename = filename.replace(".", "|");
		//alert(filename);
		window.location.href = "/download/" + filename;
	}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/demo/list/');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该样张么吗?');
			$('.b_delete_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>