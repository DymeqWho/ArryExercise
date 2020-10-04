package listhomework3;


import java.util.Objects;

public class Email {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return email;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (!(object instanceof Email)) return false;
        Email toCompare = (Email) object;
        boolean emailEquals = this.email.equals(toCompare.email);
        return emailEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }



}
