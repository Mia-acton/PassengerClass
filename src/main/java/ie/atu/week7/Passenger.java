package ie.atu.week7;

public class Passenger {
    private String title;
    private String firstName;
    private String lastName;

    public Passenger(String title, String firstName, String lastName) {
        if (!title.equals("Mr") && !title.equals("Mrs") && !title.equals("Ms")) {
            throw new IllegalArgumentException("Invalid title. Must be Mr, Mrs, or Ms.");
        }
        if (firstName.length() < 3) {
            throw new IllegalArgumentException("First name must be at least 3 characters.");
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Last name must be at least 3 characters.");
        }

        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
