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
   <title>Somore | Blogs</title>

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

<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-option">
   <div class="container">
      <div class="row">
         <div class="col-lg-12">
            <div class="breadcrumb__text">
               <h4>Shop</h4>
               <div class="breadcrumb__links">
                  <a href="${pageContext.request.contextPath}/index.html">Home</a>
                  <span>Blog</span>
               </div>
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Breadcrumb Section End -->

<!-- Blog Details Section Begin -->
<section class="blog-details spad">
   <div class="container">
      <div class="row d-flex justify-content-center">
         <div class="col-lg-12">
            <div class="blog__details__pic">
               <img src="assets/img/shop/blog.jpg" alt="">
            </div>
         </div>
         <div class="col-lg-8">
            <div class="blog__details__content">
               <div class="blog__details__text">
                  <b>Lựa chọn đôi giày phù hợp với dáng người sẽ giúp che đi những khuyết điểm về vóc dáng.Hơn
                     nữa còn tôn lên vẻ đẹp cơ thể và làm hoàn thiện hơn phong cách của bạn.</b>
                  <p>Giày dép! Một phần tôi yêu thích nhất trong tất cả các loại thời trang. Là thứ trung
                     thành nhất trong tủ đồ đạc của tôi. Tôi không phải lo lắng nếu tôi ăn quá nhiều vì chúng
                     vẫn ở lại với tôi chứ không bị chật rồi rời bỏ thôi như lũ quần áo. Bây giờ tôi sẽ hướng
                     dẫn các bạn cách kết hợp kiểu giày với dáng người nhé:
                     <br>
                     <b>Dáng đồng hồ cát</b>
                  </p>Giày đi với dáng đồng hồ cát thì vô vàn lựa chọn. Không chỉ đơn thuần là những đôi cao
                  gót đơn điệu hay sneaker bình thường. Với dáng này bạn có thể đeo giày mũi nhọn, giày đế
                  xuồng, giày đế độn hoặc sandal ankle trap (sandal có quai quanh cổ chân). Nhưng nếu bạn
                  không cao, thì bạn nên tránh ankle trap vì nó sẽ làm cho bạn trông thấp hơn. Còn nếu bạn
                  đã cao thì vô tư đi!!! Dáng đồng hồ cát có thể kết hợp với boot cao cổ (tới đầu gối)
                  nhưng nên tránh giày đế thô. Thân hình bạn đã vốn cân bằng, mang giày đế thô sẽ làm bạn
                  trông nặng nề phần dưới.</p>
               </div>
               <!-- <div class="blog__details__quote">
                   <i class="fa fa-quote-left"></i>
                   <p>“When designing an advertisement for a particular product many things should be
                       researched like where it should be displayed.”</p>
                   <h6>_ John Smith _</h6>
               </div>
               <div class="blog__details__text">
                   <p>Vyo-Serum along with tightening the skin also reduces the fine lines indicating aging of
                       skin. Problems like dark circles, puffiness, and crow’s feet can be control from the
                       strong effects of this serum.</p>
                   <p>Hydroderm is a multi-functional product that helps in reducing the cellulite and giving
                       the body a toned shape, also helps in cleansing the skin from the root and not letting
                       the pores clog, nevertheless also let’s sweeps out the wrinkles and all signs of aging
                       from the sensitive near the eyes.</p>
               </div> -->
            </div>
         </div>
      </div>
   </div>
</section>
<!-- Blog Details Section End -->

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