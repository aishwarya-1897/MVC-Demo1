<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student management system</title>
</head>
<body>
     <form:form action="saveUpdatedStudent" modelAttribute="student">
     <form:input path="studentId" readonly="true"/>
     <form:input path="studentName" />
     <form:input path="studentPhNo"/>
     <input type="submit" value="update">
     
     </form:form>
</body>
</html>