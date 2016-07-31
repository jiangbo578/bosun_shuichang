<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/scripts/tab/tab.css" type="text/css"></link>
<script src="/styles/js/baes.js"></script>
<script type="text/javascript">
$(function(){
	var len=$(".imgehead");
	for(var i=0;i<len.length;i++){
		$(len[i]).append("<image style='padding-top: 10px;float: right;'  src='/styles/images/application_edit.png' />");
		
	}

	
})
</script>
	<script>
	
		var ids = "";
		$(function(){
			var i = '${ids}';
			ids = i;//初始化数据


		});
	
	    function submitByBusiness(url)
	    {
			location.href=url;		    
		}


		function openWin(url)
		{
			if(null!=url && url!="")
			{
				　window.open (url, "", "height=500, width=800, toolbar =no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
			}
		}
		//提交表单  flag为按钮显示标识
		function submitByStatus(status,assessId,flag)
		{

			if($("#save_submit").attr("checked")){
					if(confirm("确认提交吗？提交过后将不能进行修改操作")){
						 status = "1";
					  }else{
							return;
					  }
				}
			
			ids = ids.substring(1,ids.length-1);
			var obj = $("input[name='khxmID']");
			var  khxm="";
			for(var k=0;k<obj.length;k++){
				khxm+=obj[k].value+",";
			}
		//	alert(khxm);
			var objKhlb= $("input[name='khlbID']");
			var khlb="";
			for(var j=0;j<objKhlb.length;j++){
				khlb+=objKhlb[j].value+",";
			}
		if(status==1){
			 $.ajax({    
                type: 'POST',    
                 url: '/kpxt/item/submit',   
                 data:{"ids":khlb,"khxm":khxm},
                 success: function(data,status){
                     if(status == 'success'){
                    	 location.reload() ;
                         }
                    }
              });   
		}else{
			 location.reload() ;
		}
		}
		
	</script>
<title>600分评级</title>
</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/kpxt/index"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">600分评级</a> <span class="divider">/</span></li>
    <li class="active">被驳回的600分评级</li>
  </ul>
   <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>被驳回的600分评级</strong></div>
   	<div class="mianpan">
	  <div id="panbody">
		<div class="container">
  	<div class="tabbox" >
  <ul class="tabbtn">
  			<c:forEach var="assess" items="${assess}">
  				<li  <c:if test="${assessId eq assess.id }">class="current"</c:if> >
				<span style="width: 100px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/kpxt/item/break?assessId=${assess.id}');">${assess.name }
				</span>
			</li>
  			</c:forEach>
		</ul>
	<br>
	<table class="table table-striped table-bordered table-hover"  style="width: 100%" >
	
			<c:forEach var="znNames" items="${znNames}">
  				 <tr >    
	               		<th scope="col" colspan="8">
	               			<div align="center" class="alert alert-success alert-dismissable">
      					  		评级职能部门：${znNames.name }
      					  		
   							</div>
	                	</th> 
         	 	 </tr>    
         	 	<c:forEach var="khxm" items="${khxmlist}">
         	
         	 		<c:if test="${znNames.id eq khxm.znbmId }">
         	 	 <tr >    
	               		<th scope="col"  style="text-align: center;">考核项目</th> 
	               		<th scope="col" >项目总得分</th> 
	               		<th scope="col" >镇级相关意见</th> 
	               		<th scope="col"  colspan="2" style="text-align: center;">区级相关部门复核</th> 
	               		<input type="hidden" name="khxmID" value="${khxm.id }" />
         	 	 </tr> 
         	 	<tr >    
	               		<th scope="col" style="text-align: center;color: red;font-size: 15px">${khxm.project}(总分：${khxm.allScore })</th> 
	               		<th scope="col" >${khxm.projectScore}</th> 
	               		<th scope="col" >${khxm.zznb_check}</th> 
	               		
	               		<th scope="col"  colspan="3" style="text-align: center;">${khxm.checkScore }</th> 
         	 	 </tr> 
         	 	 <c:if test="${znNames.id  eq khxm.znbmId}">
				<tr>
					
					
					<th width="25%">类别</th>
					<th width="10%" style="color: #BEBEBE">2013年末数</th>
					<th width="10%">2014年末数</th>
					<th width="10%" style="color: #BEBEBE">街镇审核数据情况</th>
					<th width="7%" style="color: #BEBEBE">单项扣分</th>
					
				</tr>
					<c:forEach items="${list}" var="list" varStatus="num">
					
						<c:if test="${khxm.mbid eq list.assessTemplate.id}">
									<tr>
										
										<td>${list.type}</td>
										<td <c:if test="${list.sfxy=='yes'}">style="padding-top: 0px !important; padding: 0px !important;text-align: center;background-position: right; background-repeat: no-repeat; background-image: url(/styles/images/application_edit.png);"  onclick="ajaxSubmit(this,'oldCount','${list.id}','${list.hold }');"  </c:if>><b>${list.oldCount}</b></td>								
										<td    class="imgehead"  style="padding-top: 0px !important; padding: 0px !important;text-align: center;" onclick="ajaxSubmit(this,'count','${list.id}','${list.hold }');" >${list.count}</td><!-- 截止今年末 -->
										<td style="color: #BEBEBE"><b>${list.jzCount}</b></td>
										<td style="color: #BEBEBE"><b>${list.typeKF }</b></td>
										<input type="hidden" name="khlbID" value="${list.id }" />
									
									</tr>
						</c:if>
					</c:forEach>
					</c:if>
					</c:if>
					</c:forEach>
  			</c:forEach>
  				<c:if test="${flag != null && flag eq 0}">
  					<tr >
  						<td>操作</td>
						<td colspan="7" >
   							<span  id="check">
      							<input type="checkbox"   id="save_submit"/>
       							<font color="gray" >同时提交</font>
       						</span>
       						<span>
								<button  class="btn btn-primary save_submit" onclick="submitByStatus('0','${assessId}','${flag }')"><i class="icon-ok-sign"></i> <span class="save">仅保存</span></button>
								</span>
								<%--<button  class="btn btn-primary" onclick="submitByStatus('1','${assessId}','${flag }')" ><i class="icon-ok-sign"></i> 保存并提交</button>
						--%></td>
					</tr>
				</c:if>
				
	</table>
	<script type="text/javascript">  

function ajaxSubmit(_this,name,id,hold)
{
        if(!$(_this).is('.input')){   

            $(_this).addClass('input').html('<input style="height:100%;width: 100%;padding: 0px 0px !important;border:0px !important;box-shadow:0px !important;display:block !important;text-align: center;  " type="text" value="'+ $(_this).text() +'"  />').find('input').focus().blur(function(){    
              //  var thisid = $(this).parent().siblings("th:eq(0)").text();    
                var thisvalue=$(this).val();
                var reg = /^\d+(\.{0,1}\d+){0,1}$/;              
         		 if  (!reg.test(thisvalue)){ 
         			 if(thisvalue!='是'&&thisvalue!='否'){
         				 alert("只能输入数字,小数或者是和否!");
         			     return;
         				 }
         				
         			 } 
                thisvalue=encodeURI(thisvalue);
                //var thisclass = $(this).parent().attr("class");      
                $.ajax({    
                  type: 'POST',    
                  url: '/kpxt/item/edit?',    
                  data:"id="+id+"&"+name+"="+thisvalue,
                  success: function(data,status){
                     }
                });    
                $(this).parent().removeClass('input').html($(this).val()); 
            });                        
        }    
}
</script>    
</div>
</div>
</div>
</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>	
</body>
</html>