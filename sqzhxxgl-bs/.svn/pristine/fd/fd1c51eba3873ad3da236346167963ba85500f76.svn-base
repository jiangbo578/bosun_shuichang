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

    <li class="active"><a href="/assess/list/1">考核管理</a> <span class="divider">/</span></li>
     <li class="active"><a href="/assess/child/list/${assessId }/1">${assess.name }[${assess.identityName }]-考核项目</a> <span class="divider">/</span></li>
      <li class="active">【${template.project }】-考核类别</li>
     <!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>考核类别</strong> 
   
  </div>
	<div class="container">
		<a style="margin-bottom: 10px"  class='btn btn-success' href="/assess/child/item/add/${assessId}/${tempId}"><i class="icon-plus"></i>添加</a>
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="8%">序号</th>
					<th width="35%">考核类别名称</th>
					<th width="35%">考核类别</th>
					<th width="35%">备注</th>
					<th width="47%">操作</th>
				</tr>
			</thead>
			<tbody>
					
				<c:forEach items="${datas }" var="tempType" varStatus="num">
					<tr >
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${tempType.type }</td>
						<td>${tempType.khgz}</td>
						<td>${tempType.description }</td>
						<td>
						<div class="btn-group">
							<a class="btn" onclick="show('${tempType.id}')"><i class="icon-edit"></i>考核规则</a>
							<a class="btn" href="/assess/child/item/update/${assessId }/${tempId}/${tempType.id }"><i class="icon-edit"></i>修改 </a>
							<a class="btn b_delete_assess" href="/assess/child/item/delete/${assessId }/${tempId }/${tempType.id }" ><i class="icon-trash"></i>删除</a>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pagination">
		<ul  style="float: right;" id="b_pagination"></ul></div>
	</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include><br>		<br><br>
	<script>
	function show(id){
		parent.$.jBox("iframe:/assess/rule/list/1/"+id, {
	    title: "考核规则",
	    width: 1000,
	    height: 500,
	    buttons: { '关闭': true }
	});
	}
	
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/assess/child/item/list/${assessId}/${tempId}/');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该组织结构吗?');
			$('.b_delete_assess').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
			parent.iFrameHeight();
	</script>
</body>
</html>