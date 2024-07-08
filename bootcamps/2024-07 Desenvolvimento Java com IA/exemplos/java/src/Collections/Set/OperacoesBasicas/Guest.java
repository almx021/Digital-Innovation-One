package Set.OperacoesBasicas;

import java.util.Objects;

public class Guest {
    private String name;
    private int inviteCode;
    
    public Guest(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getinviteCode() {
        return inviteCode;
    }

    public void setinviteCode(int inviteCode) {
        this.inviteCode = inviteCode;
    }

    @Override
    public String toString() {
        return "Guest [name=" + name + ", inviteCode=" + inviteCode + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(getinviteCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Guest other = (Guest) obj;
        if (inviteCode != other.inviteCode)
            return false;
        return true;
    }

    
}
