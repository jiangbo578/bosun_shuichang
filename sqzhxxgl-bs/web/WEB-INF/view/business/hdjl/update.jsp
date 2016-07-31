<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
<li><a href="/hdjl/list/1">活动记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
      <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>修改</strong> 活动记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<form action="/hdjl/update" method="post">

			<table>
				<tr>
					<th>时间：</th>
					<td><input name="sj" type="text" data-rule="required;" onClick="WdatePicker()" class="Wdate" value="${hdjl.sj}"/>
					</td>
					<th>地点：</th>
					<td><input name="address" type="text" data-rule="required;" value="${hdjl.address}"/>
					</td>
				</tr>
				<tr>
					<th>参加人数：</th>
					<td><input name="cjrs" type="text" data-rule="required;number" value="${hdjl.cjrs}"/>
					</td>
					<th>负责人：</th>
					<td><input name="fzr" type="text" data-rule="required;" value="${hdjl.fzr}"/>
					</td>
				</tr>
				<tr>
					<th>参加对象：</th>
					<td><input name="cjdx" type="text" data-rule="required;" style="width: 300px" value="${hdjl.cjdx}"/>
					</td>
					
				</tr>
				<tr>
				<th>会议类型:</th>
				<td> <input type="checkbox" value="消防安全网格化管理活动" name="type" id="type"/> 消防安全网格化管理活动
				     <input type="checkbox" value="社区民防" name="type" id="type"/> 社区民防
				     <input type="checkbox" value="科普活动" name="type" id="type"/> 科普活动
				     <input type="checkbox" value="科普活动掠影" name="type"id="type"/> 科普活动掠影
				     <input type="checkbox" value="红十字服务站活动" name="type" id="type"/> 红十字服务站活动
				    
				      
				 </td>
				</tr>
				<tr>
				 <th></th>
				 <td> <input type="checkbox" value="爱国卫生" name="type" id="type"/> 爱国卫生
				     <input type="checkbox" value="老龄工作" name="type" id="type"/> 老龄工作
				     <input type="checkbox" value="残疾人协会" name="type" id="type"/> 残疾人协会
				     <input type="checkbox" value="残疾人参与社区活动" name="type" id="type"/> 残疾人参与社区活动
				     <input type="checkbox" value="双拥工作活动激励" name="type" id="type"/>双拥工作活动激励
				    </td>
				</tr>
				<tr>
				<th></th>
				<td> <input type="checkbox" value="社区(家庭)文明建设活动" name="type" id="type"/>社区(家庭)文明建设活动
				     <input type="checkbox" value="居委会重大活动" name="type" id="type"/>居委会重大活动
				     <input type="checkbox" value="村委会重大活动" name="type" id="type"/>村委会重大活动</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td colspan="3">
						<textarea name="nr" id="b_create_kindeditor" style="width:700px;height:350px;">${hdjl.nr}</textarea>
					</td>
				</tr>
				<tr>
					<th>记录人：</th>
					<td><input name="jlr" type="text"  id="jlr" data-rule="required" value="${hdjl.jlr}"/>
					</td>
				</tr>
			
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${hdjl.id}">
					<input type="hidden" value="${hdjl.type}" id="lb">
					</td>
				</tr>
			</table>
		</form>
	</div>

</div></div>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>

<script type="text/javascript">
var lb=$("#lb").val();
var str=lb.split(",");
//alert(str)
for(var i=0;i<str.length;i++){
	$("input:checkbox[value='"+str[i]+"']").attr('checked','true');
}
$(document).ready(function(){
	
	//文本编辑器
	UE.getEditor('b_create_kindeditor');
	

	});
</script>
</body>
</html>