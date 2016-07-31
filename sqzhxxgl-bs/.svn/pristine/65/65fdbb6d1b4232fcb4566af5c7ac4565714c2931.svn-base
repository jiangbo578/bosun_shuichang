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
    <li><a href="/kzdyzyz/list/1">开展党员志愿者服务活动情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>开展党员志愿者服务活动情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/kzdyzyz/item/update" method="post">
			<table>
				<tr>
					<th>活动主题：</th>
					<td><input name="hdzt" type="text" data-rule="required;length[1~20];" value="${kzdyzyz.hdzt}"/>
					</td>
				</tr>
				
				<tr>
					<th>活动时间：</th>
					<td><input name="hdsj" type="text" data-rule="required;" onClick="WdatePicker()" class="Wdate" value="${kzdyzyz.hdsj}"/>
					</td>
				</tr>
				<tr>
					<th>参加人数：</th>
					<td><input name="cjrs" type="text" data-rule="required;number" value="${kzdyzyz.cjrs}"/>
					</td>
				</tr>
				
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" value="${kzdyzyz.remark}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${kzdyzyz.id}">
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