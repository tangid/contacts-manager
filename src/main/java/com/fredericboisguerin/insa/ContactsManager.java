
package com.fredericboisguerin.insa;
import java.util.ArrayList;


public class ContactsManager {
    private int maxContact = 0;
    private ArrayList<Contact> allContact = new ArrayList<Contact>();


    public void addContact(String name, String email, String phoneNumber) {
        allContact.add(new Contact(name, email, phoneNumber));
        maxContact = maxContact + 1;
    }

    public void printAllContacts()
    {
        for (Contact contact: allContact)
        {
            if ((contact.email != null) && (contact.phoneNumber != null))
                System.out.print(contact.name + ", " + contact.email + ", " + contact.phoneNumber);
            else if ((contact.email != null) && (contact.phoneNumber == null))
                System.out.print(contact.name + ", " + contact.email);
            else if ((contact.email == null) && (contact.phoneNumber != null))
                System.out.print(contact.name + ", " + contact.phoneNumber);
        }

    }

    public void searchContactByName(String name) {

    }
}
