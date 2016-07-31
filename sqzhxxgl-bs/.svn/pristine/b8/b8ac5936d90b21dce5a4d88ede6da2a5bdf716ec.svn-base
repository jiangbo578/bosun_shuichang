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
    <li><a href="/cwhjcqk/list/1">村委会基础情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>村委会基础情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/cwhjcqk/item/update" method="post">


			<table>
			<tr>
					<th>土地总面积(亩)：</th>
					<td><input name="tdzmj" type="text"  id="tdzmj" data-rule="required:digits;"   value="${cwhjcqk.tdzmj }"   /></td>
					<th style="padding-left: 80px">耕地面积(亩)：</th>
					<td><input name="gdmj" type="text"  id="gdmj" data-rule="required:digits;"   value="${cwhjcqk.gdmj }"   /></td>
				</tr>
				<tr>
					<th>非耕地面积(亩)：</th>
					<td><input name="fgdmj" type="text"  id="fgdmjj" data-rule="required:digits;"   value="${cwhjcqk.fgdmj }"   /></td>
					<th style="padding-left: 80px">村民小组数(个)：</th>
					<td><input name="cmxzs" type="text"  id="cmxzs" data-rule="required:digits;"    value="${cwhjcqk.cmxzs }"  /></td>
				</tr>
				<tr>
					<th>可支配资金(万元)：</th>
					<td><input name="kzpzj" type="text"  id="kzpzj" data-rule="required:digits;"  value="${cwhjcqk.kzpzj }"    /></td>
					<th style="padding-left: 80px">劳动收入(元/人)：</th>
					<td><input name="ldsr" type="text"  id="ldsr" data-rule="required:digits;"   value="${cwhjcqk.ldsr }"   /></td>
				</tr>
				<tr>
					<th>人均收入(元/人)：</th>
					<td><input name="rjsr" type="text"  id="rjsr" data-rule="required:digits;"   value="${cwhjcqk.rjsr }"   /></td><th></th><td></td>
				</tr>
				<tr>
					<th><span style="color: red">五好文明家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="whwmjtqg" type="text"  id="whwmjtqg" data-rule="required:digits;"    value="${cwhjcqk.whwmjtqg }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtqgbl" type="text"  id="whwmjtqgbl"    value="${cwhjcqk.whwmjtqgbl }"  /></td>
				</tr>
				<tr>
					<th>市级(户数)：</th>
					<td><input name="whwmjtsj" type="text"  id="whwmjtsj" data-rule="required:digits;"   value="${cwhjcqk.whwmjtsj }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtsjbl" type="text"  id="whwmjtsjbl"     value="${cwhjcqk.whwmjtsjbl }"  /></td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td><input name="whwmjtqj" type="text"  id="whwmjtqj" data-rule="required:digits;"    value="${cwhjcqk.whwmjtqj }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtqjbl" type="text"  id="whwmjtqjbl"       value="${cwhjcqk.whwmjtqjbl }"  /></td>
				</tr>	
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="whwmjtjdj" type="text"  id="whwmjtjdj" data-rule="required:digits;"    value="${cwhjcqk.whwmjtjdj }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtjdjbl" type="text"  id="whwmjtjdjbl"      value="${cwhjcqk.whwmjtjdjbl }"   /></td>
				</tr>
				<tr>
					<th><span style="color: red">学习型家庭</span></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="xxxjtqg" type="text"  id="xxxjtqg" data-rule="required:digits;"    value="${cwhjcqk.xxxjtqg }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtqgbl" type="text"  id="xxxjtqgbl"      value="${cwhjcqk.xxxjtqgbl }"   /></td>
				</tr>	
				<tr>
					<th>市级(户数)：</th>
					<td><input name="xxxjtsj" type="text"  id="xxxjtsj" data-rule="required:digits;"    value="${cwhjcqk.xxxjtsj }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtsjbl" type="text"  id="xxxjtsjbl"    value="${cwhjcqk.xxxjtsjbl }"    /></td>
				</tr>
				<tr>
					<th>区级(户数)：</th>
					<td><input name="xxxjtqj" type="text"  id="xxxjtqj" data-rule="required:digits;"     value="${cwhjcqk.xxxjtqj }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtqjbl" type="text"  id="xxxjtqjbl"     value="${cwhjcqk.xxxjtqjbl }"   /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="xxxjtjdj" type="text"  id="xxxjtjdj" data-rule="required:digits;"     value="${cwhjcqk.xxxjtjdj }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtjdjbl" type="text"  id="xxxjtjdjbl"      value="${cwhjcqk.xxxjtjdjbl }"   /></td>
				</tr>
					<tr>
					<th><span style="color: red">平安家庭</span></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="pajtqg" type="text"  id="pajtqg" data-rule="required:digits;"    value="${cwhjcqk.pajtqg }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtqgbl" type="text"  id="pajtqgbl"      value="${cwhjcqk.pajtqgbl }"  /></td>
				</tr>	
				<tr>
					<th>市级(户数)：</th>
					<td><input name="pajtsj" type="text"  id="pajtsj" data-rule="required:digits;"    value="${cwhjcqk.pajtsj }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtsjbl" type="text"  id="pajtsjbl"      value="${cwhjcqk.pajtsjbl }"  /></td>
				</tr>
				<tr>
					<th>区级(户数)：</th>
					<td><input name="pajtqj" type="text"  id="pajtqj" data-rule="required:digits;"    value="${cwhjcqk.pajtqj }"   /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtqjbl" type="text"  id="pajtqjbl"       value="${cwhjcqk.pajtqjbl }"  /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="pajtjdj" type="text"  id="pajtjdj" data-rule="required:digits;"     value="${cwhjcqk.pajtjdj }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtjdjbl" type="text"  id="pajtjdjbl"       value="${cwhjcqk.pajtjdjbl }"  /></td>
				</tr>
			  <tr>
					<th><span style="color: red">绿色家庭</span></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="lsjtqg" type="text"  id="lsjtqg" data-rule="required:digits;"     value="${cwhjcqk.lsjtqg }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtqgbl" type="text"  id="lsjtqgbl"      value="${cwhjcqk.lsjtqgbl }"  /></td>
				</tr>
				<tr>
					<th>市级(户数)：</th>
					<td><input name="lsjtsj" type="text"  id="lsjtsj" data-rule="required:digits;"     value="${cwhjcqk.lsjtsj }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtsjbl" type="text"  id="lsjtsjbl"       value="${cwhjcqk.lsjtsjbl }"  /></td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td><input name="lsjtqj" type="text"  id="lsjtqj" data-rule="required:digits;"     value="${cwhjcqk.lsjtqj }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtqjbl" type="text"  id="lsjtqjbl"      value="${cwhjcqk.lsjtqjbl }"  /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="lsjtjdj" type="text"  id="lsjtjdj" data-rule="required:digits;"     value="${cwhjcqk.lsjtjdj }"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtjdjbl" type="text"  id="lsjtjdjbl"       value="${cwhjcqk.lsjtjdjbl }"  /></td>
				</tr>
				<tr>
					<th><span style="color: red">消防基础情况信息（消防）</span></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>其中消防宣传栏数：</th>
					<td><input name="qzxfxcls" type="text"  id="qzxfxcls" data-rule="required:digits;"   value="${cwhjcqk.qzxfxcls }"    /></td>
					<th style="padding-left: 80px">市消防火栓：</th>
					<td><input name="sxfhs" type="text"  id="sxfhs" data-rule="required:digits;"    value="${cwhjcqk.sxfhs }"   /></td>
				</tr>	
				<tr>
					<th>小网格：</th>
					<td><input name="xwg" type="text"  id="xwg" data-rule="required:digits;"     value="${cwhjcqk.xwg }"  /></td><th></th><td></td>
				</tr>
					<tr>
					<th><span style="color: red">爱国卫生与健康城市基础情况信息</span></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>村卫生干部姓名：</th>
					<td><input name="cwsgbxm" type="text"  id="cwsgbxm" data-rule="required;chinese;length[1~4]"    value="${cwhjcqk.cwsgbxm }"   /></td>
					<th style="padding-left: 80px">联系电话：</th>
					<td><input name="lxdh" type="text"  id="lxdh" data-rule="required;"     value="${cwhjcqk.lxdh }"  /></td>
				</tr>	
				<tr>
					<th>垃圾容期间(座)：</th>
					<td><input name="ljrqj" type="text"  id="ljrqj" data-rule="required:digits;"     value="${cwhjcqk.ljrqj }"  /></td>
					<th style="padding-left: 80px">公共厕所(座)</th>
					<td><input name="ggcs" type="text"  id="ggcs" data-rule="required:digits;"     value="${cwhjcqk.ggcs }"  /></td>
				</tr>
					<tr>
					<th>使用自来水总户数(户)：</th>
					<td><input name="syzlszhs" type="text"  id="syzlszhs" data-rule="required:digits;"    value="${cwhjcqk.syzlszhs }"   /></td>
					<th style="padding-left: 80px">普及率(%)：</th>
					<td><input name="zlspjl" type="text"  id="zlspjl" data-rule="required:digits;"     value="${cwhjcqk.zlspjl }"  /></td>
				</tr>	
				<tr>
					<th>使用卫生户厕总户数(户)：</th>
					<td><input name="sywshcs" type="text"  id="sywshcs" data-rule="required:digits;"    value="${cwhjcqk.sywshcs }"   /></td>
					<th style="padding-left: 80px">普及率(%)：</th>
					<td><input name="wshcpjl" type="text"  id="wshcpjl" data-rule="required:digits;"     value="${cwhjcqk.wshcpjl }"  /></td>
				</tr>
				<tr>
					<th>健康宣传栏(个)：</th>
					<td><input name="jkxcl" type="text"  id="jkxcl" data-rule="required:digits;" value="${cwhjcqk.jkxcl }"   /></td>
					<th style="padding-left: 80px">水井：</th>
					<td><input name="sj" type="text"  id="sj" data-rule="required:digits;"     value="${cwhjcqk.sj }"  /></td>	
				</tr>		
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${cwhjcqk.id}">
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