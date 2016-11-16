public class Day14ex2 {

  public static void main(String[] args) {

  Day14ex2 exercise2 = new Day14ex2();
  exercise2.launch();
  }

  public void launch() {

  int forty = 40;
  int fortyFive = 45;
  FibonacciCalculator calc = new FibonacciCalculator();

  System.out.println("The 40th position of Fib sequence is:" + calc.recursiveFibonacci(forty));
  System.out.println("The 45th position of Fib sequence is:" + calc.recursiveFibonacci(fortyFive));

  }

}
