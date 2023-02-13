package Day_10_Java_Assignments.adressBook.controller;

public class Controller<T> {

	private String name;
	private String city;
	private long phoneNumber;
	
	public String getName() {
		return name;
	}
	public String getCity() {
		return city;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}

	
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
