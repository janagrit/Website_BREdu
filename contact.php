
<!doctype html>
<html lang="en">
<?php
include './head.php';
?>
	  <!--引用百度地图API-->

<script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.1&services=true"></script>

	
  <body>
<?php
include './headbody.php';
?>
<section class="w3l-contact-breadcrum">
  <div class="breadcrum-bg py-sm-5 py-4">
    <div class="container py-lg-3">
      <h2>Contact Us</h2>
      <p><a href="index.php">Home</a> &nbsp; / &nbsp; Contact</p>
    </div>
  </div>
</section>
<!-- contact -->
<section class="w3l-contacts-12" id="contact">
    <div class="contact-top pt-5">
        <div class="container py-md-3">
            
            <div class="row cont-main-top">
               
                <!-- contact address -->
                <div class="contact col-lg-4">
                    <div class="cont-subs">
                        <div class="cont-add">
                            
                           <div class="cont-add-rgt">
                            <h4>Address:</h4>
                            <p class="contact-text-sub Contactus2">shanghai, china</p>
                        </div>
                        <div class="cont-add-lft">
                            <span class="fa fa-map-marker" aria-hidden="true"></span>
                       </div>
                    </div>
                        <div class="cont-add add-2">
                            
                           <div class="cont-add-rgt">
                            <h4>Email:</h4>
                            <a href="mailto:info@beltroadeducation.com">
                                <p class="contact-text-sub">info@beltroadeducation.com</p>
                            </a>
                        </div>
                        <div class="cont-add-lft">
                            <span class="fa fa-envelope" aria-hidden="true"></span>
                       </div>
                    </div>
                        <div class="cont-add">
                           
                            <div class="cont-add-rgt">
                                 <h4>Phone:</h4>
                                 <a href="tel:+08618721526152">
                                    <p class="contact-text-sub">+86 1872-152-6-152</p>
                                 </a>
								 <a href="tel:+12028674582">
                                    <p class="contact-text-sub">+1 202-867-4582</p>
                                 </a>
                            </div>
                            <div class="cont-add-lft">
                                <span class="fa fa-phone" aria-hidden="true"></span>
                           </div>
                        </div>
                        <div class="cont-add add-3">
                           
                            <div class="cont-add-rgt">
                                 <h4>Find Us On</h4>
                                 <div class="main-social-1 mt-2">
                                    <a href="#facebook" class="facebook"><span class="fa fa-facebook"></span></a>
                                    <a href="#twitter" class="twitter"><span class="fa fa-twitter"></span></a>
                                    <a href="#instagram" class="instagram"><span class="fa fa-instagram"></span></a>
                                    <a href="#google-plus" class="google-plus"><span class="fa fa-google-plus"></span></a>
                                    <a href="#linkedin" class="linkedin"><span class="fa fa-linkedin"></span></a>
                                </div>
                            </div>
                            <div class="cont-add-lft">
                               
                           </div>
                        </div>
                    </div>
                </div>
                <!-- //contact address -->
                 <!-- contact form -->
                 <div class="contacts12-main col-lg-8 mt-lg-0 mt-5">
     
                    <?php
if (isset($_REQUEST['email'])) { // 如果接收到邮箱参数则发送邮件
    // 发送邮件
    $email = $_REQUEST['email'] ;
    $subject = $_REQUEST['subject'] ;
    $message =$_REQUEST['PhoneNo'] . $_REQUEST['message'] ;
    mail("429640316@qq.com", $subject,
    $message, "From:" . $email);
	echo  "<script>alert('邮件发送成功');location.href='contact.php';</script>";
} else { // 如果没有邮箱参数则显示表单
    echo "
	<form method='post' action='contact.php' class='main-input'>
	<div class='top-inputs d-grid'>
	 <input type='text' placeholder='Name' name='subject' id='w3lName' required=''>
     <input name='email' type='email' placeholder='Email' id='w3lSender' required=''>
	</div>
	<input type='text' placeholder='Phone Number' name='PhoneNo' id='w3lName' required=''>
	<textarea placeholder='message' name='w3lMessage' id='w3lMessage' required=''></textarea>
	 <div class='text-right'>
                            <button type='submit' class='btn btn-theme2'>Submit Now</button>
                        </div>
    </form>
	";
}
?>
                </div>
                <!-- //contact form -->
            </div>
        </div>
        <!-- map -->
        <div class="map" style="text-align:center;">
			<div style="width:697px;height:550px;border:#ccc solid 1px;" id="dituContent"></div>
           <!-- <iframe
                src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d158857.7281066703!2d-0.24168144921176335!3d51.5287718408761!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47d8a00baf21de75%3A0x52963a5addd52a99!2sLondon%2C%20UK!5e0!3m2!1sen!2sin!4v1569921526194!5m2!1sen!2sin"
                frameborder="0" style="border:0;" allowfullscreen=""></iframe>-->
        </div>
        <!-- //map -->
    </div>
</section>
<!-- //contact -->
<!-- grids block 5 -->
<?php
include './foot.php';
?>

<!-- script for -->

<!-- //script -->

</body>
<script type="text/javascript">
    //创建和初始化地图函数：
    function initMap(){
        createMap();//创建地图
        setMapEvent();//设置地图事件
        addMapControl();//向地图添加控件
    }
    
    //创建地图函数：
    function createMap(){
        var map = new BMap.Map("dituContent");//在百度地图容器中创建一个地图
        var point = new BMap.Point(121.465932,31.23413);//定义一个中心点坐标
        map.centerAndZoom(point,17);//设定地图的中心点和坐标并将地图显示在地图容器中
        window.map = map;//将map变量存储在全局
    }
    
    //地图事件设置函数：
    function setMapEvent(){
        map.enableDragging();//启用地图拖拽事件，默认启用(可不写)
        map.enableScrollWheelZoom();//启用地图滚轮放大缩小
        map.enableDoubleClickZoom();//启用鼠标双击放大，默认启用(可不写)
        map.enableKeyboard();//启用键盘上下左右键移动地图
    }
    
    //地图控件添加函数：
    function addMapControl(){
        //向地图中添加缩放控件
	var ctrl_nav = new BMap.NavigationControl({anchor:BMAP_ANCHOR_TOP_LEFT,type:BMAP_NAVIGATION_CONTROL_LARGE});
	map.addControl(ctrl_nav);
        //向地图中添加缩略图控件
	var ctrl_ove = new BMap.OverviewMapControl({anchor:BMAP_ANCHOR_BOTTOM_RIGHT,isOpen:1});
	map.addControl(ctrl_ove);
        //向地图中添加比例尺控件
	var ctrl_sca = new BMap.ScaleControl({anchor:BMAP_ANCHOR_BOTTOM_LEFT});
	map.addControl(ctrl_sca);
    }
    
    
    initMap();//创建和初始化地图
</script>

</html>
<!-- // grids block 5 -->


