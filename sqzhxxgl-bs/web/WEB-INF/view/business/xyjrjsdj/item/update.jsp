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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/xyjrjsdj/list/1">现役军人家属信息登记表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 现役军人家属信息登记表</div>
  <div id="panbody">
	<div class="container">
		<form action="/xyjrjsdj/item/update" method="post">
			<table>
				<tr>
					<th>父亲姓名：</th>
					<td>
						<input data-rule="required;chinese;length[1~4]" name="fatherName" type="text"  data-rule="required;" value="${xyjrjsdj.fatherName }"></input>
					</td>
				</tr>
				<tr>
					<th>母亲姓名：</th>
					<td>
						<input data-rule="required;chinese;length[1~4]" name="motherName" type="text"  data-rule="required;" value="${xyjrjsdj.motherName }"></input>
					</td>
				</tr>
				<tr>
					<th>家庭住址（户籍地址）：</th>
					<td><input name="jtzz"  data-rule="required;length[1~30];" type="text"  size="25px"  data-rule="required;" value="${xyjrjsdj.jtzz }"></input>
					<font color="gray">若现役军人父母离异的，请将“家庭住址（户籍地址）”分别填写，并注明。</font>
					</td>
				</tr>
				<tr>
					<th>父亲工作单位：</th>
					<td><input name="fatherWork"  data-rule="required;length[1~30];" type="text" value="${xyjrjsdj.fatherWork }"></input>
					</td>
				</tr>
				<tr>
					<th>父亲联系电话：</th>
					<td><input name="fatherPhone" data-rule="required;" type="text" value="${xyjrjsdj.fatherPhone }"></input>
					</td>
				</tr>
				
				
				<tr>
					<th>母亲工作单位：</th>
					<td><input name="motherWork" data-rule="required;length[1~30];" type="text" value="${xyjrjsdj.motherWork }"></input>
					</td>
				</tr>
				<tr>
					<th>母亲联系电话：</th>
					<td><input name="motherPhone" data-rule="required;" type="text" value="${xyjrjsdj.motherPhone }"></input>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td>
						<textarea style="width: 300px;height: 200px;" name="tag" >${xyjrjsdj.tag }
						</textarea>
						<font color="gray">军人基本情况（含姓名、出生年月、入伍时间、服役部队等）</font>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${xyjrjsdj.id}">
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
	});
	</script>
</body>
</html>