import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;


/**
 * Created by nathanhanak on 12/7/16.
 */
public class Day20Ex4and5 {
    public static void main(String[] args) {

        final List<Integer> numList1 = Arrays.asList(1, 2, 3);
        final List<Integer> numList2 = Arrays.asList(3, 4);
        System.out.println("All mixed pairs: ");
        List<int[]> solution4 = numList1.stream()
                .flatMap(n -> numList2.stream()
                        .map(i -> new int[]{n , i})
                )
                .collect(toList());
        for (int[] items : solution4 ) System.out.println(Arrays.toString(items));

        System.out.println("Mixed pairs divisible by 3: ");
        List<int[]> solution5 = numList1.stream()
                                            .flatMap(n -> numList2.stream()
                                                .filter(i -> (n + i) % 3 == 0)
                                                    .map(i -> new int[]{n , i})
                                            )
                                            .collect(toList());
        for (int[] items : solution5 ) System.out.println(Arrays.toString(items));

    }
}
