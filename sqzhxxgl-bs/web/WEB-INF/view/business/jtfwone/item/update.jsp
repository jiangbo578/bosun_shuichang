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
    <li><a href="/a/list/1">房屋、土地经营（出租）登记表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>房屋、土地经营（出租）登记表</div>
  <div id="panbody">
	<div class="container">
		<form action="/jtfwone/item/update" method="post">

			<table>
								<tr>
					<th><span style="color: red">集体房屋土地出租</span></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>房屋位置(地址):</th>
					<td><input name="fwwz" type="text"  id="fwwz" data-rule="required;length[1~20];" value="${jtfwone.fwwz }" /></td>
					<th style="padding-left: 150px;">门牌号:</th>
					<td><input name="mph" type="text" id="mph" value="${jtfwone.mph }"  data-rule="required:digits;range[1~1000]" /></td>
				
				</tr>
				<tr>
					<th>房屋总面积:</th>
					<td><input name="fwzmj" type="text"  id="fwzmj" data-rule="required"   value="${jtfwone.fwzmj }"  data-rule="required:float" /></td>
					<th style="padding-left: 150px;">其中:有证面积:</th>
					<td><input name="fwyzmj" type="text" id="fwyzmj"   value="${jtfwone.fwyzmj }"  data-rule="required:float" /></td>
					
				</tr>
				<tr>
				<th>其中:无证面积</th>
					<td><input name="fwwzmj" type="text" id="fwwzmj"   value="${jtfwone.fwwzmj }"  data-rule="required:float" /></td>
					<th style="padding-left: 150px;">已出租总面积:</th>
					<td><input name="yczzmj" type="text"  id="yczzmj" data-rule="required"   value="${jtfwone.yczzmj }"  data-rule="required:float" /></td>
				</tr>
				<tr>
					
					<th>其中:有证面积:</th>
					<td><input name="yczyzmj" type="text" id="yczyzmj"   value="${jtfwone.yczyzmj }"  data-rule="required:float" /></td>
					<th style="padding-left: 150px;">其中:无证面积</th>
					<td><input name="yczwzmj" type="text" id="yczwzmj"   value="${jtfwone.yczwzmj }"   data-rule="required:float"/></td>
				</tr>
				<tr>
					<th>土地位置:</th>
					<td><input name="tdwz" type="text"  id="tdwz" data-rule="required"   value="${jtfwone.tdwz }"  data-rule="required:float" /></td>
					
					<th style="padding-left: 150px;">宗地号:</th>
					<td><input name="zdh" type="text" id="zdh"   value="${jtfwone.zdh }"   data-rule="required:float"/></td>
				</tr>
				<tr>
					<th><span style="color: blue">地块总面积:</span></th>
					<td><input type="text" id="dkzmj"  name="dkzmj"   value="${jtfwone.dkzmj}"  data-rule="required:float"/ > </td>
					<th style="padding-left: 150px;">有证面积:</th>
					<td><input type="text" id="dyzmj" name="dyzmj"   value="${jtfwone.dyzmj }"   data-rule="required:float"/> </td>
				</tr>
				<tr>
					
					<th>其中:农用地</th>
					<td><input type="text" id="dyzny" name="dyzny"   value="${jtfwone.dyzny }"   data-rule="required:float"> </td>
					<th style="padding-left: 150px;">其中:非农用</th>
					<td><input type="text" id="dyzfn"  name="dyzfn"   value="${jtfwone.dyzfn }"   data-rule="required:float"> </td>
				</tr>
				<tr>
					<th>无证面积:</th>
					<td><input type="text" id="dwzmj" name="dwzmj"   value="${jtfwone.dwzmj }"  data-rule="required:float" > </td>
					<th style="padding-left: 150px;">其中:农用地</th>
					<td><input type="text" id="dwzny" name="dwzny"   value="${jtfwone.dwzny }"   data-rule="required:float"> </td>
					
				</tr>
				<tr>
				<th>其中:非农用</th>
					<td><input type="text" id="dwzfn"  name="dwzfn"   value="${jtfwone.dwzfn }"   data-rule="required:float"> </td>
					<th style="padding-left: 150px;"><span >已出租地块总面积:</span></th>
					<td><input type="text" id="ydkzmj" name="ydkzmj"   value="${jtfwone.ydkzmj }"  data-rule="required:float" > </td>
				</tr>
				
					<tr>
					<th>有证面积:</th>
					<td><input type="text" id="yyzmj" name="yyzmj"   value="${jtfwone.yyzmj }"  data-rule="required:float" > </td>
					<th style="padding-left: 150px;">其中:农用地</th>
					<td><input type="text"  id="yyzny"  name="yyzny"   value="${jtfwone.yyzny }"   data-rule="required:float"> </td>
					
				</tr>
				<tr>
				<th>其中:非农用</th>
					<td><input  type="text" id="yyzfn"  name="yyzfn"   value="${jtfwone.yyzfn }"  data-rule="required:float" > </td>
					<th style="padding-left: 150px;">无证面积:</th>
					<td><input type="text" id="ywzmj" name="ywzmj"   value="${jtfwone.ywzmj }"   data-rule="required:float"> </td>
				</tr>
				<tr>
					
					<th>其中:农用地</th>
					<td><input type="text"  id="ywzny"  name="ywzny"   value="${jtfwone.ywzny }"   data-rule="required:float"> </td>
					<th style="padding-left: 150px;">其中:非农用</th>
					<td><input  type="text" id="ywzfn"  name="ywzfn"   value="${jtfwone.ywzfn }"  data-rule="required:float" > </td>
				</tr>
				<tr>
					<th><span style="color: red">集体土地出租:</span></th>
					<td> </td>
					
				</tr>
				<tr>
					<th>出租总面积:</th>
					<td><input type="text" id="tdczmj" name="tdczmj"    value="${jtfwone.tdczmj }"  data-rule="required:float" > </td>
					<th style="padding-left: 150px;">其中:农用地</th>
					<td><input type="text"  id="tdczny"  name="tdczny"   value="${jtfwone.tdczny }"  data-rule="required:float" >  </td>
					
				</tr>
				<tr>
				<th>其中:非农用</th>
					<td><input type="text"  id="tdczfn" name="tdczfn"   value="${jtfwone.tdczfn }"  data-rule="required:float" > </td>
				</tr>
				<tr>
					
					<th>登记人:</th>
					<td><input type="text" id="djr" name="djr"    value="${jtfwone.djr }"  data-rule="required:float" > </td>
					<th style="padding-left: 150px;">日期:</th>
					<td><input type="text" onClick="WdatePicker()" class="Wdate" data-rule="required;date" name="rq" id="rq"   value="${jtfwone.rq }"    /> </td>
				</tr>
			<tr>
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" >
					<input type="hidden" name="id" value="${jtfwone.id}">
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