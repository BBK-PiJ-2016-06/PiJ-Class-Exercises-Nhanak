/* (*) Create a static method called transformedList. It should take a List of
Strings and a Function<String,String> and return a new List that contains the
results of applying the function to each element of the original list. For example:
List<String> excitingWords =
StringUtils.transformedList(words, s -> s + "!");
List<String> eyeWords =
StringUtils.transformedList(words, s -> s.replace("i", "eye"));
List<String> upperCaseWords =
StringUtils.transformedList(words, String::toUpperCase); */
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class Day19Ex08 {

  public static void main(String[] args) {
    Day19Ex08 ex08 = new Day19Ex08();

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


  public static <T> List<T> transformedList(List<T> listParam, Function<T, T> alter) {
    List<T> result = new ArrayList<>();
    for(T object : listParam) {
      result.add(alter.apply(object));
    }
    return result;
  }

}
