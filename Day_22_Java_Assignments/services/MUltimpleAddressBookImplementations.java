package Day_22_Java_Assignments.services;

import java.util.ArrayList;


import Day_22_Java_Assignments.controller.AddressBookMain;
import Day_22_Java_Assignments.interfaces.IMultipleAddressBook;

public class MUltimpleAddressBookImplementations implements IMultipleAddressBook{

	ArrayList<AddressBookMain> arList = new ArrayList<AddressBookMain>();
	public int addNewBook(AddressBookMain book) {
		arList.add(book);
		return arList.indexOf(book);
	}

}