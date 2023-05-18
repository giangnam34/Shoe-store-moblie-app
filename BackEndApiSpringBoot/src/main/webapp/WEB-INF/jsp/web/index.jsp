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
   <title>Somore | Trang chủ</title>
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

<!-- Hero Section Begin -->
<section class="hero">
   <div class="video-slider">
      <video loop="" autoplay="" playsinline="" class="slider-video" style="width: 100%;">
         <source src="/assets/img/shop/slider.mp4">
      </video>
   </div>
</section>
<!-- Hero Section End -->

<!-- Banner Section Begin -->
<section class="banner spad">
   <div class="container">
      <div class="row">
         <div class="col-lg-9 offset-lg-3">
            <div class="banner__item">
               <div class="banner__item__pic">
                  <img src="/assets/img/shop/vans/vn0a4uuc1ae-4.png" alt="">
               </div>
               <div class="banner__item__text">
                  <h2>Mẫu giày mới tháng 11/2022</h2>
                  <a href="./shop">Shop now</a>
               </div>
            </div>
         </div>
         <div class="col-lg-5">
            <div class="banner__item banner__item--middle">
               <div class="banner__item__pic">
                  <img src="/assets/img/shop/vans/vn0a4uuc1ae-4.png">
               </div>
               <div class=" banner__item__text">
                  <h2>Top sản phẩm bán chạy</h2>
                  <a href="./shop">Shop now</a>
               </div>
            </div>
         </div>
         <div class="col-lg-7">
            <div class="banner__item banner__item--last">
               <div class="banner__item__pic">
                  <img src="/assets/img/shop/vans/vn0a4uuc1ae-4.png" alt="">
               </div>
               <div class="banner__item__text">
                  <h2>Giảm giá sốc</h2>
                  <a href="./shop">Shop now</a>
               </div>
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Banner Section End -->

<!-- Product Section Begin -->
<section class="spad">
   <!-- Top bán chạy -->
   <div class="container">
      <div class="row">
         <div class="col-lg-12">
            <ul class="filter__controls">
               <li class="active" data-filter="*">Top Sản phẩm giảm giá</li>
            </ul>
         </div>
      </div>
      <div class="col-lg-12 col-sm-12 spad">
         <div class="row product-item-top-4">
            <c:forEach items="${productList}" var="p">
               <div class="col-lg-4 col-md-3 col-sm-6 product-item">
                  <div class="block product no-border z-depth-2-top z-depth-2--hover">
                     <div class="block-image">
                        <a href="./product-detail?pid=${p.id}">
                           <img src="${p.image}" class="img-center">
                        </a>
                        <span
                                class="product-ribbon product-ribbon-right product-ribbon--style-1 bg-blue text-uppercase">-${p.discount}%</span>
                     </div>
                     <div class="block-body text-center">
                        <h2 class="product__name">
                           <a href="#">
                                 ${p.name}
                           </a>
                        </h2>
                        <p class="product-description">
                              ${p.price}
                        </p>
                        <div class="product-buttons mt-4">
                           <div class="row align-items-center">
                              <div class="col-2">
                                 <button type="button" class="btn-icon" data-toggle="tooltip"
                                         data-placement="top" title=""
                                         data-original-title="Favorite">
                                    <a href="./product-detail?pid=${p.id}"><i
                                            class="fa fa-search"></i></a>
                                 </button>
                              </div>
                              <div class="col-10">
                                 <button type="button"
                                         class="add-to-cart btn btn-block btn-primary btn-circle btn-icon-left">
                                    <a href="./cart?pid=${p.id}&username=${userLogged.username}"><i class="fa fa-shopping-cart"></i>Add to cart </a>
                                 </button>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </c:forEach>
         </div>
      </div>
   </div>
   <!-- Mới ra mắt -->
   <div class="container">
      <div class="row">
         <div class="col-lg-12">
            <ul class="filter__controls">
               <li class="active" data-filter="*">Top Sản Phẩm Mới ra mắt</li>
            </ul>
         </div>
      </div>
      <div class="col-lg-12 col-sm-12 spad">
         <div class="row product-item-discount">
            <c:forEach items="${productListNew}" var="product">
               <div class="col-lg-4 col-md-3 col-sm-6 product-item">
                  <div class="block product no-border z-depth-2-top z-depth-2--hover">
                     <div class="block-image">
                        <a href="./product-detail?pid=${product.id}">
                           <img src="${product.image}" class="img-center">
                        </a>
                        <span
                                class="product-ribbon product-ribbon-right product-ribbon--style-1 bg-blue text-uppercase">Newest</span>
                     </div>
                     <div class="block-body text-center">
                        <h2 class="product__name">
                           <a href="#">
                                 ${product.name}
                           </a>
                        </h2>
                        <p class="product-description">
                              ${product.price}
                        </p>
                        <div class="product-buttons mt-4">
                           <div class="row align-items-center">
                              <div class="col-2">
                                 <button type="button" class="btn-icon" data-toggle="tooltip"
                                         data-placement="top" title=""
                                         data-original-title="Favorite">
                                    <a href="./product-detail?pid=${product.id}"><i
                                            class="fa fa-search"></i></a>
                                 </button>
                              </div>
                              <div class="col-10">
                                 <button type="button"
                                         class="add-to-cart btn btn-block btn-primary btn-circle btn-icon-left">
                                    <a href="./cart?pid=${product.id}&username=${userLogged.username}"><i class="fa fa-shopping-cart"></i>Add to cart </a>
                                 </button>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </c:forEach>
         </div>
      </div>
   </div>
</section>
<!-- Product Section End -->

<!-- Content Section Begin -->
<section class="instagram spad">
   <div class="container">
      <div class="row">
         <div class="col-lg-8">
            <div class="instagram__pic">
               <div class="instagram__pic__item set-bg" data-setbg="/assets/img/instagram/instagram-1.jpg"></div>
               <div class="instagram__pic__item set-bg" data-setbg="/assets/img/instagram/instagram-2.jpg"></div>
               <div class="instagram__pic__item set-bg" data-setbg="/assets/img/instagram/instagram-3.jpg"></div>
               <div class="instagram__pic__item set-bg" data-setbg="/assets/img/instagram/instagram-4.jpg"></div>
               <div class="instagram__pic__item set-bg" data-setbg="/assets/img/instagram/instagram-5.jpg"></div>
               <div class="instagram__pic__item set-bg" data-setbg="/assets/img/instagram/instagram-6.jpg"></div>
            </div>
         </div>
         <div class="col-lg-4">
            <div class="instagram__text">
               <h2>Tại sao nên chọn Somore?</h2>
               <p>Toàn bộ sản phẩm của SoMore đều được thiết kế và sản xuất từ các nghệ nhân đóng giày dày dạn
                  kinh nghiệm nhất. SoMore mong muốn tạo nên những chiếc giày mang nét Việt riêng,
                  nâng tầm đẳng cấp cho giày Việt và thêm nét mạnh mẽ lịch lãm riêng biệt dành cho người sử
                  dụng..</p>
               <h3>#Somore Confession</h3>
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Content Section End -->

<!--  Blog Section Begin -->
<section class="latest spad">
   <div class="container">
   </div>
</section>
<!--  Blog Section End -->
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
   document.getElementById('menu-home').classList.add('active')
</script>

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