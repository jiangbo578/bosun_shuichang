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
    <li><a href="/xqzydw/list/1">辖区主要单位</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>辖区主要单位</div>
  <div id="panbody">
	<div class="container">
		<form action="/xqzydw/item/update" method="post">

			<table>
				<tr>
					<th>单位名称：</th>
					<td><input name="dwmc" type="text"  id="dwmc" data-rule="required;length[1~20];" value="${xqzydw.dwmc }" />
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="dz" type="text"  id="dz" data-rule="required;length[1~20];" value="${xqzydw.dz }" />
					</td>
				</tr>
				<tr>
					<th>联系人：</th>
					<td><input name="lxr" type="text"  id="lxr" data-rule="required;chinese;length[1~4]" value="${xqzydw.lxr }" />
					</td>
				</tr>
				<tr>
					<th>联系电话 ：</th>
					<td><input name="dh" type="text" id="dh"  data-rule="required:mobile;"  value = "${xqzydw.dh}"></input>
					</td>
				</tr>
				<tr>
					<th>是否共建：</th>
					<td>
					
					
					      <input name="sfgj" type="radio" value="是" checked="checked"/>是
					    <input name="sfgj" type="radio" value="否" />否
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${xqzydw.id}">
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
		$('input[name=sfgj][type=radio][value=${xqzydw.sfgj}]').attr('checked', true);
			});
	</script>
</body>
</html>