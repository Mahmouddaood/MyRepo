<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>





<div class="crumb_nav">
	<a href="${pageContext.request.contextPath} /home/">home</a> &gt;&gt;
	${Product.prodname}
</div>
<div class="title">
	<span class="title_icon"><img
		src="${pageContext.request.contextPath} /resources/images/bullet1.gif"
		alt=""></span>${Product.prodname}
</div>
<div class="feat_prod_box_details">
	<div class="prod_img">
		<a href="${pageContext.request.contextPath} /product/details/${Product.id}"><img
			src="${pageContext.request.contextPath} /resources/images/${Product.photo}"
			alt="" border="0"></a> <br> <br> <a
			href="${pageContext.request.contextPath} /resources/images/big_pic.jpg"
			rel="lightbox"><img
			src="${pageContext.request.contextPath} /resources/images/zoom.gif"
			alt="" border="0"></a>
	</div>
	<div class="prod_det_box">
		<div class="box_top"></div>
		<div class="box_center">
			<div class="prod_title">Details</div>
			<p class="details">
				${Product.describation}
			</p>
			<div class="price">
				<strong>PRICE:</strong> <span class="red">${Product.price} $</span>
			</div>
			<div class="price">
				<strong>COLORS:</strong> <span class="colors"><img
					src="${pageContext.request.contextPath} /resources/images/color1.gif"
					alt="" border="0"></span> <span class="colors"><img
					src="${pageContext.request.contextPath} /resources/images/color2.gif"
					alt="" border="0"></span> <span class="colors"><img
					src="${pageContext.request.contextPath} /resources/images/color3.gif"
					alt="" border="0"></span>
			</div>
			<a href="${pageContext.request.contextPath} /cart/buy/${Product.id}" class="more"><img
				src="${pageContext.request.contextPath} /resources/images/order_now.gif"
				alt="" border="0"></a>
			<div class="clear"></div>
		</div>
		<div class="box_bottom"></div>
	</div>
	<div class="clear"></div>
</div>
<div id="demo" class="demolayout">
	<ul id="demo-nav" class="demolayout">
		<li><a class="" href="#tab1">More details</a></li>
		<li><a class="active" href="#tab2">Related Products</a></li>
	</ul>
	<div class="tabs-container">
		<div style="display: block;" class="tab" id="tab1">
			<p class="more_details"> ${Product.describation} </p>
			
			<!-- Related -->
			<div  class="tab" id="tab2">
		<c:forEach var="relatedPro"  items="${RelatedProducts}">
			<div class="new_prod_box">
				<a href="${pageContext.request.contextPath} /product/details/${relatedPro.id}">${relatedPro.prodname}</a>
				<div class="new_prod_bg">
					<a href="${pageContext.request.contextPath} /product/details/${relatedPro.id}"><img
						src="${pageContext.request.contextPath} /resources/images/${relatedPro.photo}"
						alt="" class="thumb" border="0"></a>
				</div>
			</div>
			
</c:forEach>
			<div class="clear"></div>
		</div>
			
		</div>
		
		
		<div style="display: none;" class="tab" id="tab2">
		<c:forEach var="relatedPro"  items="${RelatedProducts}"></c:forEach>
			<div class="new_prod_box">
				<a href="${pageContext.request.contextPath} /product/details/${relatedPro.id}">${relatedPro.prodname}</a>
				<div class="new_prod_bg">
					<a href="${pageContext.request.contextPath} /product/details/${relatedPro.id}"><img
						src="${pageContext.request.contextPath} /resources/images/${relatedPro.prodname}"
						alt="" class="thumb" border="0"></a>
				</div>
			</div>
			

			<div class="clear"></div>
		</div>
	</div>
</div>
<div class="clear"></div>

