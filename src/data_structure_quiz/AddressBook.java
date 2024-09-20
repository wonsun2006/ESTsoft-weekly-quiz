package data_structure_quiz;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<Contact> contacts;

	public AddressBook(){
		this.contacts = new ArrayList<>();
	}

	public void displayContacts(){
		for(Contact contact : contacts){
			System.out.println(contact);
		}
	}

	public List<Contact> searchContact(String name){
		List<Contact> searchContacts = new ArrayList<>();
		for(Contact contact : contacts){
			if(contact.getName().equals(name)){
				searchContacts.add(contact);
			}
		}
		return searchContacts;
	}

	public void addContact(Contact contact){
		contacts.add(contact);
	}
}
