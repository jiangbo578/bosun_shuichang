<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
  <ul class="breadcrumb" style="margin-bottom: 5px;">
    <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
    <li><a href="/hyjl/list/1">会议记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 会议记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/hyjl/item/update" method="post">

			<table>
			<tr>
					<th>标题：</th>
					<td><input name="name" type="text" data-rule="required;" id="name" style="width: 300px" value="${hyjl.name }"/>
					</td>
				</tr>
			<%--<tr>
					<th>会议类别：</th>
					<td>
					<select name="hylb" id="hylb">
					    <option value="爱国卫生（健康村建设）会议记录">爱国卫生（健康村建设）会议记录</option>
					    <option value="社区求助评议工作小组">社区求助评议工作小组</option>
					    <option value="老龄工作会议记录">老龄工作会议记录</option>
					    <option value="残疾人协会会议记录">残疾人协会会议记录</option>
					    <option value="党群工作会议记录">党群工作会议记录</option>
					    <option value="统战工作会议记录">统战工作会议记录</option>
					    <option value="全体村民会议记录">全体村民会议记录</option>
					    <option value="户代表会议记录">户代表会议记录</option>
					    <option value="村民代表会议记录">村民代表会议记录</option>
					    <option value="村民小组长会议记录">村民小组长会议记录</option>
					    <option value="居委会例会记录">居委会例会记录</option>
					    <option value="居民小组长会议记录">居民小组长会议记录</option>
					    <option value="居委会成员（社工）碰头会议记录">居委会成员（社工）碰头会议记录</option>
					    <option value="居民代表会议记录">居民代表会议记录</option>
					    <option value="居民座谈会记录">居民座谈会记录</option>
					   
					</select>
					</td>
				</tr>
				--%>
				<tr>
					<th>会议类别：</th>
					<td>
					   <input type="checkbox" value="爱国卫生（健康村建设）会议记录" name="hylb" id="hylb">爱国卫生（健康村建设）会议记录
					   <input type="checkbox" value="社区求助评议工作小组" name="hylb" id="hylb">社区求助评议工作小组
					   <input type="checkbox" value="老龄工作会议记录" name="hylb" id="hylb">老龄工作会议记录
					   <input type="checkbox" value="残疾人协会会议记录" name="hylb" id="hylb">残疾人协会会议记录
					   <input type="checkbox" value="党群工作会议记录" name="hylb" id="hylb">党群工作会议记录					  										
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
					  <input type="checkbox" value="户代表会议记录" name="hylb" id="hylb">户代表会议记录 
					   <input type="checkbox" value="村民代表会议记录" name="hylb" id="hylb">村民代表会议记录
					   <input type="checkbox" value="村民小组长会议记录" name="hylb" id="hylb">村民小组长会议记录
					   <input type="checkbox" value="居委会例会记录" name="hylb" id="hylb">居委会例会记录
					   <input type="checkbox" value="居民小组长会议记录" name="hylb" id="hylb">居民小组长会议记录
					    <input type="checkbox" value="全体村民会议记录" name="hylb" id="hylb">全体村民会议记录
					  
					</td>
				</tr>
				<tr>
					<th></th>
					<td>
					  <input type="checkbox" value="居委会成员（社工）碰头会议记录" name="hylb" id="hylb">居委会成员（社工）碰头会议记录
					   <input type="checkbox" value="居民代表会议记录" name="hylb" id="hylb">居民代表会议记录
					   <input type="checkbox" value="居民座谈会记录" name="hylb" id="hylb">居民座谈会记录
					    <input type="checkbox" value="统战工作会议记录" name="hylb" id="hylb">统战工作会议记录
					</td>
				</tr><tr>
					<th>会议日期：</th>
					<td><input name="sj" type="text"  value="${hyjl.sj }"
						onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>地点：</th>
					<td><input name="dd" type="text" value="${hyjl.dd }"/>
					</td>
				</tr>
				<tr>
					<th>主持人：</th>
					<td><input name="zcr" type="text" value="${hyjl.zcr }"/>
					</td>
				</tr>
				<tr>
					<th>参加对象：</th>
					<td><input name="cjdx" type="text" value="${hyjl.cjdx }"/>
					</td>
				</tr>
				<tr>
					<th>参加人数：</th>
					<td><input name="rs" type="text" data-rule="required;number" value="${hyjl.rs }"/>
					</td>
				</tr>
				<tr>
					<th>会议议题：</th>
					<td><input name="hyyt" type="text" value="${hyjl.hyyt }"/>
					</td>
				</tr>
				<tr>
					<th>记录人：</th>
					<td><input name="jlr" type="text" value="${hyjl.jlr }"/>
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td>
						<textarea name="nr" id="b_update_kindeditor" style="width:700px;height:350px;">${hyjl.nr }</textarea>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${hyjl.id}">
					<input type="hidden" id="lb" value="${hyjl.hylb}">
					</td>
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
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js" ></script>
<script type="text/javascript">
var lb=$("#lb").val();
var str=lb.split(",");
//alert(str)
for(var i=0;i<str.length;i++){
	$("input:checkbox[value='"+str[i]+"']").attr('checked','true');
}
</script> 
	<script>
	
	//$("#hylb option[value='${hyjl.hylb}']").attr("selected", true);
	
	$(document).ready(function(){	
		//文本编辑器
		UE.getEditor('b_update_kindeditor');
		
		});
	</script>
</body>
</html>