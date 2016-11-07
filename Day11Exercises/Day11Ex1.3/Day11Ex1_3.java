public class Day11Ex1_3 {

  public static void main(String[] args) {

    IntegerTreeNode myTree = new IntegerTreeNode(6);

    myTree.add(9);
    myTree.add(8);
    myTree.add(13);
    myTree.add(4);
    myTree.add(2);
    myTree.add(3);
    myTree.add(17);
    myTree.add(1);
    myTree.add(37);
    myTree.add(47);


    System.out.println("The depth of this tree is: " + myTree.depth());

  }
}
