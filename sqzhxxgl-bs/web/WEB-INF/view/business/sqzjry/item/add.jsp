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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/sqzjry/list/1">曾获市、区、镇、街道荣誉</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong>曾获市、区、镇、街道荣誉</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/sqzjry/item/add" method="post">

			<table>
				<!-- <tr>
					<th>搜索，请输入姓名或身份证号码：</th>
					<td><input type="text" id="b_search"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr> 
				-->
				<tr>
					<th>荣誉名称：</th>
					<td><input name="ryname" type="text"  data-rule="required;length[1~50];" id="ryname"/>
					</td>
				</tr>
				<tr>
					<th>获奖时间：</th>
					<td><input name="hjdate" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="hjdate" data-rule="required;date"/>
					</td>
				</tr>
				<tr>
					<th>获奖者：</th>
					<td><input name="hjz" type="text" data-rule="required;chinese;length[1~4]" id="hjz" />
					</td>
				</tr>
				<tr>
					<th>颁奖单位：</th>
					<td><input name="bjdw" type="text"  data-rule="required;length[1~50];" id="bjdw" />
					</td>
				</tr>
					<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" id="remark" />
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
