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
    <li><a href="/sqyjjs/list/1">学习型社区硬件建设</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 投诉举报咨询台账目录</div>
  <div id="panbody">
	<div class="container">
		<form action="/sqyjjs/item/update" method="post">

			<table>
				<tr>
					<th>各类宣传工具：</th>
					<td><input name="glxcgj" type="text" data-rule="required;"  value="${sqyjjs.glxcgj}"/>
					</td>
				</tr>
			<tr>
					<th>科教文体活动阵地：</th>
					<td><input name="kjwthdzd" type="text"  data-rule="required;" value="${sqyjjs.kjwthdzd}"/>
					</td>
				</tr>
					<tr>
					<th>社区学校办学点：</th>
					<td><input name="xqxxbxd" type="text" data-rule="required;" value="${sqyjjs.xqxxbxd}"/>
					</td>
				</tr>
				<tr>
					<th>环境建设：</th>
					<td><input name="hjjs" type="text" data-rule="required;" value="${sqyjjs.hjjs}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${sqyjjs.id}">
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
			$('input[name=xb][type=radio][value=${tdmc.xb}]').attr('checked', true);
		});
	</script>
</body>
</html>