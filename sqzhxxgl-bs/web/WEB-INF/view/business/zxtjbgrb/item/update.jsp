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
    <li><a href="/zxtjbgrb/list/1">街镇助学结对统计表（个人版）</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 街镇助学结对统计表（个人版）</div>
  <div id="panbody">
	<div class="container">
		<form action="/zxtjbgrb/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="xm" type="text" data-rule="required;"  value="${zxtjbgrb.xm}"/>
					</td>
				</tr>
				
				
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" value="${zxtjbgrb.phone}"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" id="jtzz" value="${zxtjbgrb.zzmm}"/>
					</td>
				</tr>
				<tr>
					<th>工作单位：</th>
					<td><input name="gzdw" type="text" id="jtzz" value="${zxtjbgrb.gzdw}"/>
					</td>
				</tr>
				<tr>
					<th>工作职务：</th>
					<td><input name="role" type="text" id="jtzz" value="${zxtjbgrb.role}"/>
					</td>
				</tr>
				
				<tr>
					<th>所属街镇：</th>
					<td><input name="ssjz" type="text" id="jddyxm" value="${zxtjbgrb.ssjz}"/>
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" id="jdphone" value="${zxtjbgrb.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>身份证：</th>
					<td><input name="sfz" type="text" id="jdphone" value="${zxtjbgrb.sfz}"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="address" type="text" id="jdphone" value="${zxtjbgrb.address}"/>
					</td>
				</tr>
				<tr>
					<th>所属村、居委：</th>
					<td><input name="cwh" type="text" id="jdphone" value="${zxtjbgrb.cwh}"/>
					</td>
				</tr>
				<tr>
					<th>户籍性质：</th>
					<td><input name="hjxz" type="text" id="jdphone" value="${zxtjbgrb.hjxz}"/>
					</td>
				</tr>
				<tr>
					<th>家庭性质：</th>
					<td><input name="jtxz" type="text" id="jdphone" value="${zxtjbgrb.jtxz}"/>
					</td>
				</tr>
				<tr>
					<th>就读学校：</th>
					<td><input name="jdxx" type="text" id="jdphone" value="${zxtjbgrb.jdxx}"/>
					</td>
				</tr>
				<tr>
					<th>学制年限(年)：</th>
					<td><input name="xznx" type="text" id="jdphone" value="${zxtjbgrb.xznx}"/>
					</td>
				</tr>
				<tr>
					<th>学习阶段：</th>
					<td><input name="xxjd" type="text" id="jdphone" value="${zxtjbgrb.xxjd}"/>
					</td>
				</tr>
				<tr>
					<th>学习年级：</th>
					<td><input name="xxnj" type="text" value="${zxtjbgrb.xxnj}"/>
					</td>
				</tr>
				<tr>
					<th>全年资助金额（元）：</th>
					<td><input name="zzje" type="text" value="${zxtjbgrb.zzje}"/>
					</td>
				</tr>
				<tr>
					<th>全年至今累计已享受资助金额（元）：</th>
					<td><input name="ljje" type="text" data-rule="required;" value="${zxtjbgrb.ljje}"/>
					</td>
				</tr>
				
				<tr>
					<th>资助起始年限：</th>
					<td><input name="zzqsnx" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${zxtjbgrb.zzqsnx}"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text"  value="${zxtjbgrb.bz}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zxtjbgrb.id}">
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
		$('input[type=radio][value=${zxtjbgrb.sex}]').attr("checked",true);
	});
	</script>
</body>
</html>