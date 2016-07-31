<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE>台账导出</TITLE>
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
			$("#ywcode").val("123");//清空
			for(var i=0;i<nodes.length;i++){
				if(nodes[i].level ==3){
					//级别 3获取选中的项目
					mycount=mycount+1;
						$("#ywcode").val($("#ywcode").val()+"%"+nodes[i].code);
						$("#chendednames").append("<div style='float:left;margin-left: 10px' class='alert alert-success'><a class='close' onclick='clearcheck("+nodes[i].id+")' data-dismiss='alert' href='#'>&times;</a>"+nodes[i].name+"</div>");
				}
				
			}
			
			$("#checkCount").text(mycount);
			
			if($("#ywcode").val().indexOf("hyjl")!=-1){
				for(var i=1;i<=4;i++){
				 $("#hyjl"+i).show(); 
				}
			}else{
				for(var i=1;i<=4;i++){
					 $("#hyjl"+i).hide(); 
					}
			}
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
<div  style="overflow:scroll;width:30%; height:600px;float: left;" >
		<ul id="treeDemo" class="ztree"></ul>
	</div>
	
		
		<div  style="float: left;margin-left: 1%;width:68%">
		<div id="" class="alert alert-danger"><i class="icon-list"></i>已选择表：<strong id="checkCount"></strong></div>
		 <form action="/world/down" method="post" id="downdoc">
		<table>
		  <tr>
			    <td height="28" ><p >开始时间：</p></td>
			    <td ><input type="text"  onClick="WdatePicker({maxDate:'#F{$dp.$D(\'endDate\')}'})" id="startDate" class="Wdate"  data-rule="required;date"  name="startdate"></td>
			  </tr>
			  <tr>
			    <td height="29"><p >结束时间：</p></td>
			    <td ><input type="text" onClick="WdatePicker({minDate:'#F{$dp.$D(\'startDate\')}'})" id="endDate" class="Wdate" data-rule="required;date" name="enddate"/></td>
			  </tr>
			   <tr style="display: none;" id="hyjl1">
			    <td height="29"><p >会议类别：</p></td>
			    <td>
					   <input type="checkbox" value="爱国卫生(健康村建设)会议记录" name="hylb" id="hylb">爱国卫生（健康村建设）会议记录
					   <input type="checkbox" value="社区求助评议工作小组" name="hylb" id="hylb">社区求助评议工作小组
					   <input type="checkbox" value="老龄工作会议记录" name="hylb" id="hylb">老龄工作会议记录
					    										
					</td>
			  </tr>
			  <tr style="display: none;" id="hyjl2">
			  <th></th>
			  <td>
			   <input type="checkbox" value="残疾人协会会议记录" name="hylb" id="hylb">残疾人协会会议记录
					   <input type="checkbox" value="党群工作会议记录" name="hylb" id="hylb">党群工作会议记录		
					   <input type="checkbox" value="户代表会议记录" name="hylb" id="hylb">户代表会议记录 
					   <input type="checkbox" value="村民代表会议记录" name="hylb" id="hylb">村民代表会议记录
			  </td>
			  </tr>
			  <tr style="display: none;" id="hyjl3">
			  <th></th>
			   <td>
			      <input type="checkbox" value="村民小组长会议记录" name="hylb" id="hylb">村民小组长会议记录
				  <input type="checkbox" value="居委会例会记录" name="hylb" id="hylb">居委会例会记录
				  <input type="checkbox" value="居民小组长会议记录" name="hylb" id="hylb">居民小组长会议记录
				<input type="checkbox" value="全体村民会议记录" name="hylb" id="hylb">全体村民会议记录						   
			     </td>
			  </tr>
			  <tr style="display: none;" id="hyjl4">
			    <th></th>
			    <td>
			    <input type="checkbox" value="居委会成员(社工)碰头会议记录" name="hylb" id="hylb">居委会成员（社工）碰头会议记录
					   <input type="checkbox" value="居民代表会议记录" name="hylb" id="hylb">居民代表会议记录
					   <input type="checkbox" value="居民座谈会记录" name="hylb" id="hylb">居民座谈会记录
					   <input type="checkbox" value="统战工作会议记录" name="hylb" id="hylb">统战工作会议	
			    </td>
			  </tr>
			  <tr>
			   <tr>
			    <td height="29"></td>
			    <td > 
			    <div >
			     <span><i class="icon-bell"></i>温馨提示:导出多个表的时候，需要等待一段时间。</span>
			    <a  style="margin-left: 70px" onclick="startexp()"  class="btn  btn-primary" type="button"><i class='icon-print'></i>开始生成word</a>
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