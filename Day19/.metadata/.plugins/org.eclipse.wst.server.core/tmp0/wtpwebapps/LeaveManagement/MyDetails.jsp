<%@page import="com.hcl.ems.Employee"%>
<%@page import="com.hcl.ems.EMSDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	int EMP_ID=Integer.parseInt((String)session.getAttribute("user"));
	EMSDao dao=new EMSDao();
	Employee obj=dao.EmployeeDetails(EMP_ID);
	out.println("Employee Id :  " +obj.getEMP_ID()+"<br/>"); 
	out.println("Full Name :  " +obj.getEMP_NAME()+"<br/>");
	out.println("Email Address:  " + obj.getEMP_EMAIL()+"<br/>");
	out.println("Mobile No:  " +obj.getEMP_MOB_NO()+"<br/>");
	out.println("Date joined : " +obj.getEMP_DATE_JOINED()+"<br/>");
	out.println("Department:  " +obj.getEMP_DPT_NAME()+"<br/>");
	out.println("Available leave balance: " +obj.getEMP_LEAVE_BALANCE()+"<br/>");
%>

</body>
</html>