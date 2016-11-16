import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {
    Library newLibrary;
    LibraryImpl libraryImpl;
    UserImpl registeredUser;
    UserImpl unregisteredUser;

    @Before
    public void librarySetUp() {
        newLibrary = new LibraryImpl("Birkbeck Library", 3);
        registeredUser = new UserImpl("Steve");
        registeredUser.register(newLibrary);
        unregisteredUser = new UserImpl("Mary");
    }

    @Test
    public void testGetLibraryName() {
        assertEquals("Birkbeck Library", newLibrary.getLibraryName());
    }

    @Test
    public void testGetLibraryID() {
        assertEquals(0, newLibrary.getID("Steve") );
    }

    @Test
    public void getMaxBooksPerUser() {
        assertEquals(3, newLibrary.getMaxBooksPerUser());
    }

    @Test
    public void setMaxBooksPerUser() {
        newLibrary.setMaxBooksPerUser(6);
        assertEquals(6, newLibrary.getMaxBooksPerUser());
    }

    @Test
    public void getIDReturnsIDOfRegisteredUser() {
      int result = newLibrary.getID("Steve");
      int expected = 0;
      assertEquals(expected, result);
    }

    @Test
    public void getIDReturns1() {
      unregisteredUser.register(libraryImpl);
      int result = newLibrary.getID("Mary");
      assertEquals(1, result);
    }


}
