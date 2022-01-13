<%
   String errormsg =(String) session.getAttribute("ErrorLoginMsg");

  if(errormsg!=null){
	//out.print(msg);
	
	
	%>
	
	<div align="center" class="alert alert-warning" role="alert">
  <%= errormsg %>
</div>
<%
session.removeAttribute("errormassege");	  
	  
  }





%>