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
    <li><a href="/zxtjbdwb/list/1">街镇助学结对统计表（单位版）</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 街镇助学结对统计表（单位版）</div>
  <div id="panbody">
	<div class="container">
		<form action="/zxtjbdwb/item/update" method="post">

			<table>
				<tr>
					<th>资助单位：</th>
					<td><input name="zzdw" type="text" data-rule="required;" value="${zxtjbdwb.zzdw}"/>
					</td>
				</tr>
				
				<tr>
					<th>地址：</th>
					<td><input name="dz" type="text" id="jkzk" value="${zxtjbdwb.dz}"/>
					</td>
				</tr>
				<tr>
					<th>联系人：</th>
					<td><input name="lxr" type="text" id="whcd" value="${zxtjbdwb.lxr}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" value="${zxtjbdwb.phone}"/>
					</td>
				</tr>
				<tr>
					<th>单位性质：</th>
					<td><input name="dwxz" type="text" id="jtzz" value="${zxtjbdwb.dwxz}"/>
					</td>
				</tr>
				
				
				<tr>
					<th>所属街镇：</th>
					<td><input name="ssjz" type="text" id="jddyxm" value="${zxtjbdwb.ssjz}"/>
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" id="jdphone" value="${zxtjbdwb.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>身份证：</th>
					<td><input name="sfz" type="text" id="jdphone" value="${zxtjbdwb.sfz}"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址：</th>
					<td><input name="address" type="text" id="jdphone" value="${zxtjbdwb.address}"/>
					</td>
				</tr>
				<tr>
					<th>所属村、居委：</th>
					<td><input name="cwh" type="text" id="jdphone" value="${zxtjbdwb.cwh}"/>
					</td>
				</tr>
				<tr>
					<th>户籍性质：</th>
					<td><input name="hjxz" type="text" id="jdphone" value="${zxtjbdwb.hjxz}"/>
					</td>
				</tr>
				<tr>
					<th>家庭性质：</th>
					<td><input name="jtxz" type="text" id="jdphone" value="${zxtjbdwb.jtxz}"/>
					</td>
				</tr>
				<tr>
					<th>就读学校：</th>
					<td><input name="jdxx" type="text" id="jdphone" value="${zxtjbdwb.jdxx}"/>
					</td>
				</tr>
				<tr>
					<th>学制年限(年)：</th>
					<td><input name="xznx" type="text" id="jdphone" value="${zxtjbdwb.xznx}"/>
					</td>
				</tr>
				<tr>
					<th>学习阶段：</th>
					<td><input name="xxjd" type="text" id="jdphone" value="${zxtjbdwb.xxjd}"/>
					</td>
				</tr>
				<tr>
					<th>学习年级：</th>
					<td><input name="xxnj" type="text" value="${zxtjbdwb.xxnj}"/>
					</td>
				</tr>
				<tr>
					<th>全年资助金额（元）：</th>
					<td><input name="zzje" type="text" value="${zxtjbdwb.zzje}"/>
					</td>
				</tr>
				<tr>
					<th>全年至今累计已享受资助金额（元）：</th>
					<td><input name="ljje" type="text" data-rule="required;" value="${zxtjbdwb.ljje}"/>
					</td>
				</tr>
				
				<tr>
					<th>资助起始年限：</th>
					<td><input name="zzqsnx" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${zxtjbdwb.zzqsnx}"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text"  value="${zxtjbdwb.bz}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zxtjbdwb.id}">
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
		$('input[type=radio][value=${zxtjbdwb.sex}]').attr("checked",true);
	});
	</script>
</body>
</html>