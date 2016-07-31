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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/sxsbsspro/list/1">双学双比活动情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 女能手名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/sxsbsfnvhand/item/add" method="post" class="well">
			<table>
				<tr>
					<th>姓名：</th>
					<td>
						<input name="name" type="text"  data-rule="required;chinese;length[1~4]"></input>
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				
				<tr>
					<th>文化程度：</th>
					<td>
						<input name="whcd" type="text"   data-rule="required;length[1~20];" ></input>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td>
						<input name="zzmm" type="text"   data-rule="required;length[1~20];" ></input>
					</td>
				</tr>
				<tr>
					<th>种植专长：</th>
					<td>
						<input name="growFeature" type="text"  data-rule="required;length[1~20];" ></input>
					</td>
				</tr>
				<tr>
					<th>联系方式：</th>
					<td>
						<input name="phone" type="text"  data-rule="required;"></input>
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