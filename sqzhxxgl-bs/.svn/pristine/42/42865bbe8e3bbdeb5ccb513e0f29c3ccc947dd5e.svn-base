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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/womanbscdj/list/1">退休妇女和生活困难妇女参加妇科病及乳腺病筛查登记表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 退休妇女和生活困难妇女参加妇科病及乳腺病筛查登记表</div>
  <div id="panbody">
	<div class="container">
		<form action="/womanbscdj/item/add" method="post" class="well">
			<table>
				<tr>
					<th>登记日 期：</th>
					<td><input name="djsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>姓名：</th>
					<td>
						<input name="xm" type="text"   data-rule="required;chinese;length[1~4]"></input>
					</td>
				</tr>
				
				<tr>
					<th>性别：</th>
					<td><input name="xb" type="radio" value="男" checked="checked"/>男
					 <input name="xb" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>年龄：</th>
					<td><input name="age" type="text"   data-rule="required:digits;range[18~100]"></input>
					</td>
				</tr>
				<tr>
					<th>身份证号：</th>
					<td><input name="idcard" type="text"  data-rule="required;ID_card"></input>
					</td>
				</tr>
				<tr>
					<th>户籍地址：</th>
					<td><input name="hjdz" type="text" data-rule="required;length[1~20];"></input>
					</td>
				</tr>
				<tr>
					<th>居住地址：</th>
					<td><input name="jtzz" type="text" data-rule="required;length[1~20];"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required:mobile;"/>
					</td>
				</tr>
				<tr>
					<th>类别：</th>
					<td>
						<input name="type" type="radio" value="退休" checked="checked"/>退休
						<input name="type" type="radio" value="低保家庭" />低保家庭
						<input name="type" type="radio" value="公益性岗位" />公益性岗位
						<input name="type" type="radio" value="计划生育困难家庭"/>计划生育困难家庭
						<input name="type" type="radio" value="其他" />其他
					</td>
				</tr>
				<tr>
					<th>安排筛查时间：</th>
					<td><input name="scsj" type="text"  
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				
				<tr>
					<th>是否参加筛查：</th>
					<td><input name="isSc" type="radio" value="参加" checked="checked"/>参加
						<input name="isSc" type="radio" value="不参加" />不参加
					</td>
				</tr>
				<tr>
					<th>筛查机构：</th>
					<td><input name="scjg" type="text"   data-rule="required;length[1~20];" />
					</td>
				</tr>
								
				<tr>
					<th>是否需要进一步检查：</th>
					<td><input name="isAnothorCheck" type="radio" value="需要" checked="checked"/>需要
						<input name="isAnothorCheck" type="radio" value="不需要"/>不需要
					</td>
				</tr>
				<tr>
					<th>是否检出恶性肿瘤：</th>
					<td><input name="isCheckCancer" type="radio" value="是" checked="checked"/>是
						<input name="isCheckCancer" type="radio" value="否" checked="checked"/>否
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<textarea style="width: 200px;height: 200px;" name="tag" ></textarea>
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