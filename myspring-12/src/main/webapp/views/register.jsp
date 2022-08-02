<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1> WELCOME TO REGISTER</h1>

<form:form  action="/moon/go"   method="POST"  modelAttribute="user">

UserName:<form:input type="text" path="uname"/><br>
PassWord:<input type="password" name="upass"/><br>
City:<form:input type="text" path="ucity"/><br>
Phone:<form:input path="uphone"/><br>
image:<form:input type="file" path="img"/><br>
Address:<form:input type="text" path="uaddress"/><br>
Email:<form:input type="text"  path="email"/><br>
<input type="submit" value="click...">


</form:form>