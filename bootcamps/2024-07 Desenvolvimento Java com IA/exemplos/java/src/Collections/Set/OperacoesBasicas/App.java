package Set.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
     
        GuestSet guestSet = new GuestSet();

        guestSet.addGuest("P1", 1);
        guestSet.addGuest("P2", 2);
        guestSet.addGuest("P3", 3);
        guestSet.addGuest("P3",41);
        guestSet.addGuest("P4",51);
        guestSet.addGuest("P5",61);
        guestSet.addGuest("P6", 7);
        guestSet.addGuest("P7",31);
        guestSet.addGuest("P8",71);
        guestSet.addGuest("P8", 61);

        System.out.println("Guest count: " + guestSet.countGuests());

        guestSet.showGuests();

        guestSet.removeGuest(7);

        System.out.println("Guest count: " + guestSet.countGuests());

        guestSet.showGuests();
    }
}
