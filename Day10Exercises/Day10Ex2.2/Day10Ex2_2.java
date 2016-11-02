public class Day10Ex2_2 {

  public static void main(String[] args) {

  Day10Ex2_2 workMaths = new Day10Ex2_2();

  System.out.println(workMaths.recursiveFibonacci(12));
  System.out.println(workMaths.iterativeFibonacci(12)); // bring this in when the other one works
  }

  public int recursiveFibonacci(int input) {
    if ((input == 1) || (input == 2)) {
      return 1;
      } else {
        int result = recursiveFibonacci(input-1) + recursiveFibonacci(input-2); // method calls itself
        return result;
      }
  }

  public int iterativeFibonacci(int input) {
    int result = 0;
    int oneBack = 1;
    int twoBack = 1;
    if (input == 1 || input == 2) {
      result = 1;
      return result;
    } else {
      for (int counter = 3; counter <= input; counter++) {
        result = twoBack + oneBack;
        twoBack = oneBack;
        oneBack = result;
      }
    }
    return result;
  }

}
