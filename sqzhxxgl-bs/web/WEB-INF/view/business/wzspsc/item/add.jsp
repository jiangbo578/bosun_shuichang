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
    <li><a href="/wzspsc/list/1">新增无证食品药品生产经营消费单位情况表 </a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 新增无证食品药品生产经营消费单位情况表 </div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/wzspsc/item/add" method="post"><%--
              <input name="cwh" type="hidden" data-rule="required;" value="${sessionScope.userOrgan.name}"/>
              <input name="tbr" type="hidden" data-rule="required;" value="${sessionScope.userRealName }"/>
              
			<script type="text/javascript">
			 var now= new Date();
			  var year=now.getFullYear();
			  var month=now.getMonth();
			  var date=now.getDate();
			//  alert(year+"-"+(month+1)+"-"+date)
			  $("#tbrq").val(year+"-"+(month+1)+"-"+date);
			</script>
			--%><table> 
		       
				<tr>
					<th>单位名称（业主）：</th>
					<td><input name="dwmc" type="text" data-rule="required;chinese" />
					</td>
				</tr>
				<tr>
					<th>经营地址：</th>
					<td><input name="jydz" type="text" data-rule="required;" /></td>
				</tr>
				<tr>
					<th>负责人：</th>
					<td><input name="fzr" type="text" data-rule="required;chinese;length[1~4]" />
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;mobile;" />
					</td>
				</tr>
				<tr>
					<th>经营项目：</th>
					<td><input type="text" name="jyxm"  data-rule="required;"/>
					</td>
				</tr>
				<tr>
					<th>处置情况：</th>
					<td><select name="czqk">
					    <option value="纳管">纳管</option>
					    <option value="取缔">取缔</option>
					    
					    </select>
					</td>
				</tr>
				<tr>
					<th>发现人：</th>
					<td><input name="fxr" type="text" data-rule="required;chinese;length[1~4]" />
					</td>
				</tr>
				<tr>
					<th>时间：</th>
					<td><input name="sj" type="text" data-rule="required;date" 
					onClick="WdatePicker()" class="Wdate" />
					</td>
				</tr>
				
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text"  />
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
					<input type="hidden" name="wzspscbtid" value="${wzspscbtid}" />
				</tr>
			</table>
		</form>
	</div>


	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>