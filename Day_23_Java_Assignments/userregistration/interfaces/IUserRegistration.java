package Day_23_Java_Assignments.userregistration.interfaces;

import Day_21_Java_Assignments.userregistrationmodel.UserRegistrationContainer;

@FunctionalInterface
public interface IUserRegistration {
	
	int addDetails(UserRegistrationContainer user);

	
}