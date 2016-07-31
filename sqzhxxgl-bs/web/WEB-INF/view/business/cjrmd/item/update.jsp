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
    <li><a href="/cjrmd/list/1">残疾人名单</a> <span class="divider">/</span></li>
    <li class="active">修改</li>
    </ul>
	<div class="mianpan">
  <div class="panhead"><i class="icon-list">&nbsp;&nbsp;</i><strong>数据修改</strong>残疾人名单</div>
  <div id="panbody">
	<div class="container">
		<form action="/cjrmd/item/update" method="post">

			<table>
				<tr>
					<th>姓名：</th>
					<td><input name="name" type="text"   data-rule="required" value="${cjrmd.name}"/>
					</td>
				</tr>
				<tr>
					<th>性别：</th>
					<td><input name="sex" type="radio" value="男" checked="checked"/>男 
						<input name="sex" type="radio" value="女" />女
					</td>
				</tr>
				
				<tr>
					<th>出生年月：</th>
					<td><input name="birthday" type="text" data-rule="required;date" 
					onClick="WdatePicker({dateFmt:'yyyy-MM-dd'})" class="Wdate" id="birthday" value="${cjrmd.birthday}"/>
					</td>
				</tr>
				<tr>
					<th>户籍地址：</th>
					<td><input name="address" type="text" id="address" data-rule="required" value="${cjrmd.address}"/>
					</td>
				</tr>
				
				<tr>
					<th>残疾类别：</th>
					<td><select name="cjlb" id="cjlb">
					     <option value="视力">视力</option>
					     <option value="听力">听力</option>
					     <option value="言语">言语</option>
					     <option value="智力">智力</option>
					     <option value="肢体">肢体</option>
					     <option value="精神">精神</option>
					     <option value="无业">无业</option>
					     <option value="重残无业">重残无业</option>
					   </select>
					</td>
				</tr>	
				
				<tr>
					<th>残疾证号：</th>
					<td><input name="cjzh" type="text" id="cjzh" data-rule="required" value="${cjrmd.cjzh }"/>
					</td>
				</tr>	
				<tr>
					<th>备注：</th>
					<td><input name="remark" type="text" value="${cjrmd.remark }"/>
			
					</td>
				</tr>	
				<%--<tr>
					<th>类别：</th>
					<td><select id="lb" name="lb">
			       <option value="0～18周年残疾少年儿童">0～18周年残疾少年儿童</option>
			       <option value="实施“送康复服务上门”的残疾人">实施“送康复服务上门”的残疾人</option>
			       <option value="残疾人养护人员">残疾人养护人员</option>
			       <option value="实施“居家养护服务”残疾人">实施“居家养护服务”残疾人</option>
			       <option value="参加“阳光之家”残疾人">参加“阳光之家”残疾人</option>
			       <option value="参加“职业康复援助基地”残疾人">参加“职业康复援助基地”残疾人</option>
			       <option value="参加“阳光心园”残疾人">参加“阳光心园”残疾人</option>
			       <option value="实施“家庭组合适配和职业定向适配”残疾人">实施“家庭组合适配和职业定向适配”残疾人</option>
			       <option value="专业机构康复人员、中途之家学员">专业机构康复人员、中途之家学员</option>
			       <option value="残疾人文化体育骨干">残疾人文化体育骨干</option>
			       <option value="盲人信息无障碍">盲人信息无障碍</option>
			       <option value="参加社区体育活动的残疾人">参加社区体育活动的残疾人</option>
			       <option value="参加残疾人睦邻点活动人员名册">参加残疾人睦邻点活动人员名册</option>
			       <option value="残疾人协会会议记录">残疾人协会会议记录</option>
			     </select>
			
					</td>
				</tr>	
					--%>
					<tr>
					<th>类别：</th>
					<td>
				     <input type="checkbox"  id="lb" name="lb" value="0～18周年残疾少年儿童">0～18周年残疾少年儿童
				     <input type="checkbox"  id="lb" name="lb" value="送康复服务上门">送康复服务上门
				     <input type="checkbox" id="lb" name="lb" value="残疾人养护人员">残疾人养护人员
				     <input type="checkbox" id="lb" name="lb" value="居家养护服务">居家养护服务
				     <input type="checkbox" id="lb" name="lb" value="参加“阳光之家”">参加“阳光之家”
				    
				     
			    
					</td>
					<tr>
					<th>类别：</th>
					<td>
				     <input type="checkbox" id="lb" name="lb" value="参加“职业康复援助基地”">参加“职业康复援助基地”
				     <input type="checkbox" id="lb" name="lb" value="参加“阳光心园”残疾人">参加“阳光心园”残疾人
				     <input type="checkbox" id="lb" name="lb" value="家庭组合适配和职业定向适配">家庭组合适配和职业定向适配
				     <input type="checkbox" id="lb" name="lb" value="专业机构康复人员、中途之家学员">专业机构康复人员、中途之家学员
				     <input type="checkbox" id="lb" name="lb" value="专业机构康复人员、中途之家学员">专业机构康复人员、中途之家学员
				   
			    
					</td>
				</tr>	
				<tr>
					<th>类别：</th>
					<td>
				   <input type="checkbox" id="lb" name="lb" value="残疾人文化体育骨干">残疾人文化体育骨干
				     <input type="checkbox" id="lb" name="lb" value="盲人信息无障碍">盲人信息无障碍
				     <input type="checkbox" id="lb" name="lb" value="参加社区体育活动的残疾人">参加社区体育活动的残疾人
				     <input type="checkbox" id="lb" name="lb" value="参加残疾人睦邻点活动人员名册">参加残疾人睦邻点活动人员名册
				     <input type="checkbox" id="lb" name="lb" value="残疾人协会会议记录">残疾人协会会议记录
					</td>
				</tr>	<tr>
					<th>&nbsp;</th>
					<td><button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				<input type="hidden" value="${cjrmd.lb}" id="clb">
					<input type="hidden" name="businessFormId" value="${businessFormId}">
					<input type="hidden" name="id" value="${cjrmd.id}">
					</td>
				</tr>
			</table>
		</form>
	</div>

	</div>
</div>
<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	$(function() {
		var lb=$("#clb").val();
		var str=lb.split(",");
		//alert(str)
		for(var i=0;i<str.length;i++){
			$("input:checkbox[value='"+str[i]+"']").attr('checked','true');
		}
			$('input[name=sex][type=radio][value=${cjrmd.sex}]').attr('checked', true);
			$("#cjlb option[value='${cjrmd.cjlb}']").attr("selected", true);
			//$("#lb option[value='${cjrmd.lb}']").attr("selected", true);
		});
	
	</script>
</body>
</html>