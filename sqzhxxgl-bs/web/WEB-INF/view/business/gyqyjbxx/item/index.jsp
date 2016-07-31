<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body>
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/2">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/gyqyjbxx/list/1">工业企业基本信息</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container">
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  		  <a style="float: right" href="/gyqyjbxx/item/add/${businessFormId}/${gyqyjbxxbt.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
	<a style="float: right;margin-right: 31px;padding-left: 10px" href="/gyqyjbxx/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	 <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/gyqyjbxx/list/1"><i class="icon-share-alt"></i> 返回</a>
		<table class="table table-striped table-bordered table-hover"  >
			<thead>
			<!--  style="TABLE-LAYOUT:fixed;WORD-BREAK:break-all" -->
			
					<tr>
					    <th colspan="7">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;统计单位：${gyqyjbxxbt.cwh}</th>
					    <th colspan="2" width="10%">操作</th>
						
					</tr>
					
				
					<c:forEach var="gyqyjbxx"  items="${datas}" varStatus="num">
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<tH  width="5%">序号</tH>
					<th width="20%" >组织机构代码</th>
					<th width="15%">排污企业详细名称</th>
					<th width="8%">新增</th>
					<th width="20%">详细地址</th>
					<th width="8%">联系人</th>
					<th width="10%">联系电话</th>
					<th width="10%" >行业类别</th>
					
					
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					    <td>${current==1?num.count+0:num.count+(10*(current-1))}</td>
					    <td>${gyqyjbxx.jgdm}</td>
					    <td>${gyqyjbxx.pwmc}</td>
					    <td>${gyqyjbxx.xz}</td>
					    <td>${gyqyjbxx.dz}</td>
					    <td>${gyqyjbxx.lxr}</td>
					    <td>${gyqyjbxx.lxhd}</td>
					    <td>${gyqyjbxx.hylb}</td> 
					 
					
					</tr >
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="10%">工业用水量</th>
					<th>工业煤炭消耗量</th>
				    <th width="10%">重油量</th>
				    <th width="10%">柴油量</th>
				    <th width="10%">洁净燃气消费量</th>
				    <th width="10%">工业锅炉数</th>
				    <th width="10%" colspan="5">污水治理设施数</th>
				   
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					    <td>${gyqyjbxx.ysl}</td> 
					    <td>${gyqyjbxx.mtl}</td> 
					    <td>${gyqyjbxx.zyl}</td> 
					    <td>${gyqyjbxx.cyl}</td> 
					    <td>${gyqyjbxx.jjrql}</td> 
					    <td>${gyqyjbxx.gls}</td> 
					    <td colspan="5">${gyqyjbxx.wsss}</td> 
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					<th width="5%">直排</th>
                    <th  >纳管</th>           
                    <th width="10%">废气治理设施数</th>
				    <th width="15%">危险废物产生量</th>
				    <th width="10%" colspan="2">备注</th>
				    <th width="15"  colspan="3">操作</th>
					</tr>
					<tr class="<c:if test="${num.count%2!=0}">even</c:if>">
					
                        <td>${gyqyjbxx.zg}</td> 
                        <td>${gyqyjbxx.ng}</td>                                          
					    <td>${gyqyjbxx.fqsl}</td>  
					    <td>${gyqyjbxx.wxwsl}</td> 
					    <td colspan="2">${gyqyjbxx.bz}</td>  
					    <td  colspan="3" style="padding-left: 50px">
							
							<div class="btn-group">
							<a  class="btn " href="/gyqyjbxx/item/update/${gyqyjbxx.id }/${businessFormId }/${gyqyjbxxbt.id}"><i class="icon-pencil"></i>修改</a>
							<a  class="btn  b_delete_gyqyjbxx_item" href="/gyqyjbxx/item/delete/${gyqyjbxx.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
						</div>
						
						</td>
					</tr>
					</c:forEach>
					<tr>
					<th colspan="5"> 统计日期：${gyqyjbxxbt.tbrq}</th>
					
					<th colspan="9" align="right"> 统计人员:${gyqyjbxxbt.tbr}</th>
					
					</tr>
				
			</tbody>
		</table>
		<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	</div>
	</div>
  </div>

</div>
<br>
<script src="/scripts/dialog.js"></script>
<script src="/scripts/pagination.js"></script>
<script src="/scripts/jquery.validator.min.js"></script>
<script src="/scripts/zh_CN.js"></script>
<script src="/scripts/base.js"></script>
<script type="text/javascript">
parent.changeheight(document.body.offsetHeight);
    //修改补丁
	var finalllist =$(".btn");
		for(var i=0;i<finalllist.length;i++){
			if($(finalllist[i]).text()=="名单"){
			$(finalllist[i]).html("<i class='icon-folder-open'></i>查看");
			}
		}
</script>
	<script>
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/gyqyjbxx/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());

			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_gyqyjbxx_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>