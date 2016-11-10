import org.junit.*;
import static org.junit.Assert.*;

public class KidPersonTest {


  @Test
  public void testsGetPosition() {
    KidPerson littleTimmy = new KidPerson(3);
    littleTimmy.move(10);
    assertEquals(10, littleTimmy.getPosition());
  }

}
