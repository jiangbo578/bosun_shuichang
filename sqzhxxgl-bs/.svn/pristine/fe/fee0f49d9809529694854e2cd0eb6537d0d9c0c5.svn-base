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
    <li><a href="/taizhang/list/3">公共服务</a> <span class="divider">/</span></li>
    <li><a href="/zbjshs/list/1">自办酒会所情况表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
  </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 自办酒会所情况表</div>
  <div id="panbody">
	<div class="container">
		<form action="/zbjshs/item/update" method="post">

			<table>
			<tr>
					<th>单位名称（业主）：</th>
					<td><input name="dwmc" type="text" data-rule="required;chinese" value="${zbjshs.dwmc}"/>
					</td>
				</tr>
				<tr>
					<th>经营地址：</th>
					<td><input name="jydz" type="text" data-rule="required;" value="${zbjshs.jydz}"/></td>
				</tr>
				<tr>
					<th>负责人：</th>
					<td><input name="fzr" type="text" data-rule="required;chinese;length[1~4]"value="${zbjshs.fzr}" />
					</td>
				</tr>
				<tr>
					<th>联系电话：</th>
					<td><input name="phone" type="text" data-rule="required;" value="${zbjshs.phone}"/>
					</td>
				</tr>
				<tr>
					<th>经营性质：</th>
					<td> <select name="jyxz" id="jyxz">
					    <option value="承包">承包</option>
					    <option value="其它">其它</option>
					    <option value="自主经营">自主经营</option>
					    </select>
					</td>
				</tr>
				<tr>
					<th>承办桌数：</th>
					<td><input name="cbzs" type="text" data-rule="required;number" value="${zbjshs.cbzs}"/>
					</td>
				</tr>
				<tr>
					<th>区食安办备案：</th>
					<td><input name="ba" type="radio" value="是" checked="checked"/>是
					    <input name="ba" type="radio" value="否" />否
					</td>
				</tr>
				<tr>
					<th>月实际承办桌数：</th>
					<td><input name="sjzs" type="text" data-rule="required;number" value="${zbjshs.sjzs}"/>
					</td>
				</tr>
				<tr>
					<th>月实际承办户数：</th>
					<td><input name="sjhs" type="text" data-rule="required;number" value="${zbjshs.sjhs}"/>
					</td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" value="${zbjshs.remark}"/>
					</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${zbjshs.id}">
					<input type="hidden" name="zbjshsbtid" value="${zbjshsbtid}" />
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
				$('input[name=ba][type=radio][value=${zbjshs.ba}]').attr('checked', true);
				
				$("#jyxz option[value='${zbjshs.jyxz}']").attr("selected", true);
			});
	</script>
</body>
</html>