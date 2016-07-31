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
   <li><a href="/user/1">用户管理</a> <span class="divider">/</span></li>

    <li class="active">修改用户</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  			<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>用户修改</strong> 
  
   
  </div>

	<div class="container">
		<form action="/user/update" method="post">

			<table>
				<tr >
					<th>用户名：</th>
					<td><input name="username" type="text"  style="width: 200px"  value="${user.username}" />
					</td>
				</tr>
	      <!-- <tr>
					<th>政务网ID：</th>
					<td><input name="serviceUserId" type="text" data-rule="required;" style="width: 200px" value="${ user.serviceUserId}"/>
					</td>
				</tr>
				 -->	
				<tr>
					<th>真实姓名：</th>
					<td><input name="realName" value="${user.realName }" type="text" data-rule="required;chinese" style="width: 200px"/>
					</td>
				</tr>
					<tr>
					<th>区域级别：</th>
					<td>
					
						<div id="panconfig" class="panstyle"> 
					    <input type="radio" checked='true'  id="quz0" name="aaaa" value="0"/>
					    <label for="">居委</label>
					    </div>
					    
					 <div class="panstyle"> 
				<input type="radio" id="quz1" name="aaaa" value="1"/>
					    <label for="">镇</label>
					    </div>
					    
					    	<div class="panstyle"> 
					    <input type="radio" id="quz2" name="aaaa" value="2"/>
					    <label for="">区</label>
					    </div>
					    
					</td>
				</tr>
				<tr>
					<th>组织结构：</th>
					<td>
						<span id='mianp0'>区<select onchange="" name="organizationMain"  id="organizationMain">
				<option value="d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1">上海市嘉定区</option></select></span>

<span id='mianp1'>
		镇<select  name="organizationId" onchange="laodjwh(this)"  id="organizationId">
						<c:forEach items="${organizationMap }" var="organization" varStatus="num">
					<option value="${organization.key}">${organization.value }</option></c:forEach></select>
					</span>
					<span id='mianp2'>
					居委会<select  name="childOrganizationId"  id="organization1">
					</span>
		
					<!--<div style="float: left;">
					<h5>父级</h5>
					
				
					<ul>
					<c:forEach items="${organizationMap }" var="organization" varStatus="num">
						<li> 
					    <input type="radio" id="organization${organization.key }" name="organizationId" value="${organization.key }" 
					    <c:if test="${num.index == 0 }"> checked="checked"</c:if>
					    />
					    <label for="organization${organization.key }">${organization.value }</label>
					    </li>
					</c:forEach>
					</ul>
					</div>
					<div style="float: left;" >
					<h5>子级</h5>
					<ul id="b_child_result"></ul>
					
					</div>
					--></td>
				</tr>
				<tr>
					<th>角色：</th>
					<td>
					
					<c:set var="roleIds" value="${roleIds}" />
					<c:forEach items="${roleMap }" var="role">
						<c:set var="key" value="${role.id }"/>
						<div  class="panstyle p${role.parid}" >
					    <input  code='${role.code}' onclick="showznbm(this)" type="checkbox" id="role${role.id }" name="roleIds" value="${role.id }"  
					    <c:if test="${fn:contains(roleIds, key)}">checked="checked"</c:if>
					    />
					    <label for="role${role.id }">${role.name}
					     <c:if test="${role.parid eq '1'}"><i class='icon-user'></i>居委</c:if>
           <c:if test="${role.parid eq '2'}"><i class='icon-user'></i>镇</c:if>
             <c:if test="${role.parid eq '3'}"><i class='icon-user'></i>区</c:if>
					    
					    </label>
					    </div>
					</c:forEach>
		
					</td>
				</tr>
						<tr id='tznbm' style="display: none">
					<th>职能部门：</th>
					<td>
				<span id='znbmid2' >
		<select  name="znbmid"  id="znbmid">
				</select>
					</span>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>	
			<input type="hidden" name="id" value="${user.id}">
					<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
			</table>
			<input type="hidden" value='1' name='22' id="myoter"> 
		</form>
	</div>

