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
    <li><a href="/sxsbsspro/list/1">双学双比活动情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 美好家园示范村</div>
  <div id="panbody">
	<div class="container">
		<form action="/sxsbmhsfc/item/update" method="post">
			<table>
			<tr>
					<th>名 称：</th>
					<td>
						<input name="name" type="text"  data-rule="required;length[1~20];"  value="${sxsbmhsfc.name }"></input>
					</td>
				</tr>
				
				<tr>
					<th>级别：</th>
					<td><input name="level" type="radio" value="市级" checked="checked"/>市级  
					 <input name="level" type="radio" value="区级" />区级
					</td>
				</tr>
				
				<tr>
					<th>获评时间：</th>
					<td><input name="crownedTime" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${sxsbmhsfc.crownedTime }"/>
					</td>
				</tr>
				<tr>
					<th>主要特色：</th>
					<td>
						<textarea style="width: 300px;height: 200px;"  data-rule="required;length[1~150];" name="mainFeature">${sxsbmhsfc.mainFeature}</textarea>
					</td>
				</tr>
					
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${sxsbmhsfc.id}">
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
		$('input[type=radio][value=${sxsbmhsfc.level}]').attr('checked', true);
	});
	</script>
</body>
</html>