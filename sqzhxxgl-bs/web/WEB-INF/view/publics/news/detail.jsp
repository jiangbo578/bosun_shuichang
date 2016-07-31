<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>


<title>添加</title>
</head>
<body>

		 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/news/listpage/1"></i>${news.type }</a> <span class="divider">/</span></li>


    <li class="active"><i class=' icon-bell'></i>${news.titles}</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
	<div class="container">

			<div  style="margin-left:30%;font-weight:bold ">	${news.titles} 时间:${news.adddate}</div> <br>
		<div  style="margin-left: 15px">	${news.texts} </div>
	
	
	
	</div>

	<jsp:include page="/page/footer.jsp"></jsp:include>
	

	<script type="text/javascript">

	parent.iFrameHeight();
	</script>
	<br>
</body>
</html>