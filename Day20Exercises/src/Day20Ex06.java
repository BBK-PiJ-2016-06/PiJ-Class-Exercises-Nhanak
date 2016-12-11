import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nathanhanak on 12/11/16.
 *
 */

public class Day20Ex06 {
    public static void main(String[] args) {
        final List<String> greetings = Arrays.asList("hi", "Hello","bonjour","hola","good night","allo","whaddup");

        final List<String> excitingGreeting = greetings.stream().map( s -> s + "!").collect(Collectors.toList());
        System.out.println(excitingGreeting);
        List<String> eyeGreetings = greetings.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
        System.out.println(eyeGreetings);
        List<String> upperCaseGreetings = greetings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseGreetings);

        /* For part B, instead of creating a new List object and printing it as above,
         *just printing this directly. Below stream returns an altered List.
         */
        System.out.println(greetings.stream().filter(s -> s.length() < 4).collect(Collectors.toList()));
        System.out.println(greetings.stream().filter(s -> s.contains("o")).collect(Collectors.toList()));
        System.out.println(greetings.stream().filter(s -> (s.length() % 2 == 0)).collect(Collectors.toList()));
    }
}
