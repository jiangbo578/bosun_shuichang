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
    <li><a href="/tyssqclb/list/1">社区公共体育设施器材（场地）详细情况登记表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="tyssqclb:add">
		  		  <a style="float: right" href="/tyssqclb/item/add/${businessFormId}/${tyssqclb.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  		 </shiro:hasPermission>
		  		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/tyssqclb/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	              <shiro:hasPermission name="tyssqclb:add">
	              <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/tyssqclb/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			 <tr>
					<th width="10%">设施名称：${tyssqclb.lb}</th>
					<th width="15%">地址:${tyssqclb.address}</th>									
					<th width="10%" >操作&nbsp;&nbsp;    <shiro:hasPermission name="tyssqclb:update"> <a  class="btn " href="/tyssqclb/item/update/${tyssqclb.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a></shiro:hasPermission>
							            <!--   <a  class="btn  b_delete_tyssqclb_item" href="/tyssqclb/item/delete/${tyssqclb.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a> --></th>					
             </tr>
              <tr>
                  
					
					<th width="10%">序号</th>
					<th width="15%">器材（运动场）名称</th>
					<th width="10%">数量（件/片）</th>
					<th width="10%">操作</th>
  </tr>
  <tbody>
                <c:forEach  items="${datas}" var="tyssqc" varStatus="num">
                <tr>
                    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
                    <td>${tyssqc.qcmc}</td>
                    <td>${tyssqc.sl}</td>
                   <td>
							<div class="btn-group">
							<shiro:hasPermission name="tyssqclb:update">
							<a  class="btn " href="/tyssqclb/item/update1/${tyssqc.id}/${businessFormId }/${tyssqclb.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="tyssqclb:delete">
							<a class="btn  b_delete_item" href="/tyssqclb/item/delete/${tyssqc.id }/${businessFormId}" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
						</div>
						</td>
                    </tr>
                </c:forEach>
            </tbody>
  
			</thead>
			
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
					'${pages}', '${count}', '/tyssqclb/item/', '/${businessFormId }');
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