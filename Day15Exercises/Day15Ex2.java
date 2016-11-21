import java.util.List;
import java.util.ArrayList;

public class Day15Ex2 {

  public static void main(String[] args) {

    Day15Ex2 exercise = new Day15Ex2();
    exercise.launch("Turkey"); 
  }

  public void launch(String newElement) {

    List<String> intList = new ArrayList<String>();
    intList.add("Mashed potatoes");
    intList.add("Stuffing");
    intList.add("Cranberry sauce");
    String bogus = null;
    try {
    intList.add(newElement);
    intList.add(bogus);
    } catch (Exception ex) {
        ex.printStackTrace();
    } catch (NullPointerException ex) {
        ex.printStackTrace();
    }
  }
}

/**
*Technically line 24 causes an issue because NullPointerException is an extension of the class Exception. So Exception
*will catch any problems with null pointers and there will never be a point which this gets to line 24.
*Program will not compile.
*( if you remove lines 24-25 this program runs fine, ArrayList allows null Strings to be stored,
* but this is for demonstration).
*/
