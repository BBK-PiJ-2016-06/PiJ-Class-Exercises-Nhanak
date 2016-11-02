public class Day10Ex2_1 {

  public static void main(String[] args) {

  Day10Ex2_1 workMaths = new Day10Ex2_1();

  System.out.println(workMaths.recursiveFactorial(12));
  System.out.println(workMaths.iterativeFactorial(12));

  }

  public int recursiveFactorial(int input) {
    if (input == 1) {
      return 1;
    } else {
        int result = input * recursiveFactorial(input -1);
        return result;
    }
  }

  public int iterativeFactorial(int input) {
    int result = input;
    for (int i = 1; (input-i) > 2; i++) {
      result = result * (input - i);
    }
    result = result*2;
    return result;
  }

}
