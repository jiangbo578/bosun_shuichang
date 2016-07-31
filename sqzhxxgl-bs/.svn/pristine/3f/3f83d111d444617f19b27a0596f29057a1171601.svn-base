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
    <li><a href="/dyzyzcjhd/list/1">党员志愿者参与活动情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 党员志愿者参与活动情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/dyzyzcjhd/item/update" method="post">

			<table>
					<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;chinese;length[1~4]" value="${dyzyzcjhd.name}"/>
					</td>
				</tr>
				
					<tr>
					<th>在职/在册</th>
					<td><input name="zc" type="text" data-rule="required;length[1~10]" value="${dyzyzcjhd.zc}"/>
					</td>
				</tr>
				<tr>
					<th>特长情况：</th>
					<td><input name="tcqk" type="text" data-rule="required;length[1~20]" value="${dyzyzcjhd.tcqk}"/>
					</td>
				</tr>
				<tr>
					<th>参加活动次数：</th>
					<td><input name="cjhdcs" type="text" data-rule="required;number" value="${dyzyzcjhd.cjhdcs}"/>
					</td>
				</tr>
				<tr>
					<th>星级档次：</th>
					<td><input name="xjdc" type="text" value="${dyzyzcjhd.xjdc}" data-rule="required;length[1~10]"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" value="${dyzyzcjhd.remark}" />
					</td>
				</tr>
				
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${dyzyzcjhd.id}">
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