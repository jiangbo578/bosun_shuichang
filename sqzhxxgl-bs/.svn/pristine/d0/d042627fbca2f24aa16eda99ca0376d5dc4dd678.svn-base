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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/bzcybt/list/1">团支部概况及班子成员名单</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >

		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="bzcybt:add">
		  <a style="float: right" href="/bzcybt/item/add/${businessFormId}/${bzcybt.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  <a style="float: right;margin-right: 31px;padding-left: 10px" href="/bzcybt/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		<shiro:hasPermission name="bzcybt:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/bzcybt/list/1"><i class="icon-share-alt"></i> 返回</a>
	      </shiro:hasPermission>
		<table  class="table table-striped table-bordered table-hover" id="back1">
				<tr>
					<th width="10%">团支部名称</th>
					<th width="10%">团支部书记姓名</th>
					<th width="10%">所属团支部数</th>
					<th width="10%">团员数</th>
					<th width="10%">其中来沪团员</th>
					<th width="10%">14岁—28岁青年数</th>
					<th width="10%">其中来沪青年</th>
					<th width="10%">29岁—35岁青年数</th>
					<th width="10%">其中来沪青年</th>
				</tr>
				<tr >
						<td>${bzcybt.tzbmc}</td>
						<td>${bzcybt.tzbsjxm}</td>
						<td>${bzcybt.sstzbs}</td>
						<td>${bzcybt.tys}</td>
						<td>${bzcybt.fc}</td>
						<td>${bzcybt.fa}</td>
						<td>${bzcybt.fd}</td>
						<td>${bzcybt.fb}</td>
						<td>${bzcybt.fe}</td>
						<td>
							<div class="btn-group">
							<a  href="javascript:change()" class="btn"><i class="icon-pencil"></i>修改</a>
						</div>
						</td>
					</tr>
					</table>
					
	<form  method="post" action="/bzcybt/item/update1" >
	<table id="back2" style="display: none"class="table table-striped table-bordered table-hover" >				
				<tr>
					<th width="10%">团支部名称</th>
					<th width="10%">团支部书记姓名</th>
					<th width="10%">所属团支部数</th>
					<td></td>
					</tr>
						<tr >
						<td ><input type="text" id="tzbmc" value="${bzcybt.tzbmc}" name="tzbmc">  </td>
						<td><input type="text" id="tzbsjxm" value="${bzcybt.tzbsjxm}" name="tzbsjxm" > </td>
						<td><input type="text" id="sstzbs" value="${bzcybt.sstzbs}" name="sstzbs" > </td>
						<td></td>
						</tr>
					<tr>
					<th width="10%">团员数</th>
					<th width="10%">其中来沪团员</th>
					<th width="10%">14岁—28岁青年数</th>
					<td></td>
					</tr>
						<tr>
						<td><input type="text" id="tys" value="${bzcybt.tys}" name="tys" > </td>
						<td><input type="text" id="fc" value="${bzcybt.fc}" name="fc" > </td>
						<td><input type="text" id="fa" value="${bzcybt.fa}" name = "fa" > </td>
						<td></td>
						</tr>
					<tr>
					<th width="10%">其中来沪青年</th>
					<th width="10%">29岁—35岁青年数</th>
					<th width="10%">其中来沪青年</th>
					<td></td>
				</tr>
			
					
						<tr>
						<td><input type="text" id="fd" value="${bzcybt.fd}"name="fd" > </td>
						<td><input type="text" id="fb" value="${bzcybt.fb}" name="fb" > </td>
						<td><input type="text" id="fe" value="${bzcybt.fe}" name="fe" > </td>
						<td>
						<input type="hidden" id="businessFormId" name="businessFormId" value="${businessFormId }" >
							<div class="btn-group">
							<input type="submit" class="btn " value="提交" >
						</div>
						</td>
					</tr>
			
		</table>
		</form>
		<div style="height: 60px"></div>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			
	
			<thead>
			<tr>
					<th width="5%">序号</th>
					<th width="10%">姓名</th>
					<th width="5%">性别</th>
					<th width="10%">出生年月</th>
					<th width="10%">政治面貌</th>
					<th width="10%">团内职务</th>
					<th width="10%">家庭住址</th>
					<th width="10%">单位</th>
					<th width="10%">民族</th>
					<th width="15%">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="bzcy" varStatus="num">
					<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${bzcy.xm}</td>
						<td>${bzcy.xb}</td>
						<td>${bzcy.csny}</td>
						<td>${bzcy.zzmm}</td>
						<td>${bzcy.tnzw}</td>
						<td>${bzcy.jtzz}</td>
						<td>${bzcy.gzdw}</td>
						<td>${bzcy.mz}</td>
						<td>
							<div class="btn-group">
							<shiro:hasPermission name="bzcybt:update">
							<a  class="btn " href="/bzcybt/item/update/${bzcy.id}/${businessFormId}/${bzcybt.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="bzcybt:delete">
							<a class="btn  b_delete_item" href="/bzcybt/item/delete/${bzcy.id}/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
	function change()
	{
		$("#back1").css("display","none");
		$("#back2").css("display","block");
	}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/bzcybt/item/', '/${businessFormId }');
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