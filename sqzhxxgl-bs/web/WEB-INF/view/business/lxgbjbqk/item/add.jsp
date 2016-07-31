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
    <li><a href="/lxgbjbqk/list/1">老干部工作</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 离休干部基本情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/lxgbjbqk/item/add" method="post" class="well">
			<table>
				<tr>
					<th>原单位名称：</th>
					<td><input name="oldWorkName" type="text"   data-rule="required;length[1~30];" ></input>
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text"   data-rule="required;chinese;length[1~4]"></input>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>
						<input name="xb" type="radio" value="男" checked="checked"/>男 
						<input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>住址：</th>
					<td><input name="jtzz" type="text"  data-rule="required;"  data-rule="required;length[1~30];" ></input>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text"   data-rule="required:mobile;"></input>
					</td>
				</tr>
				<tr>
					<th>亲属联系电话：</th>
					<td>
						<input type="text" name="kinsfolkPhone"  data-rule="required:mobile;"/> 
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="tag"   ></textarea>
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