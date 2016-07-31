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
    <li><a href="/jmcmxzz/list/1">村民小组长名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>村民小组长名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/jmcmxzz/item/update" method="post">

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
					<th>小组名称：</th>
					<td><input name="xzmc" type="text"  id="xzmc" data-rule="required" value="${jmcmxzz.xzmc }" />
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"  id="xm" data-rule="required;chinese;length[1~4]" value="${jmcmxzz.xm }" />
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
					<tr>
					<th>年龄：</th>
					<td><input name="nl" type="text" id="nl" data-rule="required:digits;range[1~100]" value="${jmcmxzz.nl}"/>
					</td>
				</tr>
				<tr>
					<th>文化程度 ：</th>
					<td><input name="whcd" type="text" id="whcd"  data-rule="required;chinese;length[1~4]"  value = "${jmcmxzz.whcd }" />
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" id="zzmm"  value = "${jmcmxzz.zzmm }" data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text" id="jtzz"  value = "${jmcmxzz.jtzz }" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="dh" type="text" id="dh"  value = "${jmcmxzz.dh }"  data-rule="required;"/>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${jmcmxzz.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<script type="text/javascript" src="/scripts/business/jmcmxzz.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script>
$(function() {
			$('input[name=xb][type=radio][value=${jwcwjd.xb}]').attr('checked', true);
		});
</script>
</body>
</html>