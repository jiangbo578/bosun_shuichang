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
    <li><a href="/pydzbgz/list/1">党员（群众）评议党支部工作情况表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 党员（群众）评议党支部工作情况表</div>
  <div id="panbody">
	<div class="container">
		<form action="/pydzbgz/item/add" method="post" class="well">
			<table>
				<tr>
					<th>评议日期：</th>
					<td><input name="date" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>评议地点：</th>
					<td><input name="locale" type="text"  data-rule="required;length[1~20];"></input>
					</td>
				</tr>
				
				<tr>
					<th>主持人：</th>
					<td><input name="host" type="text"  data-rule="required;length[1~20];"></input>
					</td>
				</tr>
				
				<tr>
					<th>参加人数：</th>
					<td><input name="sum" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				
				<tr>
					<th>满  意（人）：</th>
					<td><input name="goodCount" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				<tr>
					<th>基本满意（人）：</th>
					<td><input name="baseGoodCount" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				<tr>
					<th>一  般（人）：</th>
					<td><input name="commonCount" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				<tr>
					<th>差（人）：</th>
					<td><input name="badCount" type="text"   data-rule="required;number"></input>
					</td>
				</tr>
				<tr>
					<th>总体评价（满意度）（满意+基本满意/参加评议人数）：</th>
					<td><input name="summary" type="text"  data-rule="required"></input>
					</td>
				</tr>
				<tr>
					<th>评议结果分析：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="result"  data-rule="required;length[1~500];"></textarea>
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