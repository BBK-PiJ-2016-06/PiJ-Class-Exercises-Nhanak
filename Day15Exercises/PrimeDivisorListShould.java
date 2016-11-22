import org.junit.*;
import static org.junit.Assert.*;

public class PrimeDivisorListShould {

    private PrimeDivisorList myPrimeList;
    private Integer nullNumber;

    @Before
    public void myPrimeListSetUp() {
      myPrimeList = new PrimeDivisorList();
      nullNumber = null;
    }

    @Test
    public void throwANullPointerExceptionWhenANullIntegerIsPassed() {
      myPrimeList.add(nullNumber);
      assertEquals(0, myPrimeList.size());
    }

    @Test
    public void printAnIllegalArgumentExceptionWhenAddingANonNullNumber() {
      myPrimeList.add(4);
      assertEquals(0, myPrimeList.size());
    }

    @Test
    public void myPrimeListSizeShouldBe3AfterAdding3PrimeNumbers() {
      myPrimeList.add(3);
      myPrimeList.add(7);
      myPrimeList.add(11);
      assertEquals(3, myPrimeList.getSize());
    }


}
