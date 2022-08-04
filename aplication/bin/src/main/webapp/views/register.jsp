<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<<script type="text/javascript">
window.alert("please enter valid details..!")
</script>
<form:form  action="/shopping/reg" method="post" modelAttribute="obj">
		
		UserName:<form:input type="text" path="username" /><br>
		<form:errors style="color :red" type="text" path="username"></form:errors></br>
		
		Password:<input type="password" name="password"/><br>	
		
		
		Re-Enter PassWord:<input type="password" name="password2"/><br>
		<form:errors style="color :red" type="password" path="password"></form:errors></br>	
		
		Email:<form:input type="email" path="email"/><br>
		<form:errors style="color :red" type="email" path="email"></form:errors></br>	
		
		City:<form:input type="text" path="city"/><br>
		<form:errors style="color :red" type="text" path="city"></form:errors></br>
		
		Address:<form:input type="text" path="address"/><br>
		<form:errors style="color :red" type="text" path="address"></form:errors></br>
		
		Phone:<form:input path="phonenumber"/><br>		
		<form:errors style="color :red" type="number" path="phonenumber"></form:errors></br>	
		
		Image:<form:input type="file" path="image"/><br>	
		<form:errors style="color :red" type="file" path="image"></form:errors></br>
	
		<input type="Submit" value="click"><br>
		</form:form>