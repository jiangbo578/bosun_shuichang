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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/jwhtsgz/list/1">居委会特色工作</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 居委会特色工作</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/jwhtsgz/item/add" method="post">

			<table>
				<!-- <tr>
					<th>搜索，请输入姓名或身份证号码：</th>
					<td><input type="text" id="b_search"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr> 
				-->
			 <tr>
					<th>单位名称：</th>
					<td><input name="dwname" type="text" data-rule="required;length[1~20];" id="dwname" style="width: 300px"/>
					</td>
				</tr>
				<tr>
					<th>特色工作名称：</th>
					<td><input name="tsname" type="text" data-rule="required;length[1~10];" style="width: 300px"/>
					</td>
				</tr>
				<tr>
					<th>记录人：</th>
					<td><input name="jlr" type="text" data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td>
						<textarea name="nr" id="b_create_kindeditor" style="width:700px;height:350px;"></textarea>
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
