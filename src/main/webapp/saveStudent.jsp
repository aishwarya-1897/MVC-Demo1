
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="x" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student_managment_system</title>
</head>
<body>

       <x:form action="addStudent" modelAttribute="student">
       <x:input path="studentName" placeholder="Enter Name:"/>
       <x:input path="studentPhNo" placeholder="Enter PhNo:"/>
       <input type="submit" value="save">
       </x:form>
       
</body>
</html>