public class ArrayUtilities {

/* since I am making a list of integers, it was necessary to make it a class
it holds the variable, and it also holds a pointer
*/
  public static class IntBox { // creates a class that holds the value of an int and a pointer
      private int value;
      private IntBox nextIntBox;

      public IntBox(int value) { // constructor method for IntBox
        this.value = value;
      }

      public int getValue() { // returns the int value of Intbox
        return value;
      }

      public IntBox getNextIntBox() { // returns the pointer of this Intbox
        return nextIntBox;
      }

      public void setNextIntBox(IntBox nextIntBox) { // sets the value of this IntBox's pointer
        this.nextIntBox = nextIntBox;
      }
  }
/* this class establishes a singly linked list for IntBoxes
*/
  public static class IntBoxLinkedList {
    private IntBox firstIntBox;

    public void addIntBox(int newValue) {
      IntBox newIntBox = new IntBox(newValue);
      if (firstIntBox == null) {
        firstIntBox = newIntBox;
      } else {
        IntBox current = firstIntBox;
        if (current.getNextIntBox() != null) {
          current = current.getNextIntBox();
        }
        current.setNextIntBox(newIntBox);
      }
    }
  }
/* this is the method that returns the Array as a linked list
*/
  public static IntBoxLinkedList arrayAsList(int[] intArray) {
      IntBoxLinkedList intList = new IntBoxLinkedList();
      for (int counter = 0; counter < intArray.length; counter ++) {
        intList.addIntBox(intArray[counter]);
      }
      return intList;
  }

}
