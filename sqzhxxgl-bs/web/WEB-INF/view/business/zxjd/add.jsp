<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>
<ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
      <li><a href="/zxjd/list/1">咨询接待记录</a> <span class="divider">/</span></li>
	 <li class="active">添加</li>
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>添加</strong>咨询接待记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<form action="/zxjd/add" method="post">

			<table >
			
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;chinese" id="name"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>日期：</th>
					<td><input name="rq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="rq"/>
					</td>
				</tr>
				<tr>
					<th>年龄：</th>
					<td><input name="age" type="text" data-rule="required;number" id="age"/>
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="address" type="text" id="address" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>类别：</th>
					<td><input name="type" type="text" id="type" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td><input name="nr" type="text" id="nr" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>内容情况：</th>
					<td><textarea name="nrqk" style="width:200px;height:50px;" data-rule="required;"></textarea>
					</td>
				</tr>
				<tr>
					<th>接待人：</th>
					<td><input name="jdr" type="text" id="jdr" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>处理结果：</th>
					<td><textarea name="cljg" style="width:200px;height:50px;" data-rule="required;"></textarea>
					</td>
				</tr>

				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					
					</td>
				</tr>
			</table>
		</form>
	</div>

</div>
</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	
<!--kindeditor插件-->
	<link rel="stylesheet" href="/zui/kindeditor/themes/default/default.css" />
	<script charset="utf-8" src="/zui/kindeditor/kindeditor-min.js"></script>
	<script charset="utf-8" src="/zui/kindeditor/lang/zh_CN.js"></script>
	<script>
	$(function(){
		KindEditor.create('textarea[id="b_create_kindeditor"]');
		
		
		var message = '${message}';
		if(message != ''){
			alert(message);
		}
	});
	</script>
</body>
</html>