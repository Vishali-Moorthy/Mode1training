<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<form method="get" action="CreateInventory.jsp">
		<center>
			Item Name:
				<input type="text" name="itemname"/><br/><br/>
			Price:
				<input type="text" name="price"/><br/><br/>
			Quantity Available:
				<input type="text" name="quantityavail"/><br/><br/>
				<input type="submit" value="Create"/>
		</center>
	</form>
</body>
</html>