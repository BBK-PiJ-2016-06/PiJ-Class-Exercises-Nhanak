public class DoubleLinkList<T> {

    private DoublyLinkedElement<T> firstElement = null;

    public void addElement(DoublyLinkedElement<T> newElement) { //method for adding an item to the list
      if (firstElement == null) {
        firstElement = newElement;
        return;
      } else {
          DoublyLinkedElement<T> current = firstElement;
          while (current.getNextElement() != null) {
            current = current.getNextElement();
          }
          current.setNextElement(newElement);
          newElement.setPrevElement(current);
      }
    }

    public void deleteElement(T value) { //method for deleting a specific item from the list
        if (firstElement == null) {
          System.out.println("List is empty");
          return;
        } else if (firstElement.getValue() == value) { // check if item to be deleted is the first
          firstElement = firstElement.getNextElement(); // deletes if so, sets its next to be first
          return;
        } else {
            DoublyLinkedElement<T> current = firstElement;
              while (current.getNextElement() != null) {
                if (current.getNextElement().getValue().equals(value) ) { // find the item that needs to be deleted by T value
                  System.out.println("Deleting: " + value);
                  if (current.getNextElement().getNextElement() == null) { // checks to see if the
                    current.setNextElement(null); // element we need deleted is the last in the list
                  } else {
                  current.setNextElement(current.getNextElement().getNextElement());
                  current.getNextElement().setPrevElement(current);
                  }
                } else {
                  current = current.getNextElement(); // repeat until current's next = the item you want deleted
                }
                System.out.println("current is: " + current.getValue());
                if (current.getNextElement() == null ) {
                  System.out.println(value + " is not an employee here.");
                  return;
                }
              }

        }
    }
    public void printListForward() { //method for printing the current list forward
      if (firstElement == null) {
        System.out.println("List is empty");
        return;
      } else {
        DoublyLinkedElement<T> current = firstElement;
        System.out.println("Printing List Forwards >>>>>" + '\n'  + current.getValue());
        while (current.getNextElement() != null) {
          System.out.println(current.getNextElement().getValue());
          current = current.getNextElement();
        }
      }
    }

    public void printListBackward() { //method for printing the current list backwards
      if (firstElement == null) {
        System.out.println("List is empty");
        return;
      }
      DoublyLinkedElement<T> current = firstElement;
      while (current.getNextElement() != null) { // sends through until current is last item
        current = current.getNextElement();
      }
      System.out.println("Printing list backwards <<<<< ");
      while (current.getPrevElement() != null) {
        System.out.println(current.getValue());
        current = current.getPrevElement();
      }
      System.out.println(firstElement.getValue());
    }

}
