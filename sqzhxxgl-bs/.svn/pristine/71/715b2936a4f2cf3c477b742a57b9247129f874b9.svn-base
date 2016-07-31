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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/zzdygk/list/1">居住在本居民区的在职党员概况名册</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="zzdygk:add">
		  <a style="float: right" href="/zzdygk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		 </shiro:hasPermission>
         <a style="float: right;margin-right: 31px;padding-left: 10px" href="/zzdygk/export/extend/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="zzdygk:add">
		 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/zzdygk/list/1"><i class="icon-share-alt"></i> 返回</a>
		 </shiro:hasPermission>
		 <div class="well">
				<div align="center"><span style="font-size: 18px;">在职党员概况</span>
				<shiro:hasPermission name="zzdygk:update">
				<a  class="btn " onclick="swap('editForm');" href="javascript:void(0)"><i class="icon-pencil"></i>修改</a>
				</shiro:hasPermission>
				</div>
				
    			<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
						<tr>
							<th width="5%">截至（时间）</th>
							<td width="5%" colspan="3">${zzdygkHead.date }</td>
							<th width="5%">在职党员共有</th>
							<td width="5%" colspan="3">${zzdygkHead.zzCount }</td>
						</tr>
						<tr>
							<th width="5%">其中正式党员</th>
							<td width="5%">${zzdygkHead.zsCount }</td>
							<th width="5%">预备党员</th>
							<td width="5%">${zzdygkHead.ybCount }</td>
							<th width="5%">已经报到</th>
							<td width="5%">${zzdygkHead.registerCount }</td>
							<th width="5%">有特长的</th>
							<td width="5%">${zzdygkHead.tcCount }</td>
						</tr>
    			</table>
            
            <div  id="editForm" style="display: none;">
            	<form action="/zzdygk/item/head/update/${businessFormId }" method="post">
            	  <input type="hidden" name="id" value="${zzdygkHead.id }">
            	  <table class="table table-striped table-bordered">
            		  <tr></tr>
            	  		<tr>
            	  			<td>
            	  			 <div class="col-sm-3 form-group">
	                        <label class="control-label" >截至时间：</label>
	                        <input name="date" type="text" data-rule="required;date" 
						onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${zzdygkHead.date }"/>
	                   </div>
            	  			</td>
            	  			
            	  			<td>
            	  				 <div class="col-sm-3 form-group">
	                        <label class="control-label" >在职党员共有：</label>
	                        <input name="zzCount" type="text" class="" data-rule="required;number" value="${zzdygkHead.zzCount }"/>
	                 </div>
            	  
            	  			</td>
            	  			
            	  		</tr>
            	  		<tr>
            	  			<td>
            	  				<div class="col-sm-3 form-group">
	                        <label class="control-label" >正式党员共有：</label>
	                        <input name="zsCount" type="text" data-rule="required;number" value="${zzdygkHead.zsCount }"/>
	                 </div>
            	  			</td>
            	  			
            	  			<td>
            	  				
	                   <div class="col-sm-3 form-group" >
	                        <label class="control-label" >预备党员共有：</label>
	                        <input name="ybCount" type="text" data-rule="required;number" value="${zzdygkHead.ybCount }"/>
	                 </div>
            	  			</td>
            	  		</tr>
            	  		<tr>
            	  			<td>
            	  				 <div class="col-sm-3 form-group">
                        <label class="control-label" >已经报到：</label>
                        <input name="registerCount" type="text" data-rule="required;number" value="${zzdygkHead.registerCount }"/>
                 </div>
            	  			</td>
            	  			<td>
            	  				<div class="col-sm-3 form-group">
                        <label class="control-label" >有特长的：</label>
                        <input name="tcCount" type="text" data-rule="required;number" value="${zzdygkHead.tcCount }"/>
                 </div>
            	  			</td>
            	  		</tr>
            	  		<tr>
            	  		<td style="text-align: right;">
                		<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
					
            	  		
            	  		</td>
            	  			<td><button  class="btn btn-info" type="button" onclick="swap('editForm');" ><i class="icon-share-alt"></i> 返回</button></td>
            	  		</tr>
            	  </table>
                   
               
                </form>
            </div>
	 </div>
		 
		 
		 
		 
		 
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="3%">性别</th>
					<th width="5%">出生年月</th>
					<th width="5%">文化程度</th>
					<th width="10%">家庭住址</th>
					<th width="5%">入党年月</th>
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="zzdygkItem" varStatus="num">
					<tr>
						<td>${num.count + size *(current - 1) }</td>
						<td>${zzdygkItem.xm }</td>
						<td>${zzdygkItem.xb }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${zzdygkItem.csny }'/></td>
						<td>${zzdygkItem.whcd }</td>
						<td>${zzdygkItem.jtzz }</td>
						<td><fmt:formatDate pattern='yyyy-MM-dd' value='${zzdygkItem.rdny }'/></td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="zzdygk:update">
							<a  class="btn " href="/zzdygk/item/update/${zzdygkItem.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="zzdygk:delete">
							<a class="btn  b_delete_zzdygk_item" href="/zzdygk/item/delete/${zzdygkItem.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/zzdygk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_zzdygk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>