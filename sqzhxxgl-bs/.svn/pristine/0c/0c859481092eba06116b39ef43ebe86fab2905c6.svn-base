<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
<script type="text/javascript" src="../../../zui/datepicker/WdatePicker.js"></script>
<title>添加</title>
</head>
<body>
				 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/news/list/1">公告管理</a> <span class="divider">/</span></li>
    <li class="active">添加公告</li><!--
    <li /zcdygk/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>

		<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>添加公告</strong> 公告管理
  </div>
	<div class="container">
	
	
	
		<form action="/news/add" method="post">
   
			<table>
				<tr>
					<th>标题：</th>
					<td><input width="80%"  style="width: 80%" name="titles" type="text"/>
					</td>
				</tr>
				<tr>
					<th>类型：</th>
					<td><select id="type" name="type">
					     <option value="政策法规">政策法规</option>
					     <option value="工作信息">工作信息</option>
					     <option value="通知公告">通知公告</option>
					     <option value="简报">简报</option>
					   </select>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td><textarea id="b_create_kindeditor" style="width:700px;height:350px;" cols="100" rows="10" name="texts" type="text" data-rule="required;" id="texts" ></textarea>
					</td>
				</tr>
			
				
					
					
				
				<tr>
					<th>&nbsp;</th>
					<td>		
				<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
				</tr>
			</table>
		</form>
	</div>
</div>

	<script src="/scripts/jquery.min.js"></script>
	<script src="/scripts/bootstrap.min.js"></script>
	<script src="/scripts/jquery.validator.min.js"></script>
		<script src="/scripts/business/tsjbzx.js"></script>
	<script src="/scripts/zh_CN.js"></script>
	
		<!--kindeditor插件-->
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>
	
	<script type="text/javascript">
$(document).ready(function(){
	
	//文本编辑器
	UE.getEditor('b_create_kindeditor');
	

	});

	parent.iFrameHeight();
	</script>
	<br>
</body>
</html>