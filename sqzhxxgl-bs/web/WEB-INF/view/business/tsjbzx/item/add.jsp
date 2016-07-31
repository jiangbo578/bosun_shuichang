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
    <li><a href="/tsjbzx/list/1">投诉举报咨询台账目录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 投诉举报咨询台账目录</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/tsjbzx/item/add" method="post">
   
			<table>
		
				<tr>
					<th>&nbsp;</th>
					<td>
						<div id="b_search_result"></div>
					</td>
				</tr>
				<tr>
					<th>事由：</th>
					<td><textarea cols="100" style="width: 100%" rows="10" name="sy" type="text" data-rule="required;" id="sy" ></textarea>
					</td>
				</tr>
				<tr>
					<th>来源：</th>
					<td>
					<input name="ly" type="radio" value="来电" checked="checked"/>来电
					<input name="ly" type="radio" value="来访" />来访
					<input name="ly" type="radio" value="来信" />来信
					<input name="ly" type="radio" value="其他" />其他
					</td>
				</tr>
				<tr>
					<th>处理结果：</th>
					<td>
					<input name="cljg" type="radio" value="已处理" checked="checked"/>已处理
					<input name="cljg" type="radio" value="未处理" />未处理
					<input name="cljg" type="radio" value="移交" />移交
			
					</td>
				</tr>
						<tr>
					<th>投诉类型：</th>
					<td>	<input name="lx" type="radio" value="投诉" checked="checked"/>投诉
					<input name="lx" type="radio" value="举报" />举报
					<input name="lx" type="radio" value="咨询" />咨询
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