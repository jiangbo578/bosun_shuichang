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
    <li><a href="/tsjbzx/list/1">投诉举报咨询台账目录</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 投诉举报咨询台账目录</div>
  <div id="panbody">
	<div class="container">
		<form action="/tsjbzx/item/update" method="post">

			<table>
				<tr>
					<th>事由：</th>
					<td><textarea style="width: 100%"   cols="100" rows="10" name="sy" type="text"  data-rule="required;" id="sy" >${tsjbzx.sy}</textarea>
					</td>
				</tr>
				<tr>
					<th>来源：</th>
					<td>
					<input name="ly" ${tsjbzx.ly eq'来电'?'checked':'' } type="radio" value="来电"  />来电
					<input name="ly"  ${tsjbzx.ly eq('来访')?'checked':'' }   type="radio" value="来访" />来访
					<input name="ly" ${tsjbzx.ly eq'来信'?'checked':'' }   type="radio" value="来信" />来信
					<input name="ly"  ${tsjbzx.ly eq'其他'?'checked':'' } type="radio" value="其他" />其他
					</td>
				</tr>
				<tr>
					<th>处理结果：</th>
					<td>
					<input name="cljg"  ${tsjbzx.cljg eq'已处理'?'checked':'' } type="radio" value="已处理" checked="checked"/>已处理
					<input name="cljg" ${tsjbzx.cljg eq'未处理'?'checked':'' } type="radio" value="未处理" />未处理
					<input name="cljg" ${tsjbzx.cljg eq'移交'?'checked':'' } type="radio" value="移交" />移交
			
					</td>
				</tr>
						<tr>
					<th>投诉类型：</th>
					<td>	<input ${tsjbzx.lx eq'投诉'?'checked':'' }  name="lx" type="radio" value="投诉" checked="checked"/>投诉
					<input name="lx" ${tsjbzx.lx eq'举报'?'checked':'' }  type="radio" value="举报" />举报
					<input name="lx" ${tsjbzx.lx eq'咨询'?'checked':'' }  type="radio" value="咨询" />咨询
					</td>
				</tr>
			
		
		
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${tsjbzx.id}">
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
			$('input[name=xb][type=radio][value=${tdmc.xb}]').attr('checked', true);
		});
	</script>
</body>
</html>