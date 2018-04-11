<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
<script src="../holder.min.js" type="text/javascript"></script> 
</head>

<body>
	
<%@ include file="headerLoggedIn.jsp" %> 
<main>
<div class="container-fluid">
		<div class="row">
		  <div class="col-lg-8">
			  <!-- Nav tabs -->
              <ul class="nav nav-tabs" role="tablist">
                  <li class="nav-item">
                     <a class="nav-link active" data-toggle="tab" data-target="#curriculum"> Curriculum </a>
                  </li>
                 
              </ul>	
			      <!-- Tab panes -->
			    <div class="tab-content">
                   <div id="curriculum" class="container tab-pane active"><br>
				     
				   
		           </div>
				    
				   
		     
              </div>	
			</div> 
			<div class="col-lg-4">
			     <div class="card">
                    <div class="card-header"><span class="glyphicon glyphicon-list-alt"></span><b>News</b></div>
                       <div class="card-body">
					      <li id="news1" class="news-item">
                             Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam in venenatis enim...<a href="#">Read more...</a>
                                
                           </li>
						   
						   <li id="news2" class="news-item">
                             Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam in venenatis enim...<a href="#">Read more...</a>
                           </li>
						   <li id="news2" class="news-item">
                             Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam in venenatis enim...<a href="#">Read more...</a>
                           </li>
						   <li id="news2" class="news-item">
                             Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam in venenatis enim...<a href="#">Read more...</a>
                           </li>
					   </div> 
                          <div class="card-footer">
						     <ul class="pagination pull-right" style="margin: 0px;"><li><a href="#" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li><a href="#" class="next"><span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix">
						  </div>
                   </div>
	       </div>
		</div>
<div class="panel-footer"> <ul class="pagination pull-right" style="margin: 0px;"><li><a href="#" class="prev"><span class="glyphicon glyphicon-chevron-down"></span></a></li><li><a href="#" class="next"><span class="glyphicon glyphicon-chevron-up"></span></a></li></ul><div class="clearfix"></div></div>
</div>

	  
       
		 
  

</main>

<footer class="text-muted">
    <div class="container">
        <p class="float-right">
            <a href="#">Back to top</a>
        </p>
       
    </div>
</footer>
<!-- ----------------------------------------------  -->
</body>
</html>


<!-- -------------------------------------------------------------- -->
<script type="text/javascript">
$(document).ready(function(){
	$("#LogoutButton").click(function(){
		logout();
		});
	getCurriculum();		
});

function logout(){
	
	$.ajax({
		url : "logOut",
		type : "GET",
		success : function(data) {
			window.location.reload();
		}
		});
}

function getCurriculum(){
	
	var dataToPost={dummy:'dummy'};
	
	$.ajax({
		url : "fetchCurriculum",
		type : "POST",
		contentType : "application/json",
		dataType:"json",
		data:JSON.stringify(dataToPost),
		success : function(data) {
			
			var html = "";
			for(var a=0;a<data.length;a++){
			html='<div class="row">' + 
			'				        <div class="card" >' +  
			'                           <div class="card-body">' + 
			'                               <h5 class="card-title">'+data[a].name+'</h5>' + 
			'                            </div>' + 
			'						  ' + 
			'						  <ul class="list-group list-group-flush">' + 
			'                               <p class="card-title" style="text-align:center">'+data[a].description+'</p>' + 
			'                                <li class="list-group-item">' + 
			'								<button type="button" class="btn btn-default btn-circle"><i class="fa fa-check"></i></button>' + 
			'                                <button type="button" class="btn btn-primary btn-circle"><i class="fa fa-list"></i></button>' + 
			'                                <button type="button" class="btn btn-success btn-circle"><i class="fa fa-link"></i></button>' + 
			'                                <button type="button" class="btn btn-info btn-circle"><i class="fa fa-file"></i></button>' + 
			'								</li>' + 
			'								 <div class="card-footer">' + 
			'                            <button type="button" class="btn btn-sm btn-outline-secondary" data="'+data[a].id+'" onclick="enrollForCurriculum(this);">Enroll</button>' + 
			'                        </div>  ' + 
			'						 </ul>' + 
			'						</div>' + 
			'                  </div>';
			}
			$("#curriculum").append(html);			
			
		}
		});
}

function enrollForCurriculum(obj){
	var id=$(obj).attr("data");
var dataToPost={id:id};
	
	$.ajax({
		url : "enrollForCurriculum",
		type : "POST",
		contentType : "application/json",
		dataType:"json",
		data:JSON.stringify(dataToPost),
		success : function(data) {
			if(data.description !=null && data.description!=""){
				swal("data.description");
				window.location.reload();
			}
			
		}
	});
}
</script>