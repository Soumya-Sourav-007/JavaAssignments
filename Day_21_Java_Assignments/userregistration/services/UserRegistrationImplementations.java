package Day_21_Java_Assignments.userregistration.services;

import java.util.ArrayList;

import Day_21_Java_Assignments.userregistration.exceptions.EmailIdException;
import Day_21_Java_Assignments.userregistration.exceptions.FirstNameStartWithCapitalException;
import Day_21_Java_Assignments.userregistration.exceptions.LastNameStartWithCapitalException;
import Day_21_Java_Assignments.userregistration.exceptions.MobileNumberException;
import Day_21_Java_Assignments.userregistration.exceptions.PasswordException;
import Day_21_Java_Assignments.userregistration.interfaces.IUserRegistration;
import Day_21_Java_Assignments.userregistration.utility.IRegexUserRegistration;
import Day_21_Java_Assignments.userregistration.utility.RegexUserRegistration;
import Day_21_Java_Assignments.userregistrationmodel.UserRegistrationContainer;

public class UserRegistrationImplementations implements IUserRegistration {

	ArrayList<UserRegistrationContainer> arrList = new ArrayList<UserRegistrationContainer>();
	IRegexUserRegistration regObj = new RegexUserRegistration();

	static int count = 0;

	public void welcomeDisplay() {

		System.out.println("  ::  Welcome To USER_REGISTRATION_SYSTEMS  ::  ");

	}

	public int addDetails(UserRegistrationContainer user) throws FirstNameStartWithCapitalException,LastNameStartWithCapitalException,EmailIdException,MobileNumberException ,PasswordException{
		int taskDone = 0;
		if(regObj.isFirstCapital(user.getFirstName())) 
		{
			if(regObj.isLastCapital(user.getLastName())) 
			{
				if(regObj.validEmailId(user.getEmailId())) 
				{
					if(regObj.validMobileNumber(user.getMobileNumber()))
					{
						if(regObj.setPassword(user.getPassword()))
						{
							arrList.add(count, user);
							count++;
							printList(user);
							return 1;
						}
					}
				}
			}
		}
		return -1;
	}

	private void printList(UserRegistrationContainer user) {
		if(null != user) {
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName"+" :: "+"    Email_Id"+" :: "+"      Mobile_Number"+"  ::  "+"      Password");
			System.out.println('\t'+user.getFirstName()+'\t'+'\t'+user.getLastName()+'\t'+user.getEmailId()+'\t'+'\t'+user.getMobileNumber()+'\t'+'\t'+user.getPassword());
		}
	}
}