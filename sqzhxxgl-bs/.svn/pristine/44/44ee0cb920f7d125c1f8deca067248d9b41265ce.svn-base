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

.bs-docs-example-popover {
  position: static;
  /*overflow: visible;*/
}
.bs-docs-example-popover .popover {
  position: relative;
  display: block;
  float: left;
  width: 260px;
  margin: 20px;
}
.arrow-after {

}
</style>
</head>
<body>
 <div id="myhei">
 		 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
  <li><a href="/role/1"><i class="icon-home"></i>角色管理</a> <span class="divider">/</span></li>

    <li class="active"><i class="icon-align-left"></i>添加角色</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
 		<div class="mianpan">
  <div class="panhead">
  <i class="icon-user">&nbsp;&nbsp;</i><strong>添加角色</strong> 
  
   
  </div>
	<div class="container">
		<form action="/role/update" method="post">

			<table>
			
				<tr >
					<th width="50px">级别：</th>
					<td><select onchange="" name="parid"  id="parid">
				<option value="3">区级别</option>
				<option value="2">镇级别</option>
				<option value="1">居委级别</option>
				</select>
					</td>
				</tr>
				
				<tr>
					<th>名称：</th>
					<td><input name="name" type="text" data-rule="required;" style="width: 200px" value="${role.name }"/>
					</td>
				</tr>
				<tr>
					<th>标识：</th>
					<td><input name="code" type="text" style="width: 200px" value="${role.code }"/>
					</td>
				</tr>
				<tr>
					<th>描述：</th>
					<td><input name="description" type="text" style="width: 500px" value="${role.description }"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
						<button class="btn" type="button" onclick="checkall()"> 全选</button>
						<button class="btn" type="button" onclick="checkalls()"> 反选</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				<input type="hidden" name="id" value="${role.id}">
				
					</td>
				</tr>
				<tr>
					<th>权限：</th>
					<td>
					<c:set var="authorityIds" value="${authorityIds }"/>
					<c:forEach items="${authorityMap }" var="authority">
						<c:set var="key" value="${authority.key }"/>
						<div class='panstyle'>
					    <input type="checkbox" id="authority${authority.key }" name="authorityIds" value="${authority.key }"  
					    <c:if test="${fn:contains(authorityIds, key)}">checked="checked"</c:if>
					    />
					    <label for="authority${authority.key }">${authority.value}</label>
					    </div>
					</c:forEach>
					</td>
				</tr>
				
			</table>
		</form>
	</div>
</div>
</div>
	
<jsp:include page="/page/footer.jsp"></jsp:include>
		 <script type="text/javascript">

   		  		for(var i=0;i<document.getElementById("parid").options.length;i++){

    if("${role.parid}"==document.getElementById("parid").options[i].value){
         document.getElementById("parid").options[i].selected = true;
     }
     } 

   
 
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
   		parent.changeheight(document.getElementById("myhei").offsetHeight);
       </script>
</body>
</html>