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
    <li><a href="/dyzzgxzc/list/1">党员组织关系转出</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 党员组织关系转出</div>
  <div id="panbody">
	<div class="container">
		<form action="/dyzzgxzc/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text"  id="name" data-rule="required;chinese;length[1~4]" value="${dyzzgxzc.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>转出日期：</th>
					<td><input name="zcrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="zcrq" value="${dyzzgxzc.zcrq}"/>
					</td>
				</tr>
				<tr>
					<th>转往何单位：</th>
					<td><input name="dwzc" type="text" id="dwzc" data-rule="required;length[1~20];" value="${dyzzgxzc.dwzc}"/>
					</td>
				</tr>
				<tr>
					<th>是否正式党员：</th>
					<td><input name="sfzsdy" type="radio" value="是" checked="checked"/>是 <input name="sfzsdy" type="radio" value="不是" />不是
					</td>
				</tr>
				<tr>
					<th>联系电话 ：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required;"  data-rule="required" value="${dyzzgxzc.phone}" />
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" id="remark" value="${dyzzgxzc.remark}"  />
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${dyzzgxzc.id}">
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
			$('input[name=sex][type=radio][value=${dyzzgxzc.sex}]').attr('checked', true);
			$('input[name=sfzsdy][type=radio][value=${dyzzgxzc.sfzsdy}]').attr('checked', true);
		});
	</script>
</body>
</html>