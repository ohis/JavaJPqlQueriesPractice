<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Advanced Queries</title>
</head>
<body>
<h3>First Question displaying countries that speak slovene</h3>
  <c:forEach items="${ countrywithnameandLang}" var = "country">
   <c:out value="${country[0].name }"/> <c:out value="${country[1].language }"/> <c:out value="${country[1].percentage}"/>
   <br>
  </c:forEach>
  <br>
  <h4>2ND QUESTION ordering countries with the number of cities for each country</h4>
  <c:forEach items="${ countrywithNumofCities}" var = "CountryNdCities">
   <c:out value="${CountryNdCities[0] }"/> <c:out value="${CountryNdCities[1].country.cities.size() }"/>
   <br>
  </c:forEach>
  
  <br>
  <h4>Mexican Cities gt 500k</h4>
  
  <c:forEach items="${MexWithCitiesgt500k}" var = "Mex">
   <c:out value="${Mex[1].name }"/> <c:out value="${Mex[1].population }"/>
   <br>
  </c:forEach>
</body>
</html>