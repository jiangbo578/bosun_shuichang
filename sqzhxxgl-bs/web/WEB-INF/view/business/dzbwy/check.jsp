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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li ><a href="/dzbwy/list/1">党员组织关系转入</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>党员组织关系转入</strong></div>
  <div id="panbody">
	<div class="container">
		<table class="table table-striped table-bordered ">
			<tr>
				<th width="10%">标题：</th>
				<td width=90%">${businessForm.name }</td>
			</tr>
			<tr>
			<th>内容</th>
			<td>
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;TABLE-LAYOUT:fixed;WORD-BREAK:break-all">
			<thead>
				  <tr>
    <td valign="center" colspan="2" ><p >本届当选日期 </p></td>
    <td width="10%" valign="center" ><p >${d.bjdxrq}</p></td>
    <td width="15%" valign="center" ><p >换届选举形式 </p></td>
    <td width="10%" valign="center" ><p >${d.hjxjxs}</p></td>
    <td width="10%" valign="center" ><p >届满日期 </p></td>
    <td width="10%" valign="center" ><p >${d.jmrq}</p></td>
  
  </tr>
  <tr>
    <td width="5%" ><p >序号 </p></td>
    <td width="10%" valign="center" ><p >职务 </p></td>
    <td width="10%" valign="center" ><p >姓名 </p></td>
    <td width="10%" valign="center" ><p >任职时间 </p></td>
    <td width="10%" valign="center" ><p >分工内容 </p></td>
    <td width="10%" valign="center" ><p >&nbsp;</p></td>
    <td width="10%" valign="center" ><p >备注 </p></td>
   
  </tr>
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="dzbwy" varStatus="num">
					<tr>
					<td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					<td>${dzbwy.role}</td>
					<td>${dzbwy.name}</td>
					<td>${dzbwy.zrsj}</td>
					<td>${dzbwy.fgnr}</td>
					 <td width="10%" valign="center" ><p >&nbsp;</p></td>
					<td>${dzbwy.remark}</td>
					
						
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
				<form action="/dzbwy/check" method="post">
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
					'${pages}', '${count}', '/dzbwy/check/', '/${businessFormId }');
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