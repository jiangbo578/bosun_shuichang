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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/zzjbqk/list/1">组织基本情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="zzjbqk:add">
		  <a style="float: right" href="/zzjbqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/zzjbqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="zzjbqk:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/zzjbqk/list/1"><i class="icon-share-alt"></i> 返回</a>
		  </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			
			<tbody>
				<c:forEach items="${datas}" var="zzjbqk" varStatus="num">
				<tr>
    <td width="90"><p>单位名称 </p></td>
    <td colspan="5"><p >${zzjbqk.dwmc}</p></td>
  </tr>
  <tr>
    <td width="90"><p>面  积 </p></td>
    <td colspan="2" width="90"><p >${zzjbqk.mj}&nbsp;&nbsp;&nbsp;km² </p></td>
    <td colspan="2"><p >楼栋分布数量 </p></td>
    <td width="320"><p >${zzjbqk.ldfbsl}栋 </p></td>
  </tr>
  <tr>
    <td width="90"><p>居住总户数 </p></td>
    <td colspan="2"><p>${zzjbqk.jzzhs }户 </p></td>
    <td colspan="2"><p >居住总人口数 </p></td>
    <td width="320"><p >${zzjbqk.jzzrks }人 </p></td>
  </tr>
  <tr>
    <td width="90"><p>负 责 人 </p></td>
    <td width="99"><p >${zzjbqk.fzr }</p></td>
    <td colspan="2"><p >联系电话 </p></td>
    <td colspan="2"><p >${zzjbqk.fzrlxdh }</p></td>
  </tr>
  <tr>
    <td width="90" height="18"><p>联 系 人 </p></td>
    <td width="21"><p >${zzjbqk.lxr }</p></td>
    <td colspan="2"><p >联系电话 </p></td>
    <td colspan="2"><p >${zzjbqk.lxrlxdh}</p></td>
  </tr>
  <tr>
    <td width="90"><p>通讯地址 </p></td>
    <td colspan="5"><p>${zzjbqk.txdz}</p></td>
  </tr>
  <tr>
    <td width="90"><p>邮政编码 </p></td>
    <td width="21"><p >${zzjbqk.yzbm}</p></td>
    <td colspan="2"><p>传    真 </p></td>
    <td colspan="2"><p>${zzjbqk.cz }</p></td>
  </tr>
  <tr>
    <td width="90"><p>电子邮箱 </p></td>
    <td colspan="5"><p >${zzjbqk.dzyx }</p></td>
  </tr>
  <tr>
    <td width="90"><p>村（居委）网页 </p></td>
    <td colspan="5"><p >${zzjbqk.wy }</p></td>
  </tr>
  <tr>
    <td width="90"><p>工作人员 </p></td>
    <td colspan="5"><p >${zzjbqk.gzry }人 </p></td>
  </tr>
				<tr >
					<td colspan="7">
						<div class="btn-group">
						<shiro:hasPermission name="zzjbqk:update">
							<a  class="btn " href="/zzjbqk/item/update/${zzjbqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="zzjbqk:delete">
							<a class="btn  b_delete_zzjbqk_item" href="/zzjbqk/item/delete/${zzjbqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/zzjbqk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_zzjbqk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>