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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/xqdc/list/1">居（村）委社会单位场所、住宅小区底册 </a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 居（村）委社会单位场所、住宅小区底册 </div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/xqdc/item/add" method="post">
           
           <table> 
             <tr>
		         <th>社会单位或住宅小区名称：</th>
		         <td><input name="xqmc" type="text" data-rule="required" ></td>
		       
		       </tr>
		      
		      
		       <tr>
		         <th>单位地址:</th>
		         <td><input name="dwdz" type="text" data-rule="required" /></td>
		      
		       </tr>
		       <tr>
		         <th>单位联系人:</th>
		         <td><input name="lxr" type="text" data-rule="required" ></td>
		       
		       </tr>
		       <tr>
		         <th>联系方式:</th>
		         <td><input name="lxfs" type="text" data-rule="required" ></td>
		       
		       </tr>
		        <tr>
		         <th>登记年份 :</th>
		         <td><input name="djnf" type="text" data-rule="required;date" onClick="WdatePicker();" class="Wdate" /></td>
		       
		        
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