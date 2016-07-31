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
    <li><a href="/syfwxx/list/1">实有房屋信息</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="syfwxx:add">
		   <c:if test="${fn:length(datas)==0}">
		  <a style="float: right" href="/syfwxx/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </c:if>
		  </shiro:hasPermission>
		    <a style="float: right;margin-right: 31px;padding-left: 10px" href="/syfwxx/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
        <shiro:hasPermission name="syfwxx:add">
        	<a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/syfwxx/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
			
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="syfwxx" varStatus="num">
				<tr >
    <td width="288" valign="center" colspan="2" ><p >实有房屋总户数 </p></td>
    <td width="360" valign="center" colspan="3" ><p >${syfwxx.zhs}</p></td>
  </tr>
  <tr >
    <td width="156" valign="center" ><p >实有房屋总间数 </p></td>
    <td width="132" valign="center" ><p >${syfwxx.zjs}</p></td>
    <td width="192" valign="center" colspan="2" ><p >实有房屋总面积 </p></td>
    <td width="168" valign="center" ><p >${syfwxx.zmj}</p></td>
  </tr>
  <tr >
    <td width="648" valign="center" colspan="5" ><p style="text-align: center;">其中： </p></td>
  </tr>
  <tr >
    <td width="156" valign="center" ><p >私房出租总间数 </p></td>
    <td width="132" valign="center" ><p >${syfwxx.sfczjs}</p></td>
    <td width="168" valign="center" ><p >私房出租总面积 </p></td>
    <td width="192" valign="center" colspan="2" ><p >${syfwxx.sfczmj}</p></td>
  </tr>
  <tr >
    <td width="156" valign="center" ><p >有证出租间数 </p></td>
    <td width="132" valign="center" ><p >${syfwxx.yzczjs}</p></td>
    <td width="168" valign="center" ><p >有证出租面积 </p></td>
    <td width="192" valign="center" colspan="2" ><p >${syfwxx.yzczmj}</p></td>
  </tr>
  <tr >
    <td width="156" valign="center" ><p >无证出租间数 </p></td>
    <td width="132" valign="center" ><p >${syfwxx.wzczjs}</p></td>
    <td width="168" valign="center" ><p >无证出租面积 </p></td>
    <td width="192" valign="center" colspan="2" ><p >${syfwxx.wzczmj}</p></td>
  </tr>
  <tr >
    <td width="156" valign="center" ><p >疑似群租间数 </p></td>
    <td width="132" valign="center" ><p >${syfwxx.qzjs}</p></td>
    <td width="168" valign="center" ><p >疑似居改非间数 </p></td>
    <td width="192" valign="center" colspan="2" ><p > ${syfwxx.jgfjs}</p></td>
  </tr>
    <tr >
    <td width="156" valign="center" ><p >所属街镇 </p></td>
    <td width="132" valign="center" colspan="4"><p> ${syfwxx.ssjz}</p></td>
   
  </tr>
					<tr>
						

						<td colspan="6">
								<div class="btn-group">
								<shiro:hasPermission name="syfwxx:update">
							<a  class="btn " href="/syfwxx/item/update/${syfwxx.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="syfwxx:delete">
							<a class="btn  b_delete_item" href="/syfwxx/item/delete/${syfwxx.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/syfwxx/item/', '/${businessFormId }');
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