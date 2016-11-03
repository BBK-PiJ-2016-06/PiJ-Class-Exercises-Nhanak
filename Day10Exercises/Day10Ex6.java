public class Day10Ex6 {

  public static void main(String[] args) {

  Day10Ex6 gcdExercise = new Day10Ex6();
// call the methods from here
  int p = 15;
  int q = 12;


  System.out.println("The GCD of " + p + " and " + q + " is: " + gcdExercise.gcdCalc(p, q));

  }

  public int gcdCalc(int p, int q) {
    int result = 0;
    if (p%q == 0) {
      return q;
    } else {
      return gcdCalc(q, p%q);
    }
  }
//methods here


}
