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
    <li><a href="/ggwgz/list/1">关工委工作</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 关工委工作</div>
  <div id="panbody">
	<div class="container">
		<form action="/ggwgz/item/add" method="post" class="well">
			<table>
						<tr>
					<th>活动内容：</th>
					<td><input name="content" type="text" data-rule="required;length[1~30];" ></input>
					</td>
				</tr>
				<tr>
					<th>活动时间：</th>
					<td><input name="date" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>参加老干部人数：</th>
					<td><input name="oldCount" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				<tr>
					<th>参加青少年人数：</th>
					<td>
						<input name="newCount" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<textarea name="tag" style="width: 300px;height: 200px;"  ></textarea>
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