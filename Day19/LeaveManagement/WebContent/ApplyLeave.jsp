<%@page import="com.hcl.ems.EmployeeBaL"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.hcl.ems.LeaveHistory"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function cancel() {
		document.getElementById("startdate").value = "";
		document.getElementById("enddate").value = "";
		document.getElementById("days").value = "";
		document.getElementById("leavereason").value = "";
	}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
	<center><br><br><br><br><br><br>
		<table bgcolor="green" style="color : yellow;" >
			<tr>
				<td >Start Date :</td>
				<td><input type = "date" name = "startdate" id = "startdate"/></td> 
			</tr>
			<tr>
				<td>End Date :</td>
				<td><input type = "date" name = "enddate" id = "enddate"/></td>
			</tr>
			<tr>
				<td>Number Of Days :</td>
				<td><input type = "number" name = "days" id = "days"/></td>
			</tr>
			<tr>
				<td>Leave Type :</td>
				<td><select name = "leavetype">
					<option value = "EL" >Earned Leave</option>
					<option value = "restricted" >Restricted Leave</option>
				</select></td>
				
			</tr>
			<tr>
				<td>Leave Reason :</td>
				<td><input type = "text" name = "leavereason" id = "leavereason"/></td>
			</tr>
			<tr>
				<td><a href="DashBoard.jsp" ><input type = "button" value = "Back to DashBoard" /></a></td>
				<td><input type = "button" value = "Cancel" onclick = "cancel()"/></td>
			</tr>	
			<tr>
				<td><center><input type = "submit" value = "Apply" /></center></td>
			</tr>
		</table>
	</center>
</form>


	<% 
	String EMP_ID  = (String)session.getAttribute("EMP_ID");
	if(request.getParameter("leavereason") != null){
		LeaveHistory obj = new LeaveHistory();
		obj.setEMP_ID(Integer.parseInt(EMP_ID));
		obj.setLEA_STATUS("PENDING");
		obj.setLEA_MGR_COMMENTS("null");
		obj.setLEA_START_DATE(request.getParameter("startdate"));
		obj.setLEA_END_DATE(request.getParameter("enddate"));
		obj.setLEA_TYPE(request.getParameter("leavetype"));
		obj.setLEA_REASON(request.getParameter("leavereason"));
		%><%=EmployeeBaL.applyLeaveBal(obj)%><%
	}
	%> 

</body>
</html>