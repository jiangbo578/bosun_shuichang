<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>
			 <ul class="breadcrumb" style="margin-bottom: 5px;">
					   <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
   <li><a href="/assess/list/1">考核管理</a> <span class="divider">/</span></li>
 <li><a href="/assess/child/list/${assessId }/1">${assess.name}[${assess.identityName }]-考核项目</a> <span class="divider">/</span></li>
  <li class="active">【${template.project }】-考核类别</li>
    <!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  
  	<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>考核类别添加</strong> 
   
  </div>
	<div class="container">
		<form action="/assess/child/item/edit/${assessId}/${tempId}" method="post">
			<table>
				<tr>
					<th>考核项目名称：</th>
					<td>${template.project }</td>
				</tr>
				<tr>
					<th>考核类别名称：</th>
					<td><input name="type" type="text" data-rule="required;" style="width: 700px"/>
					</td>
				</tr>
				<tr>
					<th>考核规则类型：</th>
					<td>
						<input type="radio" name="khgz" checked="checked" value="个数">个数 
						<input type="radio" name="khgz"  value="同比">同比
						<input type="radio" name="khgz"  value="同比每减少">同比每减少
						<input type="radio" name="khgz"  value="百分比大于">百分比大于
						<input type="radio" name="khgz"  value="百分比小于">百分比小于
						<input type="radio" name="khgz"  value="比例">比例
						<input type="radio" name="khgz"  value="蔬菜同比减少">蔬菜同比减少
						<input type="radio" name="khgz"  value="经济林同比减少">经济林同比减少
						<input type="radio" name="khgz"  value="同比增加">同比增加
						<input type="radio" name="khgz"  value="同比同期减少">同比同期减少
						<input type="radio" name="khgz"  value="准确率">准确率
						<input type="radio" name="khgz"  value="下降率">下降率
						<input type="radio" name="khgz"  value="超支">超支
						<input type="radio" name="khgz"  value="是扣分">是扣分
						<input type="radio" name="khgz"  value="否扣分">否扣分
						<input type="radio" name="khgz"  value="同比上升">同比上升
						<input type="radio" name="khgz"  value="少于N次">少于N次
						<input type="radio" name="khgz"  value="同比下降率">同比下降率
						<input type="radio" name="khgz"  value="未按规定拆除">未按规定拆除
						<input type="radio" name="khgz"  value="整治">整治
						<input type="radio" name="khgz"  value="绝对值">绝对值
						<input type="radio" name="khgz"  value="支配">支配
					</td>
				</tr>
				<tr>
					<th>扣分限值：</th>
					<td><input name="kfxz" type="text" style="width: 200px" value="0"/>
					</td>
				</tr>
					<tr>
					<th>平均值：</th>
					<td><input name="vag" type="text" style="width: 200px" value="0"/>请输入小数或者整数
					</td>
				</tr>
				<tr>
					<th>往年数据是否需要手动填报：</th>
					<td><input type="radio" name="sfxy"  value="yes">是
						<input type="radio" name="sfxy"  value="no" checked="checked">否
					</td>
				</tr>
				<tr>
					<th>描述：</th>
					<td><input name="description" type="text" style="width: 200px"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				    <button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
			</table>
		</form>
	</div>

		</div>
	<jsp:include page="/page/footer.jsp"></jsp:include><br>		<br><br>
	<script>
	$(function(){
		var message = '${message}';
		if(message != ''){
			alert(message);
		}
	});
	</script>
</body>
</html>