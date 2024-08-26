import org.example.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UserRegistrationTest {

//static BufferedReader br;

//    @BeforeAll
//    public static void getConnection(){
//        br = new BufferedReader(new InputStreamReader(System.in));
//    }

    @Test
    void testUserFirstName(){
        String firstName = "Shraddha";
        assertTrue(UserRegistration.validateUserFirstName(firstName));
    }


//    @AfterAll
//    static void closedConnection(){
//        try {
//            br.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}