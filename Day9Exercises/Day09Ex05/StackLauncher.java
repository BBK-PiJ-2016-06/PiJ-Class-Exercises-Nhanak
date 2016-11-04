public class StackLauncher {

  public static void main(String[] args){

  StackLauncher launcher = new StackLauncher();
  launcher.launch();
  }

  public void launch() {

  GenericStack<Integer> myStack = new GenericStackImpl<Integer>();

  myStack.push(567);
  myStack.push(7889);
  myStack.push(8922);
  System.out.println("Popping... here is the top value: " + myStack.pop());
  System.out.println("Popping... here is the top value: " + myStack.pop());
  System.out.println("Popping... here is the top value: " + myStack.pop());
  System.out.println("Popping... here is the top value: " + myStack.pop());

  GenericStackImpl<Double> myStack2 = new GenericStackImpl<Double>();

  myStack2.push(238.23);
  myStack2.push(33.22);
  myStack2.push(66.6666);
  myStack2.push(383490.3);
  System.out.println("Top value of myStack2 is: " + myStack2.peek());
  System.out.println("Popping... here is the top value: " + myStack2.pop());
  System.out.println("Popping... here is the top value: " + myStack2.pop());
  System.out.println("Popping... here is the top value: " + myStack2.pop());
  System.out.println("Popping... here is the top value: " + myStack2.pop());


  }

}
