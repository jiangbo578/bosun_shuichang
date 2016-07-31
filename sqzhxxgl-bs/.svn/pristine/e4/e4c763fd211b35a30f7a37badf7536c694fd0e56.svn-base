<%@ page language="java" pageEncoding="UTF-8" %>
<div class="leftNav fl">
       <div class="menu fl" id="menu">
       
        <shiro:hasAnyRoles name="admin">
        <strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">管理员操作</a></strong>
			 <div class="menu-c">
			<ul>
				<li><a href="javascript:changepage('/business/null')">业务管理</a></li>
				<li><a  href="javascript:changepage('/user/')" >用户管理</a></li>
				<li><a href="javascript:changepage('/role/')"  >角色管理</a></li>
				<li><a href="javascript:changepage('/authority/null')" >权限管理</a></li>
				<li><a  href="javascript:changepage('/organization/list/')" >组织机构</a></li> 
				<li><a href="javascript:changepage('/news/list/1')"  >新闻发布</a></li> 
				<li><a href="javascript:changepage('/mould/list/1')"  >模板导出</a></li>
				<li><a href="javascript:changepage('/demo/list/1')"  >台账样张</a></li>  
			</ul>
			
			</div>
			  <strong class="menu-p"><i class="menu-i"></i><a href="javascript:;">考评系统</a> </strong>
         <div class="menu-c">
            <ul>             
                	<li><a  href="javascript:changepage('/assess/list/')" >考评管理</a></li> 
                	<li><a  href="javascript:changepage('/assess/remind/list/')" >提醒管理</a></li>              
            </ul>
        </div>
          <strong class="menu-p"><i class="menu-i"></i><a href="javascript:;">登录信息管理</a> </strong>
         <div class="menu-c">
            <ul>
                	<li><a  href="javascript:changepage('/log/list/')" >用户登录记录</a></li> 
            </ul>
        </div>
		
		</shiro:hasAnyRoles> 
		<!-- ~~~~~~~~街镇~~~~~~~~~~~~ -->
		 <shiro:hasAnyRoles name="zznbm,lxd,qgaj,qznbm,nongwei,shejianban">
		        <strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">信息查询</a></strong>
					 <div class="menu-c">										
						<li><a href="javascript:changepage('/quzhen/taizhangquery')">台帐查询</a></li>						
						<li><a href="javascript:changepage('/quzhen/select/1')">导出台账</a></li>
					</div>
					  <strong class="menu-p menu-p-current"><i class="menu-i"></i><a href="javascript:;">统计汇总</a></strong>
					 <div class="menu-c">						
						 <ul>	
						    <li><a href="javascript:changepage('/quzhen/findline')">无证照总户数</a></li>	
						     <li><a href="javascript:changepage('/quzhen/ffxy')">非法行医总数</a></li>										
							<li><a href="javascript:changepage('/quzhen/wfjz')">违法建筑面积</a></li>							
							<li><a href="javascript:changepage('/quzhen/qz')">群租、居改非</a></li>
							<li><a href="javascript:changepage('/quzhen/tjwp')">田间、经济林窝棚面积</a></li>											
							<li><a href="javascript:changepage('/quzhen/cjhj')">不规范生猪养殖总户数</a></li>													
							<li><a href="javascript:changepage('/quzhen/srhw')">市容环卫</a></li>	
							</ul>					
					</div>
		</shiro:hasAnyRoles> 
		
       <shiro:hasAnyRoles name="ganshi,shuji">
        <strong class="menu-p menu-p-current" id="mainclick"><i class="menu-i"></i><a href="javascript:;">我的台账</a></strong>
        <div class="menu-c">
            <ul>
                <li><a href="javascript:changepage('/taizhang/list/1/${userRoleCode}')" type="1">基础信息</a></li>
                <li><a href="javascript:changepage('/taizhang/list/2/${userRoleCode}')" type="2">社会管理</a></li>
                <li><a href="javascript:changepage('/taizhang/list/3/${userRoleCode}')" type="3">公共服务</a></li>
                <li><a href="javascript:changepage('/taizhang/list/4/${userRoleCode}')" type="4">党群工作</a></li>
                <li><a href="javascript:changepage('/taizhang/list/5/${userRoleCode}')" type="5">会议活动</a></li>
            </ul>
        </div>
        <strong class="menu-p"><i class="menu-i"></i><a href="javascript:;">统计汇总</a> </strong>
         <div class="menu-c">
            <ul>
                <li><a href="javascript:changepage('/summary')">实有人口数</a></li>
                   <li><a href="javascript:changepage('/quzhen/findline')">无证照总户数</a></li>	
                   <li><a href="javascript:changepage('/quzhen/ffxy')">非法行医总数</a></li>	
                    <li><a href="javascript:changepage('/quzhen/ffbx')">非法办学总数</a></li>										
				   <li><a href="javascript:changepage('/quzhen/wfjz')">违法建筑面积</a></li>							
				   <li><a href="javascript:changepage('/quzhen/qz')">群租、居改非</a></li>
				   <li><a href="javascript:changepage('/quzhen/tjwp')">田间、经济林窝棚面积</a></li>											
				   <li><a href="javascript:changepage('/quzhen/cjhj')">不规范生猪养殖总户数</a></li>													
				   <li><a href="javascript:changepage('/quzhen/srhw')">市容环卫</a></li>	
                
                
            </ul>
        </div>
        <strong class="menu-p"><i class="menu-i"></i><a href="javascript:;">最新通知</a> </strong>

        <div class="menu-c">
            <ul>
               
                <li><a href="javascript:changepage('/news/listpage/1')">新闻通告</a></li>
               
            </ul>
        </div>
        <strong class="menu-p"><i class="menu-i"></i><a href="javascript:;">信息查询</a></strong>
        <div class="menu-c">
            <ul>
                <li><a href="javascript:changepage('/puser/pass')">修改密码</a></li>
                <li><a href="javascript:changepage('/bslist')">表单检索</a></li>
                <li><a href="javascript:changepage('/person/find')">人口信息</a></li>
                <li><a href="javascript:changepage('/demo/list/1')"  >台账样张</a></li>  
                <li><a href="javascript:changepage('/Version.jsp')">历史版本</a></li>
                
            </ul>
        </div>
        <strong class="menu-p"><i class="menu-i"></i><a href="javascript:;">台账导出</a></strong>
        <div class="menu-c">
            <ul>
                <li><a href="javascript:changepage('/json.jsp')">按类别导出</a></li>
                <li><a href="javascript:changepage('/mould/select/1')">按模板导出</a></li>
            </ul>
        </div>
        
        </shiro:hasAnyRoles>
      </div>
     </div>
<shiro:hasAnyRoles name="ganshi,shuji">
<script type="text/javascript">
	$(function(){
		$(".menu-c:first > ul >li >a").click(function(){
			//点击台账出现2级子类表单
		
			var index = $(this).attr("type");
			if(index==null){return null;}
			$.ajax({
				type:'post',
				url:'/taizhang/list/'+index+'/'+'${userRoleCode}',
				success:function(html){
				
			//document.getElementById("win").src='/taizhang/list/'+index+'/'+'${userRoleCode}';
				
				
				
				
				}
				
			});
		});
		
			$(".nav:first > dl >dd >a").click(function(){
					var index = $(this).attr("type");
					document.getElementById("win").src='/taizhang/list/'+index+'/'+'${userRoleCode}' ;
			})
	});

</script>
</shiro:hasAnyRoles>