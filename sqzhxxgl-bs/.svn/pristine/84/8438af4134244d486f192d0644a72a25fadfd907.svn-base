<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<style type="text/css">

.panstyle{
float:left; 
width:130px;
border:  solid 1px #cccccc;
margin-left: 12px ;
margin-bottom: 12px; text-align: center; 
}
.panstyle:hover{
  background-color: #FFE500;
  border:  solid 1px #0066B2;
}
.p1{

}
.p2{

}
.p3{

}
</style>
</head>
<body>

		 <ul class="breadcrumb" style="margin-bottom: 5px;">

 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li class="active">密码修改</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>修改登陆密码</strong> 
  
   
  </div>

	<div class="container">
	<c:if test="${msg!=null}">
	<h3><i class=' icon-bell'></i>${msg}</h3>
	</c:if>
	
		<form action="/puser/pass" onsubmit="return checkform();" method="post">

			<table>
				<tr >
					<th>用户名：</th>
					<td>${user.username}
					</td>
				</tr>
			<tr >
					<th>原始密码：</th>
					<td><input name="password1" type="text" id="password1"  style="width: 200px"  value="" />
					</td>
				</tr>
				<tr >
					<th>新密码密码：</th>
					<td><input name="password2" type="text"  id="password2"  style="width: 200px"  value="" />
					</td>
				</tr>
					<tr >
					<th>重复输入：</th>
					<td><input name="password3" type="text" id="password3"  style="width: 200px"  value="" />
					</td>
				</tr>
	
	
			
		
						
				<tr>
					<th>&nbsp;</th>
					<td>	
			<input type="hidden" name="id" value="${user.id}">
					<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
			
					</td>
				</tr>
			</table>

		</form>
	</div>

</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>

	function checkform(){
		if($("#password1").val()=="" || $("#password2").val()=="" || $("#password3").val()==""){
			alert("信息不完整");
			return false;
		}
		
		
		if($("#password2").val()!=$("#password3").val()){
			alert("两次密码输入不一致");
			return false;
		}
		return true;
		
	}
	</script>

</body>
</html>