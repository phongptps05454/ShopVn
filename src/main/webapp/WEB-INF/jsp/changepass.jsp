<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <title>Đổi mật khẩu ShopVN</title>
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
        <h1 class="wthree">Đổi mật khẩu</h1>
        <div class="login-section-agileits">
            <h5>${errors}</h5>
            <form action="changepass.htm" method="post" modelAttribute="changepw">
                <c:set var="a" value="${pws}"></c:set>
                <input type="text" name="id" value="${a.id}" hidden=""/>
                <div class="w3ls-icon">
                    <span class="fa fa-lock" aria-hidden="true"></span>
                    <input type="password" class="lock" name="oldpassword"  placeholder="Nhập lại mật khẩu cũ" required=""  />
                </div>
                <div class="w3ls-icon">
                    <span class="fa fa-lock" aria-hidden="true"></span>
                    <input type="password" class="lock" id="password3"  placeholder="Nhập mật khẩu mới" required=""  />
                </div>
                <div class="w3ls-icon">
                    <span class="fa fa-lock" aria-hidden="true"></span>
                    <input type="password" class="lock" id="password4" name="password"  placeholder="Nhập lại mật khẩu mới" required=""  />
                </div>
                <input type="submit" name="btnChangepw" class="btn" value="Đổi mật khẩu"/>
            </form>
        </div>

        <script type="text/javascript">
            window.onload = function () {
                document.getElementById("password1").onchange = validatePassword;
                document.getElementById("password2").onchange = validatePassword;
            }

            function validatePassword() {
                var pass2 = document.getElementById("password2").value;
                var pass1 = document.getElementById("password1").value;
                if (pass1 != pass2)
                    document.getElementById("password2").setCustomValidity("Mật khẩu cũ không đúng");
                else
                    document.getElementById("password2").setCustomValidity('');
                //empty string means no validation error
            }
        </script>
        
        <script type="text/javascript">
            window.onload = function () {
                document.getElementById("password3").onchange = validatePassword;
                document.getElementById("password4").onchange = validatePassword;
            }

            function validatePassword() {
                var pass4 = document.getElementById("password4").value;
                var pass3 = document.getElementById("password3").value;
                if (pass3 != pass4)
                    document.getElementById("password4").setCustomValidity("Mật khẩu mới không đúng");
                else
                    document.getElementById("password4").setCustomValidity('');
                //empty string means no validation error
            }
        </script>



    </body>

</html>