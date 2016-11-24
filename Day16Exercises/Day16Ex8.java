import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Day16Ex8 {

  private int rowCounter = 0;
  private String listOfAverages = "";
  private int sumOfRows = 0;

  public static void main(String[] args) {
    Day16Ex8 exercise8 = new Day16Ex8();
    exercise8.launch();
  }

  public void launch() {
    System.out.println("Please enter file name");
    String userInput = System.console().readLine();
    try (BufferedReader in = new BufferedReader(new FileReader(userInput));) {
      String line = null;
      while ((line = in.readLine()) != null) {  // reads each line of csv
        String[] items = line.split(",");       // creates String array based on items between ","'s'
        List<Integer> tempList = convertToIntArray(items); // converts String array to an ArrayList
        calculateAndStoreRowAverage(tempList);
      }
    } catch (FileNotFoundException ex) {
      System.out.println("That file does not exist");
    } catch (IOException ex) {
      System.out.println("IO Exception");
    }
    System.out.println(listOfAverages);
    System.out.println("Average of all rows: " + getTotalRowAverage());
  }

  /**
   *method that takes @param List<Integer> and adds the total of each
   * item stored in the array together, and calculates the average
   * stores the entry as a String in member field
   * increases a member field counter used in #getTotalRowAverage
   */
  private void calculateAndStoreRowAverage(List<Integer> tempList) {
      Integer totalOfRow = 0;
      rowCounter++;
      for (int i = 0; i < tempList.size(); i++) {
        totalOfRow = totalOfRow + tempList.get(i);
      }
      int averageRowTemp = (totalOfRow/tempList.size());
      sumOfRows += averageRowTemp;
      listOfAverages = listOfAverages + "Row " + rowCounter + ": " + averageRowTemp + "\n";
  }

  /**
   * method which @return int average of all rows
   */
  private int getTotalRowAverage() {
    return (sumOfRows/rowCounter);
  }

  /**
   * converts a String[] in to a List<Integer>
   * takes @param String[] from each row of a line read from a converted .csv file above
   * @return a List<Integer> to be manipulated in later methods
   */
  private List<Integer> convertToIntArray(String[] items) {
    List<Integer> myIntArray = new ArrayList<>();
    for (int i = 0; i < items.length; i++) {
      myIntArray.add(Integer.parseInt(items[i]));
    }
    return myIntArray;
  }


}
