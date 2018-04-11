<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Skill Buider</title>
<link rel="icon" href="/images/skillbuildericon.jpg">

<link href="../bootstrap-4.0.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
	  <link href="../bootstrap-4.0.0/fontawesome/fontIcons.css" rel="stylesheet">
	  <link href="../css/common.css" rel="stylesheet">
<link href="../css/header.css" rel="stylesheet" type="text/css">
<link href="../css/album.css" rel="stylesheet">
<script src="../js/jquery.min.js" type="text/javascript"></script>

<script src="../bootstrap-4.0.0/dist/js/bootstrap.min.js"
	type="text/javascript"></script>
	<script src="../js/alert.js" type="text/javascript"></script> 

</head>

<body>
	
<%@ include file="headerLoggedIn.jsp" %>  
<div class="container-fluid">

				<div class="row border" id="goal">
					
					<div class="col-3">
						<h4 style="margin-top:3%;float: right">Goal<h4>
					</div>
					
					<div class="col-2 goalItem">
					<div class="row" style="margin-left:10px;">
						<h6>Technology</h6>
						<div id="tech">
						<svg width="30" height="30"> <rect width="30" height="30"
							style="fill: #007bff;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">2</tspan> </text> </svg>
						<svg width="30" height="30"> <rect width="30" height="30"
							style="fill: #28a745;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">5</tspan> </text> </svg>
						</div>
					</div>
					</div>
					<div class="col-2 goalItem">
					<div class="row">
					<h6>Collabration</h6>
					<div id="colla">
					<svg width="30" height="30"> <rect width="30" height="30"
							style="fill: #007bff;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">1</tspan> </text> </svg>
					<svg width="30" height="30"> <rect width="30" height="30"
							style="fill: #28a745;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">5</tspan> </text> </svg>
						</div>
					</div>
					</div>
					<div class="col-2 goalItem">
					<div class="row">
					<h6>Communication</h6>
					<div id="comm">
					<svg width="30" height="30"> <rect width="30" height="30"
							style="fill:#007bff;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">1</tspan> </text> </svg>
					<svg width="30" height="30"> <rect width="30" height="30"
							style="fill: #28a745;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">5</tspan> </text> </svg>
					</div>	
					</div>
					</div>
					<div class="col-2 goalItem">
					<div class="row">
					<h6>Self-Governace</h6>
					<div id="governavce">
					<svg width="30" height="30"> <rect width="30" height="30"
							style="fill:#007bff;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">1</tspan> </text> </svg>
					<svg width="30" height="30"> <rect width="30" height="30"
							style="fill: #28a745;stroke-width:3;/* stroke:rgb(0,0,0); */"></rect>
						<text x="50%" y="40%" text-anchor="middle" fill="#fff" dy=".3em">
						<tspan x="50%">5</tspan> </text> </svg>
					</div>	
					</div>
					</div>

			</div>
	

			<div class="row">
				<div class="col-md-3">
				<h4 align="center">Track Journey</h4>
				<div id="trackJourney" class="border">
						
						<div class="row rowFirst">
							<svg height="70" width="70"> <circle cy="30" cx="30" r="30"
								style="fill: #2c2d2d;"></circle> <text x="50%" y="40%"
								text-anchor="middle" fill="#fff" dy=".3em" font-size="0.5rem">
							<tspan x="40%">Technology</tspan> </text> </svg>
							<div class="col-md-8">
								<div class="progress">
									<div class="progress-bar bg-info" role="progressbar"
										style="width: 60%" aria-valuenow="60" aria-valuemin="0"
										aria-valuemax="100"></div>
									<span class="progress-type">Technology</span> <span
										class="progress-completed">60%</span>
								</div>
							</div>
						</div>
						<div class="row rowFirst">
							<svg height="70" width="70"> <circle cy="30" cx="30" r="30"
								style="fill: #2c2d2d;"></circle> <text x="50%" y="40%"
								text-anchor="middle" fill="#fff" dy=".3em" font-size="0.5rem">
							<tspan x="40%">Self Goverenace</tspan> </text> </svg>
							<div class="col-md-8">
								<div class="progress">
									<div class="progress-bar bg-info" role="progressbar"
										style="width: 70%" aria-valuenow="25" aria-valuemin="0"
										aria-valuemax="100"></div>
									<span class="progress-type">Self Goverenace</span> <span
										class="progress-completed">70%</span>
								</div>
							</div>
						</div>
						<div class="row rowFirst">
							<svg height="70" width="70"> <circle cy="30" cx="30" r="30"
								style="fill: #2c2d2d;"></circle> <text x="50%" y="40%"
								text-anchor="middle" fill="#fff" dy=".3em" font-size="0.5rem">
							<tspan x="40%">Collabration</tspan> </text> </svg>

							<div class="col-md-8">
								<div class="progress">
									<div class="progress-bar bg-info" role="progressbar"
										style="width: 70%" aria-valuenow="25" aria-valuemin="0"
										aria-valuemax="100"></div>
									<span class="progress-type">Collaboration</span> <span
										class="progress-completed">70%</span>
								</div>
							</div>
						</div>
						<div class="row rowFirst">
							<svg height="70" width="70"> <circle cy="30" cx="30" r="30"
								style="fill: #2c2d2d;"></circle> <text x="50%" y="40%"
								text-anchor="middle" fill="#fff" dy=".3em" font-size="0.5rem">
							<tspan x="40%">Communction</tspan> </text> </svg>
							<div class="col-md-8">
								<div class="progress">
									<div class="progress-bar bg-info" role="progressbar"
										style="width: 70%" aria-valuenow="25" aria-valuemin="0"
										aria-valuemax="100"></div>
									<span class="progress-type">Communction</span> <span
										class="progress-completed">70%</span>
								</div>
							</div>
						</div>
					</div>
					<div id="assignment" style="margin-top: 10%;">
					
					<div class="row"  >
				<div class="col-md-12">


					<h4 align="center">My Assignment</h4>
                   <div id="assignmentscroll">
					<div class="row rowFirst" id="assignmentRow"></div>
