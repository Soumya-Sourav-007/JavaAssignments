package Day_20_Java_Assignments.userregistration;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegexUserRegistrationClassTest {

	RegexUserRegistration reg = new RegexUserRegistration();

	//FirstName Test Cases
	@Test
	public void isFirstCapitalTestOne() {
		assertTrue(reg.isFirstCapital("Soumya"));
	}
	@Test
	public void isFirstCapitalTestTwo() {
		assertFalse(reg.isFirstCapital("SOUMYA"));
	}
	@Test
	public void isFirstCapitalTestThree() {
		assertFalse(reg.isFirstCapital("SoUmYa"));
	}
	@Test
	public void isFirstCapitalTestFour() {
		assertFalse(reg.isFirstCapital("dsoumya"));
	}
	@Test
	public void isFirstCapitalTestFive() {
		assertFalse(reg.isFirstCapital("sOUMYA"));
	}

	//LastName Test Cases

	@Test
	public void isLastCapitalTestOne() {
		assertTrue(reg.isLastCapital("Sourav"));
	}
	@Test
	public void isLastCapitalTestTwo() {
		assertFalse(reg.isLastCapital("SOURAV"));
	}
	@Test
	public void isLastCapitalTestThree() {
		assertFalse(reg.isLastCapital("SoRaV"));
	}
	@Test
	public void isLastCapitalTestFour() {
		assertFalse(reg.isLastCapital("sourav"));
	}
	@Test
	public void isLastCapitalTestFive() {
		assertFalse(reg.isLastCapital("sOURAV"));
	}

	//Email Id Test Case

	@Test
	public void validEmailIdTestOne() {
		assertTrue(reg.validEmailId("soumya.sourav@sm.co"));
	}
	@Test
	public void validEmailIdTestTwo() {
		assertFalse(reg.validEmailId("soumyasourav@sm.co.in"));
	}
	@Test
	public void validEmailIdTestThree() {
		assertTrue(reg.validEmailId("soumya.sourav@sm.co.in"));
	}
	@Test
	public void validEmailIdTestFour() {
		assertFalse(reg.validEmailId("Soumya.sourav@sm.co.in"));
	}
	@Test
	public void validEmailIdTestFive() {
		assertFalse(reg.validEmailId("soumya.Sourav@sm.co.in"));
	}
	@Test
	public void validEmailIdTestSix() {
		assertFalse(reg.validEmailId("soumya.sourav@gmail.co.in"));
	}
	@Test
	public void validEmailIdTestSeven() {
		assertFalse(reg.validEmailId("soumya.sourav@sm.in"));
	}
	@Test
	public void validEmailIdTestEight() {
		assertFalse(reg.validEmailId("soumya.sourav@sm.o.in"));
	}
	@Test
	public void validEmailIdTestNine() {
		assertFalse(reg.validEmailId("soumya.sourav@sm..co,in"));
	}
	@Test
	public void validEmailIdTestTen() {
		assertFalse(reg.validEmailId("soumya.sourav$sm."));
	}
	@Test
	public void validEmailIdTestEleven() {
		assertFalse(reg.validEmailId("soumya.souravsm."));
	}

	//Mobile Number Test Cases

	@Test
	public void validMobileNumberTestOne() {
		assertTrue(reg.validMobileNumber("919945787845"));
	}
	@Test
	public void validMobileNumberTestTwo() {
		assertTrue(reg.validMobileNumber("919658611213"));
	}
	@Test
	public void validMobileNumberTestThree() {
		assertTrue(reg.validMobileNumber("918887485475"));
	}
	@Test
	public void validMobileNumberTestFour() {
		assertTrue(reg.validMobileNumber("919934567899"));
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
		assertFalse(reg.validMobileNumber("915852135459"));
	}
	@Test
	public void validMobileNumberTestEight() {
		assertFalse(reg.validMobileNumber("9658611213"));
	}
	@Test
	public void validMobileNumberTestNine() {
		assertFalse(reg.validMobileNumber("09658611213"));
	}
	@Test
	public void validMobileNumberTestTen() {
		assertFalse(reg.validMobileNumber("91-9658611213"));
	}
	@Test
	public void validMobileNumberTestEleven() {
		assertFalse(reg.validMobileNumber("+919658611213"));
	}

	//Password Test Cases

	@Test
	public void setPasswordTestOne() {
		assertTrue(reg.setPassword("sam77G@45musician"));
	}
	@Test
	public void setPasswordTestTwo() {
		assertTrue(reg.setPassword("77G@45musician"));
	}
	@Test
	public void setPasswordTestThree() {
		assertTrue(reg.setPassword("G@45musician"));
	}
	@Test
	public void setPasswordTestFour() {
		assertTrue(reg.setPassword("AG@45musician"));
	}
	@Test
	public void setPasswordTestFive() {
		assertFalse(reg.setPassword("sam77G@45"));
	}
	@Test
	public void setPasswordTestSix() {
		assertFalse(reg.setPassword("sam77@45musician"));
	}
	@Test
	public void setPasswordTestSeven() {
		assertFalse(reg.setPassword("sam77G45musician"));
	}
	@Test
	public void setPasswordTestEight() {
		assertFalse(reg.setPassword("sam77G@musician"));
	}
	@Test
	public void setPasswordTestNine() {
		assertFalse(reg.setPassword("s7G@5m"));
	}

}
