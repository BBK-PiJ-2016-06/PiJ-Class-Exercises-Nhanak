public class GenericStackNode<N extends Number> {

  private N value;
  private GenericStackNode<N> nextNode;

  public GenericStackNode(N value){ //constructor method sets value
    this.value = value;
    nextNode = null;
  }

  public N getValue() {// returns value of value
    return value;
  }

  public GenericStackNode<N> getNextNode() { // returns nextNode
    return nextNode;
  }

  public void setNextNode(GenericStackNode<N> newNode) {   // sets nextNode
    nextNode = newNode;
  }

}
