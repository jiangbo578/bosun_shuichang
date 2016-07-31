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
    <li><a href="/wzspdwpc/list/1">无证食品单位季度隐患排查表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 无证食品单位季度隐患排查表</div>
  <div id="panbody">
	<div class="container">
		<form action="/wzspdwpc/item/update" method="post">

			<table>
			<tr>
					<th>单位名称（业主）：</th>
					<td><input name="dwmc" type="text" data-rule="required;chinese" value="${wzspdwpc.dwmc}"/>
					</td>
				</tr>
				<tr>
					<th>经营地址：</th>
					<td><input name="jydz" type="text" data-rule="required;" value="${wzspdwpc.jydz}"/></td>
				</tr>
				<tr>
					<th>负责人：</th>
					<td><input name="fzr" type="text" data-rule="required;chinese;length[1~4]"value="${wzspdwpc.fzr}" />
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;mobile;" value="${wzspdwpc.phone}"/>
					</td>
				</tr>
				<tr>
					<th>类别：</th>
					<td> <select name="lb" id="lb">
					    <option value="窝点">窝点</option>
					    <option value="消费">消费</option>
					    <option value="流通">流通</option>
					    </select>
					</td>
				</tr>
				<tr>
					<th>经营情况：</th>
					<td><select name="jyqk" id="jyqk">
					    <option value="正常">正常</option>
					    <option value="关">关</option>
					    <option value="取缔">取缔</option>
					    <option value="转业">转业</option>
					    </select>
					</td>
				</tr>
				<tr>
					<th>是否上报镇食安办：</th>
					<td><input name="sb" type="radio" value="已报" checked="checked"/>已报
					    <input name="sb" type="radio" value="未报" />未报
					</td>
				</tr>
				<tr>
					<th>排查日期：</th>
					<td><input name="pcrq" type="text" data-rule="required;date" 
					onClick="WdatePicker()" class="Wdate" value="${wzspdwpc.pcrq}"/>
					</td>
				</tr>
				<tr>
					<th>排查人：</th>
					<td><input name="pcr" type="text" data-rule="required;chinese;length[1~4]"  value="${wzspdwpc.pcr}"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text"  value="${wzspdwpc.remark}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${wzspdwpc.id}">
					<input type="hidden" name="wzspdwpcbtid" value="${wzspdwpcbtid}" />
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
	<script type="text/javascript">
	
	$(function() {
				$('input[name=sb][type=radio][value=${wzspdwpc.sb}]').attr('checked', true);
				$("#lb option[value='${wzspdwpc.lb}']").attr("selected", true);
				$("#jyqk option[value='${wzspdwpc.jyqk}']").attr("selected", true);
			});
	</script>
</body>
</html>