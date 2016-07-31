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
    <li><a href="/tsjbzx/list/1">党费收支、使用情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong>党费收支、使用情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/dfszsyqk/item/add" method="post">
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
					<th>缴纳党费：</th>
					<td><input name="jndf" type="text"  id="jndf" data-rule="required:float;"/>
					</td>
				</tr>
				<tr>
					<th>党费返还 收入：</th>
					<td><input name="srdffh" type="text" id="srdffh" data-rule="required:float;"/>
					</td>
				</tr>
				<tr>
					<th>捐助 收入：</th>
					<td><input name="srjz" type="text"  id="srjz" data-rule="required:float;"/>
					</td>
				</tr>
				<tr>
					<th>上级下拔 收入：</th>
					<td><input name="srsjxb" type="text" id="srsjxb" data-rule="required:float;"/>
					</td>
				</tr>
				<tr>
					<th>党费返还：</th>
					<td><input name="zcdffh" type="text" id="zcdffh" data-rule="required:float;"/>
					</td>
				</tr>
				<tr>
					<th>捐助 ：</th>
					<td><input name="zcjz" type="text" id="zcjz" data-rule="required:float;"></input>
					</td>
				</tr>
				<tr>
					<th>上级下拔：</th>
					<td><input name="zcsjxb" type="text" id="zcsjxb" data-rule="required:float;"></input>
					</td>
				</tr>
				<tr>
					<th>可用党费累计数：</th>
					<td><input name="kydflj" type="text" id="kydflj" data-rule="required:float;"/>
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