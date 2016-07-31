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
    <li ><a href="/jwhjcqk/list/1">居委会基础情况</a> <span class="divider">/</span></li>
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
				<tbody>
					<c:forEach items="${datas }" var="jwhjcqk" varStatus="num">
										<tr style="width: 100%">
					<td  >物业公司名称:</td>
					<td >${ jwhjcqk.wygsmc }</td>
					<td >物业公司个数:</td>
					<td >${ jwhjcqk.wygsgs }</td>
				</tr>
				<tr>
					<td >保安个数:</td>
					<td>${ jwhjcqk.bags }</td>
					<td >居委会办公用房面积:</td>
					<td >${ jwhjcqk.jwhbgyfmj }</td>
				</tr>
				<tr>
					<td>活动室面积：</td>
					<td>${ jwhjcqk.hdsmj }</td>
					<td>辖区占地面积：</td>
					<td>${ jwhjcqk.xqzdmj }</td>
				</tr>
					<tr>
					<td>房屋建筑面积：</td>
					<td>${ jwhjcqk.fwjzmj }</td>
					<td>绿化面积：</td>
					<td>${ jwhjcqk.lhmj }</td>
				</tr>
				<tr>
					<td>居民住宅小区(个)：</td>
					<td>${ jwhjcqk.jmzzxq }</td>
					<td>住宅楼(幢)：</td>
					<td>${ jwhjcqk.zzl }</td>
				</tr>
				<tr>
					<td>小区楼道数：</td>
					<td>${ jwhjcqk.xqlds }</td>
					<td>睦邻点：</td>
					<td>${ jwhjcqk.mld }</td>
				</tr>
				<tr>
					<td>辖区单位：</td>
					<td>${ jwhjcqk.xqdw }</td>
					<td>共建签约单位：</td>
					<td>${ jwhjcqk.gjqydw }</td>
				</tr>
				<tr>
					<td>文明楼数：</td>
					<td>${ jwhjcqk.wmls }</td>
					<td>市级文明楼数：</td>
					<td>${ jwhjcqk.sjwmls }</td>
				</tr>
					<tr>
					<td>区级文明楼数：</td>
					<td>${ jwhjcqk.qjwmls }</td>
					<td>街道级文明楼数：</td>
					<td>${ jwhjcqk.jdjwmls }</td>
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
					<th>垃圾厢房：</th>
					<td>${ jwhjcqk.ljxf }</td>
					<th>公共厕所(座)</th>
					<td>${ jwhjcqk.ggcs }</td>
					<th>健康宣传栏(个)：</th>
					<td>${ jwhjcqk.jkxcl }</td>
					<th></th>
					<td></td>
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
				<form action="/jwhjcqk/check" method="post">
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
					'${pages}', '${count}', '/jwhjcqk/check/', '/${businessFormId }');
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