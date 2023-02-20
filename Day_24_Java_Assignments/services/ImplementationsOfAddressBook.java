package Day_24_Java_Assignments.services;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import Day_24_Java_Assignments.interfaces.InterfaceAddressBook;
import Day_24_Java_Assignments.model.Contacts;

public class ImplementationsOfAddressBook implements InterfaceAddressBook{

	private static Scanner getDetailInput = new Scanner(System.in);
	ArrayList<Contacts> storeContactDelails = new ArrayList<Contacts>();
	
	public void welcomeDisplay() {
		
		System.out.println(" Welcome To Address_Book ");
		
		
	}

	public int createContactDetails(Contacts contacts) {
		System.out.println(" List of All the Contscts ");
		storeContactDelails.add(contacts);
		return storeContactDelails.indexOf(contacts);
	}
	

	public void editByName(String firstName) {
		storeContactDelails.stream().filter(name->name.getFirstName().equalsIgnoreCase(firstName)).forEach(name->editContactDetails(name));
	}
	
	//Edit-Update details
		private void editContactDetails( Contacts contacts) {
		Contacts con = new Contacts();
		
		byte loopExit = 1; 
			do {
				System.out.println("Choose Option to Update :: " + '\n' + " 1.FirstName " + '\n' + " 2.LastName " + '\n' + " 3.Address "
						+ '\n' + " 4.City " + '\n' + " 5.State " + '\n' + " 6.Zip " + '\n'
								+ " 7.PhoneNumber " + '\n' + " 8.Aadhar_Number " + '\n' + " 9.Email_ID ");
				byte option = getDetailInput.nextByte();
				
				switch(option) {
				case 1:
						System.out.println(" FirstName :: "); 
						contacts.setFirstName(getDetailInput.next());
					break;
				case 2:
						System.out.println(" LastName :: ");
						contacts.setLastName(getDetailInput.next());
					break;
				case 3:
						System.out.println(" Address :: ");
						con.setAddress(getDetailInput.next());
					break;
				case 4:
						System.out.println(" City :: ");
						contacts.setCity(getDetailInput.next());
					break;
				case 5:
						System.out.println(" State :: ");
						contacts.setState(getDetailInput.next());
					break;
				case 6:
						System.out.println(" Zip :: ");
						contacts.setZip(getDetailInput.nextInt());
					break;
				case 7:
						System.out.println(" PhoneNumber :: ");
						contacts.setPhoneNumber(getDetailInput.nextLong());
					break;
				case 8:
						System.out.println(" AadharNumber :: ");
						con.setAadharCardNumber(getDetailInput.nextLong());
					break;
				case 9:
						System.out.println(" Email_ID :: ");
						contacts.setEmail(getDetailInput.next());
					break;
				default:
					System.out.println(" Invalid Input ");
				}
				System.out.println(" Press 1: If you want to update anything else " + '\n' + " Press 0: Exit to Menu ");
				loopExit = getDetailInput.nextByte();
			}while(loopExit != 0);
		}
		
		private void contactDetailsPrint( Contacts contacts) {
			if(contacts != null) {
				System.out.println(" Contact Details ");
				System.out.println(" FirstName = " + contacts.getFirstName());
				System.out.println(" LastName = " + contacts.getLastName());
				System.out.println(" Address = " + contacts.getAddress());
				System.out.println(" City = " + contacts.getCity());
				System.out.println(" State = " + contacts.getState());
				System.out.println(" Zip = " + contacts.getZip());
				System.out.println(" PhoneNumber = " + contacts.getPhoneNumber());
				System.out.println(" AadharCard Number = " + contacts.getAadharCardNumber());
				System.out.println(" Email ID = " + contacts.getEmail());
				System.out.println("");
			}
		}

		public void deleteByFirstName(String firstname) {
			
			storeContactDelails.removeAll(storeContactDelails.stream().filter(name->name.getFirstName().equalsIgnoreCase(firstname)).collect(Collectors.toList()));	
		}
		
		private void showAllContacts() {
			System.out.println(" All Available Contacts ");
			for(int i = 0; i < storeContactDelails.size(); i++) {
				Contacts contacts = storeContactDelails.get(i);
				if(null != storeContactDelails.get(i)) {
				System.out.println(" Serial No.:: ABRN_ "+ i );
				contactDetailsPrint(contacts);
				}	
			}
		}

	

		
		public void countByCityOrState(String input) {
				long number = storeContactDelails.stream().count();
				System.out.println(" Number of records as per City :: " + number);
		
		}

		
		public void sortByNameCityStateZip(String input) {
			System.out.println(" Enter option :: " +'\n' +" 1.Name"+'\n'+ "2.City"+'\n' +" 3.State"+'\n'+ "4.Zip");
			String str = getDetailInput.next();
			if(str.equalsIgnoreCase("Name")) {
			storeContactDelails.stream().map(name->name.getFirstName()).sorted().collect(Collectors.toList());
			}else if(str.equalsIgnoreCase("City")) {
			storeContactDelails.stream().map(city->city.getCity()).sorted().collect(Collectors.toList());
			}else if(str.equalsIgnoreCase("State")) {
			storeContactDelails.stream().map(state->state.getState()).sorted().collect(Collectors.toList());
			}else {
				storeContactDelails.stream().map(state->state.getState()).sorted().collect(Collectors.toList());	
			}
		}
		
		
}