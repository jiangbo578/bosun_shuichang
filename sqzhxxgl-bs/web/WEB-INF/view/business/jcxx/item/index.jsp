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
    <li><a href="/jcxx/list/1">基础信息</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="jcxx:add">
		  <a style="float: right" href="/jcxx/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/jcxx/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		  <shiro:hasPermission name="jcxx:add">
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/jcxx/list/1"><i class="icon-share-alt"></i> 返回</a>
		  </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			
			<tbody>
				<c:forEach items="${datas}" var="jcxx" varStatus="num">
				<tr >
    <td width="400" valign="center" colspan="2" ><p >科&nbsp;普&nbsp;工&nbsp;作&nbsp;项&nbsp;目 </p></td>
    <td width="136" valign="center" ><p >内&nbsp;容 </p></td>
  </tr>
  <tr >
    <td width="117" valign="center" rowspan="4" ><p >1.人员保障 </p></td>
    <td width="283" valign="center" ><p >专职科普工作人员 </p></td>
    <td width="136" valign="center" ><p >${jcxx.zzkpry}人 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >兼职科普工作人员 </p></td>
    <td width="136" valign="center" ><p >${jcxx.jzkpyr}人 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >村（居）民担任科普志愿者人数 </p></td>
    <td width="136" valign="center" ><p >${jcxx.zyzrs }人 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普志愿者占居民人数比例 </p></td>
    <td width="136" valign="center" ><p >${jcxx.bl }<b>%</b></p></td>
  </tr>
  <tr >
    <td width="117" valign="center" rowspan="12" ><p >2.设施条件 </p></td>
    <td width="283" valign="center" ><p >科普活动场所 </p></td>
    <td width="136" valign="center" ><p >${jcxx.hdcs }<b>m</b>&#178; </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >室内 </p></td>
    <td width="136" valign="center" ><p >${jcxx.sn }<b>m</b>&#178; </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >室外 </p></td>
    <td width="136" valign="center" ><p >${jcxx.sw }<b>m</b>&#178; </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普宣传栏 </p></td>
    <td width="136" valign="center" ><p >${jcxx.kpxcl }米 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >内容更换频率 </p></td>
    <td width="136" valign="center" ><p >${jcxx.ghpl }次/年 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普图书 </p></td>
    <td width="136" valign="center" ><p >${jcxx.kpts }册 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普光盘 </p></td>
    <td width="136" valign="center" ><p >${jcxx.kpgp }张 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普展板 </p></td>
    <td width="136" valign="center" ><p >${jcxx.kpzb }块 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普展品 </p></td>
    <td width="136" valign="center" ><p >${jcxx.kpzp }件 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普设备名称 </p></td>
    <td width="136" valign="center" ><p >${jcxx.kpsbmc }</p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >数量 </p></td>
    <td width="136" valign="center" ><p >${jcxx.sl }台（件、套） </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >其他 </p></td>
    <td width="136" valign="center" ><p >${jcxx.qt }</p></td>
  </tr>
  <tr >
    <td width="117" valign="center" rowspan="5" ><p >3.经费保障 </p></td>
    <td width="283" valign="center" ><p >年度科普经费 </p></td>
    <td width="136" valign="center" ><p >${jcxx.ndkpjf }元 </p></td>
  </tr>
  <tr >
    <td width="420" valign="center" colspan="2" ><p >其中： </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >自筹经费 </p></td>
    <td width="136" valign="center" ><p >${jcxx.zcjf }元 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >区县财政拨款经费 </p></td>
    <td width="136" valign="center" ><p >${jcxx.bkjf }元 </p></td>
  </tr>
  <tr >
    <td width="283" valign="center" ><p >科普经费占本单位年度经费比例 </p></td>
    <td width="136" valign="center" ><p >${jcxx.jfbl }% </p></td>
  </tr><tr >
					<td colspan="3">
						<div class="btn-group">
						<shiro:hasPermission name="jcxx:update">
							<a  class="btn " href="/jcxx/item/update/${jcxx.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="jcxx:delete">
							<a class="btn  b_delete_jcxx_item" href="/jcxx/item/delete/${jcxx.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/jcxx/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_jcxx_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>