<%-- 
    Document   : profile
    Created on : Oct 10, 2019, 1:58:56 AM
    Author     : phong
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>ShopVN Profile</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Consultancy Profile Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- js -->
        <script src="Profile/js/jquery-2.1.3.min.js" type="text/javascript"></script>
        <script type="text/javascript" src="Profile/js/sliding.form.js"></script>
        <!-- //js -->
        <link href="Profile/css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link rel="stylesheet" href="Profile/css/font-awesome.min.css" />
        <link rel="stylesheet" href="Profile/css/smoothbox.css" type='text/css' media="all" />
        <link href="//fonts.googleapis.com/css?family=Pathway+Gothic+One" rel="stylesheet">
        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div class="main">
            <h1>Thông tin khách hàng</h1>
            <div id="navigation" style="display:none;" class="w3_agile">
                <ul>
                    <li class="selected">
                        <a href="#"><i class="fa fa-home" aria-hidden="true"></i><span>Home</span></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-folder" aria-hidden="true"></i><span>Work</span></a>
                    </li>
                    <li>
                        <a href="#"><i class="fa fa-envelope" aria-hidden="true"></i><span>Contact</span></a>
                    </li>
                </ul>
            </div>
            <div id="wrapper" class="w3ls_wrapper w3layouts_wrapper">
                <div id="steps" style="margin:0 auto;" class="agileits w3_steps">
                    <form id="formElem" name="formElem" action="#" method="post" class="w3_form w3l_form_fancy">
                        <fieldset class="step agileinfo w3ls_fancy_step">
                            <legend>Thông tin</legend>
                            <div class="abt-agile">
                                <div class="abt-agile-left">
                                </div>
                                <c:set var="a" value="${profs}"></c:set>
                                    <div class="abt-agile-right">
                                    <h3>${a.fullname}</h3>
                                    <h5>Khách hàng</h5>
                                    <ul class="address">
                                        <li>
                                            <ul class="address-text">
                                                <li><b>Ngày sinh</b></li>
                                                <li>: ${a.date}</li>
                                            </ul>
                                        </li>
                                        <li>
                                            <ul class="address-text">
                                                <li><b>Điện thoại </b></li>
                                                <li>: ${a.phone}</li>
                                            </ul>
                                        </li>
                                        <li>
                                            <ul class="address-text">
                                                <li><b>Địa chỉ </b></li>
                                                <li>: ${a.address}.</li>
                                            </ul>
                                        </li>
                                        <li>
                                            <ul class="address-text">
                                                <li><b>E-MAIL </b></li>
                                                <li><a href="${a.email}">: ${a.email}</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <ul class="address-text">
                                                <li><b>WEBSITE </b></li>
                                                <li><a href="http://w3layouts.com">: www.shopvn.com</a></li>
                                            </ul>
                                        </li>
                                    </ul>
                                </div>
                                <div class="clear"></div>
                            </div>
                        </fieldset>
                    </form>
                    <fieldset class="step wthree">
                        <legend>Work</legend>
                        <div class="work-w3agile">
                            <div class="work-w3agile-top">
                                <div class="agileits_w3layouts_work_grid1 w3layouts_work_grid1 hover14 column">
                                    <div class="w3_agile_work_effect">
                                        <ul>
                                            <li>
                                                <a href="Profile/images/c1.jpg" class="sb" title="Quis Nostrud Exercitation Ullamco Laboris Quis Autem Vel Eum Iure Reprehenderit">
                                                    <figure>
                                                        <img src="Profile/images/c1.jpg" alt=" " class="img-responsive" />
                                                    </figure>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="Profile/images/c2.jpg" class="sb" title="Quis Nostrud Exercitation Ullamco Laboris Quis Autem Vel Eum Iure Reprehenderit">
                                                    <figure>
                                                        <img src="Profile/images/c2.jpg" alt=" " class="img-responsive" />
                                                    </figure>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="Profile/images/c3.jpg" class="sb" title="Quis Nostrud Exercitation Ullamco Laboris Quis Autem Vel Eum Iure Reprehenderit">
                                                    <figure>
                                                        <img src="Profile/images/c3.jpg" alt=" " class="img-responsive" />
                                                    </figure>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="Profile/images/c4.jpg" class="sb" title="Quis Nostrud Exercitation Ullamco Laboris Quis Autem Vel Eum Iure Reprehenderit">
                                                    <figure>
                                                        <img src="Profile/images/c4.jpg" alt=" " class="img-responsive" />
                                                    </figure>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="Profile/images/c5.jpg" class="sb" title="Quis Nostrud Exercitation Ullamco Laboris Quis Autem Vel Eum Iure Reprehenderit">
                                                    <figure>
                                                        <img src="Profile/images/c5.jpg" alt=" " class="img-responsive" />
                                                    </figure>
                                                </a>
                                            </li>
                                            <li>
                                                <a href="Profile/images/c6.jpg" class="sb" title="Quis Nostrud Exercitation Ullamco Laboris Quis Autem Vel Eum Iure Reprehenderit">
                                                    <figure>
                                                        <img src="Profile/images/c6.jpg" alt=" " class="img-responsive" />
                                                    </figure>
                                                </a>
                                            </li>
                                            <div class="clear"></div>
                                        </ul> 
                                    </div>
                                </div>
                            </div>
                        </div>
                    </fieldset>
                    <fieldset class="step w3_agileits">
                        <legend>Contact</legend>
                        <div class="agilecontactw3ls-grid">
                            <div class="agile-con-left">
                                <form action="#" method="post">
                                    <input type="text" name="First Name" placeholder="FIRST NAME" required="">
                                    <input type="email" name="Email" placeholder="EMAIL" required="">
                                    <textarea name="Message" placeholder="MESSAGE" required=""></textarea>
                                    <div class="send-button">
                                        <input type="submit" value="SEND">
                                    </div>
                                </form>
                            </div>
                            <div class="agile-con-right">
                                <h6>Address :-</h6>
                                <p><span><i class="fa fa-map-marker" aria-hidden="true"></i></span>22 Russell Street, Victoria ,Melbourne AUSTRALIA </p>
                                <p><span><i class="fa fa-envelope" aria-hidden="true"></i></span><a href="#">E: info [at] domain.com</a> </p>
                                <p><span><i class="fa fa-mobile" aria-hidden="true"></i></span>P: +254 2564584 / +542 8245658 </p>
                                <p><span><i class="fa fa-globe" aria-hidden="true"></i></span><a href="#">W: www.w3layouts.com</a></p>
                            </div>
                            <div class="clear"></div>
                        </div>
                    </fieldset>
                    </form>
                </div>
            </div>
            <div class="agileits_copyright">
                <p>© 2019 Consultancy Profile Widget. All rights reserved</p>
            </div>
        </div>
        <script type="text/javascript" src="Profile/js/smoothbox.jquery2.js"></script>
    </body>
</html>
