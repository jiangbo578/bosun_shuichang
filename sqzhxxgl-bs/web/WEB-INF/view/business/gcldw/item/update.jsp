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
    <li><a href="/gcldw/list/1">共建、创建、联建单位名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>共建、创建、联建单位名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/gcldw/item/update" method="post">


			<table>
			
				<tr>
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
			
				<tr>
					<th>联系人：</th>
					<td><input name="lxr" type="text" data-rule="required;chinese;length[1~4]" id="lxr" value="${gcldw.lxr}"/>
					</td>
				</tr>
				<tr>
					<th>单位名称：</th>
					<td><input name="dwname" type="text" data-rule="required;length[1~20];" id="dwname" value="${gcldw.lxr}"/>
					</td>
				</tr>
					<tr>
					<th>地址：</th>
					<td><input name="address" type="text" id="address" data-rule="required;length[1~20];" value="${gcldw.address}"/>
					</td>
				</tr>
					<tr>
					<th>单位性质：</th>
					<td><input name="dwxz" type="text" id="dwxz" data-rule="required" value="${gcldw.dwxz}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required;" value="${gcldw.phone}"/>
					</td>
				</tr>
				<tr>
					<th>共建时间：</th>
					<td><input name="gjsj" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="gjsj"value="${gcldw.gjsj}" data-rule="required:date;"/>
					</td>
				</tr>
					<tr>
					<th>类别：</th>
					<td>
					<input name="type" type="radio" value="共建" checked="checked"/>共建 
					<input name="type" type="radio" value="创建" />创建
					<input name="type" type="radio" value="联建" />联建
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${gcldw.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script src="/scripts/business/gcldw.js"></script>
<script>
$(function() {
	$('input[name=type][type=radio][value=${gjsj.type}]').attr('checked', true);
});
</script>
</body>
</html>