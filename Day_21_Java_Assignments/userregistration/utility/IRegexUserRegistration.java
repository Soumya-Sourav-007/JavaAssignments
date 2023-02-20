package Day_21_Java_Assignments.userregistration.utility;

public interface IRegexUserRegistration {
	boolean isFirstCapital(String firstName);
	boolean isLastCapital(String lastName);
	boolean validEmailId(String email);
	boolean validMobileNumber(String number);
	boolean setPassword(String password);
}