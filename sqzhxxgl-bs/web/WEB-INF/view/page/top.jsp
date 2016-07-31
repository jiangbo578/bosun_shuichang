<%@ page language="java" pageEncoding="UTF-8" %>
<div class="head">
<input type="hidden" id="lxd" value="${sessionScope.lxd }" >
<script type="text/javascript">
	function lxd()
	{
		var code = document.getElementById("lxd").value;
		if("ganshi"==code||"lxd"==code||"zznbm"==code||"qznbm"==code)
		{
			location.href = "/split/main";
		}
		else
		{
			alert("您无权限访问此功能！");
		}
	}
</script>
  <ul>
  
   <h1 class="fl">嘉定区村居社会管理信息系统</h1>
   <dl class="fr">
        <dd><a href="javascript:changepage('/centent')" ><i class="icon-home"></i>首页</a>  |  </dd>
     <dd><a href="/taizhang/dztz" >电子台帐</a>  |  </dd>
     <dd><a href="/kpxt/main">600分评级</a>  |  </dd>
     <dd><a href="../split/main" >联系单</a>  |  </dd>
     <dd><a href="javascript:changepage('/news/xcxt')">宣传系统</a>  |  </dd>

     <dd><a href="/logout">退出</a>| </dd>

        </dl>
  </ul>    
</div>

<!--head end of-->
<div class="headContent">
  <ul>
    <h2 class="logo fl"><a href="/index"></a></h2>
    <div class="nameList fl">
      <dl>
        <dd>用户名：${sessionScope.userRealName }</dd>
        <dd>单   位：${sessionScope.userOrgan.parent.name} -> ${sessionScope.userOrgan.name}</dd>
        <dd>角   色：${sessionScope.userRole}</dd>
      </dl>
    </div>
    <div class="nav fr">
       <dl>
         <dd style="padding-right: 100px"><a href="/taizhang/dztz" ><img src="/styles/images/dztz.png"></img></a></dd>
         <dd style="padding-right: 100px"><a href="/kpxt/main" ><img src="<c:url value="/styles/images/cjpj.png" />"></img></a></dd>
         <dd style="padding-right: 100px"><a href="../split/main" ><img src="<c:url value="/styles/images/lxd.png" />" ></img></a></dd>
         <dd ><a href="javascript:changepage('/news/xcxt')" ><img src="<c:url value="/styles/images/cxpt.png" />"></img></a></dd>
       </dl>
    </div>
  </ul>
</div>