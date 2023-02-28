package Day_23_Java_Assignments.userregistration.controller;

import java.util.Scanner;

import Day_21_Java_Assignments.userregistrationmodel.UserRegistrationContainer;
import Day_23_Java_Assignments.userregistration.exceptions.EmailIdException;
import Day_23_Java_Assignments.userregistration.exceptions.FirstNameStartWithCapitalException;
import Day_23_Java_Assignments.userregistration.exceptions.LastNameStartWithCapitalException;
import Day_23_Java_Assignments.userregistration.exceptions.MobileNumberException;
import Day_23_Java_Assignments.userregistration.exceptions.PasswordException;
import Day_23_Java_Assignments.userregistration.interfaces.IUserRegistration;
import Day_23_Java_Assignments.userregistration.services.UserRegistrationImplementations;

public class UserRegistration {
	
	private static Scanner getInput = new Scanner(System.in);
	static UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
	
//GETING INPUT METHOD
	static UserRegistrationContainer getdetails() {
	
		
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
	

//MAIN METHOD
	public static void main(String[] args) {
		
		IUserRegistration getForm = new UserRegistrationImplementations();


		
		
		try {
		getForm.addDetails(getdetails());
		}
		catch(FirstNameStartWithCapitalException e){
			System.out.println(e);
			System.out.println("Enter Valid FirstName : "); 
			fieldContainerEight.setFirstName(getInput.next());
		}catch(LastNameStartWithCapitalException e){
			System.out.println(e);
			System.out.println("Enter Valid LastName : "); 
			fieldContainerEight.setFirstName(getInput.next());
		}catch(EmailIdException e){
			System.out.println(e);
			System.out.println("Enter Valid Email Id : "); 
			fieldContainerEight.setFirstName(getInput.next());
		}catch(MobileNumberException e){
			System.out.println(e);
			System.out.println("Enter Valid MobileNumber : "); 
			fieldContainerEight.setFirstName(getInput.next());
		}catch(PasswordException e){
			System.out.println(e);
			System.out.println("Enter Valid Password : "); 
			fieldContainerEight.setFirstName(getInput.next());
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}


