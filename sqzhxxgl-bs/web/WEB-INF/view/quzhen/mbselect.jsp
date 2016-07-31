<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="zh">
<head>
<link rel="stylesheet" href="/zui/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="/scripts/jquery.min.js"></script>
	<script type="text/javascript" src="../../../zui/zTree/js/jquery.ztree.core-3.5.min.js"></script>
	<script type="text/javascript" src="../../../zui/zTree/js/jquery.ztree.excheck-3.5.js"></script>
    <link rel="stylesheet" type="text/css" href="../../../zui/bs2/css/bootstrap.css">
    <script type="text/javascript" src="../../../zui/datepicker/WdatePicker.js"></script>
    <script type="text/javascript" src="/zui/bs2/js/bootstrap.js"></script>
  <SCRIPT type="text/javascript">
		

		//-->
	</SCRIPT>
<script type="text/javascript">
	var mycount=0;
	var setting = {
		check: {
			enable: false
		},
		data: {
			simpleData: {
				enable: true
			}
		},
		callback: {
			onClick : onCheck
		}
	};
	var clearFlag = false;
	function onCheck(e, treeId, treeNode) {
		//这里获取ID  
		if(treeNode.level==2){
			//alert("选择的ID==="+treeNode.id+"名字====="+treeNode.name)
			$("#orgid").val(treeNode.id);
		}
	}
	$(document).ready(function() {
		var zNodes = [];
	
		$.ajax({
			type:"GET",
			url:"/quzhen/organization",
			dataType:"json",
			global:false,
			async:false,
			success:function(strResult){
			
				zNodes =eval(strResult);
			}
		});
		$.fn.zTree.init($("#treeDemo"), setting,zNodes);
		//count();
		clearFlag = $("#last").attr("checked");
		if(""!=""){
			alert("");
		}
	});

	function showhide(id){
	$("#wellpanel>:visible").hide();
	$("#show"+id).show();
	parent.iFrameHeight();
	}

</script>
<style type="text/css">
 .span1
 {
     
      text-align: center;
      background-color: #ddd;
      margin-top: 10px;
     padding-left: 10px
    }
</style>
</head>
<body style="margin-left: 10px; margin-top: 15px">
 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>

    <li class="active">模板导出</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
	<!-- 左边选择居委会 -->
	<div  style="overflow:scroll;width:25%; height:600px;float: left;" >
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	<!-- 结束 -->
		<div class="well" style="width:20%;float: left;">
	
  <ul class="nav nav-list">
    <li class="active"><a href="#"><i class="icon-book icon-white"></i> 模板列表</a></li>
    <c:forEach items="${datas}" var="mould" varStatus="num">
    <li><a><i><input name="type" type="radio" value="${mould.id}" /></i> 
     ${mould.mould_name}
    </a></li>
</c:forEach>
  </ul>

  		<div  class="pagination" style="margin-top: 0px">
		<ul style="float: right;" id="b_pagination"></ul></div>
	</div>
	<br>
</div>

<div id="wellpanel"  style="padding: 8px 0; margin-bottom: 0;width:55%;  margin-left: 10px">


<div class="container">
<form action="/quzhen/down" method="post" id="downdoc">
		<table>
		  <tr>
			    <th style="padding-left: 40px" width="100px"><p >开始时间：</p></th>
			    <td  ><input type="text"  onClick="WdatePicker({maxDate:'#F{$dp.$D(\'endDate\')}'})" id="startDate" class="Wdate"    name="startdate"></td>
			  </tr>
			  <tr>
			    <th style="padding-left: 40px"><p >结束时间：</p></th>
			    <td ><input type="text" onClick="WdatePicker({minDate:'#F{$dp.$D(\'startDate\')}'})" id="endDate" class="Wdate"   name="enddate"/></td>
			  </tr>
			  <tr>
			   <tr>
			    <td height="29"></td>
			    <td > 
			    <div >
			     <span><i class="icon-bell"></i>温馨提示:导出多个表的时候，需要等待一段时间。</span>
			   
			      <a  style="margin-left: 70px" onclick="startexp()"  class="btn  btn-primary" type="button"><i class='icon-print'></i>开始导出</a>
			    </div>
			   </td>
			  </tr>
			  <tr>
		</table>
			<input type="hidden" name='mouldid' id="mouldid" />
			<input type="hidden" name='orgid' id="orgid" />
	 </form></div>

</div>
	
<script src="/scripts/dialog.js"></script>
<script src="/scripts/pagination.js"></script>
<script src="/scripts/jquery.validator.min.js"></script>
<script src="/scripts/zh_CN.js"></script>
<script src="/scripts/base.js"></script>

	<script>
	//分页
	var pagination = new buguPagination('${current}',
			'${pages}', '${count}', '/quzhen/select/');
	$('#b_pagination').html(pagination.show());
	var mycount=0;
	//设置单选框的第一个选中
	document.getElementsByName("type")[0].checked="checked";
	function   startexp(){
		  if($("#startDate").val()=="" || $("#endDate").val()=="" ){
		    parent.$.jBox.tip('导出失败:<br>请输入您需要导出的表单数据库的开始时间和结束时间！');
		    return false;
		  }
		  if($("#orgid").val()==""){
			    parent.$.jBox.tip('导出失败:<br>请选择一个居委会或者村委会！');
			    return false;
			  }
		  	var item = $(":radio:checked"); 
			var len=item.length; 
			if(len>0){ 
			//  alert("yes--选中的值为："+$(":radio:checked").val()); 
			  $("#mouldid").val($(":radio:checked").val());
			} 
			$("#downdoc").submit();  //临时关闭
		    parent.$.jBox.tip("正在努力为您生成文档", 'loading');
		 
		    window.setTimeout(function () { parent.$.jBox.tip('导出成功.。', 'success'); }, mycount*1000);
		}
	parent.iFrameHeight();
	</script>
</body>
</html>