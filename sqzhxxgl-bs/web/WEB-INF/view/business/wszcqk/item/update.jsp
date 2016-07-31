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
    <li><a href="/wszcqk/list/1">卫生自查情况记录表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>卫生自查情况记录表</div>
  <div id="panbody">
	<div class="container">
		<form action="/wszcqk/item/update" method="post">

			<table>
			<tr>
					<th>检查时间：</th>
					<td><select id="jcsj" name="jcsj">
					     <option value="第一季度">第一季度</option>
					     <option value="第二季度">第二季度</option>
					     <option value="第三季度">第三季度</option>
					     <option value="第四季度">第四季度</option>
					   </select>
					</td>
				</tr>
				<tr>
					<th>小区环境存在问题整改：</th>
					<td><input type="text"  name="xqhj"  data-rule="required;" value="${wszcqk.xqhj}"> 
					</td>
				</tr>
				<tr>
					<th>垃圾箱房存在问题整改情况：</th>
					<td><input type="text"  name="ljxf"  data-rule="required;" value="${wszcqk.ljxf}"/> 
					</td>
				</tr>
				
				<tr>
					<th>公厕存在问题整改情况：</th>
					<td><input type="text"  name="gc"  data-rule="required;" value="${wszcqk.gc}"/>
					</td>
				</tr>
				<tr>
					<th>公用部位存在问题整改情况：</th>
					<td><input type="text"  name="gybw" data-rule="required;" value="${wszcqk.gybw}"/> 
					</td>
				</tr>
				<tr>
					<th>四害防制存在问题整改情况：</th>
					<td><input type="text"  name="shfz"  data-rule="required;" value="${wszcqk.shfz}"/> 
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${wszcqk.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
 <script src="/scripts/business/wszcqk.js"></script> 
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script type="text/javascript">

	$("#jcsj option[value='${wszcqk.jcsj}']").attr("selected", true);
	</script>
</body>
</html>