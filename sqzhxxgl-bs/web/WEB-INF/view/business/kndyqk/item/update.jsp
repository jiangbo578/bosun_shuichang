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
    <li><a href="/kndyqk/list/1">困难党员情况名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 困难党员情况名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/kndyqk/item/update" method="post">

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
					<td><input name="xm" type="text" data-rule="required;chinese;length[1~4]" id="xm" value="${kndyqk.xm }"/>
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
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny" value="${kndyqk.csny }"/>
					</td>
				</tr>
				<tr>
					<th>健康状况：</th>
					<td><input name="jkzk" type="text" data-rule="required;length[1~20]" id="jkzk" value="${kndyqk.jkzk}"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text" data-rule="required;length[1~20]" id="whcd" value="${kndyqk.whcd }"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text" data-rule="required;length[1~20]" id="jtzz" value="${kndyqk.jtzz }"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required;" value="${kndyqk.phone }"/>
					</td>
				</tr>
				
				<tr>
					<th>结对党员姓名：</th>
					<td><input name="jddyxm" type="text" data-rule="required;chinese;length[1~4]" id="jddyxm" value="${kndyqk.jddyxm }"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="jdphone" type="text" data-rule="required;" id="jdphone" value="${kndyqk.jdphone }"/>
					</td>
				</tr>
				
				<tr>
					<th>困难情况：</th>
					<td><textarea name="knqk" data-rule="required:length[1~500]" style="width:200px;height:50px;" id="knqk">${kndyqk.knqk }</textarea>
					</td>
				</tr>
				
				<tr>
					<th>结对时间：</th>
					<td><input name="jdsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="jdsj" value="${kndyqk.jdsj }"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${kndyqk.id}">
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
		$('input[type=radio][value=${kndyqk.xb}]').attr("checked",true);
	});
	</script>
</body>
</html>