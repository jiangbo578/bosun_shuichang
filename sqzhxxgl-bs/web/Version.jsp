<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<jsp:include page="/page/head.jsp"></jsp:include>
</head>
<body >
	 <ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">版本信息</a> <span class="divider">/</span></li>
   
  </ul>

<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>历史版本信息</strong> ${businessForm.name}
  
   
  </div>
  <div id="panbody">
	<div class="container" >
		
		
		  
		<table class="table table-striped table-bordered table-hover" style="margin-top: 10px">
			<thead>
				<tr>
					<th width="5%">序号</th>
					<th width="10%">电子台账版本编号</th>
					<th width="20%">更新时间</th>
					
				</tr>
			</thead>
			<tbody>
				
					<tr>
					<td>1</td>
					<td>TZ140918</td>
					<td>2014年9月18日17:00:46</td>
						
					</tr>
					<tr>
					<td>2</td>
					<td>TZ140923</td>
					<td>2014年9月23日18:04:00</td>
						
					</tr>
					<tr>
					<td>3</td>
					<td>TZ140925</td>
					<td>2014年9月25日17:32:55</td>
						
					</tr>
				<tr>
					<td>4</td>
					<td>TZ141009</td>
					<td>2014年10月9日15:50:59</td>
						
					</tr>
					<tr>
					<td>5</td>
					<td>TZ141014</td>
					<td>2014年10月14日18:04:09</td>
						
					</tr>
					<tr>
					<td>6</td>
					<td>TZ141020</td>
					<td>2014年10月20日16:23:51</td>
						
					</tr>
					<tr>
					<td>7</td>
					<td>TZ141025</td>
					<td>2014年10月25日16:23:51</td>
						
					</tr>
					<tr>
					<td>8</td>
					<td>TZ141027</td>
					<td>2014年10月27日13:40:19</td>
						
					</tr>
					<tr>
					<td>9</td>
					<td>TZ141029</td>
					<td>2014年10月29日17:55:07</td>
						
					</tr>
					<tr>
					<td>10</td>
					<td>TZ141105</td>
					<td>2014年11月5日15:10:53</td>
						
					</tr>
			</tbody>
		</table>
		<div class="pagination">
		<ul class="" style="float: right;" id="b_pagination"></ul>
		</div>
	</div>

  </div>

</div>
<br>
<jsp:include page="/page/footer.jsp"></jsp:include>
	
</body>
</html>