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
    <li><a href="/zzjbqk/list/1">组织基本情况</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 组织基本情况</div>
  <div id="panbody">
	<div class="container">
		<form action="/zzjbqk/item/update" method="post">
			<table>
					<tr>
					<th>单位名称：</th>
					<td colspan="3"><input name="dwmc" type="text" data-rule="required;"  style="width: 600px"  value="${zzjbqk.dwmc }"/>
					</td>
			</tr>
			<tr>
			   <th>面积(km2):</th>
			   <td><input type="text"  name="mj"  data-rule="required;"  value="${zzjbqk.mj }"> </td>
			   <th style="padding-left: 80px">楼栋分布数量:</th>
			   <td><input type="text"  name="ldfbsl"  data-rule="required;number;"   value="${zzjbqk.ldfbsl }"/>   </td>
			</tr>
			<tr>
			   <th>居住总户数:</th>
			   <td><input type="text"  name="jzzhs"  data-rule="required;number;"  value="${zzjbqk.jzzhs }"/> </td>
			   <th style="padding-left: 80px">居住总人口数:</th>
			   <td><input type="text"  name="jzzrks"  data-rule="required;number;"  value="${zzjbqk.jzzrks }"/>   </td>
			</tr>
			<tr>
			   <th>负 责 人:</th>
			   <td><input type="text"  name="fzr"  data-rule="required;"  value="${zzjbqk.fzr }"> </td>
			   <th style="padding-left: 80px">联系电话:</th>
			   <td><input type="text"  name="fzrlxdh"  data-rule="required;"  value="${zzjbqk.fzrlxdh }">   </td>
			</tr>
			<tr>
			   <th>联 系 人:</th>
			   <td><input type="text"  name="lxr"  data-rule="required;"  value="${zzjbqk.lxr }"> </td>
			   <th style="padding-left: 80px">联系电话:</th>
			   <td><input type="text"  name="lxrlxdh"  data-rule="required;"  value="${zzjbqk.lxrlxdh }">   </td>
			</tr>
			<tr>
			   <th>邮政编码:</th>
			   <td><input type="text"  name="yzbm"  data-rule="required;"  value="${zzjbqk.mj }"> </td>
			   <th style="padding-left: 80px">传    真:</th>
			   <td><input type="text"  name="cz"  data-rule="required;"  value="${zzjbqk.mj }">   </td>
			</tr>
				<tr>
			   <th>电子邮箱:</th>
			   <td><input type="text"  name="dzyx"  data-rule="required;" value="${zzjbqk.dzyx }" > </td>
			   <th style="padding-left: 80px">村(居委)网页:</th>
			   <td><input type="text"  name="wy"  data-rule="required;"  value="${zzjbqk.wy }">   </td>
			</tr>
			<tr>
			   <th>通讯地址:</th>
			   <td><input type="text"  name="txdz"  data-rule="required;"  value="${zzjbqk.txdz }"> </td>
			   <th style="padding-left: 80px">工作人员(人):</th>
			   <td><input type="text"  name="gzry"  data-rule="required;number;"  value="${zzjbqk.gzry }">   </td>
			</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zzjbqk.id}">
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