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
    <li><a href="/gdzctz/list/1">固定资产台账</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>固定资产台账</div>
  <div id="panbody">
	<div class="container">
		<form action="/gdzctz/item/update" method="post">

			<table>
				<tr>
					<th>资产编号：</th>
					<td><input name="zcbh" type="text"  id="zcbh" data-rule="required"  value="${gdzctz.zcbh }"  /></td>
					<th style="padding-left: 150px">资产名称：</th>
					<td><input type="text" name="zcmc" id="zcmc" data-rule="required"   value="${gdzctz.zcmc }"  /> </td>
					
				</tr>
				<tr>
				<th>使用年限（月）</th>
					<td><input type="text"  name="synx" id="synx"  value="${gdzctz.synx }"  > </td>
					<th style="padding-left: 150px">资产类别：</th>
					<td><input name="zclb" type="text"  id="zclb" data-rule="required"  value="${gdzctz.zclb }"  /></td>
				</tr>
				<tr>
					
					<th>开始使用日期：</th>
					<td><input name="kssyrq" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="kssyrq"  value="${gdzctz.kssyrq }"  /></td>
					<th style="padding-left: 150px">增加方式：</th>
					<td><input type="text"  name="zjfs" id="zjfs"  value="${gdzctz.zjfs }"  > </td>
				</tr>
				<tr>
					<th>使用状态：</th>
					<td><input name="syzt" type="text"  id="syzt" data-rule="required"  value="${gdzctz.syzt }"  /></td>
					<th style="padding-left: 150px">折旧方式：</th>
					<td><input type="text" name="zzjfs" id="zzjfs" data-rule="required"  value="${gdzctz.zzjfs }"  > </td>
					
				</tr>
				<tr>
				<th>折旧周期：</th>
					<td><input type="text"  name="zjzq" id="zjzq"  value="${gdzctz.zjzq }"  > </td>
					<th style="padding-left: 150px">月折旧率：</th>
					<td><input name="yzjl" type="text"  id="yzjl" data-rule="required"  value="${gdzctz.yzjl }"  /></td>
				</tr>
					<tr>
				<th>月折旧额：</th>
					<td><input type="text"  name="yzje" id="yzje" data-rule="required;length[1~10];" value="${gdzctz.yzje }"> </td>
					
				</tr>
				<tr>
					
					<th>原值：</th>
					<td><input type="text" name="yz" id="yz" data-rule="required"  value="${gdzctz.yz }"  > </td>
					<th style="padding-left: 150px">净残值率：</th>
					<td><input type="text"  name="jczl" id="jczl"  value="${gdzctz.jczl }"  > </td>
				</tr>
				<tr>
					<th>净残值：</th>
					<td><input name="jcz" type="text"  id="jcz" data-rule="required"  value="${gdzctz.jcz }"  /></td>
					<th style="padding-left: 150px">已提折旧月份：</th>
					<td><input type="text" name="ytzjyf" id="ytzjyf" data-rule="required"  value="${gdzctz.ytzjyf }"  > </td>
				
				</tr>
				<tr>
					<th>累计折旧：</th>
					<td><input type="text"  name="ljzj" id="ljzj"  value="${gdzctz.ljzj }"  > </td>
					<th style="padding-left: 150px">净值：</th>
					<td><input name="jz" type="text"  id="jz" data-rule="required"  value="${gdzctz.jz }"  /></td>
				</tr>
				<tr>
					
					<th>计量单位：</th>
					<td><input type="text" name="jldw" id="jldw" data-rule="required"  value="${gdzctz.jldw }"  > </td>
					<th style="padding-left: 150px">数量：</th>
					<td><input type="text"  name="sl" id="sl"  value="${gdzctz.sl }"  > </td>
				</tr>
				<tr>
					<th>单价：</th>
					<td><input name="dj" type="text"  id="dj" data-rule="required"  value="${gdzctz.dj }"  /></td>
					<th style="padding-left: 150px">规格型号：</th>
					<td><input type="text" name="ggxh" id="ggxh" data-rule="required"  value="${gdzctz.ggxh }"  > </td>
					
				</tr>
				<tr>
				<th>责任部门：</th>
					<td><input type="text"  name="zrbm" id="zrbm"  value="${gdzctz.zrbm }"  > </td>
						<th style="padding-left: 150px">责任人：</th>
					<td><input name="zrr" type="text"  id="zrr" data-rule="required"  value="${gdzctz.zrr }"  /></td>
				</tr>
				<tr>
				
					<th>折旧对应科目：</th>
					<td><input type="text" name="zjdykm" id="zjdykm" data-rule="required"  value="${gdzctz.zjdykm }"  > </td>
					<th style="padding-left: 150px">累计折旧科目：</th>
					<td><input type="text"  name="ljzjkm" id="ljzjkm"  value="${gdzctz.ljzjkm }"  > </td>
				</tr>
				<tr>
					<th>存放地点：</th>
					<td><input name="cfdd" type="text"  id="cfdd" data-rule="required"  value="${gdzctz.cfdd }"  /></td>
					<th style="padding-left: 150px">备注：</th>
					<td><input type="text" name="bz" id="bz"   value="${gdzctz.bz }"  > </td>
					
				</tr>
				<tr>
				<th>登记人：</th>
					<td><input type="text"  name="djr" id="djr"  value="${gdzctz.djr }"  > </td>
					
					<th style="padding-left: 150px">日期：</th>
					<td><input name="rq" type="text"
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="rq"   value="${gdzctz.rq }" /></td>
				
				</tr>
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${gdzctz.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script>
<!--
$(function() {
			$('input[name=xb][type=radio][value=${jwcwjd.xb}]').attr('checked', true);
		});
		-->
</script>
</body>
</html>