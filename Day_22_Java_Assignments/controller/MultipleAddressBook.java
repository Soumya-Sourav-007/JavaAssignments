package Day_22_Java_Assignments.controller;

import java.util.Scanner;

import Day_22_Java_Assignments.interfaces.IMultipleAddressBook;
import Day_22_Java_Assignments.services.MUltimpleAddressBookImplementations;

public class MultipleAddressBook {

	private static AddressBookMain getNewAddressBook(String[] args) {
		AddressBookMain newBook = new AddressBookMain();
		newBook.main(args);
		return newBook;
	}

	public static void main(String[] args) {

		Scanner getInput = new Scanner(System.in);

		IMultipleAddressBook iBook = new MUltimpleAddressBookImplementations();
		int i = 0;
		do {
		System.out.println("<<<<<Address Book>>>>>" + '\n' + " 1.Add_Input " + '\n' + " 2.Acsess_AddressBook " + '\n'
				+ " Enter_option :: ");
		switch (getInput.nextByte()) {
		case 1:
			iBook.addNewBook(i, getNewAddressBook(args));
			i++;
			break;
		case 2:
			System.out.println(" Enter AddressBook ID 1:: ");
			iBook.accessAddressBook(getInput.nextInt());
			break;
		}
		System.out.println(" Press 1:: Re-Visit Menu");
		}while(getInput.nextInt() == 1);
		
	
	}

}
