<!DOCTYPE html>
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
body {
 background-image: url("https://th.bing.com/th/id/OIP.zvfaLpU0D0Nu4eBaB9dPOAHaGF?pid=ImgDet&rs=1");
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
<%! ResultSet re;
DbCon db;
public void jspInit(){
	db=new DbCon();
}
%>
<%
re=db.met("toyshop3");
while(re.next()){
 %>
<form    action="/shopping/shops"  method="post"  >
<input type="hidden" name="shop"  value="Invoice">
<input type="checkbox"  name=<%=re.getString(1) %> value=<%=re.getString(2) %> >
<%=re.getString(1) %>
<span><img alt="imagnotfound" src=/shopping/img?shopname=toyshop3&name=<%=re.getString(1) %> width="100px" height="100px">
 <% 

}
%></span>
<input type="submit">

</form>