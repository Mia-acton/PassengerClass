import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void validPassengerShouldBeCreated() {
        Passenger passenger = new Passenger("Mr", "John", "Smith");
        assertEquals("Mr", passenger.getTitle());
        assertEquals("John", passenger.getFirstName());
        assertEquals("Smith", passenger.getLastName());
    }

    @Test
    void invalidTitleShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Dr", "John", "Smith");
        });
        assertEquals("Invalid title. Must be Mr, Mrs, or Ms.", exception.getMessage());
    }

    @Test
    void shortFirstNameShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "Jo", "Smith");
        });
        assertEquals("First name must be at least 3 characters.", exception.getMessage());
    }

    @Test
    void shortLastNameShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Passenger("Mr", "John", "Li");
        });
        assertEquals("Last name must be at least 3 characters.", exception.getMessage());
    }
}
