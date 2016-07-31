<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<title>添加</title>

</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/jwhjcqk/list/1">居委会基础情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 居委会基础情况</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/jwhjcqk/item/add" method="post">

			<table >

				<tr style="width: 100%">
					<th  >物业公司名称:</th>
					<td ><input name="wygsmc" type="text"  id="wygsmc" data-rule="required;"  /></td>
					<th style="padding-left: 80px">物业公司个数:</th>
					<td ><input name="wygsgs" type="text"  id="wygsgs" data-rule="required:digits;"   /></td>
				</tr>
				<tr>
					<th >保安个数:</th>
					<td><input name="bags" type="text"  id="bags" data-rule="required:digits;"    /></td>
					<th style="padding-left: 80px">居委会办公用房面积:</th>
					<td ><input name="jwhbgyfmj" type="text"  id="jwhbgyfmj" data-rule="required:digits;"    /><b>㎡</b></td>
				</tr>
				<tr>
					<th>活动室面积：</th>
					<td><input name="hdsmj" type="text"  id="hdsmj" data-rule="required:digits;"  /><b>㎡</b></td>
					<th style="padding-left: 80px">辖区占地面积：</th>
					<td><input name="xqzdmj" type="text"  id="xqzdmj" data-rule="required:digits;"  /><b>㎡</b></td>
				</tr>
					<tr>
					<th>房屋建筑面积：</th>
					<td><input name="fwjzmj" type="text"  id="fwjzmj" data-rule="required:digits;"  /><b>㎡</b></td>
					<th style="padding-left: 80px">绿化面积：</th>
					<td><input name="lhmj" type="text"  id="lhmj" data-rule="required:digits;"  /><b>㎡</b></td>
				</tr>
				<tr>
					<th>居民住宅小区(个)：</th>
					<td><input name="jmzzxq" type="text"  id="jmzzxq" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">住宅楼(幢)：</th>
					<td><input name="zzl" type="text"  id="zzl" data-rule="required:digits;"  /></td>
				</tr>
				<tr>
					<th>小区楼道数：</th>
					<td><input name="xqlds" type="text"  id="xqlds" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">睦邻点：</th>
					<td><input name="mld" type="text"  id="mld" data-rule="required:digits;"  /></td>
				</tr>
				<tr>
					<th>辖区单位：</th>
					<td><input name="xqdw" type="text"  id="xqdw"  data-rule="required:digits;"   /></td>
					<th style="padding-left: 80px">共建签约单位：</th>
					<td><input name="gjqydw" type="text"  id="gjqydw" data-rule="required:digits;"  /></td>
				</tr>
				<tr>
					<th>文明楼数：</th>
					<td><input name="wmls" type="text"  id="wmls" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">市级文明楼数：</th>
					<td><input name="sjwmls" type="text"  id="sjwmls" data-rule="required:digits;"  /></td>
				</tr>
					<tr>
					<th>区级文明楼数：</th>
					<td><input name="qjwmls" type="text"  id="qjwmls" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">街道级文明楼数：</th>
					<td><input name="jdjwmls" type="text"  id="jdjwmls" data-rule="required:digits;"  /></td>
				</tr>
				<tr>
					<th><span style="color: red">五好文明家庭</span></th><td></td><td></td><td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="whwmjtqg" type="text"  id="whwmjtqg" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtqgbl" type="text"  id="whwmjtqgbl" data-rule="required:digits;"  /></td>
				</tr>	
				<tr>
					<th>市级(户数)：</th>
					<td><input name="whwmjtsj" type="text"  id="whwmjtsj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtsjbl" type="text"  id="whwmjtsjbl"    /></td>
				</tr>
				<tr>
					<th>区级(户数)：</th>
					<td><input name="whwmjtqj" type="text"  id="whwmjtqj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtqjbl" type="text"  id="whwmjtqjbl"    /></td>
				</tr>	
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="whwmjtjdj" type="text"  id="whwmjtjdj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="whwmjtjdjbl" type="text"  id="whwmjtjdjbl"    /></td>
				</tr>
				<tr>
					<th><span style="color: red">学习型家庭</span></th><td></td><td></td><td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="xxxjtqg" type="text"  id="xxxjtqg" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtqgbl" type="text"  id="xxxjtqgbl"    /></td>
				</tr>
				<tr>
					<th>市级(户数)：</th>
					<td><input name="xxxjtsj" type="text"  id="xxxjtsj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtsjbl" type="text"  id="xxxjtsjbl"    /></td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td><input name="xxxjtqj" type="text"  id="xxxjtqj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtqjbl" type="text"  id="xxxjtqjbl"    /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="xxxjtjdj" type="text"  id="xxxjtjdj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="xxxjtjdjbl" type="text"  id="xxxjtjdjbl"    /></td>
				</tr>
					<tr>
					<th><span style="color: red">平安家庭</span></th><td></td><td></td><td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="pajtqg" type="text"  id="pajtqg" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtqgbl" type="text"  id="pajtqgbl"    /></td>
				</tr>	
				<tr>
					<th>市级(户数)：</th>
					<td><input name="pajtsj" type="text"  id="pajtsj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtsjbl" type="text"  id="pajtsjbl"    /></td>
				</tr>
				<tr>
					<th>区级(户数)：</th>
					<td><input name="pajtqj" type="text"  id="pajtqj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtqjbl" type="text"  id="pajtqjbl"    /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="pajtjdj" type="text"  id="pajtjdj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="pajtjdjbl" type="text"  id="pajtjdjbl"    /></td>
				</tr>
				<tr>
					<th><span style="color: red">绿色家庭</span></th><td></td><td></td><td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td><input name="lsjtqg" type="text"  id="lsjtqg" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtqgbl" type="text"  id="lsjtqgbl"    /></td>
				</tr>	
				<tr>
					<th>市级(户数)：</th>
					<td><input name="lsjtsj" type="text"  id="lsjtsj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtsjbl" type="text"  id="lsjtsjbl"    /></td>
				</tr>
				<tr>
					<th>区级(户数)：</th>
					<td><input name="lsjtqj" type="text"  id="lsjtqj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtqjbl" type="text"  id="lsjtqjbl"    /></td>
				</tr>
				<tr>
					<th>街道级(户数)：</th>
					<td><input name="lsjtjdj" type="text"  id="lsjtjdj" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">占比例：</th>
					<td><input name="lsjtjdjbl" type="text"  id="lsjtjdjbl"    /></td>
				</tr>
				<tr>
					<th><span style="color: red">消防基础情况信息（消防）</span></th><td></td><td></td><td>
				</tr>
				<tr>
					<th>其中消防宣传栏数：</th>
					<td><input name="qzxfxcls" type="text"  id="qzxfxcls" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">市消防火栓：</th>
					<td><input name="sxfhs" type="text"  id="sxfhs" data-rule="required:digits;"  /></td>
				</tr>	
				<tr>
					<th>小网格：</th>
					<td><input name="xwg" type="text"  id="xwg" data-rule="required:digits;"  /></td><td></td><td></td>
				</tr>
					<tr>
					<th><span style="color: red">爱国卫生与健康城市基础情况信息</span></th><td></td><td></td><td>
				</tr>
				
				<tr>
					<th>居委卫生干部姓名：</th>
					<td><input name="lxxm" type="text"  data-rule="required;chinese;length[1~4]"/></td>
					<th style="padding-left: 80px">联系电话:</th>
					<td><input name="lxdh" type="text"  data-rule="required;"/></td>
				</tr>
				<tr>
					<th>垃圾箱房：</th>
					<td><input name="ljxf" type="text"  id="ljxf" data-rule="required:digits;"  /></td>
					<th style="padding-left: 80px">公共厕所(座)</th>
					<td><input name="ggcs" type="text"  id="ggcs" data-rule="required:digits;"  /></td>
				</tr>
				<tr>
					<th>健康宣传栏(个)：</th>
					<td><input name="jkxcl" type="text"  id="jkxcl" data-rule="required:digits;"  /></td>
					<td></td>
					<td></td>	
				</tr>	
				<tr>
					<td>
					<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
					<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
					<td></td><td></td><td></td><td></td><td></td><td></td><td></td>
				</tr>
			</table>
				<input type="hidden" name="businessFormId" value="${businessFormId}" />
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>