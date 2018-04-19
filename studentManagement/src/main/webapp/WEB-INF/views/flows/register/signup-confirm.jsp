<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@include file="../shared/flows-header.jsp"%>
<div class="container">
	<div class="row">
		<div class="col-sm-6">
			<div class="card ">
				<div class="card-header">
						<div class="card-title">
							<h4>Sign Up Person</h4>
						</div>
					</div>
				<div class="card-body">
					<div class="text-center">
						<h4>${registerModel.user.firstName} ${registerModel.user.lastName }</h4>
						<h5>Email: ${registerModel.user.email}</h5>
						<h5>Contact Number: ${registerModel.user.contactNumber}</h5>
						<h5>Role: ${registerModel.user.role}</h5>
					
					
					</div>
				
				</div>
				<div class="card-footer">

					<a href="${flowExecutionUrl}&_eventId_personal"
						class="btn btn-primary">Edit</a>
				</div>


			</div>
		</div>
	
		<div class="col-sm-6">
			<div class="card ">
				<div class="card-header">
					<div class="card-title">
						<h4>SignUp Address</h4>
					</div>
				</div>
				<div class="card-body">
					<div class="text-center">
						<h4>${registerModel.address.addressLineOne} </h4>
						<h4>${registerModel.address.addresssLineTwo}</h4>
						<h4>${registerModel.address.city}.${registerModel.address.postalCode}</h4>
						<h4>${registerModel.address.state}.${registerModel.address.country}</h4>
					</div>
				</div>
				<div class="card-footer">

					<a href="${flowExecutionUrl}&_eventId_address"
						class="btn btn-primary">Edit</a>
				</div>

			
			</div>
		</div>
	</div>
</div>
	<div class="container">
		<div class="row">

			<div class="col-sm-8">
				<div class="text-center">

					<a href="${flowExecutionUrl}&_eventId_submit"
						class="btn btn-primary">Confirm</a>

				</div>


			</div>

		</div>


	</div>




<%@include file="../shared/flows-footer.jsp"%>

