<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.flex-container{
display: flex;
}

.flex-container>div{
margin:10px;
padding:20px;
font-size:20px;
background-color:turquoise;
}
.flex-container>div1{
margin:10px;
padding:20px;
font-size:20px;
width:100%;
display: flex;
flex-direction:column;
background-color:turquoise;
}
.flex-container>div2{
margin:10px;
padding:20px;
font-size:20px;
width:100%;
display: flex;
flex-direction:column;
background-color:turquoise;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><center><b>Employee Dashboard : Sections</center></b></h1>
<div class="flex-container">
<div><center><b>My Details</b></center>
<jsp:include page="MyDetails.jsp"/>
</div>
<div><center><b>My Manager's Detail</b></center>
<jsp:include page="MyManager.jsp"/>
</div>
</div>

<div1 class="flex-container">
<div1><center>
<a href="MyLeave.jsp">My Leave Application</a></center>
</div1>
</div1>

<div2 class="flex-container">
<div2><center>
<a href="EmployPendingLeave.jsp">My Reporting Employee's Pending Leave Application Section</a></center>
</div2>
</div2>
</body>
</html>