<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页----嘉定区村居社会管理信息系统</title>
<meta name="keywords" content="嘉定区村居社会管理信息系统">
<link rel="stylesheet" type="text/css" href="/styles/css/home.css?a=2122222">
<script type="text/javascript" src="/styles/js/jquery.min.js"></script>
<script type="text/javascript" src="/styles/js/baes.js?a=22222221122222222"></script>

<script type="text/javascript">


$(function(){
setTimeout(iFrameHeight,1000)

})
  function iFrameHeight(){
	
var ifm= document.getElementById("win");
var subWeb = document.frames ? document.frames["win"].document:ifm.contentDocument;
if(ifm != null && subWeb != null) {
if(subWeb.body.scrollHeight!=null){
ifm.height = subWeb.body.scrollHeight;
}


  }
 setTimeout(iFrameHeight,1000)
}

function fnStartInit()
{
   if (document.getElementById("win").document.readyState=="complete")
   {
   var subWeb = document.frames ? document.frames["win"].document:ifm.contentDocument;
   changeheight(subWeb.body.clientHeight);
    //  iFrameHeight();
     // alert("框架文件加载完毕！");
   }
}
//跳转ifra1
function changepage(urladd){
	document.getElementById("win").src=urladd;
	iFrameHeight();
//	alert("hgj")

}
function changeheight(h){
 var ifm= document.getElementById("win");
var subWeb = document.frames ? document.frames["win"].document:ifm.contentDocument;
   if(ifm != null && subWeb != null) {

ifm.height = h;
}
}
</script>
</head>
<body style="min-width: 1224px">  
<!-- top begin -->
<%@include file="page/top.jsp" %>
<!-- top end -->
<!--headContent end of-->
<div class="warp">
 <div class="warpContent fl" >
     <!-- leftNav begin -->
     <%@include file="page/left.jsp" %>
     <!--leftNav end of-->
 		
     <div class="rightContent fl">
     <iframe width="100%"  scrolling="no" align="center" height="100%"  id="win" name="win"   onload="javascript:iFrameHeight();" frameborder="0"  src="/centent">
   </iframe>
  </div>
     <!--rightContent end of-->
 </div>  
 <!--warpContent end of-->
</div>
<!--warp end of-->
<%@include file="page/footer.jsp" %>
 <jsp:include page="/page/jbox.jsp"></jsp:include>
</body>
</html>


