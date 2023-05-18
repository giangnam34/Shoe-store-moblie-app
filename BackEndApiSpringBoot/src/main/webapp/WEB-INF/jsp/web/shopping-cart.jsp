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
   <title>Somore | Giỏ hàng</title>

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
               <h4>Shopping Cart</h4>
               <div class="breadcrumb__links">
                  <a href="index.jsp">Trang chủ</a> <a href="shop.jsp">Shop</a> <span>Giỏ
								hàng</span>
               </div>
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Breadcrumb Section End -->


<!-- Shopping Cart Section Begin -->
<c:if test = "${messagesuccess != null}">
<div class="alert alert-success text-center">
	${messagesuccess}
</div>
</c:if>
<c:if test = "${messagefail != null}">
<div class="alert alert-danger text-center">
	${messagefail}
</div>
</c:if>
<section class="shopping-cart spad">
   <div class="container">
      <div class="row">

         <div class="col-lg-8">
            <div class="shopping__cart__table">
               <c:forEach items="${cartlist}" var="cl">
                  <table>
                     <thead>
                     <tr>
                        <th>${cl.getProduct().getName()}</th>
                        <th>Số lượng</th>
                        <th>Giá</th>
                        <th></th>
                     </tr>
                     </thead>
                     <tbody class="shopping-cart-item">
                     <tr>
                        <td class="product__cart__item">
                           <div class="product__cart__item__pic">
                              <img src="${cl.getProduct().getImages().get(0)}" alt="">
                           </div>
                           <div class="product__cart__item__text">
                              <h6>${cl.getProduct().getBrand().getName()}</h6>
                              <h5>${cl.getProduct().getMoney()}</h5>
                           </div>
                        </td>
                        <td class="quantity__item">
                           <div class="quantity">
                              <div class="form-group d-flex justify-content-between">
                                 <c:choose>
                                    <c:when test="${cl.getQuantity()>1}">
                                       <a class = "btn btn-sm btn-decre"  href = "/updatecart?pid=${cl.getProduct().getId()}&username=${userLogged.username}&quantity=-1&type=dec"><i class="fa fa-minus"></i></a>
                                    </c:when>
                                 </c:choose>
                                 <input type="text" style="text-align: center" name="quantityCart" value=${cl.getQuantity()} readonly>
                                 <a class = "btn btn-sm btn-incre" href = "/updatecart?pid=${cl.getProduct().getId()}&username=${userLogged.username}&quantity=1&type=inc"><i class="fa fa-plus"></i></a>
                              </div>
                           </div>
                        </td>
                        <td class="cart__price">
                           <p>${cl.getQuantity()*cl.getProduct().getMoney()}</p>
                        </td>
                        <td class="cart__close"><a
                                href="/deletecart?username=${userLogged.username}&pid=${cl.getProduct().getId()}"><button
                                style="border-radius: 25%;">
                           <i class="fa fa-close"></i>
                        </button></a></td>
                     </tbody>
                  </table>
               </c:forEach>
            </div>
            <div class="row">
               <div class="col-lg-6 col-md-6 col-sm-6">
                  <div class="continue__btn">
                     <!-- <a href="shop.html">Tiếp tục mua sắm</a> -->
                  </div>
               </div>
               <div class="col-lg-6 col-md-6 col-sm-6">
                  <div class="continue__btn update__btn">
                     <a href="./shop?cid=1">Tiếp tục mua sắm</a>
                  </div>
               </div>
            </div>
         </div>
         <div class="col-lg-4">
            <div class="cart__total">
               <h6>Tổng tiền: ${totalprice} VNĐ</h6>
               <!-- 						<ul> -->
               <%-- 							<li>Thành tiền: ${total} VNĐ <span id="cart__total"></span></li> --%>
               <!-- 						</ul> -->
               <a href="checkout?username=${userLogged.username}" class="primary-btn">Đặt hàng</a>
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Shopping Cart Section End -->

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
<script src="./assets/js/jquery-3.3.1.min.js"></script>
<script src="./assets/js/bootstrap.min.js"></script>
<script src="./assets/js/jquery.nice-select.min.js"></script>
<script src="./assets/js/jquery.nicescroll.min.js"></script>
<script src="./assets/js/jquery.magnific-popup.min.js"></script>
<script src="./assets/js/jquery.countdown.min.js"></script>
<script src="./assets/js/jquery.slicknav.js"></script>
<script src="./assets/js/mixitup.min.js"></script>
<script src="./assets/js/owl.carousel.min.js"></script>
<script src="./assets/js/main.js"></script>
</body>

</html>