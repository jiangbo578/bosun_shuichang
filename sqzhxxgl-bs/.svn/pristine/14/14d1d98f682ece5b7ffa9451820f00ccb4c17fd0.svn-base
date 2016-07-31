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
    <li ><a href="/lxfwqzgz/list/1">联系服务群众工作统计表</a> <span class="divider">/</span></li>
    <li class="active">审核报表</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>  联系服务群众工作统计表</strong></div>
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
				<c:forEach items="${datas}" var="lxfwqzgz" varStatus="num">
				<tr >
    <td width="412" valign="center" colspan="2" ><p >月统计台帐项目 </p></td>
    <td width="75" valign="center" ><p >当月数 </p></td>
    <td width="74" valign="center" ><p >累计数 </p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >入户走访（户） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.rhzfys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.rhzfljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >非入户走访（户） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.frhzfys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.frhzfljs}</p></td>
  </tr>
  <tr>
    <td width="242" valign="center" rowspan="6" ><p >意见建议类（件） </p></td>
    <td width="170" valign="center" ><p >民生类 </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.mslys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.mslljs}</p></td>
  </tr>
  <tr>
    <td width="170" valign="center" ><p >公共环境卫生类 </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.wslys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.wslljs}</p></td>
  </tr>
  <tr>
    <td width="170" valign="center" ><p >物业管理类 </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.wygllys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.wygllljs}</p></td>
  </tr>
  <tr>
    <td width="170" valign="center" ><p >治安管理类 </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.zagllys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.zagllljs}</p></td>
  </tr>
  <tr >
    <td width="170" valign="center" ><p >其它类 </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.qtlys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.qtlljs}</p></td>
  </tr>
  <tr>
    <td width="170" valign="center" ><p >合计 </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.hjys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.hjljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >征询问题类（件） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.zxwtlys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.zxwtlljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >居民区已解决问题（件） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.jmqyjjys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.jmqyjjljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >块层面自行解决（件） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.kczxjjys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.kczxjjljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >街镇层面协调解决（件） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.cmxtjjys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.cmxtjjljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >双代表解决（件） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.sdbjjys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.sdbjjljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >短时期内难以解决（件） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.nyjjys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.nyjjljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >化解重大矛盾（起） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.hjzdmdys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.hjzdmdljs}</p></td>
  </tr>
  <tr>
    <td width="412" valign="center" colspan="2" ><p >上报街道待解决问题（件） </p></td>
    <td width="75" valign="center" ><p >${lxfwqzgz.djjwtys}</p></td>
    <td width="74" valign="center" ><p >${lxfwqzgz.djjwtljs}</p></td>
  </tr>
  <tr>
    <td width="242" valign="center" ><p >上年未解决问题（起） </p></td>
    <td width="319" valign="center" colspan="3" ><p >${lxfwqzgz.sbnwjj}</p></td>
  </tr>
  <tr>
    <td width="242" valign="center" ><p >上年遗留问题解决 </p></td>
    <td width="319" valign="center" colspan="3" ><p >${lxfwqzgz.sbnyl}</p></td>
  </tr>
  <tr>
    <td width="242" valign="center" ><p >块数 </p></td>
    <td width="319" valign="center" colspan="3" ><p >${lxfwqzgz.ks}</p></td>
  </tr>
  <tr>
    <td width="242" valign="center" ><p >组团力量（人） </p></td>
    <td width="319" valign="center" colspan="3" ><p >${lxfwqzgz.ztll}</p></td>
  </tr>
  <tr>
    <td width="242" valign="center" ><p >备注 </p></td>
    <td width="319" valign="center" colspan="3" ><p >${lxfwqzgz.bz}</p></td>
  </tr>
  <tr>
    <td width="242" valign="center" ><p >填报人签名 </p></td>
    <td width="319" valign="center" colspan="3" ><p > ${lxfwqzgz.tbrqm}</p></td>
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
				<form action="/lxfwqzgz/check" method="post">
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
					'${pages}', '${count}', '/lxfwqzgz/check/', '/${businessFormId }');
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