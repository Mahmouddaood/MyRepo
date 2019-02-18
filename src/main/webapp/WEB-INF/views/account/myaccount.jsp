<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     
      <div class="title"><span class="title_icon"><img src="${pageContext.request.contextPath} /resources/images/bullet1.gif" alt=""></span>My account</div>
      <div class="feat_prod_box_details">
        <p class="details"> ${msg} </p>
        <div class="contact_form">
          <div class="form_subtitle">login into your account</div>
          
          
          <form   action="${pageContext.request.contextPath}/account/myaccount" method="post" >  
            <div class="form_row">
              <label class="contact"><strong>Username:</strong></label>
              <input class="contact_input" type="text" name="username" >
            </div>
            <div class="form_row">
              <label class="contact"><strong>Password:</strong></label>
              <input class="contact_input" type="text" name="password">
            </div>
            <div class="form_row">
              <div class="terms">
                <input name="terms" type="checkbox">
                Remember me </div>
            </div>
            <div class="form_row">
              <input class="register" value="login" type="submit">
            </div>
          </form>
        </div>
      </div>
      <div class="clear"></div>
    