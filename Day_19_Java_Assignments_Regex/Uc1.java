package Day_19_Java_Assignments_Regex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 - UC_1 :: As a User need to enter a valid FirstName
 - First name starts with Cap and has minimum 3 characters
 */

//REGEX USED//
interface IRegex{
	boolean isCapital(String firstName);
}

class Regex implements IRegex{
	static final String isFirstLetterOfFirstNameCapital = "^[A-Z][a-z]{3,}$";
	public boolean isCapital(String firstName) {
		Pattern pattern = Pattern.compile(isFirstLetterOfFirstNameCapital);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.find();
	}
}



class FieldContainer{
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}


interface IRegistration{

	void welcomeDisplay();
	void addDetails(FieldContainer field);
}

class ImplementRegistration implements IRegistration{

	ArrayList<FieldContainer> arrList = new ArrayList<FieldContainer>();
	IRegex regex = new Regex();

	static int count = 0;

	public void welcomeDisplay() {
		System.out.println(">>>>>Welcome To USER_REGISTRATION_SYSTEMS<<<<<");

	}

	public void addDetails(FieldContainer field) {
		if(regex.isCapital(field.getFirstName())) {
			arrList.add(count, field);
			count++;
			printList(field);
		}else {
			System.out.println("Invalid name");
		}	
	}

	private void printList(FieldContainer field) {
		if(null != field) {
			System.out.println("Form ::"+'\t'+"FirstName");
			System.out.println('\t'+field.getFirstName());
		}
	}

}


public class Uc1 {

	private static Scanner getInput = new Scanner(System.in);


	//GETING INPUT METHOD
	static FieldContainer getdetails() {
		FieldContainer fieldContainer = new FieldContainer();

		System.out.println("Enter FirstName : "); 
		fieldContainer.setFirstName(getInput.next());

		return fieldContainer;
	}

	//MAIN METHOD
	public static void main(String[] args) {

		IRegistration getForm = new ImplementRegistration();

		getForm.welcomeDisplay();
		getForm.addDetails(getdetails());
	}

}