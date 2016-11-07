public class Day11Ex1_1 {

  public static void main(String[] args) {

    IntegerTreeNode myTree = new IntegerTreeNode(6);

    System.out.println("The max is currently: " + myTree.getMax());
    System.out.println("The min is currently: " + myTree.getMin());
    myTree.add(9);
    myTree.add(13);
    System.out.println("The max is currently: " + myTree.getMax()); // should be 13
    System.out.println("The min is currently: " + myTree.getMin()); // should be 6
    myTree.add(4);
    myTree.add(2);
    myTree.add(17);
    myTree.add(1);
    System.out.println("The max is currently: " + myTree.getMax()); // should be 17
    System.out.println("The min is currently: " + myTree.getMin()); // should be 1
  }
}
