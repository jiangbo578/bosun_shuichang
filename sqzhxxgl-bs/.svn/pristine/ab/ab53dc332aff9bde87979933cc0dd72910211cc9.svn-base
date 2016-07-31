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
    <li><a href="/cwhqk/list/1">村委会情况</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 村委会情况</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/cwhqk/item/add" method="post">

			<table>
				
				<tr>
					<th>村委会全称：</th>
					<td><input name="qc" type="text"  id="qc" data-rule="required;"/>
					</td>
					
				</tr>
				<tr>
					
				</tr>
				<tr>
					<th>村委会成立日期：</th>
					<td><input name="clrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="clrq"/>
					</td>
					<th style="padding-left: 100px">党支部成立日期：</th>
					<td><input name="dzbclrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="dzbclrq"/>
					</td>
				</tr>
				<tr>
					<th>党支部成员数 ：</th>
					<td><input name="dzbcys" type="text" id="dzbcys"   data-rule="required;digits;"/>
					</td>
					<th  style="padding-left: 100px">书记数：</th>
					<td><input name="sj" type="text" id="sj" data-rule="required;digits;"/>
					</td>
				</tr>
				</tr>
				<tr>
					
				<tr>
					<th>副书记数：</th>
					<td><input name="fsj" type="text" id="fsj" data-rule="required;digits;"/>
					</td>
					<th  style="padding-left: 100px">党支部委员数：</th>
					<td><input name="dzbwy" type="text" id="dzbwy" data-rule="required;digits;"/>
					</td>
				</tr>
				<tr>
					
				</tr>
				<tr>
					<th>村委会人数：</th>
					<td><input name="cwhrs" type="text" id="cwhrs" data-rule="required;digits;"/>
					</td>
						<th  style="padding-left: 100px">主任数：</th>
					<td><input name="zr" type="text" id="zr" data-rule="required:digits;"/>
					</td>
				</tr>
				<tr>
				
				</tr>
				<tr>
					<th>副主任数：</th>
					<td><input name="fzr" type="text" id="fzr" data-rule="required:digits;"/>
					</td>
					<th  style="padding-left: 100px">村委会委员数：</th>
					<td><input name="cwhwy" type="text" id="cwhwy" data-rule="required;digits;"/>
					</td>
				</tr>
				<tr>
					
				</tr>
				<tr>
					<th>所属街镇：</th>
					<td><input name="sscz" type="text" id="sscz" data-rule="required;length[1~30];"/>
					</td>
						<th  style="padding-left: 100px">办公地址：</th>
					<td><input name="bgdz" type="text" id="bgdz" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
				
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="dh" type="text" id="dh" data-rule="required;"/>
					</td>
					<th  style="padding-left: 100px">邮箱：</th>
					<td><input name="yx" type="text" id="yx" data-rule="required:email;"/>
					</td>
				</tr>
				</tr>
				<tr>
					
				<tr>
					<th>邮政编码：</th>
					<td><input name="yb" type="text" id="yb" data-rule="required:postcode;"/>
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
