public class Day14Ex1b {

  public static void main(String[] args) {
    Day14Ex1b exercise = new Day14Ex1b();
    exercise.launch();
  }

  public void launch() {
    int j = mcCarthy91(50);
    System.out.println("final answer is " + j);
    System.out.println();

    int k = mcCarthy91(73);
    System.out.println("final answer is " + k);
    System.out.println();

    int l = mcCarthy91(95);
    System.out.println("final answer is " + l);
    System.out.println();
  }

  public int mcCarthy91(int n) {
    if (n > 100) {
      return n - 10;
    } else {
      System.out.println(n);
      return mcCarthy91(mcCarthy91(n+11));
    }
  }

}
