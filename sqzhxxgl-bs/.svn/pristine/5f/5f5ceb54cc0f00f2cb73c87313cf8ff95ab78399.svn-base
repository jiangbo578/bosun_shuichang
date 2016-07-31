<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script charset="utf-8" src="/zui/kindeditor/kindeditor-min.js"></script>
<script charset="utf-8" src="/zui/kindeditor/lang/zh_CN.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>

<script type="text/javascript">
</script>
<title>单条信息</title>

</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">详情</li>
  </ul>
<input type="hidden" id="pid" value="${objid}" >
<input type="hidden" id="objid" value="${split.pid }" >
<input type="hidden" id="orgId"  value="${sessionScope.userOrgan.id }" >
<input type="hidden" id="orgName"  value="${sessionScope.userOrgan.name }" >
<input type="hidden" id="role"  value="${sessionScope.userRole }" >
<input type="hidden" id="parentOrgId" value="${sessionScope.userOrgan.parent.id }" >
<div class="mianpan">
<div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>详情</strong></div>
<div id="panbody">
<div id="info" >
<input type="hidden" id="parentOrgId" value="${split.streetId }" >
<input type="hidden" id="wb" value="${split.wbj }"style="width:300px" >
<a class="btn" style="float:left;" onclick="window.history.go(-1)" > <i class="icon-arrow-left"></i>&nbsp;返&nbsp;回&nbsp;</a>
<div style="height: 30px" ></div>
<h3 style="text-align: center;">村居社会管理工作联系单</h3>
	<div style="text-align:left:;" align="center">
	<h4>（
		<input type="hidden" id="street" name="street"  style="width: 60px" readOnly value="${sessionScope.userOrgan.parent.name}" />
		<span>${split.street}-</span>
		<span id="spanyear">${ split.year}-</span>
		年&nbsp;第 
        <span id="spannum">${split.num }</span>&nbsp;&nbsp;号&nbsp;）
    </h4>
	<br>
	<div style="text-align: left;">
       部门： <b>${split.wbj }</b>
       <br><br>兹于&nbsp;&nbsp;<b>${split.eventDate }</b>&nbsp;&nbsp;在
             	  <b>${split.address }</b> &nbsp;&nbsp;(地点)发现
             	  <b>${split.event }</b>&nbsp;&nbsp;事件<br><br>
       <div class="alert alert-info" style="margin-bottom: 2px;text-align: left">
      	 <i class=' icon-bell'></i> 特告知贵单位，请及时依法处置，我单位将配合相关工作。具体情况告知如下：
	  </div>
	  <br>
       <b >${split.content}</b>
      </div>
       <div style="text-align: right;" >
	         <b>${split.street}</b> &nbsp;&nbsp;<b>${split.committee}</b>&nbsp;&nbsp;
	         <br>
	        日期: <b>${split.date }</b>&nbsp;&nbsp;
	   </div>
      <br>
	</div>
</div>
</div>
</div>
</body>
</html>