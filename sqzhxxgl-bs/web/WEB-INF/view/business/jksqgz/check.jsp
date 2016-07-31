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
    <li ><a href="/jksqgz/list/1">健康社区工作统计表</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>审核报表</strong></div>
  <div id="panbody">
	<div class="container">
	
	
		<table class="table table-striped table-bordered table-hover">
			<thead>
			<tr>
				<th width="10%">标题：</th>
				<td width="90%">${businessForm.name}</td>
			</tr></thead>
			<tbody>
			<tr>
			<th>内容</th>
			<td>
			<table>
		<tr >
    <td   width="230px" ><p >健康日宣传活动 </p></td>
    <td width="130px" ><p >落实工间操制度的单位 </p></td>
    <td valign="center"  ><p >合理膳食工作的单位食堂 </p></td>
    <td valign="center" ><p >健康步道 </p></td>
    <td valign="center"><p >健康讲座 </p></td>
    <td width="100" valign="center" rowspan="2" ><p >参与建设健康家庭</p></td>
    <td valign="center" rowspan="2" ><p >参与建设健康单位数</p></td>
  </tr>
	</table>
				<table class="table table-striped table-bordered table-hover">
				<thead>
				
  <tr >
    <td width="56" ><p >次数</p></td>
    <td width="80"   ><p >人数 </p></td>
    <td width="110"   ><p >宣传资料</p></td>
    <td width="150"   ><p >支持性工具</p></td>
    <td width="55"   ><p >个数 </p></td>
    <td width="75"   ><p >职工数</p></td>
    <td width="79"   ><p >单位数</p></td>
    <td width="113"   ><p >职工数</p></td>
    <td width="64"   ><p >新增条数 </p></td>
    <td width="40"   ><p >新增长度</p></td>
    <td width="20"   ><p >健康步道总数</p></td>
    <td width="40"   ><p >健康步道总长</p></td>
    <td width="36"   ><p >健身走活动 </p></td>
    <td width="71"   ><p >次数</p></td>
						<td >
							<p>
								人数
							</p>
						</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${datas }" var="jksqgz" varStatus="num">
						<tr>
					   <td>${jksqgz.jkrcs}</td>
					    <td>${jksqgz.jkrrs}</td>
					    <td>${jksqgz.jkrfs}</td>
					    <td>${jksqgz.jkrsl}</td>
					    <td>${jksqgz.lsgs}</td>
					    <td>${jksqgz.lszgs}</td>
					    <td>${jksqgz.kzdws}</td>
					    <td>${jksqgz.kzzgs}</td>
					    <td>${jksqgz.jkts}</td>
					    <td>${jksqgz.jkcd}</td>
					    <td>${jksqgz.jkzs}</td>
					    <td>${jksqgz.jkzc}</td>
					    <td>${jksqgz.jkhd}</td>
					    <td>${jksqgz.jkjzcs}</td>
					    <td>${jksqgz.jkjzrs}</td>
					    <td>${jksqgz.jsjt}</td>
					    <td>${jksqgz.jsdws}</td>
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
				<form action="/jksqgz/check" method="post">
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
				'${pages}', '${count}', '/jksqgz/check/', '/${businessFormId }');
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