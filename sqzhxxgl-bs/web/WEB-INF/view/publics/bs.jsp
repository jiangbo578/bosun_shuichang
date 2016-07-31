<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<style type="text/css">
td{
 height: 28px;
}

</style>
</head>


 <body>
 <div id="myhei">

  
 		 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
  <li class="active">${onetype}</li>

  </ul>
  
  		<div class="mianpan">
  <div class="panhead" style="font-size: 15px">
  <i class="icon-list">&nbsp;&nbsp;</i>  
        ${onetype}
</div>

   
   <!-- 28本台账 -->
   <c:forEach items="${mould }" var="mould" varStatus="num">
     
         <ul class="breadcrumb"  style="margin-bottom: 0px;font-size: 14px;"> <i class="icon-hand-up"></i> <a href="#" class="trace_show"><li >${mould.mould_name}</li></a> </ul>
         <table class="table table-striped table-bordered table-hover" style="display: none;">
           <thead>
             <th width="55%">表单名称</th>
             <th width="15%">填报周期</th>
             <th width="15%">是否需要审核</th>
             <th width="15%">更新日期</th>
           </thead>
           <tbody>
 
      	   	<c:forEach items="${mould.mould_Gathers}" var="mould_gat" varStatus="bna">  
           <tr>
			   <td><li><a href="/${mould_gat.business.code}/list/">${mould_gat.business.name}</a></li></td>
               <td>${mould_gat.business.period}</td>
               <td >&nbsp;&nbsp;&nbsp;&nbsp;${mould_gat.business.audit==true?'<i class=icon-ok></i>':'<i class=icon-remove></i>'}</td>
               <td><fmt:formatDate pattern='yyyy-MM-dd hh:mm:ss' value='${mould_gat.business.updateDate}'/></td>       
            </tr>

			</c:forEach>
           </tbody>
   </table>
 
   </c:forEach>
      </div>
      </div>
      

<script type="text/javascript"> 
$(document).ready( function() {
    $("a.trace_show").toggle( function() {
    	//$("i.icon-plus").addClass("icon-minus");
        $(this).parent().next("table").show('fast');
    }, function() {
    	//alert($("i.icon-plus").val())
    	//$("i.icon-plus").addClass("icon-plus");
        $(this).parent().next("table").hide('slow');
    });
});

</script>
      
      <br> 
       	<jsp:include page="/page/footer.jsp"></jsp:include>       
       </body>
 </html>
     