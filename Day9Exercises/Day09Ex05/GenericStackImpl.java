public class GenericStackImpl<N extends Number> implements GenericStack<N> {

  private GenericStackNode<N> firstNode = null;

  public void push(N newValue) { // adds a GenericStackNode to top of stack
    GenericStackNode<N> currentNode = new GenericStackNode<N>(newValue);
    if (firstNode == null) { // can also refer to isEmpty (see Pop)
      firstNode = currentNode;
    } else {
      currentNode.setNextNode(firstNode);
      firstNode = currentNode;
    }
  }

  public N pop() { // returns the value of the node on "top" and removes it from the stack
    if (isEmpty()) {
      return null;
    }
    N valueToReturn = firstNode.getValue();  // creates a temporary holder for the value so it can be returned
    firstNode = firstNode.getNextNode(); // changes firstNode to be the value of its own getNext
    return valueToReturn;
  }

  public N peek() {
    return firstNode.getValue();
  }

  public boolean isEmpty() {
    if (firstNode == null) {
      return true;
    } else {
      return false;
    }
  }

}
