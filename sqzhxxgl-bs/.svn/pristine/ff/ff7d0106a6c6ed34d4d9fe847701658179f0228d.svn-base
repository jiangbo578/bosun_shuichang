<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
<style type="text/css">
.panstyle{
float:left; 
width:280px;
height:60px;
border:  solid 1px #cccccc;
margin-left: 12px ;
margin-bottom: 12px; text-align: center; 
}
</style>
</head>
<body>
 		 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
  <li><a href="/role/1"><i class="icon-home"></i>角色管理</a> <span class="divider">/</span></li>

    <li class="active"><i class="icon-align-left"></i>修改角色</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
 		<div class="mianpan">
  <div class="panhead">
  <i class="icon-user">&nbsp;&nbsp;</i><strong>角色修改</strong> 
  
   
  </div>
	<div class="container">
		<form action="/role/add" method="post">

			<table>
					<tr>
					<th>级别：</th>
			<td><select onchange="" name="parid"  id="parid">
				<option value="3">区级别</option>
				<option value="2">镇级别</option>
				<option value="1">居委级别</option>
				</select>
					</td>
				</tr>
				<tr>
					<th>名称：</th>
					<td><input name="name" type="text" data-rule="required;" style="width: 200px"/>
					</td>
				</tr>
				<tr>
					<th>标识：</th>
					<td><input name="code" type="text" style="width: 200px"/>
					</td>
				</tr>
				<tr>
					<th>描述：</th>
					<td><input name="description" type="text" style="width: 500px"/>
					</td>
				</tr>
			
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
						<button class="btn" type="button" onclick="checkall()"> 全选</button>
						<button class="btn" type="button" onclick="checkalls()"> 反选</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
			</table>权限：
			<div style="width: 100%">
			
			
				<c:forEach items="${authorityMap }" var="authority">
						<div class='panstyle'> 
					   <input type="checkbox" id="authority${authority.key }" name="authorityIds" value="${authority.key }"/>
					    <label  for="authority${authority.key }"> ${authority.value }</label>
					    </div>
					</c:forEach>
					</div>
		</form>
	</div>
</div>
	
<jsp:include page="/page/footer.jsp"></jsp:include>
	<br><br>

	<script>
	$(function(){
		var message = '${message}';
		if(message != ''){
			alert(message);
		}
			
	});
	  (function($) {
    $(document).ready(function () {
      $('a[rel=tooltip]').tooltip({});

      $(".popover").show();
    });
  })(jQuery);
  
	  function checkall(){
		    $("input[name='authorityIds']").each(function()
		  		  {
		  	  this.checked=true;
		  	
		  		  }
		    );
		}
		function checkalls(){
		    $("input[name='authorityIds']").each(function()
		  		  {
		  	  this.checked=false;
		  	
		  		  }
		    );
		}
	</script>
</body>
</html>