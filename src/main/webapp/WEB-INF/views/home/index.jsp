<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="title">
	<span class="title_icon"><img
		src="${pageContext.request.contextPath} /resources/images/bullet1.gif"
		alt=""></span>Featured products
</div>


 <c:forEach var="FeatPro" items="${FeaturedProducts}">

	<div class="feat_prod_box">
		<div class="prod_img">
			<a href="${pageContext.request.contextPath}/product/details/${FeatPro.id}"><img
				src="${pageContext.request.contextPath} /resources/images/${FeatPro.photo}"
				alt="" border="0"></a>
		</div>
		<div class="prod_det_box">
			<div class="box_top"></div>
			<div class="box_center">
				<div class="prod_title">${FeatPro.prodname}</div>
				<p class="details"> ${FeatPro.describation} </p> 
				<a href="${pageContext.request.contextPath}/product/details/${FeatPro.id}" class="more">- more details -</a>
				<div class="clear"></div>
			</div>
			<div class="box_bottom"></div>
		</div>
		<div class="clear"></div>
	</div>

</c:forEach> 


<div class="title">
	<span class="title_icon"><img
		src="${pageContext.request.contextPath} /resources/images/bullet2.gif"
		alt=""></span>New products
</div>
<div class="new_products">


<c:forEach var="NewPro" items="${NewProducts}">

	<div class="new_prod_box">
		<a href="${pageContext.request.contextPath}/product/details/${NewPro.id}">${NewPro.prodname}</a>
		<div class="new_prod_bg">
			<span class="new_icon"><img
				src="${pageContext.request.contextPath} /resources/images/new_icon.gif"
				alt=""></span> <a href="${pageContext.request.contextPath}/product/details/${NewPro.id}"><img
				src="${pageContext.request.contextPath} /resources/images/${NewPro.photo}"
				alt="" class="thumb" border="0"></a>
		</div>
	</div>
	</c:forEach>
	
</div>
<div class="clear"></div>
