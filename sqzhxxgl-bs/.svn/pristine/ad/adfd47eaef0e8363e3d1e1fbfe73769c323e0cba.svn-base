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
    <li><a href="/jkqk/list/1">捐款（捐物）情况记录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 捐款（捐物）情况记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/jkqk/add" method="post">
			<table>
		<tr>
					<th>日期：</th>
					<td><input name="rq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>捐赠单位(或个人)：</th>
					<td><input name="dw" type="text" data-rule="required" />
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="dz" type="text"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="phone" type="text"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>金额：</th>
					<td><input name="price" type="text"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>物品名称：</th>
					<td><input name="wpmc" type="text"  data-rule="required;"/>
					</td>
				</tr>
				
				<tr>
					<th>物品(件)：</th>
					<td><input name="wp" type="text" data-rule="required;number"/>
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