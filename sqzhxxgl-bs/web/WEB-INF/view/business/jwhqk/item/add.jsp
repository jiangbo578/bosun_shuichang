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
    <li><a href="/jwhqk/list/1">居委会情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 居委会情况</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/jwhqk/item/add" method="post">

			<table>
				
			  <tr>
			    <th>居委会(全称):</th>
			    <td colspan="2"><input type="text"   data-rule="required;length[1~20];" name="jwhqc" />  </td>
			  </tr>
			  <tr>
			    <th><p >党(总)支部成立日期：</p></th>
			    <td ><input type="text"  onClick="WdatePicker()" class="Wdate"  data-rule="required;date"  name="dzbclrq"></td>
			    <th style="padding-left: 100px"><p >居委会成立日期：</p></th>
			    <td><input type="text" onClick="WdatePicker()" class="Wdate" data-rule="required;date" name="jwhclrq"/></td>
			  </tr>
			
			  <tr>
			    <th ><p >党(总)支部成员数：</p></th>
			    <td><input type="text" data-rule="required:digits;"  name="dzbrs"/></td>
			    <th style="padding-left: 100px">其中：书记:</th>
			    <td><p ><input type="text" data-rule="required:digits;"   name="dzbsj"/></p></td>
			  
			  
			  </tr>
			  <tr>
			    <th ><p >副书记:</p></th>
			    <td ><p ><input type="text" data-rule="required:digits;"  name="dzbfsj"/></p></td>
			    <th style="padding-left: 100px"><p >委员:</p></th>
			    <td ><p ><input type="text" data-rule="required:digits;"  name="dzbwy"/></p></td>
			  </tr>
			  <tr>
			    <th ><p >居委会成员人数：</p></th>
			    <td><input type="text" data-rule="required:digits;"  name="jwhrs"/></td>
			    <th style="padding-left: 100px"><p >其中：主任:</p></th>
			    <td ><input type="text" data-rule="required:digits;" name="jwhzr"/></td>
			   
			  </tr>
			  <tr>
			   <th><p >副主任:</p></th>
			    <td><p ><input type="text" data-rule="required:digits;"  name="jwhfzr"/></p></td>
			    <th style="padding-left: 100px"> <p >委员:</p></th>
			    <td><input type="text" data-rule="required:digits;"  name="jwhwy"/></td>
			  </tr>
			  <tr>
			    <th ><p >所属(街镇):</p></th>
			    <td ><input type="text"   data-rule="required;length[1~20];" name="jd"/> </td>
			    <th style="padding-left: 100px"><p >办公地址：</p></th>
			    <td ><input type="text"   data-rule="required;length[1~20];" name="bgdz"/> </td>
			  </tr>
			 
			  <tr>
			    <th height="32"><p >电话：</p></th>
			    <td><input type="text"  data-rule="required;" name="phone"/></td>
			    <th style="padding-left: 100px"><p >E-MAIL地址:</p></th>
			      <td><input type="text"  data-rule="required:email;" name="emall"/></td>
			   
			  </tr>
			  <tr>

			    <th ><p >邮政编码：</p></th>
			    <td><input type="text"  data-rule="required:postcode;" name="code"/></td>
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
