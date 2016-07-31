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
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 女性专业合作社</div>
  <div id="panbody">
	<div class="container">
		<form action="/sxsbsfwomanhzs/item/update" method="post">
			<table>
				<tr>
					<th>名 称：</th>
					<td>
						<input name="name" type="text" data-rule="required;length[1~20];" value="${sxsbsfwomanhzs.name }"></input>
					</td>
				</tr>
				<tr>
					<th>负责人：</th>
					<td>
						<input name="host" type="text" data-rule="required;chinese;length[1~4]" value="${sxsbsfwomanhzs.host }"></input>
					</td>
				</tr>
				
				<tr>
					<th> 总人数：</th>
					<td>
						<input name="allCount" type="text"  data-rule="required;number;" value="${sxsbsfwomanhzs.allCount }"></input>
					</td>
				</tr>
				<tr>
					<th> 女性人数：</th>
					<td>
						<input name="womanCount" type="text"  data-rule="required;number;" value="${sxsbsfwomanhzs.womanCount }"></input>
					</td>
				</tr>
				<tr>
					<th>品牌：</th>
					<td>
						<input name="brand" data-rule="required;length[1~20];" type="text" value="${sxsbsfwomanhzs.brand }"></input>
					</td>
				</tr>
				<tr>
					<th>人均年收入：</th>
					<td>
						<input name="incomeOfPersonOfYear" data-rule="required;float;"  type="text" value="${sxsbsfwomanhzs.incomeOfPersonOfYear}"></input>
					</td>
				</tr>
				<tr>
					<th>科技结对人员：</th>
					<td>
						<input name="jdPerson" data-rule="required;length[1~20];" type="text" value="${sxsbsfwomanhzs.jdPerson }"></input>
					</td>
				</tr>
				<tr>
					<th>主要特色：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" data-rule="required;length[1~150];" name="mainFeature">${sxsbsfwomanhzs.mainFeature }</textarea>
					</td>
				</tr>
					
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${sxsbsfwomanhzs.id}">
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
	});
	</script>
</body>
</html>