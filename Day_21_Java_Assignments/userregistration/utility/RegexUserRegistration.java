package Day_21_Java_Assignments.userregistration.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Day_21_Java_Assignments.userregistration.exceptions.EmailIdException;
import Day_21_Java_Assignments.userregistration.exceptions.FirstNameStartWithCapitalException;
import Day_21_Java_Assignments.userregistration.exceptions.LastNameStartWithCapitalException;
import Day_21_Java_Assignments.userregistration.exceptions.MobileNumberException;
import Day_21_Java_Assignments.userregistration.exceptions.PasswordException;

public class RegexUserRegistration implements IRegexUserRegistration{

	public boolean isFirstCapital(String firstName)  {
		boolean result = getMatcher(ENUserRegistrationPattern.firstNamePattern.getConstant(), firstName).find();
		if(!result) {
			throw new FirstNameStartWithCapitalException("Invalid FirstName...");
		}
		return result;
	}
	
	public boolean isLastCapital(String lastName) {
		boolean result = getMatcher(ENUserRegistrationPattern.lastNamePattern.getConstant(), lastName).find();
		if(!result) {
			throw new LastNameStartWithCapitalException("Invalid LastName...");
		}
		return result;
	}
	
	public boolean validEmailId(String email) {
		boolean result =  getMatcher(ENUserRegistrationPattern.emailIdPattern.getConstant(), email).find();
		if(!result) {
			throw new EmailIdException("Invalid Email ID...");
		}
		return result;
	}

	public boolean validMobileNumber(String number) {
		boolean result = getMatcher(ENUserRegistrationPattern.mobileNumberPattern.getConstant(), number).find();
		if(!result) {
			throw new MobileNumberException("Invalid MObile Number...");
		}
		return result;
	}
	
	public boolean setPassword(String password) {
		boolean result = getMatcher(ENUserRegistrationPattern.setPassword.getConstant(), password).find();
		if(!result) {
			throw new PasswordException("Invalid Password...");
		}
		return result;
	}
	
	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}
}