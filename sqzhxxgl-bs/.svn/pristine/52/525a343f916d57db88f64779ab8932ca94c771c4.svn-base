<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/qzhdtd/list/1">上海市嘉定区社区群众活动团队备案表</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="qzhdtd:add">
		  <a style="float: right" href="/qzhdtd/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/qzhdtd/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
          <shiro:hasPermission name="qzhdtd:add">
          <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/qzhdtd/list/1"><i class="icon-share-alt"></i> 返回</a>
		  </shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			
			<tbody>
				<c:forEach items="${datas}" var="qzhdtd" varStatus="num">
				 <tr >
    <td width="157" valign="center" ><p >群团名称 </p></td>
    <td valign="center" colspan="8" ><p >${qzhdtd.qtmc}</p></td>
    <td valign="center" colspan="3" ><p >所属社区 </p></td>
    <td valign="center" colspan="4" ><p >${qzhdtd.sssq}</p></td>
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
  <tr >
					<td colspan="2">
						<div class="btn-group">
						<shiro:hasPermission name="qzhdtd:update">
							<a  class="btn " href="/qzhdtd/item/update/${qzhdtd.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="qzhdtd:delete">
							<a class="btn  b_delete_qzhdtd_item" href="/qzhdtd/item/delete/${qzhdtd.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						  </shiro:hasPermission>
						</div>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	</div>

  </div>

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/qzhdtd/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_qzhdtd_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>