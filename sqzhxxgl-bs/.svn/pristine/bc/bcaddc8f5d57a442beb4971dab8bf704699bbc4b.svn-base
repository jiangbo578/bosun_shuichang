<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<title>添加</title>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/tsjbzx/list/1">家庭志愿者队伍名册</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 家庭志愿者队伍名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/volunteerteam/item/add" method="post">
			<table>
				<tr>
					<th>家庭志愿者队伍名称：</th>
					<td><input name="xm" type="text" data-rule="required;length[1~20];"  id="xm"/>
					</td>
				</tr>
				<tr>
					<th>总人数：</th>
					<td><input name="count" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<tr>
					<th>中共党员数：</th>
					<td><input name="partyCount" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<tr>
					<th>负责人姓名：</th>
					<td><input name="principal" type="text"  data-rule="required;chinese;length[1~4]" />
					</td>
				</tr>
				<tr>
					<th>负责人联系电话：</th>
					<td><input name="principalPhone" type="text" data-rule="required;mobile;" />
					</td>
				</tr>
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>