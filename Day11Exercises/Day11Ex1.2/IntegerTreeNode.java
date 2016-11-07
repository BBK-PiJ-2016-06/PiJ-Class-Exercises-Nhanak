// co authored by Tim Fisken and Nate Hanak

public class IntegerTreeNode {

  private int value;
  private IntegerTreeNode left;
  private IntegerTreeNode right;

  public IntegerTreeNode(int value) { // constructor method for a new tree node, setting value and null
    this.value = value; // values for the new node's left and right
    left = null;
    right = null;
  }

  public void add(int newValue) {
      if (newValue > this.value) { // if newValue is greater than this value, tree goes off to the right
        if (right == null) {
          right = new IntegerTreeNode(newValue);
        } else {
            right.add(newValue);
          }
      } else {
          if (left == null) {  // this searches the left side of the node tree for a null space
            left = new IntegerTreeNode(newValue);
          } else {
            left.add(newValue);
            }
      }
  }

  public boolean contains(int findValue) {
    if (this.value == findValue) {
      return true;
    } else if (findValue > this.value) {
      if (right == null ) {
        return false;
      } else {
          return right.contains(findValue);
        }
    } else {
      if (left == null) {
        return false;
      } else {
          return left.contains(findValue);
        }
      }
  }

  public int getMax() {
    if (right == null) {  // left side - means we are out of rights, and since
      return this.value; // going to the right gets progressively higher, we have arrived at the last right.
    } else {
      return right.getMax();
      }
  }

  public int getMin() {
    if (left == null) {
      return this.value;
    } else {
      return left.getMin();
    }
  }

  public String toString() {
    String leftSide, rightSide;
    if (left == null && right == null) {
      String printedTree = "[" + this.value + " L[] " + " R[] " + "]";
      return printedTree;
    }
    if (left != null) {
      leftSide = left.toString();
    } else {
      leftSide = "";
      }
    if (right != null) {
      rightSide = right.toString();
    } else {
      rightSide = "";
    }
    String printedTree = "[" + this.value + " L[ " + leftSide + "] " + " R[" + rightSide + "] " + "]";
    return printedTree;
  }

}
