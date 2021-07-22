<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<META HTTP-EQUIV="PRAGMA" CONTENT="NO-CACHE">
<META HTTP-EQUIV="EXPIRES" CONTENT="0">
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/backstage/backstage.css"/>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.25/datatables.min.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css"/>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap4.min.css"/>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></Script>
<script src="https://cdn.datatables.net/1.10.25/js/dataTables.bootstrap4.min.js"></script>

<title>BackStage Index</title>
</head>
<body>
<div class="sidenav">
  <a href="#" id="a_emp">員工管理</a>
  <a href="#" id="a_member">會員管理</a>
  <a href="#" id="a_product">商品管理</a>
  <a href="#" id="a_mevent">線上行銷活動管理</a>
  <a href="#" id="a_event">線下活動管理</a>
  <a href="#" id="a_forum">論壇管理</a>
  <a href="#" id="a_">認養管理</a>
</div>
<div class="content" align="center">
  <h3>員工管理</h3>
  <table id="myTable"width="100%" class="table table-striped table-bordered">
    <thead>
      <tr>
        <th>員工編號</th>
        <th>員工姓名</th>
        <th>到職日</th>
        <th>薪水</th>
        <th>部門代號</th>
        <th>職稱</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var="emp" items="${emps}">
    <tr>
   		<td><c:out value='${emp.empno}'/></td>
    	<td><c:out value='${emp.ename}'/></td>
    	<td><c:out value='${emp.hireDate}'/></td>
    	<td><c:out value='${emp.salary}'/></td>
    	<td><c:out value='${emp.deptno}'/></td>
    	<td><c:out value='${emp.title}'/></td>
    </tr>
    </c:forEach>   
    </tbody>
  </table>
</div>
<footer>
&copy; 2021 EEIT131 第7組
</footer>
<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.25/datatables.min.js"></script>
<script src="${pageContext.request.contextPath}/js/backstage/backstage.js"></script>

</body>
</html>


 

