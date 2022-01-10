<%
   String msg =(String) session.getAttribute("massege");

  if(msg!=null){
	//out.print(msg);
	
	
	%>
	
	<div class="alert alert-success" role="alert">
  <%= msg %>
</div>
<%
session.removeAttribute("massege");	  
	  
  }





%>