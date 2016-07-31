<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta charset="utf-8" />
    <title>单点登录....</title>
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />    
    <script src="/scripts/jquery.min.js"></script>

    <link href="/styles/logincss/bootstrap.min.css" rel="stylesheet" />
      <!--[if lte IE 6]>
  <link rel="stylesheet" type="text/css" href="/styles/css/bootstrap-ie6.css">
  <![endif]-->

    
    <link href="/styles/logincss/bootstrap-responsive.min.css" rel="stylesheet" />
    
   
    <link href="/styles/logincss/font-awesome.css" rel="stylesheet" />
    
    <link href="/styles/logincss/adminia.css" rel="stylesheet" /> 
    <link href="/styles/logincss/adminia-responsive.css" rel="stylesheet" /> 
    
    <link href="/styles/logincss/pages/login.css" rel="stylesheet" /> 


	
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <script>
  <!--
  document.onkeydown=function(event){
      var e = event || window.event || arguments.callee.caller.arguments[0];
      if(e && e.keyCode==27){ // 按 Esc 
          //要做的事情
        }
      if(e && e.keyCode==113){ // 按 F2 
           //要做的事情
         }            
       if(e && e.keyCode==13){ // enter 键
    	   showlogin();
      }
  }; 
  -->
  </script>
  </head>

<body>


<div class="navbar navbar-fixed-top" id="myhead">
	
	<div class="navbar-inner">
		
		<div class="container">
			
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 
				<span class="icon-bar"></span> 				
			</a>

			<a class="brand" href="#">嘉定区村居社会管理信息系统</a>
			
			<div class="nav-collapse">
			
				<ul class="nav pull-right">
					
					<li class="">
						
				<!-- 		<a href="javascript:;"><i class="icon-chevron-left"></i> Back to Homepage</a> -->
					</li>
				</ul>
				
			</div> <!-- /nav-collapse -->
			
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->


<div id="login-container" >
	
	
	<div id="login-header"  style="margin-top: 60px!important;">
		
		<h3>正在单点登录</h3><!--
		 <a href="/login/${userName}/${pass}/1786">1111</a>1111
	--></div> <!-- /login-header -->
	<form action="/login" id="form1" method="post"  style="display: none">

							<input type="hidden" class=""  placeholder="请输入登陆账号"  name="username" value="${userName}" id="usernames" />
			
							<input type="hidden" class="" placeholder="请输入登陆密码" name="password" value="${pass}" id="password" />
<input type="hidden" onkeydown='if(event.keyCode==13){showlogin();}' style="width:100px" placeholder="请输入验证码"  class="" value="1786" name="checkCode" id="checkCode" />
					<button type="button" onclick="showlogin()"  class="btn btn-warning btn-large">
						登录
					</button>
					<a href="#myModal" id="showload" style="display: none" role="button" class="btn" data-toggle="modal">Launch demo modal</a>
		
		</form>
		
	


	<script type="text/javascript">

		function changeImage() {
			var img = document.getElementById("imgCheckCode");
			img.src = "/CheckCode?" + Math.random();
		}
		
		$(function(){
		showlogin();
			var message =  '${message}';
			if(message){
	            $('#b_show_message').html(message);
			}
			
		});

		function showlogin(){

		$("#form1").submit();
		$.jBox.tip('正在努力为您登陆中....', 'loading');
		
		 return true;
		}
	</script>

  <script type="text/javascript" src="/styles/js/bootstrap.js"></script>
  <link id="skin" rel="stylesheet" href="/scripts/jBox/Skins/Default/jbox.css?a=1" />
  <script type="text/javascript" src="/scripts/jBox/jquery.jBox-2.3.min.js"></script>
  <script type="text/javascript" src="/scripts/jBox/i18n/jquery.jBox-zh-CN.js"></script>
<script  type="text/javascript">
if (top.location !== self.location) {
		top.location.href = location.href;
	
	}	
</script>

  </body>
</html>