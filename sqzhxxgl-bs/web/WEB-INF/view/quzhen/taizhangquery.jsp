<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE>台账查询</TITLE>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<!-- 	<link rel="stylesheet" href="../../../css/demo.css" type="text/css"> -->
	<link rel="stylesheet" href="/zui/zTree/css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="/scripts/jquery.min.js"></script>
	<script type="text/javascript" src="/zui/zTree/js/jquery.ztree.core-3.5.js"></script>
	<script type="text/javascript" src="/zui/zTree/js/jquery.ztree.excheck-3.5.js"></script>
    <link rel="stylesheet" type="text/css" href="/zui/bs2/css/bootstrap.css">
    <script type="text/javascript" src="/zui/datepicker/WdatePicker.js"></script>
  <script type="text/javascript" charset="utf-8" src="./scripts/jquery.min.js"></script>

 <link id="skin" rel="stylesheet" href="../../../zui/jBox/Skins/Default/jbox.css" />
    <script type="text/javascript" src="../../../zui/jBox/jquery.jBox-2.3.min.js"></script>
    <script type="text/javascript" src="../../../zui/jBox/i18n/jquery.jBox-zh-CN.js"></script>
	<SCRIPT type="text/javascript">
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
				onClick: onClick
			}
		};
		var setting2 = {
				
				check: {
					enable: false
				},
				data: {
					simpleData: {
						enable: true
					}
				},
				callback: {
					onClick: onClick2
				}
			};
		//台帐表单
		function onClick(e, treeId, treeNode) {
			//这里获取ID  
			
			if(treeNode.level==3){
			//获取表单code
				$("#taizhangForm").text(treeNode.name);
				$("#formId").val(treeNode.code);
			}
			var text = $("#cunjuId").val();
			if(null == text || "" == text){
				  window.setTimeout(function () { parent.$.jBox.tip('请选择一个镇或村居', 'success'); }, 1000);
			}else{
				if(treeNode.level==3){
					ajaxForm();
				}
				
				}
			
		}
		//街镇村居
		function onClick2(e, treeId, treeNode) {
			//这里获取ID  
			if(treeNode.level==1){//选择街镇
				//alert(treeNode.id);
				$("#cunju").text(treeNode.name);
				$("#cunjuId").val(treeNode.id);
				$("#type").val(1);
			}
			if(treeNode.level==2){//选择村居
				//alert(treeNode.id);
				$("#cunju").text(treeNode.pName+"->"+treeNode.name);
				$("#cunjuId").val(treeNode.id);
				$("#type").val(2);
			}
			var text = $("#formId").val();
			if(null == text || "" == text){
				  window.setTimeout(function () { parent.$.jBox.tip('请选择一个台帐表单', 'success'); }, 1000);
			}else{
				ajaxForm();
			}
		}

		//根据台帐表单ID和街镇村居ID查询台帐表单填报情况
		function ajaxForm(){
			
			 var formId=$("#formId").val();
			 //alert(formId);
			$.ajax({//请求后台查询数据
				type:"POST",
				url:"/quzhen/taizhang/list",
				data:{"zzId":$("#cunjuId").val(),"formCode":formId,"type":$("#type").val()},
				global:false,
				async:false,
				success:function(data,status){
					//console.log(status);
					//console.log(strResult);
					if("success" == status)
						{
							$("#formItemDiv").html("");
							var html = "<table class='table table-striped table-bordered table-hover'><tr><th>居委会名称</th><th>标题</th><th>审核状态</th><th>填表时间</th></tr>";
							if(null != data && data.length>0)
								{//var box = $.jBox.tip('正在努力为您查询....', 'loading');
									for(var i=0;i<data.length;i++)
									{
										html = html+"<tr><td>"+data[i].user.organization.parent.name+"->"+data[i].user.organization.name+"</td>";
										html = html+"<td> <a  onclick=\"show('"+data[i].processInstanceId+"','"+data[i].id+"')\" >"+data[i].name+"</a></td>";
										html = html+"<td>"+data[i].formatRemark+"</td>";
										html = html+"<td>"+data[i].insertTime+"</td>"            
									}
									html = html + "</tr></table>";
								}else
								{
									html = html + "<tr>没有显示记录</tr></table>";
								}
							//$.jBox.close(box);
							$("#formItemDiv").html(html);
						}else{
							 window.setTimeout(function () { parent.$.jBox.tip('系统错误', 'error'); }, 2000);
							}
				}
			});
			}
		$(document).ready(function() {
			var zNodes = [];
			$.ajax({
				type:"GET",
				url:"/quzhen/taizhang",
				dataType:"json",
				global:false,
				async:false,
				success:function(strResult){
				
					zNodes =eval(strResult);
				}
			});
			$.fn.zTree.init($("#treeDemo"), setting,zNodes);
		});
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
			$.fn.zTree.init($("#treeDemo2"), setting2,zNodes);
		});
		//-->
		function show(code,id){
			//alert(11)
			// href='/"+data[i].processInstanceId+"/item/"+data[i].id+"'
	parent.$.jBox("iframe:/"+code+"/item/"+id+"", {
    title: "用户管理",
    width: 1000,
    height: 500,
    buttons: { '关闭': true }
});
	}
		
	</SCRIPT>
</HEAD>

<BODY style="margin-top: 10px;margin-left: 10px">

 <ul class="breadcrumb" style="margin-bottom: 5px;">
 <li><a href="/centent"><i class="icon-home"></i>首页</a> <span class="divider">/</span></li>

    <li class="active">台账查询</li><!--
    <li /tsjbzx/list/1 class="active">投诉举报咨询台账目录</li>-->
  </ul>
 <div  id="mianpan">
<!--  class="zTreeDemoBackground left"
class="zTreeDemoBackground right" -->
<div  style="overflow:scroll;width:30%; height:600px;float: left;" >
		<ul id="treeDemo" class="ztree" ></ul>
		<ul id="treeDemo2" class="ztree"></ul>
	</div>
	
		
		<div  style="float: left;margin-left: 1%;width:68%">
			<div id="" class="alert alert-danger"><i class="icon-list"></i>
			镇或村居：<strong id="cunju"></strong>
			台帐表单：<strong id="taizhangForm"></strong>
			<input type="hidden" id="cunjuId"/>
			<input type="hidden" id="formId"/>
			<input type="hidden" id="type"/>
			</div>
		 	<div id="formItemDiv" class="well"></div>
		<br>
	</div>
	
	 </div>
	  <link id="skin" rel="stylesheet" href="/scripts/jBox/Skins/Default/jbox.css?a=1" />
  <script type="text/javascript" src="/scripts/jBox/jquery.jBox-2.3.min.js"></script>
  <script type="text/javascript" src="/scripts/jBox/i18n/jquery.jBox-zh-CN.js"></script>
	<script type="text/javascript" src="/zui/bs2/js/bootstrap.js"></script>
<!--[if lte IE 6]>
  <script type="text/javascript" src="/zui/bs2/js/bootstrap-ie.js"></script>
  <![endif]-->
  
</BODY>
</HTML>