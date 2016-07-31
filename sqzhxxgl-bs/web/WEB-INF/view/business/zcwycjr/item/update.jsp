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
    <li><a href="/zcwycjr/list/1">重残无业残疾人名册</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>重残无业残疾人名册</div>
  <div id="panbody">
	<div class="container">
		<form action="/zcwycjr/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text"   data-rule="required" value="${zcwycjr.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 
						<input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="birthday" value="${zcwycjr.birthday}"/>
					</td>
				</tr>
				<tr>
					<th>户籍地址：</th>
					<td><input name="address" type="text" id="address" data-rule="required" value="${zcwycjr.address}"/>
					</td>
				</tr>
				
				<tr>
					<th>残疾类别：</th>
					<td><select name="cjlb" id="cjlb">
					     <option value="视力">视力</option>
					     <option value="听力">听力</option>
					     <option value="言语">言语</option>
					     <option value="智力">智力</option>
					     <option value="肢体">肢体</option>
					     <option value="精神">精神</option>
					     <option value="无业">无业</option>
					     <option value="重残无业">重残无业</option>
					   </select>
					</td>
				</tr>	
				
				<tr>
					<th>残疾证号：</th>
					<td><input name="cjzh" type="text"  data-rule="required" value="${zcwycjr.cjzh}"/>
					</td>
				</tr>	
				<tr>
					<th>助养情况：</th>
					<td><input name="zyqk" type="text" value="${zcwycjr.zyqk}"/>
			
					</td>
				</tr>	
					<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zcwycjr.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	$(function() {
			$('input[name=sex][type=radio][value=${zcwycjr.sex}]').attr('checked', true);
			$("#cjlb option[value='${zcwycjr.cjlb}']").attr("selected", true);
		});
	
	</script>
</body>
</html>