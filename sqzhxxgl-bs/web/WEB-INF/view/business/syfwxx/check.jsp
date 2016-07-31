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
    <li ><a href="/syfwxx/list/1">实有房屋信息</a> <span class="divider">/</span></li>
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
				<tr>
					<th width="7%">序号</th>
					<th width="7%">所属镇村</th>
					<th width="7%">实有房屋总户数</th>
					<th width="7%">实有房屋总间数</th>
					<th width="7%">实有房屋总面积</th>
					<th width="7%">私房出租总间数</th>
					<th width="7%">私房出租总面积</th>
					<th width="7%">有证出租间数</th>
					<th width="7%">有证出租面积</th>
					<th width="7%">无证出租间数</th>
					<th width="7%">无证出租面积</th>
					<th width="7%">疑似群租间数</th>
					<th width="7%">疑似居改非间数</th>
					<th width="7%"></th>
					
				</tr>
			</thead>
				<tbody>
					<c:forEach items="${datas }" var="syfwxx" varStatus="num">
						<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${syfwxx.ssjz}</td>
						<td>${syfwxx.zhs}</td>
						<td>${syfwxx.zjs}</td>
						<td>${syfwxx.zmj}</td>
						<td>${syfwxx.sfczjs}</td>
						<td>${syfwxx.sfczmj}</td>
						<td>${syfwxx.yzczjs}</td>
						<td>${syfwxx.yzczmj}</td>
						<td>${syfwxx.wzczjs}</td>
						<td>${syfwxx.wzczmj}</td>
						<td>${syfwxx.qzjs}</td>
						<td>${syfwxx.jgfjs}</td>
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
				<form action="/syfwxx/check" method="post">
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
					'${pages}', '${count}', '/syfwxx/check/', '/${businessFormId }');
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