<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; ">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="/images/skillbuildericon.jpg">

<title>SkillBuilder</title>

<!-- Bootstrap core CSS -->
<link href="../css/bootstrap.css" rel="stylesheet">
<link href="../css/album.css" rel="stylesheet">
<link href="../css/alert.css" rel="stylesheet">
<link href="../bootstrap-4.0.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="../bootstrap-4.0.0/fontawesome/fontIcons.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="../css/header.css" rel="stylesheet" type="text/css">
<!-- jQuery -->
<script src="../js/jquery.min.js" type="text/javascript"></script>
<!-- Bootstrap Core JavaScript -->
<script src="../bootstrap-4.0.0/dist/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-formhelpers/2.3.0/js/bootstrap-formhelpers.js"></script>
<style>
#setprofile {
    align-items: center;
    margin-top: 1%;
    
  }
body{
    background-color: #e2eaec;
    font-size: 0.85rem;
    font-weight: normal;
    font-family: 'Open Sans', Helvetica, Arial, sans-serif;
}

#profilesetup {
    margin-left: 5%;
    margin-top: 1%;
}
#education {
    margin-left: -19%;
}
</style>
</head>
<body>
<%@ include file="headerLoggedIn.jsp" %>
	<div class="container-fluid">
		<div class=" text-center" id="setprofile">
        <h2>Set Your Profile</h2></div>
		
			
				<div class="card border-2">
				
				  <div class="row" id="profilesetup">
				    
				 <div class="col-lg-6 col-md-8 col-sm-10  mx-auto" >
				  <%@ include file="alert1.jsp" %>
				<div class=" text-center" style="margin-top: 2%;margin-left: -17%;" >
				
                 <h5>Your Introduction</h5></div>
					<div class="card-block  ">
					
						<div class="row">
								<div class="col-lg-5 mb-3">

								
									<input class="form-control  rounded-0" id="firstName" tabindex="1"
										type="text" placeholder=" First Name" required>

								</div>
								<div class="col-lg-5 mb-3"
									>

									<input
										class="form-control  rounded-0" id="lastName" type="text" tabindex="2"
										placeholder="Last Name" required>

								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 mb-3">

									<input class="form-control  rounded-0" id="city" tabindex="3"
										placeholder=" City" required>

								</div>
								<div class="col-lg-5 mb-3"
									>
                                   <input class="form-control  rounded-0" id="pincode" tabindex="4"
										placeholder=" Pincode" required>
								
								</div>
							</div>
							<div class="row">
								<div class="col-lg-5 mb-3">
									 <input
										class="form-control  rounded-0" id="state" tabindex="5"
										placeholder="State" required>

								</div>
								<div class="col-lg-5 mb-3"
									>
									<input class="form-control rounded-0" onfocus="(this.type='date')" onblur="(this.type='text')" id="date" name="date" placeholder="D.O.B" type="text" tabindex="6" >
								</div>
							</div>
						<div class="row">
							<div class="col-lg-5 mb-3">
								<form >
									<select class="form-control bfh-countries" data-country="US" tabindex="7" id="country"></select>
								</form>
							</div>

						</div>
					</div>
							 <div class=" text-center" id="education">
                                   <h5>Your Education</h5></div>
							<div class="row">
								<div class="col-lg-5 mb-3">
									 <input
										class="form-control  rounded-0" id="degree" tabindex="8"
										placeholder="degree">
								</div>
								<div class="col-lg-5 mb-3" >
							     <input
										class="form-control  rounded-0" id="specialization" tabindex="9"
										placeholder="specialization">
								</div>
							</div>
                             
							<div class="row">
								<div class="col-lg-5 mb-3">
									<select id="fromyear" 
										class="form-control input-lg" tabindex="10">
										<option value="-1">From year</option>
										
									</select>

								</div>
								<div class="col-lg-5 mb-3" >
									<select id="toyear" 
										class="form-control input-lg" tabindex="11">
										<option value="-1">To year</option>
									</select>

								</div>
							</div>
							<div class="row">
								<div class="col-lg-10 col-sm-10 col-md-10 mb-3">
									
									<input class="form-control  rounded-0" id="college" tabindex="12"
										placeholder="University/College" required>
								</div>
							</div>

							
					</div>
				
					<div class="col-lg-6 col-md-8 col-sm-10  mx-auto" >
					 <%@ include file="alert.jsp" %>
					<div class=" text-center" style="margin-top: 2%;margin-left: -8%;" >
                       <h5>Your Contact Details</h5></div>
                       <div class="row">
								
								<div class="col-lg-5 mb-3" >
							     <input
										class="form-control  rounded-0" id="mobile"
										placeholder="Mobile" tabindex="14" required>
								</div>
								<div class="col-lg-5 mb-3">
								<input class="form-control rounded-0" type="email" value="" id="gmail" tabindex="15"
									placeholder="name@email.com" required />
							</div>
					</div>
						
						
					 <div class="row">
					 <div class="col-lg-10 mb-3">
							<div class="input-group ">
								<div class="input-group-prepend">
									<div class="input-group-text">
										<span class="input-group-addon"><span
											class="fa fa-linkedin-square"></span></span>
									</div>
								</div>
								<input class="form-control rounded-0" type="email" value="" id="linked"
									placeholder="your linkedin url" tabindex="16">
								<div></div>
							</div>

						</div>
						</div>
					 <div class="row">
					 <div class="col-lg-10 mb-3">
							<div class="input-group ">
								<div class="input-group-prepend">
									<div class="input-group-text">
										<span class="input-group-addon"><span
											class="fa fa-facebook"></span></span>
									</div>
								</div>
								<input class="form-control rounded-0" type="email" value="" id="facebook"
									placeholder="your facebook url" tabindex="17">
								<div></div>
							</div>

						</div>
						</div>
						 <div class="row">
					 <div class="col-lg-10 mb-3">
							<div class="input-group ">
								<div class="input-group-prepend">
									<div class="input-group-text">
										<span class="input-group-addon"><span
											class="fa fa-twitter"></span></span>
									</div>
								</div>
								<input id="twiter" class="form-control rounded-0" type="email" value=""
									placeholder="your twitter url" tabindex="18">
								<div></div>
							</div>

						</div>
						</div>
						
					  <button type="button" class="btn btn-primary btn-lg" onclick="profileSetup();" style="float:right;margin-right:17%; margin-top: 21%;" tabindex="19">Next</button>
					 
					</div>
				</div>
				
			</div>
			
		
		
	</div>
	
