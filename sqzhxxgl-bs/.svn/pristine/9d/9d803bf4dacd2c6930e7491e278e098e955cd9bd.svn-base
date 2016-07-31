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
    <li><a href="/dzbwy/list/1">党支部委员及党小组长名册</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 党支部委员及党小组长名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/dzbwy/item/add" method="post">
			<table>
				<tr id="t1">
					<th>姓名：</th>
					<td><input name="name" type="text"  data-rule="required;chinese;length[1~4]" />
				
				
				</tr>
		   <tr>
		     <th>职务：</th>
					<td><input name="role" type="text" data-rule="required;length[1~20]" />
					</td>
		   </tr>
		   <th>任职时间：</th>
					<td><input name="zrsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="zrsj" />
					</td>
		   <tr>
		   </tr>
		   
		     <tr>
		     <th>分工内容：</th>
					<td><input name="fgnr" type="text" data-rule="required;length[1~20]" id="fgnr"  />
					</td>
		   </tr>
		     <tr>
		     <th>备注：</th>
					<td>
					<input name="remark" type="text"  id="remark"  />
					
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