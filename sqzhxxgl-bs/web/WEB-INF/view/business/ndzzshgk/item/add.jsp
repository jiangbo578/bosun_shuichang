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
    <li><a href="/ndzzshgk/list/1">年度组织生活情况表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 年度组织生活情况表</div>
  <div id="panbody">
	<div class="container">
		<form action="/ndzzshgk/item/add" method="post" class="well">
			<table>
			
				<tr>
					<th>组织生活类型：</th>
					<td>
						<select name="type">
							<option value="支部委员会会议" selected="selected">支部委员会会议</option>
							<option value="党员大会">党员大会</option>
							<option value="组织生活会">组织生活会</option>
							<option value="党员电化教育">党员电化教育</option>
							<option value="其他活动">其他活动</option>
						</select>
					</td>
				</tr>
				<tr>
					<th>主题：</th>
					<td><input name="topic" type="text"   data-rule="required;length[1~20];"></input>
					</td>
				</tr>
				<tr>
					<th>评议日期：</th>
					<td><input name="date" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>地点：</th>
					<td><input name="locale" type="text"   data-rule="required;length[1~20];"></input>
					</td>
				</tr>
				<tr>
					<th>会议或活动情况摘要记录：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="summaryRecord"  data-rule="required;length[1~500];" ></textarea>
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