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
    <li><a href="/srwzjzcz/list/1">私人违章建筑处置</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
	<div class="mianpan">
	  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 私人违章建筑处置</div>
	  <div id="panbody">
		<div class="container">
	
		<form action="/srwzjzcz/item/add" method="post" enctype="multipart/form-data" >

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
					<th>受理时间：</th>
					<td><input name="slsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="slsj"/>
					</td>
				</tr>
				<tr>
					<th>来源：</th>
					<td><select name="ly" id = "ly">
						<option value="街镇转">街镇转</option>
						<option value="来电">来电</option>
						<option value="来信">来信</option>
						<option value="来访">街镇转</option>
						<option value="主动发现">主动发现</option>
						<option value="其他">其他</option>
					</select>
					</td>
				</tr>
				<tr>
					<th>违章地址：</th>
					<td><input name="wzdz" type="text" id="wzdz" data-rule="required;length[1~20];" />
					</td>
				</tr>
				<tr>
					<th>违章面积：</th>
					<td><input name="wzmj" type="text" id="wzmj" data-rule="required:float;"  />
					</td>
				</tr>
				<tr>
					<th>违章情况：</th>
					<td>
					<select name = "wzqk" id="wzqk" >
							<option value="存量" >存量</option>
							<option value="新建" >新建</option>
						</select>
					</td>
				</tr>	
				<tr>
					<th>违章部位：</th>
					<td>
						<select name = "wzbw" id="wzbw" >
							<option value="公共区域" >公共区域</option>
							<option value="农田区域" >农田区域</option>
							<option value="待建地块" >待建地块</option>
							<option value="集体用地范围" >集体用地范围</option>
							<option value="居住宅基" >居住宅基</option>
							<option value="其他" >其他</option>
						</select>
					</td>
				</tr>	
				<tr>
					<th>处置情况：</th>
					<td><select name = "czqk" id="czqk" >
							<option value="已拆" >已拆</option>
							<option value="未拆" >未拆</option>
							<option value="举报不实" >举报不实</option>
							<option value="自拆" >自拆</option>
							<option value="住拆" >住拆</option>
							<option value="强拆" >强拆</option>
						</select>
					</td>
				</tr>	
				<tr>
					<th>处置责任单位：</th>
					<td><input name="czdw" type="text" id="czdw" data-rule="required;length[1~20];" />
					</td>
				</tr>	
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text" id="bz" />
					</td>
				</tr>		
				<tr>
					<th>整治前图片：</th>
					<td><input name="zzqfile" id="zzqfile" type="file"  />  
					</td>
				</tr>	
				<tr>
					<th>整治后图片：</th>
					<td><input name="zzqfile" id="zzqfile" type="file"  />  
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
