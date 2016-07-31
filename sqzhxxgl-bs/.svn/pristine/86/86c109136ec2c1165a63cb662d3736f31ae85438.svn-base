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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/kzxqsag/list/1">开展星期四爱国卫生义务劳动情况记录表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>开展星期四爱国卫生义务劳动情况记录表</div>
  <div id="panbody">
	<div class="container">
		<form action="/kzxqsag/item/update" method="post">

			<table>
			<tr>
					<th>日期：</th>
					<td><input type="text" name="rq" data-rule="required;date" onClick="WdatePicker()" class="Wdate" value="${kzxqsag.rq}"/>
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td><input type="text" name="nr" data-rule="required;" value="${kzxqsag.nr}"/>
					</td>
				</tr>
				<tr>
					<th>参加居民小区数：</th>
					<td><input type="text" name="cjxqs" data-rule="required;number" value="${kzxqsag.cjxqs}"/>
					</td>
				</tr>
				
				<tr>
					<th>参加单位数：</th>
					<td><input type="text" name="cjdws" data-rule="required;number" value="${kzxqsag.cjdws}"/>
					</td>
				</tr>
				<tr>
					<th>参加人数：</th>
					<td><input type="text" name="cjrs"data-rule="required;number" value="${kzxqsag.cjrs}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${kzxqsag.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
 <script src="/scripts/business/kzxqsag.js"></script> 
<jsp:include page="/page/footer.jsp"></jsp:include>
	
	
</body>
</html>