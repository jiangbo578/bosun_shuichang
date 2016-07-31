<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页----嘉定区村居社会管理信息系统</title>
<meta name="keywords" content="嘉定区村居社会管理信息系统"></meta>
<link rel="stylesheet" type="text/css" href="/styles/css/home.css?a=1" ></link>
<script type="text/javascript" src="/styles/js/jquery.min.js"></script>
<script type="text/javascript" src="/styles/js/baes.js"></script>
 
 <script src="/scripts/amcharts/amcharts.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/serial.js" type="text/javascript"></script>
         <script src="/scripts/amcharts/pie.js" type="text/javascript"></script>
	
        <!-- scripts for exporting chart as an image -->
        <!-- Exporting to image works on all modern browsers except IE9 (IE10 works fine) -->
        <!-- Note, the exporting will work only if you view the file from web server -->
        <!--[if (!IE) | (gte IE 10)]> -->
        <script src="/scripts/amcharts/exporting/amexport.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/rgbcolor.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/canvg.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/filesaver.js" type="text/javascript"></script>
        <script src="/scripts/amcharts/exporting/jspdf.plugin.addimage.js" type="text/javascript"></script>
        <!-- <![endif]-->

<style type="text/css">
#Main{
	width: 500px;
	height: 200px;
	overflow:hidden;
}
#mainDiv {
	width:100%;
	height:200px;
}
</style>
</head>
<body>  

<div class="warp">
 <div class="warpContent fl">
 		
     <div class="rightContent fl">
       <div class="news fl">
          <div class="form fl">
            <ul>
            	<span class="fl"></span>
            	
           		 	<li class="onForm"><a href="#">政策法规</a></li>
           		 	
           	   </ul>
           	   <dl id="daitianxie" >
           	   <c:forEach items="${news}" var="news" varStatus="num" begin="0" end="6">
           	       <c:if test="${news.type=='政策法规'}">
              	 	  	<dd style="padding-left: 10px;"><a href="/news/detail/${news.id}">${news.titles}</a><cite style="font-size:12px; color:#808080; position:absolute; right:15px; top:0"><a href="/news/detail/${news.id}">${news.adddate}</a></cite></dd>
                     </c:if>
              	</c:forEach>
              	<c:if  test="${fn:length(news)>6}">
                <dd style="padding: 0;margin: 0;"><a style="margin-left: 80%"  href="/news/listpage/1"><B>更多政策法规..</B></a></dd>
                </c:if>
           	   </dl>
            	
            </ul>
        
          </div>
          
           <div class="notice fl ">
            <ul>
            	<span class="fl"></span>
                <li class="onForm"><a href="#">工作信息</a></li>
            </ul>
            <dl id="news" >
                  <c:forEach items="${news}" var="news" varStatus="num" begin="0" end="6">
           	       <c:if test="${news.type=='工作信息'}">
              	 	  <dd style="padding-left: 10px"><a href="/news/detail/${news.id}">${news.titles}</a><cite style="font-size:12px; color:#808080; position:absolute; right:15px; top:0"><a href="/news/detail/${news.id}">${news.adddate}</a></cite></dd>
                     </c:if>
              	</c:forEach>
              	 <c:if  test="${fn:length(news)>6}">
                <dd style="padding: 0;margin: 0;"><a style="margin-left: 80%"  href="/news/listpage/1"><B>更多工作信息..</B></a></dd>
                </c:if>
            </dl>
          </div>
       </div>

    
     </div>
       <div class="rightContent fl">
       <div class="news fl">
          <div class="form fl">
            <ul>
            	<span class="fl"></span>
            	
           		 	<li class="onForm"><a href="#">通知公告</a></li>
           		 	
           	   </ul>
           	   <dl id="daitianxie" >
           	   <c:forEach items="${news}" var="news" varStatus="num" begin="0" end="6">
           	       <c:if test="${news.type=='通知公告'}">
              	 	  	<dd style="padding-left: 10px"><a href="/news/detail/${news.id}">${news.titles}</a><cite style="font-size:12px; color:#808080; position:absolute; right:15px; top:0"><a href="/news/detail/${news.id}">${news.adddate}</a></cite></dd>
                        </c:if>
              	</c:forEach>
              	  <c:if  test="${fn:length(news)>6}">
                <dd style="padding: 0;margin: 0;"><a style="margin-left: 80%"  href="/news/listpage/1"><B>更多通知公告..</B></a></dd>
                </c:if>
           	   </dl>
            	
            </ul>
          
           
          </div>
          
           <div class="notice fl ">
            <ul>
            	<span class="fl"></span>
                <li class="onForm"><a href="#">简报</a></li>
            </ul>
            <dl id="news" >
                   <c:forEach items="${news}" var="news" varStatus="num" begin="0" end="6">
           	       <c:if test="${news.type=='简报'}">
              	 	  	<dd style="padding-left: 10px"><a href="/news/detail/${news.id}">${news.titles}</a><cite style="font-size:12px; color:#808080; position:absolute; right:15px; top:0"><a href="/news/detail/${news.id}">${news.adddate}</a></cite></dd>
                   </c:if>
              	</c:forEach>
              	  <c:if  test="${fn:length(news)>6}">
                <dd style="padding: 0;margin: 0;"><a style="margin-left: 80%"  href="/news/listpage/1"><B>更多简报..</B></a></dd>
              </c:if>
            </dl>
          </div>
       </div>

    
     </div>
 </div>  
</div>
<script >

parent.changeheight(document.body.offsetHeight);
</script>

</body>
</html>


