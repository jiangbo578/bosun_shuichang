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
    <li ><a href="/jtfwone/list/1">房屋、土地经营（出租）合同登记表</a> <span class="divider">/</span></li>
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
					<c:forEach items="${datas }" var="jtfwone" varStatus="num">
					<tr>
					<th><span style="color: red">集体房屋土地出租</span></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>房屋位置(地址):</th>
					<td>${jtfwone.fwwz }</td>
					<th>门牌号:</th>
					<td>${jtfwone.mph }</td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>房屋总面积:</th>
					<td>${jtfwone.fwzmj }</td>
					<th>其中:有证面积:</th>
					<td>${jtfwone.fwyzmj }</td>
					<th>其中:无证面积</th>
					<td>${jtfwone.fwwzmj }</td>
				</tr>
				<tr>
					<th>已出租总面积:</th>
					<td>${jtfwone.yczzmj }</td>
					<th>其中:有证面积:</th>
					<td>${jtfwone.yczyzmj }</td>
					<th>其中:无证面积</th>
					<td>${jtfwone.yczwzmj }</td>
				</tr>
				<tr>
					<th>土地位置:</th>
					<td>${jtfwone.tdwz }</td>
					<th></th>
					<td></td>
					<th>宗地号:</th>
					<td>${jtfwone.zdh }</td>
				</tr>
				<tr>
					<th><span style="color: blue">地块总面积:</span></th>
					<td> ${jtfwone.dkzmj }</td>
					<th></th>
					<td></td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>有证面积:</th>
					<td> ${jtfwone.dyzmj }</td>
					<th>其中:农用地</th>
					<td>${jtfwone.dyzny }</td>
					<th>其中:非农用</th>
					<td>${jtfwone.dyzfn } </td>
				</tr>
				<tr>
					<th>无证面积:</th>
					<td>${jtfwone.dwzmj } </td>
					<th>其中:农用地</th>
					<td> ${jtfwone.dwzny }</td>
					<th>其中:非农用</th>
					<td>${jtfwone.dwzfn } </td>
				</tr>
				<tr>
					<th><span style="color: blue">已出租地块总面积:</span></th>
					<td> ${jtfwone.ydkzmj }</td>
					<th></th>
					<td></td>
					<th></th>
					<td> </td>
				</tr>
					<tr>
					<th>有证面积:</th>
					<td>${jtfwone.yyzmj }</td>
					<th>其中:农用地</th>
					<td> ${jtfwone.yyzny }</td>
					<th>其中:非农用</th>
					<td>${jtfwone.yyzfn } </td>
				</tr>
				<tr>
					<th>无证面积:</th>
					<td>${jtfwone.ywzmj } </td>
					<th>其中:农用地</th>
					<td>${jtfwone.ywzny } </td>
					<th>其中:非农用</th>
					<td> ${jtfwone.ywzfn }</td>
				</tr>
				<tr>
					<th><span style="color: red">集体土地出租:</span></th>
					<td> </td>
					<th></th>
					<td></td>
					<th></th>
					<td> </td>
				</tr>
				<tr>
					<th>出租总面积:</th>
					<td>${jtfwone.tdczmj } </td>
					<th>其中:农用地</th>
					<td> ${jtfwone.tdczny } </td>
					<th>其中:非农用</th>
					<td>${jtfwone.tdczfn }</td>
				</tr>
				<tr>
					<th></th>
					<td> </td>
					<th>登记人:</th>
					<td>${jtfwone.djr } </td>
					<th>日期:</th>
					<td> ${jtfwone.rq }</td>
				</tr>
				<tr style="height: 20px"></tr>
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
				<form action="/jtfwone/check" method="post">
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
					'${pages}', '${count}', '/jtfwone/check/', '/${businessFormId }');
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