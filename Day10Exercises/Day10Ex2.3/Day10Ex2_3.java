public class Day10Ex2_3 {

  public static void main(String[] args) {
    Day10Ex2_3 hanoiTower = new Day10Ex2_3();

    int numberOfDisks = 5;
    System.out.println("Number of moves needed to move " + numberOfDisks + " is: " + hanoiTower.moves(numberOfDisks));

  }

  public int moves(int numberOfDisks) {
    if (numberOfDisks == 1) {
      return 1;
    }
    return  1 + (2 * moves(numberOfDisks - 1));
    }

}
