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
enum RegexPatterThree{
	FIRST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	LAST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	EMAIL_ID_PATTERN("^[a-z]+.[a-z]*@bl.co(.in)?$");

	String constant;
	RegexPatterThree(String constant) {
		this.constant = constant;
	}

	public String getConstant() {
		return constant;
	}
}


//REGEX USED
interface IRegexThree{
	boolean isFirstCapital(String firstName);
	boolean isLastCapital(String lastName);
	boolean validEmailId(String email);
}

class RegexThree implements IRegexThree{
	//	 static final String isFirstLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";
	//	 static final String isLastLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";

	public boolean isFirstCapital(String firstName) {
		return getMatcher(RegexPatterThree.FIRST_NAME_PATTERN.getConstant(), firstName).find();
	}

	public boolean isLastCapital(String lastName) {
		return getMatcher(RegexPatterThree.LAST_NAME_PATTERN.getConstant(), lastName).find();
	}

	public boolean validEmailId(String email) {
		return getMatcher(RegexPatterThree.EMAIL_ID_PATTERN.getConstant(), email).find();
	}


	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}


}

class FieldContainerThree{
	private String firstName;
	private String lastName;
	private String emailId;

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

}


interface IRegistrationThree{

	void welcomeDisplay();
	void addDetails(FieldContainerThree field);
}

class ImplementRegistrationThree implements IRegistrationThree{

	ArrayList<FieldContainerThree> arrList = new ArrayList<FieldContainerThree>();
	IRegexThree regex = new RegexThree();

	static int count = 0;

	public void welcomeDisplay() 
	{
		System.out.println(">>>>>Welcome To USER_REGISTRATION_SYSTEMS<<<<<");
	}

	public void addDetails(FieldContainerThree field) 
	{
		if(regex.isFirstCapital(field.getFirstName()))
		{
			if(regex.isLastCapital(field.getLastName())) 
			{
				if(regex.validEmailId(field.getEmailId())) 
				{
					arrList.add(count, field);
					count++;
					printList(field);
				}
				else 
				{
					System.out.println("Invalid Email_Id");
				}
			}
			else 
			{
				System.out.println("Invalid LastName");
			}

		}
		else
		{
			System.out.println("Invalid FirstName");
		}
	}
	private void printList(FieldContainerThree field) {
		if(null != field) {
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName"+" :: "+"   Email_Id");
			System.out.println('\t'+field.getFirstName()+'\t'+'\t'+field.getLastName()+'\t'+'\t'+field.getEmailId());
		}
	}



}


public class Uc3 {

	private static Scanner getInput = new Scanner(System.in);


	//GETING INPUT METHOD
	static FieldContainerThree getdetails() {
		FieldContainerThree fieldContainerThree = new FieldContainerThree();

		System.out.println("Enter FirstName : "); 
		fieldContainerThree.setFirstName(getInput.next());

		System.out.println("Enter LastName : "); 
		fieldContainerThree.setLastName(getInput.next());

		System.out.println("Enter Email_Id : "); 
		fieldContainerThree.setEmailId(getInput.next());
		return fieldContainerThree;

	}

	//MAIN METHOD
	public static void main(String[] args) {

		IRegistrationThree getForm = new ImplementRegistrationThree();

		getForm.welcomeDisplay();
		getForm.addDetails(getdetails());
	}

}