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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/lxfwqzzf/list/1">联系服务群众走访团队名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 联系服务群众走访团队名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/lxfwqzzf/item/update" method="post">
			<table>
							<tr>
					<th>责任区：</th>
					<td><input type="text" name="zrq" data-rule="required;length[1~20];" value="${lxfwqzzf.zrq}"/>
					</td>
					<th style="padding-left: 80px">总户数：</th>
					<td><input type="text" name="zhs" data-rule="required;number;" value="${lxfwqzzf.zhs}"/></td>
				</tr>
				<tr>
					<th>门牌号码：</th>
					<td><input type="text" name="mphh" data-rule="required;length[1~20];" value="${lxfwqzzf.mphh}"/>
					</td>
					<th style="padding-left: 80px">责任人姓名：</th>
					<td><input type="text" name="xm" data-rule="required;chinese;length[1~4]" value="${lxfwqzzf.xm}"/></td>
				</tr>
			<tr>
					<th>责任人职务：</th>
					<td><input type="text"  name="zw" data-rule="required;length[1~20];" value="${lxfwqzzf.zw}"/>
					</td>
					<th style="padding-left: 80px">责任人联系方式：</th>
					<td><input type="text" name="lxfs"   data-rule="required:mobile;" value="${lxfwqzzf.lxfs}"/></td>
				</tr>
				<tr>
					<th>责任人备注：</th>
					<td><input type="text" name="bz"  value="${lxfwqzzf.bz}"/>
					</td>
				
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${lxfwqzzf.id}">
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