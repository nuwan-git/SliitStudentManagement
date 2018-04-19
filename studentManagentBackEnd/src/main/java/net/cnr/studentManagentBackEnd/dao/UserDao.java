package net.cnr.studentManagentBackEnd.dao;

import net.cnr.studentManagentBackEnd.dto.Address;
import net.cnr.studentManagentBackEnd.dto.User;

public interface UserDao {

	boolean addUser(User user);
	
	boolean addAddress(Address address);
}
