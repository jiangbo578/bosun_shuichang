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
    <li><a href="/sqgzzmd/list/1">社区工作者名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>社区工作者名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/sqgzzmd/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"  id="xm" data-rule="required;" value="${sqgzzmd.xm }" />
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date"  value = "${sqgzzmd.csny }"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny"/>
					</td>
				</tr>
				<tr>
					<th>文化程度 ：</th>
					<td><input name="whcd" type="text" id="whcd"  data-rule="required;chinese;length[1~4]"  value = "${sqgzzmd.whcd }"></input>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" id="zzmm"  value = "${sqgzzmd.zzmm }" data-rule="required;chinese;length[1~4]" />
					</td>
				</tr>
				<tr>
					<th>住址：</th>
					<td><input name="zz" type="text" id="zz"  value = "${sqgzzmd.zz }" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="dh" type="text" id="dh"  value = "${sqgzzmd.dh }"  data-rule="required;"/>
					</td>
				</tr>
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${sqgzzmd.id}">
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
	$('input[name=xb][type=radio][value=${sqgzzmd.xb}]').attr('checked', true);
});
</script>
</body>
</html>