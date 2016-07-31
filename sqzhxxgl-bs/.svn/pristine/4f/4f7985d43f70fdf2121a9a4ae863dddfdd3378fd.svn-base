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
    <li><a href="/zcdygk/list/1">在册党员名册表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 在册党员名册表</div>
  <div id="panbody">
	<div class="container">
		<form action="/zcdygk/item/update" method="post">

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
					<th>姓名：</th>
					<td><input name="xm" type="text"  data-rule="required;chinese;length[1~4]" id="xm" value="${zcdygk.xm }"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny" value="${zcdygk.csny }"/>
					</td>
				</tr>
				<tr>
					<th>身份证：</th>
					<td><input name="idcard" type="text" data-rule="required;ID_card" id="idcard" value="${zcdygk.idcard }"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text" id="whcd" value="${zcdygk.whcd }"  data-rule="required;length[1~20];" />
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text" id="jtzz" value="${zcdygk.jtzz }"  data-rule="required;length[1~20];" />
					</td>
				</tr>
				<tr>
					<th>联系方式：</th>
					<td><input name="phone" type="text" value="${zcdygk.phone }"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>入党年月：</th>
					<td><input name="rdny" type="text" data-rule="required;" 
					onClick="WdatePicker({dateFmt:'yyyy-MM'})" class="Wdate" value="${zcdygk.rdny }"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><textarea name="bz" style="width:300px;height:80px;" >${zcdygk.bz }</textarea>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zcdygk.id}">
					<input type="hidden" name="zcdygkbtid" value="${zcdygkbtid}" />
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
		$('input[name=sex][type=radio][value=${zcdygk.xb}]').attr('checked', true);
	});
	</script>
</body>
</html>