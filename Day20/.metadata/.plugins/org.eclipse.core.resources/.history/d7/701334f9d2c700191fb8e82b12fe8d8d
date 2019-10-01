<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="conn"
		driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3307/banking"
		user="root"
		password="root"
	/>
	<sql:query var="accntQuery" dataSource="${conn}">
		select * from accounts where accountNo=?
		<sql:param value="${param.accountNo}"/>
	</sql:query>
	<c:set var="flag" value="0"/>
	<c:forEach var="d" items="${accntQuery.rows}">
		First Name :
		<c:out value="${d.firstName}"/><br/>
		Last Name :
		<c:out value="${d.lastName}"/><br/>
		City :
		<c:out value="${d.city}"/><br/>
		State :
		<c:out value="${d.state}"/><br/>
		Amount :
		<c:out value="${d.amount}"/><br/>
		CheqFacility :
		<c:out value="${d.cheqFacil}"/><br/>
		Account Type :
		<c:out value="${d.accountType}"/><br/>
		<c:set var="flag" value="1"/>
	</c:forEach>
	<c:if test="${flag==0}">
		<c:out value="Account No Not found"/>
	</c:if>
	
</body>
</html>