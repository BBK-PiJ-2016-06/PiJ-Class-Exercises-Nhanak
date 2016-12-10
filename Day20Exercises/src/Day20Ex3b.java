import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;


/**
 * Created by nathanhanak on 12/7/16.
 */
public class Day20Ex3b {
    public static void main(String[] args) {

        final List<Integer> numList1 = Arrays.asList(1, 2, 3);
        final List<Integer> numList2 = Arrays.asList(3, 4);
        System.out.println("All mixed pairs: ");
        List<int[]> solution = numList1.stream()
                .flatMap(n -> numList2.stream()
                        .map(i -> new int[]{n , i})
                )
                .collect(toList());
        for (int[] items : solution ) System.out.println(Arrays.toString(items));

    }
}
