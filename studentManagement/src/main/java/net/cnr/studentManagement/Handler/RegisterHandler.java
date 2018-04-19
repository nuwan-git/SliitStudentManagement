package net.cnr.studentManagement.Handler;



import org.springframework.stereotype.Component;

import net.cnr.studentManagement.Model.RegisterModel;
import net.cnr.studentManagentBackEnd.dto.Address;
import net.cnr.studentManagentBackEnd.dto.User;

@Component
public class RegisterHandler {
	
	public RegisterModel init(){
		return new RegisterModel();
	}
	
	public void addUser(RegisterModel registerModel, User user){
		registerModel.setUser(user);
	}
	
	public void addAddress(RegisterModel registerModel, Address address){
		registerModel.setAddress(address);
	}
}