</div>
</div>
		
				</div>
						
			</div>
			<div style="margin-top: 5%;">
                 <h4 align="center">Resources</h4>
			<div id="resource" class="border">
					
					<a href="#" class="btn btn-deep-orange btn-md">Read more</a> <a
								href="#" class="btn btn-deep-orange btn-md">Next Topic</a> <a
								href="#" class="btn btn-deep-orange btn-md">due date</a>
					</div>
				</div>	
				</div>
				<div class="col-md-6">
					<div class=" container " id="coursesDiv"  >

						<ul class="nav nav-pills">
							<li class="nav-item"><a class="nav-link active"		data-toggle="tab" data-target="#allCourse">All</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"		data-target="#complete">Completed</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab"	data-target="#progress">Progress</a></li>

						</ul>
						<div class="tab-content " id="fixheightdiv" >
						
							<div id="allCourse" role="tabpanel"	class="tab-pane  fade in active" >
							<div id="allscrol">
								<div class="card">
									<!--Card content-->
									<div class="card-body">
										<!--Title-->
										<h4 class="card-title">Project Name</h4>
										<!--Text-->
										<div class="row">
										<div class="col-md-6">
										<p>Description of Project</p>
										</div>
										
										<div class="col-md-5">
										<p>
										AssignmentName:Intro<br>
										Percentage:90%<br>
										Due Date:2018-05-01<br>
										</p>
										</div>
										</div>
										<a href="#" class="btn btn-deep-orange btn-md">Read more</a> <a
											href="#" class="btn btn-deep-orange btn-md">Next Topic</a> <a
											href="#" class="btn btn-deep-orange btn-md">due date</a>
									</div>

								</div>
								<!--/.Card-->
                         </div>
							</div>
							
							<div id="complete" class="tab-pane   fade" >
							<div id="completeScroll">
								<div class="card">
									<!--Card content-->
									<div class="card-body">
										<!--Title-->
										<h4 class="card-title">Life in Brazil</h4>
										<!--Text-->
										<p class="card-text">Lorem ipsum dolor sit amet,
											consectetur sunt elit. Impedit iste perspiciatis earum
											voluptatem ad possimus itaque, eum aspernatur, nostrum
											dignissimos beatae iunt doloremque.</p>
										<a href="#" class="btn btn-deep-orange btn-md">Read more</a> <a
											href="#" class="btn btn-deep-orange btn-md">Next Topic</a> <a
											href="#" class="btn btn-deep-orange btn-md">due date</a>
									</div>

								</div>
								<!--/.Card-->
                       </div>
							</div>
							
							<div id="progress" class="tab-pane  fade" >
							<div id="proscroll">
								<div class="card">
									<!--Card content-->
									<div class="card-body">
										<!--Title-->
										<h4 class="card-title">Life in Brazil</h4>
										<!--Text-->
										<p class="card-text">Lorem ipsum dolor sit amet,
											consectetur sunt eliernatur, nostrum
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
				</div>
				
				<div class="col-md-3">
				<div id="profileDiv" class="border"> 
				<div class="container">
						<div align="center" style="margin-top:45px;" >
								<img alt="User Pic" src="/images/default_pic.jpg"
									style="cursor: pointer; width: 100px; height: 100px; border: 2px solid #03b1ce;"
									id="profile-image1" class="img-circle img-responsive">

								<!--Upload Image Js And Css-->
							</div>
							<br>
							<div align="center" class="col-sm-12 col-xs-12 ">${name}</div>
							<div align="center" class="col-sm-12 col-xs-12 ">Software
								developer</div>
							<div align="center" class="col-sm-12 col-xs-12 ">
								<a class="btn btn-primary btn-twitter btn-sm"
									href="https://twitter.com/webmaniac"> <i
									class="fa fa-twitter"></i>
								</a>  <a class="btn btn-primary btn-sm" rel="publisher"
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
				<div style="margin-top:8%">
                <ul class="nav nav-pills">
							<li class="nav-item"><a class="nav-link active" data-toggle="tab" data-target="#alertsTab">Alert</a></li>
							<li class="nav-item"><a class="nav-link" data-toggle="tab" data-target="#socialTab">Social</a></li>

						</ul>
				<div id="alertDiv" class="border" style="margin-top:1%">
						<div class="container" >
						
						
						<div class="tab-content " style="margin-top: 5px;">
							<div id="alertsTab" role="tabpanel"	class="tab-pane fade in active">
							Lorem ipsum dolor
									sit amet, charetra varius quam sit amet vulputate. Quisque
									mauris augue, molestie tincidunt condimentum vitae, gravida a
									libero
							</div>
							<div id="socialTab" role="tabpanel"	class="tab-pane">
							Lorem ipsum dolor
									sit amet, charetra varius quam sit amet vulputate. Quisque
									mauris augue, molestie tincidunt condimentum vitae, gravida a
									libero
							</div>
							</div>
							</div>
							</div>
					</div>
				
				</div>
			</div>
			
		
	</div>
