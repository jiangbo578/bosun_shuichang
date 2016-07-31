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
    <li><a href="/dwwzjzcz/list/1">单位违章建筑处置</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 单位违章建筑处置</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/dwwzjzcz/item/add" method="post">

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
					<th>街镇：</th>
					<td><input name="jz" type="text"  id="jz"  data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>村委会：</th>
					<td><input name="cwh" type="text" id="cwh" data-rule="required;length[1~20];" />
					</td>
				</tr>
				<tr>
					<th>发现日期：</th>
					<td><input name="fxrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="fxrq"/>
					</td>
				</tr>
				<tr>
					<th>上报日期：</th>
					<td><input name="sbrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="sbrq"/>
					</td>
				</tr>
				<tr>
					<th>来源：</th>
					<td><input name="ly" type="text" id="ly" data-rule="required;length[1~10];"/>
					</td>
				</tr>
				<tr>
					<th>违章单位名称：</th>
					<td><input name="dwmc" type="text" id="dwmc" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="dz" type="text" id="dz" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>部位：</th>
					<td><input name="bw" type="text" id="bw" data-rule="required;length[1~10];" /> 
					</td>
				</tr>	
				<tr>
					<th>违法建筑名称用途：</th>
					<td>
						<select name = "yt" id="yt" >
							<option value="商业,办公" >商业,办公</option>
							<option value="居住,工业" >居住,工业</option>
							<option value="仓储,其他" >仓储,其他</option>
						</select>
					</td>
				</tr>	
				<tr>
					<th>建筑面积：</th>
					<td><input name="mj" type="text" id="mj" data-rule="required:float" />
					</td>
				</tr>	
				<tr>
					<th>处置单位：</th>
					<td><input name="czdw" type="text" id="czdw"  data-rule="required;length[1~20];"/>
					</td>
				</tr>	
				<tr>
					<th>处置情况：</th>
					<td><input name="czqk" type="text" id="czqk"  data-rule="required;length[1~10];"/>
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
