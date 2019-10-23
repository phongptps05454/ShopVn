<%-- 
    Document   : loadpages
    Created on : Oct 19, 2019, 1:52:32 PM
    Author     : phong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ShopVN-Chuyển tiếp trang</title>
        <script type="text/javascript">
            var time = 5; //How long (in seconds) to countdown
            var page = "login.htm"; //The page to redirect to
            function countDown() {
                time--;
                gett("container").innerHTML = time;
                if (time == 0) {
                    window.location = page;
                }
            }
            function gett(id) {
                if (document.getElementById)
                    return document.getElementById(id);
                if (document.all)
                    return document.all.id;
                if (document.layers)
                    return document.layers.id;
                if (window.opera)
                    return window.opera.id;
            }
            function init() {
                if (gett('container')) {
                    setInterval(countDown, 1000);
                    gett("container").innerHTML = time;
                } else {
                    setTimeout(init, 50);
                }
            }
            document.onload = init();
        </script>
    </head>
    <body style="text-align: center">
        <h2 style="color: red">Chuyển về trang đăng nhập sau <span id="container"></span> giây!</h2>
        <h4><a href="login.htm">Về trang đăng nhập ngay !</a></h4>
    </body>
</html>
