import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Day19Ex05 {

  public static void main(String[] args) {

    Day19Ex05 ex05 = new Day19Ex05();
    List<String> bands = new ArrayList<>();
    bands.add("Led Zeppelin");
    bands.add("Radiohead");
    bands.add("Tycho");
    bands.add("Opeth");
    bands.add("King Crimson");
    bands.add("Yes");
    List<String> shortBands = ex05.allMatches(bands, s -> s.length() < 7);
    System.out.println("List of bands with short names: " + shortBands);
    List<String> bandsWithO = ex05.allMatches(bands, s -> s.contains("O"));
    System.out.println("List of bands with O in their names: " + bandsWithO);
    List<String> evenLengthBands = ex05.allMatches(bands, s -> (s.length() % 2) == 0);
    System.out.println("List of bands with even length names: " + evenLengthBands);
    List<String> multiWordBands = ex05.allMatches(bands, s -> s.contains(" "));
    System.out.println("List of bands with multiple words in their names: " + multiWordBands);
  }

  public static List<String> allMatches(List<String> list, Predicate<String> stringPred) {
    List<String> sortedList = new ArrayList<>();
    for(String arrayListValue : list) {
      if(stringPred.test(arrayListValue.toUpperCase())) {
       sortedList.add(arrayListValue);
      }
    }
    return sortedList;
  }

}
