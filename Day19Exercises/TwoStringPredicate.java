

@FunctionalInterface
public interface TwoStringPredicate {

  public boolean trueIfFirstStringIsBetter(String one, String two);
}
