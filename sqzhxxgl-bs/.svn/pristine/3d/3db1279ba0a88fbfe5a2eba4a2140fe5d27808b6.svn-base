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
    <li><a href="/zdyfdxhmc/list/1">重点优抚对象花名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 重点优抚对象花名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/zdyfdxhmc/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;chinese;length[1~4]" value="${zdyfdxhmc.xm }"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>
						<input name="xb" type="radio" value="男" checked="checked"/>男 
						<input name="xb" type="radio" value="女" <c:if test="${zdyfdxhmc.xb eq '女'}">checked="checked"</c:if> />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny" value="${zdyfdxhmc.csny }"/>
					</td>
				</tr>
				<tr>
					<th>家庭地址：</th>
					<td><input name="jtzz" type="text" id="jtzz" data-rule="required;length[1~30];"  value="${zdyfdxhmc.jtzz }"/>
					</td>
				</tr>
				<tr>
					<th>户籍地址：</th>
					<td><input name="hjdz" type="text" data-rule="required;length[1~30];"  value="${zdyfdxhmc.hjdz }"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;" value="${zdyfdxhmc.phone }"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zdyfdxhmc.id}">
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
		$('input[name=audit][type=radio][value=${business.audit ? 1 : 0}]').attr('checked', true);
		$('input[name=remind][type=radio][value=${business.remind ? 1 : 0}]').attr('checked', true);
	});
	</script>
</body>
</html>