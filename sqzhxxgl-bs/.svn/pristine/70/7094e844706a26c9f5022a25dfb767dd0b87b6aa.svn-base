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
      <li><a href="/zxjd/list/1">咨询接待记录</a> <span class="divider">/</span></li>
	 <li class="active">修改</li>
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>修改</strong>咨询接待记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<form action="/zxjd/update" method="post">

			<table>
					<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;chinese" id="name" value="${zxjd.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>日期：</th>
					<td><input name="rq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="rq" value="${zxjd.rq}"/>
					</td>
				</tr>
				<tr>
					<th>年龄：</th>
					<td><input name="age" type="text" data-rule="required;number" id="age" value="${zxjd.age}"/>
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="address" type="text" id="address" data-rule="required;" value="${zxjd.address}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required;" value="${zxjd.phone}"/>
					</td>
				</tr>
				<tr>
					<th>类别：</th>
					<td><input name="type" type="text" id="type" data-rule="required;" value="${zxjd.type}"/>
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td><input name="nr" type="text" id="nr" data-rule="required;" value="${zxjd.nr}"/>
					</td>
				</tr>
				<tr>
					<th>内容情况：</th>
					<td><textarea name="nrqk" style="width:200px;height:50px;" data-rule="required;">${zxjd.nrqk}</textarea>
					</td>
				</tr>
				<tr>
					<th>接待人：</th>
					<td><input name="jdr" type="text" id="jdr" data-rule="required;" value="${zxjd.jdr}"/>
					</td>
				</tr>
				<tr>
					<th>处理结果：</th>
					<td><textarea name="cljg" style="width:200px;height:50px;" data-rule="required;">${zxjd.cljg}</textarea>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
				
					<input type="hidden" name="id" value="${zxjd.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script>
		$(function() {
			$('input[name=sex][type=radio][value=${zxjd.sex}]').attr('checked', true);
		});
	</script>
</body>
</html>