import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {

  @Test
  public void testsNormalName() {
    Person p = new Person();
    String input = "Daniel Radcliffe Yeah";
    String output = p.getInitials(input);
    String expected = "DRY";
    assertEquals(expected, output);
  }

}

/**
For an interactive version where you can test different inputs:

@Test
public void testsNormalName() {
  Person p = new Person();
  System.out.println("Put in a name:");
  String input = System.console().readLine();
  String output = p.getInitials(input);
  System.out.println("Put in what you think the results should be:");
  String expected = System.console().readLine();
  assertEquals(expected, output);
}

*/
