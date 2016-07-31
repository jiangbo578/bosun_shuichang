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
    <li><a href="/taizhang/list/2">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/bgfyzc/list/1">不规范生猪养殖场（户）整治推进情况统计</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="bgfyzc:add">
		  <a style="float: right" href="/bgfyzc/item/add/${businessFormId}/${superman.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/bgfyzc/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="bgfyzc:add">
	     <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/bgfyzc/list/1"><i class="icon-share-alt"></i> 返回</a>
	     </shiro:hasPermission>
	<table class="table table-striped table-bordered table-hover">
	<tr>
					    <th colspan="10">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;统计单位（签章）：${superman.cwh}</th>
					   
						
					</tr>
	</table>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			
			
					
					<tr>
					<tH width="7%">序号</tH>
					<th width="8%">养殖户</th>
					<th width="8%">新 增</th>
					<th width="8%">外来户</th>
					<th width="10%">使用泔水</th>
					<th width="10%">养殖地点</th>
					<th width="10%">联系电话</th>
					<th width="7%">公猪</th>
					<th width="7%">母猪</th>
					<th width="10%">商品肉猪</th>
					<th width="10%">是否列入今年整治计划</th>
				
			     	<th width="10%">整治情况 </th>
				
				<th  width="10%">操作</th>
					</tr>
				</thead>
					<c:forEach var="bgfyzc"  items="${datas}" varStatus="num">
					
					<tr>
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${bgfyzc.yzh}</td>
					    <td>${bgfyzc.xz}</td>
					    <td>${bgfyzc.wlh}</td>
					    <td>${bgfyzc.gs}</td>
					    <td>${bgfyzc.yzdd}</td>
					    <td>${bgfyzc.phone}</td>
					    <td>${bgfyzc.gz}</td>
					    <td>${bgfyzc.mz}</td>
					  <td>${bgfyzc.sprz}</td>
					  <td>${bgfyzc.jhzzs}</td>
				
					  <td>${bgfyzc.yzzs}</td>
					
					<td>
							
							<div class="btn-group">
							 <shiro:hasPermission name="bgfyzc:update">
							<a  class="btn " href="/bgfyzc/item/update/${bgfyzc.id }/${businessFormId }/${superman.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							 <shiro:hasPermission name="bgfyzc:delete">
							<a  class="btn  b_delete_bgfyzc_item" href="/bgfyzc/item/delete/${bgfyzc.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						    </shiro:hasPermission>
						</div>
						
						</td>
					</tr>
					</c:forEach>
					<tr>
					<th colspan="7">合计：</th>
					
					<th>${bg.gz}</th>
					<th>${bg.mz}</th>
					<th>${bg.sprz}</th>
					<th>${jhzz}</th>
					<th>${zzqk}</th>
					<th colspan="2">整治进度:${zzjd}%</th>
					
					</tr>
					<tr>
					<th colspan="3">统计日期：${superman.tbrq}</th>
					
					<th colspan="11" align="right"> 统计人员签字：   ${superman.tbr}</th>
					
					</tr>
				
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
					'${pages}', '${count}', '/bgfyzc/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_bgfyzc_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>