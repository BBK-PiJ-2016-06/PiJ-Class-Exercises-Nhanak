import java.util.List;
import java.util.ArrayList;

public class Day15Ex1 {

  public static void main(String[] args) {

    Day15Ex1 exercise = new Day15Ex1();
    exercise.launch(2); // switch this out for user input of 0,2,4,6 to see various results.
  }

  public void launch(int userInput) {

    List<Integer> intList = new ArrayList<Integer>();
    intList.add(1);
    intList.add(2);
    intList.add(3);
    intList.add(4);
    intList.add(5);
    intList.add(6);
    try {
      intList.remove(0);
      System.out.println(intList.get(userInput));
      intList.remove(0);
      System.out.println(intList.get(userInput));
      intList.remove(0);
      System.out.println(intList.get(userInput));
      intList.remove(0);
      System.out.println(intList.get(userInput));
      intList.remove(0);
      System.out.println(intList.get(userInput));
      intList.remove(0);
      System.out.println(intList.get(userInput));
      intList.remove(0);
      System.out.println(intList.get(userInput));
    } catch (IndexOutOfBoundsException ex) {
        ex.printStackTrace();
    }
  }

}

/** Order of execution:
• userInput is 0: 0-33 runs. 34 interrupted. 36-41 runs.
• userInput is 2: 0-29 runs. 31 inerrupted. 36-41 runs.
• userInput is 4: 0-26 runs. 27 interrupted. 36-41 runs.
• userInput is 6. 0-22 runs. 23 interrupted. 36-41 runs. 
*/
