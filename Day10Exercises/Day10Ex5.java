public class Day10Ex5 {

  public static void main(String[] args) {

  Day10Ex5 powerExercise = new Day10Ex5();
// call the methods from here
  int num1 = 6;
  int num2 = 9;

  System.out.println(num1 + " to the power of " + num2 + " is: " + powerExercise.powerCalc(num1, num2));

  }

  public int powerCalc(int a, int b) {
    if (b == 0) {
      return 1;
    } else {
      int result = a * powerCalc(a, (b-1));
      return result;
    }
  }
//methods here


}
