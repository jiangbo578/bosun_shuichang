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
    <li><a href="/dzbwy/list/1">党支部委员及党小组长名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 党支部委员及党小组长名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/dzbwy/item/head/update" method="post">

			<table id="tab">
					<tr>
					<th>本届当选日期：</th>
					<td><input name="bjdxrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="bjdxrq" value="${d.bjdxrq }"/>
					
					</td>
				</tr>
				<tr>
					<th>换届选举形式：</th>
					<td><input name="hjxjxs" type="text" data-rule="required;length[1~10]"  id="hjxjxs"  value="${d.hjxjxs }"/>
					</td>
				</tr>
				<tr>
					<th>届满日期：</th>
					<td><input name="jmrq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="jmrq" value="${d.jmrq}"/>
					</td>
				</tr>
			</table>
			<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
			<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
			<input type="hidden" name="id" value="${d.id}">
			<input type="hidden" name="businessFormId" value="${businessFormId}">
		</form>
	</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script type="text/javascript">
	var t=1;
	function inserttr(){   
	var length=	$("#tab").find("tr").length
	var i=length-1;
        $str='';
        $str+="<tr >";
        $str+="<th>姓名:</th>";
        $str+="<td><input type='text' name='list["+i+"].name' data-rule='required;chinese'/></td>";
        $str+="<th>职务:</th>";
        $str+="<td><input type='text' name='list["+i+"].role' data-rule='required;chinese'/></td>";
        $str+="<th>任职时间</th>";
        $str+="<td><input type='text' name='list["+i+"].zrsj' data-rule='required;date' onClick='WdatePicker()' class='Wdate' /></td>";
        $str+="<th>分工内容</th>";
        $str+="<td><input type='text' name='list["+i+"].fgnr' data-rule='required;chinese'/></td>";
        $str+="<th>备注</th>";
        $str+="<td><input type='text' name='list["+i+"].remark' data-rule='required;'/></td>";
        $str+="<td onClick='inserttr(this)'><a href='#'>增加</a></td>";
    	
        $str+="<td onClick='getDel(this)'><a href='#'>删除</a></td>";     
        $str+="</tr><bt>";
      
        $("#tab").append($str);    
  		 t=t+1;
  		parent.iFrameHeight();
		}
	function getDel(k,id){
		//alert(id);
			 $.ajax( {  
                type : "GET",  
                url : "/dzbwy/item/delete/"+id,  
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