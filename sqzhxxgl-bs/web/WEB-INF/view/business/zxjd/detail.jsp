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
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
      <li><a href="/zxjd/list/1">咨询接待记录</a> <span class="divider">/</span></li>
	 <li class="active">详细</li>
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong>咨询接待记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table >
			<tr>
					<th>姓名：</th>
					<td>${zxjd.name }
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td>${zxjd.sex}
					</td>
				</tr>
				<tr>
					<th>日期：</th>
					<td>${zxjd.rq}
					</td>
				</tr>
				<tr>
					<th>年龄：</th>
					<td>${zxjd.age}
					</td>
				</tr>
				<tr>
					<th>地址：</th>
					<td>${zxjd.address}
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td>${zxjd.phone }
					</td>
				</tr>
				<tr>
					<th>类别：</th>
					<td>${zxjd.type}
					</td>
				</tr>
				<tr>
					<th>内容：</th>
					<td>${zxjd.nr}
					</td>
				</tr>
				<tr>
					<th>内容情况：</th>
					<td>${zxjd.nrqk }
					</td>
				</tr>
				<tr>
					<th>接待人：</th>
					<td>${zxjd.jdr}
					</td>
				</tr>
				<tr>
					<th>处理结果：</th>
					<td>${zxjd.cljg}
					</td>
				</tr>
			<tr>
					<th>&nbsp;</th>
					<td>	<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
		</table>
	</div>

</div>
</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>