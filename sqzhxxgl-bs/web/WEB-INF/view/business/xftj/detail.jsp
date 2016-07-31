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
      <li><a href="/xftj/list/1">信访调解记录</a> <span class="divider">/</span></li>
	 <li class="active">详细</li>
  </ul>
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong>咨询接待记录
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table border="1">
			 <tr>
     <td width="95" valign="center" ><p >序号 </p></td>
    <td width="36" valign="center" ><p >${xftj.xh }</p></td>
    <td width="59" valign="center" ><p >纠纷类别 </p></td>
    <td width="48" valign="center" ><p >${xftj.jflb }</p></td>
    <td width="72" valign="center" ><p >受理时间 </p></td>
    <td width="70" valign="center" ><p >${xftj.slsj }</p></td>
    <td width="61" valign="center" ><p >调解人员 </p></td>
    <td width="48" valign="center" ><p >${xftj.tjry}</p></td>
    <td width="86" valign="center" ><p >有无调解协议 </p></td>
    <td width="45" valign="center" ><p >${xftj.ywtjxy}</p></td>
  </tr>
  <tr >
    <td width="95" valign="center" ><p >当事人概况: </p></td>
    <td width="528" valign="center" colspan="9" ><p >${xftj.dsrgk}</p></td>
  </tr>
  <tr >
    <td width="95" valign="center" ><p >纠纷概况: </p></td>
    <td width="528" valign="center" colspan="9" ><p >${xftj.jfgk}</p></td>
  </tr>
  <tr >
    <td width="95" valign="center" ><p >调处结果: </p></td>
    <td width="528" valign="center" colspan="9" ><p >${xftj.tcjg}</p></td>
  </tr>
  <tr >
    <td width="95" valign="center" ><p >跟踪反馈情况: </p></td>
    <td width="528" valign="center" colspan="9" ><p > ${xftj.gzfkqk}</p></td>
  </tr>
			<tr >
					
					<td colspan="8">	<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
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