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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/gxfw/list/1">管辖范围</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
		  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 管辖范围</div>
		  <div id="panbody">
		<div class="container">
		<form action="/gxfw/item/add" method="post">

			<table>
				<tr>
					<th>路(新村)：</th>
					<td><input name="lxc" type="text"  data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>弄：</th>
					<td><input name="nong" type="text" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>号：</th>
					<td><input name="hao" type="text" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
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