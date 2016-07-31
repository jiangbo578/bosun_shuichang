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
<li><a href="/xcjl/list/1">宣传记录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
      <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>添加</strong>宣传记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<form action="/xcjl/add" method="post">

			<table>
		
				<tr>
					<th>时间：</th>
					<td><input name="sj" type="text" data-rule="required;" onClick="WdatePicker()" class="Wdate"/>
					</td>
					<th>地点：</th>
					<td><input name="address" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>宣传人员：</th>
					<td><input name="xcry" type="text" data-rule="required;"/>
					</td>
					<th>宣传形式：</th>
					<td><input name="xcxs" type="text" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>宣传主题：</th>
					<td><input name="xczt" type="text" data-rule="required;" style="width: 300px"/>
					</td>
					
				</tr>
				<tr>
					<th>内容：</th>
					<td colspan="3">
						<textarea name="nr" id="b_create_kindeditor" style="width:700px;height:350px;"></textarea>
					</td>
				</tr>
				<tr>
					<th>记录人：</th>
					<td><input name="jlr" type="text"  id="jlr" data-rule="required"/>
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
	<br>
</div>
</div>
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