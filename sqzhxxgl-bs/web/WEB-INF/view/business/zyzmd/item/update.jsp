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
    <li><a href="/zyzmd/list/1">志愿者名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>志愿者名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/zyzmd/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"  id="xm" data-rule="required;" value="${zyzmd.xm }" />
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>文化程度 ：</th>
					<td><input name="whcd" type="text" id="whcd"  data-rule="required;chinese;length[1~4]"  value = "${zyzmd.whcd }"></input>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" id="zzmm"  value = "${zyzmd.zzmm }" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text" id="jtzz"  value = "${zyzmd.jtzz }" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="dh" type="text" id="dh"  value = "${zyzmd.dh}" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>类型：</th>
					<td>
					<select name="lx"  id="lx">
					   <option value="居、村委消防志愿者">居、村委消防志愿者</option>
					   <option value="社区民防志愿者">社区民防志愿者</option>
					   <option value="科普志愿者">科普志愿者</option>
					   <option value="红十字服务站志愿者">红十字服务站志愿者</option>
					   <option value="爱国卫生志愿者">爱国卫生志愿者</option>
					   <option value="控烟志愿者">控烟志愿者</option>
					   <option value="老年志愿者服务">老年志愿者服务</option>
					   <option value="家庭志愿者">家庭志愿者</option>
					   <option value="妇女志愿者">妇女志愿者</option>
					   <option value="党员志愿者">党员志愿者</option>
					</select>
					</td>
				</tr>	
				<tr>
					<th>服务项目：</th>
					<td><input name="fwxm" type="text" id="dh"  value = "${zyzmd.fwxm }"></input>
					</td>
				</tr>
				
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zyzmd.id}">
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
	$("#lx option[value='${zyzmd.lx}']").attr("selected", true);
	$('input[name=xb][type=radio][value=${zyzmd.xb}]').attr('checked', true);
});
</script>
</body>
</html>