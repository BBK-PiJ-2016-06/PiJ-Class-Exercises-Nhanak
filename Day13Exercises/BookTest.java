import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
        private Book b;

        @Before
        public void bookSetUp() {
            b = new BookImpl("Dickens", "Great Expectations");
        }

        @Test
        public void testAuthorName() {
            assertEquals("Dickens", b.getAuthorName());
        }

        @Test
        public void testBookTitle() {
            assertEquals("Great Expectations", b.getBookTitle());
        }


}
