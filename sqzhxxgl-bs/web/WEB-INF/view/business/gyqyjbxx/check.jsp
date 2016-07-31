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
    <li ><a href="/gyqyjbxx/list/1">工业企业基本信息</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>审核报表</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table  table-bordered ">
			<thead>
			<tr>
				<th width="10%">标题：</th>
				<td width="90%">${businessForm.name}</td>
			</tr></thead>
			<tbody>
			<tr>
			<th>内容</th>
			<td>
				<table class="table  table-bordered "  >
			<thead>
			<!--  style="TABLE-LAYOUT:fixed;WORD-BREAK:break-all" -->
			
					<tr>
					    <th colspan="7">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;统计单位：${gyqyjbxxbt.cwh}</th>
					    
						
					</tr>
					
				
					<c:forEach var="gyqyjbxx"  items="${datas}" varStatus="num">
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<tH  width="10%">序号</tH>
					<th width="20%" >组织机构代码</th>
					<th width="15%">排污企业详细名称</th>
					<th width="8%">新增</th>
					<th width="20%">详细地址</th>
					<th width="8%">联系人</th>
					<th width="10%">联系电话</th>
					<th width="10%" >行业类别</th>
					
					
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${gyqyjbxx.jgdm}</td>
					    <td>${gyqyjbxx.pwmc}</td>
					    <td>${gyqyjbxx.xz}</td>
					    <td>${gyqyjbxx.dz}</td>
					    <td>${gyqyjbxx.lxr}</td>
					    <td>${gyqyjbxx.lxhd}</td>
					    <td>${gyqyjbxx.hylb}</td> 
					 
					
					</tr >
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="10%">工业用水量</th>
					<th>工业煤炭消耗量</th>
				    <th width="10%">重油量</th>
				    <th width="10%">柴油量</th>
				    <th width="10%">洁净燃气消费量</th>
				    <th width="10%">工业锅炉数</th>
				    <th width="10%" colspan="5">污水治理设施数</th>
				   
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					    <td>${gyqyjbxx.ysl}</td> 
					    <td>${gyqyjbxx.mtl}</td> 
					    <td>${gyqyjbxx.zyl}</td> 
					    <td>${gyqyjbxx.cyl}</td> 
					    <td>${gyqyjbxx.jjrql}</td> 
					    <td>${gyqyjbxx.gls}</td> 
					    <td colspan="5">${gyqyjbxx.wsss}</td> 
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="5%">直排</th>
                    <th  >纳管</th>           
                    <th width="10%">废气治理设施数</th>
				    <th width="15%">危险废物产生量</th>
				    <th width="10%" colspan="4">备注</th>
				   
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					
                        <td>${gyqyjbxx.zg}</td> 
                        <td>${gyqyjbxx.ng}</td>                                          
					    <td>${gyqyjbxx.fqsl}</td>  
					    <td>${gyqyjbxx.wxwsl}</td> 
					    <td colspan="4">${gyqyjbxx.bz}</td>  
					    
					</tr>
					</c:forEach>
					<tr>
					<th colspan="5"> 统计日期：${gyqyjbxxbt.tbrq}</th>
					
					<th colspan="9" align="right"> 统计人员:${gyqyjbxxbt.tbr}</th>
					
					</tr>
				
			</tbody>
		</table>
				<div class="pagination" >
				<ul style="float: right;" id="b_pagination"></ul></div>
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/gyqyjbxx/check" method="post">
						  <div class="control-group">
    <label class="control-label" for="inputEmail">意见：</label>
    <div class="controls">
      <input type="text" name="remark"  class="input-xxlarge"  id="inputEmail" placeholder="请输入意见">

    </div>
  </div>
				<input type="hidden" name="businessFormId" value="${businessForm.id}">
				<input type="hidden" name="type" value="0" id="b_check_type">
				<button class="btn btn-primary"  type="submit"  id="b_check_pass"><i class="icon-ok-sign"></i>通过</button>
				<button class="btn btn-info" type="submit"  id="b_check_no_pass"><i class="icon-share-alt"></i>驳回</button>
				
				
				</form>
				</td>
			</tr></tbody>
		</table>
	</div>
	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	$(function() {
		//分页
		var pagination = new buguPagination('${current}',
				'${pages}', '${count}', '/gyqyjbxx/check/', '/${businessFormId }');
		$('#b_pagination').html(pagination.show());

		$('#b_check_pass').on('click', function(){
		if(confirm("确定要通过审核？")){
		$('#b_check_type').val(1);
		   return true;
		}
			return false;
		});
		$('#b_check_no_pass').on('click', function(){
		if(confirm("确定要驳回审核？")){
		$('#b_check_type').val(2);
		 return true;
			 }
	     return false;	
		});
		
	
		
		
	});

	</script>
</body>
</html>