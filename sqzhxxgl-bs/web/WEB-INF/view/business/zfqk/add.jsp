<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<style type="text/css">
th{
text-align: right;
margin-left: 50px
}

</style>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>
<ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
<li><a href="/zfqk/list/1">走访记录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
      <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>添加</strong>走访记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<form action="/zfqk/add" method="post">

			<table >
			<tr>
    <th  >序号: </th>
    <td ><input name="xh" type="text" id="xh" data-rule="required"/></td>
    <th  >时间 :</th>
    <td  ><input name="sj" type="text" id="sj" data-rule="required" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" /></td>
  </tr>
  <tr >
    <th  >被访者类型: </th>
    <td   ><input name="bfzlx" type="text" id="bfzlx" data-rule="required"/></td>
    <th  >被访者住址: </th>
    <td  ><input name="bfzdz" type="text" id="bfzdz" data-rule="required"/></td>
  </tr>
  <tr>
    <th >被访者联系电话: </th>
    <td  ><input name="bfzdh" type="text" id="bfzdh" data-rule="required"/></td>
    <th  >走访者: </th>
    <td   ><input name="zfz" type="text" id="zfz" data-rule="required"/> </td>
  </tr>
  <tr>
     <th   >被访者姓名: </th>
    <td   ><input name="bfzxm" type="text" id="bfzxm" data-rule="required"/></td>
 
    <th  >反映的需求、问题和建议: </th>
    <td   ><input name="xq" type="text" id="xq" data-rule="required"/></td>

  </tr>
  <tr>
     <th  >家庭基本情况 :</th>
    <td  ><input name="jtjbqk" type="text" id="jtjbqk" data-rule="required"/></td>
 
    <th >采取的对策和措施 :</th>
    <td  ><input name="dc" type="text" id="dc" data-rule="required"/></td>
  </tr>
  <tr >
    <th  >处理结果: </th>
    <td   ><input name="cljg" type="text" id="cljg" data-rule="required"/> </td>
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