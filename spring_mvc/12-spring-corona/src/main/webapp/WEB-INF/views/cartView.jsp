<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet" />
    <link href="https://fonts.googleapis.com/css?family=Material+Icons|Material+Icons+Outlined|Material+Icons+Two+Tone|Material+Icons+Round|Material+Icons+Sharp" rel="stylesheet" />
    <link rel="stylesheet" href="css/reset.css" />
    <link rel="stylesheet" href="css/layout.css" />
    <link rel="stylesheet" href="css/cartView.css" />
    <script src="js/gsap/gsap.min.js"></script>
    <script src="js/axios.min.js"></script>
    <script src="js/jquery-3.6.0.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script src="js/cartView.js" defer></script>
  </head>
  <body>
    <div id="wrap">
      <header>
        <div class="logo">
          <a href=""><img src="image/layout/sampleLogo.png" alt="" /></a>
        </div>
      </header>
      <section id="cart">
        <section class="cartTitle">
          <div class="cartIcon">
            <span class="material-icons-outlined">shopping_cart</span>
            <p>장바구니</p>
          </div>
          <div class="cartStep">
            <div class="stepNum">
              <p>01 옵션선택</p><span class="material-icons stepArrow">arrow_forward_ios</span>
              <p><Strong>02 </Strong>장바구니</p><span class="material-icons stepArrow">arrow_forward_ios</span>
              <p>03 주문/결제</p><span class="material-icons stepArrow">arrow_forward_ios</span>
              <p>04 주문완료</p>
            </div>
          </div>
        </section>
        <div class="cartContent">
          <div class="tabsWrap">
            <div class="cartTabs">
              <span>일반구매</span>
              <span>정기배송</span>
            </div>
          </div>
        </div>
      </section>
    </div>
  </body>
</html>
