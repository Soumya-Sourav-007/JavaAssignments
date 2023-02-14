package Day_19_Java_Assignments_Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 --> UC_1 :: As a User need to enter a valid FirstName
			 - First name starts with Cap and has minimum 3 characters
 --> UC_2 :: As a User need to enter a valid Last Name
 			 - Last name starts with Cap and has minimum 3 characters 
 --> UC_3 :: As a User need to enter a valid email
			 - E.g. abc.xyz@bl.co.in 
			 - Email has 3 mandatory parts (abc, bl & co) and
			   2 optional (xyz & in) with precise @ and . positions
 */

//ENUM USED TO STORE CONSTANTS
enum RegexPatterFive{
	FIRST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	LAST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	EMAIL_ID_PATTERN("^[a-z]+.[a-z]*@bl.co(.in)?$"),
	MOBILE_NUMBER_PATTERN("^(91)[6-9][0-9]{9}$"),
	SET_PASSWORD("^[a-zA-Z0-9]{8,}");

	String constant;
	RegexPatterFive(String constant) {
		this.constant = constant;
	}

	public String getConstant() {
		return constant;
	}
}


//REGEX USED
interface IRegexFive{
	boolean isFirstCapital(String firstName);
	boolean isLastCapital(String lastName);
	boolean validEmailId(String email);
	boolean validMobileNumber(String number);
	boolean setPassword(String password);
}

class RegexFive implements IRegexFive{
	//	 static final String isFirstLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";
	//	 static final String isLastLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";

	public boolean isFirstCapital(String firstName) {
		return getMatcher(RegexPatterFive.FIRST_NAME_PATTERN.getConstant(), firstName).find();
	}

	public boolean isLastCapital(String lastName) {
		return getMatcher(RegexPatterFive.LAST_NAME_PATTERN.getConstant(), lastName).find();
	}

	public boolean validEmailId(String email) {
		return getMatcher(RegexPatterFive.EMAIL_ID_PATTERN.getConstant(), email).find();
	}

	public boolean validMobileNumber(String number) {
		return getMatcher(RegexPatterFive.MOBILE_NUMBER_PATTERN.getConstant(), number).find();
	}

	public boolean setPassword(String password) {
		return getMatcher(RegexPatterFive.SET_PASSWORD.getConstant(), password).find();
	}

	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}

}

class FieldContainerFive{
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;
	private String password;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}


interface IRegistrationFive{

	void welcomeDisplay();
	void addDetails(FieldContainerFive field);
}

class ImplementRegistrationFive implements IRegistrationFive{

	ArrayList<FieldContainerFive> arrList = new ArrayList<FieldContainerFive>();
	IRegexFive regex = new RegexFive();

	static int count = 0;

	public void welcomeDisplay() 
	{
		System.out.println(">>>>>Welcome To USER_REGISTRATION_SYSTEMS<<<<<");
	}

	public void addDetails(FieldContainerFive field)
	{
		if(regex.isFirstCapital(field.getFirstName())) 
		{
			if(regex.isLastCapital(field.getLastName()))
			{
				if(regex.validEmailId(field.getEmailId())) 
				{
					if(regex.validMobileNumber(field.getMobileNumber()))
					{
						if(regex.setPassword(field.getPassword())) 
						{
							arrList.add(count, field);
							count++;
							printList(field);
						}
						else 
						{
							System.err.println("Invalid Password");
						}
					}
					else
					{
						System.err.println("Invalid Mobile Number");
					}
				}
				else
				{
					System.err.println("Invalid Email_Id");
				}
			}
			else
			{
				System.err.println("Invalid LastName");
			}

		}
		else
		{
			System.err.println("Invalid FirstName");
		}
	}
	private void printList(FieldContainerFive field) {
		if(null != field) {
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName"+" :: "+"    Email_Id"+" :: "+"      Mobile_Number"+"  ::  "+"      Password");
			System.out.println('\t'+field.getFirstName()+'\t'+'\t'+field.getLastName()+'\t'+field.getEmailId()+'\t'+'\t'+field.getMobileNumber()+'\t'+'\t'+field.getPassword());
		}
	}



}


public class Uc5 {

	private static Scanner getInput = new Scanner(System.in);


	//GETING INPUT METHOD
	static FieldContainerFive getdetails() {
		FieldContainerFive fieldContainerFive = new FieldContainerFive();

		System.out.println("Enter FirstName : "); 
		fieldContainerFive.setFirstName(getInput.next());

		System.out.println("Enter LastName : "); 
		fieldContainerFive.setLastName(getInput.next());

		System.out.println("Enter Email_Id : "); 
		fieldContainerFive.setEmailId(getInput.next());

		System.out.println("Enter Mobile_Number : "); 
		fieldContainerFive.setMobileNumber(getInput.next());

		System.out.println("Enter Password : "); 
		fieldContainerFive.setPassword(getInput.next());
		return fieldContainerFive;

	}

	//MAIN METHOD
	public static void main(String[] args) {

		IRegistrationFive getForm = new ImplementRegistrationFive();

		getForm.welcomeDisplay();
		getForm.addDetails(getdetails());
	}

}