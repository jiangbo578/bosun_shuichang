<%@ page language="java" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/page/taglib.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页----嘉定区村居社会管理信息系统</title>
<meta name="keywords" content="嘉定区村居社会管理信息系统" />
<link rel="stylesheet" type="text/css" href="/styles/css/home.css" />
<script type="text/javascript" src="/styles/js/jquery.min.js"></script>
<script type="text/javascript" src="/styles/js/baes.js"></script>

<script type="text/javascript">
function chan(url)
{
	changepage(url);
	//$(window.parent.document).find("#cont").attr("src",url); 
	$("#inner").css("display","none");
	$("#out").css("display","block");
}

function iFrameHeight()
{
	var ifm= document.getElementById("win");
	var subWeb = document.frames ? document.frames["win"].document:ifm.contentDocument;
	if(ifm != null && subWeb != null) 
	{
		ifm.height = subWeb.body.scrollHeight+30;
	}
}
function changepage(urladd)
{
	document.getElementById("win").src=urladd;
	iFrameHeight();
}
function changeheight(h)
{
	var ifm= document.getElementById("win");
	var subWeb = document.frames ? document.frames["win"].document:ifm.contentDocument;
    if(ifm != null && subWeb != null) 
    {
		ifm.height = h;
    }
}

</script>
</head>
<body style="min-width: 1224px">  

<div class="head">
  <ul>
   <h1 class="fl">嘉定区村居社会管理信息系统</h1>
    <dl class="fr">
        <dd><a href="/" ><i class="icon-home"></i>首页</a>  |  </dd>
     <dd><a href="/taizhang/dztz" >电子台帐</a>  |  </dd>
     <dd><a href="/kpxt/main">600分评级</a>  |  </dd>
     <dd><a href="../split/main" >联系单</a>  |  </dd>
     <dd><a href="javascript:chan('/news/xcxt')">宣传系统</a>  |  </dd>

     <dd><a href="/logout">退出</a>| </dd>

        </dl>
  </ul>    
</div>

<!--head end of-->
<div class="headContent">
  <ul>
    <h2 class="logo fl"><a href="/index"></a></h2>
    <div class="nameList fl">
      <dl>
        <dd>用户名：${sessionScope.userRealName }</dd>
        <dd>单   位：${sessionScope.userOrgan.parent.name} -> ${sessionScope.userOrgan.name}</dd>
        <dd>角   色：${sessionScope.userRole}</dd>
      </dl>
    </div>
    <div class="nav fr">
       <dl>
 
  <shiro:hasAnyRoles name="ganshi">
  		  <dd style="padding-right: 100px"><a href="/taizhang/dztz" type="0"><img src="/styles/images/dztz.png"></img></a></dd>
         <dd style="padding-right: 100px"><a href="/kpxt/main" ><img src="<c:url value="/styles/images/cjpj.png" />"></img></a></dd>
         <dd style="padding-right: 100px"><a href="../split/main" ><img src="<c:url value="/styles/images/lxd.png" />" ></img></a></dd>
         <dd ><a href="javascript:chan('/news/xcxt')" ><img src="<c:url value="/styles/images/cxpt.png" />"></img></a></dd>
  
  </shiro:hasAnyRoles>
  
 
       
       </dl>
    </div>
  </ul>
</div>

<div class="warp">
 <div class="warpContent fl" >
 <!--关于左边变动的include -->
 <div id="inner" >
  <%@include file="left.jsp" %>
 </div>
<div id="out" style="display: none" >
  <%@include file="../page/left.jsp" %>
 </div>  
 <!-- include结束 -->
     <div class="rightContent fl">
     <iframe width="100%"  style="min-height: 400px" scrolling="no" align="center" height="100%" id="win" name="win"  onload="javascript:iFrameHeight();" frameborder="0"  src="/split/show" id="cont">
   </iframe>
  </div>
 </div>  
</div>
<%@include file="../page/footer.jsp" %>


</body>
</html>


