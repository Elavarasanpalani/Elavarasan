<%@page import="java.util.Enumeration"%>
<h1>  Welcome to invoice</h1>
<% 
Enumeration<String> enu=session.getAttributeNames();
while(enu.hasMoreElements()){
	String a=enu.nextElement().toString();
	String b=session.getAttribute(a).toString();
	
	if(a.equals("shop")){
		
	}
	else{
		out.println("<h1>" +a +":"+b+"</h1>");
	}
	
}

%>