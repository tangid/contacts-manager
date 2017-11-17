
package com.fredericboisguerin.insa;
import java.util.ArrayList;


public class ContactsManager {
    private int maxContact = 0;
    private ArrayList<Contact> allContact = new ArrayList<Contact>();


    public void addContact(String name, String email, String phoneNumber) throws InvalidContactNameException {
        if ((name == null) || (name == "")){
            throw new InvalidContactNameException("no name");
        }

        allContact.add(new Contact(name, email, phoneNumber));
        maxContact = maxContact + 1;
    }

    public void printAllContacts()
    {
        for (Contact contact: allContact)
        {

            System.out.print(contact.name);
            if (contact.email != null)
                System.out.print(", " + contact.email);
            if (contact.phoneNumber != null)
                System.out.print(", " + contact.phoneNumber);
        }

    }

    public void searchContactByName(String name) {
        for (Contact contact: allContact)
        {
            if ((contact.name.toLowerCase()).contains(name))
            {
                System.out.print(contact.name);
                if (contact.email != null)
                    System.out.print(", " + contact.email);
                if (contact.phoneNumber != null)
                    System.out.print(", " + contact.phoneNumber);

                System.out.println();
            }
        }
    }
}
