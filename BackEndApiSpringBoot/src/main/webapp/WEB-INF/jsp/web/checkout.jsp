<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
         isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
   <meta charset="UTF-8">
   <meta name="description" content="Male_Fashion Template">
   <meta name="keywords" content="Male_Fashion, unica, creative, html">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <meta http-equiv="X-UA-Compatible" content="ie=edge">
   <title>Somore | Đặt hàng</title>

   <!-- Google Font -->
   <link
           href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
           rel="stylesheet">

   <!-- Css Styles -->
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"
         type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css"
         type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/elegant-icons.css"
         type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/magnific-popup.css"
         type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/nice-select.css"
         type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/owl.carousel.min.css"
         type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/slicknav.min.css"
         type="text/css">
   <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/style.css" type="text/css">
</head>

<body>
<!-- Header Section Begin-->
<jsp:include page="header.jsp" />
<!-- Header Section End -->

<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-option">
   <div class="container">
      <div class="row">
         <div class="col-lg-12">
            <div class="breadcrumb__text">
               <h4>Check Out</h4>
               <div class="breadcrumb__links">
                  <a href="index.jsp">Home</a> <a href="shop.jsp">Shop</a> <span>Check
								Out</span>
               </div>
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Breadcrumb Section End -->

<!-- Checkout Section Begin -->
<section class="checkout spad">
   <div class="container">
      <div class="checkout__form">
         <form action="confirmcart?username=${userLogged.username}&total=${total}" method="post">
            <div class="row">
               <div class="col-lg-6 col-md-6">
                  <form id="form" >
                     <h6 class="checkout__title">Chi tiết hóa đơn</h6>
                     <div class="row" >
                        <div class="col-lg-12">
                           <div class="checkout__input">
                              <p>
                                 Họ và tên<span>*</span>
                              </p>
                              <input type="text" class="" name="customer-name" required>
                           </div>
                        </div>
                     </div>
                     <div class="checkout__input" >
                        <p>
                           Địa chỉ<span>*</span>
                        </p>
                        <input type="text" class="checkout__input__add"
                               name="customer-address" required>
                     </div>
                     <div class="row">
                        <div class="col-lg-12">
                           <div class="checkout__input">
                              <p>
                                 Số điện thoại<span>*</span>
                              </p>
                              <input type="text" name="customer-phone" required>
                           </div>
                        </div>
                     </div>
                     <div class="checkout__input"  method = "post">
                        <p>Ghi chú (Nếu cần)</p>
                        <input type="text" name="customer-note">
                     </div>
                  </form>
               </div>

               <div class="col-lg-6 col-md-6">
                  <div class="checkout__order">
                     <h4 class="order__title">Đơn hàng của bạn</h4>
                     <div class="checkout__order__products">
                        <b>Sản phẩm</b><span><b>Tổng</b></span>
                     </div>
                     <ul class="checkout__total__products">
                        <c:forEach var="cart"
                                   items="${cartlist}">
                        <li>${cart.name} <span>${cart.price*cart.quantity}</span></li>
                        </c:forEach>
                     </ul>
                     <ul class="checkout__total__all">
                        <li>Tổng<span id="checkout-total-all">${total}</span></li>
                     </ul>
                     <button type="submit" class="site-btn">Thanh toán</button>
                     <p class="message-text-fail" style="color: red">${messageRegisterFail}</p>
                     <p class="message-text-success" style="color: green">${messageRegisterSuccess}</p>
                  </div>
               </div>
            </div>
         </form>
      </div>

      <!-- QR pay -->

      <div class="payment">
         <div class="payment-container">
            <div class="qr-payment">
               <img
                       src="https://img.vietqr.io/image/STB-050122075254-compact2.png?amount=500000&addInfo=Thanh%20Toan%20SoMore&accountName=Nguyen%20Huu%20Dat"
                       alt="Tài khoản ngân hàng">
            </div>
            <div class="payment-close">
               <img src="assets/img/icon/close.png" alt="close" class="ti-close">
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Checkout Section End -->
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