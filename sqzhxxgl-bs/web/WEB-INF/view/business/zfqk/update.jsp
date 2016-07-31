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
<li><a href="/zfqk/list/1">走访记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
      <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>修改</strong>走访记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<form action="/zfqk/update" method="post">

			<table>
					<tr >
    <td width="187" valign="center" ><p >序号 </p></td>
    <td width="106" valign="center" ><p ><input name="xh" type="text" id="xh" data-rule="required" value="${zfqk.xh}"/></p></td>
    <td width="92" valign="center" ><p >时间 </p></td>
    <td width="123" valign="center" ><p ><input name="sj" type="text" id="sj" data-rule="required" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${zfqk.sj}"/></p></td>
    <td width="159" valign="center" ><p >被访者姓名 </p></td>
    <td width="233" valign="center" ><p ><input name="bfzxm" type="text" id="bfzxm" data-rule="required" value="${zfqk.bfzxm}"/></p></td>
  </tr>
  <tr >
    <td width="187" valign="center" ><p >被访者类型 </p></td>
    <td width="106" valign="center" ><p ><input name="bfzlx" type="text" id="bfzlx" data-rule="required" value="${zfqk.bfzlx}"/></p></td>
    <td width="92" valign="center" ><p >被访者住址 </p></td>
    <td width="123" valign="center" ><p ><input name="bfzdz" type="text" id="bfzdz" data-rule="required" value="${zfqk.bfzdz}"/></p></td>
    <td width="159" valign="center" ><p >家庭基本情况 </p></td>
    <td width="233" valign="center" ><p ><input name="jtjbqk" type="text" id="jtjbqk" data-rule="required" value="${zfqk.jtjbqk}"/></p></td>
  </tr>
  <tr>
    <td width="187" valign="top" ><p >被访者联系电话 </p></td>
    <td valign="center" colspan="3" ><p ><input name="bfzdh" type="text" id="bfzdh" data-rule="required" value="${zfqk.bfzdh}"/></p></td>
    <td width="159" valign="center" ><p >走访者 </p></td>
    <td width="233" valign="center" ><p ><input name="zfz" type="text" id="zfz" data-rule="required" value="${zfqk.zfz}"/> </p></td>
  </tr>
  <tr>
    <td width="187" valign="top" ><p >反映的需求、问题和建议 </p></td>
    <td valign="center" colspan="5" ><p ><input name="xq" type="text" id="xq" data-rule="required" value="${zfqk.xq}"/></p></td>
  </tr>
  <tr>
    <td width="187" valign="top" ><p >采取的对策和措施 </p></td>
    <td valign="center" colspan="5" ><p ><input name="dc" type="text" id="dc" data-rule="required" value="${zfqk.dc}"/></p></td>
  </tr>
  <tr >
    <td width="187" valign="center" ><p >处理结果 </p></td>
    <td valign="center" colspan="5" ><p ><input name="cljg" type="text" id="cljg" data-rule="required" value="${zfqk.cljg}"/> </p></td>
  </tr>

					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
				
					<input type="hidden" name="id" value="${zfqk.id}">
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