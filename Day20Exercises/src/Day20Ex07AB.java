import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nathanhanak on 12/11/16.
 */
public class Day20Ex07AB {

        public static void main(String[] args) {

            final List<String> greetings = Arrays.asList("hi", "Hello","bonjour","hola","hey","allo","whaddup");

            final List<String> alteredList = greetings.stream().map(String::toUpperCase)
                                                                .filter( s -> s.length() < 4)
                                                                .filter(s -> s.contains("E"))
                                                                .collect(Collectors.toList());
            System.out.println(alteredList);

            //prints nothing because no greetings have Q's
            final List<String> alteredList2 = greetings.stream().map(String::toUpperCase)
                                                                .filter( s -> s.length() < 4)
                                                                .filter(s -> s.contains("Q"))
                                                                .collect(Collectors.toList());
            System.out.println(alteredList2);

            //part (b) below:
            final List<String> alteredList3 = greetings.stream().map(Day20Ex07AB::upperCaser)
                                                                .filter( s -> s.length() < 4)
                                                                .filter(s -> s.contains("E"))
                                                                .collect(Collectors.toList());
            System.out.println("Should be same as first alteredlist result: " + alteredList3);

        }

        /* Takes all Strings passed through
         * prints them out to announce they are being altered
         * Then turns them in to Upper case
         */
        public static String upperCaser(String word) {
            System.out.println("Turning in to upper case: " + word);
            return word.toUpperCase();
        }


}
