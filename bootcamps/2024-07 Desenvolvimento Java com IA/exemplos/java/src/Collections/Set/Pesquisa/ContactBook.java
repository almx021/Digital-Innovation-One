package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ContactBook {
    private Set<Contact> contactBook;

    public ContactBook() {
        this.contactBook = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contactBook.add(new Contact(name, number));
    }
    
    public int countContacts(){
        return contactBook.size(); 
    }

    public void showContacts(){
        System.out.println(contactBook);
    }

    public Set<Contact> searchContactByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();

        if (!contactBook.isEmpty()) {
            for (Contact contact : contactBook) {
                if (contact.getName().startsWith(name)) {
                    contactsByName.add(contact);
                }
            }
        }   
        return contactsByName;
    }

    public Contact updateContactNumber(String name, int number) {
        Contact updatedContact = null;

        if (!contactBook.isEmpty()) {
            for (Contact contact : contactBook) {
                if (contact.getName().equalsIgnoreCase(name)) {
                    contact.setNumber(number);
                    updatedContact = contact;
                    break;
                }
            }
        }

        return updatedContact;
    }
}
