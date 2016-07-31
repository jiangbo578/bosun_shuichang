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
    <li><a href="/xfanwgh/list/1">消防安全网格化管理</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 消防安全网格化管理</div>
  <div id="panbody">
	<div class="container">
		<form action="/xfanwgh/item/update" method="post">

			<table>
			<tr>
					<th>居委会主任姓名：</th>
					<td><input name="jwhzrxm" type="text"data-rule="required;" value="${ xfanwgh.jwhzrxm}"/>
					</td>
					<th style="padding-left: 100px">居委会副主任姓名：</th>
					<td><input name="jwhfzrxm" type="text"data-rule="required;" value="${ xfanwgh.jwhfzrxm}"/>
					</td>
				</tr>
				<tr>
					<th>物业公司经理姓名：</th>
					<td><input name="wygsjlxm" type="text"data-rule="required;" value="${ xfanwgh.wygsjlxm}"/>
					</td>
					<th style="padding-left: 100px">所属物业公司名称：</th>
					<td><input name="wygsmc" type="text"data-rule="required;" value="${ xfanwgh.wygsmc}"/>
					</td>
				</tr>
				<tr>
					<th>所属小区名称：</th>
					<td><input name="wyxqmc" type="text"data-rule="required;" value="${ xfanwgh.wyxqmc}"/>
					</td>
					<th style="padding-left: 100px">楼组长姓名：</th>
					<td><input name="lzzxm" type="text"data-rule="required;" value="${ xfanwgh.lzzxm}"/>
					</td>
				</tr>
				<tr>
					<th>所属小区名称：</th>
					<td><input name="lzzxqmc" type="text"data-rule="required;" value="${ xfanwgh.lzzxqmc}"/>
					</td>
					<th style="padding-left: 100px">所属居民楼：</th>
					<td><input name="jml" type="text"data-rule="required;" value="${ xfanwgh.jml}"/>
					</td>
				</tr>
				<tr>
					<th>村民小组长姓名：</th>
					<td><input name="cmxzzxm" type="text"data-rule="required;" value="${ xfanwgh.cmxzzxm}"/>
					</td>
					<th style="padding-left: 100px">所属小区名称：</th>
					<td><input name="cmxqmc" type="text"data-rule="required;" value="${ xfanwgh.cmxqmc}"/>
					</td>
				</tr>
				<tr>
					<th>所属居民楼：</th>
					<td><input name="cmjml" type="text"data-rule="required;" value="${ xfanwgh.cmjml}"/>
					</td>
					
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${xfanwgh.id}">
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