import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nathanhanak on 12/7/16.
 */
public class Day20Ex03 {
    public static void main(String[] args) {

        final List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumList = numList.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squaredNumList);

    }
}