
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Login Form</title>
    <link rel="stylesheet" href="css/style1.css">
  </head>
  <body>
   <div class="center">
     <h1>Login</h1>
     <%@include file = "components/message1.jsp" %>
    
     <Form action="LoginServlet" method="post">
     <div class="txt_field">
       <input  name ="username" type="text" required>
       <span></span>
       <label>Email</label>
     </div>
     <div class="txt_field">
       <input  name="password" type="password" required>
       <span></span>
       <label>Password</label>
     </div>
     <div class="pass">Forgot Password?</div>
     <input type="submit" value="Login">
     <div class="signup_link">
       Not a user? <a href="signup.jsp">signup</a>
     </div>
     </form>
   </div>
  </body>
</html>
