package Day_23_Java_Assignments.userregistration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Day_21_Java_Assignments.userregistrationmodel.UserRegistrationContainer;
import Day_23_Java_Assignments.userregistration.interfaces.IUserRegistration;
import Day_23_Java_Assignments.userregistration.services.UserRegistrationImplementations;

public class UserRegistrationImplementationClassTest {

	IUserRegistration getForm = new UserRegistrationImplementations();
	
	@Test
	public void addDetailsTestOne() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Durga");
		fieldContainerEight.setLastName("Pradhan");
		fieldContainerEight.setEmailId("durga.prasad@bl.co.in");
		fieldContainerEight.setMobileNumber("917898245698");
		fieldContainerEight.setPassword("dur17G@99prasad");
		
		assertEquals(1, getForm.addDetails(fieldContainerEight));
	}
	public void addDetailsTestTwo() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Durga");
		fieldContainerEight.setLastName("Pradhan");
		fieldContainerEight.setEmailId("durga.prasad@bl.co");
		fieldContainerEight.setMobileNumber("917898245698");
		fieldContainerEight.setPassword("dur17G@99prasad");
		
		assertEquals(1, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestThree() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("durga");		//expected_error_here
		fieldContainerEight.setLastName("Pradhan");
		fieldContainerEight.setEmailId("durga.prasad@bl.co.in");
		fieldContainerEight.setMobileNumber("917898245698");
		fieldContainerEight.setPassword("dur17G@99prasad");
		
		assertEquals(0, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestFour() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Durga");
		fieldContainerEight.setLastName("pradhan");		//expected_error_here
		fieldContainerEight.setEmailId("durga.prasad@bl.co.in");
		fieldContainerEight.setMobileNumber("917898245698");
		fieldContainerEight.setPassword("dur17G@99prasad");
		
		assertEquals(0, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestFive() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Durga");
		fieldContainerEight.setLastName("Pradhan");
		fieldContainerEight.setEmailId("durga.prasad@bl");		//expected_error_here
		fieldContainerEight.setMobileNumber("917898245698");
		fieldContainerEight.setPassword("dur17G@99prasad");
		
		assertEquals(0, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestSix() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Durga");
		fieldContainerEight.setLastName("Pradhan");
		fieldContainerEight.setEmailId("durga.prasad@bl.co.in");
		fieldContainerEight.setMobileNumber("7898245698");		//expected_error_here
		fieldContainerEight.setPassword("dur17G@99prasad");
		
		assertEquals(0, getForm.addDetails(fieldContainerEight));
	}
	@Test
	public void addDetailsTestSeven() {
		UserRegistrationContainer fieldContainerEight = new UserRegistrationContainer();
		
		fieldContainerEight.setFirstName("Durga");
		fieldContainerEight.setLastName("Pradhan");
		fieldContainerEight.setEmailId("durga.prasad@bl.co.in");
		fieldContainerEight.setMobileNumber("917898245698");
		fieldContainerEight.setPassword("prasad");		//expected_error_here
		
		assertEquals(0, getForm.addDetails(fieldContainerEight));
	}



}