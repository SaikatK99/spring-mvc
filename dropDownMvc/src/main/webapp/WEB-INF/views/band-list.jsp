<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
<title>Bands Page</title>
</head>

<body>
<label>Select Your Band: </label>
<br><br>
<form:form action="bandList" modelAttribute="band">
	<form:select path="bands">
		
		<form:options items="${band.bandName}"/>
		
	</form:select>
	<br><br>
	<input type="submit" value="Submit">
	
</form:form>
</body>

</html>