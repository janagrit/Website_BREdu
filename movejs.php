<!--move-->
	<div class="translate_wrappermoveblk" style="position: absolute;left:120px;top:300px;z-index:998;
		" ><img src="assets/lang/img/move.png"height="45" width="45" / ></div>
	<script>
function move(){
		var _move=false;//移动标记  
		var _x,_y;//鼠标离控件左上角的相对位置  
		$(".translate_wrappermoveblk").click(function(){  
			//alert("click");//点击（松开后触发）  
			}).on('touchstart',function(e){  
			var id = e.originalEvent.targetTouches[0];
			_move=true;  
			_x=id.pageX-parseInt($(".translate_wrappermoveblk").css("left"));  
			_y=id.pageY-parseInt($(".translate_wrappermoveblk").css("top"));  
			$(".translate_wrappermoveblk").fadeTo(20, 0.5);//点击后开始拖动并透明显示  
		});  
		$(document).on("touchmove",function(e){  
			if(_move){  
				var id = e.originalEvent.targetTouches[0];
				var x=id.pageX-_x-110;//移动时根据鼠标位置计算控件左上角的绝对位置  
				var y=id.pageY-_y;  
				var x2=id.pageX-_x;//移动时根据鼠标位置计算控件左上角的绝对位置  
				$(".translate_wrapper").css({top:y,left:x});//控件新位置 
				$(".translate_wrappermoveblk").css({top:y,left:x2});//控件新位置 
			}  
		}).on("touchend",function(){  
		_move=false;  
   	 	$(".translate_wrappermoveblk").fadeTo("fast", 1);//松开鼠标后停止移动并恢复成不透明  "fast":规定褪色效果的速度。
  		});  
	}
 
	move();
	</script>
	