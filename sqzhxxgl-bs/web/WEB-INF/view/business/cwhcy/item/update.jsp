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
    <li><a href="/cwhcy/list/1">村会成员名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>村会成员名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/cwhcy/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;chinese;length[1~4]" value="${cwhcy.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>
					<input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>职务：</th>
					<td>
					<input name="role" type="text" data-rule="required;length[1~10]" value="${cwhcy.role}"/>
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;" onClick="WdatePicker()" class="Wdate" value="${cwhcy.birthday}"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="degree" type="text" data-rule="required;chinese;length[1~4]" value="${cwhcy.degree}"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="status" type="text" data-rule="required;chinese;length[1~4]" value="${cwhcy.status}"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="address" type="text" data-rule="required;length[1~20];" value="${cwhcy.address}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;" value="${cwhcy.phone}"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text"  value="${cwhcy.remark}"/>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${cwhcy.id}">
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
			$('input[name=sex][type=radio][value=${cwhcy.sex}]').attr('checked', true);
		});
</script>
</body>
</html>