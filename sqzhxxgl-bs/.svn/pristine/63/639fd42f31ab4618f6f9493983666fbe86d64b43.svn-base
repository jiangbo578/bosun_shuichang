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
    <li><a href="/szbj/list/1">四址边界</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 四址边界</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/szbj/item/add" method="post">

			<table>
			  <tr>
			    <th width="7%" height="26">东至:</th>
			    <td width="30%"><input type="text" name="dong"  >  </td>
			    <th width="16%">与</th>
			    <td width="31%"><input type="text" name="dongyu"  > </td>
			    <th width="33%">(村/居委会)相邻</th>
			  </tr>
			  <tr>
			    <th height="25">南至:</th>
			    <td><input type="text" name="nan"   > </td>
			    <th>与</th>
			    <td><input type="text" name="nanyu"   > </td>
			    <th>(村/居委会)相邻</th>
			  </tr>
			  <tr>
			    <th height="21">西至:</th>
			    <td><input type="text" name="xi"   ></td>
			    <th>与</th>
			    <td><input type="text" name="xiyu"   > </td>
			    <th>(村/居委会)相邻</th>
			  </tr>
			  <tr>
			    <th height="27">北至:</th>
			    <td><input type="text" name="bei"   ></td>
			    <th>与</th>
			    <td><input type="text" name="beiyu"   > </td>
			    <th>(村/居委会)相邻</th>
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
