import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nathanhanak on 12/7/16.
 */
public class Day20Ex02 {
    public static void main(String[] args) {

        final List<Dish> menu =
                Arrays.asList(  new Dish("pork", false, 800, Dish.Type.MEAT),
                                new Dish("beef", false, 700, Dish.Type.MEAT),
                                new Dish("chicken", false, 400, Dish.Type.MEAT),
                                new Dish("french fries", true, 530, Dish.Type.OTHER),
                                new Dish("rice", true, 350, Dish.Type.OTHER),
                                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                                new Dish("pizza", true, 550, Dish.Type.OTHER),
                                new Dish("prawns", false, 400, Dish.Type.FISH),
                                new Dish("salmon", false, 450, Dish.Type.FISH));

        List<Dish> dishes = menu.stream().  // separating out by '.' but can write them all together if need be.
                filter(dish -> dish.getType() == Dish.Type.MEAT) // the lambda knows it's a Dish, because it can tell from the stream.
                                                        // it makes a new stream that consists of only meat dishes
                .limit(2)  //       now it takes that meat Dish stream, and chops it down to just 2
                .collect(Collectors.toList()); // collect does something w/the stream - takes it and turns it in to a list. This is
                                                // a terminal statement, so
        System.out.println("First two meat dishes are: " + dishes);

        int count = menu.stream()  // turn menu in to a stream
                .map( d -> 1)     // take each item in the stream (a dish d) and turn it in to '1'
                .reduce(0 , (a, b) -> a + b);  // first param, 0, is the starting number, the rest (the lambda) is reduce's 2nd param
                                                // for each iteration, reduce takes the second param and then folds it in to its first param.
                                        // for the next iteration, the first param is now the result of the last iteration, like a '+='
        System.out.println("Number of items in menu: " + count);
    }
}

