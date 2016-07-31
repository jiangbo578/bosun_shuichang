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
    <li><a href="/sqzamp/list/1">社区治安、安全排摸、矛盾纠纷排查记录</a> <span class="divider">/</span></li>
    <li class="active">详细信息</li>
  </ul>
  
  <div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>社区治安、安全排摸、矛盾纠纷排查记录</strong>
  
   
  </div>
  <div id="panbody">
	<div class="container">
			<table border="1">
				 <tr>
    <td width="160" valign="center" rowspan="2" ><p >时间 </p></td>
    <td width="31" valign="center" rowspan="2" ><p >${sqzamp.sj }</p></td>
    <td valign="top" colspan="7" ><p >参加人员:${sqzamp.cjry} </p></td>
  </tr>
  <tr>
    <td width="75" valign="top" ><p >负责人 </p></td>
    <td width="75" valign="top" ><p >治保  </p></td>
    <td width="50" valign="top" ><p >民警 </p></td>
    <td width="75" valign="top" ><p >调解员</p></td>
    <td width="59" valign="top" ><p >物业 </p></td>
    <td width="61" valign="top" ><p >协管 </p></td>
    <td width="91" valign="top" ><p >其他</p></td>
  </tr>
  <tr>
    <td width="160" valign="center" ><p >地点 </p></td>
     <td width="91" valign="center" ><p >  ${sqzamp.dz} </p></td>
    <td width="31" valign="center" ><p >${sqzamp.fzr }</p></td>
    <td width="75" valign="center" ><p >${sqzamp.zb} </p></td>
    <td width="75" valign="center" ><p >${sqzamp.mj }</p></td>
    <td width="50" valign="center" ><p > ${sqzamp.tjy } </p></td>
    <td width="75" valign="center" ><p >${sqzamp.wy }</p></td>
    <td width="59" valign="center" ><p > ${sqzamp.xg} </p></td>
    <td width="61" valign="center" ><p >${sqzamp.qt}   </p></td>
   
  </tr>
  <tr>
    <td width="160" valign="center" ><p >排摸、排查内容 </p></td>
    <td valign="center" colspan="8" ><p >${sqzamp.nr}</p></td>
  </tr>
  <tr>
    <td width="160" valign="center" ><p >存在问题</p></td>
    <td valign="top" colspan="8" ><p >${sqzamp.czwt}</p></td>
  </tr>
  <tr>
    <td width="160" valign="center" ><p >整改措施</p></td>
    <td valign="top" colspan="8" ><p > ${sqzamp.zgcs } </p></td>
  </tr>
  <tr>
    <td width="160" valign="center" ><p >备注 </p></td>
    <td valign="top" colspan="8" ><p >${sqzamp.bz }  </p></td>
  </tr>
  <tr>
					<th>&nbsp;</th>
					<td align="center"><input type="button" class='btn btn-success' value="返回" onclick="javascrtpt:window.location.href='/sqzamp/list/'"/>
					
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