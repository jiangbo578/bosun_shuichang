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
    <li><a href="/zyzmd/list/1">志愿者名单</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 志愿者名单</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/zyzmd/item/add" method="post">

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
					<th>姓名：</th>
					<td><input name="xm" type="text"  id="xm" data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生年月：</th>
					<td><input name="csny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="csny"/>
					</td>
				</tr>
				<tr>
					<th>文化程度：</th>
					<td><input name="whcd" type="text" id="whcd" data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="zzmm" type="text" id="zzmm" data-rule="required;chinese;length[1~4]"/>
					</td>
				</tr>
		
				<tr>
					<th>家庭住址：</th>
					<td><input name="jtzz" type="text" id="jtzz" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>电话：</th>
					<td><input name="dh" type="text" id="dh"  data-rule="required;"/>
					</td>
				</tr>		
				<tr>
					<th>类型：</th>
					<td>
					<select name="lx"  id="lx">
					   <option value="居、村委消防志愿者">居、村委消防志愿者</option>
					   <option value="社区民防志愿者">社区民防志愿者</option>
					   <option value="科普志愿者">科普志愿者</option>
					   <option value="红十字服务站志愿者">红十字服务站志愿者</option>
					   <option value="爱国卫生志愿者">爱国卫生志愿者</option>
					   <option value="控烟志愿者">控烟志愿者</option>
					   <option value="老年志愿者服务">老年志愿者服务</option>
					   <option value="家庭志愿者">家庭志愿者</option>
					   <option value="妇女志愿者">妇女志愿者</option>
					   <option value="党员志愿者">党员志愿者</option>
					</select>
					</td>
				</tr>	
				<tr>
					<th>服务项目：</th>
					<td><input name="fwxm" type="text" id="fwxm" />
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
