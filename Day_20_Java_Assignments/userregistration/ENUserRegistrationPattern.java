package Day_20_Java_Assignments.userregistration;

public enum ENUserRegistrationPattern {
	
	firstNamePattern("^[A-Z][a-z]{3,}$"),
	lastNamePattern("^[A-Z][a-z]{3,}$"),
	emailIdPattern("^[a-z]+\\.[a-z]*@sm\\.co(\\.in)?$"),
	mobileNumberPattern("^91[6-9][0-9]{9}$"),
	setPassword("^[a-z]*[0-9]*[A-Z]+@[0-9]+[a-z]{5,}$");
	
	String constant;
	ENUserRegistrationPattern(String constant) {
		this.constant = constant;
	}
	
	public String getConstant() {
		return constant;
	}

}
