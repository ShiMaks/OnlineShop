<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>ERROR</title>
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="robots" content="all,follow">
  <!-- Bootstrap CSS-->
  <link rel="stylesheet" href="resources/vendor/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome CSS-->
  <link rel="stylesheet" href="resources/vendor/font-awesome/css/font-awesome.min.css">
  <!-- Google fonts - Roboto-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,700">
  <!-- Bootstrap Select-->
  <link rel="stylesheet" href="resources/vendor/bootstrap-select/css/bootstrap-select.min.css">
  <!-- owl carousel-->
  <link rel="stylesheet" href="resources/vendor/owl.carousel/assets/owl.carousel.css">
  <link rel="stylesheet" href="resources/vendor/owl.carousel/assets/owl.theme.default.css">
  <!-- theme stylesheet-->
  <link rel="stylesheet" href="resources/css/style.default.css" id="theme-stylesheet">
  <!-- Custom stylesheet - for your changes-->
  <link rel="stylesheet" href="resources/css/custom.css">
  <!-- Favicon and apple touch icons-->
  <link rel="shortcut icon" href="resources/img/favicon.ico" type="image/x-icon">
  <link rel="apple-touch-icon" href="resources/img/apple-touch-icon.png">
  <link rel="apple-touch-icon" sizes="57x57" href="resources/img/apple-touch-icon-57x57.png">
  <link rel="apple-touch-icon" sizes="72x72" href="resource/img/apple-touch-icon-72x72.png">
  <link rel="apple-touch-icon" sizes="76x76" href="resources/img/apple-touch-icon-76x76.png">
  <link rel="apple-touch-icon" sizes="114x114" href="resources/img/apple-touch-icon-114x114.png">
  <link rel="apple-touch-icon" sizes="120x120" href="resources/img/apple-touch-icon-120x120.png">
  <link rel="apple-touch-icon" sizes="144x144" href="resources/img/apple-touch-icon-144x144.png">
  <link rel="apple-touch-icon" sizes="152x152" href="resources/img/apple-touch-icon-152x152.png">
  <!-- Tweaks for older IEs--><!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
  <body>
    <div id="all">
      <!-- Top bar-->
      <div class="top-bar">
        <div class="container">
          <div class="row d-flex align-items-center">
            <div class="col-md-6 d-md-block d-none">
              <p>Contact us on +420 777 555 333 or hello@universal.com.</p>
            </div>
            <div class="col-md-6">
              <div class="d-flex justify-content-md-end justify-content-between">
                <ul class="list-inline contact-info d-block d-md-none">
                  <li class="list-inline-item"><a href="#"><i class="fa fa-phone"></i></a></li>
                  <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                </ul>
                <div class="login"><a href="#" data-toggle="modal" data-target="#login-modal" class="login-btn"><i class="fa fa-sign-in"></i><span class="d-none d-md-inline-block">Sign In</span></a><a href="customer-register.html" class="signup-btn"><i class="fa fa-user"></i><span class="d-none d-md-inline-block">Sign Up</span></a></div>
                <ul class="social-custom list-inline">
                  <li class="list-inline-item"><a href="#"><i class="fa "></i>EN</a></li>
                  <li class="list-inline-item"><a href="#"><i class="fa "></i>RUS</a></li>
                
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!-- Top bar end-->
      <!-- Login Modal-->
      <div id="login-modal" tabindex="-1" role="dialog" aria-labelledby="login-modalLabel" aria-hidden="true" class="modal fade">
        <div role="document" class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h4 id="login-modalLabel" class="modal-title">Customer Login</h4>
              <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
            </div>
            <div class="modal-body">
              <form action="customer-orders.html" method="get">
                <div class="form-group">
                  <input id="email_modal" type="text" placeholder="email" class="form-control">
                </div>
                <div class="form-group">
                  <input id="password_modal" type="password" placeholder="password" class="form-control">
                </div>
                <p class="text-center">
                  <button class="btn btn-template-outlined"><i class="fa fa-sign-in"></i> Log in</button>
                </p>
              </form>
              <p class="text-center text-muted">Not registered yet?</p>
              <p class="text-center text-muted"><a href="customer-register.html"><strong>Register now</strong></a>! It is easy and done in 1 minute and gives you access to special discounts and much more!</p>
            </div>
          </div>
        </div>
      </div>
      <!-- Login modal end-->
      <!-- Navbar Start-->
      <header class="nav-holder make-sticky">
        <div id="navbar" role="navigation" class="navbar navbar-expand-lg">
          <div class="container"><a href="index.html" class="navbar-brand home"><img src="img/logo.png" alt="Universal logo" class="d-none d-md-inline-block"><img src="img/logo-small.png" alt="Universal logo" class="d-inline-block d-md-none"><span class="sr-only">Universal - go to homepage</span></a>
            
          </div>
        </div>
      </header>
      <!-- Navbar End-->
      
      <div id="content">
        <div class="container">
          <div id="error-page" class="col-md-8 mx-auto text-center">
            <div class="box">
              <p class="text-center"><a href="index.html"><img src="img/logo.png" alt="Obaju template"></a></p>
              <h3>We are sorry - this page is not here anymore</h3>
              <h4 class="text-muted">Error 404 - Page not found</h4>
              <p class="buttons"><a href="index.html" class="btn btn-template-outlined"><i class="fa fa-home"></i> Go to Homepage</a></p>
            </div>
          </div>
        </div>
      </div>

      <!-- FOOTER -->
      <footer class="main-footer">        
        
        <div class="container">
          <div class="row">
            <div class="col-lg-4 text-center-md">
              <p>&copy; 2018. HTP / Maksim Shilvian</p>
            </div>
            <div class="col-lg-8 text-right text-center-md">
              <p>Template design by <a href="https://bootstrapious.com/free-templates">Bootstrapious Templates </a></p>
              <!-- Please do not remove the backlink to us unless you support further theme's development at https://bootstrapious.com/donate. It is part of the license conditions. Thank you for understanding :)-->
            </div>
          </div>
        </div>
      
    </footer>
  </div>
    <!-- Javascript files-->
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/popper.js/umd/popper.min.js"> </script>
    <script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="resources/vendor/jquery.cookie/jquery.cookie.js"> </script>
    <script src="resources/vendor/waypoints/lib/jquery.waypoints.min.js"> </script>
    <script src="resources/vendor/jquery.counterup/jquery.counterup.min.js"> </script>
    <script src="resources/vendor/owl.carousel/owl.carousel.min.js"></script>
    <script src="resources/vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.min.js"></script>
    <script src="resources/js/jquery.parallax-1.1.3.js"></script>
    <script src="resources/vendor/bootstrap-select/js/bootstrap-select.min.js"></script>
    <script src="resources/vendor/jquery.scrollto/jquery.scrollTo.min.js"></script>
    <script src="resources/js/front.js"></script>
  </body>
</html>