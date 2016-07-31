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
    <li><a href="/tdmc/list/1">团队名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>团队名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/tdmc/item/update" method="post">

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
					<th>负责人或党建指导员：</th>
					<td><input name="fzr" type="text" data-rule="required;chinese;length[1~4]" id="fzr" value="${tdmc.fzr}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>
					<input name="xb" type="radio" value="男" checked="checked"/>男
					<input name="xb" type="radio" value="女" />女
					
					</td>
				</tr>
				<tr>
					<th>队伍名称：</th>
					<td><input name="dwmc" type="text" data-rule="required;chinese" id="dwmc"  value="${tdmc.dwmc}"/>
					</td>
				</tr>
						<tr>
					<th>人数：</th>
					<td><input name="rs" type="text" id="rs" data-rule="required;digits;" value="${tdmc.rs}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required:mobile;" value="${tdmc.phone}"/>
					</td>
				</tr>
				<tr>
					<th>成立时间：</th>
					<td><input name="clny" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="clny" value="${tdmc.clny}" data-rule="required:date;"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<select name="tag" id="tag">
						<option value="老年文体队伍名册">老年文体队伍名册、</option>
						</select>
					</td>
				</tr>
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${tdmc.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<script src="/scripts/business/tdmc.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script>
$(function() {
	$('input[name=xb][type=radio][value=${tdmc.xb}]').attr('checked', true);
});
</script>
</body>
</html>