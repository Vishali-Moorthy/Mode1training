<%@page import="com.hcl.hib.RoomStatus"%>
<%@page import="com.hcl.hib.HotelCRUD"%>
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
	HotelCRUD c=new HotelCRUD();
	String roomId=c.generateRoomid();
	session.setAttribute("roomId", roomId);
%>
<form method="post" action="roomSatus.jsp">
	Room Id :
		<input type="text" name="roomId" value="<%=roomId %>" readonly="readonly"/><br/><br/>
	Type :
		<select name="type">
			<option value="Single">Single</option>
			<option value="Double">Double</option>
		</select>
	Cost/Day :
		<input type="text" name="costperday"/><br/><br/>
		<input type="submit" value="Room Booked"/>
	<%
		if(request.getParameter("roomId") != null && 
			request.getParameter("type") != null &&
			request.getParameter("costperday") != null) {
					RoomStatus e=new RoomStatus();
					e.setCostperday(Integer.parseInt(request.getParameter("costperday")));
					e.setRoomId(request.getParameter("roomId"));
					e.setType(request.getParameter("type"));
					
					HotelCRUD crud=new HotelCRUD();
					out.println(crud.generateRoomid());
				}
        
	%>
</form>
</body>
</html>