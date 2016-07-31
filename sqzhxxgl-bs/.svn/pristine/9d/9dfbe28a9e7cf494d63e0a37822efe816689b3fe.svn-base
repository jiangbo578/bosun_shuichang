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
    <li><a href="/cjrhd/list/1">参加残疾人睦邻点活动人员名册</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 参加残疾人睦邻点活动人员名册</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/cjrhd/item/add" method="post">

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
					<th>姓名：</th>
					<td><input name="name" type="text"   data-rule="required"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 
						<input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="birthday"/>
					</td>
				</tr>
				<tr>
					<th>户籍地址：</th>
					<td><input name="address" type="text" id="address" data-rule="required"/>
					</td>
				</tr>
				
				<tr>
					<th>残疾类别：</th>
					<td><select name="cjlb">
					     <option value="视力">视力</option>
					     <option value="听力">听力</option>
					     <option value="言语">言语</option>
					     <option value="智力">智力</option>
					     <option value="肢体">肢体</option>
					     <option value="精神">精神</option>
					     <option value="无业">无业</option>
					     <option value="重残无业">重残无业</option>
					   </select>
					</td>
				</tr>	
				
				<tr>
					<th>残疾证号：</th>
					<td><input name="cjzh" type="text" id="cjzh" data-rule="required"/>
					</td>
				</tr>	
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" />
			
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
