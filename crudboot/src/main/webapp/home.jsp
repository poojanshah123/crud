<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Create Data
	<form action="addAlien">
	 <input type="text" name="aid"><br/><br/>
	 <input type="text" name="aname"><br/><br/>
	 <input type="submit"><br/><br/>
	</form>
	Read Data
	<form action="getAlien">
	 <input type="text" name="aid"><br/><br/>
	 <input type="submit"><br/><br/>
	</form>
	Delete Data
	<form action="deleteAlien">
	 <input type="text" name="aid"><br/><br/>
	 <input type="submit"><br/><br/>
	</form>
	Update Data
	<form action="updateAlien">
	 <input type="text" name="aid"><br/><br/>
	 <input type="text" name="aname"><br/><br/>
	 <input type="submit"><br/><br/>
	</form>
</body>
</html>