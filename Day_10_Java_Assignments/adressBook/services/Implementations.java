package Day_10_Java_Assignments.adressBook.services;

import java.util.ArrayList;
import java.util.Scanner;

import Day_10_Java_Assignments.adressBook.controller.Controller;
import Day_10_Java_Assignments.adressBook.interfaces.Interfaces;


public class Implementations<T> implements Interfaces {

	Scanner SCANNER = new Scanner(System.in);
	ArrayList<Controller> storeHouse = new ArrayList<Controller>();
	
	
	public int addContacts(Controller controller) {
		System.out.println("Adding Contacts ::");
		storeHouse.add(controller);
		showContacts();
		return storeHouse.indexOf(controller);
	}

	public void updateByName(String name) {
		for(int i = 0;i < storeHouse.size(); i++) {
			Controller controller = storeHouse.get(i);
			if(null != controller && name.equalsIgnoreCase(controller.getName())) {		
				System.out.println("1.name"+'\n'+"2.city"+ '\n'+ "3.phonenumber");
				int choice = SCANNER.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the Name :: ");
					controller.setName(SCANNER.next());
					break;
				case 2:
					System.out.println("Enter the City :: ");
					controller.setCity(SCANNER.next());
					break;
				case 3:
					System.out.println("Enter the PhoneNumber :: ");
					controller.setPhoneNumber(SCANNER.nextLong());
					break;
				}
			}
			showContacts();
		}	
	}

	public void deleteByName(String name) {
		for(int i = 0;i < storeHouse.size(); i++) {
			Controller controller = storeHouse.get(i);
			if(null != controller && name.equalsIgnoreCase(controller.getName())) {
				storeHouse.remove(i);
			}
		}showContacts();		
	}

	public void showContacts() {
		for(int i = 0;i< storeHouse.size(); i++) {
			Controller controller = storeHouse.get(i);
			if(null != controller) {
				System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+'\n');
				System.out.println("Name :: "+ controller.getName());
				System.out.println("City :: "+ controller.getCity());
				System.out.println("PhoneNumber :: "+ controller.getPhoneNumber());
				System.out.println('\n'+"^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
		}	
	}
	
	
	
}
