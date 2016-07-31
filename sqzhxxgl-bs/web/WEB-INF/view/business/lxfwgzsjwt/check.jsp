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
    <li ><a href="/lxfwgzsjwt/list/1">联系服务工作收集问题提交单</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>  联系服务工作收集问题提交单</strong></div>
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
					<c:forEach items="${datas}" var="lxfwgzsjwt" varStatus="num">
				 <tr >
    <td width="103" valign="center" ><p >居民区： </p></td>
    <td width="184" valign="center" colspan="3" ><p >${lxfwgzsjwt.jmq}</p></td>
    <td width="117" valign="center" colspan="2" ><p >编号： </p></td>
    <td width="178" valign="center" colspan="2" ><p >${lxfwgzsjwt.bh}</p></td>
  </tr>
  <tr >
    <td width="103" valign="center" ><p >诉求反映人 </p></td>
    <td width="184" valign="center" colspan="3" ><p >${lxfwgzsjwt.sqfyr}</p></td>
    <td width="117" valign="center" colspan="2" ><p >所属责任区 </p></td>
    <td width="178" valign="center" colspan="2" ><p >${lxfwgzsjwt.sszrq}</p></td>
  </tr>
  <tr >
    <td width="103" valign="center" ><p >地址 </p></td>
    <td width="184" valign="center" colspan="3" ><p >${lxfwgzsjwt.dz}</p></td>
    <td width="117" valign="center" colspan="2" ><p >联系方式 </p></td>
    <td width="178" valign="center" colspan="2" ><p >${lxfwgzsjwt.lxfs}</p></td>
  </tr>
  <tr >
    <td width="103" valign="center" ><p >问题简述 </p></td>
    <td width="480" valign="center" colspan="7" ><p >${lxfwgzsjwt.wtjs}</p></td>
  </tr>
 
  <tr>
    <td width="103" valign="center" rowspan="2"><p >问题归类 </p></td>
    
 
  </tr>
  <tr>
    <td width="59" valign="center" colspan="7" ><p >${lxfwgzsjwt.wtgl}</p></td>
    
  </tr>
  <tr>
    <td width="103" height="34" valign="center" ><p >组织科<br />
    处理意见 </p></td>
    <td width="480" valign="center" colspan="7" ><p >${lxfwgzsjwt.zzkclyj}</p></td>
  </tr>
  <tr >
    <td width="103" height="36" valign="center" ><p >职能科室解决情况反馈 </p></td>
    <td width="480" valign="center" colspan="7" ><p >${lxfwgzsjwt.jjqkfk}</p></td>
  </tr>
  <tr >
    <td width="103" height="42" valign="center" ><p >是否需提交领导班子研究 </p></td>
    <td width="480" valign="center" colspan="7" ><p > ${lxfwgzsjwt.ldbzyj}</p></td>
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
				<form action="/lxfwgzsjwt/check" method="post">
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
					'${pages}', '${count}', '/lxfwgzsjwt/check/', '/${businessFormId }');
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