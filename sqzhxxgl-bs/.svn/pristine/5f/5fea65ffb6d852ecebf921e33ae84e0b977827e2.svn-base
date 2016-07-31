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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/wzsp/list/1">无证食品单位季度隐患排查表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 无证食品单位季度隐患排查表</div>
  <div id="panbody">
	<div class="container">
		<form action="/xfzts/item/update" method="post">

			<table>
			 <tr>
		         <th>日期 :</th>
		         <td><input name="rq" type="text" data-rule="required;date" onClick="WdatePicker();" class="Wdate" value="${xfzts.rq}" /></td>
		       
		         <th style="padding-left: 80px">登记编号 :</th>
		         <td><input name="djbh" type="text" data-rule="required" value="${xfzts.djbh}" /></td>
		       </tr>
		        <tr>
		         
		       <tr>
		         <th>姓名:</th>
		         <td><input name="name" type="text" data-rule="required;chinese;length[1~4]" value="${xfzts.name}"/></td>
		       
		         <th style="padding-left: 80px">电话 :</th>
		         <td><input name="phone" type="text" data-rule="required;mobile;" value="${xfzts.phone}"/></td>
		       </tr>
		       <tr>
		         <th>地址:</th>
		         <td><input name="address" type="text" data-rule="required;length[1~20];" value="${xfzts.address}"/></td>
		       
		         <th style="padding-left: 80px">登记类型：</th>
		         <td><select name="djlx" id="djlx">
		             <option value="投诉">投诉</option>
		             <option value="举报">举报</option>
		             <option value="咨询">咨询</option>
		            </select>   </td>
		       </tr>
		        <tr >
		         <th>具体内容:</th>
		         <td colspan="3"><textarea name=jtnr id="b_create_kindeditor" style="width: 600px; height: 100px;" >${xfzts.jtnr}</textarea></td>
		       
		        
		       </tr>
		       <tr>
		         <th>自行处理结果:</th>
		         <td><input name="zxcljg" type="text" data-rule="required" value="${xfzts.address}"/></td>
		       
		         <th style="padding-left: 80px">处理人：</th>
		         <td><input name="clr" type="text" data-rule="required;chinese;length[1~4]" value="${xfzts.clr}"/></td>
		       </tr>
		       <tr>
		         <th>时间:</th>
		         <td><input name="sj" type="text" data-rule="required;date" onClick="WdatePicker();" class="Wdate" value="${xfzts.sj}"/></td>
		       
		         <th style="padding-left: 80px">移交人：</th>
		         <td><input name="yjr" type="text" data-rule="required;chinese;length[1~4]"value="${xfzts.yjr}"/></td>
		       </tr>
		        <tr>
		         <th>接收人</th>
		         <td><input name="jsr" type="text" data-rule="required;chinese;length[1~4]" value="${xfzts.jsr}"/></td>
		       
		       </tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${xfzts.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script type="text/javascript">
	
	$(function() {
				
				$("#djlx option[value='${xfzts.djlx}']").attr("selected", true);
			});
	</script>
</body>
</html>