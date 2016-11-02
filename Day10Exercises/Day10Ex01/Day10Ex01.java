public class Day10Ex01 {

  public static void main(String[] args) {
    Day10Ex01 exercise1 = new Day10Ex01();

    exercise1.printNumbers(6);

  }

  public void printNumbers(int n) {
    if (n <= 0) {
      return;
    }

    System.out.println(n);
    printNumbers(n-2);
    printNumbers(n-3);
    System.out.println(n);

  }
}
