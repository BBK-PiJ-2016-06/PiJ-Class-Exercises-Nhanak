import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nathanhanak on 12/10/16.
 */

public class Day20Ex06 {
    public static void main(String[] args) {

        final List<String> greetings = Arrays.asList("hi", "Hello","bonjour","hola","hey","allo","whaddup");

        List<String> spacedGreetings = greetings.stream().map( s -> "  " + s).collect(Collectors.toList());
        System.out.println(spacedGreetings);
    }


}
