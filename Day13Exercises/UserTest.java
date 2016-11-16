import org.junit.*;
import static org.junit.Assert.*;


public class UserTest {
    private User newUser;
    private Library library;

        @Before
        public void userSetup() {
            newUser = new UserImpl("Nate");
            library = new LibraryImpl("Test Library", 3); // needs to exist to pass through methods
        }

        @Test
        public void testUserName() {
            assertEquals("Nate", newUser.getUserName());
        }

        @Test
        public void testRegister() {
            newUser.register(library);
            assertEquals(1, newUser.getUserID());
        }

       @Test
       public void testGetLibrary(){
           assertEquals("Test Library", newUser.getLibrary());
       }

}
