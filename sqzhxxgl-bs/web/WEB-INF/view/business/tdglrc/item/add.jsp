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
    <li><a href="/tdglrc/list/1">土地管理日常巡查记录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 土地管理日常巡查记录</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/tdglrc/item/add" method="post">

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
					<td><input name="jz" type="text"  id="jz" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>村委会：</th>
					<td><input name="cwh" type="text"  id="cwh" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>土地坐落：</th>
					<td><input name="tdzl" type="text" id="tdzl" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>违法当事人：</th>
					<td><input name="wfdsr" type="text" id="wfdsr" data-rule="required:chinese;length[1~4];" />
					</td>
				</tr>
				<tr>
					<th>项目名称：</th>
					<td><input name="xmmc" type="text"  data-rule="required:chinese;length[1~8]"/>
					</td>
				</tr>
				<tr>
					<th>占地面积：</th>
					<td><input name="zdmj" type="text"   data-rule="required:float;"/>
					</td>
				</tr>
				<tr>
					<th>违法用地类型：</th>
					<td><select id="wfydlx" name="wfydlx">
						<option value="市政基础设施">市政基础设施</option>
						<option value="工矿仓储类">工矿仓储类</option>
						<option value="农村'三世一点'">农村'三世一点'</option>
						<option value="其他">其他</option>
					</select>
					</td>
				</tr>		
				<tr>
					<th>整治要求：</th>
					<td><select id="zzyq" name="zzyq">
							<option value="拆办">拆办</option>
							<option value="补办">补办</option>
					</select>
					</td>
				</tr>
				<tr>
					<th>巡查责任人：</th>
					<td><input name="xczrr" type="text" id="xczrr" data-rule="required;chinese;length[1~4]"/>
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
					<th>开工日期：</th>
					<td><input name="kgrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="kgrq"/>
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
