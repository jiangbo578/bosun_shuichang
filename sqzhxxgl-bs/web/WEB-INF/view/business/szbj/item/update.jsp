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
    <li><a href="/szbj/list/1">四址边界</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>四址边界</div>
  <div id="panbody">
	<div class="container">
		<form action="/szbj/item/update" method="post">

			<table>
				  <tr>
				    <th width="7%" height="26">东至:</th>
				    <td width="30%"><input type="text" name="dong"  value="${szbj.dong}"  >  </td>
				    <th width="16%">与</th>
				    <td width="31%"><input type="text" name="dongyu"  value="${szbj.dong}"  > </td>
				    <th width="33%">(村/居委会)相邻</th>
				  </tr>
				  <tr>
				    <th height="25">南至:</th>
				    <td><input type="text" name="nan"  value="${szbj.nan}"  > </td>
				    <th>与</th>
				    <td><input type="text" name="nanyu"  value="${szbj.nanyu}"  > </td>
				    <th>(村/居委会)相邻</th>
				  </tr>
				  <tr>
				    <th height="21">西至:</th>
				    <td><input type="text" name="xi"  value="${szbj.xi}"  ></td>
				    <th>与</th>
				    <td><input type="text" name="xiyu"  value="${szbj.xiyu}"  > </td>
				    <th>(村/居委会)相邻</th>
				  </tr>
				  <tr>
				    <th height="27">北至:</th>
				    <td><input type="text" name="bei"  value="${szbj.bei}"  ></td>
				    <th>与</th>
				    <td><input type="text" name="beiyu" value="${szbj.beiyu}"  > </td>
				    <th>(村/居委会)相邻</th>
				  </tr>
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${szbj.id}">
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