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
    <li><a href="/hszfwzjz/list/1">红十字服务站救灾联络员名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 红十字服务站救灾联络员名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/hszfwzjz/item/update" method="post">

			<table>
			 <tr>
					<th>搜索，请输入姓名或身份证号码：</th>
					<td><input type="text" id="b_search"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr> 
				
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" id="name"  data-rule="required;"  value="${hszfwzjz.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" id="birthday" type="text"  id="birthday" onClick="WdatePicker()" class="Wdate" data-rule="required;date" value="${hszfwzjz.birthday}"/>
					</td>
				</tr>
				
				<tr>
					<th>住址：</th>
					<td><input name="address" type="text" id="address" data-rule="required;" value="${hszfwzjz.address}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required;" value="${hszfwzjz.phone}"/>
					</td>
				</tr>
				<tr>
					<th>工作单位：</th>
					<td><input name="gzdw" type="text"  value="${hszfwzjz.gzdw}" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text"  value="${hszfwzjz.bz}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${hszfwzjz.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
 <script src="/scripts/business/hszfwzjz.js"></script> 
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			$('input[name=sex][type=radio][value=${hszfwzjz.sex}]').attr('checked', true);
		});
	</script>
</body>
</html>