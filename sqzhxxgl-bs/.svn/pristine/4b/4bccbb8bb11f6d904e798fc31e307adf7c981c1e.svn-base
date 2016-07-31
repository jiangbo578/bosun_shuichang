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
    <li><a href="/jksqgz/list/1">健康社区工作统计表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="jksqgz:add">
		  <a style="float: right" href="/jksqgz/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
	<a style="float: right;margin-right: 31px;padding-left: 10px" href="/jksqgz/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	<shiro:hasPermission name="jksqgz:add">
	<a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/jksqgz/list/1"><i class="icon-share-alt"></i> 返回</a>
	</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr >
    <td valign="center" colspan="4" ><p >健康日宣传活动 </p></td>
    <td valign="center" colspan="2" ><p >落实工间操制度的单位 </p></td>
    <td valign="center" colspan="2" ><p >合理膳食工作的单位食堂 </p></td>
    <td valign="center" colspan="5" ><p >健康步道 </p></td>
    <td valign="center" colspan="2" ><p >健康讲座 </p></td>
    <td width="79" valign="center" rowspan="2" ><p >参与建设健康家庭</p></td>
    <td width="105" valign="center" rowspan="2" ><p >参与建设健康单位数</p></td>
  </tr>
  <tr >
    <td width="56" ><p >次数</p></td>
    <td width="80"   ><p >人数 </p></td>
    <td width="110"   ><p >宣传资料</p></td>
    <td width="105"   ><p >支持性工具</p></td>
    <td width="55"   ><p >个数 </p></td>
    <td width="75"   ><p >职工数</p></td>
    <td width="79"   ><p >单位数</p></td>
    <td width="113"   ><p >职工数</p></td>
    <td width="64"   ><p >新增条数 </p></td>
    <td width="40"   ><p >新增长度</p></td>
    <td width="20"   ><p >健康步道总数</p></td>
    <td width="40"   ><p >健康步道总长</p></td>
    <td width="36"   ><p >健身走活动 </p></td>
    <td width="71"   ><p >次数</p></td>
						<td width="86">
							<p>
								人数
							</p>
						</td>
					</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="jksqgz" varStatus="num">
					<tr>
						<td>${jksqgz.jkrcs}</td>
					    <td>${jksqgz.jkrrs}</td>
					    <td>${jksqgz.jkrfs}</td>
					    <td>${jksqgz.jkrsl}</td>
					    <td>${jksqgz.lsgs}</td>
					    <td>${jksqgz.lszgs}</td>
					    <td>${jksqgz.kzdws}</td>
					    <td>${jksqgz.kzzgs}</td>
					    <td>${jksqgz.jkts}</td>
					    <td>${jksqgz.jkcd}</td>
					    <td>${jksqgz.jkzs}</td>
					    <td>${jksqgz.jkzc}</td>
					    <td>${jksqgz.jkhd}</td>
					    <td>${jksqgz.jkjzcs}</td>
					    <td>${jksqgz.jkjzrs}</td>
					    <td>${jksqgz.jsjt}</td>
					    <td>${jksqgz.jsdws}</td>
							<td>
							<div class="btn-group">
							<shiro:hasPermission name="jksqgz:update">
							<a  class="btn " href="/jksqgz/item/update/${jksqgz.id }/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="jksqgz:delete">
							<a  class="btn  b_delete_jksqgz_item" href="/jksqgz/item/delete/${jksqgz.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
					'${pages}', '${count}', '/jksqgz/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_jksqgz_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>