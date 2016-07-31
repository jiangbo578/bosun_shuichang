<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<link rel="stylesheet" href="/styles/error/error404.css" type="text/css" />
<title>错误页面</title>  
</head>  
<body>  
	<%--200表示服务器成功返回网页，这样IE就不会把其当做错误而显示IE自定义的错误页面。 --%>
	<%  
	    response.setStatus(200);   
	%>  
	<div id="mainDiv">
		<div id="image404"></div>
		<div id="title404"></div>
		<div id="prompt">Try clicking on the navigation to find what you're after.</div>
	</div>
</body>  
</html>