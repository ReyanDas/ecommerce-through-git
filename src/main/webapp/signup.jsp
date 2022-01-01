<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
<%@include file ="components/common_css_js.jsp" %>
</head>
<body>
<%@include file = "components/Navbar.jsp" %>

<div class = "container-fluid">

<div class = "row mt-5" >
<div class = "col-md-4 offset-md-4">

<div class = "card">
<div class = "card-body px-5">
<center>
<img  src="https://img.icons8.com/color/48/000000/edit-user-male--v1.png"/">
</center>


<h3 class="text-center my-4">Sign Up Here</h3>

<form action="RegisterServlet" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1" class="form-label">Name</label>
    <input name="userName" type="text" class="form-control" id="userName" placeholder="enter name">
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1" class="form-label" >Email</label>
    <input name="userEmail" type="email" class="form-control" id="userEmailAddress" placeholder="enter email">
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1" class="form-label" >Password</label>
    <input name="userPassword" type="password" class="form-control" id="userPassword" placeholder="enter password">
  </div>

  <div class="form-group">
    <label for="exampleInputEmail1" class="form-label" >Number</label>
    <input name="userNumber" type="number" class="form-control" id="userNumber" placeholder="enter email">
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1" class="form-label" >Address</label>
    <textarea name="userAddres" style="height:150px" class="form-control" placeholder="enter address"></textarea>
  </div>
  <br>
  
  <div class="container text-center">
  <button class="btn btn-outline-success">Submit</button>
  <button class="btn btn-outline-warning">Cancel</button>
  </div>

</form>



</div>

</div>
</div>


</div>



</div>

</body>
</html>