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
	<script>
	   function submitByBusiness(url) {
			location.href=url;		    
		}
		
	</script>
<title>600分评级</title>
</head>
<body>
	<ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/kpxt/index"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">600分评级</a> <span class="divider">/</span></li>
    <li class="active">两办查看600分评级</li>
  </ul>
   <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>两办查看600分评级 ${jwh.name}</strong></div>
   	<div class="mianpan">
	  <div id="panbody">
		<div class="container">
  	<div class="tabbox" >
  <ul class="tabbtn">
  			<c:forEach var="assess" items="${assess}">
  				<li  <c:if test="${assessId eq assess.id }">class="current"</c:if> >
				<span style="width: 100px;border-right:solid 1px #d5d5d5;" onclick="submitByBusiness('/kpxt/item/sjb?assessId=${assess.id}&id=${orgid}');">${assess.name }
				</span>
			</li>
  			</c:forEach>
		</ul>
	<br>
	<span style="font-size: 15px;margin-left: 40px">流程状态:
	<c:if test="${flag!=3}">
	   <c:if test="${flag==0}">未上报</c:if>
	   <c:if test="${flag==1}">镇职能部门</c:if>
	   <c:if test="${flag==2}">区职能部门</c:if> 
	   <c:if test="${flag==3}">结束，已保存</c:if>
	   </c:if>
	  <c:forEach var="khxm" items="${khxmlist}">
	  <span><b style="text-align: center;color: red;font-size: 15px">${khxm.project}</b>-> <c:if test="${khxm.hold==0}">未上报</c:if>
	   <c:if test="${khxm.hold==1}">镇职能部门</c:if>
	   <c:if test="${khxm.hold==2}">区职能部门</c:if> 
	   <c:if test="${khxm.hold==3}">结束，已保存</c:if><br></span>
	  </c:forEach>
	</span>
	<table class="table table-striped table-bordered table-hover"  style="width: 100%" >
	<c:set value="0" var="sum"></c:set>
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
	               		<th scope="col" style="text-align: center;">考核项目</th> 
	               		<th scope="col" >项目总得分</th> 
	               		<th scope="col" >镇级相关意见</th> 
	               		<th scope="col"  colspan="2" style="text-align: center;">区级相关部门复核</th> 
	               		<input type="hidden" name="khxmID" value="${khxm.id }" />
         	 	 </tr> 
         	 	<tr >    
	               		<th scope="col" style="text-align: center;color: red;font-size: 15px">${khxm.project}(总分：${khxm.allScore })</th> 
	               		 <c:set value="${sum+khxm.projectScore}" var="sum"></c:set> 
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
					<th  width="5%">勾选</th>
				</tr>
					<c:forEach items="${list}" var="list" varStatus="num">
					
						<c:if test="${khxm.mbid eq list.assessTemplate.id}">
									<tr>
										
										<td>${list.type}</td>
										<td><b>${list.oldCount}</b></td>								
										<td>${list.count}</td><!-- 截止今年末 -->
										<td style="color: #BEBEBE"><b>${list.jzCount}</b></td>
										<td style="color: #BEBEBE"><b>${list.typeKF }</b></td>
										<td><input type="checkbox" value="${list.id }" name="ck" id="ck" checked="checked">   </td>
										<input type="hidden" name="khlbID" value="${list.id }" />
										
									</tr>
						</c:if>
					</c:forEach>
					</c:if>
					</c:if>
					</c:forEach>
  			</c:forEach>
  				
  					<tr >
  						<td>操作</td>
						<td colspan="7" >
   							<span  id="check">
   							<button  class="btn btn-primary save_submit"  onclick="submitByStatus('1','${assessId}','${flag}')"><i class="icon-ok-sign"></i> <span class="save">打分</span></button>
      							<button  class="btn btn-primary"  onclick="bohui(1)" ><i class="icon-ok-sign"></i>驳回</button>
       						</span>
       						
								<%--<button  class="btn btn-primary" onclick="submitByStatus('1','${assessId}','${flag }')" ><i class="icon-ok-sign"></i> 保存并提交</button>
						--%></td>
					</tr>
		 <input type="hidden" value="${orgid}" id="orgid"/>
				<c:if test="${ sum>0}">
			<span style="padding-left: 20px"><b>总得分:<fmt:formatNumber value="${sum}" pattern="#.00"/>  <br/></b></span>
			</c:if>
	</table>
	<script type="text/javascript">  


</script>    
</div>
</div>
</div>
</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>	
	<script type="text/javascript">
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
	//提交表单  flag为按钮显示标识
	function submitByStatus(status,assessId,flag){	
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
	</script>
</body>
</html>