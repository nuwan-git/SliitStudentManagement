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
	<div class=" col-md-8 mx-auto">
		<div class="main-login main-center">
			<h5>Student Register</h5>
			<sf:form class="form" role="form" autocomplete="off" method="POST"
				modelAttribute="studentModel" action="${contextRoot}/manage/student">

				<div class="form-group">
					<label for="name" class="cols-sm-2 control-label">Name</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-user fa"
								aria-hidden="true"></i></span>
							<sf:input type="text" class="form-control" path="name" id="name"
								placeholder="Enter your Name"></sf:input>

						</div>
						<sf:errors path="name" cssClass="help-block" />
					</div>
				</div>

				<div class="form-group">
					<label for="email" class="cols-sm-2 control-label">Address</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="fa fa-envelope fa" aria-hidden="true"></i></span>
							<sf:input type="text" class="form-control" path="address"
								id="address" placeholder="Enter your Address" />

						</div>
						<sf:errors path="address" cssClass="help-block" />
					</div>
				</div>

				<div class="form-group">
					<label for="username" class="cols-sm-2 control-label">Email</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i class="fa fa-users fa"
								aria-hidden="true"></i></span>
							<sf:input type="email" class="form-control" path="email"
								id="email" placeholder="Enter your Email" />

						</div>
						<sf:errors path="email" cssClass="help-block" />
					</div>
				</div>

				<div class="form-group">
					<label for="password" class="cols-sm-2 control-label">Phone
						Number</label>
					<div class="cols-sm-10">
						<div class="input-group">
							<span class="input-group-addon"><i
								class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
							<sf:input type="text" class="form-control" path="phoneNumber"
								id="phoneNumber" placeholder="Enter your Phone Number" />

						</div>
						<sf:errors path="phoneNumber" cssClass="help-block" />
					</div>
				</div>

				<div class="form-group ">
					<input type="Submit" value="Submit"
						class="btn btn-success btn-lg float-right" />
				</div>

			</sf:form>
		</div>
	</div>
</div>
