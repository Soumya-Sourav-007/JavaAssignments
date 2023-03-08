package Day_22_Java_Assignments.services;

import java.util.ArrayList;
import java.util.HashMap;

import Day_22_Java_Assignments.controller.AddressBookMain;
import Day_22_Java_Assignments.interfaces.IMultipleAddressBook;
import Day_22_Java_Assignments.model.Contacts;

public class MUltimpleAddressBookImplementations implements IMultipleAddressBook{


	ArrayList<AddressBookMain> arList = new ArrayList<AddressBookMain>();
	ArrayList<Contacts> storeContactDelails = new ArrayList<Contacts>();
	HashMap<String, String> hashMap = new HashMap<>();
	
	public int addNewBook(int index, AddressBookMain book) {
		arList.add(index, book);
		return arList.indexOf(book);
	}
	public void accessAddressBook(int index) {
		AddressBookMain list = arList.get(index);
		System.out.println(list);
	}
	public void searchByCityOrState(String string) {
		storeContactDelails.stream().filter(data->data.getCity().contentEquals(string)).forEach(data->System.out.println(data));
		storeContactDelails.stream().filter(data->data.getState().contentEquals(string)).forEach(data->System.out.println(data));
	}
	public void viewCityOrState(String string) {
		storeContactDelails.stream().filter(data->data.getCity().contentEquals(string)).forEach(data-> System.out.println(data.getFirstName()));
		storeContactDelails.stream().filter(data->data.getState().contentEquals(string)).forEach(data-> System.out.println(data.getFirstName()));
	}

	public void sortAlphabeticallyByFirstName() {
		storeContactDelails.stream().sorted().forEach(data->System.out.println(data.getFirstName()));
	}
	
	public void countBycityAndState(String string) {
		long reserve = storeContactDelails.stream().filter(data->data.getCity().contentEquals(string)).count();
		System.out.println(" No Of City/State :: " + reserve);
		
	}
	@Override
	public void sortEntriesByCityStateOrZip(String string) {
		if(string.equalsIgnoreCase("State")) {
			storeContactDelails.stream().map(data->data.getState()).sorted().forEach(data->System.out.println(data));
		}else if(string.equalsIgnoreCase("City")) {
			storeContactDelails.stream().map(data->data.getCity()).sorted().forEach(data->System.out.println(data));
		}else if(string.equalsIgnoreCase("zip")) {
			storeContactDelails.stream().map(data->data.getZip()).sorted().forEach(data->System.out.println(data));
		}else {
			
		}
		
	}


}