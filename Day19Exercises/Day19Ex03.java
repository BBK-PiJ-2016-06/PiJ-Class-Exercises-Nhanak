
public class Day19Ex03 {

  public static void main(String[] args) {

    String first = "Here's Johnny!";
    String second = "You talkin to me?";
    String result = betterString(first, second, (s1, s2) -> s1.length() > s2.length() );
    System.out.println("This String is longer: " + result);
  }

  public static String betterString(String one, String two, TwoStringPredicate tSP) {
      if (tSP.trueIfFirstStringIsBetter(one, two)) {
        return one;
      } else {
        return two;
      }
  }

}
