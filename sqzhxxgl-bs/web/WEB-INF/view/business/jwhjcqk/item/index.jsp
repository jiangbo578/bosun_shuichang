<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/jwhjcqk/list/1">居委会基础情况</a> <span class="divider">/</span></li>
    <li class="active">${businessForm.name}</li>
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>报表数据</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  <span style="font-size: 28px;margin-left: 20%">${businessForm.name}</span>
		  <shiro:hasPermission name="jwhjcqk:add">
		  <c:if test="${fn:length(datas)==0}">
		  <a style="float: right" href="/jwhjcqk/item/add/${businessFormId}" class="btn btn-success "><i class="icon-plus"></i>添加记录</a>
		  </c:if>
		  </shiro:hasPermission>
          <a style="float: right;margin-right: 31px;padding-left: 10px" href="/jwhjcqk/export/${businessFormId }" class="btn btn-info"><i class="icon-print"></i>导出</a>
	     <shiro:hasPermission name="jwhjcqk:add">
	      <a style="float: right;margin-right: 31px;padding-left: 10px"  class="btn btn-info" href="/jwhjcqk/list/1"><i class="icon-share-alt"></i> 返回</a>
		</shiro:hasPermission>
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			
			<tbody>
				<c:forEach items="${datas }" var="jwhjcqk" varStatus="num">
				<tr style="width: 100%">
					<th  >物业公司名称:</th>
					<td >${ jwhjcqk.wygsmc }</td>
					<th >物业公司个数:</th>
					<td >${ jwhjcqk.wygsgs }</td>
					<th >保安个数:</th>
					<td>${ jwhjcqk.bags }</td>
					<th >居委会办公用房面积:</th>
					<td >${ jwhjcqk.jwhbgyfmj }<b>㎡</b></td>
				</tr>
				<tr>
					<th>活动室面积：</th>
					<td>${ jwhjcqk.hdsmj }<b>㎡</b></td>
					<th>辖区占地面积：</th>
					<td>${ jwhjcqk.xqzdmj }<b>㎡</b></td>
					<th>房屋建筑面积：</th>
					<td>${ jwhjcqk.fwjzmj }<b>㎡</b></td>
					<th>绿化面积：</th>
					<td>${ jwhjcqk.lhmj }<b>㎡</b></td>
				</tr>
				<tr>
					<th>居民住宅小区(个)：</th>
					<td>${ jwhjcqk.jmzzxq }</td>
					<th>住宅楼(幢)：</th>
					<td>${ jwhjcqk.zzl }</td>
					<th>小区楼道数：</th>
					<td>${ jwhjcqk.xqlds }</td>
					<th>睦邻点：</th>
					<td>${ jwhjcqk.mld }</td>
				</tr>
				<tr>
					<th>辖区单位：</th>
					<td>${ jwhjcqk.xqdw }</td>
					<th>共建签约单位：</th>
					<td>${ jwhjcqk.gjqydw }</td>
						<th>文明楼数：</th>
					<td>${ jwhjcqk.wmls }</td>
					<th>市级文明楼数：</th>
					<td>${ jwhjcqk.sjwmls }</td>
				</tr>
					<tr>
					<th>区级文明楼数：</th>
					<td>${ jwhjcqk.qjwmls }</td>
					<th>街道级文明楼数：</th>
					<td>${ jwhjcqk.jdjwmls }</td>
					<td></td><td></td><td></td><td></td>
				</tr>
				
				<tr>
					<th><span style="color: red">五好文明家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ jwhjcqk.whwmjtqg }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.whwmjtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ jwhjcqk.whwmjtsj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.whwmjtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ jwhjcqk.whwmjtqj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.whwmjtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ jwhjcqk.whwmjtjdj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.whwmjtjdjbl }</td>
				</tr>	
				<tr>
					<th><span style="color: red">学习型家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ jwhjcqk.xxxjtqg }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.xxxjtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ jwhjcqk.xxxjtsj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.xxxjtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ jwhjcqk.xxxjtqj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.xxxjtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ jwhjcqk.xxxjtjdj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.xxxjtjdjbl }</td>
				</tr>
					<tr>
					<th><span style="color: red">平安家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ jwhjcqk.pajtqg }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.pajtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ jwhjcqk.pajtsj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.pajtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ jwhjcqk.pajtqj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.pajtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ jwhjcqk.pajtjdj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.pajtjdjbl }</td>
				</tr>
				<tr>
					<th><span style="color: red">绿色家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ jwhjcqk.lsjtqg }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.lsjtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ jwhjcqk.lsjtsj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.lsjtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ jwhjcqk.lsjtqj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.lsjtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ jwhjcqk.lsjtjdj }</td>
					<th>占比例：</th>
					<td>${ jwhjcqk.lsjtjdjbl }</td>
				</tr>
				<tr>
					<th><span style="color: red">消防基础情况信息（消防）</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>其中消防宣传栏数：</th>
					<td>${ jwhjcqk.qzxfxcls }</td>
					<th>市消防火栓：</th>
					<td>${ jwhjcqk.sxfhs }</td>
					<th>小网格：</th>
					<td>${ jwhjcqk.xwg }</td><th></th><td></td>
				</tr>	
					<tr>
					<th><span style="color: red">爱国卫生与健康城市基础情况信息</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
				<th>居委卫生干部姓名：</th>
					<td>${ jwhjcqk.lxxm }</td>
					<th>联系电话:</th>
					<td>${ jwhjcqk.lxdh }</td>
					<th></th>
					<td></td>
					<th></th>
					<td></td>
				</tr>
					
				<tr>
					<th>垃圾箱房：</th>
					<td>${ jwhjcqk.ljxf }</td>
					<th>公共厕所(座)</th>
					<td>${ jwhjcqk.ggcs }</td>
					<th>健康宣传栏(个)：</th>
					<td>${ jwhjcqk.jkxcl }</td>
					<th></th>
					<td></td>
			</tr>
					<tr>
					
					
					<td colspan="10">	
					<shiro:hasPermission name="jwhjcqk:update">
					<a  class="btn " href="/jwhjcqk/item/update/${jwhjcqk.id}/${businessFormId }"><i class="icon-pencil"></i>修改</a>
					</shiro:hasPermission>
					<shiro:hasPermission name="jwhjcqk:delete">
					<a class="btn  b_delete_item" href="/jwhjcqk/item/delete/${jwhjcqk.id }/${businessFormId }" ><i class="icon-trash"></i>删除</a>
					</shiro:hasPermission>
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
					'${pages}', '${count}', '/jwhjcqk/item/', '/${businessFormId }');
			$('#b_pagination').html(pagination.show());
	
			var dialog = buguDialog.init('删除确认', '确认要删除该名单吗?');
			$('.b_delete_item').on('click', function() {
				dialog.setHref(this.href);
				dialog.show();
				return false;
			});

		});
	</script>
</body>
</html>