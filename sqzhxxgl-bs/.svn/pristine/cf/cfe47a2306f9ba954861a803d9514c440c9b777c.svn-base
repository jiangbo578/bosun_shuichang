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
    <li><a href="/sqjmjkzwglxz/list/1">社区居民健康自我管理小组统计表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong>社区居民健康自我管理小组统计表</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/sqjmjkzwglxz/item/add" method="post">
   
			<table>
		<th>当年新增小组</th>
				 <tr>
					<th>个数(人)：</th>
					<td><input name="xzgs" type="text" data-rule="required;number"  /> 
					</td>
				</tr>
				<tr>
					<th>组员(人)：</th>
					<td><input name="xzzy" type="text" data-rule="required;number" />
					</td>
				</tr>
				<tr>
					<th>活动次数(次)：</th>
					<td><input name="xzhdcs" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<tr>
					<th>参加人次(人次)：</th>
					<td><input name="xzcjrc" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<th>当年仍在活动的小组</th>
				 <tr>
					<th>个数(人)：</th>
					<td><input name="hdgs" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<tr>
					<th>组员(人)：</th>
					<td><input name="hdzy" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<tr>
					<th>活动次数(次)：</th>
					<td><input name="hdhdcs" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<tr>
					<th>参加人次(人次)：</th>
					<td><input name="hdcjrc" type="text" data-rule="required;number"  />
					</td>
				</tr>
				<th>当年文体团队结队</th>
				 <tr>
					<th>结队文体小组数(个）：</th>
					<td><input name="jdgs" type="text" data-rule="required;number"  />
					</td>
				</tr>
				
				<tr>
					<th>结队文体小组人数（人）：</th>
					<td><input name="jdrs" type="text" data-rule="required;number" />
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
<script src="/scripts/business/sqjmjkzwglxz.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>