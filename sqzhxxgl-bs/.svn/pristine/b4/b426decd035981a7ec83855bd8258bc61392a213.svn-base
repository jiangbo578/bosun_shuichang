<%@ page language="java" pageEncoding="UTF-8" %>
    <link rel="stylesheet" href="../zui/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="../../../scripts/jquery.min.js"></script>
	<script type="text/javascript" src="../../../zui/zTree/js/jquery.ztree.core-3.5.js"></script>
	<script type="text/javascript" src="../../../zui/zTree/js/jquery.ztree.excheck-3.5.js"></script>
	
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
			//	alert("选择的ID==="+treeNode.id+"名字====="+treeNode.name)
			  <shiro:hasAnyRoles name="shejianban,nongwei">
			//社建办查看
			  changepage("/kpxt/item/sjb?id="+treeNode.id);
			</shiro:hasAnyRoles>
			<shiro:hasAnyRoles name="qznbm,lxd">
				changepage("/kpxt/item/findkp?id="+treeNode.id);
				</shiro:hasAnyRoles>
				
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
			//count();
			clearFlag = $("#last").attr("checked");
			if(""!=""){
				alert("");
			}
		});

		//-->
	</SCRIPT>
<div class="leftNav fl">
<div class="menu fl" id="menu">
<shiro:hasAnyRoles name="qznbm,lxd,shejianban,nongwei">
<div  style="overflow:scroll;width:100%; float: left;height: 500px">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
  </shiro:hasAnyRoles>
  <shiro:hasAnyRoles name="ganshi">
        <strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">600分评级</a></strong>
	        <div class="menu-c">
	            <ul id="ktdom">
	            	<li><a href="javascript:changepage('/kpxt/item/add')" >填写600分评级</a></li>
	            	<li><a href="javascript:changepage('/kpxt/item/submit')" >已提交600分评级</a></li>  
	            	<li><a href="javascript:changepage('/kpxt/item/break')" >被驳回600分评级 <b>(<font color="red" style="font-size: 20px">${fn:length(khlb)}</font>)</b>
	            	</a></li> 
	                <li><a href="javascript:changepage('/kpxt/item/via')" >通过的600分评级</a></li>
	            </ul>
	        </div>
        </shiro:hasAnyRoles>
      </div>
</div>
<script type="text/javascript" src="/zui/bs2/js/bootstrap.js"></script>