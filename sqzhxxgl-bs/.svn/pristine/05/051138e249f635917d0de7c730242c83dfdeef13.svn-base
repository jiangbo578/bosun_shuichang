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
    <li><a href="/womanrepresent/list/1">妇女代表名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>妇女代表名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/womanrepresent/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;chinese;length[1~4]" id="xm" value="${womanrepresent.xm}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男
					 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>职务：</th>
					<td><input name="duty" type="checkbox" value="村民小组、楼组长"<c:if test="${womanrepresent.duty !=null }">  checked</c:if> />村民小组、楼组长
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny" value="${womanrepresent.csny}"/>
					</td>
				</tr>
				<tr>
					<th>任职时间：</th>
					<td><input name="rzsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${womanrepresent.rzsj}"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text" data-rule="required;length[1~20];"  value="${womanrepresent.whcd}"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" data-rule="required;length[1~20];"  value="${womanrepresent.zzmm}"/>
					</td>
				</tr>
				<tr>
					<th>民族：</th>
					<td><input name="mz" type="text" id="mz" data-rule="required;length[1~10];"  value="${womanrepresent.mz}"/>
					</td>
				</tr>
				<tr>
					<th>兼职情况：</th>
					<td><input name="jzqk" type="text" id="jzqk" data-rule="required;length[1~20];"  value="${womanrepresent.jzqk}"/>
					</td>
				</tr>
				<tr>
					<th>住址：</th>
					<td><input name="jtzz" type="text" id="mz" data-rule="required;length[1~20];"  value="${womanrepresent.jtzz}"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="phone" type="text"  data-rule="required;mobile;" value="${womanrepresent.phone}"></input>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<textarea style="width: 300px;height: 200px;"  name="tag">${womanrepresent.tag}</textarea>
					</td>
				</tr>
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${womanrepresent.id}">
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
			$('input[name=xb][type=radio][value=${womanrepresent.xb}]').attr('checked', true);
		});
</script>
</body>
</html>
