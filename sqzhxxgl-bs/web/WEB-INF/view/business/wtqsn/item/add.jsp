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
    <li><a href="/wtqsn/list/1">问题青少年信息统计表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong>问题青少年信息统计表</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/wtqsn/item/add" method="post">

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
						<th>名称</th>
						<th>本市户籍(人数)</th>
						<th style="padding-left: 70px">非本市户籍人数(人数)</th>
						<th style="padding-left: 120px">备注</th>
						</tr>
						<tr>
						<th>有不良行为或严重不良行为青少年</th>
						<td style="padding-left: 40px"><input type="text"  id="ahj" name="ahj" data-rule="required;digits;" style="width: 50px"/></td>
						<td style="padding-left: 70px"><input type="text"  id="afhj" name="afhj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="abz" name="abz" ></td>
						</tr>
						<tr>
						<th>4-25周岁闲散青少年</th>
						<td style="padding-left: 40px"><input type="text"  id="bhj" name="bhj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="bfhj" name="bfhj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="bbz" name="bbz" ></td>
						</tr>
						<tr>
						<th>流浪乞讨未成年人</th>
						<td style="padding-left: 40px"><input type="text"  id="chj" name="chj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="cfhj" name="cfhj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="cbz" name="cbz" ></td>
						</tr>
						<tr>
						<th>服刑人员未成年子女</th>
						<td style="padding-left: 40px"><input type="text"  id="dhj" name="dhj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="dfhj" name="dfhj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="dbz" name="dbz" ></td>
						</tr>
						<tr>
						<th>农村留守儿童</th>
						<td style="padding-left: 40px"><input type="text"  id="ehj" name="ehj"  data-rule="required;digits;"style="width: 50px" ></td>
						<td style="padding-left: 70px"><input type="text"  id="efhj" name="efhj" data-rule="required;digits;" style="width: 50px"></td>
						<td style="padding-left: 70px"><input type="text"  id="ebz" name="ebz" ></td>
						</tr>
						<tr  style="height: 20px">
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
