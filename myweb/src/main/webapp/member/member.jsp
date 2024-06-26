<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-idth, initial-scale=1">
   

    <title>Welcome to MyWorld</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/bootstrap.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
	
	 <!-- jQuery -->
    <script src="../js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../js/bootstrap.min.js"></script>

</head>
<body>
<!-- include/header.jsp 포함되는 곳 -->
<%@ include file="../include/include_header.jsp" %>

<div class="container">
		<div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">
                        <strong>Profile</strong>
                    </h2>
                    <hr>
                </div>
                
                
                <div class="col-sm-4 text-center">
                    <img class="img-responsive" src="../img/member7.jpg" alt="">
                    <h3>Actor
                        <small>한지민</small>
                    </h3>
                </div>
               
                <div class="col-sm-4 text-center">
                    
                </div>
                <div class="col-sm-4 text-center">
                  	<img class="img-responsive" src="../img/member8.jpg" alt="">
                    <h3>Age
                        <small>37</small>
                    </h3>
                </div>
                <div class="clearfix"></div>
                
            </div>
        </div>



        <div class="row">
            <div class="box">
                <div class="col-lg-12">
                    <hr>
                    <h2 class="intro-text text-center">
                        <strong>화보</strong>
                    </h2>
                    <hr>
                </div>
                <div class="col-sm-4 text-center">
                    <img class="img-responsive" src="../img/member1.jpg" alt="">
                    <h3>
                        <small></small>
                    </h3>
                </div>
                <div class="col-sm-4 text-center">
                    <img class="img-responsive" src="../img/member2.jpg" alt="">
                    <h3>
                        <small></small>
                    </h3>
                </div>
                <div class="col-sm-4 text-center">
                    <img class="img-responsive" src="../img/member3.jpg" alt="">
                    <h3>
                        <small></small>
                    </h3>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
		<div class="row">
            <div class="box">
                
                <div class="col-sm-4 text-center">
                    <img class="img-responsive" src="../img/member4.jpg" alt="">
                    <h3>
                        <small></small>
                    </h3>
                </div>
                <div class="col-sm-4 text-center">
                    <img class="img-responsive" src="../img/member5.jpg" alt="">
                    <h3>
                        <small></small>
                    </h3>
                </div>
                <div class="col-sm-4 text-center">
                    <img class="img-responsive" src="../img/member6.jpg" alt="">
                    <h3>
                        <small></small>
                    </h3>
                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        
        
    </div>
    <!-- /.container -->
    
	<!-- include/footer.jsp 포함되는 곳 -->
	<%@ include file="../include/include_footer.jsp" %>
	
</body>
</html>