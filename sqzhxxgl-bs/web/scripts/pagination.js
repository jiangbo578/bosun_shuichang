
//分页
buguPagination = function(current, pages, count, url, param){
	this.current = parseInt(current);
	this.count = parseInt(count);
	this.pages = parseInt(pages);
	this.url = url;
	this.param = param || '';
	this.showNum = 9;
	this.half = Math.floor(this.showNum/2);
	
	this.firstPage = function(){
		return '<li><a href="' + this.url + '/1' + this.param + '">&laquo;</a></li>';
	};
	this.lastPage = function(){
		return '<li><a href="' + this.url + this.pages + this.param + '">&raquo;</a></li>';
	};
	this.currentPage = function(){
		return '<li class="active"><a href="' + this.url + this.current + this.param + '">' + this.current + '</a></li>';
	};
	this.otherPage = function(start, end){
		var page = '';
		for ( var i = start; i <= end; i++) {
			page += '<li' + (i == this.current ? ' class="active"':'') + '><a href="' + this.url + i + this.param + '">' + i + '</a></li>';
		}
		return page;
	};
	this.show = function(){
		var page = '<li><span>共' + this.count + '条，' + this.pages + '页</span></li>';
		if(this.pages <= this.showNum){
			page += this.otherPage(1, this.pages);
		}else{
			if(this.current <= this.half){
				page += this.otherPage(1, this.showNum);
				page += this.lastPage();
			}else if(this.current > this.pages - this.half){
				page += this.firstPage();
				page += this.otherPage(pages - this.showNum + 1, pages);
			}else{
				page += this.firstPage();
				page += this.otherPage(this.current - this.half, this.current - 1);
				page += this.currentPage();
				page += this.otherPage(this.current + 1, this.current + this.half);
				page += this.lastPage();
			}
		}
		return page;
	};
};