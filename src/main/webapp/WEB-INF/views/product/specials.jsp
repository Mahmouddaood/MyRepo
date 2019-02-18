<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

     
      <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath} /resources/images/bullet1.gif" alt=""></span>Special gifts</div>
      
      <c:forEach var="specialPro"  items="${SpecialProducts}">
      
      <div class="feat_prod_box">
        <div class="prod_img"><a href="${pageContext.request.contextPath}/product/details/${specialPro.id}"><img src="${pageContext.request.contextPath} /resources/images/${specialPro.photo}" alt="" border="0"></a></div>
        <div class="prod_det_box"> <span class="special_icon"><img src="${pageContext.request.contextPath} /resources/images/special_icon.gif" alt=""></span>
          <div class="box_top"></div>
          <div class="box_center">
            <div class="prod_title">${specialPro.prodname}</div>
            <p class="details">${specialPro.describation}</p>
            <a href="${pageContext.request.contextPath}/product/details/${specialPro.id}" class="more">- more details -</a>
            <div class="clear"></div>
          </div>
          <div class="box_bottom"></div>
        </div>
        <div class="clear"></div>
      </div>
     
     </c:forEach>
      
      <div class="pagination"> <span class="disabled">&lt;&lt;</span><span class="current">1</span><a href="#">2</a><a href="#">3</a>…<a href="#">10</a><a href="#">11</a><a href="#">&gt;&gt;</a> </div>
      <div class="clear"></div>
    