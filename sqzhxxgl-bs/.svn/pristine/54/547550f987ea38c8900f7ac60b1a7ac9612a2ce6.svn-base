//menu
$(function(){
	

	function unfoldMenu(pn, cn){
		var p = $('strong.menu-p'), c = $('div.menu-c'), cc = $('div.menu-c-current');
		if(c.index(cn) != c.index(cc)){
			p.removeClass('menu-p-current');
			cc.hide(0, function(){
				$(this).removeAttr('style').removeClass('menu-c-current');
			})
			pn.addClass('menu-p-current');
			cn.show(0, function(){
				$(this).removeAttr('style').addClass('menu-c-current');
			});
		}else{
		
			pn.removeClass('menu-c-current');
			cn.removeClass('menu-c-current');
			cc.hide(0, function(){
				
				$(this).removeAttr('style').removeClass('menu-c-current');
			})
			pn.addClass('menu-p-current');
			cn.hide(0, function(){
				//$(this).removeAttr('style').addClass('menu-c-current');
			});
		}
	}
	function menuHandle(){
		$('strong.menu-p').click(function(){
			var pn = $(this), cn = pn.next();
			unfoldMenu(pn, cn);
		});
	}
	
	//设置默认下当前展开
	function menuCurrent(){
		var idx = $('input.menu-code-index').val(), m, pn, cn, p = $('strong.menu-p'), c = $('div.menu-c'), cc = $('div.menu-c-current');
		if(/c(\d)+/.test(idx)){ //判断c（十进制）条件
			m = $('a[data-service-index="' + idx + '"]').addClass('current');
			cn = m.parents('div.menu-c');
			pn = cn.prev();
			unfoldMenu(pn, cn);
		}
	}
	menuCurrent();
	menuHandle();
   $('#menu div:first').show();
	$("#mainclick").click();


  // $('#menu div:last').show();

});
//form
$(function(){ 
	var curLi; 
	$(".form li").mouseover(function(){ 
	curLi=$(this); 
	}); 
		$(".form li").mouseover(function(){//鼠标点击也可以切换 
		$(".formShow").removeClass("formShow"); 
		$(".formHide").eq($(".form li").index(curLi)).addClass("formShow"); 
		$(".onForm").removeClass("onForm"); 
		curLi.addClass("onForm"); 
		}); 
});
//check
$(function(){ 
 $("#check >input").click(function(){
   if($(this).attr("checked")){
	   $(this).attr("checked",'true'); 
	   $(".save").text("保存并提交");
	 }else{
	   $(this).removeAttr("checked");
	   $(".save").text("仅保存");
	}
 })
});