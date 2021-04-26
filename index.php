
<!doctype html>
<html lang="en">
<?php
include './head.php';
?>
  <body>

<!-- Top Menu 1 -->
<?php
include './headbody.php';
?>
<section class="w3l-main-slider" id="home" dir="ltr">
  <!-- main-slider -->
	
  <div class="companies20-content">
   
    <div class="owl-one owl-carousel owl-theme">
      <div class="item">
        <li>
          <div class="slider-info banner-view bg bg2" data-selector=".bg.bg2">
            <div class="banner-info">
              <div class="container">
                <div class="banner-info-bg mx-auto text-center">
                  <h5>Better Education For A Better World</h5>
                 <a class="btn btn-secondary btn-theme2 mt-md-5 mt-4 " href="services.php"><div class="transrdm"></div></a>
                </div>
                
              </div>
            </div>
          </div>
        </li>
      </div>
      <div class="item">
        <li>
          <div class="slider-info  banner-view banner-top1 bg bg2" data-selector=".bg.bg2">
            <div class="banner-info">
              <div class="container">
                <div class="banner-info-bg mx-auto text-center">
                  <h5>Explore The World Of Our Graduates</h5>
                  <a class=" btn btn-secondary btn-theme2 mt-md-5 mt-4" href="services.php"><div class="transrdm"></div></a>
                </div>
              </div>
            </div>
          </div>
        </li>
      </div>
      <div class="item">
        <li>
          <div class="slider-info banner-view banner-top2 bg bg2" data-selector=".bg.bg2">
            <div class="banner-info">
              <div class="container">
                <div class="banner-info-bg mx-auto text-center">
                  <h5>Exceptional People, Exceptional Care</h5>
                 <a class="btn btn-secondary btn-theme2 mt-md-5 mt-4" href="services.php"><div class="transrdm"></div></a>
                </div>
              </div>
            </div>
          </div>
        </li>
      </div>
      <div class="item">
        <li>
          <div class="slider-info banner-view banner-top3 bg bg2" data-selector=".bg.bg2">
            <div class="banner-info">
              <div class="container">
                <div class="banner-info-bg mx-auto text-center">
                  <h5>Explore The World Of Our Graduates</h5>
                  <a class="btn btn-secondary btn-theme2 mt-md-5 mt-4" href="services.php"><div class="transrdm"></div></a>
                </div>
              </div>
            </div>
          </div>
        </li>
      </div>
    </div>
  </div>

</div>


  <script src="assets/js/owl.carousel.js"></script>
  <!-- script for -->
  <script>
    $(document).ready(function () {
      $('.owl-one').owlCarousel({
        loop: true,
        margin: 0,
        nav: false,
        responsiveClass: true,
        autoplay: false,
        autoplayTimeout: 5000,
        autoplaySpeed: 1000,
        autoplayHoverPause: false,
        responsive: {
          0: {
            items: 1,
            nav: false
          },
          480: {
            items: 1,
            nav: false
          },
          667: {
            items: 1,
            nav: true
          },
          1000: {
            items: 1,
            nav: true
          }
        }
      })
    })
  </script>
  <!-- //script -->
  <!-- /main-slider -->
</section>
		
<section class="w3l-feature-3" id="features">
	<div class="grid top-bottom mb-lg-5 pb-lg-5">
		<div class="container">
			
			<div class="middle-section grid-column text-center">
				<div class="three-grids-columns">
					<span class="fa fa-laptop"></span>
					<h4 id="trantext1"></h4>
					<p id="trantext2"></p>
					<a href="services.html" class="btn btn-secondary btn-theme3 mt-4"><div class="transrdm"></div></a>
				</div>
				<div class="three-grids-columns">
					<span class="fa fa-users"></span>
					<h4 id="trantext3"></h4>
					<p id="trantext4"></p>
					<a href="services.html" class="btn btn-secondary btn-theme3 mt-4"><div class="transrdm"></div></a>
				</div>
				<div class="three-grids-columns">
					<span class="fa fa-book"></span>
					<h4 id="trantext5"></h4>
					<p id="trantext6"></p>
					<a href="services.html" class="btn btn-secondary btn-theme3 mt-4"><div class="transrdm"></div></a>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- features-4 block -->
<section class="w3l-index1" id="about">
	<div class="calltoaction-20  py-5 editContent">
		<div class="container py-md-3">
		
			<div class="calltoaction-20-content row">
				<div class="column center-align-self col-lg-6 pr-lg-5">
					<h5 class="editContent" id="trindextext1">Welcome To Our Campus</h5>
					<p class="more-gap editContent" id="trindextext2">Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam
						architecto, ex veritatis tempora aliquid labore natus autem iusto magni dicta incidunt nostrum
						odit veniam voluptas provident minus saepe reiciendis nulla dolore delectus molestias</p>
						<p class="more-gap editContent" id="trindextext3">Numquam
							architecto, ex veritatis tempora aliquid labore natus autem iusto magni dicta incidunt nostrum
							odit veniam voluptas provident </p>
					<p class="more-gap editContent" id="trindextext4">Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam
						architecto, ex veritatis tempora aliquid labore natus autem iusto magni dicta incidunt nostrum
						odit veniam voluptas provident minus saepe reiciendis nulla dolore delectus molestias</p>
							<a class="btn btn-secondary btn-theme2 mt-3" href="about.php"> <div class="transrdm"></div></a>
				</div>
				<div class="column ccont-left col-lg-6">
					<img src="assets/images/g1.jpg" class="img-responsive" alt="">
				</div>
			</div>
		</div>
	</div>
