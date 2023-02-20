package Day_20_Java_Assignments.userregistration;

public interface IRegexUserRegistration {
	
	boolean isFirstCapital(String firstName);
	boolean isLastCapital(String lastName);
	boolean validEmailId(String email);
	boolean validMobileNumber(String number);
	boolean setPassword(String password);

}
