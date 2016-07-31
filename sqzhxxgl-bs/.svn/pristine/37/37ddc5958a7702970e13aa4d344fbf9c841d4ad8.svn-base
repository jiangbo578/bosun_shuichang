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
    <li><a href="/fwnd/list/1">公益性社区服务劳动参加对象汇总表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 公益性社区服务劳动参加对象汇总表</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/fwnd/item/add" method="post">

			<table>
				<!-- <tr>
					<th>搜索，请输入姓名或身份证号码：</th>
					<td><input type="text" id="b_search"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr> 
				-->
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;chinese" />
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="address" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text"  data-rule="required;"></input>
					</td>
				</tr>
				
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text"/>
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
