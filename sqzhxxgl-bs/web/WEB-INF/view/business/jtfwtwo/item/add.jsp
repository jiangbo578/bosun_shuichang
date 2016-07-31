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
    <li><a href="/jtfwtwo/list/1">房屋、土地经营（出租）合同登记表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong>房屋、土地经营（出租）合同登记表</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/jtfwtwo/item/add" method="post">

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
					<th><b>合同内容</b></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>合同单位(个人)：</th>
					<td><input name="htdw" type="text"  id="htdw" data-rule="required;length[1~20];"/></td>
					<th style="padding-left: 150px">合同编号：</th>
					<td><input name="htbh" type="text" id="htbh" data-rule="required;length[1~20];"/></td>
					
				</tr>
				<tr>
				<th>内容摘要：</th>
					<td><input type="text"  name="nrzy" id="nrzy" data-rule="required;length[1~20];"> </td>
					<th style="padding-left: 150px">是否招投标：</th>
					<td><input name="sfztb" type="text"  id="sfztb" data-rule="required"/></td>
				</tr>
				<tr>
					
					<th>收款总额(元)：</th>
					<td><input type="text" name="skze" id="skze" data-rule="required:float"> </td>
					<th style="padding-left: 150px">合同期限(起)：</th>
					<td><input name="htqxq" type="text"	onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="htqxq"   data-rule="required:date"/> </td>
				</tr>
				<tr>
					<th>合同期限(止)：</th>
					<td><input name="htqxz" type="text"	onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="htqxz" data-rule="required:date"  /></td>
					
					<th style="padding-left: 150px">终止日期：</th>
					<td><input name="zzrq" type="text"	onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="zzrq"  data-rule="required:date" /></td>
				</tr>
				
				<tr>
				<th>合同履行情况：</th>
					<td><input type="text" name="htlxqk" id="htlxqk" data-rule="required;length[1~20];"> </td>
					<th style="padding-left: 150px">备注：</th>
					<td><input name="bz" type="text"  id="bz" /></td>
				
				</tr>
				<tr>
					<th><b>合同兑现情况</b></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>应收款日期：</th>
					<td><input name="yskrq" type="text"	onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="yskrq"  data-rule="required:date" /></td>
					<th style="padding-left: 150px">应收款金额（元）</th>
					<td><input type="text" name="yskje" id="yskje" data-rule="required:float"> </td>
					
				</tr>
				<tr>
				<th>收款日期：</th>
					<td><input name="skrq" type="text"	onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="skrq"   /> </td>
						<th style="padding-left: 150px">收据号码：</th>
					<td><input name="sjhm" type="text"  id="sjhm" data-rule="required"/></td>
				</tr>
				<tr>
				
					<th>收款金额(元)：</th>
					<td><input type="text" name="skje" id="skje" data-rule="required:float"> </td>
					<th style="padding-left: 150px">本期未收金额(元)：</th>
					<td><input type="text"  name="bqwsje" id="bqwsje" data-rule="required:float"> </td>
				</tr>
				<tr>
					<th>累计未收金额(元)：</th>
					<td><input name="ljwsje" type="text"  id="ljwsje" data-rule="required:float"/></td>
					<th style="padding-left: 150px">凭证号：</th>
					<td><input type="text" name="pzh" id="pzh" data-rule="required;length[1~20];"> </td>
				
				</tr>
					<tr>
						<th>登记人：</th>
					<td><input type="text"  name="djr" id="djr" data-rule="required;chinese;length[1~4]"> </td>
					<th style="padding-left: 150px">日期：</th>
					<td><input name="rq" type="text"	onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="rq"  data-rule="required:date" /> </td>
				
				</tr>
			<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				<th></th>
					<td> </td>
					<th></th>
					<td><input type="hidden" name="businessFormId" value="${businessFormId}" /></td>
					
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>
