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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/wzwzjyh/list/1">无证无照经营户</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 无证无照经营户</div>
  <div id="panbody">
	<div class="container">
		<form action="/wzwzjyh/item/update" method="post">

			<table>
			<tr>
					<th>业主：</th>
					<td><input name="yz" type="text" data-rule="required;chinese;length[1~4]" value="${wzwzjyh.yz}" />
					</td>
				</tr>
				<tr>
					<th>户籍：</th>
					<td><input name="hj" type="text" data-rule="required;" value="${wzwzjyh.hj}" /></td>
				</tr>
				
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;mobile;" value="${wzwzjyh.phone}" />
					</td>
				</tr>
				<tr>
					<th>经营地址：</th>
					<td><input name="jydz" type="text" data-rule="required;" value="${wzwzjyh.jydz}" />
					</td>
				</tr>
				<tr>
					<th>经营内容：</th>
					<td><input type="text" name="jynr"  data-rule="required;" value="${wzwzjyh.jynr}" />
					</td>
				</tr>
				<tr>
					<th>所属行业：</th>
					<td><input type="text" name="sshyp"  data-rule="required;" value="${wzwzjyh.sshyp}" />
					</td>
				</tr>
				<tr>
					<th>房屋性质（是否违章）：</th>
					<td><input name="fwxz" type="radio" value="是" checked="checked"/>是
					    <input name="fwxz" type="radio" value="否" />否
					</td>
				</tr>
				<tr>
					<th>产权所有：</th>
					<td><input name="cqsy" type="text" data-rule="required;"  value="${wzwzjyh.cqsy}"/>
					</td>
				</tr>
				
				
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text"   value="${wzwzjyh.remark}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${wzwzjyh.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script type="text/javascript">
	
	$(function() {
		$('input[name=fwxz][type=radio][value=${wzwzjyh.fwxz}]').attr('checked', true);
			});
	</script>
</body>
</html>