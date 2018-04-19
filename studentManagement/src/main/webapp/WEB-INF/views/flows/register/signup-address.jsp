<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@include file="../shared/flows-header.jsp" %>

<div class="container">
			<div class="row">
				<div class=" col-md-6 mx-auto ">
				<div class="card">
					<div class="card-header">
						<div class="card-title">
							<h4>Sign Up Address</h4>
						</div>
					</div>	
						<div class="card-body">
							<sf:form method="POST" class="form-horizontal" id="addressForm" modelAttribute="address">
								<div class="form-group">
									<label class="control-label col-md-4">Address Line One</label>
									<div class="col-md-8">
										<sf:input type="text" path="addressLineOne" class="form-control" placeholder="Address Line One"/>
										<%-- <sf:errors path="firstName" cssClass="help-block" element="em"/> --%>
									</div>
								
								</div>
								<div class="form-group">
									<label class="control-label col-md-4">Address Line Two</label>
									<div class="col-md-8">
										<sf:input type="text" path="addresssLineTwo" class="form-control" placeholder="Address Line Two"/>
										<%-- <sf:errors path="lastName" cssClass="help-block" element="em"/> --%>
									</div>
								
								</div>
								<div class="form-group">
									<label class="control-label col-md-4">City</label>
									<div class="col-md-8">
										<sf:input type="text" path="city" class="form-control" placeholder="City"/>
										<%-- <sf:errors path="email" cssClass="help-block" element="em"/> --%>
									</div>
								
								</div>
							
								<div class="form-group">
									<label class="control-label col-md-4">State</label>
									<div class="col-md-8">
										<sf:input type="text" path="state" class="form-control" placeholder="State"  />
										<%-- <sf:errors path="contactNumber" cssClass="help-block" element="em"/> --%>
									</div>
								
								</div>
								<div class="form-group">
									<label class="control-label col-md-4">Country</label>
									<div class="col-md-8">
										<sf:input type="password" path="country" class="form-control" placeholder="Country"/>
								<%-- 		<sf:errors path="password" cssClass="help-block" element="em"/> --%>
									</div>
								
								</div>
								
								<div class="form-group">
									<label class="control-label col-md-4">Postal Code</label>
									<div class="col-md-8">
										<sf:input type="password" path="postalCode" class="form-control" placeholder="Postal Code"/>
										<%-- <sf:errors path="confirmPassword" cssClass="help-block" element="em"/> --%>
									</div>
								
								</div>
								
								
								
								<div class="form-group">
									<div class="col-md-offset-4 col-md-8">
										
										<button type="submit" class="btn btn-primary" name="_eventId_personal">
										
										Previous-Personal <span class="fas fa-chevron-double-right"></span>
									</button>
									
									<button type="submit" class="btn btn-primary" name="_eventId_confirm">
										
									 Next - Confirm<span class="fas fa-chevron-double-right"></span>
									</button>
									
									</div>
								
								</div>
							
							
							</sf:form>
						
						</div>
					
					</div>
				
				</div>
			
			</div>
			
		</div>



<%@include file="../shared/flows-footer.jsp" %>

 