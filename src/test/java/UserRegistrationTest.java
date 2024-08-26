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

    @Test
    void testMobNoValidation(){
        String mobNo = "+91 8975847382";

        assertTrue(UserRegistration.validateMobNo(mobNo));

        mobNo = "2345135";
        assertFalse(UserRegistration.validateMobNo(mobNo));
    }

    @Test
    void testPasswordValidation(){
        String password = "Shraddha@123";
        assertTrue(UserRegistration.validatePassword(password));

        password = "shraddha123";
        assertFalse(UserRegistration.validatePassword(password));
    }

}