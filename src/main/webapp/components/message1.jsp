<%
   String errormsg =(String) session.getAttribute("errormassege");

  if(errormsg!=null){
	//out.print(msg);
	
	
	%>
	
	<div class="alert alert-warning" role="alert">
  <%= errormsg %>
</div>
<%
session.removeAttribute("errormassege");	  
	  
  }





%>