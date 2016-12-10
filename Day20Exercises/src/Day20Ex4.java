import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
/*
* Created by nathanhanak on 12/7/16.
*/

public class Day20Ex4 {

    public static void main(String[] args) {

        final List<Integer> numList1 = Arrays.asList(1, 2, 3);
        final List<Integer> numList2 = Arrays.asList(3, 4);

        System.out.println("Mixed pairs divisible by 3: ");
        List<int[]> solution = numList1.stream()
                .flatMap(n -> numList2.stream()
                        .filter(i -> (n + i) % 3 == 0)
                        .map(i -> new int[]{n, i})
                )
                .collect(toList());
        for (int[] items : solution) System.out.println(Arrays.toString(items));

    }
}


