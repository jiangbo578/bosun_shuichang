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
    <li><a href="/fcbkjd/list/1">党员干部扶残帮困结对记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 党员干部扶残帮困结对记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/fcbkjd/item/head/update" method="post">

			<table>
			<tr>
					<th>时间：</th>
					<td><input name="sj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="zrrq" value="${fcbkjd.sj}"/>
					</td>
				</tr>
				<tr>
					<th>地点：</th>
					<td><input name="address" type="text"  id="name" data-rule="required" value="${fcbkjd.address}"/>
					</td>
				</tr>
				
				
				<tr>
					<th>召集人：</th>
					<td><input name="zjr" type="text" id="dwtr" data-rule="required" value="${fcbkjd.zjr}"/>
					</td>
				</tr>
			
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${fcbkjd.id}">
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