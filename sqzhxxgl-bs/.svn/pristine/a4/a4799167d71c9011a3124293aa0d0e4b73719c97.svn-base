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
    <li><a href="/taizhang/list/党群工作">4</a> <span class="divider">/</span></li>
    <li ><a href="/qzhdtd/list/1">上海市嘉定区社区群众活动团队备案表</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>  上海市嘉定区社区群众活动团队备案表</strong></div>
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
					<c:forEach items="${datas}" var="qzhdtd" varStatus="num">
				 <tr >
    <td width="15%" valign="center" ><p >群团名称 </p></td>
    <td valign="center" colspan="7" ><p >${qzhdtd.qtmc}</p></td>
    <td valign="center" colspan="3" ><p >所属社区 </p></td>
    <td valign="center" colspan="3" ><p >${qzhdtd.sssq}</p></td>
  </tr>
  <tr >
    <td width="157" valign="center" ><p >成立时间 </p></td>
    <td valign="center" colspan="8" ><p >${qzhdtd.clsj}</p></td>
    <td valign="center" colspan="3" ><p >活动地点 </p></td>
    <td valign="center" colspan="4" ><p >${qzhdtd.hddz}</p></td>
  </tr>
  <tr >
    <td width="157" valign="center" ><p >活动内容 </p></td>
    <td valign="center" colspan="15" ><p >${qzhdtd.hdnr}</p></td>
  </tr>
  <tr >
    <td width="157" valign="center" ><p >活动时间 </p></td>
    <td valign="center" colspan="8" ><p >${qzhdtd.hdsj}</p></td>
    <td valign="center" colspan="5" ><p >每周活动次数 </p></td>
    <td valign="center" colspan="2" ><p >${qzhdtd.mzhdcs}</p></td>
  </tr>
  <tr >
    <td width="157" valign="center" ><p >参加人数 </p></td>
    <td valign="center" colspan="8" ><p >${qzhdtd.cjrs}</p></td>
    <td valign="center" colspan="5" ><p >其中中共党员人数 </p></td>
    <td valign="center" colspan="2" ><p >${qzhdtd.dyrs}</p></td>
  </tr>
  <tr >
    <td valign="center" colspan="16" ><p >负责人或召集人情况 </p></td>
  </tr>
  <tr >
    <td width="157" valign="center" width="10%" ><p >姓名 </p></td>
    <td valign="center" colspan="2" width="10%" ><p >性别 </p></td>
    <td valign="center" colspan="2" width="10%"  ><p >年龄 </p></td>
    <td valign="center"             width="20%"><p >政治面貌 </p></td>
    <td valign="center" colspan="4" width="20%"><p >家庭地址 </p></td>
    <td valign="center"  width="30%"  colspan="5" ><p >工作单位 </p></td>
    <td width="10%" valign="center" ><p >联系电话 </p></td>
  </tr>
  <tr >
    <td width="157" valign="center" ><p >${qzhdtd.fzrxm}</p></td>
    <td valign="center" colspan="2" ><p >${qzhdtd.fzrxb}</p></td>
    <td valign="center" colspan="2" ><p >${qzhdtd.fzrnl}</p></td>
    <td width="265" valign="center" ><p >${qzhdtd.fzrzzmm}</p></td>
    <td valign="center" colspan="4" ><p >${qzhdtd.fzrjtzz}</p></td>
    <td valign="center" colspan="5" ><p >${qzhdtd.fzrgzdw}</p></td>
    <td width="10%" valign="center" ><p >${qzhdtd.fzrlxdh}</p></td>
  </tr>
 
  <tr >
    <td valign="center" colspan="16" ><p >政治指导员（或党建联络员）情况</p></td>
  </tr>
  <tr><td>委派情况</td>
      <td colspan="15">${ qzhdtd.wpqk}</td>
  </tr>
  <tr >
    <td width="157" valign="center" ><p >姓名 </p></td>
    <td valign="center" colspan="2" ><p >性别 </p></td>
    <td valign="center" colspan="2" ><p >年龄 </p></td>
    <td width="200px" valign="center" ><p >工作单位及职务 </p></td>
    <td valign="center" colspan="6" width="20%"><p >所属党组织</p></td>
    <td valign="center"  width="30%" colspan="5" ><p >联系电话</p></td>
    
  </tr>
  <tr >
    <td width="157" valign="center" ><p >${qzhdtd.zdyxm}</p></td>
    <td valign="center" colspan="2" ><p >${qzhdtd.zdyxb}</p></td>
    <td valign="center" colspan="2" ><p >${qzhdtd.zdynl}</p></td>
    <td width="265" valign="center" ><p >${qzhdtd.zdygzdw}</p></td>
    <td valign="center" colspan="6" ><p >${qzhdtd.dzz}</p></td>
    <td valign="center" colspan="5" ><p >${qzhdtd.zdylxdh}</p></td>
 
  </tr>

  <tr>
    <td width="157" valign="center" ><p >所在社区备案意见  </p>
  </td>
    <td valign="center" colspan="10" ><p >${qzhdtd.sqbayj}
    </p>
    </td>
    <td>日期:</td>
    <td colspan="5">${qzhdtd.bnny}</td>
  </tr>
  <tr>
    <td width="157" valign="center" ><p >街镇审核意见 </p>
   </td>
    <td valign="center" colspan="10" ><p >${qzhdtd.shyj}</p>
     </td>
     <td>日期:</td>
    <td colspan="5">${qzhdtd.shyjny}</td>
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
				<form action="/qzhdtd/check" method="post">
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
					'${pages}', '${count}', '/qzhdtd/check/', '/${businessFormId }');
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