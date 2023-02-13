package Day_10_Java_Assignments.adressBook.interfaces;

import Day_10_Java_Assignments.adressBook.controller.Controller;

public interface Interfaces {

	int addContacts(Controller controller);
	void updateByName(String name);
	void deleteByName(String name);
	void showContacts();
	
}