import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class AppleLauncher {

	public static void main(String[] args) {
		AppleLauncher aL = new AppleLauncher();
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple (6, "Green"));
		appleList.add(new Apple (4, "Green"));
		appleList.add(new Apple (2, "Red"));
		appleList.add(new Apple (7, "Black"));
		appleList.add(new Apple (10, "Purple"));
/**		List<Apple> result = aL.greenAppleList(appleList);
  		System.out.println("green apples in GreenAppleList " + Arrays.asList(result));
	  	result = aL.filterAppleByColour(appleList, "red");
  		System.out.println("red apples in list " + Arrays.asList(result)); */
//		List<Apple> result = aL.filterApplesByWeightByWeightGreaterThan(appleList, 6);
//		System.out.println("Heavy apples in list " + Arrays.asList(result));
//	List<Apple> result = aL.filterApples(appleList, new AppleHeavyWeightPredicate());
// System.out.println("Heavy apples in list " + Arrays.asList(result));
// result = aL.filterApples(appleList, new AppleGreenColourPredicate());
/**		System.out.println("Green apples in list " + Arrays.asList(result));
		List<Apple> result = aL.filterApples(appleList, new ApplePredicate() {  // this is an Anonymous inner class
			@Override																		// it's a parameter that IS the method, and defined right here.
			public boolean test(Apple apple) {			// DON'T USE this. Just to see it as an example. Lambdas do this for you
				return "green".equals(apple.getColour());
			}
		});
*/



	}


	public List<Apple> filterApples(List<Apple> apples, ApplePredicate predicate) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple: apples) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

	public List<Apple> greenAppleList(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if (apple.getColour().equals("Green")) {					// if ("Green".equals()apple.getColour())){
				System.out.println("Weight: " + apple.getWeight());
				result.add(apple);
			}
		}
		return result;
	}

	public List<Apple> filterAppleByColour(List<Apple> inventory, String colour) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if (apple.getColour().equals(colour)) {					// alternative: if ("Green".equals()apple.getColour())){
				result.add(apple);
			}
		}
		return result;
	}

	public List<Apple> filterApplesByWeightByWeightGreaterThan(List<Apple> inventory, Integer weight) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple : inventory) {
			if (apple.getWeight() > weight) {					// if ("Green".equals()apple.getColour())){
				result.add(apple);
			}
		}
		return result;
	}
}

@FunctionalInterface
interface ApplePredicate {

  boolean test(Apple apple);

}

class AppleHeavyWeightPredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 6;
	}
}

class AppleGreenColourPredicate implements ApplePredicate {
	@Override
	public boolean test(Apple apple) {
		return "Green".equals(apple.getColour());
	}
}
