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
    <li><a href="/jkjyry/list/1">卫生干部、健康教育专兼职人员</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>卫生干部、健康教育专兼职人员</div>
  <div id="panbody">
	<div class="container">
		<form action="/jkjyry/item/update" method="post">

			<table>
			<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;chinese;length[1~4]" id="name" value="${jkjyry.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>
					<input name="sex" type="radio" value="男" checked="checked"/>男
					<input name="sex" type="radio" value="女" />女
					
					</td>
				</tr>
				
				<tr>
					<th>年龄：</th>
					<td><input name="age" type="text"  id="age" data-rule="required:digits;range[1~150]" value="${jkjyry.age}"/>
					</td>
				</tr>
			
					<tr>
					<th>学历：</th>
					<td>
							<select name="xl" id="xl">
							<option value="小学">小学</option>
							<option value="初中">初中</option>
							<option value="高中">高中</option>
							<option value="大学">大学</option>
							</select>
					</td>
				</tr>
					<tr>
					<th>所属村民小组或单位：</th>
					<td><input name="dw" type="text" id="dw" data-rule="required" value="${jkjyry.dw}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${jkjyry.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
 <script src="/scripts/business/jkjyry.js"></script> 
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			$('input[name=sex][type=radio][value=${jkjyry.sex}]').attr('checked', true);
		});
	$("#xl option[value='${jkjyry.xl}']").attr("selected", true);
	
		     
		
	</script>
	
</body>
</html>