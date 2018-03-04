$(function() {
	
	//dismissing the alert after 3 seconds

	var $alert = $('.alert');
	
	if($alert.length){
		setTimeout(function(){
			$alert.fadeOut('slow');
		},3000)
	}
	
	
	
	//----------------------------------------
		/*jquery validation for teachers*/
/*	
	//email validation
	jQuery.validator.addMethod("emailCustomFormat", function (value, element) {
        return this.optional(element) || /^([\w-\.]+@@([\w-]+\.)+[\w-]{2,4})?$/.test(value);
    }, abp.localization.localize("FormValidationMessageEmail"));
	
*/	
		var teacherManagementForm = $('#teacherManagementForm');
		
		if(teacherManagementForm.length){
			teacherManagementForm.validate({
				rules  : {
					
					name:{
						required:true,
						minlength: 2
					},
				
					email:{
						required:true
		//				emailCustomFormat : true
					},
					education:{
						required:true
					},
					experienceYears:{
						required:true,
						 min:1
				    
					},
					departmentId:{
						required:true
					}
				},
				
				
				messages : {
					
					name : {
						required: 'Please add the teacher name!',
						minlength: 'The name should not me less than 2!!'
					},
					email : {
						
						required : 'Please add the Email'
				//	emailCustomFormat : 'Please add valid email '
					},
					education : {
						required : 'Please add the Education Status'
					},
					experienceYears : {
						required : 'Please add Education Number Of Years'
						
					},
					departmentId : {
						required : 'Please enter valid department Id'
					}
					
					
				},
				errorElement: 'em',
				errorPlacement: function(error,element){
					error.addClass('help-block');
					error.insertAfter(element);
				}
				
				
			});
			
		}
		
	//-----------------------------------
	
		
		

		//---------------------------------------
		// data table for admin
		//---------------------------------------
		
		var $adminTeacherTable = $('#adminTeacherTable');
		// execute thebelow code only where have this table

		if ($adminTeacherTable.length) {
			

			var jsonUrl = window.contextRoot + '/json/data/all/teachers';
			
				$adminTeacherTable
					.DataTable({
						lengthMenu : [ [ 10, 30, 50, -1 ],
								[ '10 Records', '30 Records', '50 Records', 'All' ] ],
						pageLength : 30,
						

						ajax : {
							url : jsonUrl,
							dataSrc : ''
						},

						columns : [
							{
								data: 'id'
							},
								
							{
									data : 'name'

							},
							{
									data : 'email'

							},
								
							{
									data : 'education',
									
							},
							{
									data : 'experienceYears',
									bSortable : false,
									mRender : function(data,type,row) {
										
										if (data<= 2) {
											return '<span class="text-warning" class="font-weight-bold"  >Demonstrator</span>';
										}
										else if(data<= 5){
											return '<span  class="text-primary" class="font-weight-bold" >Lecturer</span>';
										}
										else{
											return '<span class="text-success" class="font-weight-bold"  >Senior Lecturer</span>';
										}
										
										return data;
									
									}

								},
								{
									data : 'departmentId'
								},
								{
									data:'id',
									bSortable: false,
									mRender: function(data,type,row){
										var str ='';
										str +='<a href="'+window.contextRoot+'/teacher/'+data+'/details" class="btn btn-warning">';
											
										str +='<span class="text-warning"></span>Edit</a>'; 
												
										
										
										return str;
									}
								}
						],
						
						
						
						
					});
			
			
		}
		
		
		
		
});