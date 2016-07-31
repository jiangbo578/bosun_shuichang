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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/xfzts/list/1">消费者投诉、举报、咨询记录 </a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 消费者投诉、举报、咨询记录 </div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/xfzts/item/add" method="post">
           
           <table> 
		       <tr>
		         <th>日期 :</th>
		         <td><input name="rq" type="text" data-rule="required;date" onClick="WdatePicker();" class="Wdate" /></td>
		       
		         <th style="padding-left: 80px">登记编号 :</th>
		         <td><input name="djbh" type="text" data-rule="required" /></td>
		       </tr>
		        <tr>
		         
		       <tr>
		         <th>姓名:</th>
		         <td><input name="name" type="text" data-rule="required;chinese;length[1~4]" /></td>
		       
		         <th style="padding-left: 80px">电话 :</th>
		         <td><input name="phone" type="text"  data-rule="required;mobile; "/></td>
		       </tr>
		       <tr>
		         <th>地址:</th>
		         <td><input name="address" type="text" data-rule="required;length[1~20];" /></td>
		       
		         <th style="padding-left: 80px">登记类型：</th>
		         <td><select name="djlx">
		             <option value="投诉">投诉</option>
		             <option value="举报">举报</option>
		             <option value="咨询">咨询</option>
		            </select>   </td>
		       </tr>
		        <tr >
		         <th>具体内容:</th>
		         <td colspan="3"><textarea name=jtnr id="b_create_kindeditor" style="width: 600px; height: 100px;"></textarea></td>
		       
		        
		       </tr>
		       <tr>
		         <th>自行处理结果:</th>
		         <td><input name="zxcljg" type="text" data-rule="required;length[1~20];"></td>
		       
		         <th style="padding-left: 80px">处理人：</th>
		         <td><input name="clr" type="text"  data-rule="required;chinese;length[1~4]"></td>
		       </tr>
		       <tr>
		         <th>时间:</th>
		         <td><input name="sj" type="text" data-rule="required;date" onClick="WdatePicker();" class="Wdate" /></td>
		       
		         <th style="padding-left: 80px">移交人：</th>
		         <td><input name="yjr" type="text" data-rule="required;chinese;length[1~4]"></td>
		       </tr>
		        <tr>
		         <th>接收人</th>
		         <td><input name="jsr" type="text" data-rule="required;chinese;length[1~4]" ></td>
		       
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