<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- load static resources -->
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="fonts" value="/resources/fonts" />
<spring:url var="images" value="/resources/images" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Student Management System</title>

<script>
	window.menu = '${title}'; /* get title value */
	
	window.contextRoot='${contextRoot}'
	
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">



</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
		
			<c:if test="${userClickHome==true }">
				<!-- header comes hear -->
				<%@include file="./header.jsp"%>

				<!-- Page Content -->
				<!-- loading home content -->
				<%@include file="./home.jsp"%>

			</c:if>

			<c:if test="${userClickAbout==true }">
				<%@include file="./about.jsp"%>
			</c:if>
			
			<c:if test="${userClickManageStudent==true }">
				<%@include file="./manageStudent.jsp"%>
			</c:if>
			
			<c:if test="${userClickManageTeachers==true }">
				<%@include file="./manageTeachers.jsp"%>
			</c:if>
			
		</div>
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="vendor/jquery/jquery.min.js"></script>
		<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

		<!-- jquery -->
		<script src="${js}/jquery.js"></script>
		<!-- Bootstrap core JavaScript -->
		<script src="${js}/bootstrap.bundle.min.js"></script>

		<!--  self coded java script -->
		<script src="${js}/myapp.js"></script>
		
		<!-- jquery validate -->
		<script src="${js}/jquery.validate.js"></script>
		
		<!-- jqueryvalidate.min.js -->
		<script src="${js}/jquery.validate.min.js"></script>
	
		<!-- DataTablePluging -->
		<script src="${js}/jquery.dataTables.js"></script>
	</div>
	<!-- end of wrapper class -->
</body>

</html>
