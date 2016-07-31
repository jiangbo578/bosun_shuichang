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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/womanjc/list/1">妇女儿童帮困工作情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 妇女儿童帮困工作情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/aidingwork/item/update" method="post">
			<table>
					<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"  data-rule="required;chinese;length[1~4]" value="${aidingwork.xm }"></input>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>年龄：</th>
					<td><input name="age" type="text"  data-rule="required:digits;" value="${aidingwork.age }"></input>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text"  data-rule="required;" value="${aidingwork.jtzz }"/>
					</td>
				</tr>
					<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text"  data-rule="required;" value="${aidingwork.phone }"/>
					</td>
				</tr>
					
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${aidingwork.id}">
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
			$('input[type=radio][value=${aidingwork.xb}]').attr('checked', true);
		});
	</script>
</body>
</html>