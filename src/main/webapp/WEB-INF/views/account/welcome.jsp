<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     
      <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath} /resources/images/bullet1.gif" alt=""></span>My account</div>
      <div class="feat_prod_box_details">
       Welcome  <B>${sessionScope.username}</B> 
       
       <a href="${pageContext.request.contextPath}/account/logout"> <p style="color:red">Logout</p> </a>
      </div>
      <div class="clear"></div>
    