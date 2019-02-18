<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>

    
      <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath} /resources/images/bullet1.gif" alt=""></span>Register</div>
      <div class="feat_prod_box_details">
        <p class="details"> Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud. </p>
        <div class="contact_form">
          <div class="form_subtitle">create new account</div>
          <s:form method="post" modelAttribute="acc" action="${pageContext.request.contextPath}/account/register">
          
            <div class="form_row">
              <label class="contact"><strong>Username:</strong></label>
              <s:input class="contact_input"  path="username" />
            </div>
            <div class="form_row">
              <label class="contact"><strong>Password:</strong></label>
              <s:input class="contact_input"  path="password" />
            </div>
            <div class="form_row">
              <label class="contact"><strong>Email:</strong></label>
             <s:input class="contact_input"  path="email" />
            </div>
            <div class="form_row">
              <label class="contact"><strong>Phone:</strong></label>
              <s:input class="contact_input"  path="phone" />>
            </div>
            <div class="form_row">
              <label class="contact"><strong>Address:</strong></label>
             <s:input class="contact_input"  path="address" />
            </div>
            
            <div class="form_row">
              <div class="terms">
                <input name="terms" type="checkbox">
                I agree to the <a href="#">terms &amp; conditions</a> </div>
            </div>
            <div class="form_row">
              <input class="register" value="register" type="submit">
            </div>
          </s:form>
        </div>
      </div>
      <div class="clear"></div>
    