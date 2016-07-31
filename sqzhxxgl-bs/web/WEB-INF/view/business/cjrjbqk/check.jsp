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
    <li ><a href="/cjrjbqk/list/1">残疾人基本情况</a> <span class="divider">/</span></li>
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
					<th width="5%">序号</th>
					<th width="7%">协会全称</th>
					<th width="7%">办公地址</th>
					<th width="7%">电话</th>
					<th width="7%">总人数</th>
					<th width="5%">视力</th>
					<th width="5%">听力</th>
					<th width="5%">言语</th>
					<th width="5%">智力</th>
					<th width="5%">肢体</th>
					<th width="5%">精神</th>
					<th width="5%">无业</th>
					<th width="7%">重残无业</th>
				</tr>
			</thead>
				<tbody>
					<c:forEach items="${datas }" var="cjrjbqk" varStatus="num">
						<tr>
					  <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
						<td>${cjrjbqk.xhqc}</td>
                        <td>${cjrjbqk.bgdz}</td>
                        <td>${cjrjbqk.phone}</td>
                        <td>${cjrjbqk.zrs}</td>
                        <td>${cjrjbqk.sl}</td>
                        <td>${cjrjbqk.tl}</td>
                        <td>${cjrjbqk.yy}</td>
                        <td>${cjrjbqk.zl}</td>
                        <td>${cjrjbqk.zt}</td>
                        <td>${cjrjbqk.js}</td>
                        <td>${cjrjbqk.wy}</td>
                        <td>${cjrjbqk.zcwy}</td>
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
				<form action="/cjrjbqk/check" method="post">
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
					'${pages}', '${count}', '/cjrjbqk/check/', '/${businessFormId }');
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