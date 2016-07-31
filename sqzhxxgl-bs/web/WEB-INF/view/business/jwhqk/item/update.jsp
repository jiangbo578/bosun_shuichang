<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/jwhqk/list/1">居委会情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>居委会情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/jwhqk/item/update" method="post">
			<table>
				  <tr>
					   <th ><p >居委会(全称):</p></th>
					    <td><input type="text"    data-rule="required;length[1~20];" name="jwhqc" value="${jwhqk.jwhqc}" />  </td>
					  </tr>
					  <tr>
					    <th ><p >党(总)支部成立日期：</p></th>
					    <td><input type="text"  onClick="WdatePicker()" class="Wdate"  data-rule="required;date"  name="dzbclrq" value="${jwhqk.dzbclrq}" /> </td>
					    <th style="padding-left: 90px"><p >居委会成立日期：</p></th>
					    <td><input type="text" onClick="WdatePicker()" class="Wdate" data-rule="required;date" name="jwhclrq" value="${jwhqk.jwhclrq}" /></td>
					  </tr>
					 
					  <tr>
					    <th ><p >党(总)支部成员数：</p></th>
					    <td ><input type="text" data-rule="required:digits;range[1~1000]"   name="dzbrs" value="${jwhqk.dzbrs}" /></td>
					    <th style="padding-left: 90px"><p >其中：书记</p></th>
					     <td><p ><input type="text" data-rule="required:digits;range[1~1000]" name="dzbsj" value="${jwhqk.dzbsj}" /></p></td>
					  </tr>
					  <tr>
					  
					    <th ><p >副书记</p></th>
					    <td ><p ><input type="text" data-rule="required:digits;range[1~1000]"   name="dzbfsj" value="${jwhqk.dzbfsj}" /></p></td>
					    <th style="padding-left: 90px"><p >委员</p></th>
					    <td ><p ><input type="text" data-rule="required:digits;range[1~1000]"   name="dzbwy" value="${jwhqk.dzbwy}" /></p></td>
					  </tr>
					  <tr>
					    <th><p >居委会成员人数：</p></th>
					    <td><input type="text" data-rule="required:digits;range[1~1000]"   name="jwhrs" value="${jwhqk.jwhrs}" /></td>
					    <th style="padding-left: 90px"><p >其中：主任</p></th>
					    <td><input type="text" data-rule="required:digits;range[1~1000]"   name="jwhzr" value="${jwhqk.jwhzr}" /></td>
					   
					  </tr>
					  <tr>
					    <th><p >副主任</p></th>
					    <td><p ><input type="text" data-rule="required:digits;range[1~1000]"   name="jwhfzr" value="${jwhqk.jwhfzr}" /></p></td>
					    <th style="padding-left: 90px"><p >委员</p></th>
					    <td><input type="text" data-rule="required:digits;range[1~1000]"   name="jwhwy" value="${jwhqk.jwhwy}" /></td>
					  </tr>
					  <tr>
					    <th ><p >所属：(街镇)</p></th>
					    <td ><input type="text"    data-rule="required;length[1~20];" name="jd" value="${jwhqk.jd}" /> </td>
					       <th style="padding-left: 90px"><p >办公地址：</p></th>
					    <td><input type="text"    data-rule="required;length[1~20];" name="bgdz" value="${jwhqk.bgdz}" /> </td>
					  </tr>
					
					  <tr>
					    <th><p >电话：</p></th>
					    <th><input type="text"  data-rule="required:tel;" name="phone" value="${jwhqk.phone}" /></td>
					    <th style="padding-left: 90px"><p >E-MAIL地址:</p></th>
					    <td><input type="text"  data-rule="required:email;" name="emall" value="${jwhqk.emall}" /></td>
					  
					  </tr>
					  <tr>
					    <th ><p >邮政编码：</p></th>
					    <td><input type="text"  data-rule="required:postcode;" name="code" value="${jwhqk.code}" /></td>
					  </tr>
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${jwhqk.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>

</body>
</html>