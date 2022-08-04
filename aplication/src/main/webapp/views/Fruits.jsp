
<%@page import="com.example.demo.DbCon"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fruit Shop</title>
<style type="text/css">
body {
 background-image: url("https://th.bing.com/th/id/OIP.Q3uzPlSo9XCK3W-q5m4tGAHaFQ?pid=ImgDet&rs=1");
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
<body>
<%! ResultSet re;
DbCon db;
public void jspInit(){
	db=new DbCon();
}
%>
<% 
re=db.met("toyshop2");
while(re.next()){
 %>
  

<form    action="/shopping/shops"  method="post"  >
<input type="hidden" name="shop"  value="vegshop">
<input type="checkbox"  name=<%=re.getString(1) %> value=<%=re.getString(2) %> >
<%=re.getString(1) %>
<span><img alt="imagnotfound" src=/shopping/img?shopname=toyshop2&name=<%=re.getString(1) %> width="100px" height="100px">
 <% 

}
%></span>
<input type="submit">
	
</form>
</body>
</html>
