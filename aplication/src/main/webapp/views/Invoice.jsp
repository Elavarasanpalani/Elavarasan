<%@page import="java.util.Enumeration"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>succesfull</title>
<style type="text/css">
body {
 background-image: url("https://th.bing.com/th/id/OIP.NEkd9kHqgBbDx0KbLimS-QHaFj?pid=ImgDet&rs=1");
  text-align: center; }
 .heading{
 color: white;
 font-size: 300%;
 }
 .reg{	
 float: right; }
 .log{
 float: right; }
 input{
  background-color: green;
  color: white;
 }
</style>
</head>
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