package Day_23_Java_Assignments.userregistration.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Day_23_Java_Assignments.userregistration.exceptions.EmailIdException;
import Day_23_Java_Assignments.userregistration.exceptions.FirstNameStartWithCapitalException;
import Day_23_Java_Assignments.userregistration.exceptions.LastNameStartWithCapitalException;
import Day_23_Java_Assignments.userregistration.exceptions.MobileNumberException;
import Day_23_Java_Assignments.userregistration.exceptions.PasswordException;

public class RegexUserRegistration implements IRegexUserRegistration{

	public boolean isFirstCapital(String firstName)  {
		boolean result = getMatcher(EUserRegistrationPatter.FIRST_NAME_PATTERN.getConstant(), firstName).find();
		if(!result) {
			throw new FirstNameStartWithCapitalException("Invalid FirstName...");
		}
		return result;
	}
	
	public boolean isLastCapital(String lastName) {
		boolean result = getMatcher(EUserRegistrationPatter.LAST_NAME_PATTERN.getConstant(), lastName).find();
		if(!result) {
			throw new LastNameStartWithCapitalException("Invalid LastName...");
		}
		return result;
	}
	
	public boolean validEmailId(String email) {
		boolean result =  getMatcher(EUserRegistrationPatter.EMAIL_ID_PATTERN.getConstant(), email).find();
		if(!result) {
			throw new EmailIdException("Invalid Email ID...");
		}
		return result;
	}

	public boolean validMobileNumber(String number) {
		boolean result = getMatcher(EUserRegistrationPatter.MOBILE_NUMBER_PATTERN.getConstant(), number).find();
		if(!result) {
			throw new MobileNumberException("Invalid MObile Number...");
		}
		return result;
	}
	
	public boolean setPassword(String password) {
		boolean result = getMatcher(EUserRegistrationPatter.SET_PASSWORD.getConstant(), password).find();
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