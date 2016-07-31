var searchResults;
$('#b_search_result').on('click', 'a', function(){
	var index = $(this).parent().index(),
	item = searchResults[index];
$('#xm').val(item.xm);
	//alert(item.xbhz)
	$('input[name=xb][type=radio][value='+(item.xbhz)+']').attr('checked', true);
	$('#whcd').val(item.whcdhz);
	$('#zw').val(item.zy);
	//$('#zzmm').val(item.zzmm);
	$('#jtzz').val(item.jzdz);
	//$('#dw').val(item.dw);
	//$('#dh').val(item.tel);
});
$('#b_search').on('blur', function(){
	var val = this.value;
	val=encodeURI(val);
	if($.trim(val) != ''){
		$('#b_search_result').html('正在搜索中...');
		$.ajax({
            url: '/person/search',
            type: 'GET',
            data: 'searchName=' + val,
            dataType: 'json',
            success: function(data){
            	searchResults = data;
            	if(data.length == 0){
        			$('#b_search_result').html('搜索结果：无');
        			return;
            	}
            	var html = '<ul>';
            	$.each(data, function(index, item){
            		html += '<li>'+item.xm + " &nbsp; &nbsp;("+item.zjhm+")" + ' <a href="javascript:void(0);" style="color: blue;">&nbsp;&nbsp;选择</a></li>';
            	});
            	html += '</ul>'
        		$('#b_search_result').html(html);
            }
        });
	}
});