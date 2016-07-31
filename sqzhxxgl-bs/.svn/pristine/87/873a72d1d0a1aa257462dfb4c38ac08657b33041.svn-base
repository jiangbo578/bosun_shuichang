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
    <li><a href="/fcbkjd/list/1">党员干部扶残帮困结对记录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 党员干部扶残帮困结对记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/fcbkjd/item/add" method="post">
			<table>
			
				<tr>
					<th>党员干部姓名：</th>
					<td><input name="gbxm" type="text"  id="name" data-rule="required"/>
					</td>
				</tr>
				<tr>
					<th>职务：</th>
					<td><input name="role" type="text"  id="name" data-rule="required"/>
					</td>
				</tr>
				<tr>
					<th>结对时间：</th>
					<td><input name="jdsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="jdsj"/>
					</td>
				</tr>
				<tr>
					<th>结对对象姓名：</th>
					<td><input name="jdxm" type="text" id="dwtr" data-rule="required"/>
					</td>
				</tr>
				<tr>
					<th>残疾类别：</th>
					<td><select name="cjlb" id="cjlb">  
					    <option value='视力'>视力</option> 
					    <option value='听力'>听力</option> 
					    <option value='言语'>言语</option> 
					    <option value='智力'>智力</option>
					    <option value='肢体'>肢体</option>
					    <option value='精神'>精神</option>
					    <option value='无业'>无业</option>
					    <option value='重残无业'>重残无业</option>
					    </select>
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
					<input type="hidden" name="fcbkjdid" value="${fcbkjdid}" />
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>