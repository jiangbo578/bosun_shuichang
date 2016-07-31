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
    <li ><a href="/wtqsn/list/1">问题青少年信息统计表</a> <span class="divider">/</span></li>
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
				<tbody>
					<c:forEach items="${datas }" var="wtqsn" varStatus="num">
					<tr>
						<td>名称</td>
						<td>本市户籍(人数)</td>
						<td>非本市户籍人数(人数)</td>
						<td>备注</td>
						</tr>
						<tr>
						<td>有不良行为或严重不良行为青少年</td>
						<td>${wtqsn.ahj}</td>
						<td>${wtqsn.afhj}</td>
						<td>${wtqsn.abz}</td>
						</tr>
						<tr>
						<td>4-25周岁闲散青少年</td>
						<td>${wtqsn.bhj}</td>
						<td>${wtqsn.bfhj}</td>
						<td>${wtqsn.bbz}</td>
						</tr>
						<tr>
						<td>流浪乞讨未成年人</td>
						<td>${wtqsn.chj}</td>
						<td>${wtqsn.cfhj}</td>
						<td>${wtqsn.cbz}</td>
						</tr>
						<tr>
						<td>服刑人员未成年子女</td>
						<td>${wtqsn.dhj}</td>
						<td>${wtqsn.dfhj}</td>
						<td>${wtqsn.dbz}</td>
						</tr>
						<tr>
						<td>农村留守儿童</td>
						<td>${wtqsn.ehj}</td>
						<td>${wtqsn.efhj}</td>
						<td>${wtqsn.ebz}</td>
						</tr>
						<tr  style="height: 20px">
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
				<form action="/wtqsn/check" method="post">
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
					'${pages}', '${count}', '/wtqsn/check/', '/${businessFormId }');
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