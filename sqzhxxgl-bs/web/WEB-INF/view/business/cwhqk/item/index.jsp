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
    <li><a href="/cwhqk/list/1">村委会情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <c:if test="${fn:length(datas)==0}">
		  <a style="float: right" href="/cwhqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </c:if>
		<a style="float: right;margin-right: 31px;padding-left: 10px" href="/cwhqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/cwhqk/list/1"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
			
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="cwhqk" varStatus="num">
				<tr>
    <td width="164"><p>村委会(全称):</p></td>
    <td width="391" colspan="9"><p>${cwhqk.qc }</p></td>
  </tr>
  <tr>
    <td width="164"><p>党(总)支部成立日期： </p></td>
    <td width="391" colspan="9"><p>${cwhqk.dzbclrq}</p></td>
  </tr>
  <tr>
    <td width="164"><p>村委会成立日期： </p></td>
    <td width="391" colspan="9"><p>${cwhqk.clrq}</p></td>
  </tr>
  <tr>
    <td width="164"><p>党(总)支部成员数： </p></td>
    <td width="67"><p align="right">${cwhqk.dzbcys}人 </p></td>
    <td width="82"><p>其中：书记 </p></td>
    <td width="44" colspan="2"><p align="right">${cwhqk.sj}人 </p></td>
    <td width="60"><p>副书记 </p></td>
    <td width="57"><p align="right">${cwhqk.fsj}人 </p></td>
    <td width="38" ><p>委员 </p></td>
    <td width="44"  colspan="2"><p align="right">${cwhqk.dzbwy}人 </p></td>
  </tr>
  <tr>
    <td width="164"><p>村委会成员人数： </p></td>
    <td width="67"><p align="right">${cwhqk.cwhrs}人 </p></td>
    <td width="82"><p>其中：主任 </p></td>
    <td width="44" colspan="2"><p align="right">${cwhqk.zr}人 </p></td>
    <td width="60"><p>副主任 </p></td>
    <td width="57"><p align="right">${cwhqk.fzr}人 </p></td>
    <td width="38"><p>委员 </p></td>
    <td width="44"  colspan="2"><p align="right">${cwhqk.cwhwy}人 </p></td>
  </tr>
  <tr>
    <td width="164"><p>所属：(街镇)</p></td>
    <td width="391" colspan="9"><p>${cwhqk.sscz}</p></td>
  </tr>
  <tr>
    <td width="164"><p>办公地址： </p></td>
    <td width="391" colspan="9"><p>${cwhqk.bgdz}</p></td>
  </tr>
  <tr>
    <td width="164"><p>电话： </p></td>
    <td width="120"><p>${cwhqk.dh}</p></td>
    <td width="85" colspan="2"><p>邮箱:</p></td>
    <td width="85" colspan="2"><p>${cwhqk.yx}</p></td>
    <td width="75" colspan="2"><p>邮政编码： </p></td>
    <td width="63" colspan="2"><p>${cwhqk.yb}</p></td>
  
				
					
					</tr>
					<tr>
						<td colspan="10" >
						<div class="btn-group" style="float: right;">
						<shiro:hasPermission name="cwhqk:update">
							<a  class="btn " href="/cwhqk/item/update/${cwhqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
						</shiro:hasPermission>
						<shiro:hasPermission name="cwhqk:delete">
							<a class="btn  b_delete_item" href="/cwhqk/item/delete/${cwhqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/cwhqk/item/', '/${businessFormId }');
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