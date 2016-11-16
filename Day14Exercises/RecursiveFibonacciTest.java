import org.junit.*;
import static org.junit.Assert.*;

public class RecursiveFibonacciTest {

    private int forty = 40;
    private int fortyFive = 45;
    private FibonacciCalculator calc; 

    @Before
    public void FibSetUp() {
      FibonacciCalculator calc = new FibonacciCalculator();
    }

    @Test
    public void recursiveFibonacciWorks() {
      assertEquals(1134903170, calc.recursiveFibonacci(fortyFive));
    }


}
