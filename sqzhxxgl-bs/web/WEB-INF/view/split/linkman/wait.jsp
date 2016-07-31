<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<jsp:include page="/page/head.jsp"></jsp:include>
<script charset="utf-8" src="/zui/kindeditor/kindeditor-min.js"></script>
<script charset="utf-8" src="/zui/kindeditor/lang/zh_CN.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/ueditor.all.min.js"> </script>
<script type="text/javascript" charset="utf-8" src="/zui/ueditor/lang/zh-cn/zh-cn.js"></script>
<title>待回执</title>
<script type="text/javascript">
$(function()
		{
			$.ajax({
				url:'/linkman/get/'+$("#orgId").val(),
				type:'GET',
				success:function(obj)
				{
					var htmlStr = "";
					if(obj!=null)
					{
						for(var i = 0;i<obj.length;i++)
						{
							if("wait"!=obj[i].copy&&"wait"==obj[i].receiptId)
							{
								if("wait"==obj[i].replyContent)
								{
									htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].sendDate+"</td><td>"+obj[i].fromName+"</td><td>等待回复</td>"+
									"<td><div class='btn-group' ><a class='btn' href='/split/officer/info/"+obj[i].splitId+"/linkman_wait' >查看详情</a>"+
									"<a class='btn' href='/split/plan/"+obj[i].splitId+"/linkman_wait' >查看流程</a></div></td></tr>"
								}
								else
								{
									htmlStr += "<tr><td>"+obj[i].num+"</td><td>"+obj[i].sendDate+"</td><td>"+obj[i].fromName+"</td>"+
									"<td>已回复</td>"+
									"<td><div class='btn-group' ><a class='btn' href='/split/linkreply/"+obj[i].pid+"' >查看回复</a>"+
									"<a class='btn' href='/split/officer/info/"+obj[i].splitId+"/linkman_wait' >查看详情</a>"+
									"<a href='/split/plan/"+obj[i].splitId+"/linkman_wait' class='btn' >查看流程</a>"+
									"<a class='btn' href='/split/receipt/"+obj[i].pid+"'  >回执</a></div></td></tr>"
								}
							}
						}
					}
					$("#info").append(htmlStr);
				}
			})	
			
			$.ajax
			({
				url:'/organ/org/'+$("#orgId").val(),
				type:'GET',
				success:function(obj)
				{
					for(var i = 0;i<obj.length;i++)
					{
						if("d2a13989-5a1d-48cc-8ab8-5ddf20cfb3f1"==obj[i].parent.id)
						{
							$("#area_wbj").append(obj[i].name+"<input type=checkbox name=wbj value= "+obj[i].id+" class=no_border   style=width:60px>")
						}
						else
						{
							$("#town_wbj").append(obj[i].name+"<input type=checkbox name=wbj value= "+obj[i].id+" class=no_border   style=width:60px>")
						}
					}
				}
			})
		})
	
		function go()
		{
			var checked = "";
			$('input:checkbox:checked').each(function() 
			{ 
				 checked += "@"+$(this).val();
			});
			
			var copyObj = {};
			copyObj.fromId = $("#orgId").val();
			copyObj.fromName = $("#orgName").val()+"-"+$("#role").val();
			copyObj.myId = checked;
			copyObj.splitId = objid;
			copyObj.replyContent = "wait";
			copyObj.copyType = "linkman";
			
			var json = JSON.stringify(copyObj);
			
			$.ajax({
				url:'/linkman/insertCopy/'+objid+"/"+pid,
				type:'POST',
				data:json,
				dataType:'json',
				contentType:'application/json;charset=UTF-8',
				success:function(obj)
				{
					if(obj!=null)
					{
						alert("转发成功！");
						location.href = "/linkman/index";
					}
				}
				})
		}
		</script>

</head>
<body>
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 	<li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>
    <li><a href="#">联系单</a> <span class="divider">/</span></li>
    <li class="active">待回执</li>
  </ul>
  <div class="panhead"><i class="icon-pencil"></i>&nbsp;&nbsp;<strong>待回执</strong></div>
	<br>
	<input type="hidden" id="orgId"  value="${sessionScope.userOrgan.id }" >
	<input type="hidden" id="orgName"  value="${sessionScope.userOrgan.name }" >
	<input type="hidden" id="role"  value="${sessionScope.userRole }" >
	<input type="hidden" id="parentOrgId" value="${sessionScope.userOrgan.parent.id }" >
	<table class="table table-striped table-bordered table-hover" id="info" style="width: 100%" >
		<thead>
			<tr><th>序号</th><th>发送日期</th><th>发送方</th><th>状态</th><th>操作</th></tr>
		</thead>
	</table>
	<div id="copy" style="display: none;width: 100%">
	转发部门:
		<div style="height: 30px"></div>
		<div id="area_wbj" style="text-indent:2em" ></div>
		<div id="town_wbj" style="text-indent:2em" ></div>
		<div style="height: 50px"></div>
		<a class="btn btn-info" href="javascript:go()" >确认转发</a>
		<a class="btn btn-danger" href="javascript:cancle()" >取消</a>
	</div>
	<jsp:include page="/page/footer.jsp"></jsp:include>
</body>
</html>