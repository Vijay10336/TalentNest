<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
<style>
.h3{
 font-weight: normal !important;
}
.arrows{
    text-align:center;
    width:80px;
    height:80px;
    
    border:1px solid rgb(204,204,204);
    box-shadow:0 2px 4px rgba(0,0,0,0.15), inset 0 0 50px rgba(0,0,0,0.1);
    border-radius:100px;
    margin:0 10px 10px 0;
    padding:21px;
    padding-top: 24px;
    padding-bottom: 22px;
    background:#00acee;color:#FFF;
}


</style>
</head>

<body>
<%@ include file="header.jsp" %>

<section class="jumbotron text-center">
        <div class="container py-lg-4">
            <h2 class="jumbotron-heading">Setup as fresh graduate</h2>
            <div align="center">
		    
		     <div id="fresh" align="center" class="social arrows" onclick="loggedIn();">
             <i class="fa fa-arrow-right fa-2x"></i>  
          </div>
     </div>
           <div style="margin-top:4%"> <p class="lead text-muted">or</p></div>
            <div class="container py-lg-4">
            <h2 class="jumbotron-heading">Assess your current compitency</h2>
            <div align="center">
		    
		     <div id="current" align="center" class="social arrows">
             <i class="fa fa-arrow-right fa-2x"></i>  
          </div>
     </div>
            
        </div> 
        </div>
    </section>

</body>
</html>
<script>
       function loggedIn(){
    	 window.open("loggedIn", "_top"); 
     }
</script>