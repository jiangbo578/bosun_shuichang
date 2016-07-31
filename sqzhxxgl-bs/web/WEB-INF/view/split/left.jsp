<%@ page language="java" pageEncoding="UTF-8" %>
<div class="leftNav fl">
<div class="menu fl" id="menu">
        <shiro:hasAnyRoles name="lxd">
        <strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">联系单操作</a></strong>
			 <div class="menu-c">
				<ul>
					<!-- <li><a href="javascript:changepage('/business/null')">业务管理</a></li>  -->
					<li><a href="javascript:changepage('/linkman/get/${sessionScope.userOrgan.id }/1')"  >待转发</a></li>
					<li><a  href="javascript:changepage('/linkman/wait')" >待回执</a></li>
					<li><a href="javascript:changepage('/linkman/ready')" >已处理联系单</a></li>
				</ul>
			</div>
		</shiro:hasAnyRoles> 
		
        <shiro:hasAnyRoles name="zznbm">
        	<strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">联系单操作</a></strong>
			 <div class="menu-c">
				<ul>
					<li><a href="javascript:changepage('/split/show')">未回复</a></li>
					<li><a  href="javascript:changepage('/split/townready')" >已回复</a></li>
				</ul>
			</div>
		</shiro:hasAnyRoles> 
		
		<shiro:hasAnyRoles name="qznbm">
       		 <strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">联系单操作</a></strong>
			 <div class="menu-c">
				<ul>
					<li><a href="javascript:changepage('/split/show')">待我回复</a></li>
					<li><a  href="javascript:changepage('/split/area/ready')" >已回复</a></li>
				</ul>
			</div>
		</shiro:hasAnyRoles> 
		
       <shiro:hasAnyRoles name="ganshi">
        <strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">联系单</a></strong>
	        <div class="menu-c">
	            <ul>
	            <!-- <li><a href="javascript:changepage('/split/getSplit/${sessionScope.userOrgan.id }/1')" >联系单列表</a></li>  -->	
	                <li><a href="javascript:changepage('/split/officer/add')" >添加联系单</a></li>
	                <li><a href="javascript:changepage('/split/ready')" >已处理</a></li>
	                <li><a href="javascript:changepage('/split/show')" >未处理</a></li>
	            </ul>
	        </div>
        </shiro:hasAnyRoles>
      </div>
</div>
<shiro:hasAnyRoles name="ganshi,shuji">
<script type="text/javascript">
	$(function()
	{
		$(".nav:first > dl >dd >a").click(function()
		{
			
		})
	});

</script>
</shiro:hasAnyRoles>