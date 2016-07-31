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
    <li><a href="/lnxx/list/1">老年学校在册人员名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 老年学校在册人员名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/lnxx/item/update" method="post">
 
	<table id="tab">
					
				
				<tr id="t1">
					<th>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</th>
					<td><input name="name" type="text" data-rule="required;chinese" value="${lnxxry.name}"/>
					</td>
				
				
					</td>
				
				</tr>
				<tr>
					<th >性别：</th>
					<td><input name="sex" type="radio" value="男" />男 <input name="sex" type="radio" value="女"/>女
					</td>
				</tr>
				<tr>
						
					<th  >年龄：</th>
					<td><input name="age" type="text" data-rule="required;number" value="${lnxxry.age}"/>
					<input type="hidden" name="id" value="${lnxxry.id}">
				</tr>
			</table>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				        <button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				<input type="hidden" name="lnxxid" value="${lnxxid}">
					<input type="hidden" name="businessFormId" value="${businessFormId}">
				
					</td>
				</tr>
			
		</form>
	</div>

	</div>
</div>
 <script src="/scripts/business/lnxx.js"></script> 
<jsp:include page="/page/footer.jsp"></jsp:include>
<script type="text/javascript">
$('input[name=sex][type=radio][value=${lnxxry.sex}]').attr('checked', true);
var t=1;
function inserttr(){   
var length=	$("#tab").find("tr").length
var i=length;
$str='';
$str+="<tr >";
$str+="<th>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:</th>";
$str+="<td><input type='text' name='list["+i+"].name' data-rule='required;chinese'/></td>";
$str+="<th style='padding-left: 70px'>性别:</th>";
$str+="<td><input name='list["+i+"].sex' type='radio' value='男' checked='checked'/>男 <input name='list["+i+"].sex' type='radio' value='女' />女</td>";
$str+="<th style='padding-left: 40px'>年龄:</th>";
$str+="<td><input type='text' name='list["+i+"].age' data-rule='required;number'/></td>";
$str+="<td onClick='inserttr(this)' style='padding-left: 80px'><a href='#' class='btn btn-primary'>增加</a></td>";

$str+="<td onClick='getDel(this)'><a href='#' class='btn  b_delete_lnxx_item'>删除</a></td>";     
$str+="</tr><bt>";
  
    $("#tab").append($str);    
		 t=t+1;
		parent.iFrameHeight();
	}

function getDel(k,id){
	//alert(id);
		 $.ajax( {  
            type : "GET",  
            url : "/lnxx/item/delete/"+id,  
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