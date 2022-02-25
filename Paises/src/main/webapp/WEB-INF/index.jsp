<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Querys paises</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="row">
			<h2>Query 1</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">name</th>
			      <th scope="col">language</th>
			      <th scope="col">percentage</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${lista1}">
			  		<tr>
				      <td><c:out value="${item[0] }"/></td>
				      <td><c:out value="${item[1] }"/></td>
				      <td><c:out value="${item[2] }"/></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<h2>Query 2</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">countries.name</th>
			      <th scope="col">count(cities.name)</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${lista2}">
			  		<tr>
				      <td><c:out value="${item[0] }"/></td>
				      <td><c:out value="${item[1] }"/></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<h2>Query 3</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">cities.name</th>
			      <th scope="col">cities.population</th>
			      <th scope="col">country_id</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${lista3}">
			  		<tr>
				      <td><c:out value="${item[0] }"/></td>
				      <td><c:out value="${item[1] }"/></td>
				      <td><c:out value="${item[2] }"/></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<h2>Query 4</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">countries.name</th>
			      <th scope="col">language</th>
			      <th scope="col">percentage</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${lista4}">
			  		<tr>
				      <td><c:out value="${item[0] }"/></td>
				      <td><c:out value="${item[1] }"/></td>
				      <td><c:out value="${item[2] }"/></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<h2>Query 5</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">name</th>
			      <th scope="col">surface_area</th>
			      <th scope="col">countries.population</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${lista5}">
			  		<tr>
				      <td><c:out value="${item[0] }"/></td>
				      <td><c:out value="${item[1] }"/></td>
				      <td><c:out value="${item[2] }"/></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<h2>Query 6</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">name</th>
			      <th scope="col">government_form</th>
			      <th scope="col">capital</th>
			      <th scope="col">life_expectancy</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${lista6}">
			  		<tr>
				      <td><c:out value="${item[0] }"/></td>
				      <td><c:out value="${item[1] }"/></td>
				      <td><c:out value="${item[2] }"/></td>
				      <td><c:out value="${item[3] }"/></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
		<div class="row">
			<h2>Query 7</h2>
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">cities.name</th>
			      <th scope="col">cities.district</th>
			      <th scope="col">cities.population</th>
			    </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="item" items="${lista7}">
			  		<tr>
				      <td><c:out value="${item[0] }"/></td>
				      <td><c:out value="${item[1] }"/></td>
				      <td><c:out value="${item[2] }"/></td>
				    </tr>
				</c:forEach>
			  </tbody>
			</table>
		</div>
	</div>
	
</body>
</html>