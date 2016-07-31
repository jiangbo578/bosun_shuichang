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
    <li><a href="/bzcy/list/1">团支部概况及班子成员名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>团支部概况及班子成员名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/bzcybt/item/update" method="post">

			<table>
							<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"  id="xm" data-rule="required" value="${bzcy.xm }"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date"  value="${bzcy.csny }"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" id="zzmm" value="${bzcy.zzmm }"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>团内职务：</th>
					<td><input name="tnzw" type="text" id="tnzw" value="${bzcy.tnzw }"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text" id="jtzz" value="${bzcy.jtzz }"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>单位：</th>
					<td><input name="gzdw" type="text" id="gzdw" value="${bzcy.gzdw }"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>民族：</th>
					<td><input name="mz" type="text" id="mz" value="${bzcy.mz }" />
					</td>
				</tr>	
				
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				<input type="hidden" name="bzcybtId" value="${bzcybtId}" />
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${bzcy.id}">
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
			$('input[name=xb][type=radio][value=${jwcwjd.xb}]').attr('checked', true);
		});
</script>
</body>
</html>