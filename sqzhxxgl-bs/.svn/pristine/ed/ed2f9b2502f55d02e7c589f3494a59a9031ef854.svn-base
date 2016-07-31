<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/tyssdj/list/1">上海市社区公共体育设施各类人员登记表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="tyssdj:add">
		  <a style="float: right" href="/tyssdj/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
	      <a style="float: right;margin-right: 31px;padding-left: 10px" href="/tyssdj/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	       <shiro:hasPermission name="tyssdj:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/tyssdj/list/1"><i class="icon-share-alt"></i> 返回</a>
	  </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			   <tr >
			   <td>序号</td>
							    <td width="127" valign="center"><p >人员类别 </p></td>
							    <td width="42" valign="center" rowspan="2" ><p >姓名 </p></td>
							    <td width="42" valign="center" rowspan="2" ><p >性别 </p></td>
							    <td width="183" valign="center"><p >人员性质 </p></td>
							    <td width="84" valign="center"><p >座机 </p></td>
							    <td width="84" valign="center"><p >手机 </p></td>
							    <td width="84" valign="center"><p >操作</p></td>
							  </tr>
			</thead>
			<tbody>
			
				<c:forEach items="${datas }" var="tyssdj" varStatus="num">
					
					
					<tr>
					 <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${tyssdj.rylb}</td>
						<td>${tyssdj.name}</td>
						<td>${tyssdj.sex}</td>
						<td>${tyssdj.ryxz}</td>
						<td>${tyssdj.tel}</td>
						<td>${tyssdj.phone}</td>
							<td>
							<div class="btn-group">
							 <shiro:hasPermission name="tyssdj:update">
							<a  class="btn " href="/tyssdj/item/update/${tyssdj.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							 <shiro:hasPermission name="tyssdj:delete">
							<a  class="btn  b_delete_tyssdj_item" href="/tyssdj/item/delete/${tyssdj.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/tyssdj/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_tyssdj_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>