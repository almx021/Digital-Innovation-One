package Map.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        contactBook.addContact("andre", 1);
        contactBook.addContact("bernardo", 2);
        contactBook.addContact("carla", 3);
        contactBook.addContact("bernardo", 4);
        contactBook.addContact("douglas", 5);
        contactBook.addContact("douglas luiz", 6);

        System.out.println("Contacts count: " + contactBook.countContacts());
        contactBook.showContacts();

        System.out.println("Número do contato: " + contactBook.getContactNumber("douglas"));

    }
}
