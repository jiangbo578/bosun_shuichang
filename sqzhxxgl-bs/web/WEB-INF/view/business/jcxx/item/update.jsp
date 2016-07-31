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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/jcxx/list/1">基础信息</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 基础信息</div>
  <div id="panbody">
	<div class="container">
		<form action="/jcxx/item/update" method="post">
			<table>
					<tr>
					<th>专职科普工作人员：</th>
					<td><input name="zzkpry" type="text" data-rule="required;digits;" value="${jcxx.zzkpry}"/>
					</td>
					<th style="padding-left: 80px">兼职科普工作人员：</th>
					<td><input name="jzkpyr" type="text" data-rule="required;digits;" value="${jcxx.jzkpyr}"/></td>
				</tr>
			
				<tr>
					<th>村（居）民担任科普志愿者人数：</th>
					<td><input name="zyzrs" type="text" data-rule="required;digits;" value="${jcxx.zyzrs}"/>
					</td>
					<th style="padding-left: 80px">科普志愿者占居民人数比例：</th>
					<td><input name="bl" type="text" data-rule="required;digits;" value="${jcxx.bl}"/></td>
				</tr>
				<tr>
					<th>科普活动场所：</th>
					<td><input name="hdcs" type="text" data-rule="required;digits;" value="${jcxx.hdcs}"/>
					</td>
					<th style="padding-left: 80px">室内：</th>
					<td><input name="sn" type="text" data-rule="required;digits;" value="${jcxx.sn}"/></td>
				</tr>
				
				<tr>
					<th>室外：</th>
					<td><input name="sw" type="text" data-rule="required;digits;" value="${jcxx.sw}"/>
					</td>
					<th style="padding-left: 80px">科普宣传栏：</th>
					<td><input name="kpxcl" type="text" data-rule="required;digits;" value="${jcxx.kpxcl}"/></td>
				</tr>
				<tr>
					<th>内容更换频率：</th>
					<td><input name="ghpl" type="text" data-rule="required;digits;" value="${jcxx.ghpl}"/>
					</td>
					<th style="padding-left: 80px">科普图书：</th>
					<td><input name="kpts" type="text" data-rule="required;digits;" value="${jcxx.kpts}"/></td>
				</tr>
				<tr>
					<th>科普光盘：</th>
					<td><input name="kpgp" type="text" data-rule="required;digits;" value="${jcxx.kpgp}"/>
					</td>
					<th style="padding-left: 80px">科普展板：</th>
					<td><input name="kpzb" type="text" data-rule="required;digits;" value="${jcxx.kpzb}"/></td>
				</tr>
				<tr>
					<th>科普展品：</th>
					<td><input name="kpzp" type="text" data-rule="required;digits;" value="${jcxx.kpzp}"/>
					</td>
					<th style="padding-left: 80px">科普设备名称：</th>
					<td><input name="kpsbmc" type="text" data-rule="required;digits;" value="${jcxx.kpsbmc}"/></td>
				</tr>
				<tr>
					<th>数量：</th>
					<td><input name="sl" type="text" data-rule="required;digits;" value="${jcxx.sl}"/>
					</td>
					<th style="padding-left: 80px">其他：</th>
					<td><input name="qt" type="text" data-rule="required;digits;" value="${jcxx.qt}"/></td>
				</tr>
				<tr>
					<th>年度科普经费：</th>
					<td><input name="ndkpjf" type="text" data-rule="required;digits;" value="${jcxx.ndkpjf}"/>
					</td>
					<th style="padding-left: 80px">自筹经费：</th>
					<td><input name="zcjf" type="text" data-rule="required;digits;" value="${jcxx.zcjf}"/></td>
				</tr>
				<tr>
					<th>区县财政拨款经费：</th>
					<td><input name="bkjf" type="text" data-rule="required;digits;" value="${jcxx.bkjf}"/>
					</td>
					<th style="padding-left: 80px">科普经费占本单位年度经费比例：</th>
					<td><input name="jfbl" type="text" data-rule="required;float" value="${jcxx.jfbl}"/></td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${jcxx.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	
</body>
</html>