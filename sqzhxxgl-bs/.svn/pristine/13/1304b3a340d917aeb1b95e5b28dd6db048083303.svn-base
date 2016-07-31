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
    <li><a href="/wtqsn/list/1">村务公开小组成员名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>村务公开小组成员名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/wtqsn/item/update" method="post">

			<table>
				<tr>
						<th>名称</th>
						<th>本市户籍(人数)</th>
						<th style="padding-left: 70px">非本市户籍人数(人数)</th>
						<th style="padding-left: 120px">备注</th>
						</tr>
						<tr>
						<th>有不良行为或严重不良行为青少年</th>
						<td style="padding-left: 40px"><input type="text" style="width: 50px" id="ahj" name="ahj" value="${wtqsn.ahj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text" style="width: 50px" id="afhj" name="afhj" value="${wtqsn.afhj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text"  id="abz" name="abz" value="${wtqsn.abz }"></td>
						</tr>
						<tr>
						<th>4-25周岁闲散青少年</th>
						<td style="padding-left: 40px"><input type="text" style="width: 50px" id="bhj" name="bhj"value="${wtqsn.bhj }"  data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text" style="width: 50px" id="bfhj" name="bfhj" value="${wtqsn.bfhj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text"  id="bbz" name="bbz" value="${wtqsn.bbz}"></td>
						</tr>
						<tr>
						<th>流浪乞讨未成年人</th>
						<td style="padding-left: 40px"><input type="text" style="width: 50px" id="chj" name="chj" value="${wtqsn.chj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text" style="width: 50px" id="cfhj" name="cfhj" value="${wtqsn.cfhj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text"  id="cbz" name="cbz" value="${wtqsn.cbz }"></td>
						</tr>
						<tr>
						<th>服刑人员未成年子女</th>
						<td style="padding-left: 40px"><input type="text" style="width: 50px" id="dhj" name="dhj" value="${wtqsn.dhj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text" style="width: 50px" id="dfhj" name="dfhj" value="${wtqsn.dfhj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text"  id="dbz" name="dbz"value="${wtqsn.dbz }" ></td>
						</tr>
						<tr>
						<th>农村留守儿童</th>
						<td style="padding-left: 40px"><input type="text" style="width: 50px" id="ehj" name="ehj" value="${wtqsn.ehj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text" style="width: 50px" id="efhj" name="efhj" value="${wtqsn.efhj }" data-rule="required:digits;range[1~1000]"></td>
						<td style="padding-left: 70px"><input type="text"  id="ebz" name="ebz" value="${wtqsn.ebz }"></td>
						</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${wtqsn.id}">
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