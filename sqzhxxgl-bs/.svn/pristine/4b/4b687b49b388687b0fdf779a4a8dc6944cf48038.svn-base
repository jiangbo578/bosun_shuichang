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
    <li><a href="/abroadstudent/list/1">小区留学生名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>小区留学生名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/abroadstudent/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;chinese;length[1~4]" id="xm" value="${abroadstudent.xm}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男
					 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny" value="${abroadstudent.csny}"/>
					</td>
				</tr>
				
				<tr>
					<th>民族：</th>
					<td><input name="mz" type="text" id="mz" data-rule="required;length[1~10];" value="${abroadstudent.mz}"/>
					</td>
				</tr>
				<tr>
					<th>住址：</th>
					<td><input name="jtzz" type="text" id="mz" data-rule="required;length[1~20];" value="${abroadstudent.jtzz}"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="phone" type="text"  data-rule="required;" value="${abroadstudent.phone}"></input>
					</td>
				</tr>
				<tr>
					<th>亲属姓名：</th>
					<td><input name="relationName" type="text"  data-rule="required;chinese;length[1~4]" value="${abroadstudent.relationName}"></input>
					</td>
				</tr>
				<tr>
					<th>侨眷关系：</th>
					<td><input name="relation" type="text" data-rule="required;length[1~20];" value="${abroadstudent.relation}"></input>
					</td>
				</tr>
				<tr>
					<th>华侨居住国：</th>
					<td><input name="liveCountry" type="text"   data-rule="required;length[1~20];" value="${abroadstudent.liveCountry}"></input>
					</td>
				</tr>
				
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${abroadstudent.id}">
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
			$('input[name=xb][type=radio][value=${abroadstudent.xb}]').attr('checked', true);
		});
</script>
</body>
</html>
