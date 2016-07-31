<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link rel="stylesheet" href="/scripts/tab/tab.css" type="text/css"></link>
<jsp:include page="/page/footer.jsp"></jsp:include>
  </head>
  
  <body>
    This is my JSP page. <br>
    
    	<div class="tabbox" >
	<!-- ~~~~~~事件类型~~~~~~~~~~ -->
		<ul class="tabbtn">
			<li  class="current">
					<span style="width: 130px;" onclick="submitByBiz('01');">违规文字
					(<font color="#FF6600">
						990</font>)</span>
				</li>
					
			
			
		</ul>
		<!--tabbtn end-->
		<div class="tabcon" style="margin: 1px 12px 1px 10px;">
			<div style="width: 100%; margin: 10px 1px; border: 1px solid #CAE1FF; font-size: 12px;">
				<table class="table-condensed table-striped table-hover" align="center"
					style="width: 100%">
					
				</table>
			</div>
		</div>
	</div>
  </body>
</html>
