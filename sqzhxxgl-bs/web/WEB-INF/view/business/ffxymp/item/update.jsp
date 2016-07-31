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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/ffxymp/list/1">非法行医情况排摸信息表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 非法行医情况排摸信息表</div>
  <div id="panbody">
	<div class="container">
		<form action="/ffxymp/item/update" method="post">

			<table>
			
				<tr>
					<th>村（居）委：</th>
					<td><input name="cwh" type="text" data-rule="required;" value="${ffxymp.cwh}"/>
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="dz" type="text" data-rule="required;" value="${ffxymp.dz}"/></td>
				</tr>
				<tr>
					<th>房屋性质：</th>
					<td><input name="fwxz" type="text" data-rule="required;" value="${ffxymp.fwxz}"/></td>
				</tr>
				
				<tr>
					<th>行医人姓名：</th>
					<td><input name="xyrxm" type="text" data-rule="required;chinese;length[1~4]" value="${ffxymp.xyrxm}"/>
					</td>
				</tr>
				<tr>
					<th>行医人身份证号：</th>
					<td><input name="xyrsfz" type="text" data-rule="required;ID_card;" value="${ffxymp.xyrsfz}"/>
					</td>
				</tr>
				<tr>
					<th>行医内容：</th>
					<td><input type="text" name="xynr"   value="${ffxymp.xynr}"/>
					</td>
				</tr>
				<tr>
					<th>行医标志：</th>
					<td><input type="text" name="xybz"  data-rule="required;" value="${ffxymp.xybz}"/>
					</td>
				</tr>
				<tr>
					<th>房东姓名：</th>
					<td><input name="fdxm" type="text" data-rule="required;chinese;length[1~4]" value="${ffxymp.fdxm}"/>
					</td>
				</tr>
				<tr>
					<th>排摸人姓名：</th>
					<td><input name="mprxm" type="text" data-rule="required;chinese;length[1~4]" value="${ffxymp.mprxm}"/>
					</td>
				</tr>
				<tr>
					<th>日期：</th>
					<td><input name="rq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="sj" value="${ffxymp.rq}"/>
					</td>
				</tr>
				<tr>
					<th>是否新增：</th>
					<td><input name="sfxz" type="radio" value="是" checked="checked"/>是
					    <input name="sfxz" type="radio" value="否" />否
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${ffxymp.id}">
					<input type="hidden" name="ffxympid" value="${ffxympid}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script type="text/javascript">
	
	$(function() {
		$('input[name=sfxz][type=radio][value=${ffxymp.sfxz}]').attr('checked', true);
			});
	</script>
</body>
</html>