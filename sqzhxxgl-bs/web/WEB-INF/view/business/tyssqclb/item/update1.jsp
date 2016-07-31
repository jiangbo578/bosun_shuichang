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
    <li><a href="/tyssqclb/list/1">社区公共体育设施器材（场地）详细情况登记表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 社区公共体育设施器材（场地）详细情况登记表</div>
  <div id="panbody">
	<div class="container">
		<form action="/tyssqclb/item/update1" method="post">

		<table id="tab">
					<tr>
					<th>器材（运动场）名称：</th>
					<td><input name="qcmc" type="text" data-rule="required;" value="${tyssqc.qcmc}"/>
					
					</td>
					
					
					
				</tr>
				<tr>
				<th>数量（件/片）：</th>
					<td><input name="sl" type="text" data-rule="required;"  value="${tyssqc.sl}"/>
					</td>
				</tr>
			</table>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				        <button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${tyssqc.id}">
						<input type="hidden" name="tyssqcId" value="${tyssqcId}">
					</td>
				</tr>
			
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
        $str+="<td onClick='inserttr(this)' style='padding-left: 50px' ><a href='#' class='btn btn-primary' >增加</a></td>";
    	
        $str+="<td onClick='getDel(this)'><a href='#' class='btn  b_delete_tyssqclb_item' >删除</a></td>";     
        $str+="</tr><bt>";
      
        $("#tab").append($str);    
  		 t=t+1;
  		parent.iFrameHeight();
		}
	
	function getDel(k,id){
		//alert(id);
			 $.ajax( {  
                type : "GET",  
                url : "/tyssqclb/item/delete/"+id,  
                dataType: "text",  
                success : function(msg) {  
	              
                   if(msg=="成功"){
                      	window.location.reload();//成功刷新当前页面
                }  }
            });  
			
         $(k).parent().remove();   
	   
	}
		   

		
	
	</script>
</body>
</html>