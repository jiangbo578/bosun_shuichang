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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/tyssqclb/list/1">社区公共体育设施器材（场地）详细情况登记表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 社区公共体育设施器材（场地）详细情况登记表</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/tyssqclb/item/add" method="post">
   
			<table name="tab" id="tab">
		
			         <span style="color: red;">${meg}</span>
				<tr id="t1">
					<th>器材（运动场）名称：</th>
					<td><input name="qcmc" type="text" data-rule="required;chinese" />
					</td><%--
					
					
					
					<td onclick="inserttr()" style="padding-left: 50px" ><a href='#'  class="btn btn-primary" >增加</a></td>
					<td onClick='getDel(this)'><a href='#' class="btn  b_delete_tyssqclb_item">删除</a></td>
				--%></tr>
				<tr>
				<th>数量（件/片）：</th>
					<td><input name="sl" type="text" data-rule="required;number" />
					</td>
				</tr>
			      <input type="hidden" name="tyssqcId" value="${tyssqcId}" />
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
				
			</table>
			        <button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				    <button  class="btn btn-info" type="button" onclick="window.location.href='/tyssqclb/item/${businessFormId}'" ><i class="icon-share-alt"></i> 返回</button>
				    
		</form>
	</div>


	</div>
</div>
<script src="/scripts/business/tyssqclb.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
<script type="text/javascript">

	var t=1;
	function inserttr(){   
	var length=	$("#tab").find("tr").length
	var i=length-1;
        $str='';
        $str+="<tr >";
        $str+="<th>器材（运动场）名称:</th>";
        $str+="<td><input type='text' name='list["+i+"].qcmc' data-rule='required;chinese'/></td>";
        $str+="<th>数量（件/片）:</th>";
        $str+="<td><input type='text' name='list["+i+"].sl' data-rule='required;number'/></td>";
        $str+="<td onClick='inserttr(this)'  style='padding-left: 50px' ><a href='#' class='btn btn-primary'>增加</a></td>";
    	
        $str+="<td onClick='getDel(this)'><a href='#' class='btn  b_delete_tyssqclb_item'>删除</a></td>";     
        $str+="</tr><bt>";
      
        $("#tab").append($str);    
  		 t=t+1;
  		parent.iFrameHeight();
		}
	
	 
	function getDel(k){
		
	
	    $(k).parent().remove();     
	}
		   
	
	</script>
</body>
</html>