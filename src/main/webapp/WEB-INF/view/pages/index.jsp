<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skill Buider</title>
<link rel="icon" href="/images/skillbuildericon.jpg">

<link href="../bootstrap-4.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script src="../js/jquery.min.js" type="text/javascript"></script>

<script src="../bootstrap-4.0.0/dist/js/bootstrap.min.js"
	type="text/javascript"></script>
	<style>
.card-container {
	  -webkit-perspective: 800px;
   -moz-perspective: 800px;
     -o-perspective: 800px;
        perspective: 800px;
        margin-bottom: 30px;
}
/* flip the pane when hovered */
.card-container:not(.manual-flip):hover .card,
.card-container.hover.manual-flip .card{
	-webkit-transform: rotateY( 180deg );
-moz-transform: rotateY( 180deg );
 -o-transform: rotateY( 180deg );
    transform: rotateY( 180deg );
}


.card-container.static:hover .card,
.card-container.static.hover .card {
	-webkit-transform: none;
-moz-transform: none;
 -o-transform: none;
    transform: none;
}
/* flip speed goes here */
.card {
	 -webkit-transition: -webkit-transform .5s;
   -moz-transition: -moz-transform .5s;
     -o-transition: -o-transform .5s;
        transition: transform .5s;
-webkit-transform-style: preserve-3d;
   -moz-transform-style: preserve-3d;
     -o-transform-style: preserve-3d;
        transform-style: preserve-3d;
	position: relative;
}

/* hide back of pane during swap */
.front, .back {
	-webkit-backface-visibility: hidden;
   -moz-backface-visibility: hidden;
     -o-backface-visibility: hidden;
        backface-visibility: hidden;
	position: absolute;
	top: 0;
	left: 0;
	background-color: #FFF;
    box-shadow: 0 1px 3px 0 rgba(0, 0, 0, 0.14);
}

/* front pane, placed above back */
.front {
	z-index: 2;
}

/* back, initially hidden pane */
.back {
		-webkit-transform: rotateY( 180deg );
   -moz-transform: rotateY( 180deg );
     -o-transform: rotateY( 180deg );
        transform: rotateY( 180deg );
        z-index: 3;
}

.back .btn-simple{
    position: absolute;
    left: 0;
    bottom: 4px;
}
/*        Style       */


.card{
    background: none repeat scroll 0 0 #FFFFFF;
    border-radius: 4px;
    color: #444444;
}
.card-container, .front, .back {
	width: 100%;
	height: 420px;
	border-radius: 4px;
	-webkit-box-shadow: 0px 0px 19px 0px rgba(0,0,0,0.16);
-moz-box-shadow: 0px 0px 19px 0px rgba(0,0,0,0.16);
box-shadow: 0px 0px 19px 0px rgba(0,0,0,0.16);
}
.card .cover{
    height: 105px;
    overflow: hidden;
    border-radius: 4px 4px 0 0;
}
.card .cover img{
    width: 100%;
}
.card .user{
    border-radius: 50%;
    display: block;
    height: 120px;
    margin: -55px auto 0;
    overflow: hidden;
    width: 120px;
}
.card .user img{
    background: none repeat scroll 0 0 #FFFFFF;
    border: 4px solid #FFFFFF;
    width: 100%;
}

.card .content{
    background-color: rgba(0, 0, 0, 0);
    box-shadow: none;
    padding: 10px 20px 20px;
}
.card .content .main {
    min-height: 160px;
}
.card .back .content .main {
    height: 215px;
}
.card .name {
		font-family: 'Arima Madurai', cursive;
    font-size: 22px;
    line-height: 28px;
    margin: 10px 0 0;
    text-align: center;
    text-transform: capitalize;
}
.card h5{
    margin: 5px 0;
    font-weight: 400;
    line-height: 20px;
}
.card .profession{
    color: #999999;
    text-align: center;
    margin-bottom: 20px;
}
.card .footer {
    border-top: 1px solid #EEEEEE;
    color: #999999;
    margin: 30px 0 0;
    padding: 10px 0 0;
    text-align: center;
}
.card .footer .social-links{
    font-size: 18px;
}
.card .footer .social-links a{
    margin: 0 7px;
}
.card .footer .btn-simple{
    margin-top: -6px;
}
.card .header {
    padding: 15px 20px;
    height: 90px;
}
.card .motto{
		font-family: 'Arima Madurai', cursive;
    border-bottom: 1px solid #EEEEEE;
    color: #999999;
    font-size: 14px;
    font-weight: 400;
    padding-bottom: 10px;
    text-align: center;
}

