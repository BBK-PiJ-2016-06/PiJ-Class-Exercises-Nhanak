

@FunctionalInterface
public interface TwoElementPredicate<T> {

 /*
  *compares two different generic elements and will return a boolean
  *where better is based on a condition defined in a lambda from calling classes.
  */
  public boolean trueIfFirstElementIsBetter(T t1, T t2);
  
}
