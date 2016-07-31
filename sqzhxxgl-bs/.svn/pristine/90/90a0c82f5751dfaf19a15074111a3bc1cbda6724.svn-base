<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<script type="text/javascript" src="../../../split/layer-v1.8.5/layer/layer.min.js"></script>
<script type="text/javascript" src="../../../split/layer-v1.8.5/layer/extend/layer.ext.js"></script></head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/zcdygk/list/1">在册党员概况及名册</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="zcdygk:add">
		  <a style="float: right" href="/zcdygk/item/add/${businessFormId}/${zcdy.id}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </shiro:hasPermission>
		  
   <a style="float: right;margin-right: 31px;padding-left: 10px" href="/zcdygk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
		 <shiro:hasPermission name="zcdygk:add">
		  <a  style="float: right;margin-right: 31px;padding-left: 10px" onclick="swap('editForm');" class="btn btn-info" href="javascript:void(0)"><i class="icon-print"></i>导入</a>
		  <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/zcdygk/list/1"><i class="icon-share-alt"></i> 返回</a>
		 </shiro:hasPermission>
		  <table  class="table table-striped table-bordered table-hover" style="margin-top: 10px">
		  <tr>
    <td width="577" valign="center" colspan="2" ><p >截至（时间） </p></td>
    <td width="117" valign="center" colspan="2" ><p >${zcdy.jzsj}</p></td>
    <td width="146" valign="center" colspan="3" ><p >党员总数 </p></td>
    <td width="155" valign="center" colspan="2" ><p >${zcdy.dyzs}</p></td>
  </tr>
  <tr>
    <td width="15%" valign="center" ><p >其中，正式党员 </p></td>
    <td width="15%" valign="center" ><p >${zcdy.zsdy}</p></td>
    <td width="184" valign="center" ><p >预备党员 </p></td>
    <td  width="15%" valign="center" ><p >${zcdy.ybdy}</p></td>
    <td  width="10%" valign="center" ><p >退休 </p></td>
    <td  width="10%"valign="center" ><p >${zcdy.tx}</p></td>
    <td width="249" valign="center" ><p >在职 </p></td>
    <td  width="15%"valign="center" colspan="5"><p >${zcdy.zz}</p></td>
  </tr>
   <tr>
    <td width="15%" valign="center" ><p >男党员${zcdy.jzsj} </p></td>
    <td width="15%" valign="center" ><p >${zcdy.ndy}</p></td>
    <td width="184" valign="center" ><p >女党员</p></td>
    <td  width="15%" valign="center" ><p >${zcdy.nvdy}</p></td>
    <td  width="10%" valign="center" ><p >25岁以下党员</p></td>
    <td  width="10%"valign="center" ><p >${zcdy.ew}</p></td>
    <td width="249" valign="center" ><p >26-54岁党员 </p></td>
    <td  width="15%"valign="center" colspan="5"><p >${zcdy.ws}</p></td>
  </tr>
  <tr>
    <td width="15%" valign="center" ><p >55-59岁党员</p></td>
    <td width="15%" valign="center" ><p >${zcdy.wj}</p></td>
    <td width="184" valign="center" ><p >60—69岁党员</p></td>
    <td  width="15%" valign="center" ><p >${zcdy.lj}</p></td>
    <td  width="10%" valign="center" ><p >70—80岁党员 </p></td>
    <td  width="10%"valign="center" ><p >${zcdy.bs}</p></td>
    <td width="249" valign="center" ><p >80岁以上党员 </p></td>
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
  
  <tr>
  <td colspan="8"><div class="btn-group">
						<shiro:hasPermission name="zcdygk:update">	<a  class="btn " href="/zcdygk/item/head/update/${zcdy.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a></shiro:hasPermission>
							
						</div></td>
  </tr>
		  </table>
		  <div  id="editForm" style="display: none;padding-top: 10px">
            	<form action="/zcdygk/item/savefile" method="post" enctype="multipart/form-data" onsubmit="return ck();">
            	  <input type="hidden" name="businessFormId" value="${businessFormId}">
            	  <input type="hidden" name="zcdyid" value="${zcdy.id}">
            	  <table class="table table-striped table-bordered">
            		 <tr>
            		 <th style="width: 250px">上传Excel:<b>(格式必须和样张一样,否则上传失败)</b></th>
            		 <td><input name="excel" id="excel" type="file"  />  <a href="#" onclick="dowload('在册党员名册表.xls')">下载Excel样张</a>  </td>
            		
            		 </tr>
            	  			
            	  		<tr>
            	  		<td style="text-align: right;">
                		<button  class="btn btn-primary" type="submit"  ><i class="icon-ok-sign"></i>上传</button>
					
            	  		
            	  		</td>
            	  			<td><button  class="btn btn-info" type="button" onclick="swap('editForm');" ><i class="icon-share-alt"></i>取消</button></td>
            	  		</tr>
            	  </table>
                   
               
                </form>
            </div>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px;TABLE-LAYOUT:fixed;WORD-BREAK:break-all" >
			<thead>
		
				<tr>
					<th width="5%">序号</th>
					<th width="8%">姓名</th>
					<th width="5%">性别</th>
					<th width="8%">出生年月</th>
					<th width="10%">身份证</th>
					<th width="8%">文化程度</th>
					<th width="15%">家庭住址</th>
					<th width="10%">入党年月</th>
					<th width="11%">联系方式</th>
					<th width="10%">备注</th>
					<th width="15%">操作</th>
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
						<td>${zcdygkItem.rdny }</td>
						<td >${zcdygkItem.phone }</td>
						<td >${zcdygkItem.bz }</td>
						<td>
						<div class="btn-group">
						<shiro:hasPermission name="zcdygk:update">
							<a  class="btn " href="/zcdygk/item/update/${zcdygkItem.id}/${businessFormId }/${zcdy.id}"><i class="icon-pencil"></i>修改</a>
							</shiro:hasPermission>
							<shiro:hasPermission name="zcdygk:delete">
							<a class="btn  b_delete_zcdygk_item" href="/zcdygk/item/delete/${zcdygkItem.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
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
	function ck(){
		var excel=document.getElementById("excel").value;
		if(excel.substring(excel.lastIndexOf('.')+1,excel.length)!='xls'){
			alert("只能上传Excel文件");
			return false;
		}
		return true;
	}
	function dowload(filename) {

		var filename = filename.replace(".", "|");
		window.location.href = "/download/" + filename;
	}
		$(function() {
			//分页
			var pagination = new buguPagination('${current}',
					'${pages}', '${count}', '/zcdygk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_zcdygk_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>