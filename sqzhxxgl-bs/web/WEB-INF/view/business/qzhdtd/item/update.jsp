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
    <li><a href="/qzhdtd/list/1">上海市嘉定区社区群众活动团队备案表</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong> 上海市嘉定区社区群众活动团队备案表</div>
  <div id="panbody">
	<div class="container">
		<form action="/qzhdtd/item/update" method="post">
			<table>
					<tr>
					<th>群团名称：</th>
					<td><input name="qtmc" type="text" data-rule="required;length[1~20];" value="${qzhdtd.qtmc}"/>
					</td>
					<th style="padding-left: 80px">所属社区：</th>
					<td><input name="sssq" type="text" data-rule="required;length[1~20];" value="${qzhdtd.sssq}"/></td>
				</tr>
			
				<tr>
					<th>成立时间：</th>
					<td><input name="clsj" type="text" data-rule="required;" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${qzhdtd.clsj}"/>
					</td>
					<th style="padding-left: 80px">活动地点：</th>
					<td><input name="hddz" type="text" data-rule="required;length[1~20];" value="${qzhdtd.hddz}"/></td>
				</tr>
				<tr>
					<th>活动内容：</th>
					<td><input name="hdnr" type="text" data-rule="required;length[1~20];" value="${qzhdtd.hdnr}"/>
					</td>
					<th style="padding-left: 80px">活动时间：</th>
					<td><input name="hdsj" type="text" data-rule="required;" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${qzhdtd.hdsj}"/></td>
				</tr>
				
				<tr>
					<th>每周活动次数：</th>
					<td><input name="mzhdcs" type="text" data-rule="required;number;" value="${qzhdtd.mzhdcs}"/>
					</td>
					<th style="padding-left: 80px">参加人数：</th>
					<td><input name="cjrs" type="text" data-rule="required;number;" value="${qzhdtd.cjrs}"/></td>
				</tr>
				<tr>
					<th>其中中共党员人数：</th>
					<td><input name="dyrs" type="text" data-rule="required;number;" value="${qzhdtd.dyrs}"/>
					</td>
					<th style="padding-left: 80px">姓名：</th>
					<td><input name="fzrxm" type="text" data-rule="required;chinese;length[1~4]" value="${qzhdtd.fzrxm}"/></td>
				</tr>
				<th style="color: red;">负责人或召集人情况</th>
				<tr>
					<th>性别：</th>
					<td>
					    <input name="fzrxb" type="radio" value="男" checked="checked"/>男 <input name="fzrxb" type="radio" value="女" />女
					</td>
					<th style="padding-left: 80px">年龄：</th>
					<td><input name="fzrnl" type="text" data-rule="required:digits;range[18~100]"  value="${qzhdtd.fzrnl}"/></td>
				</tr>
				<tr>
					<th>政治面貌：</th>
					<td><input name="fzrzzmm" type="text" data-rule="required;length[1~10];" value="${qzhdtd.fzrzzmm}"/>
					</td>
					<th style="padding-left: 80px">家庭地址：</th>
					<td><input name="fzrjtzz" type="text" data-rule="required;length[1~20];" value="${qzhdtd.fzrjtzz}"/></td>
				</tr>
				<tr>
					<th>工作单位：</th>
					<td><input name="fzrgzdw" type="text" data-rule="required;length[1~20];" value="${qzhdtd.fzrgzdw}"/>
					</td>
					<th style="padding-left: 80px">联系电话：</th>
					<td><input name="fzrlxdh" type="text" data-rule="required;mobile" value="${qzhdtd.fzrlxdh}"/></td>
				</tr>
				<tr>
					<th>委派情况：</th>
					<td>
					     <input name="wpqk" type="radio" value="已委派" checked="checked"/>已委派<input name="wpqk" type="radio" value="未委派" />未委派
					</td>
					<th style="padding-left: 80px">指导员姓名：</th>
					<td><input name="zdyxm" type="text" data-rule="required;chinese;length[1~4]" value="${qzhdtd.zdyxm}"/></td>
				</tr>
				<th style="color: red;">政治指导员（或党建联络员）情况</th>
				<tr>
					<th>指导员性别：</th>
					<td>
					    <input name="zdyxb" type="radio" value="男" checked="checked"/>男 <input name="zdyxb" type="radio" value="女" />女
					</td>
					<th style="padding-left: 80px">指导员年龄：</th>
					<td><input name="zdynl" type="text" data-rule="required:digits;range[18~100]" value="${qzhdtd.zdynl}"/></td>
				</tr>
				<tr>
					<th>指导员工作单位及职务：</th>
					<td><input name="zdygzdw" type="text" data-rule="required;length[1~30];" value="${qzhdtd.zdygzdw}"/>
					</td>
					<th style="padding-left: 80px">指导员所属党组织：</th>
					<td><input name="dzz" type="text" data-rule="required;length[1~20];" value="${qzhdtd.dzz}"/></td>
				</tr>
				<tr>
					<th>指导员联系电话：</th>
					<td><input name="zdylxdh" type="text" data-rule="required;mobile;" value="${qzhdtd.zdylxdh}"/>
					</td>
					<th style="padding-left: 80px">年龄：</th>
					<td><input name="zdynl" type="text" data-rule="required:digits;range[18~100]" value="${qzhdtd.zdynl}"/></td>
				</tr>
				<tr>
					<th>所在社区备案意见：</th>
					<td><input name="sqbayj" type="text" data-rule="required;length[1~50];"  value="${qzhdtd.sqbayj}"/>
					</td>
					<th style="padding-left: 80px">年月：</th>
					<td><input name="bnny" type="text" data-rule="required;" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${qzhdtd.bnny}"/></td>
				</tr>
				
				<tr>
					<th>街镇审核意见：</th>
					<td><input name="shyj" type="text" data-rule="required;length[1~30];" value="${qzhdtd.shyj}"/>
					</td>
					<th style="padding-left: 80px">年月：</th>
					<td><input name="shyjny" type="text" data-rule="required;" onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" value="${qzhdtd.shyjny}"/></td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${qzhdtd.id}">
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
		$('input[name=wpqk][type=radio][value=${qzhdtd.wpqk}]').attr('checked', true);
		$('input[name=zdyxb][type=radio][value=${qzhdtd.zdyxb}]').attr('checked', true);
		$('input[name=fzrxb][type=radio][value=${qzhdtd.fzrxb}]').attr('checked', true);
	});
	</script>
</body>
</html>