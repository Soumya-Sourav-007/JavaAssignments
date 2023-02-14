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
 -->
 */

//ENUM USED TO STORE CONSTANTS
enum RegexPatter{
	is_FirstLetter_Of_FirstName_Capital("^[A-Z][a-z]{3,}$"),
	is_LastLetter_Of_FirstName_Capital("^[A-Z][a-z]{3,}$");

	String constant;
	RegexPatter(String constant) {
		this.constant = constant;
	}

	public String getConstant() {
		return constant;
	}
}

//REGEX USED
interface IRegexTwo{
	boolean isFirstCapital(String firstName);
	boolean isLastCapital(String lastName);
}

class RegexTwo implements IRegexTwo{
	//	 static final String isFirstLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";
	//	 static final String isLastLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";

	public boolean isFirstCapital(String firstName) {
		return getMatcher(RegexPatter.is_FirstLetter_Of_FirstName_Capital.getConstant(), firstName).find();
	}

	public boolean isLastCapital(String lastName) {
		return getMatcher(RegexPatter.is_LastLetter_Of_FirstName_Capital.getConstant(), lastName).find();
	}

	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}
}



class FieldContainerTwo{
	private String firstName;
	private String lastName;

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

}


interface IRegistrationTwo{

	void welcomeDisplay();
	void addDetails(FieldContainerTwo field);
}

class ImplementRegistrationTwo implements IRegistrationTwo{

	ArrayList<FieldContainerTwo> arrList = new ArrayList<FieldContainerTwo>();
	IRegexTwo regex = new RegexTwo();

	static int count = 0;

	public void welcomeDisplay()
	{
		System.out.println(">>>>>Welcome To USER_REGISTRATION_SYSTEMS<<<<<");
	}

	public void addDetails(FieldContainerTwo field)
	{
		if(regex.isFirstCapital(field.getFirstName()))
		{
			if(regex.isLastCapital(field.getLastName())) 
			{
				arrList.add(count, field);
				count++;
				printList(field);
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
	private void printList(FieldContainerTwo field) {
		if(null != field) 
		{
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName");
			System.out.println('\t'+field.getFirstName()+'\t'+'\t'+field.getLastName());
		}
	}
}

public class Uc2 {

	private static Scanner getInput = new Scanner(System.in);


	//GETING INPUT METHOD
	static FieldContainerTwo getdetails() 
	{
		FieldContainerTwo fieldContainerTwo = new FieldContainerTwo();

		System.out.println("Enter FirstName : "); 
		fieldContainerTwo.setFirstName(getInput.next());

		System.out.println("Enter LastName : "); 
		fieldContainerTwo.setLastName(getInput.next());
		return fieldContainerTwo;

	}

	//MAIN METHOD
	public static void main(String[] args) {

		IRegistrationTwo getForm = new ImplementRegistrationTwo();

		getForm.welcomeDisplay();
		getForm.addDetails(getdetails());
	}

}
