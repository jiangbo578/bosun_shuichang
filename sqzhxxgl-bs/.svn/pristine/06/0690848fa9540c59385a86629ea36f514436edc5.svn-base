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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/cjrjbqk/list/1">残疾人协会基本情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 残疾人协会基本情况</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/cjrjbqk/item/add" method="post">

			<table>
				<!-- <tr>
					<th>搜索，请输入姓名或身份证号码：</th>
					<td><input type="text" id="b_search"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr> 
				-->
				
				<tr>
					<th>协会全称：</th>
					<td><input name=xhqc type="text"   data-rule="required"/>
					</td>
				</tr>
				<tr>
					<th>办公地址：</th>
					<td><input name="bgdz" type="text"   data-rule="required"/>
					</td>
				</tr>
				
				<tr>
					<th>电话：</th>
					<td><input name="phone" type="text" id="age" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>总人数：</th>
					<td><input name="zrs" type="text" id="address" data-rule="required;number"/>
					</td>
				</tr>
				
				<tr>
					<th>视力残疾：</th>
					<td><input name="sl" type="text" data-rule="required;number"/>
					</td>
				</tr>	
				
				<tr>
					<th>听力残疾：</th>
					<td><input name="tl" type="text" data-rule="required;number"/>
					</td>
				</tr>	
				<tr>
					<th>言语残疾：</th>
					<td><input name="yy" type="text" data-rule="required;number"/>
					</td>
				</tr>	
				<tr>
					<th>智力残疾：</th>
					<td><input name="zl" type="text" data-rule="required;number"/>
					</td>
				</tr>	
				<tr>
					<th>肢体残疾：</th>
					<td><input name="zt" type="text" data-rule="required;number"/>
					</td>
				</tr>	
				<tr>
					<th>精神残疾：</th>
					<td><input name="js" type="text"  data-rule="required;number"/>
					</td>
				</tr>	
				<tr>
					<th>其中无业：</th>
					<td><input name="wy" type="text"  data-rule="required"/>
					</td>
				</tr>	
				<tr>
					<th>其中重残无业：</th>
					<td><input name="zcwy" type="text" data-rule="required;number"/>
					</td>
				</tr>	
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>
