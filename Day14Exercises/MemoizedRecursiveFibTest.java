import org.junit.*;
import static org.junit.Assert.*;

public class MemoizedRecursiveFibTest {

    private FibonacciCalculator calc;

    @Before
    public void FibSetUp() {
      calc = new FibonacciCalculator();
    }

    @Test
    public void runMemoizedFibTest() {
      assertEquals(1134903170, calc.fib(45)); // takes .005 seconds
    }


}
