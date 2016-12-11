import java.util.Arrays;
import java.util.List;

/**
 * Created by nathanhanak on 12/10/16.
 */

public class Day20Ex05ab {

    public static void main(String[] args) {

        final List<String> greetings = Arrays.asList("hi", "Hello","bonjour","hola","hey","allo","whaddup");
        System.out.println("Printing with extra spaces");
        greetings.stream().forEach(s -> System.out.println("  " + s));

        System.out.println("Printing the array using a method reference: ");
        greetings.stream().forEach(Day20Ex05ab::printWithLine);
    }

    public static void printWithLine(String str) {
        System.out.print(str + "\n");
    }


}
