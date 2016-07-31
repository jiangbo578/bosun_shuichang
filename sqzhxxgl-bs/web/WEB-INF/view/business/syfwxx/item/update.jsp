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
    <li><a href="/syfwxx/list/1">实有房屋信息</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>实有房屋信息</div>
  <div id="panbody">
	<div class="container">
		<form action="/syfwxx/item/update" method="post">

			<table>
				<tr>
					<th>所属街镇：</th>
					<td><input name="ssjz" type="text"  id="sszj" data-rule="required" value="${syfwxx.ssjz }" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>实有房屋总户数：</th>
					<td><input name="zhs" type="text"  id="zhs" data-rule="required:float;" value="${syfwxx.zhs }" />
					</td>
				</tr>
				<tr>
					<th>实有房屋总间数：</th>
					<td><input name="zjs" type="text"  id="zjs" data-rule="required:float;" value="${syfwxx.zjs }" />
					</td>
				</tr>
				<tr>
					<th>实有房屋总面积：</th>
					<td><input name="zmj" type="text"  id="zmj" data-rule="required:float;" value="${syfwxx.zmj }" />
					</td>
				</tr>
				<tr>
					<th>私房出租总间数：</th>
					<td><input name="sfczjs" type="text"  id="sfczjs" data-rule="required:float;" value="${syfwxx.sfczjs }" />
					</td>
				</tr>
				<tr>
					<th>私房出租总面积：</th>
					<td><input name="sfczmj" type="text"  id="sfczmj" data-rule="required:float;" value="${syfwxx.sfczmj }" />
					</td>
				</tr>
				<tr>
					<th>有证出租面积：</th>
					<td><input name="yzczmj" type="text"  id="yzczmj" data-rule="required:float;" value="${syfwxx.yzczmj }" />
					</td>
				</tr>
				<tr>
					<th>有证出租间数：</th>
					<td><input name="yzczjs" type="text"  id="yzczjs" data-rule="required:float;" value="${syfwxx.yzczjs}" />
					</td>
				</tr>
				<tr>
					<th>无证出租间数：</th>
					<td><input name="wzczmj" type="text"  id="wzczmj" data-rule="required:float;" value="${syfwxx.wzczmj }" />
					</td>
				</tr>
				<tr>
					<th>无证出租面积：</th>
					<td><input name="wzczjs" type="text"  id="wzczjs" data-rule="required:float;" value="${syfwxx.wzczjs }" />
					</td>
				</tr>
				<tr>
					<th>疑似群租间数：</th>
					<td><input name="qzjs" type="text"  id="qzjs" data-rule="required:float;" value="${syfwxx.qzjs }" />
					</td>
				</tr>
				<tr>
					<th>疑似居改非间数：</th>
					<td><input name="jgfjs" type="text"  id="jgfjs" data-rule="required:float;" value="${syfwxx.jgfjs }" />
					</td>
				</tr>

				
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${syfwxx.id}">
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