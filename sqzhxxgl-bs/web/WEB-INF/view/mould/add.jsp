<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE>台账导出</TITLE>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<!-- 	<link rel="stylesheet" href="../../../css/demo.css" type="text/css"> -->
	<link rel="stylesheet" href="../../../zui/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="../../../scripts/jquery.min.js"></script>
	<script type="text/javascript" src="../../../zui/zTree/js/jquery.ztree.core-3.5.js"></script>
	<script type="text/javascript" src="../../../zui/zTree/js/jquery.ztree.excheck-3.5.js"></script>
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
				enable: true
			},
			data: {
				simpleData: {
					enable: true
				}
			},
			callback: {
				onCheck: onCheck
			}
		};

		var clearFlag = false;
		function onCheck(e, treeId, treeNode) {
			
			count();
			if (clearFlag) {
				clearCheckedOldNodes();
			}
		}
		function clearCheckedOldNodes() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			nodes = zTree.getChangeCheckedNodes();
			for (var i=0, l=nodes.length; i<l; i++) {
				nodes[i].checkedOld = nodes[i].checked;
			}
		}
		function count() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			checkCount = zTree.getCheckedNodes(true).length,
			nocheckCount = zTree.getCheckedNodes(false).length,
			changeCount = zTree.getChangeCheckedNodes().length;
			mycount=0;
			var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
			var nodes = treeObj.getCheckedNodes(true);
			$("#chendednames").html("");
			$("#ywcode").val("");//清空
			for(var i=0;i<nodes.length;i++){
				if(nodes[i].level ==3){
					//级别 3获取选中的项目
					mycount=mycount+1;
						
						$("#ywcode").val($("#ywcode").val()+nodes[i].id+"%");
						$("#chendednames").append("<div style='float:left;margin-left: 10px' class='alert alert-success'><a class='close' onclick='clearcheck("+nodes[i].id+")' data-dismiss='alert' href='#'>&times;</a>"+nodes[i].name+"</div>");
				}
				
			}
			
			$("#checkCount").text(mycount);
			/* $("#nocheckCount").text(nocheckCount);
			$("#changeCount").text(changeCount); */

		}
		function createTree() {
			
			
		}
		//删除选中
		function clearcheck(id){

			var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
			var nodes = treeObj.getCheckedNodes(true);
		for (var i=0, l=nodes.length; i < l; i++) {
		
			if(nodes[i].id==id){
			
 				treeObj.checkNode(nodes[i], false, false, true);
			}
	
}
		
		}
/* 		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			setCheck();
			$("#py").bind("change", setCheck);
			$("#sy").bind("change", setCheck);
			$("#pn").bind("change", setCheck);
			$("#sn").bind("change", setCheck);
		});
		 */
		
		$(document).ready(function() {
			var zNodes = [];

			$.ajax({
				type:"GET",
				url:"/taizhang/typejson/"+new Date(),
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

 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>

    <li class="active">台账导出</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
 <div  id="mianpan">
<!--  class="zTreeDemoBackground left"
class="zTreeDemoBackground right" -->
<div  style="overflow:scroll;width:30%; height:400px;float: left;" >
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	
		
		<div  style="float: left;margin-left: 1%;width:65%">
		<div id="" class="alert alert-danger"><i class="icon-list"></i>已选择表：<strong id="checkCount"></strong></div>
		 <form action="/mould/add" method="post" id="downdoc">
		<table>
		  <tr>
			    <th height="28" ><p >模版名称：</p></th>
			    <td ><input type="text"  id="mould_name" data-rule="required"  name="mould_name"></td>
			  </tr>
			  <tr>
			    <th height="29"><p >使用部门：</p></th>
			    <td ><input type="text"  id="department"  data-rule="required" name="department"/></td>
			  </tr>
			   <tr>
			    <th height="29"><p >备注：</p></th>
			    <td ><input type="text"  id="remark"  data-rule="required" name="remark"/></td>
			  </tr>
			  <tr>
			   <tr>
			    <td height="29"></td>
			    <td > 
			    <div >
			     <span><i class="icon-bell"></i>请选择该模板需要的表单。</span>
			    <a  style="margin-left: 70px" onclick="startexp()"  class="btn  btn-primary" type="button"><i class='icon-print'></i>保存</a>
			    </div>
			   </td>
			  </tr>
			  <tr>
		</table>
			<input type="hidden" name='code' id="ywcode" />
	 </form>
		<br>
				<div id="" class="alert alert-info"><strong id="checkCount"><i class=" icon-flag"></i>已选择的表</strong></div>
		<div id="chendednames" style="float: width: 100%;height: 500px"></div>
		
	</div>
	
	 </div>
	
	 
	
	<script type="text/javascript" src="/zui/bs2/js/bootstrap.js"></script>
<!--[if lte IE 6]>
  <script type="text/javascript" src="/zui/bs2/js/bootstrap-ie.js"></script>
  <![endif]-->

  
  <script type="text/javascript">
  
	function   startexp(){
	  if($("#mould_name").val()=="" || $("#department").val()=="" ){
	  parent.$.jBox.tip('保存失败:<br>请输入模版名称和使用部门！');
	    return false;
	  }
	  
	  	  if( mycount==0){
	  parent.$.jBox.tip('保存失败:<br>当前没有选择表单！');
	    return false;
	  }

	  
		$("#downdoc").submit();  //临时关闭
	    
	}
</script>
  
</BODY>
</HTML>