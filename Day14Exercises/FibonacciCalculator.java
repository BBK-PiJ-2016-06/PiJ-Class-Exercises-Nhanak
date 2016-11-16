public class FibonacciCalculator {

  public static void main(String[] args){

    FibonacciCalculator f = new FibonacciCalculator();
    System.out.println("n: fib="+f.fib(47)); // int of 46 is the largest int this can handle - otherwise it gets to
                                            // overflow and breaks
  }

  private int[] precalculated;

  public int fib(int n) {
    if (precalculated == null) {
      initPrecalculatedArray(n);
    }
    if (precalculated[n-1] != -1) {
      return precalculated[n-1];
    } else {
        int result = fib(n-1) + fib(n-2);
        precalculated[n-1] = result;
        return result;
      }
  }

  private void initPrecalculatedArray(int size) {
    precalculated = new int[size];
    for (int i = 0; i < precalculated.length; i++) {
      precalculated[i] = -1; // to indicate "not calculated yet"
    }
    precalculated[0] = 1; // F(1)
    precalculated[1] = 1; // F(2)
  }

  public static int recursiveFibonacci(int input) {
    if ((input == 1) || (input == 2)) {
      return 1;
      } else {
        int result = recursiveFibonacci(input-1) + recursiveFibonacci(input-2); // method calls itself
        return result;
      }
  }


}