</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	function showznbm(obj){
	if( obj.getAttribute('code')=='qznbm' ||  obj.getAttribute('code')=='zznbm' && obj.checked==true){
	  	  $("#tznbm").show();
	  	  getznbm();
	 
	}else if(obj.getAttribute('code')=='qznbm' ||  obj.getAttribute('code')=='zznbm' && obj.checked==false)
	{
	
	$("#tznbm").hide();
    $("#znbmid").val('');
	}
	
	if(obj.getAttribute('code')=='qznbm' && obj.checked==false){
    $("#znbmid").val('');
	$("#tznbm").hide();
	}
	

	}
	
	//获取职能部门
	function getznbm(){
	var array=$("input[type=checkbox]:checked");
	var isnext  =false;
	for(var i=0;i<array.length;i++){
	    if($(array[i]).attr('code')=='qznbm' || $(array[i]).attr('code')=='zznbm'  ){
	        isnext=true;
	    }
	}
	if(isnext==false){return false;}
	
	document.getElementById("znbmid").options.length=0;
	var parentId ="d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"
			if($("input[type=radio]:checked").val()=='1'){
			parentId=$("#organizationId").val();
			}else if($("input[type=radio]:checked").val()=='0'){
			  $("#tznbm").hide();
			 $("#znbmid").val('');
			   return false;
			}else{
			 parentId ="d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"
			}
			$.ajax({
	            url: '/organization/znbmAll/'+parentId,
	            type: 'GET',
	            dataType: 'json',
	            success: function(data){

	            	$.each(data, function(index, item){
	         			
	            	  document.getElementById("znbmid").options.add(new Option(item.name,item.id));
	       
	            	});
	       
	 
	       for(var i=0;i<document.getElementById("znbmid").options.length;i++){

    if("${user.znbmid}"==document.getElementById("znbmid").options[i].value){
         document.getElementById("znbmid").options[i].selected = true;
     }
		}
	            }
	        });
	        
	        
	    
		}
	
	
	
	//==================================================================================
	//===========================================================================================================
	function changhide(vc){
		var obj1=$(".p2");
		for(var o=0;o<obj1.length;o++){
		  $(obj1[o]).hide();
		}
			obj1=$(".p1");
		for(var o=0;o<obj1.length;o++){
		  $(obj1[o]).hide();
		}
		obj1=$(".p3");
		for(var o=0;o<obj1.length;o++){
		  $(obj1[o]).hide();
		}
		
		obj1=$(".p"+vc);
		for(var o=0;o<obj1.length;o++){
		  $(obj1[o]).show();
		}
		
		}

		function laodjwh(text){
		
			document.getElementById("organization1").options.length=0;
	
		getChildOrganizations(text.value);
		}
	$(function(){
	
	  
		
	
	
		var message = '${message}';
		if(message != ''){
			alert(message);
		}

	
		
		$('input[type=radio][name=organizationId]').on('click', function(){
			var parentId = this.value;
			getChildOrganizations(parentId);
		});
		
		$('input[type=radio]').on('click', function(){
		  onchecks();
		 getznbm();
		  //清除选中的全蝎
		
	//
		$("#tznbm").hide();
		 $("#znbmid").val('');
		});
		
		
		
		 var parent = '${user.organization.parent}';
	   var myuuid='${user.organization.id}';
		if(parent=="d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f2"){
		
		  $("#quz2").click();
		  onchecks();
		  	changhide(3);
		  //表示区
		 }else if(parent=="d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"){
		   //表示镇
		  $("#quz1").click();
		  	changhide(2);
		  onchecks();
		  for(var i=0;i<document.getElementById("organizationId").options.length;i++){
    if("${user.organization.id}"==document.getElementById("organizationId").options[i].value){
         document.getElementById("organizationId").options[i].selected = true;
     }
 }
		 }else{
		  //居委
		  	changhide(1);
		   //先选中 镇
		  	  for(var i=0;i<document.getElementById("organizationId").options.length;i++){
    if("${user.organization.parent.id}"==document.getElementById("organizationId").options[i].value){
         document.getElementById("organizationId").options[i].selected = true;
     }
 }
  //然后选中居委

  
 	getChildOrganizations('${user.organization.parent.id}');
 	
		  
		 }
	
		
	});
	
	function getChildOrganizations(parentId){

			$.ajax({
	            url: '/organization/childall/'+parentId,
	            type: 'GET',
	            dataType: 'json',
	            success: function(data){
	            	var html = '';
	            	$.each(data, function(index, item){
	         		
	            	  document.getElementById("organization1").options.add(new Option(item.name,item.id));
	            
	            	});
	            	recheck();
	        		//$('#b_child_result').html(html);
	        	
	            }
	        });

	
		}
	
		function recheck(){
			// alert(document.getElementById("organization1").options.length)
		for(var i=0;i<document.getElementById("organization1").options.length;i++){
	    if("${user.organization.id}"==document.getElementById("organization1").options[i].value){
	         document.getElementById("organization1").options[i].selected = true;
	     }
	   
       }
		}
		function onchecks(){
		  var myvalue=   $('input[type=radio]:checked').val();
		
		   if(myvalue==0){
		   //居委
		      changhide(1)
		   $("#organizationMain").attr('name','organizationMain');  //区
		   $("#organizationId").attr('name','organizationId');//镇
		    $("#organization1").attr('name','childOrganizationId');//居委
		    $("#myoter").attr('name','3');  //区
		   $("#mianp0").show();
		    $("#mianp1").show();
		    $("#mianp2").show();
		   }else if(myvalue==1){
		   //镇
		      changhide(2)
		 $("#organizationMain").attr('name','organizationId');  //区
		   $("#organizationId").attr('name','childOrganizationId');//镇
		    $("#organization1").attr('name','aaa');//居委
		   $("#mianp0").show();
		   $("#mianp1").show();
		   $("#myoter").attr('name','2');  //区
		   $("#mianp2").hide();
		   }else if(myvalue==2){
		      changhide(3)
			$("#organizationMain").attr('name','childOrganizationId');  //区
			$("#myoter").attr('name','organizationId');  //区
	
		   $("#organizationId").attr('name','childOrganizationId1');//镇
		    $("#organization1").attr('name','childOrganizationId1');//居委
		      $("#mianp0").show();
		    $("#mianp2").hide();
		     $("#mianp1").hide();
		    //区
		   }
			
		}
		
		
		$(function(){
		  		  	var array=$("input[type=checkbox]:checked");
		  	for(var i=0;i<array.length;i++){
	       if($(array[i]).attr('code')=='zznbm'  || $(array[i]).attr('code')=='qznbm')
	      	  $("#tznbm").show();
	       getznbm();
	   
	}
		})
	
	</script>

</body>
</html>