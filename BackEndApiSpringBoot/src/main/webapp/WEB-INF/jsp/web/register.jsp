<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
         isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Đăng nhập/Đăng ký</title>
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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/authentication.css">
</head>
<body>
<!-- Header Section Begin-->
<jsp:include page="header.jsp" />
<!-- Header Section End -->
<div class="wrapper">
    <div class="cont">
        <form class="form sign-up" method="post" action="register">
            <h2 id="tilte-h2">ĐĂNG KÝ TÀI KHOẢN</h2>
            <div class="input-control">
                <input name="fullName" id="nameRe" type="text"
                       placeholder="Họ và tên" />
            </div>
            <div class="input-control">
                <input name="usernameNew" id="usernameR" type="text"
                       placeholder="Tên đăng nhập" />
            </div>
            <div class="input-control">
                <input name="email" id="email" type="text"
                       placeholder="Email" />
            </div>
            <div class="input-control">
                <input name="phone" id="phone" type="text"
                       placeholder="Số điện thoại" />
            </div>
            <div class="input-control">
                <input name="passwordNew" id="passwd" type="password"
                       placeholder="Mật khẩu" />
            </div>
            <div class="input-control radio">
						<span> <input type="radio" name="gender" id="gender-male"
                                      value="Name"> <label for="gender-male">Nam</label>
						</span> <span> <input type="radio" name="gender"
                                              id="gender-female" value="Nữ"> <label for="gender-female">Nữ</label>
						</span> <span> <input type="radio" name="gender"
                                              id="gender-others" value="Khác"> <label
                    for="gender-others">Khác</label>
						</span>
            </div>
            <%-- <p class="message-text-fail">${messageRegisterFail}</p> --%>
            <p class="message-text-success">${messageRegisterSuccess}</p>
            <button type="submit" class="submit">Đăng ký</button>
        </form>
        <div class="sub-cont">
            <div class="img">
                <div class="img__text m--up">
                    <h2>One of us?</h2>
                    <p>Nếu bạn đã có tài khoản,vui lòng đăng nhập tại đây!</p>
                </div>
                <a href="./login">
                    <div class="img__btn">
                        <span class="m--up">Đăng nhập</span> <span class="m--in">Đăng
							nhập</span>
                    </div>
                </a>
            </div>
        </div>
    </div>
</div>
<!-- Footer Section Begin -->
<jsp:include page="footer.jsp" />
<!-- Footer Section End -->
<%--<script>--%>
<%--    window.addEventListener('load', () => {--%>
<%--        document.querySelector('.img__btn').addEventListener('click', function() {--%>
<%--            document.querySelector('.cont').classList.toggle('s--signup');--%>
<%--        });--%>
<%--    })--%>
</script>
</body>
</html>
