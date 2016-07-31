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
    <li><a href="/tsjbzx/list/1">嘉定区社会组织预警网络信息员登记表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 嘉定区社会组织预警网络信息员登记表</div>
  <div id="panbody">
	<div class="container">
		<form action="/warningnetworker/item/add" method="post">
			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>所属村（居）委：</th>
					<td><input name="cunwei" type="text" data-rule="required;length[1~20];"  />
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked" />男
					<input name="xb" type="radio" value="女" checked="checked" />女
					</td>
				</tr>
				<tr>
					<th>民族：</th>
					<td><input name="mz" type="text"  data-rule="required;length[1~10];"  />
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" data-rule="required;length[1~20];" />
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text"  data-rule="required;length[1~20];" />
					</td>
				</tr>
				<tr>
					<th>身份证号：</th>
					<td><input name="idcard" type="text" data-rule="required;ID_card" />
					</td>
				</tr>
				<tr>
					<th>工作单位：</th>
					<td><input name="workUnit" type="text"  data-rule="required;length[1~30];"  />
					</td>
				</tr>
				<tr>
					<th>住址：</th>
					<td><input name="jtzz" type="text"  data-rule="required;length[1~30];"  />
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="phone" type="text" data-rule="tel;" />
					</td>
				</tr>
				<tr>
					<th>手机：</th>
					<td><input name="mobile" type="text" data-rule="required;mobile" />
					</td>
				</tr>
				<tr>
					<th>电子邮箱：</th>
					<td><input name="email" type="text" data-rule="required;email" />
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