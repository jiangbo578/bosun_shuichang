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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/djlr/list/1">参加社区体育活动的残疾人名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>参加社区体育活动的残疾人名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/djlr/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text"   data-rule="required" value="${djlr.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 
							<input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				
				<tr>
					<th>年龄：</th>
					<td><input name="age" type="text" id="age" data-rule="required;number" value="${djlr.age }"/>
					</td>
				</tr>
				<tr>
					<th>住址：</th>
					<td><input name="address" type="text" id="address" data-rule="required" value="${djlr.address }"/>
					</td>
				</tr>
				
				<tr>
					<th>联系人：</th>
					<td><input name="lxr" type="text" id="lxr" data-rule="required" value="${djlr.lxr}"/>
					</td>
				</tr>	
				
				<tr>
					<th>电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required" value="${djlr.phone}"/>
					</td>
				</tr>	
				
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${djlr.id}">
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
			$('input[name=sex][type=radio][value=${djlr.sex}]').attr('checked', true);
		});
	
	</script>
</body>
</html>