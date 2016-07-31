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
    <li><a href="/taizhang/list/2">社会管理</a> <span class="divider">/</span></li>
<li><a href="/hdjl/list/1">消费者投诉、举报、咨询记录</a> <span class="divider">/</span></li>
    <li class="active">详细信息</li>
  </ul>
        <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>详细</strong> 消费者投诉、举报、咨询记录表
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table border="1">
				<tr>
				    <td width="282" valign="top" colspan="4" ><p >日期:${xfzts.rq} </p></td>
				    <td width="278" valign="top" colspan="3" ><p >登记编号：${xfzts.djbh}  </p></td>
				  </tr>
				  <tr>
				    <td width="112" valign="top" colspan="2" ><p >消费者信息 </p></td>
				    <td width="448" valign="top" colspan="5" ><p >姓名：${xfzts.name}   电话：${xfzts.phone} 地址：${xfzts.address}  </p></td>
				  </tr>
				  <tr>
				    <td width="560" valign="top" colspan="7" ><p >登记类型：${xfzts.djlx}   </p></td>
				  </tr>
				  <tr >
				    <td width="560" valign="top" colspan="7" ><p >具体内容：${xfzts.jtnr} </p></td>
				  </tr>
				  <tr >
				    <td width="43" valign="top" rowspan="4" ><p >处理结果 </p></td>
				    <td width="86" valign="top" colspan="2" rowspan="2" ><p >自行处理情况 </p></td>
				    <td width="300" valign="top" colspan="3" rowspan="2" ><p >${xfzts.zxcljg} </p></td>
				    <td width="130" valign="top" ><p >处理人 </p></td>
				  </tr>
				  <tr >
				    <td width="130" valign="top" ><p >${xfzts.clr} </p></td>
				  </tr>
				  <tr >
				    <td width="86" valign="center" colspan="2" rowspan="2" ><p >移交情况 </p></td>
				    <td width="154" valign="top" colspan="2" ><p >时间 </p></td>
				    <td width="145" valign="top" ><p >移交人 </p></td>
				    <td width="130" valign="top" ><p >接收人 </p></td>
				  </tr>
				  <tr>
				    <td width="154" valign="top" colspan="2" ><p >${xfzts.sj} </p></td>
				    <td width="145" valign="top" ><p >${xfzts.yjr} </p></td>
				    <td width="130" valign="top" ><p >${xfzts.jsr}  </p></td>
				  </tr>
				<tr>
					<th></th>
					<td>	<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					</td>
				</tr>
		</table>
	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>