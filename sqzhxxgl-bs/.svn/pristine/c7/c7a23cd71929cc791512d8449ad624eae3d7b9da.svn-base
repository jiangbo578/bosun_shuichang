<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/lzz/list/1">楼组长</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>楼组长</div>
  <div id="panbody">
	<div class="container">
		<form action="/lzz/item/update" method="post">

			<table>
				<tr>
					<th>楼号：</th>
					<td><input name="lh" type="text" data-rule="required;" value="${lzz.lh}"/>
					</td>
				</tr>
				<tr>
					<th>户楼：</th>
					<td><input name="hl" type="text" data-rule="required;" value="${lzz.hl}"/>
					</td>
				</tr>
				<tr>
					<th>组长姓名：</th>
					<td><input name="zzname" type="text" data-rule="required;" value="${lzz.zzname}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;" onClick="WdatePicker()" value="<fmt:formatDate value="${lzz.birthday}" pattern="yyyy-MM-dd"/>" class="Wdate"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="status" type="text" data-rule="required;" value="${lzz.status}"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="address" type="text" data-rule="required;" value="${lzz.address}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;" value="${lzz.phone}"/>
					</td>
				</tr>
				<tr>
					<th>居委分管干部：</th>
					<td><input name="jwfggb" type="text" data-rule="required;"  value="${lzz.jwfggb}"/>
					</td>
				</tr>
				
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${lzz.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>

</body>
</html>