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
    <li><a href="/taizhang/list/5">基础情况</a> <span class="divider">/</span></li>
      <li><a href="/jwhtsgz/list/1">居委会特色工作</a> <span class="divider">/</span></li>
	 <li class="active">详细</li>
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong>咨询接待记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table >
			<tr>
					<th>单位名称：</th>
					<td>${jwhtsgz.dwname }</td>
				</tr>
				<tr>
					<th>特色工作名称：</th>
					<td>${jwhtsgz.tsname }</td>
				</tr>
				<tr>
					<th>记录人：</th>
					<td>${jwhtsgz.jlr }</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td>
						<div>${jwhtsgz.nr }</div>
					</td>
				</tr>
			<tr>
					<th>&nbsp;</th>
					<td>	<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
		</table>
	</div>

</div>
</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>