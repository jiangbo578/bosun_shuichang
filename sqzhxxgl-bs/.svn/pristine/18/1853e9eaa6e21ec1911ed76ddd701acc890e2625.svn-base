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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/fwssyxm/list/1">为老服务设施与项目</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>为老服务设施与项目</div>
  <div id="panbody">
	<div class="container">
		<form action="/fwssyxm/item/update" method="post">

			<table>
				<tr>
					<th>设施名称：</th>
					<td><input name="ssmc" type="text" data-rule="required;chinese" value="${fwssyxm.ssmc}"/>
					</td>
				</tr>
				<tr>
					<th>规格：</th>
					<td><input name="gg" type="text" data-rule="required;" value="${fwssyxm.gg}"/>
					</td>
				</tr>
				<tr>
					<th>项目名称：</th>
					<td><input name="xmmc" type="text" data-rule="required;"value="${fwssyxm.xmmc}" />
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td><input name="nr" type="text" data-rule="required;"  value="${fwssyxm.nr}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${fwssyxm.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>