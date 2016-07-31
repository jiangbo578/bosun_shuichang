<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="/scripts/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript" >
	$.ajax({
		url:'/json/user',
		type:'GET',
		success:function(obj)
		{
			alert(obj);
		}
	})
	var user = {};
	user.username = "test";
	user.pwd = "pwd";
	var json = JSON.stringify(liasion);
	$.ajax({
		url:'json/insert',
		type:'POST',
		data : json,
		dataType : 'json',
		contentType : 'application/json;charset=UTF-8',
		success:function(obj)
		{
			
		}
	})
</script>
</head>
<body>

</body>
</html>