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
    <li><a href="/dfszsyqk/list/1">党费收支、使用情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 党费收支、使用情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/dfszsyqk/item/update" method="post">

			<table>
				<tr>
					<th>缴纳党费：</th>
					<td><input name="jndf" type="text" data-rule="required:float;"  id="jndf" value="${dfszsyqk.jndf}"/>
					</td>
				</tr>
				<tr>
					<th>党费返还 收入：</th>
					<td><input name="srdffh" type="text" data-rule="required:float;" id="srdffh" value="${dfszsyqk.srdffh}"/>
					</td>
				</tr>
				<tr>
					<th>捐助 收入：</th>
					<td><input name="srjz" type="text"  id="srjz" data-rule="required:float;" value="${dfszsyqk.srjz}"/>
					</td>
				</tr>
				<tr>
					<th>上级下拔 收入：</th>
					<td><input name="srsjxb" type="text" id="srsjxb" data-rule="required:float;" value="${dfszsyqk.srsjxb}"/>
					</td>
				</tr>
				<tr>
					<th>党费返还：</th>
					<td><input name="zcdffh" type="text" id="zcdffh" data-rule="required:float;" value="${dfszsyqk.zcdffh}"/>
					</td>
				</tr>
				<tr>
					<th>捐助 ：</th>
					<td><input name="srjz" type="text" id="srjz" value="${dfszsyqk.srjz}" data-rule="required:float;"></input>
					</td>
				</tr>
				<tr>
					<th>上级下拔：</th>
					<td><input name="zcsjxb" type="text" id="zcsjxb" value="${dfszsyqk.zcsjxb}" data-rule="required:float;"></input>
					</td>
				</tr>
				<tr>
					<th>可用党费累计数：</th>
					<td><input name="kydflj" type="text" id="kydflj" value="${dfszsyqk.kydflj}" data-rule="required:float;"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${dfszsyqk.id}">
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
	});
	</script>
</body>
</html>