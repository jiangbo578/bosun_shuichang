<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
 <style type="text/css">

    .even{
    background-color:#F0F0F0;}
    .odd{
    background-color:#ffff00;
    color:#ff0000;}
   
    </style>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li ><a href="/zxtjbdwb/list/1">街镇助学结对统计表（单位版）</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>街镇助学结对统计表（单位版）</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table  table-bordered ">
			<tr>
				<th width="10%">标题：</th>
				<td width=90%">${businessForm.name }</td>
			</tr>
			<tr>
			<th>内容</th>
			<td>
				<table class="table  table-bordered " style="margin-top: 10px;TABLE-LAYOUT:fixed;WORD-BREAK:break-all">
			<thead>
				</thead>
			<tbody >
				<c:forEach items="${datas}" var="zxtjbdwb" varStatus="num">
			
				<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="8%">序号</th>
					<th width="10%">资助单位</th>
					<th width="20%">地址</th>
					<th width="8%">联系人</th>
					<th width="8%">联系电话</th>
					<th width="8%">单位性质</th>
					<th width="10%">所属街镇</th>
					<th width="8%">姓名</th>
					
				</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${zxtjbdwb.zzdw}</td>
						<td>${zxtjbdwb.dz}</td>
						<td>${zxtjbdwb.lxr}</td>
						<td>${zxtjbdwb.phone}</td>
						<td>${zxtjbdwb.dwxz}</td>
						<td>${zxtjbdwb.ssjz}</td>
						<td>${zxtjbdwb.name}</td>
						
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="5%">性别</th>
				    <th width="10%">身份证</th>
					<th width="10%">家庭住址</th>
					<th width="10%">所属居委会 </th>
					<th width="10%">户籍性质</th>
					<th width="10%">家庭性质 </th>
					<th width="10%">就读学校 </th>
					<th width="10%">学制年限 </th>
					
					
				</tr>
				<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
				       <td>${zxtjbdwb.sex}</td>
						<td>${zxtjbdwb.sfz}</td>
						<td>${zxtjbdwb.address}</td>
						<td>${zxtjbdwb.cwh}</td>
						<td>${zxtjbdwb.hjxz}</td>
						<td>${zxtjbdwb.jtxz}</td>
						<td>${zxtjbdwb.jdxx}</td>
						<td>${zxtjbdwb.xznx}</td>
						</tr>
						<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
						<th width="10%">学习阶段 </th>
					<th width="10%">学习年纪 </th>
					<th width="10%">全年资助金额（元） </th>
					<th width="10%" colspan="2">累计享受资助金额（元） </th>
					<th width="10%" colspan="2">资助起始年限 </th>
					<th width="10%">备注 </th>
					
						</tr>
						<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
						<td>${zxtjbdwb.xxjd}</td>

						<td>${zxtjbdwb.xxnj}</td>
						<td>${zxtjbdwb.zzje}</td>
						<td colspan="2">${zxtjbdwb.ljje}</td>
						<td colspan="2">${zxtjbdwb.zzqsnx}</td>
						<td>${zxtjbdwb.bz}</td>
						
						</tr>
					<!-- <tr>
						<td colspan="8" style="background-color: #8E8E8E"> <br/> </td>
						</tr>
						 -->	
				</c:forEach>
			</tbody>
		</table>
				<div class="pagination" >
				<ul style="float: right;" id="b_pagination"></ul></div>
				</td>
			</tr>
			<tr>
				<th>审核</th>
				<td>
				<form action="/zxtjbdwb/check" method="post">
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
					'${pages}', '${count}', '/zxtjbdwb/check/', '/${businessFormId }');
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
		parent.iFrameHeight();
		
	</script>
</body>
</html>