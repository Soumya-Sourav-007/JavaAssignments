package Day_23_Java_Assignments.userregistration.utility;

public enum EUserRegistrationPatter {
	FIRST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	LAST_NAME_PATTERN("^[A-Z][a-z]{3,}$"),
	EMAIL_ID_PATTERN("^[a-z]+.[a-z]*@bl.co(.in)?$"),
	MOBILE_NUMBER_PATTERN("^91[6-9][0-9]{9}$"),
	SET_PASSWORD("^[a-z]*[0-9]*[A-Z]+@[0-9]+[a-z]{5,}$");
	//^([a-z]*[0-9]*[A-Z]+@[0-9]+[a-z]*){8,}$
	String constant;
	EUserRegistrationPatter(String constant) {
		this.constant = constant;
	}
	
	public String getConstant() {
		return constant;
	}
}