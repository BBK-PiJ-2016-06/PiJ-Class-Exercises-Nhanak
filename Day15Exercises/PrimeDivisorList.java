import java.util.List;
import java.util.ArrayList;

public class PrimeDivisorList extends ArrayList{

  private Integer[] integerArray = null;

  public void add(Integer num) {
    try {
      if (num == null) {
        throw new NullPointerException();
      }
      boolean isPrime = true;
      for (int i = 2; i < num; i++) {
          if (num%i == 0) {
            isPrime = false;
          }
      }
      if (!isPrime) {
        throw new IllegalArgumentException();
      }
      if (integerArray == null) {
        integerArray = new Integer[1];
        integerArray[0] = num;
      } else {
      integerArray = addToEndOfArray(num);
      }
    } catch (NullPointerException ex) {
      System.out.println("You entered a null value");
    } catch (IllegalArgumentException ex) {
      System.out.println("That number is not prime...");
    }
  }

  public Integer[] addToEndOfArray(Integer number) {
    Integer[] replacementArray = new Integer[integerArray.length + 1];
    for (int i = 0; i < integerArray.length; i++) {
      replacementArray[i] = integerArray[i];
    }
    replacementArray[integerArray.length] = number;
    return replacementArray;
  }

  public int getSize() {
    return integerArray.length;
  }




}
