<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">

	<c:if test="${not empty message}">

		<div class="col-md-8 mx-auto">

			<div class="alert alert-success alert-dismissible">
				<button type="button" class="close" data-dismiss="alert">&times;</button>
				${message}
			</div>
		</div>

	</c:if>
	<!-- --- -->
	
	<div class=" col-md-8 mx-auto">
		<div class="main-login main-center">
			<h5>Student Register</h5>
			<sf:form class="form" id="teacherManagementForm" role="form" autocomplete="off" method="POST"
				modelAttribute="teacherModel" action="${contextRoot}/teacher/manage">

				<div class="form-group">
					<label for="name" class="cols-sm-2 control-label">Name</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-user fa"
								aria-hidden="true"></i></span>
								<sf:input type="text" class="form-control" path="name" id="name"
								placeholder="Enter Teacher Name"></sf:input>
								
						</div>
					</div>
					<%-- <sf:errors path="name" cssClass="help-block"/> --%>
				</div>
				

				<div class="form-group">
					<label for="email" class="cols-sm-2 control-label">Email</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="fa fa-envelope fa" aria-hidden="true"></i></span>
								<sf:input type="text" class="form-control" path="email"
								id="email" placeholder="Enter Teacher Email"></sf:input>

						</div>
						<%-- <sf:errors path="email" cssClass="help-block"/> --%>
					</div>
				</div>

				<div class="form-group">
					<label for="password" class="cols-sm-2 control-label">Education Level</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
						
								<sf:input type="text" class="form-control" path="education"
								id="education" placeholder="Enter Teacher Education Status"></sf:input>

						</div>
					<%-- 	<sf:errors path="education" cssClass="help-block"/> --%>
					</div>
				</div>
				
				<div class="form-group">
					<label for="password" class="cols-sm-2 control-label">Experience Years
						</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
						
								
								<sf:input type="text" class="form-control" path="experienceYears"
								id="experienceYears"
								placeholder="Enter Teacher Experience Years"></sf:input>

						</div>
						<%-- <sf:errors path="experienceYears" cssClass="help-block"/> --%>
					</div>
				</div>

				<div class="form-group">
					<label for="password" class="cols-sm-2 control-label">Department
						Number</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
					
								
								<sf:input type="text" class="form-control" path="departmentId"
								id="departmentId" placeholder="Enter Teacher Department"></sf:input>

						</div>
					<%-- 	<sf:errors path="departmentId" cssClass="help-block"/> --%>
					</div>
				</div>
				
				<div class="form-group ">
				
					<c:if test="${teacherModel.id eq 0 }">
					<input type="Submit" value="Submit"
						class="btn btn-success btn-lg float-right" />
					
					</c:if>
					
					<c:if test="${teacherModel.id ne 0 }">
					<input type="Submit" value="Update"
						class="btn btn-success btn-lg float-right" />
					
					</c:if>
					
						
					<!-- Hidden fields of Product -->
					<sf:hidden path="id" />
					<sf:hidden path="code" />
					<sf:hidden path="experienceYears" />
					<sf:hidden path="departmentId" />
					<sf:hidden path="active" />
				</div>

			</sf:form>
		</div>
	</div>
	
	
	<!-- --- -->
</div>

<!-- diplay teacher details -->
<br>
<br>
<br>
<div class="row">


	<div class="col-md-8 mx-auto">

		<!-- teacher table for admin -->
		<table id="adminTeacherTable"
			class="table table-striped table-bordered">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Education</th>
					<th>Experience Years</th>
					<th>Department Id</th>
					<th>Edit</th>

				</tr>

			</thead>
			<tbody>

			</tbody>
			<tfoot>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Email</th>
					<th>Education</th>
					<th>Experience Years</th>
					<th>Department Id</th>
					<th>Edit</th>
				</tr>

			</tfoot>



		</table>

	</div>


</div>


