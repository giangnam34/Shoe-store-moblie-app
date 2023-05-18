<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
   <meta charset="UTF-8">
   <meta name="description" content="Male_Fashion Template">
   <meta name="keywords" content="Male_Fashion, unica, creative, html">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <meta http-equiv="X-UA-Compatible" content="ie=edge">
   <title>Somore | Liên hệ</title>

   <!-- Google Font -->
   <link href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
         rel="stylesheet">

   <!-- Css Styles -->
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css" type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/elegant-icons.css" type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/magnific-popup.css" type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/nice-select.css" type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/owl.carousel.min.css" type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/slicknav.min.css" type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css" type="text/css">
</head>

<body>
<!-- Header Section Begin-->
<jsp:include page="header.jsp" />
<!-- Header Section End -->

<!-- Map Begin -->
<div class="map">
   <iframe
           src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3918.4842318813235!2d106.76973361424659!3d10.850726660786274!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31752763f23816ab%3A0x282f711441b6916f!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBTxrAgcGjhuqFtIEvhu7kgdGh14bqtdCBUcC4gSOG7kyBDaMOtIE1pbmg!5e0!3m2!1svi!2s!4v1663426612085!5m2!1svi!2s"
           height="500" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
</div>
<!-- Map End -->

<!-- Contact Section Begin -->
<section class="contact spad">
   <div class="container">
      <div class="row">
         <div class="col-lg-6 col-md-6">
            <div class="contact__text">
               <div class="section-title">
                  <span>Information</span>
                  <h2>Bạn cần hỗ trợ?</h2>
                  <p>SoMore rất hân hạnh được hỗ trợ hay nhận ý kiến đống góp từ bạn, hãy để lại thông tin.
                     Yêu cầu của bạn sẽ được xử lý và phản hồi trong thời gian sớm nhất.</p>
               </div>
               <ul>
                  <li>
                     <img src="assets/img/shop/off-white-x-air-jordan-1-retro-high-og-chicago-sample-mnjdls-761-740207107753.png"
                          alt="Giày" style="width:60%; margin-left: 10%; ">
                  </li>
               </ul>
            </div>
         </div>
         <div class="col-lg-6 col-md-6">
            <div class="contact__form">
               <form action="https://formspree.io/phand613@gmail.com"  method="POST" class="contact__form_info">
                  <div class="row info">
                     <div class="col-lg-6">
                        <input type="text" placeholder="Name" class="name">
                     </div>
                     <div class="col-lg-6">
                        <input type="text" placeholder="Email" class="email">
                     </div>
                     <div class="col-lg-12">
                        <textarea placeholder="Message" class="message"></textarea>
                        <button type="submit" class="site-btn" value="send">Gửi đóng góp</button>
                     </div>
                     <input type="text" name="_gotcha" style="display:none" />
                  </div>
               </form>
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Contact Section End -->

<!-- Footer Section Begin -->
<jsp:include page="footer.jsp" />
<!-- Footer Section End -->

<!-- Search Begin -->
<div class="search-model">
   <div class="h-100 d-flex align-items-center justify-content-center">
      <div class="search-close-switch">+</div>
      <form class="search-model-form">
         <input type="text" id="search-input" placeholder="Search here.....">
      </form>
   </div>
</div>
<!-- Search End -->

<!-- Active menu -->
<script>
    document.getElementById('menu-contact').classList.add('active')
</script>

<!-- Js Plugins -->
<script src="${pageContext.request.contextPath}/assets/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.nice-select.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.nicescroll.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.magnific-popup.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.countdown.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jquery.slicknav.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/mixitup.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/owl.carousel.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/main.js"></script>
</body>

</html>