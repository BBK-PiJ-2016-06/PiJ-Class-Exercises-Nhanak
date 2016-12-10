
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Day19Ex07 {

  public static void main(String[] args) {
    Day19Ex07 ex07 = new Day19Ex07();

    List<String> bands = new ArrayList<>();
    bands.add("Led Zeppelin");
    bands.add("Radiohead");
    bands.add("Tycho");
    bands.add("Opeth");
    bands.add("King Crimson");
    bands.add("Yes");
    List<String> bandsRock = transformedList( bands, s -> s + " rocks!");
    System.out.println(bandsRock);
    List<String> capitalizedBands = transformedList( bands , String::toUpperCase);
    System.out.println(capitalizedBands);


  }


  public static List<String> transformedList(List<String> stringList, Function<String, String> alter) {
    List<String> result = new ArrayList<>();
    for(String listItem : stringList) {
      result.add(alter.apply(listItem));
    }
    return result;
  }

}
