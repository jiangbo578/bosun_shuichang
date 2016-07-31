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
    <li><a href="/wptz/list/1">田间窝棚台帐</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
				<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据添加</strong> 田间窝棚台帐 </div>
  <div id="panbody">
	<div class="container">
	
	
	
		<form action="/wptz/item/add" method="post">
            <table> 
		       
				<tr>
					<th>村/合作社：</th>
					<td><input name="hzs" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>窝棚位置：</th>
					<td><input name="wpwz" type="text" data-rule="required;" /></td>
				</tr>
				<tr>
					<th>面积(㎡)：</th>
					<td><input name="mj" type="text" data-rule="required;float;" /></td>
				</tr>
				
				<tr>
					<th>居住人数：</th>
					<td><input name="jzrs" type="text" data-rule="required;float;" />
					</td>
				</tr>
				<tr>
					<th>从事生产领域：</th>
					<td><input name="ly" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>涉及的生产规模（亩）：</th>
					<td><input type="text" name="gm"  data-rule="required;float;"/>
					</td>
				</tr>
				<tr>
					<th>搭建人：</th>
					<td><input type="text" name="djr"  data-rule="required;"/>
					</td>
				</tr>
					<tr>
					<th>土地租赁期限：</th>
					<td><input name="tdqx" type="text" data-rule="required;" />
					</td>
				</tr>
				
				
				<tr>
					<th>土地性质：</th>
					<td><input name="tdxz" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>主要居住人姓名及联系方式：</th>
					<td><input name="lxfs" type="text" data-rule="required;" />
					</td>
				</tr>
				<tr>
					<th>窝棚整治情况：</th>
					<td><input name="zzqk" type="radio" value="存量" checked="checked"/>存量
					    <input name="zzqk" type="radio" value="新建" />新建
					    <input name="zzqk" type="radio" value="已整治" />已整治
					</td>
				</tr>
			
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}" />
					<input type="hidden" name="wptzbtid" value="${wptzbtid}" />
				</tr>
			</table>
		</form>
	</div>


	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>