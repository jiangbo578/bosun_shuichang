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
   <li><a href="/assess/list/1">考核管理</a> <span class="divider">/</span></li>
 <li><a href="/assess/child/list/${assessId }/1">${assess.name}[${assess.identityName }]-考核项目</a> <span class="divider">/</span></li>
    <!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  	<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>考核项目添加</strong> 
   
  </div>
	<div class="container">
		<form action="/assess/child/edit/${assessId}" method="post">

			<table>
				<tr>
					<th>考核项目名称：</th>
					<td><input name="project" type="text" data-rule="required;" style="width: 200px"/>
					</td>
				</tr>
				<tr>
					<th>考核总分：</th>
					<td><input name="allScore" type="text" data-rule="required;" style="width: 200px"/>
					</td>
				</tr>
				<tr>
				<th>排序顺序:</th>
				<td><input type="text" name="des"/></td>
				</tr>
				<tr>
					<th>评定此项的职能部门：</th>
					<td>
						<select name="znbmId">
							<c:forEach items="${organizations}" var="zz">
								<option value="${zz.id }">${zz.name }</option>
							</c:forEach>
						</select>
					</td>
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

		</div>
	<jsp:include page="/page/footer.jsp"></jsp:include><br>		<br><br>
	<script>
	$(function(){
		var message = '${message}';
		if(message != ''){
			alert(message);
		}
	});
	</script>
</body>
</html>