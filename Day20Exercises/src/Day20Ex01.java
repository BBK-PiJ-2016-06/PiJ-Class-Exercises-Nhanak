import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nathanhanak on 12/7/16.
 */
public class Day20Ex01 {
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

        List<Dish> dishes = menu.stream().filter(dish -> dish.getType() == Dish.Type.MEAT).limit(2).collect(Collectors.toList());
        System.out.println(dishes);
    }
}

