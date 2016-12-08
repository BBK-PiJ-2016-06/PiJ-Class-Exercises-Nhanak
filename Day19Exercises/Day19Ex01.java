import java.util.Arrays;


public class Day19Ex01 {

  public static void main(String[] args){
    Day19Ex01 exercise = new Day19Ex01();
    String[] stringArray = {"pizza", "enchilada", "egg", "burgers", "chicken burger", "bacon" };
    System.out.println( "Original array: "  + Arrays.asList(stringArray));
    Arrays.sort(stringArray, (s1 , s2) -> s1.length() - s2.length());
  /** sort() takes 2 parameters: an array and then a comparator. Everything to the right of the first comma
    think of like this: new comparatorImpl(  (s1 , s2) -> s1.length() - s2.length()  ) . Which translates to:

                        public class comparatorImpl implements Comparator {

                          public int compare(String s1, String s2) { //default method of Comparator
                            return s1.length() - s2.length()
                          }
                        }
  */
    System.out.println( "Sorted array by String length (short-> long): " + Arrays.asList(stringArray) );

    Arrays.sort(stringArray, (s1, s2) -> s2.length() - s1.length());
    System.out.println( "Sorted array by String length (long -> short) : " + Arrays.asList(stringArray) );
    Arrays.sort(stringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
    System.out.println( "Sorted array by first letter : " + Arrays.asList(stringArray) );
    Arrays.sort(stringArray, (s1, s2) -> {
                                        int result;
                                        if (s1.contains("e") && !s2.contains("e")) {
                                          result = -1;
                                        } else if (!s1.contains("e") && s2.contains("e")) {
                                          result = 1;
                                        } else {
                                          result = 0;
                                        }
                                        return result;
                                      } );
    System.out.println( "Sorted array by Strings containing 'e' : " + Arrays.asList(stringArray) );

  }
}
