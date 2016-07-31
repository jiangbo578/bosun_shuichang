<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE>级联组织机构</TITLE>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<!-- 	<link rel="stylesheet" href="../../../css/demo.css" type="text/css"> -->
	<link rel="stylesheet" href="./zui/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="./scripts/jquery.min.js"></script>
	<script type="text/javascript" src="./zui/zTree/js/jquery.ztree.core-3.5.js"></script>
	<script type="text/javascript" src="./zui/zTree/js/jquery.ztree.excheck-3.5.js"></script>
	<!--
	<script type="text/javascript" src="../../../js/jquery.ztree.exedit-3.5.js"></script>
	-->
  <link rel="stylesheet" type="text/css" href="/zui/bs2/css/bootstrap.css">
  <!--[if lte IE 6]>
  <link rel="stylesheet" type="text/css" href="/zui/bs2/css/bootstrap-ie6.css">
  <![endif]-->
  <!--[if lte IE 7]>
  <link rel="stylesheet" type="text/css" href="/zui/bs2/css/ie.css">
  <![endif]-->
  <script type="text/javascript" src="/zui/datepicker/WdatePicker.js"></script>
  
	<SCRIPT type="text/javascript">
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
				alert("选择的ID==="+treeNode.id+"名字====="+treeNode.name)
			}
		}
		$(document).ready(function() {
			var zNodes = [];

			$.ajax({
				type:"GET",
				url:"/organization/orglit/"+new Date(),
				dataType:"json",
				global:false,
				async:false,
				success:function(strResult){
				
					zNodes =eval(strResult);
				}
			});
			$.fn.zTree.init($("#treeDemo"), setting,zNodes);
			count();
			clearFlag = $("#last").attr("checked");
			if(""!=""){
				alert("");
			}
		});

		//-->
	</SCRIPT>
</HEAD>

<BODY style="margin-top: 10px;margin-left: 10px">

 

<!--  class="zTreeDemoBackground left"
class="zTreeDemoBackground right" -->

<div  style="overflow:scroll;width:20%; height:600px;float: left;" >
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	
		
		

	
	 
	
	<script type="text/javascript" src="/zui/bs2/js/bootstrap.js"></script>
<!--[if lte IE 6]>
  <script type="text/javascript" src="/zui/bs2/js/bootstrap-ie.js"></script>
  <![endif]-->

  
  <script type="text/javascript">
  
	function   startexp(){
	  if($("#startDate").val()=="" || $("#endDate").val()=="" ){
	  parent.$.jBox.tip('导出失败:<br>请输入您需要导出的表单数据库的开始时间和结束时间！');
	    return false;
	  }
	  
	  	  if( mycount==0){
	  parent.$.jBox.tip('导出失败:<br>当前您没有选中任何表导出！');
	    return false;
	  }

	  
		$("#downdoc").submit();  //临时关闭
	    parent.$.jBox.tip("正在努力为您生成文档", 'loading');
	 
	    window.setTimeout(function () { parent.$.jBox.tip('导出成功.。', 'success'); }, mycount*1000);
	}
</script>
  
</BODY>
</HTML>