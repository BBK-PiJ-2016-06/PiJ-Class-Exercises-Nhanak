public class IntBox { // creates a class that holds the value of an int and a pointer
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

    public void printIntBox() { // a recursive printing method that stops when it gets to null
        System.out.println(value);
        if (nextIntBox != null) {
          nextIntBox.printIntBox();
        } else {
          return;
        }
    }
}
