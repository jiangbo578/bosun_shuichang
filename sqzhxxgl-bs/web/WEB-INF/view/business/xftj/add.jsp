<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<style type="text/css">
th{
text-align: right;
}
</style>
<jsp:include page="/page/head.jsp"></jsp:include>
<link rel="stylesheet" href="/styles/jquery.validator.css">
</head>
<body>
<ul class="breadcrumb" style="margin-bottom: 5px;">
	 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="/taizhang/list/5">会议活动</a> <span class="divider">/</span></li>
   <li><a href="/xftj/list/1">信访调解记录</a> <span class="divider">/</span></li>
    <li class="active">添加</li>
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>添加</strong> 信访调解记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
		<form action="/xftj/add" method="post">

			<table  >
			
				<tr>
    <th width="195" ><p >序号: </th>
    <td width="36" valign="center" ><input name="xh" type="text" data-rule="required;"/></td>
    <th width="89" valign="center" >纠纷类别: </th>
    <td width="48" valign="center" ><input name="jflb" type="text" data-rule="required;"/></td>
 
  </tr>
    <tr >
     <th width="72" valign="center" >受理时间: </th>
    <td width="70" valign="center" ><input name="slsj" type="text" onClick="WdatePicker()" class="Wdate"  data-rule="required;" /></td>
  
         <th width="61" valign="center" >调解人员: </th>
    <td width="48" valign="center" ><input name="tjry" type="text" data-rule="required;"/></td>
  </tr>
  <tr >
      <th width="86" valign="center" >有无调解协议: </th>
    <td width="45" valign="center" ><input name="ywtjxy" type="text" data-rule="required;"/></td>
   
    

    
  </tr>
  <tr >
    <th width="95" valign="center" >纠纷概况: </th>
    <td width="528" valign="center"  ><input name="jfgk" type="text" data-rule="required;"/></td>
     <th width="95" valign="center" >当事人概况: </th>
    <td width="528" valign="center"  ><input name="dsrgk" type="text" data-rule="required;"/></td>
  </tr>
  <tr >
    <th width="95" height="20" valign="center" >调处结果: </th>
    <td width="528" valign="center"  ><input name="tcjg" type="text" data-rule="required;"/></td>
  </tr>
  <tr >
    <th width="95" valign="center" >跟踪反馈情况: </th>
    <td width="528" valign="center"  > <textarea name="gzfkqk" style="width:200px;height:50px;" data-rule="required;"></textarea></td>
  </tr>
			

				<tr>
					<th></th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
			</table>
		</form>
	</div>

	<br>
</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
	

	</script>
</body>
</html>