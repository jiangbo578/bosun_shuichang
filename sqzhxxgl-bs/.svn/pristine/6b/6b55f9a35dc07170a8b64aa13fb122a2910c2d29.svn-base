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
    <li><a href="/business/1/null">业务管理</a> <span class="divider">/</span></li>
        <li><a href="#">业务提醒</a> <span class="divider">/</span></li>
    <li class="active">业务添加</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
  	<div class="mianpan">
  <div class="panhead">
  <i class="icon-list">&nbsp;&nbsp;</i><strong>业务添加</strong>
  
   
  </div>
	<div class="container">
		<form action="/business/remind/add" method="post">

			<table>
			
				<tr>
					<td>月份：<input type="hidden" id="b_defaultDate" value="01月01日"/></td>
					<td>提醒日：</td>
					<td>绿灯开始日：</td>
					<td>黄灯开始日：</td>
					<td>红灯开始日：</td>
					<td>操作：</td>
				</tr>
				<tr>
					<td>每月快捷设置：</td>
					<td><input type="text" id="remindDay" style="width: 50px"/>日</td>
					<td><input type="text" id="greenDay" style="width: 50px"/>日</td>
					<td><input type="text" id="yellowDay" style="width: 50px"/>日</td>
					<td><input type="text" id="redDay" style="width: 50px"/>日</td>
					<td>&nbsp;</th>
				</tr>
				<c:forEach begin="1" end="12" varStatus="num">
				<tr>
					<td align="right"><c:set var="month" value="${num.count < 10 ? '0' : '' }${num.count}"/>${month }月：</td>
					<td><input style="width: 150px"  type="text" name="remindDate" id="b_remindDate_${num.count }"
						onClick="WdatePicker({dateFmt:'${month }月dd日'})" class="Wdate" />
					</td>
					<td><input type="text" style="width: 150px" name="greenStart" id="b_greenStart_${num.count }"
						onClick="WdatePicker({dateFmt:'MM月dd日', startDate:'%y-${month }-01', alwaysUseStartDate:true, minDate:'#F{$dp.$D(\'b_defaultDate\')}', maxDate:'#F{$dp.$D(\'b_remindDate_${num.count }\')}'})" class="Wdate" />
					</td>
					<td><input style="width: 150px"  type="text" name="yellowStart" id="b_yellowStart_${num.count }" 
						onClick="WdatePicker({dateFmt:'MM月dd日', minDate:'#F{$dp.$D(\'b_greenStart_${num.count}\')}', maxDate:'#F{$dp.$D(\'b_remindDate_${num.count }\')}'})" class="Wdate" />
					</td>
					<td><input style="width: 150px"  type="text" name="redStart" id="b_redStart_${num.count }"
						onClick="WdatePicker({dateFmt:'MM月dd日', minDate:'#F{$dp.$D(\'b_yellowStart_${num.count}\')}', maxDate:'#F{$dp.$D(\'b_remindDate_${num.count }\')}'})" class="Wdate"/>
					</td>
					<td><a href="javascript:void(0);" class="b_delete_business_remind">清除</a></td>
				</tr>
				</c:forEach>
				<tr>
					<th>&nbsp;</th>
					<td colspan="4">注意：如果选择了月份的提醒日，表示该月有提醒。</td>
				</tr>
				<tr>
					<th>&nbsp;</th>
					<td>	<button  class="btn btn-primary" type="submit" ><i class="icon-ok-sign"></i> 保存</button>
				<button  class="btn btn-info" type="button" onclick="window.history.go(-1)" ><i class="icon-share-alt"></i> 返回</button>
				
					<input type="hidden" name="businessId" value="${businessId}">
					</td>
				</tr>
			</table>
		</form>
	</div>


		</div>



<jsp:include page="/page/footer.jsp"></jsp:include>
	<script>
	$(function(){
		var check = function(name, value){
			var val = $.trim(value);
			if(val != ''){
				if(isNaN(val)){
					alert('绿灯开始日必须是数字');
					return;
				}
				
				val = parseInt(val);
				
				if(val > 31){
					alert('月的天数最多为31天');
					return;
				}
				$('input[name='+name+'][type=text]').each(function(index){
					this.value = (++index < 10 ? '0' : '') + index + '月' + (val < 10 ? '0' : '') + val + '日';
				});
			}
		}
		$('#remindDay').on('blur', function(){
			check('remindDate', this.value);
		});
		$('#greenDay').on('blur', function(){
			check('greenStart', this.value);
		});
		$('#yellowDay').on('blur', function(){
			check('yellowStart', this.value);
		});
		$('#redDay').on('blur', function(){
			check('redStart', this.value);
		});
		$('.b_delete_business_remind').on('click', function() {
			$(this).parent().parent().find('input').val('');
			return false;
		});
	});
	</script>
</body>
</html>