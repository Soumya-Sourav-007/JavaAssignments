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

//ENUM USED TO STORE CONSTANTS//
enum RegexPatterFour{
	FIRST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	LAST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	EMAIL_ID_PATTERN("^[a-z]+.[a-z]*@bl.co(.in)?$"),
	MOBILE_NUMBER_PATTERN("^(91)[6-9][0-9]{9}$");

	String constant;
	RegexPatterFour(String constant) {
		this.constant = constant;
	}

	public String getConstant() {
		return constant;
	}
}


//REGEX USED
interface IRegexFour{
	boolean isFirstCapital(String firstName);
	boolean isLastCapital(String lastName);
	boolean validEmailId(String email);
	boolean validMobileNumber(String number);
}

class RegexFour implements IRegexFour{
	//	 static final String isFirstLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";
	//	 static final String isLastLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";

	public boolean isFirstCapital(String firstName) {
		return getMatcher(RegexPatterFour.FIRST_NAME_PATTERN.getConstant(), firstName).find();
	}

	public boolean isLastCapital(String lastName) {
		return getMatcher(RegexPatterFour.LAST_NAME_PATTERN.getConstant(), lastName).find();
	}

	public boolean validEmailId(String email) {
		return getMatcher(RegexPatterFour.EMAIL_ID_PATTERN.getConstant(), email).find();
	}

	public boolean validMobileNumber(String number) {
		return getMatcher(RegexPatterFour.MOBILE_NUMBER_PATTERN.getConstant(), number).find();
	}


	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}
}


class FieldContainerFour{
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNumber;

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

}


interface IRegistrationFour{

	void welcomeDisplay();
	void addDetails(FieldContainerFour field);
}

class ImplementRegistrationFour implements IRegistrationFour{

	ArrayList<FieldContainerFour> arrList = new ArrayList<FieldContainerFour>();
	IRegexFour regex = new RegexFour();

	static int count = 0;

	public void welcomeDisplay() 
	{
		System.out.println(">>>>>Welcome To USER_REGISTRATION_SYSTEMS<<<<<");	
	}

	public void addDetails(FieldContainerFour field) 
	{
		if(regex.isFirstCapital(field.getFirstName())) 
		{
			if(regex.isLastCapital(field.getLastName()))
			{
				if(regex.validEmailId(field.getEmailId()))
				{
					if(regex.validMobileNumber(field.getMobileNumber()))
					{
						arrList.add(count, field);
						count++;
						printList(field);
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
	private void printList(FieldContainerFour field) {
		if(null != field) {
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName"+" :: "+"    Email_Id"+" :: "+"      Mobile_Number");
			System.out.println('\t'+field.getFirstName()+'\t'+'\t'+field.getLastName()+'\t'+field.getEmailId()+'\t'+'\t'+field.getMobileNumber());
		}
	}



}


public class Uc4 {

	private static Scanner getInput = new Scanner(System.in);


	//GETING INPUT METHOD
	static FieldContainerFour getdetails() {
		FieldContainerFour fieldContainerFour = new FieldContainerFour();

		System.out.println("Enter FirstName : "); 
		fieldContainerFour.setFirstName(getInput.next());

		System.out.println("Enter LastName : "); 
		fieldContainerFour.setLastName(getInput.next());

		System.out.println("Enter Email_Id : "); 
		fieldContainerFour.setEmailId(getInput.next());

		System.out.println("Enter Mobile_Number : "); 
		fieldContainerFour.setMobileNumber(getInput.next());
		return fieldContainerFour;

	}

	//MAIN METHOD
	public static void main(String[] args) {

		IRegistrationFour getForm = new ImplementRegistrationFour();

		getForm.welcomeDisplay();
		getForm.addDetails(getdetails());
	}
}