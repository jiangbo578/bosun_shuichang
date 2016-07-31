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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/gzldxz/list/1">居务村务监督委员</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>居务村务监督委员</div>
  <div id="panbody">
	<div class="container">
		<form action="/gzldxz/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;" value="${gzldxz.xm }"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男"/>男 <input name="xb" type="radio" value="女" />女</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required:date" value="${gzldxz.csny }" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" data-rule="required;" value="${gzldxz.zzmm }"/>
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="dz" type="text" value="${gzldxz.dz }" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>担任职务：</th>
					<td><input name="drzw" type="text" data-rule="required;" value="${gzldxz.drzw }"/>
					</td>
				</tr>
				<tr>
					<th>分工职责：</th>
					<td><input name="fgzz" type="text" data-rule="required;" value="${gzldxz.fgzz }"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text" value="${gzldxz.bz }"/>
					</td>
				</tr>
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${gzldxz.id}">
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
	$('input[name=xb][type=radio][value=${gzldxz.xb}]').attr('checked', true);
});
</script>
</body>
</html>