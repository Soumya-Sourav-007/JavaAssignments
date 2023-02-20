package Day_21_Java_Assignments.userregistration.interfaces;

import Day_21_Java_Assignments.userregistrationmodel.UserRegistrationContainer;

public interface IUserRegistration {
	void welcomeDisplay();
	int addDetails(UserRegistrationContainer user);
}