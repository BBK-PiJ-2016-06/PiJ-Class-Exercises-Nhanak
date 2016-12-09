import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
/*
(**) Rewrite allMatches so it works on any List and associated Predicate, not
just on Strings. Verify that your examples from the previous question still work. */

public class Day19Ex06 {

  public static void main(String[] args) {

    Day19Ex06 ex06 = new Day19Ex06();
    List<String> bands = new ArrayList<>();
    bands.add("Led Zeppelin");
    bands.add("Radiohead");
    bands.add("Tycho");
    bands.add("Opeth");
    bands.add("King Crimson");
    bands.add("Yes");
    List<String> shortBands = ex06.allMatches(bands, s -> s.length() < 7);
    System.out.println("List of bands with short names: " + shortBands);
    List<String> bandsWithO = ex06.allMatches(bands, s -> s.contains("o"));
    System.out.println("List of bands with O in their names: " + bandsWithO);
    List<String> evenLengthBands = ex06.allMatches(bands, s -> (s.length() % 2) == 0);
    System.out.println("List of bands with even length names: " + evenLengthBands);
    List<String> multiWordBands = ex06.allMatches(bands, s -> s.contains(" "));
    System.out.println("List of bands with multiple words in their names: " + multiWordBands);
  }

  public static <T> List<T> allMatches(List<T> list, Predicate<T> pred) {
    List<T> sortedList = new ArrayList<>();
    for(T arrayListValue : list) {
      if(pred.test(arrayListValue)) {
       sortedList.add(arrayListValue);
      }
    }
    return sortedList;
  }

}
