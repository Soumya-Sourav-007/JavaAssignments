package Day_20_Java_Assignments.userregistration;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegexUserRegistrationClassTest {

	RegexUserRegistration reg = new RegexUserRegistration();

	//FirstName Test Cases
	@Test
	public void isFirstCapitalTestOne() {
		assertTrue(reg.isFirstCapital("Durga"));
	}
	@Test
	public void isFirstCapitalTestTwo() {
		assertFalse(reg.isFirstCapital("DURGA"));
	}
	@Test
	public void isFirstCapitalTestThree() {
		assertFalse(reg.isFirstCapital("DuRgA"));
	}
	@Test
	public void isFirstCapitalTestFour() {
		assertFalse(reg.isFirstCapital("durga"));
	}
	@Test
	public void isFirstCapitalTestFive() {
		assertFalse(reg.isFirstCapital("dURGA"));
	}
	
//LastName Test Cases
	
	@Test
	public void isLastCapitalTestOne() {
		assertTrue(reg.isLastCapital("Pradhan"));
	}
	@Test
	public void isLastCapitalTestTwo() {
		assertFalse(reg.isLastCapital("PRADHAN"));
	}
	@Test
	public void isLastCapitalTestThree() {
		assertFalse(reg.isLastCapital("PraDHaN"));
	}
	@Test
	public void isLastCapitalTestFour() {
		assertFalse(reg.isLastCapital("pradhan"));
	}
	@Test
	public void isLastCapitalTestFive() {
		assertFalse(reg.isLastCapital("pRADHAN"));
	}

//Email Id Test Case
	
	@Test
	public void validEmailIdTestOne() {
		assertTrue(reg.validEmailId("durga.prasad@bl.co"));
	}
	@Test
	public void validEmailIdTestTwo() {
		assertTrue(reg.validEmailId("durgaprasad@bl.co.in"));
	}
	@Test
	public void validEmailIdTestThree() {
		assertTrue(reg.validEmailId("durga.prasad@bl.co.in"));
	}
	@Test
	public void validEmailIdTestFour() {
		assertFalse(reg.validEmailId("Durga.prasad@bl.co.in"));
	}
	@Test
	public void validEmailIdTestFive() {
		assertFalse(reg.validEmailId("durga.Prasad@bl.co.in"));
	}
	@Test
	public void validEmailIdTestSix() {
		assertFalse(reg.validEmailId("durga.prasad@gmail.co.in"));
	}
	@Test
	public void validEmailIdTestSeven() {
		assertFalse(reg.validEmailId("durga.prasad@bl.in"));
	}
	@Test
	public void validEmailIdTestEight() {
		assertFalse(reg.validEmailId("durga.prasad@blco.in"));
	}
	@Test
	public void validEmailIdTestNine() {
		assertFalse(reg.validEmailId("durga.prasad@bl..co,in"));
	}
	@Test
	public void validEmailIdTestTen() {
		assertFalse(reg.validEmailId("durga.prasad$bl."));
	}
	@Test
	public void validEmailIdTestEleven() {
		assertFalse(reg.validEmailId("durga.prasadbl."));
	}
	
//Mobile Number Test Cases
	
	@Test
	public void validMobileNumberTestOne() {
		assertTrue(reg.validMobileNumber("916885213545"));
	}
	@Test
	public void validMobileNumberTestTwo() {
		assertTrue(reg.validMobileNumber("917885213545"));
	}
	@Test
	public void validMobileNumberTestThree() {
		assertTrue(reg.validMobileNumber("918885213545"));
	}
	@Test
	public void validMobileNumberTestFour() {
		assertTrue(reg.validMobileNumber("919885213545"));
	}
	@Test
	public void validMobileNumberTestFive() {
		assertFalse(reg.validMobileNumber("915885213545"));
	}
	@Test
	public void validMobileNumberTestSix() {
		assertFalse(reg.validMobileNumber("91 7885213545"));
	}
	@Test
	public void validMobileNumberTestSeven() {
		assertFalse(reg.validMobileNumber("9178852135459"));
	}
	@Test
	public void validMobileNumberTestEight() {
		assertFalse(reg.validMobileNumber("7885213545"));
	}
	@Test
	public void validMobileNumberTestNine() {
		assertFalse(reg.validMobileNumber("07885213545"));
	}
	@Test
	public void validMobileNumberTestTen() {
		assertFalse(reg.validMobileNumber("91-7885213545"));
	}
	@Test
	public void validMobileNumberTestEleven() {
		assertFalse(reg.validMobileNumber("+917885213545"));
	}

//Password Test Cases
	
	@Test
	public void setPasswordTestOne() {
		assertTrue(reg.setPassword("dur98G@99sdpra"));
	}
	@Test
	public void setPasswordTestTwo() {
		assertTrue(reg.setPassword("98G@99sdpra"));
	}
	@Test
	public void setPasswordTestThree() {
		assertTrue(reg.setPassword("G@99fdpra"));
	}
	@Test
	public void setPasswordTestFour() {
		assertTrue(reg.setPassword("AG@99sdpra"));
	}
	@Test
	public void setPasswordTestFive() {
		assertFalse(reg.setPassword("dur98G@99"));
	}
	@Test
	public void setPasswordTestSix() {
		assertFalse(reg.setPassword("dur98@99sdpra"));
	}
	@Test
	public void setPasswordTestSeven() {
		assertFalse(reg.setPassword("dur98G99sdpra"));
	}
	@Test
	public void setPasswordTestEight() {
		assertFalse(reg.setPassword("dur98G@sdpra"));
	}
	@Test
	public void setPasswordTestNine() {
		assertFalse(reg.setPassword("d98G@9a"));
	}
	
}
