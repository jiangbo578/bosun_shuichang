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
    <li ><a href="/jtfwtwo/list/1">房屋、土地经营（出租）合同登记表</a> <span class="divider">/</span></li>
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
					<c:forEach items="${datas }" var="jtfwtwo" varStatus="num">
					<tr>
					<th><b>合同内容</b></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>合同单位(个人)：</th>
					<td>${ jtfwtwo.htdw }</td>
					<th>合同编号：</th>
					<td>${ jtfwtwo.htbh }</td>
					<th>内容摘要：</th>
					<td>${ jtfwtwo.nrzy }</td>
				</tr>
				<tr>
					<th>是否招投标：</th>
					<td>${ jtfwtwo.sfztb }</td>
					<th>收款总额(元)：</th>
					<td>${ jtfwtwo.skze } </td>
					<th>合同期限(起)：</th>
					<td>${ jtfwtwo.htqxq }</td>
				</tr>
				<tr>
					<th>合同期限(止)：</th>
					<td>${ jtfwtwo.htqxz }</td>
					<th>合同履行情况：</th>
					<td>${ jtfwtwo.htlxqk } </td>
					<th>终止日期：</th>
					<td>${ jtfwtwo.zzrq }</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>${ jtfwtwo.bz }</td>
					<th></th>
					<td> </td>
					<th></th>
					<td> </td>
				</tr>
				<tr>
					<th><b>合同兑现情况</b></th>
					<td></td>
					<th></th>
					<td> </td>
					<th></th>
					<td></td>
				</tr>
				<tr>
					<th>应收款日期：</th>
					<td>${ jtfwtwo.yskrq }</td>
					<th>应收款金额（元）</th>
					<td>${ jtfwtwo.yskje }</td>
					<th>收款日期：</th>
					<td>${ jtfwtwo.skrq } </td>
				</tr>
				<tr>
					<th>收据号码：</th>
					<td>${ jtfwtwo.sjhm }</td>
					<th>收款金额(元)：</th>
					<td>${ jtfwtwo.skje } </td>
					<th>本期未收金额(元)：</th>
					<td>${ jtfwtwo.bqwsje } </td>
				</tr>
				<tr>
					<th>累计未收金额(元)：</th>
					<td>${ jtfwtwo.ljwsje }</td>
					<th>凭证号：</th>
					<td>${ jtfwtwo.pzh }</td>
					<th>登记人：</th>
					<td>${ jtfwtwo.djr } </td>
				</tr>
				<tr>
					<th>日期：</th>
					<td>${ jtfwtwo.rq }</td>
					<th></th>
					<td>		</td>
					<th></th>
					<td></td>
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
				<form action="/jtfwtwo/check" method="post">
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
					'${pages}', '${count}', '/jtfwtwo/check/', '/${businessFormId }');
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