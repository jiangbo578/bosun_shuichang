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
    <li><a href="/ffbxd/list/1">非法办学点情况表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 非法办学点情况表</div>
  <div id="panbody">
	<div class="container">
		<form action="/ffbxd/item/update" method="post">

			<table>
			
			<tr>
					<th>所属街镇：</th>
					<td><input name="ssjd" type="text" data-rule="required;" value="${ffbxd.ssjd}"/>
					</td>
				</tr>
				<tr>
					<th>所属村、居委：</th>
					<td><input name="sscwh" type="text" data-rule="required;" value="${ffbxd.sscwh}"/></td>
				</tr>
				
				<tr>
					<th>办学名称：</th>
					<td><input name="bxmc" type="text" data-rule="required;" value="${ffbxd.bxmc}"/>
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;chinese;length[1~4]" value="${ffbxd.xm}"/>
					</td>
				</tr>
				<tr>
					<th>籍贯：</th>
					<td><input name="jg"  type="text"  data-rule="required;" value="${ffbxd.jg}"/>
					</td>
				</tr>
				<tr>
					<th>身份证：</th>
					<td><input name="sfz"  type="text"  data-rule="required;ID_card;" value="${ffbxd.sfz}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;" value="${ffbxd.phone}"/>
					</td>
				</tr>
				<tr>
					<th>办学地址：</th>
					<td><input name="bxdz" type="text" data-rule="required;" value="${ffbxd.bxdz}"/>
					</td>
				</tr>
				
				<tr>
					<th>班级数：</th>
					<td><input name="bjs" type="text" data-rule="required;number;" value="${ffbxd.bjs}"/></td>
				</tr>
				<tr>
					<th>幼儿数：</th>
					<td><input name="yrs" type="text" data-rule="required;number;" value="${ffbxd.yrs}"/></td>
				</tr>
				<tr>
					<th>房屋性质：</th>
					<td><input name="fwxz" type="text" data-rule="required;" value="${ffbxd.fwxz}"/>
					</td>
				</tr>
				<tr>
					<th>是否违章搭建：</th>
					<td><input name="wz" type="radio" value="是" checked="checked"/>是
					    <input name="wz" type="radio" value="否" />否
					</td>
				</tr>
				<tr>
					<th>举办时间：</th>
					<td><input name="jbsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${ffbxd.jbsj}"/>
					</td>
				</tr>
			
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${ffbxd.id}">
					<input type="hidden" name="ffbxdbtid" value="${ffbxdbtid}" />
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
		$('input[name=wz][type=radio][value=${ffbxd.wz}]').attr('checked', true);
			});
	</script>
</body>
</html>