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
    <li><a href="/womanbsctj/list/1">为退休和生活困难妇女安排妇科病、乳腺病筛查工作统计表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 为退休和生活困难妇女安排妇科病、乳腺病筛查工作统计表</div>
  <div id="panbody">
	<div class="container">
		<form action="/womanbsctj/item/add" method="post" class="well">
			<table>
				<tr>
					<th>检查日 期：</th>
					<td><input name="jcrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>应检人数（退休+困难+其他）：</th>
					<td>
						<input name="allCount" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				
				<tr>
					<th>实检人数：</th>
					<td><input name="realCount" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				
				<tr>
					<th>总体情况：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="summary" data-rule="required;length[1~150];"></textarea>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="tag" ></textarea>
						<font color="gray">（附：检查人员名单）</font>
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