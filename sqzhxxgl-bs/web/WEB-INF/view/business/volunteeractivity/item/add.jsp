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
    <li><a href="/tsjbzx/list/1">志愿者活动情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 志愿者活动情况</div>
  <div id="panbody">
	<div class="container">
	
		<form action="/volunteeractivity/item/add" method="post">

			<table>
			
				<tr>
					<th>日 期：</th>
					<td><input name="date" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>活 动 内 容：</th>
					<td>
					<select name="content">
						<option value="素质培训" selected="selected">素质培训</option>
						<option value="业务培训">业务培训</option>
						<option value="女性社团培训">女性社团培训</option>
						<option value="农村女能手培训">农村女能手培训</option>
						<option value="女农民培训">女农民培训</option>
						<option value="其它">其它</option>
					</select>
					</td>
				</tr>
				<tr>
					<th>参加人数：</th>
					<td><input name="count" type="text"  data-rule="required;number"></input>
					</td>
				</tr>
				<tr>
					<th>活动效果：</th>
					<td><input name="result" type="text" id="mz" data-rule="required;length[1~30];"/>
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