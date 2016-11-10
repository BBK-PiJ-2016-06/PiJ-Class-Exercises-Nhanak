import org.junit.*;
import static org.junit.Assert.*;

public class TestPersonQueue {

  @Test
  public void emptyListReturnsNull() {
    PersonQueue myList = new PersonQueueLinkedList(); // will I have to instantiate a version of the
    assertNull(myList.retrieve());            // interface in this manner? Must have to, because
                                          // otherwise I can't really do anything with the interface. Right?
  }

  @Test
  public void occupiedLineDoesNotRetrieveNull() {
    PersonQueue myList = new PersonQueueLinkedList();
    Person shopper = new Person("Frank", "Bacon");
    myList.insert(shopper);
    assertNotNull(myList.retrieve());
  }

  @Test
  public void insertingThenRetrievingTwiceReturnsNull() {
    PersonQueue myList = new PersonQueueLinkedList();
    Person shopper = new Person("Frank", "Bacon");
    myList.insert(shopper);
    myList.retrieve();
    assertNull(myList.retrieve()); 
  }

}
