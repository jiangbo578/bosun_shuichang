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
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
    <li><a href="/glzl/list/1">各类资料发放记录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 各类资料发放记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/glzl/add" method="post">
			<table>
		
				<tr>
					<th>单位：</th>
					<td><input name="dw" type="text" data-rule="required;chinese" />
					</td>
				</tr><!--
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				-->
				<tr>
					<th>服务内容：</th>
					<td><input name="nr" type="text" data-rule="required" />
					</td>
				</tr>
				<tr>
					<th>签收：</th>
					<td><input name="qs" type="text"  data-rule="required;"/>
					</td>
				</tr>
				
				<tr>
					<th>数量：</th>
					<td><input name="sl" type="text" data-rule="required;number"/>
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