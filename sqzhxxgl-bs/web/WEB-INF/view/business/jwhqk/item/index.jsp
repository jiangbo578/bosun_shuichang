<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/jwhqk/list/1">居委会情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="jwhqk:add">
		  <c:if test="${fn:length(datas)==0}">
		  <a style="float: right" href="/jwhqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </c:if>
		  </shiro:hasPermission>
         <a style="float: right;margin-right: 31px;padding-left: 10px" href="/jwhqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
        <shiro:hasPermission name="jwhqk:add">
         <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/jwhqk/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<c:forEach items="${datas}" var="jwhqk" varStatus="num">
				<tr>
				    <td width="25%" height="30"><p >居委会(全称):</p></td>
				    <td colspan="7">${jwhqk.jwhqc}</td>
				  </tr>
				  <tr>
				    <td height="28"><p >党(总)支部成立日期：</p></td>
				    <td colspan="7">${jwhqk.dzbclrq}</td>
				  </tr>
				  <tr>
				    <td height="29"><p >居委会成立日期：</p></td>
				    <td colspan="7">${jwhqk.jwhclrq}</td>
				  </tr>
				  <tr>
				    <td height="28"><p >党(总)支部成员数：</p></td>
				    <td width="12%">${jwhqk.dzbrs}人</td>
				    <td width="11%"><p >其中：书记</p></td>
				    <td width="12%"><p >${jwhqk.dzbsj}人</p></td>
				    <td width="11%"><p >副书记</p></td>
				    <td width="7%"><p >${jwhqk.dzbfsj}人</p></td>
				    <td width="6%"><p >委员</p></td>
				    <td width="16%"><p >${jwhqk.dzbwy}人</p></td>
				  </tr>
				  <tr>
				    <td height="32"><p >居委会成员人数：</p></td>
				    <td>${jwhqk.jwhrs}人</td>
				    <td><p >其中：主任</p></td>
				    <td>${jwhqk.jwhzr}人</td>
				    <td><p >副主任</p></td>
				    <td><p >${jwhqk.jwhfzr}人</p></td>
				    <td><p >委员</p></td>
				    <td>${jwhqk.jwhwy}人</td>
				  </tr>
				  <tr>
				    <td height="28"><p >所属：(街镇)</p></td>
				    <td colspan="7">${jwhqk.jd}</td>
				  </tr>
				  <tr>
				    <td height="33"><p >办公地址：</p></td>
				    <td colspan="7">${jwhqk.bgdz}</td>
				  </tr>
				  <tr>
				    <td height="32"><p >电话：</p></td>
				    <td>${jwhqk.phone}</td>
				    <td><p >E-MALL地址:</p></td>
				    <td>${jwhqk.emall}</td>
				    <td colspan="3"><p >邮政编码：</p></td>
				    <td>${jwhqk.code}</td>
				  </tr>
				  <tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					     <td colspan="7">
							<div class="btn-group">
							<shiro:hasPermission name="jwhqk:update">
							<a  class="btn " href="/jwhqk/item/update/${jwhqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="jwhqk:delete">
							<a class="btn  b_delete_item" href="/jwhqk/item/delete/${jwhqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
							</shiro:hasPermission>
						  </div>
						</td>
					</tr>
					
				</c:forEach>
			</thead>
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
					'${pages}', '${count}', '/jwhqk/item/', '/${businessFormId }');
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