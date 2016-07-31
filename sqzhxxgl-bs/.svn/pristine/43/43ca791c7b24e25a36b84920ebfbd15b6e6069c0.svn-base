<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<script>
	$(function(){
			$("input[type=radio][value=${qzwhtd.sex}]").attr("checked",true);
			$("input[type=radio][value=${qzwhtd.type}]").attr("checked",true);
		});	

</script>
</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/1">基础情况</a> <span class="divider">/</span></li>
    <li><a href="/qzwhtd/list/1">群众文化团队名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>群众文化团队名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/qzwhtd/item/update" method="post">

			<table>
	
				<tr>
					<th>搜索，请输入姓名或身份证号码：</th>
					<td><input type="text" id="b_search"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr>
				
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text" data-rule="required;chinese;length[1~4]" id="name" value="${qzwhtd.name}"/>
					</td>
				</tr>
				<tr>
					<th>团队名称：</th>
					<td><input name="tdname" type="text" data-rule="required;chinese" id="dwmc" value="${qzwhtd.tdname}"/>
					</td>
				</tr>
				<tr>
					<th>类型：</th>
					<td><input name="type" type="radio" value="群文" checked="checked"/>群文
						<input name="type" type="radio" value="群体" />群体
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 <input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				<tr>
					<th>出生时间：</th>
					<td><input name="birthday" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="birthday" value="${qzwhtd.birthday}"/>
					</td>
				</tr>
				<tr>
					<th>入党时间：</th>
					<td><input name="rdny" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="rdny" value="${qzwhtd.rdny}"/>
					</td>
				</tr>
				<tr>
					<th>原单位担任职务：</th>
					<td><input name="ydwrole" type="text" id="ydwrole" data-rule="required;chinese;length[1~4]" value="${qzwhtd.ydwrole}"/>
					</td>
				</tr>
				<tr>
					<th>团队中职务：</th>
					<td><input name="tdrole" type="text" id="tdrole" data-rule="required;chinese;length[1~4]" value="${qzwhtd.tdrole}"/>
					</td>
				</tr>
				<tr>
					<th>住址：</th>
					<td><input name="address" type="text" id="address" data-rule="required;length[1~20];" value="${qzwhtd.address}"/>
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" id="phone" data-rule="required:mobile;" value="${qzwhtd.phone}"/>
					</td>
				</tr>
				<tr>
					<th>成立时间：</th>
					<td><input name="clsj" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="clsj" value="${qzwhtd.clsj}"/>
					</td>
				</tr>
				<tr>
					<th>活动时间：</th>
					<td><input name="hdsj" type="text" data-rule="required;" 
					 id="hdsj" value="${qzwhtd.hdsj}"/>
					</td>
				</tr>
				<tr>
					<th>活动地点：</th>
					<td><input name="hdaddress" type="text" id="hdaddress" data-rule="required;length[1~20];" value="${qzwhtd.hdaddress}"/>
					</td>
				</tr>
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${qzwhtd.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<script src="/scripts/business/qzwhtd.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>

</body>
</html>