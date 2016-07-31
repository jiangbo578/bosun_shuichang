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
    <li><a href="/xfqcwh/list/1">消防器材维护记录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 消防器材维护记录</div>
  <div id="panbody">
	<div class="container">
		<form action="/xfqcwh/item/update" method="post">

			<table>
			
				<tr>
					<th>器材名称：</th>
					<td><input name="mc" type="text" data-rule="required;" value="${xfqcwh.mc }"/>
					</td>
				</tr>
				<tr>
					<th>配备数量：</th>
					<td><input name="sl" type="text" data-rule="required;number" value="${xfqcwh.sl }"/></td>
				</tr>
				<tr>
					<th>配备日期：</th>
					<td><input name="rq" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate"  value="${xfqcwh.rq }"/>
					</td>
				</tr>
				<tr>
					<th>检查日期：</th>
					<td><input name="jc" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate"  value="${xfqcwh.jc }"/>
					</td>
				</tr>
				<tr>
					<th>检查情况：</th>
					<td><input name="qk" type="text" data-rule="required;" value="${xfqcwh.qk }"/>
					</td>
				</tr>
				<tr>
					<th>检查人：</th>
					<td><input name="cjc" type="text" value="${xfqcwh.cjc }"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text" value="${xfqcwh.bz }"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${xfqcwh.id}">
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