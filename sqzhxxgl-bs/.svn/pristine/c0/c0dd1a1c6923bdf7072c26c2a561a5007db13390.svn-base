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
    <li><a href="/taizhang/list/2">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/jdkhqk/list/1">季度考核情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 季度考核情况</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/jdkhqk/item/add" method="post">
   
			<table>
		
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr>
				<tr>
					<th>季度：</th>
					<td><select name="jd">
					  <option value="第一季度">第一季度</option>
					  <option value="第二季度">第二季度</option>
					  <option value="第三季度">第三季度</option>
					  <option value="第四季度">第四季度</option>
					</select>
					</td>
				</tr>
			<tr>
					<th>镇（街道）社区学校考核意见：</th>
					<td><input name="nr" type="text"  data-rule="required;" />
					</td>
				</tr>
					<tr>
					<th>填表人：</th>
					<td><input name="tbr" type="text"  data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>日期：</th>
					<td><input name="rq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
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
</body>
</html>