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

	<!-- -这是台账五大类 -->
      	<c:forEach items="${datas }" var="businessType" varStatus="num">
        <shiro:hasPermission name="${businessType.code}:list">  
         <ul class="breadcrumb"  style="margin-bottom: 0px;font-size: 14px;"> <i class="icon-book"></i><li >${businessType.name}</li></ul>

         <table class="table table-striped table-bordered table-hover" >
           <thead>
             <th width="55%">表单名称</th>
             <th width="15%">填报周期</th>
             <th width="15%">是否需要审核</th>
             <th width="15%">更新日期</th>
           </thead>
           <tbody>
  
      	   	<c:forEach items="${businessType.businesslist}" var="business" varStatus="bna">  
      	  <!-- 判断权限里面是否有这张表，没有就不循环出来 -->
           <shiro:hasPermission name="${business.code}:list"> 
           <tr >
			   <td><li><a href="/${business.code}/list/">${business.name}</a></li></td>
               <td>${business.period}</td>
               <td >&nbsp;&nbsp;&nbsp;&nbsp;${business.audit==true?'<i class=icon-ok></i>':'<i class=icon-remove></i>'}</td>
               <td><fmt:formatDate pattern='yyyy-MM-dd hh:mm:ss' value='${business.updateDate}'/></td>       
            </tr>
                </shiro:hasPermission> 
			</c:forEach>
           </tbody>
   </table>
  </shiro:hasPermission>  
   </c:forEach>
   <!-- 五大类结束 -->
   
   <!-- 28本台账 -->
 
      </div>
      </div>
      <br> 
       	<jsp:include page="/page/footer.jsp"></jsp:include>       
       </body>
 </html>
     