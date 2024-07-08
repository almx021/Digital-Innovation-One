package List.Ordenacao;

public class App {
    public static void main(String[] args) {
        PersonOrdener personOrdener = new PersonOrdener();

        personOrdener.addPerson("P1", 12, 1.40);
        personOrdener.addPerson("P2", 14, 1.60);
        personOrdener.addPerson("P4", 12, 1.30);
        personOrdener.addPerson("P3", 16, 1.60);
        personOrdener.addPerson("P5", 10, 1.45);
        personOrdener.addPerson("P7", 18, 2);
        personOrdener.addPerson("P6", 15, 1.80);
    
        System.out.println(personOrdener.orderByAge());
        System.out.println(personOrdener.orderByHeight());
    
    }
}
