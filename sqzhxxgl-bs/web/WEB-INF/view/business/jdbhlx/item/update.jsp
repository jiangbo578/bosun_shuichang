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
    <li><a href="/jdbhlx/list/1">结对包户联系登记表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 结对包户联系登记表</div>
  <div id="panbody">
	<div class="container">
		<form action="/jdbhlx/item/update" method="post">
			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;chinese;length[1~4]" value="${jdbhlx.xm }"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>
						<input name="xb" type="radio" value="男" checked="checked"/>男 
						<input name="xb" type="radio" value="女" <c:if test="${jdbhlx.xb eq '女'}">checked="checked"</c:if> />女
					</td>
				</tr>
				<tr>
					<th>联系人（单位）：</th>
					<td><input name="contact" type="text" data-rule="required;length[1~20];" value="${jdbhlx.contact }"/>
					</td>
				</tr>
				<tr>
					<th>工作单位及职务（负责人）</th>
					<td><input name="duty" type="text" data-rule="required;length[1~30];" value="${jdbhlx.duty }"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;" value="${jdbhlx.phone }"/>
					</td>
				</tr>
				
				<tr>
					<th>结对包户工作内容：</th>
					<td><input name="content" type="text" data-rule="required;" value="${jdbhlx.content }"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${jdbhlx.id}">
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
		//$('select option[value=${jdbhlx.content}]').attr('selected', 'selected');
	});
	</script>
</body>
</html>