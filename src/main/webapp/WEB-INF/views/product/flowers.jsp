<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="crumb_nav">
	<a href="${pageContext.request.contextPath}/home/">home</a> &gt;&gt;
	${Category.catname}
</div>
<div class="title">
	<span class="title_icon"><img
		src="${pageContext.request.contextPath} /resources/images/bullet1.gif"
		alt=""></span>Category products
</div>
<div class="new_products">

<c:forEach var="proCat" items="${CategoryProducts}" >
	<div class="new_prod_box">
		<a href="#">${proCat.prodname}</a>
		<div class="new_prod_bg">
			<a href="${pageContext.request.contextPath}/product/details/${proCat.id}"><img
				src="${pageContext.request.contextPath} /resources/images/${proCat.photo}"
				alt="" class="thumb" border="0"></a>
		</div>
	</div>
</c:forEach>

	<div class="pagination">
		<span class="disabled">&lt;&lt;</span><span class="current">1</span><a
			href="#">2</a><a href="#">3</a>…<a href="#">10</a><a href="#">11</a><a
			href="#">&gt;&gt;</a>
	</div>
</div>
<div class="clear"></div>
