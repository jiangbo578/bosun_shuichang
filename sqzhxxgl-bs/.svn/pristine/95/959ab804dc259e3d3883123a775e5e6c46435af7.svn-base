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
		$(len[i]).append("<image style='padding-top: 10px;float: right;position: relative;'  src='/styles/images/application_edit.png' />");	
	}	
})
</script>
	<script>
	    function submitByBusiness(url) {
			location.href=url;		    
		}
		function openWin(url)	{
			if(null!=url && url!="")	{
				　window.open (url, "", "height=500, width=800, toolbar =no, menubar=no, scrollbars=no, resizable=no, location=no, status=no")
			}
		}
		//提交表单  flag为按钮显示标识
		function submitByStatus(status,assessId,flag){			
					if(confirm("确认提交吗？提交过后将不能进行修改操作")){						
						var objKhxm = $("input[name='khxmID']");
						var  khxm="";
						for(var k=0;k<objKhxm.length;k++){
							khxm+=objKhxm[k].value+",";
						}
						var objKhlb= $("input[name='khlbID']");
						var khlb="";
						for(var j=0;j<objKhlb.length;j++){
							khlb+=objKhlb[j].value+",";
						}
						var orgid=$("#orgid").val();
						//alert(orgid);
						 $.ajax({    
				                type: 'POST',    
				                 url: '/kpxt/item/submitQu',   
				                 data:{"ids":khlb,"khxm":khxm,"status":status,"orgid":orgid},
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
		//打分
		function df(status,assessId){				
				var objKhxm = $("input[name='khxmID']");
				var  khxm="";
				for(var k=0;k<objKhxm.length;k++){
					khxm+=objKhxm[k].value+",";
				}
				var objKhlb= $("input[name='khlbID']");
				var khlb="";
				for(var j=0;j<objKhlb.length;j++){
					khlb+=objKhlb[j].value+",";
				}
				var orgid=$("#orgid").val();
				//alert(orgid);
				 $.ajax({    
		                type: 'POST',    
		                 url: '/kpxt/item/submitQu',   
		                 data:{"ids":khlb,"khxm":khxm,"status":status,"orgid":orgid},
		                 success: function(data,status){
		                     if(status == 'success'){
		                    	 location.reload() ;
		                         }
		                    }
		              });  				
		}
	function bohui(status){
		var objKhxm = $("input[name='khxmID']");
		var  khxm="";
		for(var k=0;k<objKhxm.length;k++){
			khxm+=objKhxm[k].value+",";
		}
	 var khlb="";
        $("input[name='ck']:checkbox").each(function(){ 
            if($(this).attr("checked")){
                khlb += $(this).val()+",";
            }
        })
        if(khlb==""){
        	alert("请选择一条记录");
        	return;
        }
		if(confirm("确认驳回么？")){
			//alert(status)
		$.ajax({    
            type: 'POST',    
             url: '/kpxt/item/breakcj',   
             data:{"khlb":khlb,"khxm":khxm,"status":status},
             success: function(data,status){
                 if(status == 'success'){
                	 location.reload() ;
                     }
                }
          });   
	}	}
	function savekp(){
		var objKhxm = $("input[name='khxmID']");
		var  khxm="";
		for(var k=0;k<objKhxm.length;k++){
			khxm+=objKhxm[k].value+",";
		}
		var objKhlb= $("input[name='khlbID']");
		var khlb="";
		for(var j=0;j<objKhlb.length;j++){
			khlb+=objKhlb[j].value+",";
		}
		if(confirm("确认保存么？保存之后无法修改")){
			var orgid=$("#orgid").val();
			var assessid=$("#assessId").val();
			alert(orgid)
			$.ajax({    
	            type: 'POST',    
	             url: '/kpxt/item/bckp',   
	             data:{"khlb":khlb,"khxm":khxm,"orgid":orgid,"assessId":assessid},
	             success: function(data,status){	            	
	                 if(status == 'success'){
	                	
	                	 location.reload() ;
	                     }
	                }
	          });   
		}
	}
	</script>
<title>600分评级</title>
</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/kpxt/index"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">600分评级</a> <span class="divider">/</span></li>
    <li class="active">600分评级审核</li>
  </ul>
   <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>600分评级审核</strong></div>
   	<div class="mianpan">
	  <div id="panbody">
		<div class="container">
  	<div class="tabbox" >
  <ul class="tabbtn">
  			<c:forEach var="assess" items="${assess}">
  				<li  <c:if test="${assessId eq assess.id }">class="current"</c:if> >
				<span style="width: 100px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/kpxt/item/findkp?assessId=${assess.id}&id=${orgid}');">${assess.name }
				
				</span>
			</li>
  			</c:forEach>
		</ul>
		<br>
	
	<br>
	<input type="hidden" value="${assessId}" id="assessId">
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
	               		<th scope="col"  <c:if test="${khxm.hold==1}">style="color: #BEBEBE"</c:if>>项目总得分</th> 
	               		<th scope="col" >镇级相关意见</th> 
	               		<th scope="col"  colspan="4"  style="color:<c:if test="${khxm.hold==1}"> #BEBEBE</c:if>">区级相关部门复核</th> 
	               	
	               		<input type="hidden" name="khxmID" value="${khxm.id }" />
         	 	 </tr> 
         	 	<tr >    
	               		<th scope="col"  style="text-align: center;color: red;font-size: 15px">${khxm.project}(总分：${khxm.allScore })</th> 
	               		<td scope="col" <c:if test="${khxm.project=='计划生育服务管理'||khxm.project=='反邪教管理'}">style="padding-top: 0px !important; padding: 0px !important;text-align: center;background-position: right; background-repeat: no-repeat; background-image: url(/styles/images/application_edit.png);" onclick="ajaxSubmitScore(this,'projectScore','${khxm.id}');" </c:if>> ${khxm.projectScore}  </td> 
	               		<th scope="col" style="padding-top: 0px !important; padding: 0px !important;text-align: center;background-position: right; background-repeat: no-repeat; background-image: url(/styles/images/application_edit.png);"  onclick="ajaxzhen(this,'zznb_check','${khxm.id}','${khxm.hold }');">${khxm.zznb_check}</th> 
	               		<th scope="col"  colspan="4" <c:if test="${oid=='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1'}"> style="padding-top: 0px !important; padding: 0px !important;text-align: center;background-position: right; background-repeat: no-repeat; background-image: url(/styles/images/application_edit.png);" onclick="ajaxSubmitQU(this,'checkScore','${khxm.id}','${khxm.hold }');"</c:if> >${khxm.checkScore}</th> 
         	 	 </tr> 
         	 	 <c:if test="${znNames.id  eq khxm.znbmId}">
				<tr>
					
					<th width="25%" style="text-align: center;">类别</th>
					<th width="10%">2013年末数</th>
					<th width="10%"  style="color: #BEBEBE">2014年末数</th>
					<th width="10%" >街镇审核数据情况</th>
					<th width="7%" style="color: #BEBEBE">单项扣分</th>
					<th  width="5%">勾选</th>
					
				</tr>
					<c:forEach items="${list}" var="list" varStatus="num">
					
						<c:if test="${khxm.mbid eq list.assessTemplate.id}">
									<tr>
										
										<td>${list.type }
	<a href="#" rel="tooltip"  data-placement="right"  data-original-title="${list.description}" ><i class=' icon-bell' ></i></a>
										</td>
										<td <c:if test="${list.sfxy=='yes'}">style="padding-top: 0px !important; padding: 0px !important;text-align: center;background-position: right; background-repeat: no-repeat; background-image: url(/styles/images/application_edit.png);"  onclick="ajaxSubmit(this,'oldCount','${list.id}','${list.hold }');"  </c:if>  >${ list.oldCount}</td>
										
										<td>${list.count}</td><!-- 截止今年末 -->
										<td onclick="ajaxSubmit(this,'jzCount','${list.id}','${list.hold }');"style="padding-top: 0px !important; padding: 0px !important;text-align: center;background-position: right; background-repeat: no-repeat; background-image: url(/styles/images/application_edit.png);">${list.jzCount}</td>
										<td style="color: #BEBEBE"><b>${list.typeKF }</b></td>
										<td><input type="checkbox" value="${list.id }" name="ck" id="ck">   </td>
									     <input type="hidden" name="khlbID" value="${list.id }" />
										
									</tr>
						</c:if>
					</c:forEach>
					</c:if>
					</c:if>
					</c:forEach>
  			</c:forEach>
  				<c:if test="${flag != null && flag eq 1}">
  					<tr >
  						<td>操作</td>
						<td colspan="6" >
   							<%--<span  id="check">   							
      							<input type="checkbox"   id="save_submit"/>
       							<font color="gray" >同时提交</font>
       						</span>
       						--%><span>
								<button  class="btn btn-primary save_submit" onclick="sx()"><i class="icon-ok-sign"></i> <span class="save">保存</span></button>
								<button  class="btn btn-primary save_submit"  onclick="df('1','${assessId}')"><i class="icon-ok-sign"></i> <span class="save">打分</span></button>
								<button  class="btn btn-primary save_submit"  onclick="submitByStatus('2','${assessId}','${flag}')"><i class="icon-ok-sign"></i> <span class="save">提交审核</span></button>
								</span>								
							<button  class="btn btn-primary"  onclick="bohui(0)" ><i class="icon-ok-sign"></i>驳回</button>
						</td>												
					</tr>
				</c:if>
			<c:if test="${flag != null && flag eq 2}">
  					<tr >
  						<td>操作</td>
						<td colspan="6" >
   							<%--<span  id="check">   							
      							<input type="checkbox"   id="save_submit"/>
       							<font color="gray" >同时提交</font>--%>
       						</span>
       						<span>
       						    <button  class="btn btn-primary save_submit" onclick="savekp()"><i class="icon-ok-sign"></i> <span class="save">提交</span></button>
							    <button  class="btn btn-primary save_submit"  onclick="df('1','${assessId}')"><i class="icon-ok-sign"></i> <span class="save">打分</span></button>
								<button  class="btn btn-primary save_submit" onclick="sx()"><i class="icon-ok-sign"></i> <span class="save">保存</span></button>
								</span>								
							<button  class="btn btn-primary"  onclick="bohui(1)" ><i class="icon-ok-sign"></i>驳回</button>
						</td>												
					</tr>
				</c:if>
				<input type="hidden" value="${orgid}" id="orgid"/>
				<c:if test="${oid!='d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1'}">
				<span style="padding-left: 30px;">
					<input type="text"  id="date" onClick="WdatePicker({dateFmt:'yyyy'})" value="2014" class="Wdate" style="width: 100px;"> 
							&nbsp;&nbsp;&nbsp; 
					</span>
					 
					 <span style="position: absolute;">
						<a class="btn btn-primary" type="button"  onclick="cx()"><i class="icon-search"></i>查询历史记录</a>
					 </span>
			</c:if>
	</table>
	<script type="text/javascript">  
	function sx(){
		location.reload() ;
	}
	
	function cx(){
		var assessId=$("#assessId").val();
        var date=document.getElementById("date").value;
        var orgid=document.getElementById("orgid").value;
         location.href="/kpxt/item/findjl?selectDate="+date+"&orgid="+orgid+"&assessId="+assessId;
		}
	//区级相关复审
	function ajaxSubmitQU(_this,name,id,hold){
	        if(!$(_this).is('.input')){   
	        	 if(hold == 1||hold==3)
		                return;
	            $(_this).addClass('input').html('<input   style="height:100%;width: 100%;padding: 0px 0px !important;border:0px !important;box-shadow:0px !important;display:block !important;text-align: center; " type="text" value="'+ $(_this).text() +'"  />').find('input').focus().blur(function(){    
	              //  var thisid = $(this).parent().siblings("th:eq(0)").text();    
	                var thisvalue=$(this).val();
	                thisvalue=encodeURI(thisvalue);
	                //var thisclass = $(this).parent().attr("class");      
	                $.ajax({    
	                  type: 'POST',    
	                  url: '/kpxt/item/edityj?',    
	                  data:"id="+id+"&"+name+"="+thisvalue,
	                  success: function(data,status){
	                     }
	                });    
	                $(this).parent().removeClass('input').html($(this).val());  
	            });                        
	        }    
	}
function ajaxSubmit(_this,name,id,hold){
        if(!$(_this).is('.input')){   
           // if(hold == 2)
            //    return;
            $(_this).addClass('input').html('<input   style="height:100%;width: 100%;padding: 0px 0px !important;border:0px !important;box-shadow:0px !important;display:block !important;text-align: center; " type="text" value="'+ $(_this).text() +'"  />').find('input').focus().blur(function(){    
              //  var thisid = $(this).parent().siblings("th:eq(0)").text();    
                var thisvalue=$(this).val();
                var reg = /^\d+(\.{0,1}\d+){0,1}$/;                 
     			 if  (!reg.test(thisvalue)){ 
     				 if(thisvalue!='是'&&thisvalue!='否'){
     					   var reg = /^-?(?:\d+|\d{1,3}(?:,\d{3})+)(?:\.\d+)?$/;   
     					   if(!reg.test(thisvalue)){
     						  alert("只能输入数字或者是和否!");
     						 return;
     					   }
     				 
     				
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
//镇级相关意见
function ajaxzhen(_this,name,id,hold){
    if(!$(_this).is('.input')){   
       
        $(_this).addClass('input').html('<input   style="height:100%;width: 100%;padding: 0px 0px !important;border:0px !important;box-shadow:0px !important;display:block !important;text-align: center; " type="text" value="'+ $(_this).text() +'"  />').find('input').focus().blur(function(){    
          //  var thisid = $(this).parent().siblings("th:eq(0)").text();    
            var thisvalue=$(this).val();
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

function ajaxSubmitScore(_this,name,id){
    if(!$(_this).is('.input')){   
        $(_this).addClass('input').html('<input   style="height:100%;width: 100%;padding: 0px 0px !important;border:0px !important;box-shadow:0px !important;display:block !important;text-align: center; " type="text" value="'+ $(_this).text() +'"  />').find('input').focus().blur(function(){    
          //  var thisid = $(this).parent().siblings("th:eq(0)").text();    
            var thisvalue=$(this).val();
          //  var reg = new RegExp("^[0-9]*$");
  			// if  (!reg.test(thisvalue)){ 
  			//	 alert("只能输入数字");
  			//	 return;
  			// } 
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
<script type="text/javascript">
(function($) {
    $(document).ready(function () {
      $('a[rel=tooltip]').tooltip({});
      $(".popover").show();
    });
  })(jQuery);
</script>
</html>