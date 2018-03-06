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
						
					</div>
				</div>
				<div class="form-group row">
							<label class="col-lg-3 col-form-label form-control-label">Select
								Department</label>
							<div class="cols-xl-8">
							<div class="input-group">
							<span class="input-group-addon"><i
								class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
								<sf:select class="form-control" id="departmentId"
									path="departmentId" items="${departments}" itemLabel="name"
									itemValue="id">
									<option value="1">Category One</option>
									<option value="2">CAtegory Two</option>
								</sf:select>
							</div>
						</div>
				</div>
				
				<div class="form-group ">
				
					<c:if test="${teacherModel.id eq 0 }">
					<input type="Submit" value="Submit"
						class="btn btn-success btn-lg float-right" />
					<button type="button" class="btn btn-primary"  data-toggle="modal" data-target="#myDepartmentModel"
						class="btn btn-success btn-lg float-right">
						Create Department
					</button>
					</c:if>
					
					<c:if test="${teacherModel.id ne 0 }">
					<input type="Submit" value="Update"
						class="btn btn-success btn-lg float-right" />
					
					<button type="button" class="btn btn-primary"  data-toggle="modal" data-target="#myDepartmentModel"
						class="btn btn-success btn-lg float-right">
							
							Update Department
						
					</button>
						
						
					
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

<div class="row">
		<div class ="modal fade" id="myDepartmentModel" role="dialog" tabindex="-1">
			
			<div class="modal-dialog" role="document">
				<div class="modal-content">
				<!-- Modal Dialog -->
					<div class="modal-header">
						<h5 class="modal-title ">Add New Department</h5>
							<button type="button" class="close" data-dismiss="modal" aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
					</div>
					<div class="modal-body">
					<!-- 	category form -->
					
					<sf:form id="departmentForm" modelAttribute="department" action="${contextRoot}/teacher/department/manage" method="POST" class="form-horizontal">
						<div class="form-group">
							<label for="department_name" class="control-label col-md-4">Department Name</label>
								<div class="col-md-8">
									
									<sf:input type="text" path="name" id="department_name" class="form-control"/>
								</div>
						</div>
								
						<div class="form-group">
							<label for="category_description" class="control-label col-md-4">Department Extensions</label>
								<div class="col-md-8">
									
									<sf:input type="text"  path="extension" id="department_extensions" class="form-control"/>
									
								</div>
								</div>
								
								<div class="form-group">
								<div class="col-md-offset-4 col-md-8">
										<input type="Submit" value="Add Department" class="btn btn-primary"/>
								</div>
								</div>
					
					</sf:form>
					
					</div>
					 <div class="modal-footer">
					   
					        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
					 </div>
				</div>
			
			</div>
		
		</div>
	
</div>	
