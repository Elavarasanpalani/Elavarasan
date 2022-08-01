<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1> WELCOME TO REGISTER</h1>

<form:form action="/moon/green3" method="POST" modelAttribute="user">

UserName:<form:input type="text" path="kname"/><br>
	PassWord:<input type="password" name="pass1"/><br>
	Re-Enter PassWord:<input type="password" name="pass2"/><br>
	Age:<form:input type="number" path="kage"/><br>
	Phone:<form:input path="kmobilenumber"/><br>
	Address:<form:input type="text" path="kaddress"/><br>
	City:<form:input type="text" path="kcity"/><br>
	image:<form:input type="file" path="kimage"/><br>
	<input type="submit" value="click...">


</form:form>




	