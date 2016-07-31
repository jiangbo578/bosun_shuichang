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
    <li><a href="/bgfyzc/list/1">不规范生猪养殖场（户）整治推进情况统计</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 不规范生猪养殖场（户）整治推进情况统计</div>
  <div id="panbody">
	<div class="container">
		<form action="/bgfyzc/item/update" method="post">

			<table>
				<tr>
					<th>养殖户：</th>
					<td><input name="yzh" type="text" data-rule="required;" value="${bgfyzc.yzh}"/>
					</td>
				</tr>
				<tr>
					<th>新 增：</th>
					<td><input name="xz" type="radio" value="是" checked="checked"/>是
					    <input name="xz" type="radio" value="否" />否</td>
				</tr>
				<tr>
					<th>是否外来户：</th>
					<td><input name="wlh" type="radio" value="是" checked="checked"/>是
					    <input name="wlh" type="radio" value="否" />否</td>
				</tr>
				
				<tr>
					<th>是否使用泔水：</th>
					<td><input name="gs" type="radio" value="是" checked="checked"/>是
					    <input name="gs" type="radio" value="否" />否
					</td>
				</tr>
				<tr>
					<th>否列入今年整治计划：</th>
					<td>
					    <input name="jhzzs" type="radio" value="是" checked="checked"/>是
					    <input name="jhzzs" type="radio" value="否" />否</td>
					</td>
				</tr>
			<!-- 	<tr>
					<th>新增需整治数：</th>
					<td><input name="xzxqzz" type="text" data-rule="required;" />
					</td>
				</tr> -->
				<tr>
					<th>整治情况：</th>
					<td>
					    <input name="yzzs" type="radio" value="是" checked="checked"/>是
					    <input name="yzzs" type="radio" value="否" />否</td>
					</td>
				</tr>
				<tr>
					<th>养殖地点：</th>
					<td><input name="yzdd" type="text" data-rule="required;" value="${bgfyzc.yzdd}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input type="text" name="phone"  data-rule="required;;" value="${bgfyzc.phone}"/>
					</td>
				</tr>
				<tr>
					<th>公猪：</th>
					<td><input type="text" name="gz"  data-rule="required;digits;" value="${bgfyzc.gz}"/>
					</td>
				</tr>
				<tr>
					<th>母猪：</th>
					<td><input name="mz" type="text" data-rule="required;digits;" value="${bgfyzc.mz}"/>
					</td>
				</tr>
				<tr>
					<th>商品肉猪：</th>
					<td><input name="sprz" type="text" data-rule="required;digits;"  value="${bgfyzc.sprz}"/>
					</td>
				</tr>
				
			
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${bgfyzc.id}">
					<input type="hidden" name="bgfyzcbtid" value="${bgfyzcbtid}">
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
		$('input[name=xz][type=radio][value=${bgfyzc.xz}]').attr('checked', true);
		$('input[name=wlh][type=radio][value=${bgfyzc.wlh}]').attr('checked', true);
		$('input[name=gs][type=radio][value=${bgfyzc.gs}]').attr('checked', true);
		$('input[name=jhzzs][type=radio][value=${bgfyzc.jhzzs}]').attr('checked', true);
		$('input[name=yzzs][type=radio][value=${bgfyzc.yzzs}]').attr('checked', true);
			});
	</script>
</body>
</html>