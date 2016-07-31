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
    <li ><a href="/cwhjcqk/list/1">村委会基础情况</a> <span class="divider">/</span></li>
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
					<c:forEach items="${datas }" var="cwhjcqk" varStatus="num">
										<tr>
					<th>土地总面积(亩)：</th>
					<td>${ cwhjcqk.tdzmj }</td>
					<th>耕地面积(亩)：</th>
					<td>${ cwhjcqk.gdmj }</td>
					<th>非耕地面积(亩)：</th>
					<td>${ cwhjcqk.fgdmj }</td>
					<th>村民小组数(个)：</th>
					<td>${ cwhjcqk.cmxzs }</td>
				</tr>
				<tr>
					<th>可支配资金(万元)：</th>
					<td>${ cwhjcqk.kzpzj }</td>
					<th>劳动收入(元/人)：</th>
					<td>${ cwhjcqk.ldsr }</td>
					<th>人均收入(元/人)：</th>
					<td>${ cwhjcqk.rjsr }</td><th></th><td></td>
				</tr>
				<tr>
					<th><span style="color: red">五好文明家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ cwhjcqk.whwmjtqg }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.whwmjtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ cwhjcqk.whwmjtsj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.whwmjtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ cwhjcqk.whwmjtqj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.whwmjtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ cwhjcqk.whwmjtjdj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.whwmjtjdjbl }</td>
				</tr>	
				<tr>
					<th><span style="color: red">学习型家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ cwhjcqk.xxxjtqg }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.xxxjtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ cwhjcqk.xxxjtsj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.xxxjtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ cwhjcqk.xxxjtqj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.xxxjtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ cwhjcqk.xxxjtjdj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.xxxjtjdjbl }</td>
				</tr>
					<tr>
					<th><span style="color: red">平安家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ cwhjcqk.pajtqg }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.pajtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ cwhjcqk.pajtsj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.pajtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ cwhjcqk.pajtqj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.pajtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ cwhjcqk.pajtjdj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.pajtjdjbl }</td>
				</tr>
				<tr>
					<th><span style="color: red">绿色家庭</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>全国级(户数)：</th>
					<td>${ cwhjcqk.lsjtqg }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.lsjtqgbl }</td>
					<th>市级(户数)：</th>
					<td>${ cwhjcqk.lsjtsj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.lsjtsjbl }</td>
				</tr>	
				<tr>
					<th>区级(户数)：</th>
					<td>${ cwhjcqk.lsjtqj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.lsjtqjbl }</td>
					<th>街道级(户数)：</th>
					<td>${ cwhjcqk.lsjtjdj }</td>
					<th>占比例：</th>
					<td>${ cwhjcqk.lsjtjdjbl }</td>
				</tr>
				<tr>
					<th><span style="color: red">消防基础情况信息（消防）</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>其中消防宣传栏数：</th>
					<td>${ cwhjcqk.qzxfxcls }</td>
					<th>市消防火栓：</th>
					<td>${ cwhjcqk.sxfhs }</td>
					<th>小网格：</th>
					<td>${ cwhjcqk.xwg }</td><th></th><td></td>
				</tr>	
					<tr>
					<th><span style="color: red">爱国卫生与健康城市基础情况信息</span></th><td></td><th></th><td></td><th></th><td></td><th></th><td></td>
				</tr>
				<tr>
					<th>村卫生干部姓名：</th>
					<td>${ cwhjcqk.cwsgbxm }</td>
					<th>联系电话：</th>
					<td>${ cwhjcqk.lxdh }</td>
					<th>垃圾容器间(座)：</th>
					<td>${ cwhjcqk.ljrqj }</td>
					<th>公共厕所(座)</th>
					<td>${ cwhjcqk.ggcs }</td>
				</tr>	
					<tr>
					<th>使用自来水总户数(户)：</th>
					<td>${ cwhjcqk.syzlszhs}</td>
					<th>普及率(%)：</th>
					<td>${ cwhjcqk.zlspjl }</td>
					<th>使用卫生户厕总户数(户)：</th>
					<td>${ cwhjcqk.sywshcs }</td>
					<th>普及率(%)：</th>
					<td>${ cwhjcqk.wshcpjl }</td>
				</tr>	
				<tr>
					<th>健康宣传栏(个)：</th>
					<td>${ cwhjcqk.jkxcl }</td>
					<th>水井：</th>
					<td>${ cwhjcqk.sj }</td>
					<th></th>
					<td></td>
					<th></th>
					<td>	</td>
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
				<form action="/cwhjcqk/check" method="post">
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
					'${pages}', '${count}', '/cwhjcqk/check/', '/${businessFormId }');
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