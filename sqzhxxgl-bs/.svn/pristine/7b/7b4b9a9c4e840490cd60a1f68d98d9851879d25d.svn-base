<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body onload="changelist(1)">
	<ul class="breadcrumb" style="margin-bottom: 5px;">
		<li><a href="/centent"><i class="icon-home"></i>首页</a> <span
			class="divider">/</span>
		</li>
		<li><a href="/rule/list/1"><i class="icon-align-left"></i>考核管理</a>
			<span class="divider">/</span>
		</li>

		<li class="active">考核管理</li>
		<!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
	</ul>

	<div class="mianpan">
		<div class="panhead">
			<i class="icon-list">&nbsp;&nbsp;</i><strong>考核管理添加</strong>


		</div>
		<div class="container">
			<form action="/assess/rule/add" method="post">

				<table>
				
					<tr>
						<th>考核规则：</th>
						<td colspan="3"><input name="content" type="text"
							data-rule="required;" style="width: 700px" /></td>
					</tr>
					<tr>
						<th>扣除分数：</th>
						<td><input name="score" type="text" data-rule="required;"
							style="width: 200px" /></td>
					</tr>
					<tr>
						<th>同比：</th>
						<td><input type="radio" name="identity" checked="checked" value="上升高于平均值">上升高于平均值
						    <input type="radio" name="identity" value="上升低于平均值">上升低于平均值
						    <input type="radio" name="identity" value="持平平均值">持平平均值
						    
					</tr>
					<tr>
						<th>平均值：</th>
						<td><input name="average" data-rule="length[1~150];"
							type="text" style="width: 500px" /></td>
					</tr>
					<tr>
						<th>备注：</th>
						<td><input name="remark" data-rule="length[1~150];"
							type="text" style="width: 500px" /></td>
					</tr>
					<tr>
						<th>&nbsp;</th>
						<td><button class="btn btn-primary" type="submit">
								<i class="icon-ok-sign"></i> 保存
							</button>
							<button class="btn btn-info" type="button"
								onclick="window.history.go(-1)">
								<i class="icon-share-alt"></i> 返回
							</button></td>
					</tr>
					<input type="hidden" value="${tempId}" name="tempId"/>
				</table>
			</form>
		</div>

	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include><br>
	<br>
	<br>
	<script type="text/javascript">
		function changelist(index) {

			$.getJSON("/rule/findassess/type/" + index, function(result) {
				document.getElementById("AssessBaseEntity").options.length = 0;
				document.getElementById("xm").options.length = 0;
				$.each(result, function(i, field) {
					if (i == 0) {
						index = index + 1;
					}
					document.getElementById("AssessBaseEntity").options.add(new Option(field['name'], field['id']));
					//$("#parid").append("<option value='"++"'>""</option>")

				});

			});

		}
		//根据六大类获取考核项目
		function changeKhxm(index) {
			//alert(index)
			$.getJSON("/rule/findassess/khxm/" + index, function(result) {
				document.getElementById("xm").options.length = 0;
				document.getElementById("xm").options.add(new Option("请选择", "0"));
				$.each(result, function(i, field) {
					if (i == 0) {
						index = index + 1;
					}
					
					document.getElementById("xm").options.add(new Option(field['project'], field['id']));
					//$("#parid").append("<option value='"++"'>""</option>")

				});

			});

		}
		//根据考核项目获取考核条目
	
		function changeKhtm(index) {
			//alert(index)
			$.getJSON("/rule/findassess/khtm/" + index, function(result) {
				document.getElementById("tm").options.length = 0;
				document.getElementById("tm").options.add(new Option("请选择", "0"));
				$.each(result, function(i, field) {
					if (i == 0) {
						index = index + 1;
					}
				//	alert(field['type']);
					document.getElementById("tm").options.add(new Option(field['type'], field['id']));
					//$("#parid").append("<option value='"++"'>""</option>")

				});

			});

		}
	</script>
</body>
</html>