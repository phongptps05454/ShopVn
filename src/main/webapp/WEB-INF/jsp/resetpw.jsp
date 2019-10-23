<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Quên mật khẩu ShopVN</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Appraise Register Form template Responsive, Login form web template,Flat Pricing tables,Flat Drop downs Sign up Web Templates, 
              Flat Web Templates, Login sign up Responsive web template, SmartPhone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design">
        <script type="application/x-javascript">
            addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
            }, false);

            function hideURLbar() {
            window.scrollTo(0, 1);
            }
        </script>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <!-- Custom Theme files -->
        <link href="Register/css/font-awesome.css" rel="stylesheet">
        <link href="Register/css/style.css" rel='stylesheet' type='text/css' />
        <!--fonts-->
        <link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i" rel="stylesheet">
        <!--//fonts-->
    </head>

    <body>
        <!-- login -->
        <h1 class="wthree">Quên mật khẩu</h1>
        <div class="login-section-agileits">
            <h5>${errors}</h5>
            <form action="resetpw.htm" method="post" modelAttribute="resetpw">
                <div class="w3ls-icon">
                    <span class="fa fa-lock" aria-hidden="true"></span>
                    <input type="text" class="lock" name="username"  placeholder="Nhập tài khoản" required=""  />
                </div>
                <div class="w3ls-icon">
                    <span class="fa fa-lock" aria-hidden="true"></span>
                    <input type="text" class="lock" name="email"  placeholder="Nhập Email" required=""  />
                </div>
                <input type="submit" name="btnSendpw" class="btn" value="Gửi mật khẩu"/>
            </form>
        </div>
    </body>

</html>