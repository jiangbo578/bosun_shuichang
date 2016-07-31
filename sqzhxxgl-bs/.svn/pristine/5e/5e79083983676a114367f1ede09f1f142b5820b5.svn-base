<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>
<%--<script type="text/javascript">
$(document).ready(function(){ 
	　changelist('${rule.identity}');
	
	}); 
</script>
 --%><div id="myhei" >
 		 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/rule/list/1"><i class="icon-align-left"></i>考核管理</a> <span class="divider">/</span></li>

    <li class="active">考核管理</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  
    	<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>修改考核管理</strong> 
  
   
  </div>
 
	<div class="container">
		<form action="/assess/rule/update" method="post">

			<table>
				
					<tr>
						<th>考核规则：</th>
						<td colspan="3"><input name="content" type="text"
							data-rule="required;" style="width: 700px"  value="${rule.content}"/></td>
					</tr>
					<tr>
						<th>扣除分数：</th>
						<td><input name="score" type="text" data-rule="required;"
							style="width: 200px"  value="${rule.score}"/></td>
					</tr>
					<tr>
						<th>同比：</th>
						<td><input type="radio" name="identity" checked="checked" value="上升高于平均值">上升高于平均值
						    <input type="radio" name="identity" value="上升低于平均值">上升低于平均值
						    <input type="radio" name="identity" value="持平平均值">持平平均值
						    
					</tr>
					<tr>
						<th>平均值：</th>
						<td><input name="average" data-rule="length[1~150];"
							type="text" style="width: 500px" value="${rule.average }"/></td>
					</tr>
					<tr>
						<th>备注：</th>
						<td><input name="remark" data-rule="length[1~150];"
							type="text" style="width: 500px"  value="${rule.remark}"/></td>
					</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="id" value="${rule.id}">
					<input type="hidden" name="tempId" value="${tempId}">
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include><br>		<br><br>
		 <script type="text/javascript">
			
		 $(function() {
				$('input[name=identity][type=radio][value=${rule.identity}]').attr('checked', true);
			});
       </script>
</body>
</html>