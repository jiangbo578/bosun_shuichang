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
    <li><a href="/wzsc/list/1">无照市场</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 无照市场</div>
  <div id="panbody">
	<div class="container">
		<form action="/wzsc/item/update" method="post">

			<table>
			<tr>
					<th>市场名称：</th>
					<td><input name="scmc" type="text" data-rule="required;chinese" value="${wzsc.scmc}" />
					</td>
				</tr>
				<tr>
					<th>主办方：</th>
					<td><input name="zbf" type="text" data-rule="required;" value="${wzsc.zbf}" /></td>
				</tr>
				<tr>
					<th>负责人：</th>
					<td><input name="fzr" type="text" data-rule="required;chinese;length[1~4]" value="${wzsc.fzr}"  /></td>
				</tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;mobile;" value="${wzsc.phone}" />
					</td>
				</tr>
				<tr>
					<th>经营地址：</th>
					<td><input name="jydz" type="text" data-rule="required;" value="${wzsc.jydz}" />
					</td>
				</tr>
				<tr>
					<th>经营内容：</th>
					<td><input type="text" name="jynr"  data-rule="required;" value="${wzsc.jynr}" />
					</td>
				</tr>
				<tr>
					<th>场内经营户数：</th>
					<td><input type="text" name="jyhs"  data-rule="required;number;" value="${wzsc.jyhs}" />
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
					<td><input name="cqsy" type="text" data-rule="required;"  value="${wzsc.cqsy}"/>
					</td>
				</tr>
				
				
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text"   value="${wzsc.remark}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${wzsc.id}">
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
		$('input[name=fwxz][type=radio][value=${wzsc.fwxz}]').attr('checked', true);
			});
	</script>
</body>
</html>