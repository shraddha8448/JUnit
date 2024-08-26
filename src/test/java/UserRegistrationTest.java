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

    @Test
    void testEmailValidation(){
        String email = "shraddhajadhav834@gmail.com";

        // Valid
        assertTrue(UserRegistration.validateEmailId(email));

        email = "shraddha@";
        // Invalid email addresses
        assertFalse(UserRegistration.validateEmailId(email));           // Invalid TLD length
    }


}