public class FibonacciCalculatorLongs {

  public static void main(String[] args){

    FibonacciCalculator f = new FibonacciCalculator();
    System.out.println("n: fib="+f.fib(47));
  }

  private long[] precalculated;

  public long fib(long n) {
    int longReplace = (int) n;
    if (precalculated == null) {
      initPrecalculatedArray(n);
    }
    if (precalculated[longReplace-1] != -1) {
      return precalculated[longReplace-1];
    } else {
        long result = fib(n-1) + fib(n-2);
        precalculated[longReplace-1] = result;
        return result;
      }
  }

  private void initPrecalculatedArray(long size) {
    int longReplace = (int) size;
    precalculated = new long[longReplace];
    for (int i = 0; i < precalculated.length; i++) {
      precalculated[i] = -1; // to indicate "not calculated yet"
    }
    precalculated[0] = 1; // F(1)
    precalculated[1] = 1; // F(2)
  }

  public static long recursiveFibonacci(long input) {
    if ((input == 1) || (input == 2)) {
      return 1;
      } else {
        long result = recursiveFibonacci(input-1) + recursiveFibonacci(input-2); // method calls itself
        return result;
      }
  }


}
