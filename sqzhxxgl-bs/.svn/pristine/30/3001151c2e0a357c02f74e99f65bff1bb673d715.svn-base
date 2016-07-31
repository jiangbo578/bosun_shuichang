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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/hszfwzhy/list/1">红十字服务站物资登记册</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 红十字服务站物资登记册</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/hszfwzwz/item/add" method="post">
   
			<table>
		
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr>
				<tr>
					<th>物资名称：</th>
					<td><input name="wzname" type="text" data-rule="required;" id="wzname"/>
					</td>
				</tr>
				
				<tr>
					<th>接收时间：</th>
					<td><input name="jsdate" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="jsdate" />
					</td>
				</tr>
			
					<tr>
					<th>接收人：</th>
					<td><input name="jsname" type="text" id="jsname" data-rule="required;"/>
					</td>
				</tr>
					<tr>
					<th>摆放位置：</th>
					<td><input name="bfwz" type="text" id="bfwz" data-rule="required" />
					</td>
				</tr>
				
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" id="remark" />
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