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
    <li><a href="/xfanwgh/list/1">消防安全网格化管理</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		<shiro:hasPermission name="xfanwgh:add">  
	  <a style="float: right" href="/xfanwgh/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
	  </shiro:hasPermission>
	  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/xfanwgh/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	  <shiro:hasPermission name="xfanwgh:add">
	  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/xfanwgh/list/1"><i class="icon-share-alt"></i> 返回</a>
	  </shiro:hasPermission>
		<table class="table  table-bordered">
			
					
				<tbody>
					<c:forEach var="xfanwgh"  items="${datas}" varStatus="num">
					 <tr class="even">
    <td width="21%"><p align="center">主要责任人： </p></td>
    <td width="39%" colspan="3"><p align="center">居委会主任 </p></td>
    <td width="16%"><p align="center">姓名 </p></td>
    <td width="22%"><p align="center">${ xfanwgh.jwhzrxm}</p></td>
  </tr>
  <tr  class="even">
    <td width="21%" rowspan="3"><p align="center">次要责任人： </p></td>
    <td width="39%" colspan="3"><p align="center">居委会副主任 </p></td>
    <td width="16%"><p align="center">姓名 </p></td>
    <td width="22%"><p align="center">${xfanwgh.jwhfzrxm }</p></td>
  </tr>
  <tr  class="even">
    <td width="11%" rowspan="2"><p align="center">物业公司经理<strong> </strong></p></td>
    <td width="9%" rowspan="2"><p align="center">姓名<strong> </strong></p></td>
    <td width="19%" rowspan="2"><p align="center"><strong>${ xfanwgh.wygsjlxm}</strong></p></td>
    <td width="16%"><p align="center">所属物业公司名称 </p></td>
    <td width="22%"><p align="center">${xfanwgh.wygsmc }</p></td>
    <a name="_GoBack" id="_GoBack"></a> </tr>
  <tr  class="even">
    <td width="16%"><p align="center">所属小区名称 </p></td>
    <td width="22%"><p align="center">${xfanwgh.wyxqmc }</p></td>
  </tr>
  <tr  class="even">
    <td width="21%" rowspan="4"><p align="center">&nbsp;</p>
        <p align="center">负责人 </p>
      <p align="center">&nbsp;</p></td>
    <td width="11%" rowspan="2"><p align="center">楼组长 </p></td>
    <td width="9%" rowspan="2"><p align="center">姓名 </p></td>
    <td width="19%" rowspan="2"><p align="center">${xfanwgh.lzzxm }</p></td>
    <td width="16%" valign="top"><p align="center">所属小区名称 </p></td>
    <td width="22%" valign="top"><p align="center">${xfanwgh.lzzxqmc }</p></td>
  </tr>
  <tr  class="even">
    <td width="16%" valign="top"><p align="center">所属居民楼 </p></td>
    <td width="22%" valign="top"><p align="center">${xfanwgh.jml }</p></td>
  </tr>
  <tr  class="even">
    <td width="11%" rowspan="2"><p align="center">村民小组长 </p></td>
    <td width="9%" rowspan="2"><p align="center">姓名 </p></td>
    <td width="19%" rowspan="2"><p align="center">${ xfanwgh.cmxzzxm}</p></td>
    <td width="16%" valign="top"><p align="center">所属小区名称 </p></td>
    <td width="22%" valign="top"><p align="center">${xfanwgh.cmxqmc }</p></td>
  </tr>
  <tr  class="even">
    <td width="16%" valign="top"><p align="center">所属居民楼 </p></td>
    <td width="22%" valign="top"><p align="center">${xfanwgh.cmjml }</p></td>
  </tr>
				<tr  class="even">
							<td colspan="7" >
							<div class="btn-group" style="float: right;">
							<shiro:hasPermission name="xfanwgh:update">
							<a  class="btn " href="/xfanwgh/item/update/${xfanwgh.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="xfanwgh:delete">
							<a  class="btn  b_delete_xfanwgh_item" href="/xfanwgh/item/delete/${xfanwgh.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/xfanwgh/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_xfanwgh_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>