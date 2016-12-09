
public class Day19Ex04 {

  public static void main(String[] args) {

    String first = "Here's Johnny!";
    String second = "You talkin to me?";
    String result = betterElement(first, second, (s1, s2) -> s1.length() > s2.length() );
    System.out.println("This String is longer: " + result);
    int result2 = betterElement(345, 4480, (i1, i2) -> i1 > i2);
    System.out.println("This int is bigger: " + result2);
  }

  public static <T> T betterElement(T one, T two, TwoElementPredicate<T> tEP) {
      if (tEP.trueIfFirstElementIsBetter(one, two)) {
        return one;
      } else {
        return two;
      }
  }

}