</body>
<script type="text/javascript">
$(document).ready(function(){
	$("#LogoutButton").click(function(){
		logout();
		});
});
	function profileSetup(){
		var country=document.getElementById("country").value.trim();
		var fromyear=document.getElementById("fromyear").value.trim();
		var toyear=document.getElementById("toyear").value.trim();
		var email=document.getElementById("gmail").value.trim();
		var mobile=document.getElementById("mobile").value.trim();
		var pincode=document.getElementById("pincode").value.trim();
		var firstName=document.getElementById("firstName").value.trim();
		var lastName=document.getElementById("lastName").value.trim();
		var city=document.getElementById("city").value.trim();
		var state=document.getElementById("state").value.trim();
		var dob=document.getElementById("date").value.trim();
		var degree=document.getElementById("degree").value.trim();
		var specialization=document.getElementById("specialization").value.trim();
		var college=document.getElementById("college").value.trim();
		var gmail=document.getElementById("gmail").value.trim();
		var facebook=document.getElementById("facebook").value.trim();
		var linkedin=document.getElementById("linked").value.trim();
		var twitter=document.getElementById("twiter").value.trim();
		var ck_phoneno = /^\d{10}$/; 
		var ck_pincode = /^\d{6}$/; 
		var ck_email = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i  	//Supports alphabets and numbers no special characters except underscore('_') min 3 and max 20 characters.
		  if(fromyear>toyear)
			{
			  document.getElementById('fromyear').focus();
			  $('#isfromyearless').show();
			  return false
			}else{
				$('#isfromyearless').hide();
			}
		if($("#firstName").val()==null || $("#firstName").val() == ""){
			document.getElementById('firstName').focus();
		       $('#firstNameEmpty').show();
			return false;
		}else{
			$('#firstNameEmpty').hide();
		}
		if($("#lastName").val()==null || $("#lastName").val() == ""){
			document.getElementById('lastName').focus();
		       $('#lastNameEmpty').show();
			return false;
		}else{
			$('#lastNameEmpty').hide();
		}
		if($("#city").val()==null || $("#city").val() == ""){
			document.getElementById('city').focus();
		       $('#cityEmpty').show();
			return false;
		}else{
			$('#cityEmpty').hide();
		}
		
		if(pincode==null || pincode == ""){
			document.getElementById('pincode').focus();
		       $('#pincodeEmpty').show();
			return false;
		}else{
			$('#pincodeEmpty').hide();
		}
		if(pincode==null || !ck_pincode.test(pincode)){
			document.getElementById('pincode').focus();
		       $('#pincodevalid').show();
			return false;
		}else{
			$('#pincodevalid').hide();
		}
		if($("#state").val()==null || $("#state").val() == ""){
			document.getElementById('state').focus();
		       $('#stateEmpty').show();
			return false;
		}else{
			$('#stateEmpty').hide();
		}
		if($("#date").val()==null || $("#date").val() == ""){
			document.getElementById('date').focus();
		       $('#dobEmpty').show();
			return false;
		}else{
			$('#dobEmpty').hide();
		}
		if($("#country").val()==null || $("#country").val()=="")
		{
			document.getElementById('country').focus();
		       $('#stateEmpty').show();
		}
		if($("#degree").val()==null || $("#degree").val() == ""){
			document.getElementById('degree').focus();
		       $('#degreeEmpty').show();
			return false;
		}else{
			$('#degreeEmpty').hide();
		}
		
		if($("#specialization").val()==null || $("#specialization").val() == ""){
			document.getElementById('specialization').focus();
		       $('#specializationEmpty').show();
			return false;
		}else{
			$('#specializationEmpty').hide();
		}
		
		if($("#fromyear").val()==null || $("#fromyear").val() == "-1"){
			document.getElementById('fromyear').focus();
		       $('#startyearEmpty').show();
			return false;
		}else{
			$('#startyearEmpty').hide();
		}
		
		if($("#toyear").val()==null || $("#toyear").val() == "-1"){
			document.getElementById('toyear').focus();
		       $('#passoutyearEmpty').show();
			return false;
		}else{
			$('#passoutyearEmpty').hide();
		}
		
		if($("#college").val()==null || $("#college").val() == ""){
			document.getElementById('college').focus();
		       $('#collegeEmpty').show();
			return false;
		}else{
			$('#collegeEmpty').hide();
		}
		if(mobile==null || mobile == ""){
			document.getElementById('mobile').focus();
		       $('#mobileEmpty').show();
			return false;
		}else{
			$('#mobileEmpty').hide();
		}
		if (mobile=="null" || !ck_phoneno.test(mobile)) {
			document.getElementById('mobile').focus();
			$('#mobilevalid').show();
			return false;
		}else{
			$('#mobilevalid').hide();
		}
		
		if($("#gmail").val()==null || $("#gmail").val() == ""){
			document.getElementById('gmail').focus();
		       $('#gmailEmpty').show();
			return false;
		}else{
			$('#gmailEmpty').hide();
		}
		
		if (email=="null" || !ck_email.test(email)) {
			document.getElementById('gmail').focus();
			$('#gmailvalid').show();
			return false;
		}else{
			$('#gmailvalid').hide();
		}
		
		var data={firstName:firstName,LastName:lastName,city:city,pincode:pincode,state:state,country:country,dob:dob,
				degree:degree,specialization:specialization,degreeFromDate:fromyear,degreeToDate:toyear,college:college, mobile:mobile,
				email:email,facebookEmail:facebook,linkedInEmail:linkedin,twitterEmail:twitter,
					flag:"2"
					
				};
			registerCall(data);
	//window.open("fresh", "_top"); 
		
	}
	function registerCall(data){
		var elem=$('#registerspiner');
		
		$.ajax({
			url:"register",
			type:"POST",
			contentType : "application/json",
			dataType : 'json',
			data:JSON.stringify(data),
			
		   
			success:function(data){
				if(data.firstName != null && data.firstName!="" && data.lastName !=null && data.lastName !="" ){
								window.location.reload();
				}
							}
						
					});
	}
	var min = 1900,
    max = 2060,
	 select = document.getElementById('toyear');
	select1 = document.getElementById('fromyear');
    for (var i = min; i<=max; i++){
       var opt = document.createElement('option');
       var opt1 = document.createElement('option');
       opt1.value = i;
       opt1.innerHTML = i;
       opt.value = i;
       opt.innerHTML = i;
       select.appendChild(opt);
       select1.appendChild(opt1);
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
</html>