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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
    <li><a href="/wzsc/list/1">无照市场</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 无照市场 </div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/wzsc/item/add" method="post">
            <table> 
		       
				<tr>
					<th>市场名称：</th>
					<td><input name="scmc" type="text" data-rule="required;chinese" />
					</td>
				</tr>
				<tr>
					<th>主办方：</th>
					<td><input name="zbf" type="text" data-rule="required;" /></td>
				</tr>
				<tr>
					<th>负责人：</th>
					<td><input name="fzr" type="text" data-rule="required;chinese;length[1~4]" /></td>
				</tr>
				
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;mobile;" />
					</td>
				</tr>
				<tr>
					<th>经营地址：</th>
					<td><input name="jydz" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>经营内容：</th>
					<td><input type="text" name="jynr"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>场内经营户数：</th>
					<td><input type="text" name="jyhs"  data-rule="required;number"/>
					</td>
				</tr>
				<tr>
					<th>房屋性质（是否违章）：</th>
					<td><input name="fwxz" type="radio" value="是" checked="checked"/>是
					    <input name="fwxz" type="radio" value="否" />否
					</td>
				</tr>
				<tr>
					<th>产权所有：</th>
					<td><input name="cqsy" type="text" data-rule="required;" />
					</td>
				</tr>
				
				
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text"  />
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