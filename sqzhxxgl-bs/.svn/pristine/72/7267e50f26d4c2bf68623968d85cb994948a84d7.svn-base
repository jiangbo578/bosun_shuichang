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
    <li ><a href="/fcbkjd/list/1">党员干部扶残帮困结对记录</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>审核报表</strong></div>
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
				<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;TABLE-LAYOUT:fixed;WORD-BREAK:break-all" >
			<thead>
				 <tr >
    <td width="10%" valign="center" ><p >时&nbsp;&nbsp;间 </p></td>
    <td width="20%" valign="center" ><p >${fcbkjd.sj}</p></td>
    <td width="126" valign="center" ><p >地&nbsp;点 </p></td>
    <td width="25%" valign="center" colspan="2" ><p >${fcbkjd.address}</p></td>
    <td width="10%" valign="center" ><p >召集人 </p></td>
    <td width="74" valign="center" ><p >${fcbkjd.zjr}</p></td>
    
  </tr>
  <tr >
 
    <td width="107" valign="center" ><p >参加人员 </p></td>
    <td width="470" valign="center" colspan="8" ><p >&nbsp;</p></td>
  </tr>
  <tr >
    <td width="10%">序号</td>
    <td width="10%" ><p >党员干部姓名 </p></td>
    <td width="10%" valign="center" ><p >职&nbsp;务 </p></td>
    <td width="10%" valign="center" ><p >结对时间 </p></td>
    <td width="15%" valign="center" ><p>结对对象姓名 </p></td>
    <td width="15%" valign="center"  colspan="3"><p >残疾类别 </p></td>
   
  </tr>
 
			</thead>
			<tbody>
				<c:forEach items="${datas }" var="fcbkjd" varStatus="num">
					<tr>
					    <td>${num.count + size * (current - 1)}</td>
						<td>${fcbkjd.gbxm}</td>
					    <td>${fcbkjd.role}</td>
					    <td>${fcbkjd.jdsj}</td>
					    <td>${fcbkjd.jdxm}</td>
					    <td colspan="3">${fcbkjd.cjlb}</td>
						
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
				<form action="/fcbkjd/check" method="post">
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
					'${pages}', '${count}', '/fcbkjd/check/', '/${businessFormId }');
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