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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/rdjjfz/list/1">入党积极分子</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 入党积极分子</div>
  <div id="panbody">
	<div class="container">
		<form action="/rdjjfz/item/add" method="post">
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
					<td><input name="name" type="text"  id="name"  data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>民族：</th>
					<td><input name="mz" type="text"  id="mz"  data-rule="required;length[1~10];"/>
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="birthday"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text" id="whcd" data-rule="required"  data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>申请入党时间:</th>
					<td><input name="sqrdsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="sqrdsj"/>
					</td>
				</tr>
				<tr>
					<th>列为积极分子时间:</th>
					<td><input name="jjfzsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="jjfzsj"/>
					</td>
				</tr>
				<tr>
					<th>居住地址 ：</th>
					<td><input name="address" type="text" id="address"   data-rule="required;length[1~20];" ></input>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" id="remark" ></input>
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