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
    <li ><a href="/zcdygk/list/1">社区（家庭）文明建设活动</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>社区（家庭）文明建设活动</strong></div>
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
			<table  class="table table-striped table-bordered table-hover" style="margin-top: 10px">
		  <tr>
    <td width="577" valign="center" colspan="2" ><p >截至（时间） </p></td>
    <td width="117" valign="center" colspan="2" ><p >${zcdy.jzsj}</p></td>
    <td width="146" valign="center" colspan="3" ><p >党员总数 </p></td>
    <td width="155" valign="center" colspan="2" ><p >${zcdy.dyzs}</p></td>
  </tr>
  <tr>
    <td width="15%" valign="center" ><p >其中，正式党员 </p></td>
    <td width="10%" valign="center" ><p >${zcdy.zsdy}</p></td>
    <td width="184" valign="center" ><p >预备党员 </p></td>
    <td  width="15%" valign="center" ><p >${zcdy.ybdy}</p></td>
    <td  width="10%" valign="center" ><p >退休 </p></td>
    <td  width="10%"valign="center" ><p >${zcdy.tx}</p></td>
    <td width="249" valign="center" ><p >在职 </p></td>
    <td  width="15%"valign="center" colspan="5"><p >${zcdy.zz}</p></td>
  </tr>
   <tr>
    <td width="15%" valign="center" ><p >男党员${zcdy.jzsj} </p></td>
    <td width="10%" valign="center" ><p >${zcdy.ndy}</p></td>
    <td width="13%" valign="center" ><p >女党员</p></td>
    <td  width="15%" valign="center" ><p >${zcdy.nvdy}</p></td>
    <td  width="13%" valign="center" ><p >25岁以下党员</p></td>
    <td  width="10%"valign="center" ><p >${zcdy.ew}</p></td>
    <td width="13%" valign="center" ><p >26-54岁党员 </p></td>
    <td  width="15%"valign="center" colspan="5"><p >${zcdy.ws}</p></td>
  </tr>
  <tr>
    <td width="15%" valign="center" ><p >55-59岁党员</p></td>
    <td width="10%" valign="center" ><p >${zcdy.wj}</p></td>
    <td width="184" valign="center" ><p >60—69岁党员</p></td>
    <td  width="15%" valign="center" ><p >${zcdy.lj}</p></td>
    <td  width="10%" valign="center" ><p >70—80岁党员 </p></td>
    <td  width="10%"valign="center" ><p >${zcdy.bs}</p></td>
    <td width="13%" valign="center" ><p >80岁以上党员 </p></td>
    <td  width="15%"valign="center" colspan="5"><p >${zcdy.bsys}</p></td>
  </tr>
  <tr >
    <td width="40%" style="text-align: center;" colspan="6"  ><p ><b>党员文化程度</b> </p></td>
 
    <td width="155" valign="center"><p >困难党员 </p></td>
    <td width="43" valign="center" ><p >${zcdy.kndy}</p></td>
  </tr>
  <tr >
    <td width="577" valign="center" ><p >初中及以下 </p></td>
    <td width="47" valign="center"  colspan="1" ><p >${zcdy.cz}</p></td>
    <td width="117" valign="center" colspan="2"><p >高中/中专/职高 </p></td>
    <td width="34" valign="center" colspan="2" ><p >${zcdy.gz}</p></td>
    <td width="146" valign="center" ><p >大学及以上 </p></td>
    <td width="31" valign="center" ><p >${zcdy.dx}</p></td>
  </tr>
  
		  </table>
				<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th width="5%">序号</th>
						<th width="10%">姓名</th>
						<th width="5%">性别</th>
						<th width="10%">出生年月</th>
						<th width="10%">身份证</th>
						<th width="10%">文化程度</th>
						<th width="15%">家庭住址</th>
						<th width="10%">入党年月</th>
						<th width="15%">备注</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${datas }" var="zcdygkItem" varStatus="num">
						<tr>
							<td>${num.count }</td>
							<td>${zcdygkItem.xm }</td>
							<td>${zcdygkItem.xb }</td>
							<td><fmt:formatDate pattern='yyyy-MM-dd' value='${zcdygkItem.csny }'/></td>
							<td>${zcdygkItem.idcard }</td>
							<td>${zcdygkItem.whcd }</td>
							<td>${zcdygkItem.jtzz }</td>
							<td><fmt:formatDate pattern='yyyy-MM-dd' value='${zcdygkItem.rdny }'/></td>
							<td>${zcdygkItem.bz }</td>
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
				<form action="/zcdygk/check" method="post">
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
					'${pages}', '${count}', '/zcdygk/check/', '/${businessFormId }');
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