</section>
<!-- features-4 block -->
<section class="services-12" id="course">
	<div class="form-12-content">
		<div class="container">
			<div class="grid grid-column-2 ">
				
				<div class="column1">
					<div class="heading">
						<h3 class="head text-white">Apply for Scholarship</h3>
						<h4>Fall 2019 applications are now open</h4>
						<p class="my-3 text-white"> Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;
						  Nulla mollis dapibus nunc, ut rhoncus
						  turpis sodales quis. Integer sit amet mattis quam.</p>
					  </div>
					</div>
					<div class="column2">
						<a class="btn btn-secondary btn-theme2 mt-3" href="contact.php"> Apply Here</a>
					</div>
			</div>
		</div>
	</div>
</section>

<!--  form-12 -->
<section class="w3l-form-12">
		<div class="form-12-content py-5" id="services">
			<div class="container py-md-3">
				<div class="grid grid-column-2 py-md-5">
						
					<div class="column1">
						<h4 class="tagline">Find your course</h4>
						<p>Fill in below form to find your courses</p>
							<form action="/" method="Get">
								<div class="">
									<input type="text" name="name" class="form-input" placeholder="Course Name">
								</div>
								<div class="">
									<select id="sel1">
										<option>Category</option>
										<option>Computer</option>
										<option>Science</option>
										<option>History</option>
										<option>Economics</option>
									  </select>
								</div>
								
								
								<button type="submit" class="btn btn-secondary btn-theme2">Submit</button>
							</form>
						</div>
						<div class="column2">
						<div class="row">
							<div class="col-md-3 col-sm-6 col-6">
								<a href="services.php"><div class="courses-item">
									<span class="fa fa-male"></span>
									<p>Socioligy</p>
								</div></a>
							</div>
							<div class="col-md-3 col-sm-6 col-6">
								<a href="services.php"><div class="courses-item">
									<span class="fa fa-suitcase"></span>
									<p>Business</p>
								</div></a>
							</div>
							<div class="col-md-3 col-sm-6 col-6 mt-md-0 mt-4">
								<a href="services.php"><div class="courses-item">
									<span class="fa fa-code"></span>
									<p>Web Dev</p>
								</div></a>
							</div>
							<div class="col-md-3 col-sm-6 col-6 mt-md-0 mt-4">
								<a href="services.php"><div class="courses-item">
									<span class="fa fa-flask"></span>
									<p>Science</p>
								</div></a>
							</div>
							<div class="col-md-3 col-sm-6 col-6 mt-4">
								<a href="services.php"><div class="courses-item mt-2">
									<span class="fa fa-money"></span>
									<p>Ecomomics</p>
								</div></a>
							</div>
							<div class="col-md-3 col-sm-6 col-6 mt-4">
								<a href="services.php"><div class="courses-item mt-2">
									<span class="fa fa-gg"></span>
									<p>Biology</p>
								</div></a>
							</div>
							<div class="col-md-3 col-sm-6 col-6 mt-4">
								<a href="services.php"><div class="courses-item mt-2">
									<span class="fa fa-desktop"></span>
									<p>Computing</p>
								</div></a>
							</div>
							<div class="col-md-3 col-sm-6 col-6 mt-4">
								<a href="services.php"><div class="courses-item mt-2">
									<span class="fa fa-mouse-pointer"></span>
									<p>Web Design</p>
								</div></a>
							</div>
						</div>
						</div>
				</div>
			</div>
		</div>
	</section>
<!-- // form-12 -->



 <!-- specifications -->
    <section class="w3l-index2">
        <div class="main-w3 py-5" id="stats">
            <div class="container py-lg-3">
               <div class="row main-cont-wthree-fea">
                    <div class="col-lg-3 col-sm-6">
                        <div class="grids-speci1">
                            <h3 class="title-spe">60</h3>
                            <p>PROFESSIONAL <br>INSTRUCTORS</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6 mt-sm-0 mt-4">
                        <div class="grids-speci1">
                            <h3 class="title-spe">18</h3>
                            <p> NEW COURSES <br>EVERY YEAR</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6  mt-lg-0 mt-4">
                        <div class="grids-speci1">
                            <h3 class="title-spe">34</h3>
                            <p>LIVE SESSIONS <br>EVERY MONTH</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6 mt-lg-0 mt-4">
                        <div class="grids-speci1">
                            <h3 class="title-spe">20</h3>
                            <p>REGISTERED <br>STUDENTS</p>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!-- //specifications -->
    </section>
