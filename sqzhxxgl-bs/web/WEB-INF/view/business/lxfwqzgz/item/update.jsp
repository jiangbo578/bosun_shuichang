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
    <li><a href="/taizhang/list/4">党群工作</a> <span class="divider">/</span></li>
    <li><a href="/lxfwqzgz/list/1">联系服务群众工作统计表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 联系服务群众工作统计表</div>
  <div id="panbody">
	<div class="container">
		<form action="/lxfwqzgz/item/update" method="post">
			<table>
						<tr>
					<th>入户走访（户）当月数：</th>
					<td><input name="rhzfys" type="text" data-rule="required:number;" value="${lxfwqzgz.rhzfys}"/>
					</td>
					<th style="padding-left: 80px">入户走访（户）累计数：</th>
					<td><input name="rhzfljs" type="text" data-rule="required:number;" value="${lxfwqzgz.rhzfljs}"/></td>
				</tr>
				<tr>
					<th>非入户走访（户）当月数：</th>
					<td><input name="frhzfys" type="text" data-rule="required:number;" value="${lxfwqzgz.frhzfys}"/>
					</td>
					<th style="padding-left: 80px">非入户走访（户）累计数：</th>
					<td><input name="frhzfljs" type="text" data-rule="required:number;" value="${lxfwqzgz.frhzfljs}"/></td>
				</tr>
			<tr>
					<th>民生类当月数：</th>
					<td><input name="mslys" type="text" data-rule="required:number;" value="${lxfwqzgz.mslys}"/>
					</td>
					<th style="padding-left: 80px">民生类累计数：</th>
					<td><input name="mslljs" type="text" data-rule="required:number;" value="${lxfwqzgz.mslljs}"/></td>
				</tr>
				<tr>
					<th>公共环境卫生类当月数：</th>
					<td><input name="wslys" type="text" data-rule="required:number;" value="${lxfwqzgz.wslys}"/>
					</td>
					<th style="padding-left: 80px">公共环境卫生类累计数：</th>
					<td><input name="wslljs" type="text" data-rule="required:number;" value="${lxfwqzgz.wslljs}"/></td>
				</tr>
				<tr>
					<th>物业管理类当月数：</th>
					<td><input name="wygllys" type="text" data-rule="required:number;" value="${lxfwqzgz.wygllys}"/>
					</td>
					<th style="padding-left: 80px">物业管理类累计数：</th>
					<td><input name="wygllljs" type="text" data-rule="required:number;" value="${lxfwqzgz.wygllljs}"/></td>
				</tr>
				<tr>
					<th>治安管理类当月数：</th>
					<td><input name="zagllys" type="text" data-rule="required:number;" value="${lxfwqzgz.zagllys}"/>
					</td>
					<th style="padding-left: 80px">治安管理类累计数：</th>
					<td><input name="zagllljs" type="text" data-rule="required:number;" value="${lxfwqzgz.zagllljs}"/></td>
				</tr>
				<tr>
					<th>其它类当月数：</th>
					<td><input name="qtlys" type="text" data-rule="required:number;" value="${lxfwqzgz.qtlys}"/>
					</td>
					<th style="padding-left: 80px">其它类累计数：</th>
					<td><input name="qtlljs" type="text" data-rule="required:number;" value="${lxfwqzgz.qtlljs}"/></td>
				</tr>
				<tr>
					<th>合计当月数：</th>
					<td><input name="hjys" type="text" data-rule="required:number;" value="${lxfwqzgz.hjys}"/>
					</td>
					<th style="padding-left: 80px">合计累计数：</th>
					<td><input name="hjljs" type="text" data-rule="required:number;" value="${lxfwqzgz.hjljs}"/></td>
				</tr>
				
				<tr>
					<th>征询问题类（件）：</th>
					<td><input name="zxwtlys" type="text" data-rule="required:number;" value="${lxfwqzgz.zxwtlys}"/>
					</td>
					<th style="padding-left: 80px">征询问题类（件）累计数：</th>
					<td><input name="zxwtlljs" type="text" data-rule="required:number;" value="${lxfwqzgz.zxwtlljs}"/></td>
				</tr>
				<tr>
					<th>居民区已解决问题（件）当月数：</th>
					<td><input name="jmqyjjys" type="text" data-rule="required:number;" value="${lxfwqzgz.jmqyjjys}"/>
					</td>
					<th style="padding-left: 80px">居民区已解决问题（件）累计数：</th>
					<td><input name="jmqyjjljs" type="text" data-rule="required:number;" value="${lxfwqzgz.jmqyjjljs}"/></td>
				</tr>
				<tr>
					<th>块层面自行解决（件）当月数：</th>
					<td><input name="kczxjjys" type="text" data-rule="required:number;" value="${lxfwqzgz.kczxjjys}"/>
					</td>
					<th style="padding-left: 80px">块层面自行解决（件）累计数：</th>
					<td><input name="kczxjjljs" type="text" data-rule="required:number;" value="${lxfwqzgz.kczxjjljs}"/></td>
				</tr>
				<tr>
					<th>街镇层面协调解决（件）当月数：</th>
					<td><input name="cmxtjjys" type="text" data-rule="required:number;" value="${lxfwqzgz.cmxtjjys}"/>
					</td>
					<th style="padding-left: 80px">街镇层面协调解决（件）累计数：</th>
					<td><input name="cmxtjjljs" type="text" data-rule="required;" value="${lxfwqzgz.cmxtjjljs}"/></td>
				</tr>
				<tr>
					<th>双代表解决（件）当月数：</th>
					<td><input name="sdbjjys" type="text" data-rule="required:number;" value="${lxfwqzgz.sdbjjys}"/>
					</td>
					<th style="padding-left: 80px">双代表解决（件）累计数：</th>
					<td><input name="sdbjjljs" type="text" data-rule="required:number;" value="${lxfwqzgz.sdbjjljs}"/></td>
				</tr>
				<tr>
					<th>短时期内难以解决（件）当月数：</th>
					<td><input name="nyjjys" type="text" data-rule="required:number;" value="${lxfwqzgz.nyjjys}"/>
					</td>
					<th style="padding-left: 80px">短时期内难以解决（件）累计数：</th>
					<td><input name="nyjjljs" type="text" data-rule="required:number;" value="${lxfwqzgz.nyjjljs}"/></td>
				</tr>
				<tr>
					<th>化解重大矛盾（起）当月数：</th>
					<td><input name="hjzdmdys" type="text" data-rule="required:number;" value="${lxfwqzgz.hjzdmdys}"/>
					</td>
					<th style="padding-left: 80px">化解重大矛盾（起）累计数：</th>
					<td><input name="hjzdmdljs" type="text" data-rule="required:number;" value="${lxfwqzgz.hjzdmdljs}"/></td>
				</tr>
				
				<tr>
					<th>上报街道待解决问题（件）当月数：</th>
					<td><input name="djjwtys" type="text" data-rule="required:number;" value="${lxfwqzgz.djjwtys}"/>
					</td>
					<th style="padding-left: 80px">上报街道待解决问题（件）累计数：</th>
					<td><input name="djjwtljs" type="text" data-rule="required:number;" value="${lxfwqzgz.djjwtljs}"/></td>
				</tr>
				
				<tr>
					<th>上年未解决问题（起）：</th>
					<td><input name="sbnwjj" type="text" data-rule="required:number;" value="${lxfwqzgz.sbnwjj}"/>
					</td>
					<th style="padding-left: 80px">上年遗留问题解决：</th>
					<td><input name="sbnyl" type="text" data-rule="required:number;" value="${lxfwqzgz.sbnyl}"/></td>
				</tr>
				<tr>
					<th>块数：</th>
					<td><input name="ks" type="text" data-rule="required:number;" value="${lxfwqzgz.ks}"/>
					</td>
					<th style="padding-left: 80px">组团力量（人）：</th>
					<td><input name="ztll" type="text" data-rule="required:number;" value="${lxfwqzgz.ztll}"/></td>
				</tr>
				<tr>
					<th>备注：</th>
					<td><input name="bz" type="text"   value="${lxfwqzgz.bz}"/>
					</td>
					<th style="padding-left: 80px">填报人签名：</th>
					<td><input name="tbrqm" type="text" data-rule="required;chinese;length[1~4]" value="${lxfwqzgz.tbrqm}"/></td>
				</tr>
				
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${lxfwqzgz.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>

<jsp:include page="/page/footer.jsp"></jsp:include>

</body>
</html>