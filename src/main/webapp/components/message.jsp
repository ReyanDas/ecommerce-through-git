<%
   String msg =(String) session.getAttribute("massege");

  if(msg!=null){
	//out.print(msg);
	
	
	%>
	
	<div  align="center" class="alert alert-success" role="alert" >
  <%= msg %>
</div>
<%
session.removeAttribute("massege");	  
	  
  }





%>