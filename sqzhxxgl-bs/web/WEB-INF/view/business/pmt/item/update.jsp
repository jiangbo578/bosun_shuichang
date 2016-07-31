<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>

<script type="text/javascript">

function loginfo()
{

	var pmt = {};
	pmt.bz = UE.getEditor('myEditor').getContent();
	pmt.jlr = $("#formId").val();
	pmt.mc = $("#pid").val();
	var json = JSON.stringify(pmt);
	
$.ajax({
	
	url:'/pmt/item/update',
	type:'POST',
	data : json,
	dataType : 'json',
	contentType : 'application/json;charset=UTF-8',
	success:function(obj)
	{
		console.log(obj!=null)
		if(null!=obj)
		{
			window.location.href = "../../1/"+$("#formId").val();
		}
	}
});
}
</script>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/pmt/list/1">辖区内小区平面图</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>辖区内小区平面图</div>
  <div id="panbody">
	<div class="container">
		<textarea rows=""  name="myEditor"  id="myEditor" cols="">${pmt.bz}</textarea>
			<table>
					
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="button"  onclick="javascript:loginfo()"  ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" id="formId">
					<input type="hidden" name="id" value="${pmt.id}" id="pid">
					</td>
				</tr>
			</table>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
		<!--kindeditor插件-->
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>
<script>
$(document).ready(function(){

	UE.getEditor('myEditor');

	});
$(function() {
			$('input[name=xb][type=radio][value=${jwcwjd.xb}]').attr('checked', true);
		});
</script>
</body>
</html>