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
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li ><a href="/gdzctz/list/1">固定资产台账</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>审核报表</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table table-striped table-bordered table-hover">
			<tr>
				<th width="10%">标题：</th>
				<td width=90%">${businessForm.name }</td>
			</tr>
			<tr>
			<th>内容</th>
			<td>
				<table class="table table-striped table-bordered table-hover">
				<thead>
				
				<tbody>
					<c:forEach items="${datas }" var="gdzctz" varStatus="num">
														<tr>
					<th>资产编号：</th>
					<td>${ gdzctz.zcbh }</td>
					<th>资产名称：</th>
					<td>${ gdzctz.zcmc } </td>
					<th>使用年限（月）</th>
					<td>${ gdzctz.synx }</td>
				</tr>
				<tr>
					<th>资产类别：</th>
					<td>${ gdzctz.zclb }</td>
					<th>开始使用日期：</th>
					<td>${ gdzctz.kssyrq }</td>
					<th>增加方式：</th>
					<td>${ gdzctz.zjfs }</td>
				</tr>
				<tr>
					<th>使用状态：</th>
					<td>${ gdzctz.syzt }</td>
					<th>折旧方法：</th>
					<td>${ gdzctz.zzjfs } </td>
					<th>折旧周期：</th>
					<td>${ gdzctz.zjzq }</td>
				</tr>
				<tr>
					<th>月折旧率：</th>
					<td>${ gdzctz.yzjl }</td>
					<th>原值：</th>
					<td>${ gdzctz.yz } </td>
					<th>净残值率：</th>
					<td>${ gdzctz.jczl } </td>
				</tr>
				<tr>
					<th>净残值：</th>
					<td>${ gdzctz.jcz }</td>
					<th>已提折旧月份：</th>
					<td>${ gdzctz.ytzjyf } </td>
					<th>累计折旧：</th>
					<td>${ gdzctz.ljzj }</td>
				</tr>
				<tr>
					<th>净值：</th>
					<td>${ gdzctz.jz }</td>
					<th>计量单位：</th>
					<td>${ gdzctz.jldw }</td>
					<th>数量：</th>
					<td>${ gdzctz.sl }</td>
				</tr>
				<tr>
					<th>单价：</th>
					<td>${ gdzctz.dj }</td>
					<th>规格型号：</th>
					<td>${ gdzctz.ggxh } </td>
					<th>责任部门：</th>
					<td>${ gdzctz.zrbm }</td>
				</tr>
				<tr>
					<th>责任人：</th>
					<td>${ gdzctz.zrr }</td>
					<th>折旧对应科目：</th>
					<td>${ gdzctz.zjdykm } </td>
					<th>累计折旧科目：</th>
					<td>${ gdzctz.ljzjkm } </td>
				</tr>
				<tr>
					<th>存放地点：</th>
					<td>${ gdzctz.cfdd }</td>
					<th>备注：</th>
					<td>${ gdzctz.bz } </td>
					<th>登记人：</th>
					<td>${ gdzctz.djr }</td>
				</tr>
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
				<form action="/gdzctz/check" method="post">
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
					'${pages}', '${count}', '/gdzctz/check/', '/${businessFormId }');
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