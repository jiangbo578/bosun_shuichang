<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<title>添加</title>
</head>
<body>
  <ul class="breadcrumb" style="margin-bottom: 5px;">
    <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/dbdxcjnd/list/1">低保对象参加公益性社区服务劳动情况季度登记表</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 低保对象参加公益性社区服务劳动情况季度登记表 </div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/dbdxcjnd/item/add" method="post">
            <table> 
		       
				<tr>
					<th>救助编号：</th>
					<td><input name="jzdh" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>参加对象姓名：</th>
					<td><input name="cjdxxm" type="text" data-rule="required;" /></td>
				</tr>
				<tr>
					<th>劳动项目：</th>
					<td><input name="ldxm" type="text" data-rule="required;" /></td>
				</tr>
				
				<tr>
					<th>月份：</th>
					<td><input name="yue" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>日期：</th>
					<td><input name="rq" type="text" data-rule="required;" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" />
					</td>
				</tr>
				<tr>
					<th>参加劳动时间(小时)：</th>
					<td><input type="text" name="ldsj"  data-rule="required;"/>
					</td>
				</tr>
				
					<tr>
					<th>本人签名：</th>
					<td><input name="brqm" type="text" data-rule="required;" />
					</td>
				</tr>
				
				
				<tr>
					<th>负责人签名：</th>
					<td><input name="fzrqm" type="text" data-rule="required;" />
					</td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
				</tr>
			</table>
		</form>
	</div>


	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>