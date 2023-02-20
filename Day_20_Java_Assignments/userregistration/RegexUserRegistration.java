package Day_20_Java_Assignments.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration implements IRegexUserRegistration{

	public boolean isFirstCapital(String firstName) {
		return getMatcher(ENUserRegistrationPattern.firstNamePattern.getConstant(), firstName).find();
	}
	
	public boolean isLastCapital(String lastName) {
		return getMatcher(ENUserRegistrationPattern.lastNamePattern.getConstant(), lastName).find();
	}
	
	public boolean validEmailId(String email) {
		return getMatcher(ENUserRegistrationPattern.emailIdPattern.getConstant(), email).find();
	}

	public boolean validMobileNumber(String number) {
		return getMatcher(ENUserRegistrationPattern.mobileNumberPattern.getConstant(), number).find();
	}
	
	public boolean setPassword(String password) {
		return getMatcher(ENUserRegistrationPattern.setPassword.getConstant(), password).find();
	}
	
	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}
}