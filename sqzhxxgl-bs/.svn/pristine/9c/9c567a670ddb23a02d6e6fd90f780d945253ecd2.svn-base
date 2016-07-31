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
    <li><a href="/jwhjcqk/list/1">居委会基础情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>居委会基础情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/jwhjcqk/item/update" method="post">


			<table>
			<tr style="widtd: 100%">
					<th  >物业公司名称:</th>
					<td ><input name="wygsmc" type="text"  id="wygsmc" data-rule="required;"  value="${jwhjcqk.wygsmc }"  /></td>
					<th style="padding-left: 150px">物业公司个数:</th>
					<td ><input name="wygsgs" type="text"  id="wygsgs" data-rule="required:digits;"  value="${jwhjcqk.wygsgs }"  /></td>
				</tr>
				<tr>
					<th >保安个数:</th>
					<td><input name="bags" type="text"  id="bags" data-rule="required:digits;"  value="${jwhjcqk.bags }"  /></td>
					<th style="padding-left: 150px">居委会办公用房面积:</th>
					<td ><input name="jwhbgyfmj" type="text"  id="jwhbgyfmj" data-rule="required:digits;"  value="${jwhjcqk.jwhbgyfmj }"   /><b>㎡</b></td>
				</tr>
				<tr>
					<th>活动室面积：</th>
					<td><input name="hdsmj" type="text"  id="hdsmj" data-rule="required:digits;"  value="${jwhjcqk.hdsmj }" /><b>㎡</b></td>
					<th style="padding-left: 150px">辖区占地面积：</th>
					<td><input name="xqzdmj" type="text"  id="xqzdmj" data-rule="required:digits;" value="${jwhjcqk.xqzdmj }" /><b>㎡</b></td>
				</tr>
					<tr>
					<th>房屋建筑面积：</th>
					<td><input name="fwjzmj" type="text"  id="fwjzmj" data-rule="required:digits;" value="${jwhjcqk.fwjzmj }" /><b>㎡</b></td>
					<th style="padding-left: 150px">绿化面积：</th>
					<td><input name="lhmj" type="text"  id="lhmj" data-rule="required:digits;" value="${jwhjcqk.lhmj }"  /><b>㎡</b></td>
				</tr>
				<tr>
					<th>居民住宅小区(个)：</th>
					<td><input name="jmzzxq" type="text"  id="jmzzxq" data-rule="required:digits;" value="${jwhjcqk.jmzzxq }" /></td>
					<th style="padding-left: 150px">住宅楼(幢)：</th>
					<td><input name="zzl" type="text"  id="zzl" data-rule="required:digits;"  value="${jwhjcqk.zzl }"/></td>
				</tr>
				<tr>
					<th>小区楼道数：</th>
					<td><input name="xqlds" type="text"  id="xqlds" data-rule="required:digits;" value="${jwhjcqk.xqlds }" /></td>
					<th style="padding-left: 150px">睦邻点：</th>
					<td><input name="mld" type="text"  id="mld" data-rule="required:digits;" value="${jwhjcqk.mld }" /></td>
				</tr>
				<tr>
					<th>辖区单位：</th>
					<td><input name="xqdw" type="text"  id="xqdw" data-rule="required:digits;" value="${jwhjcqk.xqdw }" /></td>
					<th style="padding-left: 150px">共建签约单位：</th>
					<td><input name="gjqydw" type="text"  id="gjqydw" data-rule="required:digits;" value="${jwhjcqk.gjqydw }"  /></td>
				</tr>
				<tr>
					<th>文明楼数：</th>
					<td><input name="wmls" type="text"  id="wmls" data-rule="required:digits;" value="${jwhjcqk.wmls }" /></td>
					<th style="padding-left: 150px">市级文明楼数：</th>
					<td><input name="sjwmls" type="text"  id="sjwmls" data-rule="required:digits;" value="${jwhjcqk.sjwmls }" /></td>
				</tr>
					<tr>
					<th>区级文明楼数：</th>
					<td><input name="qjwmls" type="text"  id="qjwmls" data-rule="required:digits;" value="${jwhjcqk.qjwmls }" /></td>
					<th style="padding-left: 150px">街道级文明楼数：</th>
					<td><input name="jdjwmls" type="text"  id="jdjwmls" data-rule="required:digits;" value="${jwhjcqk.jdjwmls }" /></td>
				</tr>
				<tr>
					<th><span style="color: red">五好文明家庭</span></th><td></td><td></td><td></td><td></td><td></td><td></td><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="whwmjtqg" type="text"  id="whwmjtqg" data-rule="required:digits;"    value="${jwhjcqk.whwmjtqg }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="whwmjtqgbl" type="text"  id="whwmjtqgbl"    value="${jwhjcqk.whwmjtqgbl }"  /></td>
				</tr>
				<tr>
					<th>市级(户数)：</th>
					<td><input name="whwmjtsj" type="text"  id="whwmjtsj" data-rule="required:digits;"   value="${jwhjcqk.whwmjtsj }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="whwmjtsjbl" type="text"  id="whwmjtsjbl"    value="${jwhjcqk.whwmjtsjbl }"  /></td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td><input name="whwmjtqj" type="text"  id="whwmjtqj" data-rule="required:digits;"    value="${jwhjcqk.whwmjtqj }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="whwmjtqjbl" type="text"  id="whwmjtqjbl"     value="${jwhjcqk.whwmjtqjbl }"  /></td>
				</tr>	
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="whwmjtjdj" type="text"  id="whwmjtjdj" data-rule="required:digits;"    value="${jwhjcqk.whwmjtjdj }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="whwmjtjdjbl" type="text"  id="whwmjtjdjbl"    value="${jwhjcqk.whwmjtjdjbl }"   /></td>
				</tr>
				<tr>
					<th><span style="color: red">学习型家庭</span></th><td></td><td></td><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="xxxjtqg" type="text"  id="xxxjtqg" data-rule="required:digits;"    value="${jwhjcqk.xxxjtqg }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="xxxjtqgbl" type="text"  id="xxxjtqgbl"    value="${jwhjcqk.xxxjtqgbl }"   /></td>
				</tr>	
				<tr>
					<th>市级(户数)：</th>
					<td><input name="xxxjtsj" type="text"  id="xxxjtsj" data-rule="required:digits;"    value="${jwhjcqk.xxxjtsj }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="xxxjtsjbl" type="text"  id="xxxjtsjbl"   value="${jwhjcqk.xxxjtsjbl }"    /></td>
				</tr>
				<tr>
					<th>区级(户数)：</th>
					<td><input name="xxxjtqj" type="text"  id="xxxjtqj" data-rule="required:digits;"     value="${jwhjcqk.xxxjtqj }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="xxxjtqjbl" type="text"  id="xxxjtqjbl"    value="${jwhjcqk.xxxjtqjbl }"   /></td>
				</tr>
				<tr>
						<th>街道级(户数)：</th>
					<td><input name="xxxjtjdj" type="text"  id="xxxjtjdj" data-rule="required:digits;"     value="${jwhjcqk.xxxjtjdj }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="xxxjtjdjbl" type="text"  id="xxxjtjdjbl"    value="${jwhjcqk.xxxjtjdjbl }"   /></td>
				</tr>
					<tr>
					<th><span style="color: red">平安家庭</span></th><td></td><td></td><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="pajtqg" type="text"  id="pajtqg" data-rule="required:digits;"    value="${jwhjcqk.pajtqg }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="pajtqgbl" type="text"  id="pajtqgbl"     value="${jwhjcqk.pajtqgbl }"  /></td>
				</tr>	
				<tr>
					<th>市级(户数)：</th>
					<td><input name="pajtsj" type="text"  id="pajtsj" data-rule="required:digits;"    value="${jwhjcqk.pajtsj }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="pajtsjbl" type="text"  id="pajtsjbl"     value="${jwhjcqk.pajtsjbl }"  /></td>
				</tr>
				<tr>
					<th>区级(户数)：</th>
					<td><input name="pajtqj" type="text"  id="pajtqj" data-rule="required:digits;"    value="${jwhjcqk.pajtqj }"   /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="pajtqjbl" type="text"  id="pajtqjbl"     value="${jwhjcqk.pajtqjbl }"  /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="pajtjdj" type="text"  id="pajtjdj" data-rule="required:digits;"     value="${jwhjcqk.pajtjdj }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="pajtjdjbl" type="text"  id="pajtjdjbl"     value="${jwhjcqk.pajtjdjbl }"  /></td>
				</tr>
			  <tr>
					<th><span style="color: red">绿色家庭</span></th><td></td><td></td><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="lsjtqg" type="text"  id="lsjtqg" data-rule="required:digits;"     value="${jwhjcqk.lsjtqg }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="lsjtqgbl" type="text"  id="lsjtqgbl"     value="${jwhjcqk.lsjtqgbl }"  /></td>
				</tr>
				<tr>
					<th>市级(户数)：</th>
					<td><input name="lsjtsj" type="text"  id="lsjtsj" data-rule="required:digits;"     value="${jwhjcqk.lsjtsj }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="lsjtsjbl" type="text"  id="lsjtsjbl"     value="${jwhjcqk.lsjtsjbl }"  /></td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td><input name="lsjtqj" type="text"  id="lsjtqj" data-rule="required:digits;"     value="${jwhjcqk.lsjtqj }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="lsjtqjbl" type="text"  id="lsjtqjbl"     value="${jwhjcqk.lsjtqjbl }"  /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="lsjtjdj" type="text"  id="lsjtjdj" data-rule="required:digits;"     value="${jwhjcqk.lsjtjdj }"  /></td>
					<th style="padding-left: 150px">占比例：</th>
					<td><input name="lsjtjdjbl" type="text"  id="lsjtjdjbl"     value="${jwhjcqk.lsjtjdjbl }"  /></td>
				</tr>
				<tr>
					<th><span style="color: red">消防基础情况信息（消防）</span></th><td></td><td></td><td></td>
				</tr>
				<tr>
					<th>其中消防宣传栏数：</th>
					<td><input name="qzxfxcls" type="text"  id="qzxfxcls" data-rule="required:digits;"   value="${jwhjcqk.qzxfxcls }"    /></td>
					<th style="padding-left: 150px">市消防火栓：</th>
					<td><input name="sxfhs" type="text"  id="sxfhs"    value="${jwhjcqk.sxfhs }"   /></td>
				</tr>	
				<tr>
					<th>小网格：</th>
					<td><input name="xwg" type="text"  id="xwg" data-rule="required:digits;"     value="${jwhjcqk.xwg }"  /></td><td></td><td></td>
				</tr>
					<tr>
					<th><span style="color: red">爱国卫生与健康城市基础情况信息</span></th><td></td><td></td><td></td>
				</tr>
				<tr>
					<th>居委卫生干部姓名：</th>
					<td><input name="lxxm" type="text"  value="${jwhjcqk.lxxm }" data-rule="required;chinese;length[1~4]" /></td>
					<th style="padding-left: 150px">联系电话:</th>
					<td><input name="lxdh" type="text"  value="${jwhjcqk.lxdh }" data-rule="required;"/></td>
				</tr>
				<tr>
					<th>垃圾箱房：</th>
					<td><input name="ljxf" type="text"  id="ljxf" data-rule="required:digits;"     value="${jwhjcqk.ljxf }"  /></td>
					<th style="padding-left: 150px">公共厕所(座)</th>
					<td><input name="ggcs" type="text"  id="ggcs" data-rule="required:digits;"     value="${jwhjcqk.ggcs }"  /></td>
				</tr>
				<tr>
					<th>健康宣传栏(个)：</th>
					<td><input name="jkxcl" type="text"  id="jkxcl" data-rule="required:digits;" value="${jwhjcqk.jkxcl }"   /></td>
					<td></td>
					<td></td>	
				</tr>		
				<tr>
					<td>&nbsp;</td>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${jwhjcqk.id}">
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