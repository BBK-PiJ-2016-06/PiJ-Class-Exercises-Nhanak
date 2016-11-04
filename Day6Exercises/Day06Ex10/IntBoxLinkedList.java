public class IntBoxLinkedList {
  private IntBox firstIntBox;

  public void addIntBox(IntBox newIntBox) {
    if (firstIntBox == null) { // checks if list is empty, if so, newIntBox becomes firstIntBox
      firstIntBox = newIntBox;
    } else if (newIntBox.getValue()<= firstIntBox.getValue()) { // checks if newIntBox has the smallest value
      newIntBox.setNextIntBox(firstIntBox); // if so - newIntBox's next now points at firstIntBox
      firstIntBox = newIntBox;  // newIntBox now gets the title of firstIntBox, while still pointing
        return;
    } else {                     // at the old value of newIntBox
        IntBox current = firstIntBox;
        while (current.getNextIntBox().getValue() < newIntBox.getValue()) {
          current = current.getNextIntBox();
          if (current.getNextIntBox() == null) {
            current.setNextIntBox(newIntBox);
            return;
          }
        }
        if (current.getNextIntBox().getValue() > newIntBox.getValue()) {
          newIntBox.setNextIntBox(current.getNextIntBox());
          current.setNextIntBox(newIntBox);
        }
    }
  }

  public void printList() {
    if (firstIntBox.getNextIntBox() != null) {
      firstIntBox.printIntBox();
    }
  }

}
