<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Male_Fashion Template">
    <meta name="keywords" content="Male_Fashion, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Somore | Shop</title>

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
<jsp:include page="header.jsp"/>
<!-- Header Section End -->

<!-- Breadcrumb Section Begin -->
<section class="breadcrumb-option">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb__text">
                    <h4>Shop</h4>
                    <div class="breadcrumb__links">
                        <a href="./home">Home</a>
                        <span>Shop</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Breadcrumb Section End -->

<!-- Shop Section Begin -->
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
<section class="shop spad">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <div class="shop__sidebar">
                    <div class="shop__sidebar__search">
                        <form action="/shop">
                            <input type="text" placeholder="Tìm sản phẩm..." id="searchinput" name = "search">
                            <button type="submit"><span class="icon_search"></span></button>
                        </form>
                    </div>
                    <div class="shop__sidebar__accordion">
                        <div class="accordion" id="accordionExample">
                            <div class="card">
                                <div class="card-heading">
                                    <a data-toggle="collapse" data-target="#collapseOne">Nhãn hiệu</a>
                                </div>
                                <div id="collapseOne" class="collapse show" data-parent="#accordionExample">
                                    <div class="card-body">
                                        <div class="shop__sidebar__categories">
                                            <ul class="nice-scroll">
                                                <c:forEach items="${brandlist}" var="o">
                                                    <li><a href="/shop?brandname=${o.getName()}">${o.getName()}</a></li>
                                                </c:forEach>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="card">
                                <div id = "sortcategory" class="card-heading">
                                    <a data-toggle="collapse" data-target="#collapseTwo">Loại giày</a>
                                </div>
                                <div id="collapseTwo" class="collapse show" data-parent="#sortcategory">
                                    <div class="card-body">
                                        <div class="shop__sidebar__price">
                                            <ul class="nice">
                                                <li><a href="/shop?category=Men">Giày Nam</a></li>
                                                <li><a href="/shop?category=Women">Giày Nữ</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            
                            <div class="card">
                                <div id = "sortprice" class="card-heading">
                                    <a data-toggle="collapse" data-target="#collapseThree">Giá sản phẩm</a>
                                </div>
                                <div id="collapseThree" class="collapse show" data-parent="#sortprice">
                                    <div class="card-body">
                                        <div class="shop__sidebar__price">
                                            <ul class="nice">
                                                <li><a href="/shop?sort=inc">Từ thấp đến cao</a></li>
                                                <li><a href="/shop?sort=dec">Từ cao đến thấp</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-9">
                <div class="shop__product__option">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="shop__product__option__left">
                                <p>Sản phẩm</p>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6">
                            <div class="shop__product__option__right">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row product-item-all">
                    <c:forEach items="${allproduct}" var="p">
                        <div class="col-lg-4 col-md-3 col-sm-6 product-item">
                            <div class="block product no-border z-depth-2-top z-depth-2--hover">
                                <div class="block-image">
                                    <a href="./product-detail?pid=${p.getId()}">
                                        <img src="${p.getImage()}" class="img-center">
                                    </a>
              
                                    <span
                                            class="product-ribbon product-ribbon-right product-ribbon--style-1 bg-blue text-uppercase">${p.getDiscount()}%</span>
                                    
                                </div>
                                <div class="block-body text-center">
                                    <h2 class="product__name">
                                        <a href="#">
                                                ${p.getName()}
                                        </a>
                                    </h2>
                                    <p class="product-description">
                                            ${p.getPrice()} VNĐ
                                    </p>
                                    <div class="product-buttons mt-4">
                                        <div class="row align-items-center">
                                            <div class="col-2">
                                                <button type="button" class="btn-icon" data-toggle="tooltip"
                                                        data-placement="top" title=""
                                                        data-original-title="Favorite">
                                                    <a href="./product-detail?pid=${p.getId()}"><i
                                                            class="fa fa-search"></i></a>
                                                </button>
                                            </div>
                                            <div id = "button cart" class="col-10">
                                                 <button type="button"
                                                        class="add-to-cart btn btn-block btn-primary btn-circle btn-icon-left">
                                                    <a href="./cart?pid=${p.getId()}&username=${userLogged.username}">
                                                    <i class="fa fa-shopping-cart"></i>
                                                    Add to cart
                                                    </a>
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="product__pagination">
                            <a class="active" href="#">1</a>
                            <a href="#">2</a>
                            <a href="#">3</a>
                            <span>...</span>
                            <a href="#">21</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Shop Section End -->

<!-- Footer Section Begin -->
<jsp:include page="footer.jsp"/>
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
    document.getElementById('menu-shop').classList.add('active')
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