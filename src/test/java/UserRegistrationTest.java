import org.example.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserRegistrationTest {

    @Test
    void testUserFirstName(){
        String firstName = "Shraddha";
        assertTrue(UserRegistration.validateUserFirstName(firstName));
    }

    @Test
    void testUserLastName(){
        String firstName = "Shraddha";

        assertTrue(UserRegistration.validateUserFirstName(firstName));
    }

}