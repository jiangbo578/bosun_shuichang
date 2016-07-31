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
    <li><a href="/hszfwzwzjc/list/1">红十字服务站物资出借明细</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 红十字服务站物资登记册</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/hszfwzwzjc/item/add" method="post">
   
			<table>
		
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr>
				<tr>
					<th>物资名称：</th>
					<td><input name="wzmc" type="text"  data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>出借日期：</th>
					<td><input name="cjrq" type="text"  onClick="WdatePicker()" class="Wdate"  data-rule="required:date;"/>
					</td>
				</tr>
				<tr>
					<th>签名：</th>
					<td><input name="qm" type="text"   data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text"  data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>归还日期：</th>
					<td><input name="ghrq" type="text"  onClick="WdatePicker()" class="Wdate" data-rule="required:date;"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text" ></input>
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