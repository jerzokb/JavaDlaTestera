package ZadDom2.Model;

import java.util.Objects;

public class BugReporter {

    private String firstName;
    private String lastName;
    private String ownerEmail;

    public BugReporter(String firstName, String lastName, String ownerEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ownerEmail = ownerEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        if (!ownerEmail.contains("@")) {
            System.out.println("Email adrress MUST contain @ sign!");
        } else {
            this.ownerEmail = ownerEmail;
        }
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ownerEmail='" + ownerEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(ownerEmail, that.ownerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, ownerEmail);
    }
}
