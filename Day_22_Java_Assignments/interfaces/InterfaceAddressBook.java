package Day_22_Java_Assignments.interfaces;

import Day_22_Java_Assignments.model.Contacts;

public interface InterfaceAddressBook {

	void welcomeDisplay();
	int createContactDetails(Contacts contacts);
	void editByName(String firstName);
	void deleteByFirstName(String firstname);
}
