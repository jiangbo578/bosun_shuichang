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
    <li><a href="/zfqk/list/1">走访情况记录</a> <span class="divider">/</span></li>
    <li class="active">详细信息</li>
  </ul>
  
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>走访情况记录</strong>
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table border="1">
				 <tr >
    <td width="187" valign="center" ><p >序号 </p></td>
    <td width="106" valign="center" ><p >${zfqk.xh}</p></td>
    <td width="92" valign="center" ><p >时间 </p></td>
    <td width="123" valign="center" ><p >${zfqk.sj}</p></td>
    <td width="159" valign="center" ><p >被访者姓名 </p></td>
    <td width="233" valign="center" ><p >${zfqk.bfzxm}</p></td>
  </tr>
  <tr >
    <td width="187" valign="center" ><p >被访者类型 </p></td>
    <td width="106" valign="center" ><p >${zfqk.bfzlx}</p></td>
    <td width="92" valign="center" ><p >被访者住址 </p></td>
    <td width="123" valign="center" ><p >${zfqk.bfzdz}</p></td>
    <td width="159" valign="center" ><p >家庭基本情况 </p></td>
    <td width="233" valign="center" ><p >${zfqk.jtjbqk}</p></td>
  </tr>
  <tr>
    <td width="187" valign="top" ><p >被访者联系电话 </p></td>
    <td valign="center" colspan="3" ><p >${zfqk.bfzdh}</p></td>
    <td width="159" valign="center" ><p >走访者 </p></td>
    <td width="233" valign="center" ><p >${zfqk.zfz} </p></td>
  </tr>
  <tr>
    <td width="187" valign="top" ><p >反映的需求、问题和建议 </p></td>
    <td valign="center" colspan="5" ><p >${zfqk.xq}</p></td>
  </tr>
  <tr>
    <td width="187" valign="top" ><p >采取的对策和措施 </p></td>
    <td valign="center" colspan="5" ><p >${zfqk.dc}</p></td>
  </tr>
  <tr >
    <td width="187" valign="center" ><p >处理结果 </p></td>
    <td valign="center" colspan="5" ><p > ${zfqk.cljg}</p></td>
  </tr>
  <tr>
					<th>&nbsp;</th>
					<td align="center"><input type="button" class='btn btn-success' value="返回" onclick="javascrtpt:window.location.href='/zfqk/list/'"/>
					
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