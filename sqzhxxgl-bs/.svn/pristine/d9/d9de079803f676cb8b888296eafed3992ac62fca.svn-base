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
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
    <li><a href="/sqzamp/list/1">社区治安、安全排摸、矛盾纠纷排查记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 社区治安、安全排摸、矛盾纠纷排查记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/sqzamp/update" method="post">

			<table>
			<tr>
			   <th>时间:</th>
			   <td><input name="sj" type="text" data-rule="required;date" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${sqzamp.sj}"/></td>
			   
			</tr>
			<tr>
			   <th>参加人员:</th>
			   <td><input name="cjry" type="text" data-rule="required;" value="${sqzamp.cjry}"/></td>
			   
			</tr>
			<tr>
			   <th>地点:</th>
			   <td><input name="dz" type="text" data-rule="required;" value="${sqzamp.dz}"/> </td>
			   
			</tr>
			<tr>
			   <th>负责人:</th>
			   <td><input name="fzr" type="text" data-rule="required;" value="${sqzamp.fzr}"/></td>
			   
			</tr>
			<tr>
			   <th>治保:</th>
			   <td><input name="zb" type="text" data-rule="required;" value="${sqzamp.zb}"/> </td>
			   
			</tr>
			<tr>
			   <th>民警:</th>
			   <td><input name="mj" type="text" data-rule="required;" value="${sqzamp.mj}"/> </td>
			   
			</tr>
			<tr>
			   <th>调解员:</th>
			   <td><input name="tjy" type="text" data-rule="required;" value="${sqzamp.tjy}"/></td>
			   
			</tr>
			<tr>
			   <th>物业:</th>
			   <td><input name="wy" type="text" data-rule="required;" value="${sqzamp.wy}"/> </td>
			   
			</tr>
			<tr>
			   <th>协管:</th>
			   <td><input name="xg" type="text" data-rule="required;" value="${sqzamp.xg}"/> </td>
			   
			</tr>
			<tr>
			   <th>其他:</th>
			   <td><input name="qt" type="text" data-rule="required;" value="${sqzamp.qt}"/> </td>
			</tr>
				<tr>
			   <th>排摸、排查内容:</th>
			   <td><input name="nr" type="text" data-rule="required;" value="${sqzamp.nr}"/> </td>
			</tr>
			<tr>
			   <th>存在问题:</th>
			   <td><input name="czwt" type="text" data-rule="required;" value="${sqzamp.czwt}"/> </td>
			</tr>
			<tr>
			   <th>整改措施 :</th>
			   <td><input name="zgcs" type="text" data-rule="required;" value="${sqzamp.zgcs}"/> </td>
			</tr>
			<tr>
			   <th>备注:</th>
			   <td><input name="bz" type="text" value="${sqzamp.bz}"/></td>
			</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${sqzamp.id}">
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