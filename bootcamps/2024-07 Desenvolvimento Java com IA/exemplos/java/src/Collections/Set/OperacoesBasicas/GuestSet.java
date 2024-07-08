package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class GuestSet {
    private Set<Guest> guestSet;

    public GuestSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int inviteCode) {
        guestSet.add(new Guest(name, inviteCode));
    }

    public void removeGuest(int inviteCode) {
        Guest guestToRemove = null;

        for (Guest guest : guestSet) {
            if (guest.getinviteCode() == inviteCode) {
                guestToRemove = guest;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }

}
