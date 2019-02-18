<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="title">
	<span class="title_icon"><img src="${pageContext.request.contextPath} /resources/images/bullet1.gif" alt=""></span>My
	cart
</div>
<div class="feat_prod_box_details">
	<table class="cart_table">
		<tbody>
			<tr class="cart_title">
			    <td>Option</td>
				<td>Item pic</td>
				<td>Product name</td>
				<td>Unit price</td>
				<td>Qty</td>
				<td>Total</td>
			</tr>
			<c:set var="total" value="0" ></c:set>
			<c:forEach  varStatus="i"   var="item"  items="${sessionScope.cart}" >
			<c:set var="total" value=" ${ total + item.quantity * item.product.price} " ></c:set>
			<tr>
			
                <td><a href="${pageContext.request.contextPath}/cart/remove/${i.index}"> X </a></td>			
				<td><a href="#"><img width="30"  src="${pageContext.request.contextPath} /resources/images/${item.product.photo}" alt=""
						border="0" class="cart_thumb"></a></td>
				<td>${item.product.prodname}</td>
				<td>${item.product.price}$</td>
				<td>${item.quantity}</td>
				<td>${item.quantity * item.product.price}$</td>
			</tr>
			
			</c:forEach>
			<tr>
				<td colspan="4" class="cart_total"><span class="red">TOTAL
						SHIPPING:</span></td>
				<td>325$</td>
			</tr>
			<tr>
				<td colspan="4" class="cart_total"><span class="red">TOTAL:</span></td>
				<td>${total}$</td>
			</tr>
		</tbody>
	</table>
	<a href="${pageContext.request.contextPath} /home/" class="continue">&lt; continue</a> <a href="#"
		class="checkout">checkout &gt;</a>
</div>
<div class="clear"></div>
