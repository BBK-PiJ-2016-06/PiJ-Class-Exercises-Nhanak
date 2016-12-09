import java.util.Arrays;


public class Day19Ex02 {

  public static void main(String[] args){
    Day19Ex02 exercise = new Day19Ex02();
    String[] stringArray = {"pizza", "enchilada", "egg", "burgers", "chicken burger", "bacon" };
    System.out.println( "Original array: "  + Arrays.asList(stringArray));

    Arrays.sort(stringArray, Day19Ex02::eChecker );
    System.out.println( "Sorted array by Strings containing 'e' : " + Arrays.asList(stringArray) );

  }

  public static int eChecker(String s1, String s2) {
    int result;
    if (s1.contains("e") && !s2.contains("e")) {
      result = -1;
    } else if (!s1.contains("e") && s2.contains("e")) {
      result = 1;
    } else {
      result = 0;
    }
    return result;
  }
  
}
