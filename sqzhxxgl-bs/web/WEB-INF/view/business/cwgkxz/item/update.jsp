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
    <li><a href="/cwgkxz/list/1">村务公开小组成员名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>村务公开小组成员名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/cwgkxz/item/update" method="post">

			<table>
				<tr>
					<th>职务：</th>
					<td><select id="zw" name="zw" >
								<option  value="组长">组长</option>
								<option  value="副组长">副组长</option>
								<option  value="成员">成员</option>
						</select>
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"  id="xm" data-rule="required;chinese;length[1~4]" value="${cwgkxz.xm }" />
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>年龄：</th>
					<td><input name="nl" type="text"   value = "${cwgkxz.nl }"  id="nl" data-rule="required:digits;range[1~150]"/>
					</td>
				</tr>
				<tr>
					<th>文化程度 ：</th>
					<td><input name="whcd" type="text" id="whcd"  data-rule="required"  value = "${cwgkxz.whcd }" data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" id="zzmm"  value = "${cwgkxz.zzmm }" data-rule="required;chinese;length[1~5]"/>
					</td>
				</tr>
				<tr>
					<th>现任职务：</th>
					<td><input name="xrzw" type="text" id="xrzw"  value = "${cwgkxz.xrzw }" data-rule="required;chinese;length[1~5]"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="lxdh" type="text" id="lxdh"  value = "${cwgkxz.lxdh }" data-rule="required;"/>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${cwgkxz.id}">
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
			$('input[name=xb][type=radio][value=${cwgkxz.xb}]').attr('checked', true);
			$("#zw option[value = '${cwgkxz.zw}']").attr("selected",true);
		});
</script>
</body>
</html>