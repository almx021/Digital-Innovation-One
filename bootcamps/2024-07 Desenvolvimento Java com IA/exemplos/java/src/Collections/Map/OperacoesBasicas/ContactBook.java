package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class ContactBook {
    private Map<String, Integer> contactBook;

    public ContactBook() {
        this.contactBook = new HashMap<>();
    }

    public void addContact(String name, Integer number) {
        contactBook.put(name, number);
    }

    public void removeContact(String name) {
        if (!contactBook.isEmpty()) {
            contactBook.remove(name);
        }
    }

    public int countContacts() {
        return contactBook.size();
    }

    public void showContacts() {
        System.out.println(contactBook);
    }

    public Integer getContactNumber(String name){
        Integer contactNumber = null; 
       
        if (!contactBook.isEmpty()) {
            contactNumber = contactBook.get(name);
        }

        return contactNumber;
    }

}
