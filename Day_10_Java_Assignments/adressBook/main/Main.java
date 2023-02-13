package Day_10_Java_Assignments.adressBook.main;

import java.util.Scanner;

import Day_10_Java_Assignments.adressBook.controller.Controller;
import Day_10_Java_Assignments.adressBook.interfaces.Interfaces;
import Day_10_Java_Assignments.adressBook.services.Implementations;




public class Main {

	static Scanner getUserInput = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Interfaces book = new Implementations();
		int choice =0;
		
		System.out.println(" 1. Add "+ '\n' + " 2. Update"+ '\n' + " 3. Delete"+ '\n' + " 4. show ");
		choice  = getUserInput.nextInt();
		do {
			System.out.println(" 1. Add "+ '\n' + " 2. Update"+ '\n' + " 3. Delete"+ '\n' + " 4. show ");
			choice  = getUserInput.nextInt();
		switch(choice) {
		case 1:
			do {
				Controller controller = getControl();
				int index = book.addContacts(controller);
				System.out.println("Index :: " + index);
				
				System.out.println("again....???");
				choice = getUserInput.nextInt();
			}while(choice == 1);
			break;
		case 2:
			System.out.println(" Enter name to update :: ");
			book.updateByName(getUserInput.next());
			break;
		case 3:
			System.out.println("Enter Name to delete :: ");
			book.deleteByName(getUserInput.next());
			break;
		case 4:
			book.showContacts();
			break;
	
		}
		
		System.out.println("Want to see menu again :: ");
		choice  = getUserInput.nextInt();
		}while(choice == 1);
		
	}
	
	private static Controller getControl() {
		Controller name = new Controller();
		
		System.out.println("Name ::");
		name.setName(getUserInput.next());
		
		System.out.println("City ::");
		name.setCity(getUserInput.next());
		
		System.out.println("PhoneNumber ::");
		name.setPhoneNumber(getUserInput.nextLong());
		
		
		
		
		return name;
		 
	}
}