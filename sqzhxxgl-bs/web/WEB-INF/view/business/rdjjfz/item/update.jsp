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
    <li><a href="/rdjjfz/list/1">入党积极分子</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>入党积极分子</div>
  <div id="panbody">
	<div class="container">
		<form action="/rdjjfz/item/update" method="post">
			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text"  id="name"  data-rule="required;chinese;length[1~4]" value="${rdjjfz.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>民族：</th>
					<td><input name="mz" type="text"  id="mz" data-rule="required;length[1~10];" value="${rdjjfz.mz}"/>
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="birthday" value="${rdjjfz.birthday}"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text" id="whcd" data-rule="required;length[1~20];" value="${rdjjfz.whcd}"/>
					</td>
				</tr>
				<tr>
					<th>申请入党时间:</th>
					<td><input name="sqrdsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="sqrdsj" value="${rdjjfz.sqrdsj}"/>
					</td>
				</tr>
				<tr>
					<th>列为积极分子时间:</th>
					<td><input name="jjfzsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="jjfzsj" value="${rdjjfz.jjfzsj }"/>
					</td>
				</tr>
				<tr>
					<th>居住地址 ：</th>
					<td><input name="address" type="text" id="address"  data-rule="required;length[1~20];" value="${rdjjfz.address}"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" id="remark" value="${rdjjfz.remark}"/>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${rdjjfz.id}">
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
		$('input[name=sex][type=radio][value=${rdjjfz.sex}]').attr('checked', true);
	});
	</script>
</body>
</html>