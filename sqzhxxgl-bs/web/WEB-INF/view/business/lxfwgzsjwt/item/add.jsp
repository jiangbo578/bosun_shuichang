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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/lxfwgzsjwt/list/1">联系服务工作收集问题提交单</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 联系服务工作收集问题提交单</div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/lxfwgzsjwt/item/add" method="post">
   
			<table>
			<tr>
					<th>居民区：</th>
					<td><input name="jmq" type="text" data-rule="required;length[1~20];" />
					</td>
					<th style="padding-left: 80px">编号：</th>
					<td><input name="bh" type="text" data-rule="required;length[1~20];" /></td>
				</tr>
			
				<tr>
					<th>诉求反映人：</th>
					<td><input name="sqfyr" type="text"  data-rule="required;chinese;length[1~10]" />
					</td>
					<th style="padding-left: 80px">所属责任区：</th>
					<td><input name="sszrq" type="text"  data-rule="required;length[1~20];"/></td>
				</tr>
				<tr>
					<th>地址：</th>
					<td><input name="dz" type="text" data-rule="required;" data-rule="required;length[1~20];" />
					</td>
					<th style="padding-left: 80px">联系方式：</th>
					<td><input name="lxfs" type="text" data-rule="required:mobile;"/></td>
				</tr>
				
				<tr>
					<th>问题简述：</th>
					<td><input name="wtjs" type="text" data-rule="required;" />
					</td>
					<th style="padding-left: 80px">问题归类：</th>
					<td>
					   <select name="wtgl">
					      <option value="民生问题">民生问题</option>
					      <option value="公共环境卫生">公共环境卫生</option>
					      <option value="物业管理">物业管理</option>
					      <option value="治安管理">治安管理</option>
					      <option value="其他">其他</option>
					   </select>
					</td></td>
				</tr>
				<tr>
					<th>组织科处理意见：</th>
					<td><input name="zzkclyj" type="text" data-rule="required;length[1~20];"/>
					</td>
					<th style="padding-left: 80px">职能科室解决情况反馈：</th>
					<td><input name="jjqkfk" type="text" data-rule="required;length[1~20];" /></td>
				</tr>
				<tr>
					<th>是否需提交领导班子研究：</th>
					<td><input name="ldbzyj" type="text" data-rule="required;length[1~20];" />
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
<script src="/scripts/business/lxfwgzsjwt.js"></script>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>