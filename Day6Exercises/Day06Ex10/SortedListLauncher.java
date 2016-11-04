public class SortedListLauncher {

  public static void main(String[] args) {
    SortedListLauncher newList = new SortedListLauncher();

    newList.launch();
  }

  public void launch() {

    IntBoxLinkedList myList = new IntBoxLinkedList();

    IntBox input = new IntBox(6);
    myList.addIntBox(input);
    input = new IntBox(4);
    myList.addIntBox(input);
    input = new IntBox(454);
    myList.addIntBox(input);
    input = new IntBox(123);
    myList.addIntBox(input);
    input = new IntBox(62);
    myList.addIntBox(input);
    input = new IntBox(61);
    myList.addIntBox(input);
    myList.printList();
    input = new IntBox(690);
    myList.addIntBox(input);
    input = new IntBox(216);
    myList.addIntBox(input);
    input = new IntBox(296);
    myList.addIntBox(input);
    input = new IntBox(88);
    myList.addIntBox(input);
    input = new IntBox(222);
    myList.addIntBox(input);
    myList.printList();

  }
}
