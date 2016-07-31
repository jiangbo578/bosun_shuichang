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
    <li><a href="/ggwgz/list/1">老干部工作和关工委工作情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 离退休干部担任村（居）骨干情况表</div>
  <div id="panbody">
	<div class="container">
		<form action="/lxgbjbdrggqk/item/add" method="post" class="well">
			<table>
			
				
				<tr>
					<th>原单位：</th>
					<td><input name="oldWorkName" type="text"  data-rule="required;length[1~30];"></input>
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"  data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>特长情况：</th>
					<td><textarea style="width: 300px;height: 200px;" name="tc" data-rule="required;length[1~150];"></textarea>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="tag"></textarea>
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