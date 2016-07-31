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
    <li><a href="/zcdygk/list/1">在册党员概况及名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 在册党员概况及名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/zcdygk/item/head/update" method="post">

			<table>
				<tr>
					<th>截至时间：</th>
					<td><input type="text" name="jzsj" data-rule="required;date" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${zcdy.jzsj}"/>
					</td>
					<th style="padding-left: 80px">党员总数：</th>
					<td><input type="text" name="dyzs" data-rule="required;number" value="${zcdy.dyzs}"/></td>
				</tr>
				
				<tr>
					<th>正式党员：</th>
					<td><input type="text" name="zsdy" data-rule="required;number" value="${zcdy.zsdy}"/>
					</td>
					<th style="padding-left: 80px">预备党员：</th>
					<td><input type="text" name="ybdy" data-rule="required;number" value="${zcdy.ybdy}"/></td>
				</tr>
				<tr>
					<th>退休：</th>
					<td><input type="text" name="tx" data-rule="required;number" value="${zcdy.tx}"/>
					</td>
					<th style="padding-left: 80px">在职：</th>
					<td><input type="text" name="zz" data-rule="required;number" value="${zcdy.zz}"/></td>
				</tr>
				<tr>
					<th>男党员：</th>
					<td><input type="text" name="ndy" data-rule="required;number" value="${zcdy.ndy}"/>
					</td>
					<th style="padding-left: 80px">女党员：</th>
					<td><input type="text" name="nvdy" data-rule="required;number" value="${zcdy.nvdy}"/></td>
				</tr>
				<tr>
					<th>25岁以下党员：</th>
					<td><input type="text" name="ew" data-rule="required;number" value="${zcdy.ew}"/>
					</td>
					<th style="padding-left: 80px">26-54岁党员：</th>
					<td><input type="text" name="ws" data-rule="required;number" value="${zcdy.ws}"/></td>
				</tr>
				<tr>
					<th>55-59岁党员：</th>
					<td><input type="text" name="wj" data-rule="required;number" value="${zcdy.wj}"/>
					</td>
					<th style="padding-left: 80px">60—69岁党员：</th>
					<td><input type="text" name="lj" data-rule="required;number" value="${zcdy.lj}"/></td>
				</tr>
				<tr>
					<th>70—80岁党员：</th>
					<td><input type="text" name="bs" data-rule="required;number" value="${zcdy.bs}"/>
					</td>
					<th style="padding-left: 80px">80岁以上党员：</th>
					<td><input type="text" name="bsys" data-rule="required;number" value="${zcdy.bsys}"/></td>
				</tr>
				<tr>
					<th>初中及以下：</th>
					<td><input type="text" name="cz" data-rule="required;number" value="${zcdy.cz }"/>
					</td>
					<th style="padding-left: 80px">高中/中专/职高：</th>
					<td><input type="text" name="gz" data-rule="required;number" value="${zcdy.gz}"/></td>
				</tr>
				<tr>
					<th>大学及以上：</th>
					<td><input type="text" name="dx" data-rule="required;number" value="${zcdy.dx}"/>
					</td>
					<th style="padding-left: 80px">困难党员：</th>
					<td><input type="text" name="kndy" data-rule="required;number" value="${zcdy.kndy}"/></td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zcdy.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	$(function() {
	});
	</script>
</body>
</html>