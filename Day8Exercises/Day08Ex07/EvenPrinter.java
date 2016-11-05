public class EvenPrinter { // Cannot be 'EvenPrinter extends String' b/c final classes cannot be extended

  private String storedString;
  private int i = 0;

  public EvenPrinter(String input) { // constructor method - parameters are from cmd line in Day08Ex07 class
    storedString = input;
  }

  public void printString() {
    while (i < storedString.length()) {
    System.out.println(storedString.charAt(i));
    i = i + 2;
    printString();
    }
  }

}
