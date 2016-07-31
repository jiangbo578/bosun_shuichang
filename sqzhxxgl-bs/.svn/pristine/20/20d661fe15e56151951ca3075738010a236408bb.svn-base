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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/gyqyjbxx/list/1">工业企业基本信息</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 工业企业基本信息</div>
  <div id="panbody">
	<div class="container">
		<form action="/gyqyjbxx/item/update" method="post">

			<table>
			<tr>
					<th>组织机构代码：</th>
					<td><input name="jgdm" type="text" data-rule="required;" value="${gyqyjbxx.jgdm}"/>
					</td>
					<th style="padding-left: 80px">排污企业详细名称：</th>
					<td><input name="pwmc" type="text" data-rule="required;"  value="${gyqyjbxx.pwmc}"/></td>
				</tr>
			
				
				
				<tr>
					<th>详细地址：</th>
					<td><input name="dz" type="text" data-rule="required;"  value="${gyqyjbxx.dz}"/>
					</td>
					<th style="padding-left: 80px">联系人：</th>
					<td><input name="lxr" type="text" data-rule="required;" value="${gyqyjbxx.lxr}"/></td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="lxhd" type="text" data-rule="required;" value="${gyqyjbxx.lxhd}"/>
					</td>
					<th style="padding-left: 80px">行业类别：</th>
					<td><input name="hylb" type="text" data-rule="required;" value="${gyqyjbxx.hylb}"/></td>
				</tr>
				<tr>
					<th>直排：</th>
					<td><input name="zg" type="text" data-rule="required;" value="${gyqyjbxx.zg}"/>
					</td>
					<th style="padding-left: 80px">纳管：</th>
					<td><input name="ng" type="text" data-rule="required;" value="${gyqyjbxx.ng}"/></td>
				</tr>
				
				<tr>
					<th>工业用水量：</th>
					<td><input name="ysl" type="text" data-rule="required;" value="${gyqyjbxx.ysl}"/>
					</td>
					<th style="padding-left: 80px">工业煤炭消耗量：</th>
					<td><input name="mtl" type="text" data-rule="required;" value="${gyqyjbxx.mtl}"/></td>
				</tr>
				<tr>
					<th>重油量（吨）：</th>
					<td><input name="zyl" type="text" data-rule="required;" value="${gyqyjbxx.zyl}"/>
					</td>
					<th style="padding-left: 80px">柴油量(吨）：</th>
					<td><input name="cyl" type="text" data-rule="required;" value="${gyqyjbxx.cyl}"/></td>
				</tr>
				<tr>
					<th>洁净燃气消费量：</th>
					<td><input name="jjrql" type="text" data-rule="required;" value="${gyqyjbxx.jjrql}"/>
					</td>
					<th style="padding-left: 80px">工业锅炉数：</th>
					<td><input name="gls" type="text" data-rule="required;" value="${gyqyjbxx.gls}"/></td>
				</tr>
				
				<tr>
					<th>污水治理设施数：</th>
					<td><input name="wsss" type="text" data-rule="required;" value="${gyqyjbxx.wsss}"/>
					</td>
					<th style="padding-left: 80px">废气治理设施数：</th>
					<td><input name="fqsl" type="text" data-rule="required;" value="${gyqyjbxx.fqsl}"/></td>
				</tr>
				<tr>
					<th>危险废物产生量：</th>
					<td><input name="wxwsl" type="text" data-rule="required;" value="${gyqyjbxx.wxwsl}"/>
					</td>
					<th style="padding-left: 80px">备注：</th>
					<td><input name="bz" type="text" value="${gyqyjbxx.bz}"/></td>
				</tr>
			  <tr>
					<th>新 增：</th>
					<td><input name="xz" type="radio" value="是" checked="checked"/>是
					    <input name="xz" type="radio" value="否" />否
					</td>
					
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="gyid" value="${gyid}">
					<input type="hidden" name="id" value="${gyqyjbxx.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script type="text/javascript">
	
	$(function() {
		$('input[name=xz][type=radio][value=${gyqyjbxx.xz}]').attr('checked', true);
			});
	</script>
</body>
</html>