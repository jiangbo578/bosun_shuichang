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
    <li><a href="/ywpx/list/1">业务培训（学习）记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 业务培训（学习）记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/ywpx/item/update" method="post">

			<table>
			<tr>
					<th>地点：</th>
					<td><input name="dd" type="text" data-rule="required;chinese" id="dd" value="${ywpx.dd }"/>
					</td>
				</tr>
				<tr>
					<th>时间：</th>
					<td><input name="sj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="sj" value="${ywpx.sj }"/>
					</td>
				</tr>
				<tr>
					<th>培训内容：</th>
					<td><input name="pxnr" type="text" id="pxnr" value="${ywpx.pxnr }"/>
					</td>
				</tr>
				<tr>
					<th>主讲人或召集人：</th>
					<td><input name="zjr" type="text" id="zjr" value="${ywpx.zjr }"/>
					</td>
				</tr>
				<tr>
					<th>出席范围：</th>
					<td><input name="cxfw" type="text" id="cxfw" value="${ywpx.cxfw }"></input>
					</td>
				</tr>
				<tr>
					<th>人数：</th>
					<td><input name="rs" type="text" id="rs" value="${ywpx.rs }"></input>
					</td>
				</tr>
				<tr>
					<th>办班名称：</th>
					<td><input name="bbmc" type="text" id="bbmc" value="${ywpx.bbmc}"/>
					</td>
				</tr>
				<tr>
					<th>教学课时：</th>
					<td><input name="jxks" type="text" id="jxks" value="${ywpx.jxks}"/>
					</td>
				</tr>
				<tr>
					<th>标准人数：</th>
					<td><input name="bzrs" type="text" id="bzrs" value="${ywpx.bzrs}"/>
					</td>
				</tr>
				<tr>
					<th>培训期限：</th>
					<td><input name="pxqx" type="text" id="pxqx" value="${ywpx.pxqx}"/>
					</td>
				</tr>
				<tr>
					<th>类别：</th>
					<td><input name="type" type="text" id="type" value="${ywpx.type}"/>
					</td>
				</tr>
				<tr>
					<th>所属业务线：</th>
					<td><input name="ssywx" type="text" id="ssywx" value="${ywpx.ssywx}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${ywpx.id}">
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