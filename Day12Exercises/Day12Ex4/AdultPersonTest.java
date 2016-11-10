import org.junit.*;
import static org.junit.Assert.*;

public class AdultPersonTest {

  @Test
  public void testsGetSituation() {
    AdultPerson father = new AdultPerson();
    father.move(26);
    int expectedSituation = 26;
    System.out.println(father.getSituation());
    assertEquals(father.getSituation(), expectedSituation);

  }

}
