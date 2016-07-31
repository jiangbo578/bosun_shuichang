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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/jksqgz/list/1">健康社区工作统计表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 健康社区工作统计表</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/jksqgz/item/add" method="post">
   
			<table>
		
			<th style="color: red;">健康日宣传活动</th>
				 <tr>
					<th>次数（次）：</th>
					<td><input type="text"  name="jkrcs" data-rule="required;number"  value="${jksqgz.jkrcs}"/>　
					</td>
				</tr>
				<tr>
					<th>参与人数（人）：</th>
					<td><input type="text"  name="jkrrs" data-rule="required;number"  value="${jksqgz.jkrrs}"/>　 
					</td>
				</tr>
				<tr>
					<th>发放宣传资料份数（份）：</th>
					<td><input type="text"  name="jkrfs" data-rule="required;number"  value="${jksqgz.jkrfs}"/> 
					</td>
				</tr>
				<tr>
					<th>发放支持性工具数量（个）：</th>
					<td><input type="text"  name="jkrsl" data-rule="required;number"  value="${jksqgz.jkrsl}"/>　
					</td>
				</tr>
				<th style="color: red;">落实工间操制度的单位</th>
				 <tr>
					<th>个数（个）：</th>
					<td><input type="text"  name="lsgs" data-rule="required;number"  value="${jksqgz.lsgs}"/> 
					</td>
				</tr>
				<tr>
					<th>职工数（人）：</th>
					<td><input type="text"  name="lszgs" data-rule="required;number"  value="${jksqgz.lszgs}"/>　
					</td>
				</tr>
				
				<th style="color: red;">开展控油控盐等合理膳食工作的单位食堂</th>
				 <tr>
					<th>单位数（个）：</th>
					<td><input type="text"  name="kzdws" data-rule="required;number"  value="${jksqgz.kzdws}"/> 
					</td>
				</tr>
				
				<tr>
					<th>职工数（人）：</th>
					<td><input type="text"  name="kzzgs" data-rule="required;number"  value="${jksqgz.kzzgs}"/>　 
					</td>
				</tr>
				<th style="color: red;">健康步道</th>
				 <tr>
					<th>新增条数（条）：</th>
					<td><input type="text"  name="jkts" data-rule="required;number"  value="${jksqgz.jkts}"/> 
					</td>
				</tr>
				
				<tr>
					<th>新增长度（米）：</th>
					<td><input type="text"  name="jkcd" data-rule="required;number"  value="${jksqgz.jkcd}"/>　
					</td>
				</tr>
				<tr>
					<th>健康步道总数（条）：</th>
					<td><input type="text"  name="jkzs" data-rule="required;number"  value="${jksqgz.jkzs}"/>　 
					</td>
				</tr>
				<tr>
					<th>健康步道总长（米）：</th>
					<td><input type="text"  name="jkzc" data-rule="required;number"  value="${jksqgz.jkzc}"/>　
					</td>
				</tr>
				<tr>
					<th>健身走活动（人次）：</th>
					<td><input type="text"  name="jkhd" data-rule="required;number"  value="${jksqgz.jkhd}"/>　
					</td>
				</tr>
				<th style="color: red;">健康讲座</th>
				 <tr>
					<th>次数（次）：</th>
					<td><input type="text"  name="jkjzcs" data-rule="required;number" value="${jksqgz.jkjzcs}" />　
					</td>
				</tr>
				
				<tr>
					<th>人数（人）：</th>
					<td><input type="text"  name="jkjzrs" data-rule="required;number"  value="${jksqgz.jkjzrs}"/> 
					</td>
				</tr>
				 <tr>
					<th>参与建设健康家庭（户）：</th>
					<td><input type="text"  name="jsjt" data-rule="required;number"  value="${jksqgz.jsjt}"/>　 
					</td>
				</tr>
				
				<tr>
					<th>参与建设健康单位数（个）：</th>
					<td><input type="text"  name="jsdws" data-rule="required;number" value="${jksqgz.jsdws}"/>　 
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
<script src="/scripts/business/jksqgz.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>