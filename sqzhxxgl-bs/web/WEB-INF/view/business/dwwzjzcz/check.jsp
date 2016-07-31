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
    <li ><a href="/dwwzjzcz/list/1">单位违章建筑处置</a> <span class="divider">/</span></li>
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
					<th width="7%">街镇</th>
					<th width="7%">村委会</th>
					<th width="7%">发现日期</th>
					<th width="7%">上报日期</th>
					<th width="7%">来源</th>
					<th width="7%">地址</th>
					<th width="7%">部位</th>
					<th width="7%">违章建筑单位名称</th>
					<th width="7%">建筑面积</th>
					<th width="7%">处置责任单位</th>
					<th width="7%">违法建筑名称用途</th>
					<th width="7%">处置单位情况</th>
					<th width="7%"></th>
					
				</tr>
			</thead>
				<tbody>
					<c:forEach items="${datas }" var="dwwzjzcz" varStatus="num">
						<tr>
						<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${dwwzjzcz.jz}</td>
						<td>${dwwzjzcz.cwh}</td>
						<td>${dwwzjzcz.fxrq}</td>
						<td>${dwwzjzcz.sbrq}</td>
						<td>${dwwzjzcz.ly}</td>
						<td>${dwwzjzcz.dz}</td>
						<td>${dwwzjzcz.bw}</td>
						<td>${dwwzjzcz.dwmc}</td>
						<td>${dwwzjzcz.czdw}</td>
						<td>${dwwzjzcz.yt}</td>
						<td>${dwwzjzcz.czqk}</td>
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
				<form action="/dwwzjzcz/check" method="post">
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
					'${pages}', '${count}', '/dwwzjzcz/check/', '/${businessFormId }');
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