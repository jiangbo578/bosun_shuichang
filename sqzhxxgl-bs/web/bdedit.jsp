<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" charset="utf-8" src="./scripts/jquery.min.js"></script>

 <link id="skin" rel="stylesheet" href="./zui/jBox/Skins/Default/jbox.css" />
    <script type="text/javascript" src="./zui/jBox/jquery.jBox-2.3.min.js"></script>
    <script type="text/javascript" src="./zui/jBox/i18n/jquery.jBox-zh-CN.js"></script>



<script type="text/javascript" charset="utf-8" src="./zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="./zui/ueditor/ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="./zui/ueditor/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	//文本编辑器
	UE.getEditor('description');
	

	});
	
	function show(){
	$.jBox("iframe:/user/1", {
    title: "用户管理",
    width: 800,
    height: 350,
    buttons: { '关闭': true }
});
	}
</script>
</head>
<body>
<textarea rows="" id="description" cols=""></textarea>
<button onclick="show()">11111</button>
<%=request.getParameter("code") %>
 <form action="bdedit.jsp" method="post" id="downdoc">
		
			 <input type="text"   id="startDate" class="Wdate"    name="startdate"></td>
	
			<input type="text" id="endDate" class="Wdate"  name="enddate"/></td>
				<input type="text" name='code' id="dd" />

		 <input type="submit" value="Submit" /></form>  
	 </form>

</body>
</html>