package Day_20_Java_Assignments.userregistration;

import java.util.ArrayList;

public class UserRegistrationImplementations implements IUserRegistration {

	ArrayList<UserRegistrationContainer> arrList = new ArrayList<UserRegistrationContainer>();
	IRegexUserRegistration regObj = new RegexUserRegistration();

	static int count = 0;

	public void welcomeDisplay() {

		System.out.println("  ::  Welcome To USER_REGISTRATION_SYSTEMS  ::  ");

	}

	@Override
	public int addDetails(UserRegistrationContainer user) {
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
							taskDone = 1;
						}
						else 
						{
							System.err.println("Invalid Password");
							taskDone = 0;
						}
					}
					else 
					{
						System.err.println("Invalid Mobile Number");
						taskDone = 0;
					}
				}
				else 
				{
					System.err.println("Invalid Email_Id");
					taskDone = 0;
				}
			}
			else 
			{
				System.err.println("Invalid LastName");
				taskDone = 0;
			}

		}
		else 
		{
			System.err.println("Invalid FirstName");
			taskDone = 0;
		}
		return taskDone;
	}

	private void printList(UserRegistrationContainer user) {
		if(null != user) {
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName"+" :: "+"    Email_Id"+" :: "+"      Mobile_Number"+"  ::  "+"      Password");
			System.out.println('\t'+user.getFirstName()+'\t'+'\t'+user.getLastName()+'\t'+user.getEmailId()+'\t'+'\t'+user.getMobileNumber()+'\t'+'\t'+user.getPassword());
		}
	}
}