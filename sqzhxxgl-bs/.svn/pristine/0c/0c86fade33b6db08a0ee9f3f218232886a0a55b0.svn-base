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
    <li><a href="/hszfwzhy/list/1">学习型社区硬件建设</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 投诉举报咨询台账目录</div>
  <div id="panbody">
	<div class="container">
		<form action="/hszfwzhy/item/update" method="post">

			<table>
			<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;" id="name" value="${hszfwzhy.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>
					<input name="sex" type="radio" value="男" checked="checked"/>男<input name="sex" type="radio" value="女" />女
					
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="birthday" value="${hszfwzhy.birthday}"  />
					</td>
				</tr>
			
					<tr>
					<th>地址：</th>
					<td><input name="address" type="text" id="address" data-rule="required;" value="${hszfwzhy.address}"/>
					</td>
				</tr>
					<tr>
					<th>工作单位：</th>
					<td><input name="gzdw" type="text" id="gzdw" data-rule="required;" value="${hszfwzhy.gzdw}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required;" value="${hszfwzhy.phone}"/>
					</td>
				</tr>
				<tr>
					<th>登记时间：</th>
					<td><input name="djsj" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="djsj" value="${hszfwzhy.djsj}"/>
					</td>
				</tr>
					
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" id="remark" data-rule="required" value="${hszfwzhy.remark}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${hszfwzhy.id}">
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
			$('input[name=sex][type=radio][value=${hszfwzhy.sex}]').attr('checked', true);
		});
	</script>
</body>
</html>