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
enum RegexPatterSeven{
	FIRST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	LAST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	EMAIL_ID_PATTERN("^[a-z]+.[a-z]*@bl.co(.in)?$"),
	MOBILE_NUMBER_PATTERN("^(91)[6-9][0-9]{9}$"),
	SET_PASSWORD("^([a-z]*[0-9]*[A-Z]+[0-9]*[0-9]+[a-z]*){8,}");

	String constant;
	RegexPatterSeven(String constant) {
		this.constant = constant;
	}

	public String getConstant() {
		return constant;
	}
}


//REGEX USED
interface IRegexSeven{
	boolean isFirstCapital(String firstName);
	boolean isLastCapital(String lastName);
	boolean validEmailId(String email);
	boolean validMobileNumber(String number);
	boolean setPassword(String password);
}

class RegexSeven implements IRegexSeven{
	//	 static final String isFirstLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";
	//	 static final String isLastLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";

	public boolean isFirstCapital(String firstName) {
		return getMatcher(RegexPatterSeven.FIRST_NAME_PATTERN.getConstant(), firstName).find();
	}

	public boolean isLastCapital(String lastName) {
		return getMatcher(RegexPatterSeven.LAST_NAME_PATTERN.getConstant(), lastName).find();
	}

	public boolean validEmailId(String email) {
		return getMatcher(RegexPatterSeven.EMAIL_ID_PATTERN.getConstant(), email).find();
	}

	public boolean validMobileNumber(String number) {
		return getMatcher(RegexPatterSeven.MOBILE_NUMBER_PATTERN.getConstant(), number).find();
	}

	public boolean setPassword(String password) {
		return getMatcher(RegexPatterSeven.SET_PASSWORD.getConstant(), password).find();
	}

	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}

}

class FieldContainerSeven{
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


interface IRegistrationSeven{

	void welcomeDisplay();
	void addDetails(FieldContainerSeven field);
}

class ImplementRegistrationSeven implements IRegistrationSeven{

	ArrayList<FieldContainerSeven> arrList = new ArrayList<FieldContainerSeven>();
	IRegexSeven regex = new RegexSeven();

	static int count = 0;

	public void welcomeDisplay() 
	{
		System.out.println(">>>>>Welcome To USER_REGISTRATION_SYSTEMS<<<<<");
	}

	public void addDetails(FieldContainerSeven field) 
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
	private void printList(FieldContainerSeven field) {
		if(null != field) {
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName"+" :: "+"    Email_Id"+" :: "+"      Mobile_Number"+"  ::  "+"      Password");
			System.out.println('\t'+field.getFirstName()+'\t'+'\t'+field.getLastName()+'\t'+field.getEmailId()+'\t'+'\t'+field.getMobileNumber()+'\t'+'\t'+field.getPassword());
		}
	}



}


public class Uc7 {

	private static Scanner getInput = new Scanner(System.in);


	//GETING INPUT METHOD
	static FieldContainerSeven getdetails() {
		FieldContainerSeven fieldContainerSeven = new FieldContainerSeven();

		System.out.println("Enter FirstName : "); 
		fieldContainerSeven.setFirstName(getInput.next());

		System.out.println("Enter LastName : "); 
		fieldContainerSeven.setLastName(getInput.next());

		System.out.println("Enter Email_Id : "); 
		fieldContainerSeven.setEmailId(getInput.next());

		System.out.println("Enter Mobile_Number : "); 
		fieldContainerSeven.setMobileNumber(getInput.next());

		System.out.println("Enter Password : "); 
		fieldContainerSeven.setPassword(getInput.next());
		return fieldContainerSeven;

	}

	//MAIN METHOD
	public static void main(String[] args) {

		IRegistrationSeven getForm = new ImplementRegistrationSeven();

		getForm.welcomeDisplay();
		getForm.addDetails(getdetails());
	}


}