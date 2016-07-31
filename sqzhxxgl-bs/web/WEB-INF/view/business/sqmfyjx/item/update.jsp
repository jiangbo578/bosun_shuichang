<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
  <ul class="breadcrumb" style="margin-bottom: 5px;">
    <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/sqmfyjx/list/1">社区民防应急箱管理记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 社区民防应急箱管理记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/sqmfyjx/item/update" method="post">

			<table>
				
				<tr>
					<th>管理人：</th>
					<td><input name="glr" type="text" data-rule="required;chinese;length[1~4]" value="${sqmfyjx.glr}"/>
					</td>
				</tr>
			<tr>
					<th>管理时间：</th>
					<td><input name="glsj" type="text"  data-rule="required;date" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${sqmfyjx.glsj}"/>
					</td>
				</tr>
					<tr>
					<th>管理记录：</th>
					<td><input name="gljl" type="text" data-rule="required;" value="${sqmfyjx.gljl}"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" value="${sqmfyjx.remark}"/>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${sqmfyjx.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			$('input[name=xb][type=radio][value=${tdmc.xb}]').attr('checked', true);
		});
	</script>
</body>
</html>