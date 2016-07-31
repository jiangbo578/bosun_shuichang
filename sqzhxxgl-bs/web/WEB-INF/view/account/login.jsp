<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta charset="utf-8" />
    <title>嘉定区村居社会管理信息系统</title>
    
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
		
		<h3>用户登陆</h3>
		
	</div> <!-- /login-header -->
	<form action="/login" id="form1" method="post" onsubmit="return showlogin();"  >
	<div id="login-content" class="clearfix">
	
	
				<fieldset>
					<div class="control-group">
						<label class="control-label" for="username">登陆账号</label>
						<div class="controls">
							<input type="text" class="" placeholder="请输入登陆账号"  name="username" id="username" />
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="password">登陆密码:</label>
						<div class="controls">
							<input type="password" class="" placeholder="请输入登陆密码" name="password" id="password" />
						</div>
					</div>
					
						<div class="control-group">
						
						<div class="controls">
							验证码:<input type="text" onkeydown='if(event.keyCode==13){showlogin();}' style="width:100px" placeholder="请输入验证码"  class="" name="checkCode" id="checkCode" /><a href="JavaScript:changeImage();" title="点击换一张"><img width="80" height="30" src="/CheckCode" id="imgCheckCode" /> </a>

						</div>
					</div>
				</fieldset>
				
			
				
				<div class="pull-right">
				<p class="text-danger" id="b_show_message">&nbsp;</p>
					<button type="submit"  class="btn btn-warning btn-large">
						登录
					</button>
					<a href="#myModal" id="showload" style="display: none" role="button" class="btn" data-toggle="modal">Launch demo modal</a>
				</div>
			
			
		</div> <!-- /login-content -->
		</form>
		
		<div id="login-extra">
			
			<p>技术支持: <a href="javascript:;" >上海博勋信息科技有限公司</a></p>
			
<!-- 			<p>Remind Password? <a href="forgot_password.html">Retrieve.</a></p> -->
			
		</div> <!-- /login-extra -->
	
</div> <!-- /login-wrapper -->

    	<div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    <h3 id="myModalLabel">正在努力为您登录中</h3>
  </div>
  <div class="modal-body"  >
<p>请稍后，正在登陆验证权限.......</p>    <!-- <img alt="" height="140px" src="/images/loading.gif"> -->
  </div>
<!--   <div class="modal-footer">
    <button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
    <button class="btn btn-primary">Save changes</button>
  </div> -->
</div>

<!-- Placed at the end of the document so the pages load faster -->


	<script type="text/javascript">

		function changeImage() {
			var img = document.getElementById("imgCheckCode");
			img.src = "/CheckCode?" + Math.random();
		}
		
		$(function(){
			var message =  '${message}';
			if(message){
	            $('#b_show_message').html(message);
			}
			
		});

		function showlogin(){
	
	//	$("#form1").submit();	
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