.card .stats-container{
	width: 100%;
	margin-top: 50px;
}
.card .stats{
	display: block;
	float: left;
	width: 33.333333%;
	text-align: center;
}

.card .stats:first-child{
	border-right: 1px solid #EEEEEE;
}
.card .stats:last-child{
	border-left: 1px solid #EEEEEE;
}
.card .stats h4{
		font-family: 'Arima Madurai', cursive;
	font-weight: 300;
	margin-bottom: 5px;
}
.card .stats p{
	color: #777777;
}
/*      Just for presentation        */


</style>
</head>

<body>

	<div class="container-fluid">
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<h4>Goal</h4>
				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<div class="row">
						<div class="col-sm-12">

							<h4 align="center">Track Journey</h4>
							<div class="row">
								<svg width="70" height="50"> <rect width="70" height="50"
									style="fill: #96e2db;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
								<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
								<tspan x="50%">Technology</tspan> </text> </svg>
								<div class="col-md-8">
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
											style="width: 60%;">
											<span class="sr-only">60% Complete</span>
										</div>
										<span class="progress-type">Technology</span> <span
											class="progress-completed">60%</span>
									</div>
								</div>
							</div>
							<div class="row">
								<svg width="70" height="50"> <rect width="70" height="50"
									style="fill: #96e2db;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
								<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
								<tspan x="50%">Self Goverenace</tspan> </text> </svg>
								<div class="col-md-8">
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
											style="width: 60%;">
											<span class="sr-only">60% Complete</span>
										</div>
										<span class="progress-type">Self Goverenace</span> <span
											class="progress-completed">60%</span>
									</div>
								</div>
							</div>
							<div class="row">
								<svg width="70" height="50"> <rect width="70" height="50"
									style="fill: #96e2db;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
								<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
								<tspan x="50%">Course</tspan> </text> </svg>

								<div class="col-md-8">
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
											style="width: 60%;">
											<span class="sr-only">60% Complete</span>
										</div>
										<span class="progress-type">Course</span> <span
											class="progress-completed">60%</span>
									</div>
								</div>
							</div>
							<div class="row">
								<svg width="70" height="50"> <rect width="70" height="50"
									style="fill: #96e2db;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
								<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
								<tspan x="50%">Communction</tspan> </text> </svg>
								<div class="col-md-8">
									<div class="progress">
										<div class="progress-bar" role="progressbar"
											aria-valuenow="60" aria-valuemin="0" aria-valuemax="100"
											style="width: 60%;">
											<span class="sr-only">60% Complete</span>
										</div>
										<span class="progress-type">Communction</span> <span
											class="progress-completed">60%</span>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="container">

						<ul class="nav nav-pills">
							<li class="nav-item"><a class="nav-link active"
								data-toggle="tab" data-target="#allCourse">All</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"
								data-target="#complete">Complete</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"
								data-target="#progress">Progress</a></li>

						</ul>
						<div class="tab-content " style="margin-top: 5px;">
							<div id="allCourse" role="tabpanel"
								class="tab-pane fade in active">
								<div class="card">
									<!--Card content-->
									<div class="card-body">
										<!--Title-->
										<h4 class="card-title">Life in Brazil</h4>
										<!--Text-->
										<p class="card-text">Lorem ipsum dolor sit amet,
											consectetur sunt elit. Impedit iste perspiciatis earum
											voluptatem ad possimus itaque, eum aspernatur, nostrum
											dignissimos beatae id in illum accusantium adipisicing
											suscipit sunt doloremque.</p>
										<a href="#" class="btn btn-deep-orange btn-md">Read more</a> <a
											href="#" class="btn btn-deep-orange btn-md">Next Topic</a> <a
											href="#" class="btn btn-deep-orange btn-md">due date</a>
									</div>

								</div>
								<!--/.Card-->

							</div>
							<div id="complete" class="tab-pane fade">
								<div class="card">
									<!--Card content-->
									<div class="card-body">
										<!--Title-->
										<h4 class="card-title">Life in Brazil</h4>
										<!--Text-->
										<p class="card-text">Lorem ipsum dolor sit amet,
											consectetur sunt elit. Impedit iste perspiciatis earum
											voluptatem ad possimus itaque, eum aspernatur, nostrum
											dignissimos beatae id in illum accusantium adipisicing
											suscipit sunt doloremque.</p>
										<a href="#" class="btn btn-deep-orange btn-md">Read more</a> <a
											href="#" class="btn btn-deep-orange btn-md">Next Topic</a> <a
											href="#" class="btn btn-deep-orange btn-md">due date</a>
									</div>

								</div>
								<!--/.Card-->

							</div>
							<div id="progress" class="tab-pane fade">
								<div class="card">
									<!--Card content-->
									<div class="card-body">
										<!--Title-->
										<h4 class="card-title">Life in Brazil</h4>
										<!--Text-->
										<p class="card-text">Lorem ipsum dolor sit amet,
											consectetur sunt elit. Impedit iste perspiciatis earum
											voluptatem ad possimus itaque, eum aspernatur, nostrum
											dignissimos beatae id in illum accusantium adipisicing
											suscipit sunt doloremque.</p>
										<a href="#" class="btn btn-deep-orange btn-md">Read more</a> <a
											href="#" class="btn btn-deep-orange btn-md">Next Topic</a> <a
											href="#" class="btn btn-deep-orange btn-md">due date</a>
									</div>

								</div>
								<!--/.Card-->

							</div>
						</div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="row">
						<div class="col-xs-12">

							<div align="center">
								<img alt="User Pic"
									src="/images/default_pic.jpg" style="cursor: pointer;width: 100px;height: 100px;border: 2px solid #03b1ce;"	id="profile-image1" class="img-circle img-responsive">

								<!--Upload Image Js And Css-->
							</div>
							<br>
							<div align="center" class="col-sm-12 col-xs-12 ">
								<p th:text="'Hello, ' + ${name} + '!'" />
							</div>
							<div align="center" class="col-sm-12 col-xs-12 ">Software
								developer</div>
							<div align="center" class="col-sm-12 col-xs-12 ">
								<a class="btn btn-primary btn-twitter btn-sm"
									href="https://twitter.com/webmaniac"> <i
									class="fa fa-twitter"></i>
								</a> <a class="btn btn-danger btn-sm" rel="publisher"
									href="https://plus.google.com/+ahmshahnuralam"> <i
									class="fa fa-google-plus"></i>
								</a> <a class="btn btn-primary btn-sm" rel="publisher"
									href="https://facebook.com"> <i class="fa fa-facebook"></i>
								</a> <a class="btn btn-warning btn-sm" rel="publisher"
									href=" https://plus.google.com/shahnuralam"> <i
									class="fa fa-linkedin-square"></i>
								</a>
							</div>
							<div class="widget-body">
								<div class="widget-main" id="user-description">
									<p>My job is mostly lorem ipsuming and dolor sit ameting as
										long as consectetur adipiscing elit.</p>

								</div>

								<div class="row">
									<div align="left" class="col-sm-6">
										<h6>Learning is 50% Complete</h6>
									</div>
									<div align="right" class="col-sm-6">
										<div align="right" class="col-sm-12">
											<h6>code:</h6>
										</div>
										<div align="right" class="col-sm-12">
											<h6>Douments:</h6>
										</div>
										<div align="right" class="col-sm-12">
											<h6>Videos:</h6>
										</div>
										<button type="button" class="btn btn-default ">
											<h6>More</h6>
										</button>
									</div>
								</div>


							</div>
						</div>

					</div>
				</div>
			</div>
			<div class="row">
			<div class="col-md-3">
			

						<h4 align="center">My Assignment</h4>

						<div class="row">
			
        		<!-- Card Flip -->
				<div class="card-container manual-flip">
                <div class="card">
                    <div class="front">
                        <div class="cover">
                            <!-- <img src="/images/default_pic.jpg"/> -->
                        </div>
                        <div class="user">
                            <img class="img-circle" src="/images/default_pic.jpg"/>
                        </div>
                        <div class="content">
                            <div class="main">
                                <h3 class="name">Andrew Mike</h3>
                                <p class="profession">Web Developer</p>
                                <p class="text-center">"Lamborghini Mercy <br>Your chick she so thirsty <br>I'm in that two seat Lambo"</p>
                            </div>
                            <div class="footer">
                                <button class="btn btn-simple" onclick="rotateCard(this)">
                                    <i class="fa fa-mail-forward"></i> Manual Rotation
                                </button>
                            </div>
                        </div>
                    </div> <!-- end front panel -->
                    <div class="back">
                        <div class="header">
                            <h5 class="motto">"To be or not to be, this is my awesome motto!"</h5>
                        </div>
                        <div class="content">
                            <div class="main">
                                <h4 class="text-center">Job Description</h4>
                                <p class="text-center">Web design, Adobe Photoshop, HTML5, CSS3, Corel and many others...</p>

                                <div class="stats-container">
                                    <div class="stats">
                                        <h4>235</h4>
                                        <p>
                                            Followers
                                        </p>
                                    </div>
                                    <div class="stats">
                                        <h4>114</h4>
                                        <p>
                                            Following
                                        </p>
                                    </div>
                                    <div class="stats">
                                        <h4>35</h4>
                                        <p>
                                            Projects
                                        </p>
                                    </div>
                                </div>

                            </div>
                        </div>
                        <div class="footer">
                            <button class="btn btn-simple" rel="tooltip" title="Flip Card" onclick="rotateCard(this)">
                                <i class="fa fa-reply"></i> Back
                            </button>
                            <div class="social-links text-center">
                                <a href="http://deepak646.blogspot.in/" class="facebook"><i class="fa fa-facebook fa-fw"></i></a>
                                <a href="http://deepak646.blogspot.in/" class="google"><i class="fa fa-google-plus fa-fw"></i></a>
                                <a href="http://deepak646.blogspot.in/" class="twitter"><i class="fa fa-twitter fa-fw"></i></a>
                            </div>
                        </div>
                    </div> <!-- end back panel -->
                </div> <!-- end card -->
            </div> <!-- end card-container -->
        		<!-- End Card Flip -->
	
						</div>

						<div class="row">
							<div class="col-xs-12">
								<h4 align="center">Resources</h4>
								<a href="#" class="btn btn-deep-orange btn-md">Read more</a> <a
									href="#" class="btn btn-deep-orange btn-md">Next Topic</a> <a
									href="#" class="btn btn-deep-orange btn-md">due date</a>
							</div>
					</div>
			</div>
			<div class="col-md-6">
			</div>
			<div class="col-md-3">
			
					<div class="row ">
						<!-- tabs -->
						<div class="tabbable">
							<ul class="nav nav-tabs">
								<li class="active"><a href="#alert" data-toggle="tab">Alert</a></li>
								<li><a href="#social" data-toggle="tab">Social</a></li>

							</ul>
							<div class="tab-content">
								<div class="tab-pane active" id="alert">Lorem ipsum dolor
									sit amet, charetra varius quam sit amet vulputate. Quisque
									mauris augue, molestie tincidunt condimentum vitae, gravida a
									libero.</div>
								<div class="tab-pane" id="social">Secondo sed ac orci quis
									tortor imperdiet venenatis. Duis elementum auctor accumsan.
									Aliquam in felis sit amet augue.</div>

							</div>
						</div>
						<!-- /tabs -->

				</div>
			</div>
			</div>
		</div>
	</div>
</body>
</html>
<script>
$(document).ready(function(){
	        $('[rel="tooltip"]').tooltip();
  
});
function rotateCard(btn){
    var $card = $(btn).closest('.card-container');
    console.log($card);
    if($card.hasClass('hover')){
        $card.removeClass('hover');
    } else {
        $card.addClass('hover');
    }
}
</script>