</body>
</html>
<script>
	 $(document).ready(function() {
			$("#LogoutButton").click(function(){
				logout();
				});
			fetchCourse();
			fetchUserAssignment();
		//getAssignments();
		//getUserCourses();
		$('[rel="tooltip"]').tooltip();
		$("#alertsTab").addClass("show");

	});
	function rotateCard(btn) {
		var $card = $(btn).closest('.card-container');
		console.log($card);
		if ($card.hasClass('hover')) {
			$card.removeClass('hover');
		} else {
			$card.addClass('hover');
		}
	}

	function getAssignments() {
		$
				.ajax({
					url : "getUserAssignment",
					type : "POST",
					contentType : "application/json",
					dataType : 'json',
					success : function(data) {
						var results = data.CourseData.results;
						var html = "";
						for (var i = 0; i < results.length; i++) {
							html = html
							+ '<div class="card-container">'
							+ '             <div class="card">'
							
							+ '              <div class="content">'
							+ '      <div class="main">     ' 
							+ '              <h3 class="name">'
							+ results[i].AssignmentName
							+ '</h3>'
							+ '    <p class="profession">'
							+ results[i].CourseName
							+ '</p>'									
							+'    <div class="row" style="margin-bottom:1%;">' 
							+'	<div class="col-md-6 class="assignmentBack" >'  
							+'    <h6>Due Date</h6>' 
							+'	</div>'
							+'   <div class="col-md-6">'  
							+'    <p class="assignmentData">'+results[i].dueDate+'</p>'  
							+'</div>' 
							+'</div>'  
							+'<div class="row" style="margin-bottom:1%">'  
							+' <div class="col-md-6" class="assignmentBack">'  
							+'    <h6>Status</h6>'  
							+'   </div>'  
							+'   <div class="col-md-6">'  
							+'    <p class="assignmentData">'+results[i].userAssignmentStatus+'</p>'  
							+'</div>'  
							+'</div>' 
							+'<div class="row" style="margin-bottom:1%">' 
							+' <div class="col-md-6" class="assignmentBack">'  
							+'    <h6>Created By</h6>'  
							+'   </div>'  
							+'   <div class="col-md-6">'  
							+'    <p class="assignmentData">'+results[i].CreatedBy+'</p>'  
							+'</div>     '  
							+'</div>                     '  
							+'</div>'
							
							+ '                    </div> '
							+ '                </div> '
							+ '            </div>';
							
						}
						$("#assignmentRow").append(html);
					}
				});
	}
	
	function fetchUserAssignment() {
		var dataToPost={dummy:'dummy'};
		$.ajax({
					url : "fetchUserAssignment",
					type : "POST",
					contentType : "application/json",
					dataType : 'json',
					data:JSON.stringify(dataToPost),
					success : function(data) {
						var results = data.dtoList;
						var html = "";
						$("#assignmentRow").html("");
						if(results!=null && results!=undefined && results.length>0){
							setAssignmentData(results,html);
						}
						//$("#completeCourse").append(html);
						//$("#progrssCourse").append(html);
						
					}
				});
	}
	
	function fetchCourse() {
		var dataToPost={dummy:'dummy'};
		$.ajax({
					url : "fetchCourse",
					type : "POST",
					contentType : "application/json",
					dataType : 'json',
					data:JSON.stringify(dataToPost),
					success : function(data) {
						var results = data.dtoList;
						var html = "";
						$("#allCourse").html("");
						if(results!=null && results!=undefined && results.length>0){
						setCourseData(results,html);
						}
						//$("#completeCourse").append(html);
						//$("#progrssCourse").append(html);
						
					}
				});
	}
	function getUserCourses() {
		$.ajax({
					url : "getUserCourses",
					type : "POST",
					contentType : "application/json",
					dataType : 'json',
					success : function(data) {
						var results = data.CourseData.results;
						var html = "";
						$("#allCourse").html("");
						setCourseData(results,html);
						
						//$("#completeCourse").append(html);
						//$("#progrssCourse").append(html);
						
					}
				});
	}
	function setCourseData(results,html){
		
	
		for (var i = 0; i < results.length; i++) {
			setCourseHtml(i,results,html);
			
		}
	}
	
	function setAssignmentData(results,html){
		
		for (var i = 0; i < results.length; i++) {
			setAssignmentHtml(i,results,html);
			
		}
	}
	
	function setAssignmentHtml(i,results,html){
		html = html
		+ '<div class="card-container">'
		+ '             <div class="card">'
		
		+ '              <div class="content">'
		+ '      <div class="main">     ' 
		+ '              <h3 class="name">'
		+ results[i].name
		+ '</h3>'
		+ '    <p class="profession">'
		+ results[i].description
		+ '</p>'									
		+'    <div class="row" style="margin-bottom:1%;">' 
		+'	<div class="col-md-6 class="assignmentBack" >'  
		+'    <h6>Due Date</h6>' 
		+'	</div>'
		+'   <div class="col-md-6">'  
		+'    <p class="assignmentData">'+results[i].dueDate+'</p>'  
		+'</div>' 
		+'</div>'  
		+'<div class="row" style="margin-bottom:1%">'  
		+' <div class="col-md-6" class="assignmentBack">'  
		+'    <h6>Status</h6>'  
		+'   </div>'  
		+'   <div class="col-md-6">'  
		+'    <p class="assignmentData">'+results[i].assignmentStatus+'</p>'  
		+'</div>'  
		+'</div>' 
		+'<div class="row" style="margin-bottom:1%">' 
		+' <div class="col-md-6" class="assignmentBack">'  
		+'    <h6>Created By</h6>'  
		+'   </div>'  
		+'   <div class="col-md-6">'  
		+'    <p class="assignmentData">'+results[i].createdBy+'</p>'  
		+'</div>     '  
		+'</div>                     '  
		+'</div>'
		
		+ '                    </div> '
		+ '                </div> '
		+ '            </div>';
$("#assignmentRow").append(html);	
//$("#allCourse").addClass("show");
	} 
	
	function setCourseHtml(i,results,html){
		html = html + "<div class='card' style='margin-top:1%;height:182px'>" + 
		"									<!--Card content-->" + 
		"									<div class='card-body'>" + 
		"										<!--Title-->" + 
		"										<h4 class='card-title'>"+results[i].name+"</h4>" + 
		"										<!--Text-->" + 
		"										<div class='row'>" + 
		"										<div class='col-md-6'>" + 
		"										<p>"+results[i].description+"</p>" + 
		"										</div>" + 
		"										" + 
		"										<div class='col-md-5'>" + 
		"										<p>" + 
		"										AssignmentName:Intro<br>" + 
		"										Percentage:90%<br>" + 
		"										Due Date:2018-05-01<br>" + 
		"										</p>" + 
		"										</div>" + 
		"										</div>" + 
		"										<a href='#' class='btn btn-deep-orange btn-md'>Read more</a> <a" + 
		"											href='#' class='btn btn-deep-orange btn-md'>Next Topic</a> <a" + 
		"											href='#' class='btn btn-deep-orange btn-md'>due date</a>" + 
		"									</div>" + 
		"								</div>";
$("#allCourse").append(html);	
$("#allCourse").addClass("show");
	} 
	function logout(){
		
		$.ajax({
			url : "logOut",
			type : "GET",
			success : function(data) {
				window.location.reload();
			}
			});
	}
</script>