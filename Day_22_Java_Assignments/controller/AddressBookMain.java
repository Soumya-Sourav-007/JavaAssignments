package Day_22_Java_Assignments.controller;

import java.util.Scanner;

import Day_22_Java_Assignments.interfaces.InterfaceAddressBook;
import Day_22_Java_Assignments.model.Contacts;
import Day_22_Java_Assignments.services.ImplementationsOfAddressBook;

public class AddressBookMain {
	
	private static Scanner getDetailInput = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		InterfaceAddressBook inBook = new ImplementationsOfAddressBook();
		
		Contacts contacts =null; byte menuExitNumber = 0;
		
		inBook.welcomeDisplay(); //welcome_message
		do {
		System.out.println(" 1. Create Contact ");
		System.out.println(" 2. Add New Contact ");
		System.out.println(" 3. Edit Contact ");
		System.out.println(" 4. Delete Contact ");
		System.out.println("-->> Enter Option :: ");
		byte option = getDetailInput.nextByte();
		switch(option) {
		case 1:							//added contact
			contacts = getContacts();
			System.out.println("Added Contact Details :: "+'\n'+contacts);
			break;
		case 2:							//created contact
			contacts = getContacts();
			int index = inBook.createContactDetails(contacts);
			System.out.println(" Contact_ID :: " + index+'\n'+contacts);
			break;
		case 3:
			System.out.println(" Update Details :: "+ '\n' + "Enter Your FirstName :: ");
			inBook.editByName(getDetailInput.next());
			break;
		case 4:
			System.out.println(" Delete Details :: "+ '\n' + "Enter FirstName :: ");
			inBook.deleteByFirstName(getDetailInput.next());
			break;
		}
		
		System.out.println('\n'+" Press 1 :: To check previous options again " + '\n' + " Press 6 :: To Log Out ");
		menuExitNumber = getDetailInput.nextByte();
		}while(menuExitNumber==1);	
		
		
		System.out.println(" Address_Book Closed ");
		
		
		
	}
	
	private static Contacts getContacts() {
		Contacts contacts = new Contacts();
		
		System.out.println(" Enter FirstName:");
		contacts.setFirstName(getDetailInput.next());
		
		System.out.println(" Enter LastName:");
		contacts.setLastName(getDetailInput.next());
		
		System.out.println(" Enter Address:");
		contacts.setAddress(getDetailInput.next());
		
		System.out.println(" Enter City:");
		contacts.setCity(getDetailInput.next());
		
		System.out.println(" Enter State:");
		contacts.setState(getDetailInput.next());
		
		System.out.println(" Enter Email ID:");
		contacts.setEmail(getDetailInput.next());
		
		System.out.println(" Enter Zip:");
		contacts.setZip(getDetailInput.nextInt());
	
		System.out.println(" Enter Phone_Number:");
		contacts.setPhoneNumber(getDetailInput.nextLong());
		
		System.out.println(" Enter Aadhar_Number:");
		contacts.setAadharCardNumber(getDetailInput.nextLong());
		
		return contacts;
	}
}