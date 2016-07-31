
//确认弹出层
buguDialog = {
	_createDom: function(title, content){
		return '<div class="dialog-mask" style="filter:alpha(Opacity=80);-moz-opacity:0.5;opacity: 0.5;z-index:100; background-color:#ffffff;" id="b_dialog_mask"></div>'+
				'<div class="dialog" id="b_dialog"  style="MARGIN-RIGHT: auto; MARGIN-LEFT: auto;margin-bottom: 370px;">'+
					'<h3 class="dialog-title">' + title + '</h3>'+
					'<div class="dialog-box">'+
						'<p class="dialog-content">' + content + '</p>'+
						'<p class="dialog-button">'+
							'<button type="button" class="btn btn-default">取消</button>'+
							'<button type="button" class="btn btn-primary">确定</button>'+
						'</p>'+
					'</div>'+
				'</div>';
	},
	_setOffset: function(){
		var $document = $(document);
		this.$dialog.offset({top: ($document.height() - this.$dialog.height())/2, left: ($document.width() - this.$dialog.width())/2});
	},
	_bind: function(){
		//取消
		this.$dialog.find('button:eq(0)').on('click', $.proxy(function(e) {
			if (this.remove) {
				this.$dialogMask.remove();
				this.$dialog.remove();
			}else{
				this.$dialogMask.hide();
				this.$dialog.hide();
			}
		},this));
		
		//确定
		this.$dialog.find('button:eq(1)').on('click', $.proxy(function(e) {
			window.location.href = this.href;
			if (this.remove) {
				this.$dialogMask.remove();
				this.$dialog.remove();
			}else{
				this.$dialogMask.hide();
				this.$dialog.hide();
			}
		},this));
	},
	init: function(title, content, remove){
		
		
		this.$dialog = $('#b_dialog');
		if (this.$dialog.size() == 0) {
			$('body').append(this._createDom(title, content));
			this.$dialog = $('#b_dialog');
		}
		this.$dialogMask = $('#b_dialog_mask');
		this.remove = remove;
		
		this._setOffset();
		this._bind();
		return this;
	},
	show: function(){
		this.$dialogMask.show();
		this.$dialog.show();
	},
	hide: function(){
		this.$dialogMask.hide();
		this.$dialog.hide();
	},
	setHref: function(href){
		this.href = href;
	}
};