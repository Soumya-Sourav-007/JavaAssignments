package Day_20_Java_Assignments.userregistration;


import java.util.Scanner;

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

public class UserRegistration {
	
	private static Scanner getInput = new Scanner(System.in);

	
//Input Method
	static UserRegistrationContainer getdetails() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		System.out.println("Enter FirstName : "); 
		fieldContainerEight.setFirstName(getInput.next());
		
		System.out.println("Enter LastName : "); 
		fieldContainerEight.setLastName(getInput.next());
		
		System.out.println("Enter Email_Id : "); 
		fieldContainerEight.setEmailId(getInput.next());

		System.out.println("Enter Mobile_Number : "); 
		fieldContainerEight.setMobileNumber(getInput.next());
		
		System.out.println("Enter Password : "); 
		fieldContainerEight.setPassword(getInput.next());
		return fieldContainerEight;
		
	}

//Main Method
	public static void main(String[] args) {
		
		IUserRegistration getForm = new UserRegistrationImplementations();

		getForm.welcomeDisplay();
		getForm.addDetails(getdetails());
	}
}