<!-- customers4 block -->
<section class="w3l-customers-4" id="testimonials">
  <div id="customers4-block" class="py-5">
    <div class="container py-md-3">
  
     <div class="section-title align-center row">
      <div class="item-top col-md-6 pr-md-5">
        <div class="heading">
          <h3 class="head text-white">Make your choice based on reviews</h3>
          <p class="my-3 head text-white">My friend recommended Belt&Road Education and that is why I chose them. I decided to study in China and I needed local guide into Universities. My goal was to be enrolled to University in Shanghai because I like this city, it is very International and dynamic. I was impresssed by their service, they gave information on three Universities and helped me with application documents. As a result I've got scholarship. Totally worse it.</p>
            <p class="my-3 head text-white"> Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;
              Nulla mollis dapibus nunc, ut rhoncus
              turpis sodales quis. Integer sit amet mattis quam.</p>
          </div>
     </div>
          <div class="item-top col-md-6 mt-md-0 mt-4">
            <div class="item text-center">
             <div class="imgTitle">
               <img src="assets/images/c3.jpg" class="img-responsive" alt="" />
              </div>
              <h6 class="mt-3">Jessey Rosey</h6>
              <p class="">Student</p>
              <p> It is my second year in Wuhan city, one of the biggest city in China. I can tell for sure that it is unique experience to live in totally different culture that doesn't look like any other culture in the World.</p>
              
          </div>
         </div>
    </div>
  </div>
  </div>
  
 
</section>
<section class="w3l-price-2" id="news">
    <div class="price-main py-5">
        <div class="container py-md-3">
             <div class="pricing-style-w3ls row py-md-5">
              <div class="pricing-chart col-lg-6">
                <h3 class="">Latest Posts</h3>
                <div class="tatest-top mt-md-5 mt-4">
                        <div class="price-box btn-layout bt6">
                            <div class="grid grid-column-2">
                                    <div class="column-6">
                                            <img src="assets/images/g9.jpg" alt="" class="img-fluid">
                                        </div>
                                <div class="column1">
                                   
                                    <div class="job-info">
                                        <h6 class="pricehead"><a href="#">Summer Course Starts </a></h6>
                                        <h5>April 25, 2020</h5>
                                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit architecto..</p>
                                    </div>
                                </div>
                               
                            </div>
                        </div>
                        <div class="price-box btn-layout bt6 top-middle-1">
                            <div class="grid grid-column-2">
                                    <div class="column-6">
                                            <img src="assets/images/g10.jpg" alt="" class="img-fluid">
                                        </div>
                                <div class="column1">
                                   <div class="job-info">
                                        <h6 class="pricehead"><a href="#">	
                                            About Artificial Intelligence</a></h6>
                                       <h5>March 25, 2020</h5>
                                       <p>Lorem ipsum dolor sit amet consectetur adipisicing elit architecto..</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="price-box btn-layout bt6">
                            <div class="grid grid-column-2">
                                    <div class="column-6">
                                            <img src="assets/images/g8.jpg" alt="" class="img-fluid">
                                        </div>
                                <div class="column1">
                                  
                                    <div class="job-info">
                                        <h6 class="pricehead"><a href="#">	
                                            New Exam Schedules </a></h6>
                                        <h5>February 25, 2020</h5>
                                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit architecto..</p>
                                    </div>
                                </div>
                                
                                
                            </div>
                        </div>
                    </div>
                    <div class="text-right mt-4">
                        <a class="btn btn-secondary btn-theme2" href="#"> View All</a>
                      </div>
                    </div>
                    <div class="w3l-faq-page col-lg-6 pl-3 pl-lg-5 mt-lg-0 mt-5">
                        <h3 class="">Upcoming Events</h3>
                        <div class="events-top mt-md-5 mt-4">
                            <div class="events-top-left">
                                    <div class="icon-top">
                                        <h3>20</h3>
                                        <p>Nov</p>
                                        <span>2020</span>
                                    </div>
                            </div>
                            <div class="events-top-right">
                                <h6 class="pricehead"><a href="#">	
                                    Try back</a></h6>
                                    <p class="mb-2 mt-3">online service coming.</p>
                                    <li>07:00 - 10:00 </li>
                                    <li class="melb">shanghai, china</li>
                            </div>
                        </div>
                        <div class="events-top mt-4">
                            <div class="events-top-left">
                                    <div class="icon-top">
                                        <h3>25</h3>
                                        <p>Nov</p>
                                        <span>2020</span>
                                    </div>
                            </div>
                            <div class="events-top-right">
                                <h6 class="pricehead"><a href="#">	
                                    Nulla mollis dapibus nunc, ut </a></h6>
                                    <p class="mb-2 mt-3">Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Nulla mollis dapibus nunc, ut rhoncus turpis sodales quis. Integer sit amet mattis quam.</p>
                                    <li>07:00 - 10:00 </li>
                                    <li class="melb">Melbourne, Australia</li>
                            </div>
                        </div>
                        <div class="text-right mt-4">
                          <a class="btn btn-secondary btn-theme2" href="#"> View All</a>
                        </div>
                      </div>
            </div>
        </div>
    </div>
</section>
<!-- grids block 5 -->
<?php
include './foot.php';
?>

<!-- //script -->

</body>

</html>
<!-- // grids block 5 -->