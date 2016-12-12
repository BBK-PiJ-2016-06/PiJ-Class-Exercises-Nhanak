import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nathanhanak on 12/12/16.
 * (a) Produce a single String that is the result of concatenating the uppercase versions of all
 of the Strings. E.g., the result should be "HIHELLO...". Use a single reduce operation,
 without using map.
 */
public class Day20Ex8A {

    public static void main(String[] args) {


        final List<String> greetings = Arrays.asList("hi", "Hello", "bonjour", "hola", "hey", "allo", "whaddup");
    // STILL WORKING ON THIS ONE, first word is not capitalized.
        String concatResult = greetings.stream().reduce("", (s, n) -> n += s.toUpperCase());
        System.out.println(concatResult);
    }

}
