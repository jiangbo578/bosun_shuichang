<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
<script type="text/javascript">
	var bid='${business.parid}';//保存父类OD
  function changelist(index){
  if(index.value==0){
    document.getElementById("parid").options.length=0;
    return false;
  }
      $.getJSON("/business/type/"+index.value,function(result){
   document.getElementById("parid").options.length=0;
  	    $.each(result, function(i, field){
  	    	   if(i==0){
  	    		 index=index+1;
  	    	   }
  	    	   document.getElementById("parid").options.add(new Option(field['name'],field['id']));
  	    	//$("#parid").append("<option value='"++"'>""</option>")
  	     
			
  	    });
  	    	  if(bid!=''){
  		  for(var i=0;i<document.getElementById("parid").options.length;i++){

	    if(bid==document.getElementById("parid").options[i].value){

         document.getElementById("parid").options[i].selected = true;
     }
 		}
 		bid='';
	  }
     
  	  });	
  
  


  }
 </script>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/business/1/null">业务管理</a> <span class="divider">/</span></li>
    <li class="active">业务修改</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  		<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>业务修改 </strong>
  
   
  </div>
	<div class="container">
		<form action="/business/update" method="post">

			<table>
			<tr>
					<th>所属业务类：</th>
				<td>
					<select onchange="changelist(this)" name="topparid"  id="topparid">
					<option value="0">清选择....</option>
<option value="1">基础情况</option>
<option value="2">社会管理 </option>
<option value="3">公共服务</option>
<option value="4">党群工作</option>
<option value="5">会议活动</option>



</select>

&nbsp;&nbsp;&nbsp;子业务类：<select data-rule="required;" name="parid" id="parid">

</select>
				</td>
				
				</tr>
				<tr>
					<th>名称：</th>
					<td><input name="name" type="text" data-rule="required;" value="${business.name}"/>
					</td>
				</tr>
				<tr>
					<th>代码：</th>
					<td><input name="code" type="text" data-rule="required;" value="${business.code}"/>
					</td>
				</tr>
				<tr>
					<th>填报周期：</th>
					<td><input name="period" type="text" data-rule="required;" value="${business.period}"/><br>
					
					</td>
				</tr>
				<tr>
					<th>导出格式：</th><c:if test="${business.exporttype==0}"></c:if>
					<td><input name="exporttype" type="radio" value="0" <c:if test="${business.exporttype==0}">checked="checked" </c:if>/>word文档
					&nbsp;&nbsp;&nbsp;&nbsp;
					     <input name="exporttype" type="radio" value="1" <c:if test="${business.exporttype==1}">checked="checked" </c:if>/>excel表格
					
					</td>
				</tr>
				<tr>
					<th>名称格式：</th>
					<td><input name="format" type="text" data-rule="required;" value="${business.format}"/>
					
					<br>
						如：消防器材维护记录{yyyy}年{mm}月{dd}日，系统自动把"{yyyy}"、"{mm}"和"{dd}"分别替换成目前的年、月和日
					</td>
				</tr>
				<tr>
					<th>是否审核：</th>
					<td><input type="radio" name="audit" value="1"/>是 
						<input type="radio" name="audit" value="0"/>否
					</td>
				</tr>
				<tr>
					<th>是否提醒：</th>
					<td><input type="radio" name="remind" value="1"/>是 
						<input type="radio" name="remind" value="0"/>否
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="id" value="${business.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>
		</div>
		</div>


<jsp:include page="/page/footer.jsp"></jsp:include>

	<script>
		$(function() {
			$('input[name=audit][type=radio][value=${business.audit ? 1 : 0}]').attr('checked', true);
			$('input[name=remind][type=radio][value=${business.remind ? 1 : 0}]').attr('checked', true);
		
	
		});
		
	
var myindex='${types.parid}';
  if(myindex!=''){

 document.getElementById("topparid").options[myindex].selected=true;

 changelist(document.getElementById("topparid").options[myindex])
	   }
		
		
		
	</script>
</body>
</html>