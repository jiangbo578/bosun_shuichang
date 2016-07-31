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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/tyssdj/list/1">上海市社区公共体育设施各类人员登记表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 上海市社区公共体育设施各类人员登记表</div>
  <div id="panbody">
	<div class="container">
		<form action="/tyssdj/item/update" method="post">

			<table>
				
				
				<tr>
					<th>人员类别：</th>
					<td>	<input name="rylb" type="radio" value="巡视" checked="checked"/>巡视
							<input name="rylb" type="radio" value="维修" />维修
							<input name="rylb" type="radio" value="指导" />指导
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;" value="${tyssdj.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男
						<input name="sex" type="radio" value="女" />女
							
					</td>
				</tr>
				<tr>
					<th>人员性质：</th>
					<td>	<input name="ryxz" type="radio" value="专职" checked="checked"/>专职
							<input name="ryxz" type="radio" value="兼职" />兼职
							<input name="ryxz" type="radio" value="聘用" />聘用
							<input name="ryxz" type="radio" value="志愿者" />志愿者
					</td>
				</tr>
				<tr>
					<th>座机：</th>
					<td><input name="tel" type="text"  value="${tyssdj.tel}"/>
					</td>
				</tr>
				<tr>
					<th>手机：</th>
					<td><input name="phone" type="text" value="${tyssdj.phone}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${tyssdj.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
 <script src="/scripts/business/tyssdj.js"></script> 
<jsp:include page="/page/footer.jsp"></jsp:include>
<script>
		$(function() {
			$('input[name=rylb][type=radio][value=${tyssdj.rylb}]').attr('checked', true);
			$('input[name=sex][type=radio][value=${tyssdj.sex}]').attr('checked', true);
			$('input[name=ryxz][type=radio][value=${tyssdj.ryxz}]').attr('checked', true);
		});
	</script>
</body>
</html>