<%@ page language="java" pageEncoding="UTF-8"%>


<script src="/scripts/jquery.min.js"></script>
<script type="text/javascript" src="/zui/bs2/js/bootstrap.js"></script>
<!--[if lte IE 6]>
  <script type="text/javascript" src="/zui/bs2/js/bootstrap-ie.js"></script>
  <![endif]-->
<script src="/scripts/dialog.js"></script>
<script src="/scripts/pagination.js"></script>
<script src="/scripts/jquery.validator.min.js"></script>
<script src="/scripts/zh_CN.js"></script>
<script src="/scripts/base.js"></script>
<script type="text/javascript">
parent.changeheight(document.body.offsetHeight);
    //修改补丁
    var url=window.location.pathname;
   // alert(url);
	var finalllist =$(".btn");
		for(var i=0;i<finalllist.length;i++){
			if($(finalllist[i]).text()=="名单"){
			$(finalllist[i]).html("<i class='icon-folder-open'></i>查看与编辑 ");
			}else if($(finalllist[i]).text()=="修改"&&url.indexOf('list')!=-1){
				$(finalllist[i]).html("<i class='icon-pencil'></i>修改标题 ");
		}
		}
</script>