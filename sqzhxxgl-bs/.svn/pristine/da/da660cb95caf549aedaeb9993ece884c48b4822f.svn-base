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
    <li><a href="/lxfwgzsjwt/list/1">联系服务工作收集问题提交单</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="lxfwgzsjwt:add">
		  <a style="float: right" href="/lxfwgzsjwt/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/lxfwgzsjwt/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		  <shiro:hasPermission name="lxfwgzsjwt:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/lxfwgzsjwt/list/1"><i class="icon-share-alt"></i> 返回</a>
		 </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			
			<tbody>
				<c:forEach items="${datas}" var="lxfwgzsjwt" varStatus="num">
				 <tr >
    <td width="103" valign="center" ><p >居民区： </p></td>
    <td width="184" valign="center" colspan="3" ><p >${lxfwgzsjwt.jmq}</p></td>
    <td width="117" valign="center" colspan="2" ><p >编号： </p></td>
    <td width="178" valign="center" colspan="2" ><p >${lxfwgzsjwt.bh}</p></td>
  </tr>
  <tr >
    <td width="103" valign="center" ><p >诉求反映人 </p></td>
    <td width="184" valign="center" colspan="3" ><p >${lxfwgzsjwt.sqfyr}</p></td>
    <td width="117" valign="center" colspan="2" ><p >所属责任区 </p></td>
    <td width="178" valign="center" colspan="2" ><p >${lxfwgzsjwt.sszrq}</p></td>
  </tr>
  <tr >
    <td width="103" valign="center" ><p >地址 </p></td>
    <td width="184" valign="center" colspan="3" ><p >${lxfwgzsjwt.dz}</p></td>
    <td width="117" valign="center" colspan="2" ><p >联系方式 </p></td>
    <td width="178" valign="center" colspan="2" ><p >${lxfwgzsjwt.lxfs}</p></td>
  </tr>
  <tr >
    <td width="103" valign="center" ><p >问题简述 </p></td>
    <td width="480" valign="center" colspan="7" ><p >${lxfwgzsjwt.wtjs}</p></td>
  </tr>
 
  <tr>
    <td width="103" valign="center" rowspan="2"><p >问题归类 </p></td>
    
 
  </tr>
  <tr>
    <td width="59" valign="center" colspan="7" ><p >${lxfwgzsjwt.wtgl}</p></td>
    
  </tr>
  <tr>
    <td width="103" height="34" valign="center" ><p >组织科<br />
    处理意见 </p></td>
    <td width="480" valign="center" colspan="7" ><p >${lxfwgzsjwt.zzkclyj}</p></td>
  </tr>
  <tr >
    <td width="103" height="36" valign="center" ><p >职能科室解决情况反馈 </p></td>
    <td width="480" valign="center" colspan="7" ><p >${lxfwgzsjwt.jjqkfk}</p></td>
  </tr>
  <tr >
    <td width="103" height="42" valign="center" ><p >是否需提交领导班子研究 </p></td>
    <td width="480" valign="center" colspan="7" ><p > ${lxfwgzsjwt.ldbzyj}</p></td>
  </tr>
				 <tr >
					<td colspan="2">
						<div class="btn-group">
						<shiro:hasPermission name="lxfwgzsjwt:update">
							<a  class="btn " href="/lxfwgzsjwt/item/update/${lxfwgzsjwt.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="lxfwgzsjwt:delete">
							<a class="btn  b_delete_lxfwgzsjwt_item" href="/lxfwgzsjwt/item/delete/${lxfwgzsjwt.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/lxfwgzsjwt/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_lxfwgzsjwt_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>