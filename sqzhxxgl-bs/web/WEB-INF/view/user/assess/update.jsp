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
 <div id="myhei">
 		 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/assess/list/1"><i class="icon-align-left"></i>考核管理</a> <span class="divider">/</span></li>

    <li class="active">考核管理</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  
    	<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>修改考核管理</strong> 
  
   
  </div>
 
	<div class="container">
		<form action="/assess/update" method="post">

			<table>
				<tr>
					<th>模版类型（居委或村委）：</th>
					<td>
						<input type="radio" name="identity" checked="checked" value="1">居委 
						<input type="radio" name="identity"  value="0">村委 
					</td>
				</tr>
				<tr>
					<th>考核名称：</th>
					<td><input name="name" type="text" value="${assess.name }" data-rule="required;" style="width: 200px"/>
					</td>
				</tr>
				<tr>
					<th>总分：</th>
					<td><input name="sumScore" type="text" value="${assess.sumScore }" data-rule="required;digits;range[1~100]"  style="width: 200px"/>
					</td>
				</tr>
				<tr>
					<th>可用状态：</th>
					<td>
						<input type="radio" value="true" checked="checked" name="enableFlag" >可用
						<input type="radio" value="false" name="enableFlag" >不可用
					</td>
				</tr>
				<tr>
					<th>排序顺序：</th>
					<td><select name="des" id="des">
					   <option value="1">1</option>
					   <option value="2">2</option>
					   <option value="3">3</option>
					   <option value="4">4</option>
					   <option value="5">5</option>
					   <option value="6">6</option>
					  </select>
					</td>
				</tr>
				<tr>
					<th>描述：</th>
					<td><input name="description" value="${assess.description }" data-rule="length[1~150];" type="text" style="width: 200px"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="id" value="${assess.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include><br>		<br><br>
		 <script type="text/javascript">
		 $(function(){
				$("input[type=radio][value=${assess.enableFlag}]").attr("checked",true);
				$("input[type=radio][value=${assess.identity}]").attr("checked",true);
				$("#des option[value='${assess.des}']").attr("selected", true);
	   		});
        parent.iFrameHeight();
   		parent.changeheight(document.getElementById("myhei").offsetHeight);
   		
       </script>
</body>
</html>