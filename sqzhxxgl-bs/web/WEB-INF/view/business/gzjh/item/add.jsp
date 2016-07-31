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
    <li><a href="/taizhang/list/1">会议活动</a> <span class="divider">/</span></li>
    <li><a href="/gzjh/list/1">工作计划</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 工作计划</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/gzjh/item/add" method="post">

			<table>
				<tr>
					<th>内容：</th>
					<td>
						<textarea name="nr" id="b_create_kindeditor"  style="width:700px;height:350px;"></textarea>
					</td>
				</tr>
				<tr>
					<th>类型：</th>
					<td><select id="type" name="type">
					   <option value="年度创建学习型社区工作计划">年度创建学习型社区工作计划</option>
					   <option value="科普年度工作计划">科普年度工作计划</option>
					   <option value="爱国卫生（健康村建设）工作计划">爱国卫生（健康村建设）工作计划</option>
					   <option value="残疾人协会年度工作计划">残疾人协会年度工作计划</option>
					   <option value="老龄工作年度工作计划">老龄工作年度工作计划</option>
					  <option value="党支部工作年度工作计划">党支部工作年度工作计划</option>
					   
					   </select>
					</td>
				</tr>
				<tr>
					<th>记录人：</th>
					<td><input name="jlr" type="text"  id="jlr" data-rule="required"/>
					</td>
				</tr>
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
	

<jsp:include page="/page/footer.jsp"></jsp:include>

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
</script>
</body>
</html>
